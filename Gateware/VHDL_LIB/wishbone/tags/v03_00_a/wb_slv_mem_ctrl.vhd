----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    10:18:05 30/03-2012 
-- Design Name: 
-- Module Name:    wb_slv_mem_ctrl - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave controller component providing a wishbone 
--		interface to a single dual ported memory.
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE dual-port memory controller     |
--	 |								|	with 1-bit granularity on data-width  |
--	 |								|	and address-width 						  |
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

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb_slv_mem_ctrl is
	generic (
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10;	-- Memory depth/size	
		C_DATA_WIDTH 			: integer range 1 to 32 := 32		-- Data bit size
	);
	port ( 
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb slave interface
		wb_i 	: in  wb_ad32sb_if;
		wb_o 	: out wb_d32ae_if;
		
		-- mem interface
		mem_addr_o  : out std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);
		mem_we_o    : out std_logic;
		mem_data_o  : out std_logic_vector(C_DATA_WIDTH-1 downto 0);
		mem_data_i	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0);
		mem_w_ack_i	: in  std_logic;
		mem_w_err_i	: in  std_logic
		);
end wb_slv_mem_ctrl;

architecture Behavioral of wb_slv_mem_ctrl is

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
	
	wb_o.dat(C_DATA_WIDTH-1 downto 0) 	<= mem_data_i(C_DATA_WIDTH-1 downto 0);	-- data output (mem->wb)
	mem_data_o(C_DATA_WIDTH-1 downto 0)	<= wb_i.dat(C_DATA_WIDTH-1 downto 0);		-- data output (wb->mem)
	
	mem_addr_o(C_MEM_ADDR_WIDTH-1 downto 0) 	<= wb_i.adr(C_MEM_ADDR_WIDTH-1 downto 0);	-- "decode" addr
	
	wb_o.ack	<= ack_reg;
	wb_o.err	<= err_reg;
	
	process(wb_i, mem_w_ack_i, mem_w_err_i, ack_reg, err_reg)		
	begin
		
		-- cycle not started, 
		-- [RULE 3.30] slave MAY ONLY react to syscon signals		
		
		-- defaults
		ack_req <= '0';
		err_req <= '0';
		
		-- mem outputs
		mem_we_o	<= '0';

		if wb_i.cyc='1' then
		
			if wb_i.sgl='1' or wb_i.blk='1' then					-- cycle started in SINGLE/BLOCK mode, slave MAY be active
			
				if wb_i.blk='1' and wb_i.we='0' then				-- READ BLOCK mode cycle in progress
					-- block updates to the memory during the block read (not available for unbuffered memory)
				end if;			
			
				if wb_i.stb='1' then
					
					if wb_i.we='0' then									-- READ mode	
						ack_req <= '1'; 										-- status register/shared memory access (synchronous)
					end if;
					
					if wb_i.we='1' then									-- WRITE mode				
						-- memory access (synchronous)
						mem_we_o <= (not ack_reg) and (not err_reg);   -- ensure the write enable request is only asserted during 
																					  -- the ONE clock cycle before ack_o or err_o is asserted
						
						if mem_w_ack_i='1' then
							ack_req <= '1';
						elsif mem_w_err_i='1' then
							err_req <= '1';
						end if;
					end if;
					
				end if;		
				
			end if;
			
		end if;
		
	end process;

end Behavioral;