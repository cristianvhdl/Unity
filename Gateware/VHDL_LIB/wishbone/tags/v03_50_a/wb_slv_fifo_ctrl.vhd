----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    10:59:59 02/04-2012 
-- Design Name: 
-- Module Name:    wb_slv_fifo_ctrl - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave controller component providing a wishbone 
--		interface to a single FIFO.
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE fifo controller with 1-bit      |
--	 |								|	granularity on data-width				  |
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
--	 |  read-cycle  | fifo is empty  | indicates a failed read		  |
--	 |  write-cycle | fifo is full   | indicates a failed write		  |
--	 -----------------------------------------------------------------
--
-- Dependencies:
--
--		work.wb_classic_pkg.all
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		02/04-2012	ANLAN		File Created
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

entity wb_slv_fifo_ctrl is
	generic (
		C_DATA_WIDTH 			: integer range 1 to 32 := 32		-- Data bit size
	);
	port ( 
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb slave interface
		wb_i 	: in  wb_ad32sb_if;
		wb_o 	: out wb_d32ae_if;
		
		-- fifo interface
		fifo_wr_o    : out std_logic;
		fifo_data_o  : out std_logic_vector(C_DATA_WIDTH-1 downto 0);
		fifo_full_i  : in  std_logic;
		fifo_empty_i : in  std_logic;
		fifo_data_i	 : in  std_logic_vector(C_DATA_WIDTH-1 downto 0);
		fifo_rd_o	 : out std_logic
		);
end wb_slv_fifo_ctrl;

architecture Behavioral of wb_slv_fifo_ctrl is

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
	
	wb_o.dat(C_DATA_WIDTH-1 downto 0) 		<= fifo_data_i(C_DATA_WIDTH-1 downto 0);	-- data output (fifo->wb)
	fifo_data_o(C_DATA_WIDTH-1 downto 0)	<= wb_i.dat(C_DATA_WIDTH-1 downto 0);		-- data output (wb->fifo)
	
	wb_o.ack	<= ack_reg;
	wb_o.err	<= err_reg;
	
	process(wb_i, fifo_full_i, fifo_empty_i, ack_reg)		
	begin
		
		-- cycle not started, 
		-- [RULE 3.30] slave MAY ONLY react to syscon signals		
		
		-- defaults
		ack_req <= '0';
		err_req <= '0';
		
		-- mem outputs
		fifo_rd_o <= '0';
		fifo_wr_o <= '0';

		if wb_i.cyc='1' then
		
			if wb_i.sgl='1' or wb_i.blk='1' then					-- cycle started in SINGLE/BLOCK mode, slave MAY be active
			
				if wb_i.blk='1' and wb_i.we='0' then				-- READ BLOCK mode cycle in progress
					-- block updates to the memory during the block read (not available for unbuffered memory)
				end if;			
			
				if wb_i.stb='1' then
					
					if wb_i.we='0' then									-- READ mode	
						-- fifo data read (synchronous)
						if fifo_empty_i='0' then
							ack_req <= '1'; 								-- SUCCESS
							
							fifo_rd_o <= ack_reg;						-- assert the fifo_rd_o during 
																				-- the ONE clock cycle where ack_o is asserted							
						else
							err_req <= '1';								-- ERROR (no data)
						end if;
						
					end if;
					
					if wb_i.we='1' then									-- WRITE mode				
						-- fifo data write (synchronous)						
						if fifo_full_i='0' then
							ack_req <= '1'; 								-- SUCCESS
							
							fifo_wr_o <= not ack_reg;					-- assert the fifo_wr_o during 
																				-- the ONE clock cycle before ack_o is asserted								
						else
							err_req <= '1';								-- ERROR (fifo full)
						end if;
						
					end if;
					
				end if;		
				
			end if;
			
		end if;
		
	end process;
	
end Behavioral;