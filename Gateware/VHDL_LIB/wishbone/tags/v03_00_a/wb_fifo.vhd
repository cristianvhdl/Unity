----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    12:52:43 02/04-2012 
-- Design Name: 
-- Module Name:    wb_fifo - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave component offering af wishbone read and write 
--		interface to a pair of configurable asynchronous/synchronous FIFOs.
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
--		Unity-HDL libraries:
--			- fifo_v02_10_b
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		02/04-2012	ANLAN		File Created
-- 0.02		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		18/10-2012	ANLAN		All FIFO generics (except write-acknowledge-enable) added to wb_fifo generic list,
--											headers, comments and licensing info updated.
-- 1.01		22/10-2012	ANLAN		Updated to use fifo_v02_10_b
-- 1.02		
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

library fifo_v02_10_b;
use fifo_v02_10_b.fifo_pkg.all;

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb_fifo is
	generic (
		-- FIFO configuration
		C_FIFO_DEPTH			: natural range 1 to 32 :=  4;				-- FIFO depth (fifo memory address bit-width)
		C_DATA_WIDTH			: natural range 1 to 32 := 32;				-- Data bit-width
		C_CLOCK_MODE			: natural range 0 to 1 	:=  0;    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
		C_SYNC_DEPTH			: natural range 1 to 8 	:=  2;				-- Synchronizer depth (asynch mode only)
		C_PRE_LOAD				: natural					:=  0;				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
		C_READ_MODE				: natural range 0 to 1 	:=  1;				-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
		C_PRE_SP6_MODE			: natural range 0 to 1 	:=  0;				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
		C_RAMSTYLE				: string 					:= "AUTO"			-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)		
	);
	port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
			
			-- fifo interface
			fifo_clk_i		: in  std_logic;	-- fifo clock input, only used in asynchronous clock mode (C_CLOCK_MODE=1)
														-- if C_CLOCK_MODE=0, tie input to zero '0'
														
			fifo_empty_o 	: out std_logic;
			fifo_rd_i 		: in  std_logic;
			fifo_data_o 	: out std_logic_vector(C_DATA_WIDTH-1 downto 0);

			fifo_full_o 	: out std_logic;
			fifo_wr_i 		: in  std_logic;
			fifo_data_i 	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0)
	);
end wb_fifo;

architecture structural of wb_fifo is

	signal wb_fifo_wr_o 		: std_logic;
	signal wb_fifo_data_o 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_fifo_full_i 	: std_logic;
	signal wb_fifo_empty_i 	: std_logic;
	signal wb_fifo_data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_fifo_rd_o 		: std_logic;

begin

	-- Wishbone Slave fifo controller
	wb_slv_fifo_ctrl_inst : wb_slv_fifo_ctrl
		generic map(
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_i,
			wb_o 	=> wb_o,
			
			-- fifo interface
			fifo_wr_o    => wb_fifo_wr_o,
			fifo_data_o  => wb_fifo_data_o,
			fifo_full_i  => wb_fifo_full_i,
			fifo_empty_i => wb_fifo_empty_i,
			fifo_data_i	 => wb_fifo_data_i,
			fifo_rd_o	 => wb_fifo_rd_o
		);

	-- Wishbone input fifo
	fifo_wbin_inst : fifo
		generic map(			
			ADDR_WIDTH		=> C_FIFO_DEPTH,			-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
			DATA_WIDTH		=> C_DATA_WIDTH,			-- Data width
			CLOCK_MODE		=> C_CLOCK_MODE, 			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH		=> C_SYNC_DEPTH,			-- Synchronizer depth (asynch mode only)
			PRE_LOAD			=> C_PRE_LOAD,				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK		=> 0,				 			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			READ_MODE		=> C_READ_MODE,			-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,		-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			RAMSTYLE			=> C_RAMSTYLE				-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)			
			)
		port map(
			clk_i				=> clk_i,
			-- Input clock domain
			clkw_asynch_i => clk_i,
			wr_i			  => wb_fifo_wr_o,
			data_in_i	  => wb_fifo_data_o,
			wr_ack_o 	  => open,
			full_o		  => wb_fifo_full_i,
			-- Output clock domain
			clkr_asynch_i => fifo_clk_i,
			rd_i			  => fifo_rd_i,
			data_out_o 	  => fifo_data_o,
			empty_o		  => fifo_empty_o,
			-- Common inputs
			reset_i 		  => rst_i
			);
			
	-- Wishbone output fifo
	fifo_wbout_inst : fifo
		generic map(			
			ADDR_WIDTH		=> C_FIFO_DEPTH,			-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
			DATA_WIDTH		=> C_DATA_WIDTH,			-- Data width
			CLOCK_MODE		=> C_CLOCK_MODE, 			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH		=> C_SYNC_DEPTH,			-- Synchronizer depth (asynch mode only)
			PRE_LOAD			=> C_PRE_LOAD,				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK		=> 0,				 			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			READ_MODE		=> C_READ_MODE,			-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,		-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			RAMSTYLE			=> C_RAMSTYLE				-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)			
			)
		port map(
			clk_i				=> clk_i,
			-- Input clock domain
			clkw_asynch_i => fifo_clk_i,
			wr_i			  => fifo_wr_i,
			data_in_i	  => fifo_data_i,
			wr_ack_o 	  => open,
			full_o		  => fifo_full_o,
			-- Output clock domain
			clkr_asynch_i => clk_i,
			rd_i			  => wb_fifo_rd_o,
			data_out_o 	  => wb_fifo_data_i,
			empty_o		  => wb_fifo_empty_i,
			-- Common inputs
			reset_i 		  => rst_i
			);

end structural;