----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    09:58:22 02/04-2012 
-- Design Name: 
-- Module Name:    wb_fifo_io - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave IO component offering af wishbone read and write 
--		interface to a pair of configurable asynchronous/synchronous FIFOs,
--		and template code for direct IO interfacing with the FIFO's.
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE fifo with 1-bit granularity     |
--	 |								|	on data-width and FIFO-depth			  |
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
-- 0.02		12/10-2012 	ANLAN		Module updated with library definitions (hints) 
--											for the user to be able to copy this module into 
--											his work library for integration into his project.
-- 0.03 		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		18/10-2012	ANLAN		Generic list updated to match the wb_fifo component generic list,
--											support for asynchronous fifo mode added,
--											headers, comments and licensing info updated.
-- 1.01		
--
-- Additional Comments:
--
--		It is recommended to copy this module (wb_fifo_io.vhd)
--		to the local work library for editing. 
--		(PLEASE DO NOT EDIT YOUR LIBRARY FILE!)
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

entity wb_fifo_io is
	generic (
		-- FIFO configuration
		C_FIFO_DEPTH			: natural range 1 to 32 :=  4;				-- FIFO depth (fifo memory address bit-width)
		C_DATA_WIDTH			: natural range 1 to 32 := 32;				-- Data bit-width
		C_CLOCK_MODE			: natural range 0 to 1 	:=  0;    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
		C_SYNC_DEPTH			: natural range 1 to 8 	:=  2;				-- Synchronizer depth (asynch mode only)
		C_PRE_LOAD				: natural					:=  0;				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
		C_READ_MODE				: natural range 0 to 1 	:=  1;				-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
		C_PRE_SP6_MODE			: natural range 0 to 1 	:=  0;				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
		C_RAMSTYLE				: string 					:= "AUTO";			-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)				
		
		--------------------------------------------
		-- Insert User Generics below this line
		
		LED_WIDTH				: integer := 7
		
		-- Insert User Generics above this line			
		--------------------------------------------		
	);
	port ( 
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb slave interface
		wb_i 	: in  wb_ad32sb_if;
		wb_o 	: out wb_d32ae_if;
		
		-- fifo clock input
		fifo_clk_i : in std_logic;		-- only used in asynchronous clock mode (C_CLOCK_MODE=1)
												-- if C_CLOCK_MODE=0, tie input to zero '0'
		
		--------------------------------------------
		-- Insert User Ports below this line
		
		led_o : out std_logic_vector(LED_WIDTH-1 downto 0)
		
		-- Insert User Ports above this line
		--------------------------------------------
	);
end wb_fifo_io;

architecture structural of wb_fifo_io is

	signal fifo_empty_o 		: std_logic;
	signal fifo_data_o 		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal fifo_rd_i 			: std_logic;

	signal fifo_wr_i 			: std_logic;
	signal fifo_data_i 		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal fifo_full_o 		: std_logic;
	
	--------------------------------------------
	-- Insert User Logic below this line
	
	
	signal led		: std_logic_vector(LED_WIDTH-1 downto 0);
	
	
	-- Insert User Logic above this line
	--------------------------------------------	

begin

	-- Wishbone Slave Fifo instance
	wb_fifo_inst : wb_fifo
		generic map(
			-- FIFO configuration
			C_FIFO_DEPTH	=> C_FIFO_DEPTH,			-- FIFO depth (fifo memory address bit-width)
			C_DATA_WIDTH	=> C_DATA_WIDTH,			-- Data bit-width
			C_CLOCK_MODE	=> C_CLOCK_MODE, 			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			C_SYNC_DEPTH	=> C_SYNC_DEPTH,			-- Synchronizer depth (asynch mode only)
			C_PRE_LOAD		=> C_PRE_LOAD,				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			C_READ_MODE		=> C_READ_MODE,			-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			C_PRE_SP6_MODE	=> C_PRE_SP6_MODE,		-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			C_RAMSTYLE		=> C_RAMSTYLE				-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)
		)
		port map( 
				-- wb syscon interface	
				clk_i => clk_i,
				rst_i => rst_i,
				
				-- wb slave interface
				wb_i 	=> wb_i,
				wb_o 	=> wb_o,
				
				-- fifo interface
				fifo_clk_i		=> fifo_clk_i,
				
				fifo_empty_o 	=> fifo_empty_o,
				fifo_rd_i 		=> fifo_rd_i,
				fifo_data_o 	=> fifo_data_o,

				fifo_full_o 	=> fifo_full_o,
				fifo_wr_i 		=> fifo_wr_i,
				fifo_data_i 	=> fifo_data_i
		);
	
		
	--------------------------------------------
	-- FIFO interface:
	--
	--	User output FIFO
	--		fifo_empty_o 	: FIFO empty flag
	--		fifo_rd_i 		: Read enable/request input
	--		fifo_data_o 	: Data output
	--
	--	User input FIFO
	--		fifo_full_o 	: FIFO full flag
	--		fifo_wr_i 		: Write enable/request input
	--		fifo_data_i 	: Data input
	--
	--	-------------------------------------
	--
	-- Insert User Logic below this line
	
		-- Example code (C_CLOCK_MODE=0)
		SYNCHRONOUS_CLK_MODE:
		if C_CLOCK_MODE=0 generate
		
			-- control logic
			process(clk_i)
			begin
				if rising_edge(clk_i) then
					
					-- FIFO read example
					fifo_rd_i <= '0';			
					
					if fifo_empty_o='0' then
						fifo_rd_i <= '1';
						led <= fifo_data_o(led'range);
					end if;
					
					-- FIFO write example
					fifo_wr_i <= '0';
					
					if fifo_full_o='0' then
						fifo_wr_i <= '1';
						fifo_data_i(led'range) <= led;
					end if;
					
				end if;
			end process;
			
		end generate;
		
		-- Example code (C_CLOCK_MODE=1)			
		ASYNCHRONOUS_CLK_MODE:
		if C_CLOCK_MODE=1 generate
		
			-- control logic
			process(fifo_clk_i)
			begin
				if rising_edge(fifo_clk_i) then
					
					-- FIFO read example
					fifo_rd_i <= '0';			
					
					if fifo_empty_o='0' then
						fifo_rd_i <= '1';
						led <= fifo_data_o(led'range);
					end if;
					
					-- FIFO write example
					fifo_wr_i <= '0';
					
					if fifo_full_o='0' then
						fifo_wr_i <= '1';
						fifo_data_i(led'range) <= led;
					end if;
					
				end if;
			end process;
			
		end generate;
		
		-- output mapping
		led_o <= led;
	
	-- Insert User Logic above this line
	--------------------------------------------

end structural;