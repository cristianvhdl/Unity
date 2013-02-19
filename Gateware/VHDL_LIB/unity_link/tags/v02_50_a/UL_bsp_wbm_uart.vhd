----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    12:57:18 27/09-2012 
-- Design Name: 
-- Module Name:    UL_bsp_wbm_uart - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	 Unity-Link Byte-Stream-Protocol 
--						 with asynchronous UART and Wishbone-Master interface
--						 
--
-- Dependencies: 
--
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		27/09-2012	ANLAN		File Created
-- 0.02		22/11-2012	ANLAN		Libraries updated			 
-- 0.03		28/11-2012	ANLAN		Comments updated about address aliasing and UART clock configuration
-- 0.04		30/11-2012	ANLAN		Interface updated to support added interrupt-triggered publishing feature.
-- 0.05		01/12-2012	ANLAN		Wishbone library updated to v03_50_a.
-- 0.06		
--
-- Additional Comments: 
--
--		[1] To avoid address aliasing when using Unity-Link manually in a terminal 
--		    it is recommeded to configure the BII_ADDR_WIDTH generic to a byte multiple [8, 16, 24 32]
--
-- 	[2] For best results the uart clock frequency (uart_clk_i) must be an integer 
-- 		 multiple of that of the UART in the opposite end of the RS232 (Rx/Tx) lines.
--
--			------------------------------------------------------------------------------
-- 		|         UART         | native clock |   recommended clock  | Max BAUD Rate |
-- 		-----------------------|------------------------------------------------------
-- 		| FTDI FT232R USB UART |     48 MHz   |  48, (96) or 192 MHz |    3 MBaud    |
-- 		-----------------------|------------------------------------------------------
-- 		|    SILABS CP2102     |     48 MHz   |  (48), 96 or 192 MHz |   500 KBaud   |
-- 		-----------------------|------------------------------------------------------
-- 		|    SILABS CP2103     |     48 MHz   |  48, (96) or 192 MHz |    1 MBaud    |
-- 		-----------------------|------------------------------------------------------
-- 		|                      |              |                      |               |
-- 		-----------------------|------------------------------------------------------
--    	 note: recommended clock in paranteses () is the default tested clock
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

library uart_v02_00_a;
use uart_v02_00_a.uart_pkg.all;

use work.UL_bsp_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE uart_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity UL_bsp_wbm_uart is
	generic (
		-- Physical Layer Configuration
		C_PL_UART_CLK_FREQ			: positive					 := 96000000;	-- UART clock frequency [Hz] (MUST BE AT LEAST 4xC_PL_BAUD_RATE)
		C_PL_BAUD_RATE					: positive					 := 3000000;	-- desired baudrate		
		C_PL_MAX_BAUD_RATE_ERR		: real						 := 3.0;			-- maximum allowed baudrate error in %
		C_PL_STOPBITS					: integer range 1 to 2 	 := 1;			-- number of stopbits
		C_PL_PARITY						: integer range 0 to 4 	 := 0; 			-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE		
		C_PL_BIT_TXRX_ORDER			: integer range 0 to 1 	 := 0;			-- databit tx/rx order: 0 = LSB, 1 = MSB
		-- Byte-Stream-Protocol Configuration
		-- C_BSP_MODE					: integer range 0 to 1	 := 0;			-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
		-- Datalink Layer Configuration
		C_DL_FULL						: integer range 0 to 1	 := 1;			-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
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
		C_WB_DATA_WIDTH				: integer range 8 to 32  := 32;			-- WB bus data width: [8,16,32]
		-- Memory instantiation Options
		C_PRE_SP6_MODE					: natural range 0 to 1 	:= 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
		);
	port (

	-------------------------------------------
	-- UART interface
	-------------------------------------------	
		clk_uart_i 			: in  std_logic;		-- Must be an integer multiple of the clock frequency of the USB<>UART bridge
		
		rx_uart_i			: in  std_logic;
		tx_uart_o			: out std_logic;
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
		sg_irq_i 			: in std_logic_vector((2**C_AL_SUBMNGR_SGID_SIZE)-1 downto 0)
	-------------------------------------------	
	);
end UL_bsp_wbm_uart;

architecture structural of UL_bsp_wbm_uart is

	-- UART <> Unity-Link BSP WBM Physical-Layer interface
	signal rx_uart_fifo_empty 		: std_logic;
	signal rx_uart_fifo_read		: std_logic;		
	signal rx_uart_fifo_data		: std_logic_vector (7 downto 0);
	signal rx_uart_reset				: std_logic;
	
	signal lsr							: std_logic_vector (7 downto 0);
	signal rx_uart_parity_err 		: std_logic;
	signal rx_uart_framing_err 	: std_logic;
	signal rx_uart_overrun_err 	: std_logic;
	signal rx_uart_err 				: std_logic_vector (2 downto 0);
	
	signal rx_uart_clear_errors	: std_logic;			
	signal tx_uart_fifo_full 		: std_logic;
	signal tx_uart_fifo_write		: std_logic;
	signal tx_uart_fifo_data 		: std_logic_vector (7 downto 0);

begin

	-------------------------------------------------------------------
	-- UART with Asynchronous FIFO interface core
	-------------------------------------------------------------------
		uart_asynch_inst : uart_asynch2
		generic map(		
			-- basic configuration
			C_UART_CLK_FREQ		=> C_PL_UART_CLK_FREQ,		-- UART clock frequency [Hz] (MUST BE AT LEAST 4xC_BAUD_RATE)
			C_BAUD_RATE				=> C_PL_BAUD_RATE,			-- desired baudrate
			C_MAX_BAUD_RATE_ERR	=> C_PL_MAX_BAUD_RATE_ERR,	-- maximum allowed baudrate error in %
			
			C_DATABITS 				=> 8,								-- number of databits (default = 8)
			C_STOPBITS				=> C_PL_STOPBITS,				-- number of stopbits (default = 1)
			C_PARITY					=> C_PL_PARITY,				-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE
			
			-- advanced configuration
			C_ERROR_CNT_WIDTH		=> 0,								-- Bitwidth of the error counters (0 = counters disabled)
			C_BIT_TXRX_ORDER		=> C_PL_BIT_TXRX_ORDER,		-- databit tx/rx order: 0 = LSB, 1 = MSB
			C_RX_FIFO_ADDR_W		=> 2,								-- rx fifo depth = 2**C_RX_FIFO_ADDR_W
			C_TX_FIFO_ADDR_W		=> 2,								-- tx fifo depth = 2**C_TX_FIFO_ADDR_W
			C_PRE_SP6_MODE			=> C_PRE_SP6_MODE				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
		)
		port map( 
			-- common io
			reset_i 					=> '0',
			reset_rx_i				=> rx_uart_reset,
			reset_tx_i				=> '0',
			
			-- uart clock domain io
			uart_clk_i				=> clk_uart_i,
			
			rx_i 						=> rx_uart_i,
			tx_o 						=> tx_uart_o,
			
			-- user logic (fifo+uart status) clock domain io
			user_clk_i				=> clk_i,
					
			lsr_o 					=> lsr,
			clr_lsr_errors_i		=> rx_uart_clear_errors,
			
			framing_err_cnt_o		=> open,
			parity_err_cnt_o		=> open,
			overrun_err_cnt_o		=> open,
			clr_err_cnt_i			=> "000",
			
			rx_fifo_empty_o 		=> rx_uart_fifo_empty,
			rx_fifo_read_i			=> rx_uart_fifo_read,
			rx_fifo_data_o 		=> rx_uart_fifo_data,
			
			tx_fifo_full_o 		=> tx_uart_fifo_full,
			tx_fifo_write_i		=> tx_uart_fifo_write,
			tx_fifo_data_i 		=> tx_uart_fifo_data
		);
		
		rx_uart_parity_err 	<= lsr(4);
		rx_uart_framing_err	<= lsr(5);
		rx_uart_overrun_err	<= lsr(3);
		
		rx_uart_err <= rx_uart_overrun_err & rx_uart_framing_err & rx_uart_parity_err;
	-------------------------------------------------------------------

	-------------------------------------------------------------------
	-- Unity-Link Byte-Stream-Protocol Wishbone-Master Datalink+Application layer core
	-------------------------------------------------------------------
		UL_bsp_wbm_inst : UL_bsp_wbm
		generic map(
			-- C_BSP_MODE					=> C_BSP_MODE,									-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
			-- Datalink Layer Configuration
			C_DL_FULL						=> C_DL_FULL,									-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
			C_DL_PL_RX_ERR_WIDTH			=> 3,												-- Number of rx error input lines from the physical layer		
			C_DL_CHECKSUM					=> C_DL_CHECKSUM,								-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT		
			-- Application Layer Configuration
			C_AL_RLC_EN						=> C_AL_RLC_EN,								-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
			C_AL_RM_SIZE					=> C_AL_RM_SIZE, 								-- 0: RM disabled, 1-255: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
			C_AL_PUB_MODE					=> C_AL_PUB_MODE,								-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
			C_AL_PUBLISH_BASE_FREQ		=> C_AL_PUBLISH_BASE_FREQ,					-- Publish sync strobe base frequency [Hz]			
			C_AL_SUBMNGR_SGID_SIZE		=> C_AL_SUBMNGR_SGID_SIZE,					-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
			C_AL_SUBGRP_RATE_BYTE_CNT 	=> C_AL_SUBGRP_RATE_BYTE_CNT,				-- Number of bytes in the RATE register of each subscription group
			C_AL_SUBGRP_ADDR_WIDTH 		=> C_AL_SUBGRP_ADDR_WIDTH,					-- Size/depth of each subscription group = (2**C_AL_SUBGRP_ADDR_WIDTH) : RANGE=[4,8,16,32]		
			C_AL_SUBGRP_IRQ_ENABLE  	=> C_AL_SUBGRP_IRQ_ENABLE,					-- Interrupt Triggered Publishing: 0 = Disabled, 1 = Enabled
			C_AL_SUBGRP_IRQ_IS_EDGE 	=> C_AL_SUBGRP_IRQ_IS_EDGE,				-- Interrupt Triggered Publishing: 0 = Level (high), 1 = Edge (rising)									
			-- Wishbone Bus Interface (WB) Configuration
			C_WB_CLK_FREQ					=> C_WB_CLK_FREQ,								-- WB clock frequency [Hz]
			C_WB_ADDR_WIDTH				=> C_WB_ADDR_WIDTH,							-- WB bus address space/size, N.B. avoid aliasing use [8,16,24,32], see comment 1
			C_WB_DATA_WIDTH				=> C_WB_DATA_WIDTH,							-- WN bus data width: [8,16,32]
			-- Memory instantiation Options
			C_PRE_SP6_MODE					=> C_PRE_SP6_MODE								-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled			
			)
		port map(
		-------------------------------------------
		-- Physical-Layer interface
		-- ----------------------------------------
		-- The physical-layer must implement two FIFOs:
		--
		-- RxFIFO : used by the physical-layer to store incoming messages from an external device (e.g. PC)
		-- TxFIFO : used by the physical-layer to read messages (from the datalink-layer) to be sent to an external device (e.g. PC)
		-------------------------------------------
			
			-- RxFIFO
			rx_fifo_empty_i 		=> rx_uart_fifo_empty,								-- (MANDATORY) : rx-fifo empty control signal
			rx_fifo_read_o 		=> rx_uart_fifo_read,								-- (MANDATORY) : rx-fifo read control signal
			rx_fifo_data_i 		=> rx_uart_fifo_data,								-- (MANDATORY) : rx-fifo data bus
			
			-- Rx error signals
			rx_err_i 				=> rx_uart_err,										-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
			rx_err_clr_o		 	=> rx_uart_clear_errors,							-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
			rx_fifo_flush_req_o	=> rx_uart_reset,										-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
			
			-- TxFIFO
			tx_fifo_full_i 		=> tx_uart_fifo_full,								-- (MANDATORY) : tx-fifo full control signal
			tx_fifo_write_o 		=> tx_uart_fifo_write,								-- (MANDATORY) : tx-fifo write control signal
			tx_fifo_data_o 		=> tx_uart_fifo_data,								-- (MANDATORY) : tx-fifo data bus
			
		-------------------------------------------
		
		-------------------------------------------
		-- Wishbone Master interface
		-------------------------------------------
			-- WB syscon interface
			clk_i					=> clk_i,
			rst_i					=> rst_i,
			
			-- WB master interface
			wb_o 					=> wb_o,
			wb_i 					=> wb_i,
		-------------------------------------------
		
		-------------------------------------------
		-- Subscription-Group IRQ inputs
		-------------------------------------------
			sg_irq_i 			=> sg_irq_i
		-------------------------------------------		
		);
	-------------------------------------------------------------------
	
end structural;

