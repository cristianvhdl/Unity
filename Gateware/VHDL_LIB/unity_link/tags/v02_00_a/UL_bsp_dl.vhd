----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    13:06:26 21/09-2012 
-- Design Name: 
-- Module Name:    UL_bsp_dl - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	 Unity-Link Byte-Stream-Protocol Datalink-Layer interface specification
--
-- Dependencies: 
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		21/09-2012	ANLAN		File Created
-- 0.02		26/09-2012 	ANLAN 	Licensing info added to header, library module dependencies added
-- 0.03			 
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

entity UL_bsp_dl is
	generic (
		-- C_DL_BSP_MODE				: integer range 0 to 1	 := 0;			-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
		-- Datalink Layer Configuration
		C_FULL_DL						: integer range 0 to 1	:= 1;				-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
		C_PL_RX_ERR_WIDTH				: integer range 0 to	10	:= 3;				-- Number of rx error input lines from the physical layer
		C_RXFIFO_ADDR_WIDTH 			: positive 					:= 7;				-- Must be able hold the largest incoming request packet
		C_TXFIFO_A_ADDR_WIDTH 		: positive 					:= 8;				-- FIFO receiving response/publish data from the application layer
		C_TXFIFO_B_ADDR_WIDTH 		: positive 					:= 4;				-- FIFO receiving error data from the datalink layer RxFSM
		C_CHECKSUM						: integer range 0 to 2  := 2;				-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT
		-- Memory instantiation Options
		C_PRE_SP6_MODE					: natural range 0 to 1 	:= 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled		
	);
	port (
	
		clk_i 				: in  std_logic;														-- BUS clock signal
		reset_i				: in  std_logic;														-- General (synchronous) reset signal

	-------------------------------------------
	-- Physical-Layer <> Datalink-Layer interface
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
		rx_err_i 				: in  std_logic_vector(C_PL_RX_ERR_WIDTH-1 downto 0);		-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 	: out std_logic;														-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o	: out std_logic;														-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 		: in  std_logic;														-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o 		: out std_logic;														-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 		: out std_logic_vector (7 downto 0);							-- (MANDATORY) : tx-fifo data bus
		
	-------------------------------------------
	
	-------------------------------------------
	-- Datalink-Layer <> Application-Layer interface
	-------------------------------------------
	
		-- RxFIFO
		rx_fifo_empty_o			: out std_logic;												-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_i				: in  std_logic;												-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_o				: out std_logic_vector(8 downto 0);						-- (MANDATORY) : rx-fifo data bus
		
		-- TxFIFO
		tx_fifo_full_o				: out std_logic;												-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_i			: in  std_logic;												-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_i				: in  std_logic_vector(8 downto 0)						-- (MANDATORY) : tx-fifo data bus
		
	-------------------------------------------
	);
end UL_bsp_dl;

architecture structural of UL_bsp_dl is

begin


	UL_absp_dl_inst : entity work.UL_absp_dl
		generic map(
			C_FULL_DL					=> C_FULL_DL,						-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
			C_PL_RX_ERR_WIDTH			=> C_PL_RX_ERR_WIDTH,			-- Number of rx error input lines from the physical layer
			C_RXFIFO_ADDR_WIDTH 		=> C_RXFIFO_ADDR_WIDTH,			-- Must be able hold the largest incoming request packet
			C_TXFIFO_A_ADDR_WIDTH 	=> C_TXFIFO_A_ADDR_WIDTH,		-- FIFO receiving response/publish data from the application layer
			C_TXFIFO_B_ADDR_WIDTH 	=> C_TXFIFO_B_ADDR_WIDTH,		-- FIFO receiving error data from the datalink layer RxFSM
			C_CHECKSUM					=> C_CHECKSUM,						-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT
			-- Memory instantiation Options
			C_PRE_SP6_MODE				=> C_PRE_SP6_MODE					-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
		)
		port map( 
		
			clk_i 				=> clk_i,														-- BUS clock signal
			reset_i				=> reset_i,														-- General (synchronous) reset signal

		-------------------------------------------
		-- Physical-Layer <> Datalink-Layer interface
		-- ----------------------------------------
		-- The physical-layer must implement two FIFOs:
		--
		-- RxFIFO : used by the physical-layer to store incoming messages from an external device (e.g. PC)
		-- TxFIFO : used by the physical-layer to read messages (from the datalink-layer) to be sent to an external device (e.g. PC)
		-------------------------------------------
			
			-- RxFIFO
			rx_fifo_empty_i 			=> rx_fifo_empty_i,
			rx_fifo_read_o 			=> rx_fifo_read_o,
			rx_fifo_data_i 			=> rx_fifo_data_i,
			
			-- Rx error signals
			rx_err_i 					=> rx_err_i,														-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
			rx_err_clr_o		 		=> rx_err_clr_o,													-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
			rx_fifo_flush_req_o		=> rx_fifo_flush_req_o,											-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
			
			-- TxFIFO
			tx_fifo_full_i 			=> tx_fifo_full_i,
			tx_fifo_write_o 			=> tx_fifo_write_o,
			tx_fifo_data_o 			=> tx_fifo_data_o,
		
		-------------------------------------------
		
		-------------------------------------------
		-- Datalink-Layer <> Application-Layer interface
		-------------------------------------------
		
			-- RxFIFO
			rx_fifo_empty_o			=> rx_fifo_empty_o,
			rx_fifo_rd_i				=> rx_fifo_read_i,
			rx_fifo_data_o				=> rx_fifo_data_o,
			
			-- TxFIFO
			tx_fifo_full_o				=> tx_fifo_full_o,
			tx_fifo_wr_i				=> tx_fifo_write_i,
			tx_fifo_data_i				=> tx_fifo_data_i
		
		-------------------------------------------
		);


end structural;
