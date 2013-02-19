----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    13:37:05 23/03-2012 
-- Design Name: 
-- Module Name:    wb_slv_db_mem_ctrl - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave controller component providing a wishbone 
--		interface to a double-buffered dual-ported memory.
--
--		N.B. 	Actual address-bus width is C_MEM_ADDR_WIDTH+1
--
--				As the C_MEM_ADDR_WIDTH generic describes the 
--				address width of the double-buffered memory alone,
--				the actual address-bus width for this module will 
--				be 1 bit wider than just the memory address in order 
--				to enable access to the status and control registers 
--				of the double-buffer, commit-write memory controller.
--
--	*********************************************************************
--
--		Please read through the documentation below for a detailed 
--		description of the usage and capabilities of this module!
--
--	*********************************************************************
--
--		This module implement a wishbone slave controller for the db_mem_cwrm
--		component (found in the db_mem_pkg in the db_mem Unity-lib library).
--		
--		The db_mem_cwrm component implement a Double Buffered 
--		Commit-Write<>Read-Multiple Memory controller and memory.
--		It provides a status register for each of the two interfaces to 
--		the memory (master/slave) as well as a control register for each.
--
--		This component (wb_slv_db_mem_ctrl) abstracts away the control register 
--		used for issuing commit-write commands, and integrates the status register
--		into the same address space as the control register. 
--
--		In this way a read issued to to the shared control/status register 
--		address (CTR_STR_ADR) will return the status register(s) of the 
--		db_mem_cwrm controller(s). A write to the same address will generate a 
--		commit-write command.
--
--		The Control/Status Register Addss (CTR_STR_ADR) is: 2**C_MEM_ADDR_WIDTH
--			ex: if the C_MEM_ADDR_WIDTH=8, the CTR_STR_ADR will be at address 2**8 = 256
--
--		32-bit Status Register layout:
--
--			STR: x"00" & s_str & x"00" & m_str;
--
--				s_str: 8-bit status register for the slave 
--						 side of the db_mem component. 
--						 (connected to any user supplied logic)
--
--				m_str: 8-bit status register for the master
--						 side of the db_mem component.
--						 (connected to the wishbone bus)
--
--		For details about the content of the m_str and s_str part of the status
--		register please read the documentation of the db_mem_cwrm component.
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE double-buffered dual-port       |
--	 |								|	memory controller with 1-bit width    |
--	 |								|	granularity on data and address bus's,|
--	 |							   |  Commit Write, Read Multiple (CWRM) 	  |
--	 |								|	functionality								  |
--  -----------------------------------------------------------------
--	 |	Wishbone version 		| 	Protocol version B4 						  |
--  -----------------------------------------------------------------
--	 |	Supported cycles		| 	SLAVE, READ/WRITE							  |
--	 |								| 	SLAVE, BLOCK READ/WRITE					  |
--  -----------------------------------------------------------------
--  |	Data port:				|													  | 
--	 |		size					|	1-32 bit (QWORD)							  |
--	 |		granularity  		|	1-bit     									  |
--	 |		max. operand size	|	32-bit (QWORD)								  |
--  |	Data transfer: 		|													  |
--	 |		ordering  			|	LITTLE ENDIAN								  |
--  |		sequence    		|	UNDEFINED									  |
--	 -----------------------------------------------------------------
--	 | 							SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | COMPONENT SIGNAL 	| WB SIGNAL 	| DESCRIPTION		  			  |
--	 -----------------------------------------------------------------
--	 | clk_i					| CLK_I			| slave clock input			  |
--	 | rst_i					| RST_I			| slave reset input			  |
--	 |							|					|									  |
--	 | wb_i 				  	|  				| (record type: wb_ad32sb_if)|
--	 |  .cyc					| CYC_I			| slave cycle input			  |
--	 |  .stb					| STB_I			| slave strobe input			  |
--	 |  .adr					| ADR_I			| slave addr input			  |
--	 |  .dat					| DAT_I			| slave data input			  |
--	 |  .we					| WE_I			| slave write enable input   |
--	 |  .sgl					| TGC_I()		| slave cycle-tag input		  |
--	 |  .blk					| TGC_I()		| slave cycle-tag input		  |
--	 |							|					|									  |
--	 | wb_o 				  	|  				| (record type: wb_d32ae_if) |
--	 |  .dat					| DAT_O			| slave data output			  |
--	 |  .ack					| ACK_O			| slave acknowledge output	  |
--	 |  .err					| ERR_O			| slave error output			  |
--	 -----------------------------------------------------------------
--	 | 						TAG SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | SIGNAL NAME	| TAG TYPE	| DESCRIPTION								  |
--	 -----------------------------------------------------------------
--	 | wb_i.sgl		| TGC_I		| marks a cycle as a single access	  |
--	 | wb_i.blk		| TGC_I		| marks a cycle as a block access	  |
--	 -----------------------------------------------------------------
--	 | 							ERROR GENERATION 								  |
--	 | ERR_O is asserted under the following conditions				  |
--	 -----------------------------------------------------------------
--	 |	WB BUS CYCLE |	ERROR TRIGGER	| DESCRIPTION					 	  |
--	 -----------------------------------------------------------------
--	 |  read-cycle  | never			   | a read is allways successful  |
--	 |  write-cycle | write error		| memory controller write error |
--	 -----------------------------------------------------------------
--
-- Dependencies:
--
--		work.wb_classic_pkg.all
--
--		Unity-HDL libraries:
--			- db_mem_v02_00_a
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		30/03-2012	ANLAN		File Created
-- 0.02		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		18/10-2012	ANLAN		Headers, comments and licensing info updated.
-- 1.01		
--
-- Additional Comments:
--
-- -----------------------------------------------------------------------------
-- Licensing:     (c) Copyright 2012, Anders Blaabjerg Lange
--                            All Rights Reserved
--
--  This file is part of the Unity HDL Library (Unity-lib).
--
--  Unity-lib is free software: you can redistribute it and/or modify
--  it under the terms of the GNU General Public License as published by
--  the Free Software Foundation, either version 3 of the License, or
--  (at your option) any later version.
--
--  Unity-lib is distributed in the hope that it will be useful,
--  but WITHOUT ANY WARRANTY; without even the implied warranty of
--  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
--  GNU General Public License for more details.
--
--  You should have received a copy of the GNU General Public License
--  along with Unity-lib.  If not, see <http://www.gnu.org/licenses/>.
----------------------------------------------------------------------------------

library ieee;
use ieee.std_logic_1164.all;

library db_mem_v02_00_a;
use db_mem_v02_00_a.db_mem_pkg.all;

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb_slv_db_mem_ctrl is
	generic (
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10	-- Memory depth/size	
	);
	port ( 
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb slave interface
		wb_i 	: in  wb_ad32sb_if;
		wb_o 	: out wb_d32ae_if;
		
		-- db_mem interface
		db_i 	: in  db_mem_cwrm_o_if;
		db_o 	: out db_mem_cwrm_i_if
		);
end wb_slv_db_mem_ctrl;

architecture Behavioral of wb_slv_db_mem_ctrl is

	constant CW : integer := 0;
	constant RM : integer := 1;

	signal ack_reg : std_logic := '0';
	signal ack_nxt : std_logic;
	signal ack_req : std_logic;
	
	signal err_reg : std_logic := '0';
	signal err_nxt : std_logic;	
	signal err_req : std_logic;

begin

	-- register process
	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if rst_i='1' then
				ack_reg <= '0';
				err_reg <= '0';
			else
				ack_reg <= ack_nxt;
				err_reg <= err_nxt;
			end if;
		end if;
	end process;


	-- algorithm/logic/combinatorial process
	
	ack_nxt <= '1' when ack_req='1' and ack_reg='0' else '0';	-- ensure cycle terminating signal can only be
	err_nxt <= '1' when err_req='1' and err_reg='0' else '0';	-- asserted for one clock cycle (CLASSIC STANDARD MODE).
	
	wb_o.dat 	<= db_i.str when wb_i.adr(C_MEM_ADDR_WIDTH)='1' else db_i.data; 		-- data output (reg/mem->wb)
	
	db_o.data	<= wb_i.dat;																					-- data output (wb->mem)
	db_o.adr(C_MEM_ADDR_WIDTH-1 downto 0) 	<= wb_i.adr(C_MEM_ADDR_WIDTH-1 downto 0);	-- "decode" addr
	
	wb_o.ack	<= ack_reg;
	wb_o.err	<= err_reg;
	
	process(wb_i, db_i, ack_reg, err_reg)		
	begin
		
		-- cycle not started, 
		-- [RULE 3.30] slave MAY ONLY react to syscon signals		
		
		-- defaults
		ack_req <= '0';
		err_req <= '0';
		
		-- db_mem outputs
		db_o.ctr_we		<= '1';
		db_o.ctr(CW)	<= '0';	-- CW
		db_o.ctr(RM)	<= '0';	-- RM
		db_o.we			<= '0';

		if wb_i.cyc='1' then
		
			if wb_i.sgl='1' or wb_i.blk='1' then					-- cycle started in SINGLE/BLOCK mode, slave MAY be active
			
				if wb_i.blk='1' and wb_i.we='0' then				-- READ BLOCK mode cycle in progress
					db_o.ctr(RM) <= '1';										-- assert the read multiple flag to block any commit's during the block read
				end if;			
			
				if wb_i.stb='1' then
					
					if wb_i.we='0' then									-- READ mode	
						ack_req <= '1'; 										-- status register/shared memory access (synchronous)
					end if;
					
					if wb_i.we='1' then									-- WRITE mode				
						if wb_i.adr(C_MEM_ADDR_WIDTH)='1' then		-- status register access (synchronous)
							db_o.ctr(CW) <= not ack_reg;					-- ensure the commit write request is only asserted during 
																					-- the ONE clock cycle before ack_o is asserted
							ack_req <= '1';
						else														-- shared memory access (synchronous)
							db_o.we <= (not ack_reg) and (not err_reg); -- ensure the write enable request is only asserted during 
																					  -- the ONE clock cycle before ack_o or err_o is asserted
							
							if db_i.w_ack='1' then
								ack_req <= '1';
							elsif db_i.w_err='1' then
								err_req <= '1';
							end if;
						end if;
					end if;
					
				end if;		
				
			end if;
			
		end if;
		
	end process;

end Behavioral;