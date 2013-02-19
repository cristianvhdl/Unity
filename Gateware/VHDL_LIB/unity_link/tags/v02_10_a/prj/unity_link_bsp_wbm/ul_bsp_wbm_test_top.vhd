----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    09:13:34 11/23/2012 
-- Design Name: 
-- Module Name:    ul_bsp_wbm_test_top - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

library wishbone_v03_00_a;
use wishbone_v03_00_a.wb_classic_pkg.all;

entity ul_bsp_wbm_test_top is
	port (
		-- WB syscon interface
		clk_i					: in  std_logic;
		rst_i					: in  std_logic;
			
		-- RxFIFO
		rx_fifo_empty_i 		: in  std_logic;														-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_o 		: out std_logic;														-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_i 		: in  std_logic_vector (7 downto 0);							-- (MANDATORY) : rx-fifo data bus
		
		-- Rx error signals
		rx_err_i 				: in  std_logic_vector(2 downto 0);								-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 	: out std_logic;														-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o	: out std_logic;														-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 		: in  std_logic;														-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o 		: out std_logic;														-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 		: out std_logic_vector (7 downto 0)							-- (MANDATORY) : tx-fifo data bus	
	);
end ul_bsp_wbm_test_top;

architecture Behavioral of ul_bsp_wbm_test_top is

begin

	UL_bsp_wbm_inst : entity work.UL_bsp_wbm
		generic map(
			-- C_BSP_MODE					: integer range 0 to 1	 := 0;			-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
			-- Datalink Layer Configuration
			C_DL_FULL						=> 1,			-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
			C_DL_PL_RX_ERR_WIDTH			=> 3,			-- Number of rx error input lines from the physical layer		
			C_DL_CHECKSUM					=> 2,			-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT		
			-- Application Layer Configuration
			C_AL_RLC_EN						=> 1,			-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
			C_AL_RM_SIZE					=> 32,			-- 0: RM disabled, 1-255: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
			C_AL_PUB_MODE					=> 2,			-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
			C_AL_PUBLISH_BASE_FREQ		=> 1000,		-- Publish sync strobe base frequency [Hz]			
			C_AL_SUBMNGR_SGID_SIZE		=> 1,			-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
			C_AL_SUBGRP_RATE_BYTE_CNT 	=> 2, 			-- Number of bytes in the RATE register of each subscription group
			C_AL_SUBGRP_ADDR_WIDTH 		=> 4,			-- Size/depth of each subscription group = (2**C_AL_SUBGRP_ADDR_WIDTH) : RANGE=[4,8,16,32]		
			-- Wishbone Bus Interface (WB) Configuration
			C_WB_CLK_FREQ					=> 50000000,	-- WB clock frequency [Hz]
			C_WB_ADDR_WIDTH				=> 32,			-- WB bus address space/size
			C_WB_DATA_WIDTH				=> 32,			-- WN bus data width: [8,16,32]
			-- Memory instantiation Options
			C_PRE_SP6_MODE					=> 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled		
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
			rx_fifo_empty_i 		=> rx_fifo_empty_i,
			rx_fifo_read_o 		=> rx_fifo_read_o,
			rx_fifo_data_i 		=> rx_fifo_data_i,
			
			-- Rx error signals
			rx_err_i 				=> rx_err_i,
			rx_err_clr_o		 	=> rx_err_clr_o,
			rx_fifo_flush_req_o	=> rx_fifo_flush_req_o,
			
			-- TxFIFO
			tx_fifo_full_i 		=> tx_fifo_full_i,
			tx_fifo_write_o 		=> tx_fifo_write_o,
			tx_fifo_data_o 		=> tx_fifo_data_o,
			
		-------------------------------------------
		
		-------------------------------------------
		-- Wishbone Master interface
		-------------------------------------------
			-- WB syscon interface
			clk_i					=> clk_i,
			rst_i					=> rst_i,
			
			-- WB master interface
			wb_o 					=> open,
			wb_i					=> ((others=>'0'), '0', '0')
		-------------------------------------------		
		);

end Behavioral;

