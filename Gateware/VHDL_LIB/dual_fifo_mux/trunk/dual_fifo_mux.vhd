----------------------------------------------------------------------------------
-- Company: Anders Blaabjerg Lange
-- Engineer: University Of Southern Denmark
-- 
-- Create Date:    09:59:03 28/12-2011
-- Design Name: 
-- Module Name:    dual_fifo_mux - structural  
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:
--
-- 	This module implements a Dual-FIFO Mux suiteable for use e.g. 
--		protocol stacks etc.
--
--		The FIFOs can be implements either as synchronous or as asynchronous FIFOs.
--
--		Various other parameters can be adjusted on the FIFOs, such as:
--			- synchonizer depth
--			- pre-load depth
--			- enable/disable write acknowledge output
--			- asynchronous/synchrnous data read output
--			- RAM implementation style, etc.
--
-- Dependencies:
--
--		Unity-HDL libraries:
--			- fifo_v02_10_b
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01 		28/12-2011 	ANLAN		File Created
-- 0.02 		26/09-2012 	ANLAN		Updated to use library for the FIFO component (fifo_v01_00_a)
-- 0.03		22/10-2012	ANLAN		Updated to use fifo_v02_10_b, and support full FIFO generic and port map.
-- 0.04		
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

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE dual_fifo_mux_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity dual_fifo_mux is
   generic(	
		C_ADDR_WIDTH		: positive					:= 8;			-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
		C_DATA_WIDTH		: positive					:= 9;			-- Data width
		C_CLOCK_MODE		: natural range 0 to 1 	:= 0;    	-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
		C_SYNC_DEPTH		: natural range 1 to 8 	:= 2;			-- Synchronizer depth (asynch mode only)		
		C_PRE_LOAD			: natural					:= 0;			-- Write<>Read Ptr offset before deasserting empty signal (read logic)
		C_EN_WRT_ACK		: natural range 0 to 1 	:= 0; 		-- Write acknowledge; 0 -> disabled, 1 -> enabled
		C_READ_MODE			: natural range 0 to 1 	:= 1;			-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
		C_PRE_SP6_MODE		: natural range 0 to 1 	:= 0;			-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
		C_RAMSTYLE			: string 					:= "AUTO"	-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)		
		);
	port ( 
		-- Common clock input
		clk_i 				: in  std_logic;											-- use this if C_CLOCK_MODE=0, else connect to '0'
		
		-- Common inputs
		reset_i 				: in  std_logic;		
		sel_in_fifo_i		: in  std_logic;
		sel_out_fifo_i 	: in  std_logic;
		
		-- fifo input domain
		clkw_asynch_i		: in std_logic;											-- use this if C_CLOCK_MODE=1, else connect to '0'
		fifo_wr_i 			: in  std_logic;
		fifo_data_in_i		: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		fifo_reset_i 		: in  std_logic;
		fifo_wr_ack_o 		: out std_logic;
		fifo_full_o 		: out std_logic;
		
		-- fifo output domain
		clkr_asynch_i		: in std_logic;											-- use this if C_CLOCK_MODE=1, else connect to '0'
		fifo_rd_i 			: in  std_logic;
		fifo_data_out_o 	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
		fifo_empty_o 		: out std_logic
		);
end dual_fifo_mux;

architecture structural of dual_fifo_mux is

	signal fifo_1_wr 			: std_logic;
	signal fifo_1_data_in 	: std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal fifo_1_reset 		: std_logic;	
	signal fifo_1_wr_ack		: std_logic;
	signal fifo_1_full		: std_logic;
	signal fifo_1_mreset		: std_logic;
	
	signal fifo_2_wr 			: std_logic;
	signal fifo_2_data_in 	: std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal fifo_2_reset 		: std_logic;	
	signal fifo_2_wr_ack		: std_logic;
	signal fifo_2_full		: std_logic;
	signal fifo_2_mreset		: std_logic;	

	signal fifo_1_rd 			: std_logic;
	signal fifo_1_data_out 	: std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal fifo_1_empty 		: std_logic;
	
	signal fifo_2_rd 			: std_logic;
	signal fifo_2_data_out 	: std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal fifo_2_empty 		: std_logic;

begin
	
	----------------------------------------------
	-- FIFO Input MUX
	----------------------------------------------
		fifo_in_mux_inst : entity work.fifo_in_mux
		generic map (	
			C_DATA_WIDTH		=> C_DATA_WIDTH
			)		
		port map (
			-- common fifo input domain signals
			fifo_sel_i 			=> sel_in_fifo_i,
			fifo_wr_i 			=> fifo_wr_i,
			fifo_data_in_i 	=> fifo_data_in_i,
			fifo_reset_i 		=> fifo_reset_i,
			fifo_wr_ack_o 		=> fifo_wr_ack_o,
			fifo_full_o 		=> fifo_full_o,
			
			-- fifo 1 input domain signals
			fifo_1_wr_o 		=> fifo_1_wr,
			fifo_1_data_in_o 	=> fifo_1_data_in,
			fifo_1_reset_o 	=> fifo_1_reset,
			fifo_1_wr_ack_i 	=> fifo_1_wr_ack,
			fifo_1_full_i 		=> fifo_1_full,
			
			-- fifo 2 input domain signals
			fifo_2_wr_o 		=> fifo_2_wr,
			fifo_2_data_in_o 	=> fifo_2_data_in,
			fifo_2_reset_o 	=> fifo_2_reset,
			fifo_2_wr_ack_i 	=> fifo_2_wr_ack,
			fifo_2_full_i 		=> fifo_2_full
		);
		
		fifo_1_mreset <= fifo_1_reset or reset_i;
		fifo_2_mreset <= fifo_2_reset or reset_i;
	----------------------------------------------
	
	----------------------------------------------
	-- FIFO 1
	----------------------------------------------
		fifo_1_inst : fifo
		generic map(	
			ADDR_WIDTH		=> C_ADDR_WIDTH,
			DATA_WIDTH		=> C_DATA_WIDTH,
			CLOCK_MODE		=> C_CLOCK_MODE,
			SYNC_DEPTH		=> C_SYNC_DEPTH,
			PRE_LOAD			=> C_PRE_LOAD,
			EN_WRT_ACK		=> C_EN_WRT_ACK,
			READ_MODE		=> C_READ_MODE,
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,
			RAMSTYLE			=> C_RAMSTYLE
		)	
		port map(
			clk_i				=> clk_i,
			-- Input clock domain
			clkw_asynch_i	=> clkw_asynch_i,
			wr_i				=> fifo_1_wr,
			data_in_i 		=> fifo_1_data_in,
			wr_ack_o 		=> fifo_1_wr_ack,
			full_o			=> fifo_1_full,
			-- Output clock domain
			clkr_asynch_i	=> clkr_asynch_i,
			rd_i				=> fifo_1_rd,
			data_out_o 		=> fifo_1_data_out,
			empty_o			=> fifo_1_empty,
			-- Common inputs
			reset_i 			=> fifo_1_mreset
			);	
	----------------------------------------------

	----------------------------------------------
	-- FIFO 2
	----------------------------------------------
		fifo_2_inst : fifo
		generic map(	
			ADDR_WIDTH		=> C_ADDR_WIDTH,
			DATA_WIDTH		=> C_DATA_WIDTH,
			CLOCK_MODE		=> C_CLOCK_MODE,
			SYNC_DEPTH		=> C_SYNC_DEPTH,
			PRE_LOAD			=> C_PRE_LOAD,
			EN_WRT_ACK		=> C_EN_WRT_ACK,
			READ_MODE		=> C_READ_MODE,
			PRE_SP6_MODE	=> C_PRE_SP6_MODE,
			RAMSTYLE			=> C_RAMSTYLE
		)
		port map(
			clk_i				=> clk_i,
			-- Input clock domain
			clkw_asynch_i	=> clkw_asynch_i,
			wr_i				=> fifo_2_wr,
			data_in_i 		=> fifo_2_data_in,
			wr_ack_o 		=> fifo_2_wr_ack,
			full_o			=> fifo_2_full,
			-- Output clock domain
			clkr_asynch_i	=> clkr_asynch_i,
			rd_i				=> fifo_2_rd,
			data_out_o 		=> fifo_2_data_out,
			empty_o			=> fifo_2_empty,
			-- Common inputs
			reset_i 			=> fifo_2_mreset
			);		
	----------------------------------------------

	----------------------------------------------
	-- FIFO Output MUX
	----------------------------------------------
		fifo_out_mux_inst : entity work.fifo_out_mux
		generic map (	
			C_DATA_WIDTH		=> C_DATA_WIDTH
			)
		port map ( 
			-- fifo 1 output domain signals
			fifo_1_rd_o 		=> fifo_1_rd,
			fifo_1_data_out_i => fifo_1_data_out,
			fifo_1_empty_i 	=> fifo_1_empty,
			
			-- fifo 2 output domain signals
			fifo_2_rd_o 		=> fifo_2_rd,
			fifo_2_data_out_i => fifo_2_data_out,
			fifo_2_empty_i 	=> fifo_2_empty,
			
			-- common fifo output domain signals
			fifo_sel_i 			=> sel_out_fifo_i,
			fifo_rd_i 			=> fifo_rd_i,
			fifo_data_out_o 	=> fifo_data_out_o,
			fifo_empty_o 		=> fifo_empty_o
			);	
	----------------------------------------------

end structural;