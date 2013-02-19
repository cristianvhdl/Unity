----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    09:22:43 25/04-2012 
-- Design Name: 
-- Module Name:    wb2wb_fifo - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave component offering af dual wishbone read and write 
--		interface to a pair of configurable asynchronous/synchronous FIFOs.
--
--			If a synchronous FIFO interface between two independent 
--			Wishbone busses is desired use the wb2wb_fifo_sync component.
--
--			If an asynchronous FIFO interface between two independent 
--			Wishbone busses is desired use the wb2wb_fifo_async component.
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
--			- fifo_v02_10_a
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		25/04-2012	ANLAN		File Created
-- 0.02		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		19/10-2012	ANLAN		syncchronous and asynchronous version of the wb2wb_fifo component created,
--											all relevant FIFO generics added to wb_fifo_sync/async generic lists,
--											headers, comments and licensing info updated.
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

library fifo_v02_10_a;
use fifo_v02_10_a.fifo_pkg.all;

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb2wb_fifo_sync is
	generic (
		-- FIFO configuration
		C_FIFO_DEPTH			: natural range 1 to 32 :=  4;				-- FIFO depth (fifo memory address bit-width)
		C_DATA_WIDTH			: natural range 1 to 32 := 32;				-- Data bit-width
		C_PRE_LOAD				: natural					:=  0;				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
		C_PRE_SP6_MODE			: natural range 0 to 1 	:=  0;				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
		C_RAMSTYLE				: string 					:= "AUTO"			-- AUTO, BLOCK, DISTRIBUTED
	);
	port ( 
			-- wb syscon interface	
			clk_i 	: in  std_logic;
			rst_i 	: in  std_logic;
			
			-- wb slave interface A
			wb_a_i 	: in  wb_ad32sb_if;
			wb_a_o	: out wb_d32ae_if;
			
			-- wb slave interface B
			wb_b_i 	: in  wb_ad32sb_if;
			wb_b_o 	: out wb_d32ae_if
	);
end wb2wb_fifo_sync;

architecture structural of wb2wb_fifo_sync is

	signal wb_a_fifo_wr_o 		: std_logic;
	signal wb_a_fifo_data_o 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_a_fifo_full_i 	: std_logic;
	signal wb_a_fifo_empty_i 	: std_logic;
	signal wb_a_fifo_data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_a_fifo_rd_o 		: std_logic;

	signal wb_b_fifo_wr_o 		: std_logic;
	signal wb_b_fifo_data_o 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_b_fifo_full_i 	: std_logic;
	signal wb_b_fifo_empty_i 	: std_logic;
	signal wb_b_fifo_data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_b_fifo_rd_o 		: std_logic;

begin

	-- Wishbone Slave fifo controller A
	wb_slv_fifo_ctrl_inst_a : wb_slv_fifo_ctrl
		generic map(
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_a_i,
			wb_o 	=> wb_a_o,
			
			-- fifo interface
			fifo_wr_o    => wb_a_fifo_wr_o,
			fifo_data_o  => wb_a_fifo_data_o,
			fifo_full_i  => wb_a_fifo_full_i,
			fifo_empty_i => wb_a_fifo_empty_i,
			fifo_data_i	 => wb_a_fifo_data_i,
			fifo_rd_o	 => wb_a_fifo_rd_o
		);
		
	-- Wishbone Slave fifo controller B
	wb_slv_fifo_ctrl_inst_b : wb_slv_fifo_ctrl
		generic map(
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_b_i,
			wb_o 	=> wb_b_o,
			
			-- fifo interface
			fifo_wr_o    => wb_b_fifo_wr_o,
			fifo_data_o  => wb_b_fifo_data_o,
			fifo_full_i  => wb_b_fifo_full_i,
			fifo_empty_i => wb_b_fifo_empty_i,
			fifo_data_i	 => wb_b_fifo_data_i,
			fifo_rd_o	 => wb_b_fifo_rd_o
		);		

	-- Wishbone input fifo
	fifo_wb_a_in_inst : fifo
		generic map(	
			ADDR_WIDTH		=> C_FIFO_DEPTH,	-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
			DATA_WIDTH		=> C_DATA_WIDTH,	-- Data width
			CLOCK_MODE		=> 0,    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH		=> 2,					-- Synchronizer depth (asynch mode only)
			PRE_LOAD			=> C_PRE_LOAD,		-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK		=> 0,    			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			READ_MODE		=> 1,					-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			RAMSTYLE			=> C_RAMSTYLE		-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)
		)
		port map(
			clk_i				=> clk_i,
			-- Input clock domain
			clkw_asynch_i => '0',
			wr_i			  => wb_a_fifo_wr_o,
			data_in_i	  => wb_a_fifo_data_o,
			wr_ack_o 	  => open,
			full_o		  => wb_a_fifo_full_i,
			-- Output clock domain
			clkr_asynch_i => '0',
			rd_i			  => wb_b_fifo_rd_o,
			data_out_o 	  => wb_b_fifo_data_i,
			empty_o		  => wb_b_fifo_empty_i,
			-- Common inputs
			reset_i 		  => rst_i
		);
			
	-- Wishbone output fifo
	fifo_wb_a_out_inst : fifo
		generic map(	
			ADDR_WIDTH		=> C_FIFO_DEPTH,	-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
			DATA_WIDTH		=> C_DATA_WIDTH,	-- Data width
			CLOCK_MODE		=> 0,    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH		=> 2,					-- Synchronizer depth (asynch mode only)
			PRE_LOAD			=> C_PRE_LOAD,		-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK		=> 0,    			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			READ_MODE		=> 1,					-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			RAMSTYLE			=> C_RAMSTYLE		-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)
		)
		port map(
			clk_i			=> clk_i,
			-- Input clock domain
			clkw_asynch_i => '0',
			wr_i			  => wb_b_fifo_wr_o,
			data_in_i	  => wb_b_fifo_data_o,
			wr_ack_o 	  => open,
			full_o		  => wb_b_fifo_full_i,
			-- Output clock domain
			clkr_asynch_i => '0',
			rd_i			  => wb_a_fifo_rd_o,
			data_out_o 	  => wb_a_fifo_data_i,
			empty_o		  => wb_a_fifo_empty_i,
			-- Common inputs
			reset_i 		  => rst_i
			);

end structural;


library ieee;
use ieee.std_logic_1164.all;

library fifo_v02_10_a;
use fifo_v02_10_a.fifo_pkg.all;

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb2wb_fifo_async is
	generic (
		-- FIFO configuration
		C_FIFO_DEPTH			: natural range 1 to 32 :=  4;				-- FIFO depth (fifo memory address bit-width)
		C_DATA_WIDTH			: natural range 1 to 32 := 32;				-- Data bit-width
		C_SYNC_DEPTH			: natural range 1 to 8 	:=  2;				-- Synchronizer depth (asynch mode only)
		C_PRE_LOAD				: natural					:=  0;				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
		C_PRE_SP6_MODE			: natural range 0 to 1 	:=  0;				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
		C_RAMSTYLE				: string 					:= "AUTO"			-- AUTO, BLOCK, DISTRIBUTED
	);
	port ( 
			-- wb syscon interface A
			clk_a_i 	: in  std_logic;
			rst_a_i 	: in  std_logic;
			
			-- wb slave interface A
			wb_a_i 	: in  wb_ad32sb_if;
			wb_a_o	: out wb_d32ae_if;
			
			-- wb syscon interface B
			clk_b_i 	: in  std_logic;
			rst_b_i 	: in  std_logic;			
			
			-- wb slave interface B
			wb_b_i 	: in  wb_ad32sb_if;
			wb_b_o 	: out wb_d32ae_if
	);
end wb2wb_fifo_async;

architecture structural of wb2wb_fifo_async is

	signal wb_a_fifo_wr_o 		: std_logic;
	signal wb_a_fifo_data_o 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_a_fifo_full_i 	: std_logic;
	signal wb_a_fifo_empty_i 	: std_logic;
	signal wb_a_fifo_data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_a_fifo_rd_o 		: std_logic;

	signal wb_b_fifo_wr_o 		: std_logic;
	signal wb_b_fifo_data_o 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_b_fifo_full_i 	: std_logic;
	signal wb_b_fifo_empty_i 	: std_logic;
	signal wb_b_fifo_data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_b_fifo_rd_o 		: std_logic;

	signal reset					: std_logic;

begin

	reset <= rst_a_i or rst_b_i;

	-- Wishbone Slave fifo controller A
	wb_slv_fifo_ctrl_inst_a : wb_slv_fifo_ctrl
		generic map(
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_a_i,
			rst_i => reset,
			
			-- wb slave interface
			wb_i 	=> wb_a_i,
			wb_o 	=> wb_a_o,
			
			-- fifo interface
			fifo_wr_o    => wb_a_fifo_wr_o,
			fifo_data_o  => wb_a_fifo_data_o,
			fifo_full_i  => wb_a_fifo_full_i,
			fifo_empty_i => wb_a_fifo_empty_i,
			fifo_data_i	 => wb_a_fifo_data_i,
			fifo_rd_o	 => wb_a_fifo_rd_o
		);
		
	-- Wishbone Slave fifo controller B
	wb_slv_fifo_ctrl_inst_b : wb_slv_fifo_ctrl
		generic map(
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_b_i,
			rst_i => reset,
			
			-- wb slave interface
			wb_i 	=> wb_b_i,
			wb_o 	=> wb_b_o,
			
			-- fifo interface
			fifo_wr_o    => wb_b_fifo_wr_o,
			fifo_data_o  => wb_b_fifo_data_o,
			fifo_full_i  => wb_b_fifo_full_i,
			fifo_empty_i => wb_b_fifo_empty_i,
			fifo_data_i	 => wb_b_fifo_data_i,
			fifo_rd_o	 => wb_b_fifo_rd_o
		);		

	-- Wishbone input fifo
	fifo_wb_a_in_inst : fifo
		generic map(	
			ADDR_WIDTH		=> C_FIFO_DEPTH,	-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
			DATA_WIDTH		=> C_DATA_WIDTH,	-- Data width
			CLOCK_MODE		=> 1,    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH		=> C_SYNC_DEPTH,	-- Synchronizer depth (asynch mode only)
			PRE_LOAD			=> C_PRE_LOAD,		-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK		=> 0,    			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			READ_MODE		=> 1,					-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			RAMSTYLE			=> C_RAMSTYLE		-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)
		)
		port map(
			clk_i			  => '0',
			-- Input clock domain
			clkw_asynch_i => clk_a_i,
			wr_i			  => wb_a_fifo_wr_o,
			data_in_i	  => wb_a_fifo_data_o,
			wr_ack_o 	  => open,
			full_o		  => wb_a_fifo_full_i,
			-- Output clock domain
			clkr_asynch_i => clk_b_i,
			rd_i			  => wb_b_fifo_rd_o,
			data_out_o 	  => wb_b_fifo_data_i,
			empty_o		  => wb_b_fifo_empty_i,
			-- Common inputs
			reset_i 		  => reset
		);
			
	-- Wishbone output fifo
	fifo_wb_a_out_inst : fifo
		generic map(	
			ADDR_WIDTH		=> C_FIFO_DEPTH,	-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
			DATA_WIDTH		=> C_DATA_WIDTH,	-- Data width
			CLOCK_MODE		=> 1,    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH		=> C_SYNC_DEPTH,	-- Synchronizer depth (asynch mode only)
			PRE_LOAD			=> C_PRE_LOAD,		-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK		=> 0,    			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			READ_MODE		=> 1,					-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			RAMSTYLE			=> C_RAMSTYLE		-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)
		)
		port map(
			clk_i			  => '0',
			-- Input clock domain
			clkw_asynch_i => clk_b_i,
			wr_i			  => wb_b_fifo_wr_o,
			data_in_i	  => wb_b_fifo_data_o,
			wr_ack_o 	  => open,
			full_o		  => wb_b_fifo_full_i,
			-- Output clock domain
			clkr_asynch_i => clk_a_i,
			rd_i			  => wb_a_fifo_rd_o,
			data_out_o 	  => wb_a_fifo_data_i,
			empty_o		  => wb_a_fifo_empty_i,
			-- Common inputs
			reset_i 		  => reset
			);

end structural;