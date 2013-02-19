----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    14:27:45 26/09-2012 
-- Design Name: 
-- Module Name:    UL_bsp_wbm - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	 Unity-Link Byte-Stream-Protocol with Wishbone-Master interface
--
-- Dependencies: 
--
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		26/09-2012	ANLAN		File Created
-- 0.02		28/11-2012	ANLAN		Comments updated about address aliasing
-- 0.04		30/11-2012	ANLAN		Interface updated to support added interrupt-triggered publishing feature.
-- 0.05		01/12-2012	ANLAN		Wishbone library updated to v03_50_a.	
-- 0.06			
--
-- Additional Comments: 
--
--		[1] To avoid address aliasing when using Unity-Link manually in a terminal 
--			 it is recommeded to configure the BII_ADDR_WIDTH generic to a byte multiple [8, 16, 24 32]
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

library wishbone_v03_50_a;
use wishbone_v03_50_a.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE uart_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity UL_bsp_wbm is
	generic (
		-- C_BSP_MODE					: integer range 0 to 1	 := 0;			-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
		-- Datalink Layer Configuration
		C_DL_FULL						: integer range 0 to 1	 := 1;			-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
		C_DL_PL_RX_ERR_WIDTH			: integer range 0 to	10	 := 3;			-- Number of rx error input lines from the physical layer		
		C_DL_CHECKSUM					: integer range 0 to 2   := 2;			-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT		
		-- Application Layer Configuration
		C_AL_RLC_EN						: integer range 0 to 1	 := 1;			-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
		C_AL_RM_SIZE					: integer range 0 to 255 := 32;			-- 0: RM disabled, 1-255: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
		C_AL_PUB_MODE					: integer range 0 to 2 	 := 2;			-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
		C_AL_PUBLISH_BASE_FREQ		: positive					 := 1000;		-- Publish sync strobe base frequency [Hz]			
		C_AL_SUBMNGR_SGID_SIZE		: integer range 0 to 4   := 1;			-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
		C_AL_SUBGRP_RATE_BYTE_CNT 	: integer range 1 to 4 	 := 2; 			-- Number of bytes in the RATE register of each subscription group
		C_AL_SUBGRP_ADDR_WIDTH 		: integer range 2 to 5	 := 4;			-- Size/depth of each subscription group = (2**C_AL_SUBGRP_ADDR_WIDTH) : RANGE=[4,8,16,32]		
		C_AL_SUBGRP_IRQ_ENABLE  	: std_logic_vector(15 downto 0) := "0000000000000011";	-- Interrupt Triggered Publishing: 0 = Disabled, 1 = Enabled
		C_AL_SUBGRP_IRQ_IS_EDGE 	: std_logic_vector(15 downto 0) := "0000000000000000";	-- Interrupt Triggered Publishing: 0 = Level (high), 1 = Edge (rising)						
		-- Wishbone Bus Interface (WB) Configuration
		C_WB_CLK_FREQ					: positive					 := 50000000;	-- WB clock frequency [Hz]
		C_WB_ADDR_WIDTH				: integer range 1 to 32  := 32;			-- WB bus address space/size, N.B. avoid aliasing use [8,16,24,32], see comment 1
		C_WB_DATA_WIDTH				: integer range 8 to 32  := 32;			-- WN bus data width: [8,16,32]
		-- Memory instantiation Options
		C_PRE_SP6_MODE					: natural range 0 to 1 	:= 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled		
		);
	port (
	-------------------------------------------
	-- Physical-Layer interface
	-- ----------------------------------------
	-- The physical-layer must implement two FIFOs:
	--
	-- RxFIFO : used by the physical-layer to store incoming messages from an external device (e.g. PC)
	-- TxFIFO : used by the physical-layer to read messages (from the datalink-layer) to be sent to an external device (e.g. PC)
	-------------------------------------------
		
		-- RxFIFO
		rx_fifo_empty_i 		: in  std_logic;														-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_o 		: out std_logic;														-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_i 		: in  std_logic_vector (7 downto 0);							-- (MANDATORY) : rx-fifo data bus
		
		-- Rx error signals
		rx_err_i 				: in  std_logic_vector(C_DL_PL_RX_ERR_WIDTH-1 downto 0);	-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 	: out std_logic;														-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o	: out std_logic;														-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 		: in  std_logic;														-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o 		: out std_logic;														-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 		: out std_logic_vector (7 downto 0);							-- (MANDATORY) : tx-fifo data bus
		
	-------------------------------------------
	
	-------------------------------------------
	-- Wishbone Master interface
	-------------------------------------------
		-- WB syscon interface
		clk_i					: in  std_logic;
		rst_i					: in  std_logic;
		
		-- WB master interface
		wb_o 					: out wb_ad32sb_if;
		wb_i 					: in  wb_d32ae_if;
	-------------------------------------------
	
	-------------------------------------------
	-- Subscription-Group IRQ inputs
	-------------------------------------------
		sg_irq_i : in std_logic_vector((2**C_AL_SUBMNGR_SGID_SIZE)-1 downto 0)
	-------------------------------------------			
	);
end UL_bsp_wbm;

architecture structural of UL_bsp_wbm is

	-- BII <> WB Master signals
	signal mst_en_i 	: std_logic;														-- enable (keep high during a cycle/block)
	signal mst_we_i	: std_logic;														-- write enable: write=1, read=0 (must not change during a cycle/block)
	signal mst_blk_i 	: std_logic;														-- block mode: block=1, single=0
	signal mst_nxt_i	: std_logic;														-- has next (valid in block mode), set to 1 if current is not the last read/write in the block (update synchronous to clock when done=1)
	signal mst_adr_i	: std_logic_vector(C_WB_ADDR_WIDTH-1 downto 0);			-- address in	(clock synchronous update when done=1)
	signal mst_dat_i	: std_logic_vector(C_WB_DATA_WIDTH-1 downto 0);			-- data in (write) (update synchronous to clock when done=1)
	signal mst_dat_o	: std_logic_vector(C_WB_DATA_WIDTH-1 downto 0);			-- data out (read) (update synchronous to clock when done=1)
	signal mst_done_o	: std_logic;														-- done strobe	 (Success)
	signal mst_err_o 	: std_logic;														-- error strobe (Failure)	

begin


	UL_bsp : entity work.UL_bsp
	generic map(
		-- C_BSP_MODE					: integer range 0 to 1	 := 0;	-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
		-- Datalink Layer Configuration
		C_DL_FULL						=> C_DL_FULL,							-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
		C_DL_PL_RX_ERR_WIDTH			=> C_DL_PL_RX_ERR_WIDTH,			-- Number of rx error input lines from the physical layer		
		C_DL_CHECKSUM					=> C_DL_CHECKSUM,						-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT		
		-- Application Layer Configuration
		C_AL_RLC_EN						=> C_AL_RLC_EN,						-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
		C_AL_RM_SIZE					=> C_AL_RM_SIZE,						-- 0: RM disabled, 1-255: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
		C_AL_PUB_MODE					=> C_AL_PUB_MODE,						-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
		C_AL_PUBLISH_BASE_FREQ		=> C_AL_PUBLISH_BASE_FREQ,			-- Publish sync strobe base frequency [Hz]			
		C_AL_SUBMNGR_SGID_SIZE		=> C_AL_SUBMNGR_SGID_SIZE,			-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
		C_AL_SUBGRP_RATE_BYTE_CNT 	=> C_AL_SUBGRP_RATE_BYTE_CNT, 	-- Number of bytes in the RATE register of each subscription group
		C_AL_SUBGRP_ADDR_WIDTH 		=> C_AL_SUBGRP_ADDR_WIDTH,			-- Size/depth of each subscription group = (2**C_AL_SUBGRP_ADDR_WIDTH) : RANGE=[4,8,16,32]		
		C_AL_SUBGRP_IRQ_ENABLE  	=> C_AL_SUBGRP_IRQ_ENABLE,			-- Interrupt Triggered Publishing: 0 = Disabled, 1 = Enabled
		C_AL_SUBGRP_IRQ_IS_EDGE 	=> C_AL_SUBGRP_IRQ_IS_EDGE,		-- Interrupt Triggered Publishing: 0 = Level (high), 1 = Edge (rising)						
		-- BUS Independent Interface (BII) Configuration
		C_BII_CLK_FREQ					=> C_WB_CLK_FREQ,						-- BII clock frequency [Hz]
		C_BII_ADDR_WIDTH				=> C_WB_ADDR_WIDTH,					-- BII bus address space/size, N.B. avoid aliasing use [8,16,24,32], see comment 1
		C_BII_DATA_WIDTH				=> C_WB_DATA_WIDTH,					-- BII bus data width: [8,16,32]
		-- Memory instantiation Options
		C_PRE_SP6_MODE					=> C_PRE_SP6_MODE						-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled		
	)
	port map( 
		clk_i 					=> clk_i,										-- BUS clock signal
		reset_i					=> rst_i,										-- General (synchronous) reset signal

	-------------------------------------------
	-- Physical-Layer <> Datalink-Layer interface
	-- ----------------------------------------
	-- The physical-layer must implement two FIFOs:
	--
	-- RxFIFO : used by the physical-layer to store incoming messages from an external device (e.g. PC)
	-- TxFIFO : used by the physical-layer to read messages (from the datalink-layer) to be sent to an external device (e.g. PC)
	-------------------------------------------
		
		-- RxFIFO
		rx_fifo_empty_i 		=> rx_fifo_empty_i,							-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_o 		=> rx_fifo_read_o,							-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_i 		=> rx_fifo_data_i,							-- (MANDATORY) : rx-fifo data bus
		
		-- Rx error signals
		rx_err_i 				=> rx_err_i,									-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 	=> rx_err_clr_o,								-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o	=> rx_fifo_flush_req_o,						-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 		=> tx_fifo_full_i,							-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o 		=> tx_fifo_write_o,							-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 		=> tx_fifo_data_o,							-- (MANDATORY) : tx-fifo data bus
		
	-------------------------------------------
	
	-------------------------------------------
	-- Application-Layer <> User-Specific-Logic interface
	-------------------------------------------
	
		-- BUS Independent interface (BII)
		en_o			=> mst_en_i,												-- enable (keep high during a cycle/block)
		we_o			=> mst_we_i,												-- write enable: write=1, read=0 (must not change during a cycle/block)
		blk_o 		=> mst_blk_i,												-- block mode: block=1, single=0
		nxt_o			=> mst_nxt_i,												-- has next (valid in block mode), set to 1 if current is not the last read/write in the block (update synchronous to clock when done=1)
		adr_o			=> mst_adr_i,												-- address in	(clock synchronous update when done=1)
		dat_o			=> mst_dat_i,												-- data out (write) (update synchronous to clock when done=1)
		dat_i			=> mst_dat_o,												-- data in (read)
		done_i		=> mst_done_o,												-- done strobe	 (Success)
		err_i 		=> mst_err_o, 												-- error strobe (Failure)	
		
		-- Subscription-Group IRQ inputs
		sg_irq_i 	=> sg_irq_i
		
	-------------------------------------------
	);

	-- Wishbone Master FSM
	wb_mst_ctrl_inst : wb_mst_ctrl
		generic map(
			C_ADDR_WIDTH 		=> C_WB_ADDR_WIDTH,
			C_DATA_WIDTH 		=> C_WB_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb master interface
			wb_o 	=> wb_o,
			wb_i 	=> wb_i,
			
			-- user logic interface
			en_i		=> mst_en_i,
			we_i		=> mst_we_i,
			blk_i 	=> mst_blk_i,
			nxt_i		=> mst_nxt_i,
			adr_i		=> mst_adr_i,
			dat_i		=> mst_dat_i,
			dat_o		=> mst_dat_o,
			done_o	=> mst_done_o,
			err_o 	=> mst_err_o
		);

end structural;

