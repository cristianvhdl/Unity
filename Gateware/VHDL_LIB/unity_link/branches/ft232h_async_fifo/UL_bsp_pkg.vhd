----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    14:47:20 22/11/2012
-- Design Name: 
-- Module Name:    UL_bsp_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib Unity-Link Byte-Stream-Protocol library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		22/11-2012	ANLAN 	File Created
-- 2.00.a	22/11-2012	ANLAN		First release
-- 2.50.a	30/11-2012	ANLAN		Component interfaces updated to support added interrupt-triggered publishing feature.
--				01/12-2012	ANLAN		Wishbone library updated to v03_50_a.
-- 3.00.a	
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
-----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.all;

library wishbone_v03_50_a;
use wishbone_v03_50_a.wb_classic_pkg.all;

package UL_bsp_pkg is

	-------------------------------------------------------------------------------
	-- UL_bsp_wbm.vhd
	--
	--		Unity-Link Byte-Stream-Protocol with Wishbone-Master interface
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------	
	component UL_bsp_wbm is
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
			C_WB_ADDR_WIDTH				: integer range 1 to 32  := 32;			-- WB bus address space/size
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
	end component;
	
	-------------------------------------------------------------------------------
	-- UL_bsp_wbm_uart.vhd
	--
	--		Unity-Link Byte-Stream-Protocol 
	--    with asynchronous UART and Wishbone-Master interface
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------		
	component UL_bsp_wbm_uart is
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
			C_WB_ADDR_WIDTH				: integer range 1 to 32  := 32;			-- WB bus address space/size
			C_WB_DATA_WIDTH				: integer range 8 to 32  := 32;			-- WN bus data width: [8,16,32]
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
	end component;	
	
end UL_bsp_pkg;

package body UL_bsp_pkg is
end UL_bsp_pkg;
