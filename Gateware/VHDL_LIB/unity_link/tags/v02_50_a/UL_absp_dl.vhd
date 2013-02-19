----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    12:30:26 28/12/2011 
-- Design Name: 	 
-- Module Name:    UL_absp_dl - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 	 Unity-Link ASCII Byte Stream Protocol Datalink-Layer
--
-- Dependencies:
--
--		Unity-HDL libraries:
--			- dual_fifo_mux_v01_00_b
--			- fifo_v01_00_a
--			- registers_v01_00_a
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		28/12-2011	ANLAN		File Created
-- 0.02		12/01-2012	ANLAN		C_UART_PARITY generic changed to C_UART_PARITY_EN
-- 0.03  	23/01-2012  ANLAN    C_FULL_DL generic and logic added to enable 
--                            	FULL / LITE version of the Datalink Layer.
-- 0.04		01/05-2012	ANLAN		filename changed to uart_gab_link_dl
-- 0.05		20/09-2012	ANLAN		filename changed to uart_unity_link_dl
-- 0.06		21/09-2012	ANLAN		filename changed to UL_absp_dl (Unity-Link ASCII Byte Stream Protocol Datalink-Layer)
--											UART specific functionality replaced with generic functionality
-- 0.07 		26/09-2012 	ANLAN 	Licensing info added to header, library module dependencies added
-- 0.08		22/11-2012	ANLAN		C_PRE_SP6_MODE	generic added, 
--											module updated to use:
--												- dual_fifo_mux_pkg v02_00_a
--												- registers_pkg v02_00_a
--												- fifo_pkg v02_10_b
-- 0.09		22/11-2012	ANLAN		rx_err_i input in Datalink RxFSM (Lite) connected to empty vector ""
-- 0.10		
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

library dual_fifo_mux_v02_00_a;
use dual_fifo_mux_v02_00_a.dual_fifo_mux_pkg.all;

library fifo_v02_10_b;
use fifo_v02_10_b.fifo_pkg.all;

library registers_v02_00_a;
use registers_v02_00_a.registers_pkg.all;

entity UL_absp_dl is
	generic (
		C_FULL_DL					: integer range 0 to 1	:= 1;		-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
		C_PL_RX_ERR_WIDTH			: integer range 0 to	3	:= 3;		-- Number of rx error input lines from the physical layer
		C_RXFIFO_ADDR_WIDTH 		: positive 					:= 7;		-- Must be able hold the largest incoming request packet
		C_TXFIFO_A_ADDR_WIDTH 	: positive 					:= 8;		-- FIFO receiving response/publish data from the application layer
		C_TXFIFO_B_ADDR_WIDTH 	: positive 					:= 4;		-- FIFO receiving error data from the datalink layer RxFSM
		C_CHECKSUM					: integer range 0 to 2  := 2;		-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT
		-- Memory instantiation Options
		C_PRE_SP6_MODE				: natural range 0 to 1 	:= 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
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
		rx_fifo_empty_i 			: in  std_logic;
		rx_fifo_read_o 			: out std_logic;
		rx_fifo_data_i 			: in  std_logic_vector (7 downto 0);
		
		-- Rx error signals
		rx_err_i 					: in  std_logic_vector(C_PL_RX_ERR_WIDTH-1 downto 0);	-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 		: out std_logic;													-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o		: out std_logic;													-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 			: in  std_logic;
		tx_fifo_write_o 			: out std_logic;
		tx_fifo_data_o 			: out std_logic_vector (7 downto 0);
	
	-------------------------------------------
	
	-------------------------------------------
	-- Datalink-Layer <> Application-Layer interface
	-------------------------------------------
	
		-- RxFIFO
		rx_fifo_empty_o			: out std_logic;
		rx_fifo_rd_i				: in  std_logic;
		rx_fifo_data_o				: out std_logic_vector(8 downto 0);
		
		-- TxFIFO
		tx_fifo_full_o				: out std_logic;
		tx_fifo_wr_i				: in  std_logic;
		tx_fifo_data_i				: in  std_logic_vector(8 downto 0)
	
	-------------------------------------------
	);
end UL_absp_dl;

architecture structural of UL_absp_dl is
	
	-- RX FIFO <> ASCII Decoder signals
	signal rx_fifo_datavalid_i : std_logic;
	
	-- ASCII Decoder <> RxFSM signals
	signal ascii_dec_rst : std_logic;
	signal rx_bin_vld 	: std_logic;
	signal rx_bin_pc	 	: std_logic;
	signal rx_bin_ac	 	: std_logic;
	signal rx_bin_ad	 	: std_logic;
	signal rx_bin_data 	: std_logic_vector(7 downto 0);
	signal rx_bin_rd 		: std_logic;
	signal clr_err			: std_logic;
	signal st_rd_ac		: std_logic;
	signal st_rd_ad		: std_logic;
	signal err_invd 		: std_logic;
	signal err_mdb 		: std_logic;

	-- RxFSM <> Dual FIFO FSM signals
	signal flush_rx_fifo			: std_logic;
	signal rxfifo_in_sel 		: std_logic;
	signal rxfifo_in_wr 			: std_logic;
	signal rxfifo_in_data_in	: std_logic_vector(8 downto 0);
	signal rxfifo_in_reset 		: std_logic;
	signal rxfifo_in_full 		: std_logic;
	signal rxfifo_out_sel 		: std_logic;
	signal rxfifo_out_empty 	: std_logic;
	
	-- RxFSM <> TxFIFO B signals
	signal txfifo_b_wr		: std_logic;
	signal txfifo_b_data_in	: std_logic_vector(7 downto 0);
	signal txfifo_b_full		: std_logic;	

	-- TxFIFO A <> TxFSM signals
	signal txfifo_a_rd 			: std_logic;
	signal txfifo_a_data_out 	: std_logic_vector(8 downto 0);
	signal txfifo_a_empty 		: std_logic;
	
	-- TxFIFO B <> TxFSM signals
	signal txfifo_b_rd 			: std_logic;
	signal txfifo_b_data_out 	: std_logic_vector(7 downto 0);
	signal txfifo_b_empty 		: std_logic;
	
	-- TxFSM <> ASCII encoder
	signal tx_bin_vld 			: std_logic;
	signal tx_bin_rd 				: std_logic;
	signal tx_bin_cmd 			: std_logic;
	signal tx_bin_data 			: std_logic_vector(7 downto 0);

	-- ASCII encoder <> TX FIFO signals
	signal tx_ascii_vld : std_logic;
	signal tx_ascii_rd : std_logic;

begin
	
	---------------------------------------------------
	-- RX line
	---------------------------------------------------
		rx_fifo_datavalid_i <= not rx_fifo_empty_i;
		ascii_dec_rst <= reset_i or flush_rx_fifo;	-- reset ascii decoder when flushing rx fifo's
	
		-- ASCII decoder
		UL_absp_dl_dec_inst : entity work.UL_absp_dl_dec
			port map ( 
				clk_i				=> clk_i,
				reset_i			=> ascii_dec_rst,

				ascii_vld_i		=> rx_fifo_datavalid_i,		-- ascii data valid
				ascii_rd_o		=> rx_fifo_read_o,			-- read
				ascii_i			=> rx_fifo_data_i,			-- ascii data
						
				bin_vld_o		=> rx_bin_vld,		-- data valid
				bin_pc_o			=> rx_bin_pc,		-- packet command
				bin_ac_o			=> rx_bin_ac,		-- application command
				bin_ad_o			=> rx_bin_ad,		-- application data
				bin_o 			=> rx_bin_data,	-- bin data
				bin_rd_i			=> rx_bin_rd,		-- read data
				st_rd_ac_i		=> st_rd_ac,
				st_rd_ad_i		=> st_rd_ad,
				clr_err_i		=> clr_err,			-- Clear errors (necesarry for receiving additional data)
				err_invd_o		=> err_invd,		-- Error: invalid data
				err_mdb_o		=> err_mdb			-- Error: missing data byte (ascii) / nibble (bin)
				);			
		
		FULL_DL_RX_GEN:
		IF C_FULL_DL=1 GENERATE
			
			-- Rx FSM		
			UL_absp_dl_rx_fsm_inst : entity work.UL_absp_dl_rx_fsm(full)
				generic map (
					C_PL_RX_ERR_WIDTH		=> C_PL_RX_ERR_WIDTH,
					C_CHECKSUM				=> C_CHECKSUM
				)
				port map ( 
					clk_i 					=> clk_i,
					reset_i 					=> reset_i,
					
					-- RxFIFO interface		
					rx_err_i 				=> rx_err_i,
					clear_errors_o			=> rx_err_clr_o,
					flush_rx_fifo_o		=> flush_rx_fifo,
					
					-- ASCII Decoder interface
					bin_vld_i 				=> rx_bin_vld,
					bin_pc_i					=> rx_bin_pc,
					bin_ac_i					=> rx_bin_ac,
					bin_ad_i					=> rx_bin_ad,
					bin_data_i 				=> rx_bin_data,
					bin_rd_o 				=> rx_bin_rd,
					st_rd_ac_o				=> st_rd_ac,
					st_rd_ad_o				=> st_rd_ad,
					clr_err_o				=> clr_err,
					err_invd_i 				=> err_invd,
					err_mdb_i 				=> err_mdb,
					
					-- Dual FIFO MUX interface
					rxfifo_in_sel_o 		=> rxfifo_in_sel,
					rxfifo_in_wr_o 		=> rxfifo_in_wr,
					rxfifo_in_data_in_o 	=> rxfifo_in_data_in,
					rxfifo_in_reset_o 	=> rxfifo_in_reset,
					rxfifo_in_full_i 		=> rxfifo_in_full,
					
					rxfifo_out_sel_o 		=> rxfifo_out_sel,
					rxfifo_out_empty_i 	=> rxfifo_out_empty,
					
					-- TxFIFO B interface
					txfifo_b_wr_o 			=> txfifo_b_wr,
					txfifo_b_data_in_o 	=> txfifo_b_data_in,
					txfifo_b_full_i 		=> txfifo_b_full
					);
					
					rx_fifo_flush_req_o <= flush_rx_fifo;
						
			-- DUAL FIFO Mux
			dual_rxfifo_mux_inst : dual_fifo_mux
				generic map (	
					C_ADDR_WIDTH		=> C_RXFIFO_ADDR_WIDTH,	-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
					C_DATA_WIDTH		=> 9,							-- Data width
					C_CLOCK_MODE		=> 0,    					-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
					C_SYNC_DEPTH		=> 2,							-- Synchronizer depth (asynch mode only)		
					C_PRE_LOAD			=> 0,							-- Write<>Read Ptr offset before deasserting empty signal (read logic)
					C_EN_WRT_ACK		=> 0,  						-- Write acknowledge; 0 -> disabled, 1 -> enabled
					C_READ_MODE			=> 1,							-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
					C_PRE_SP6_MODE		=> C_PRE_SP6_MODE,		-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
					C_RAMSTYLE			=> "AUTO"					-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)							
					)
				port map ( 
					-- Common clock input
					clk_i 				=> clk_i,					-- use this if C_CLOCK_MODE=0, else connect to '0'
					
					-- Common inputs
					reset_i 				=> reset_i,
					sel_in_fifo_i		=> rxfifo_in_sel,
					sel_out_fifo_i 	=> rxfifo_out_sel,
					
					-- fifo input domain
					clkw_asynch_i		=> '0',						-- use this if C_CLOCK_MODE=1, else connect to '0'
					fifo_wr_i 			=> rxfifo_in_wr,
					fifo_data_in_i		=> rxfifo_in_data_in,
					fifo_reset_i 		=> rxfifo_in_reset,
					fifo_wr_ack_o 		=> open,
					fifo_full_o 		=> rxfifo_in_full,
					
					-- fifo output domain
					clkr_asynch_i		=> '0',						-- use this if C_CLOCK_MODE=1, else connect to '0'
					fifo_rd_i 			=> rx_fifo_rd_i,
					fifo_data_out_o 	=> rx_fifo_data_o,
					fifo_empty_o 		=> rxfifo_out_empty
					);
			
				rx_fifo_empty_o <= rxfifo_out_empty;					
		END GENERATE;
		
		LITE_DL_RX_GEN:
		IF C_FULL_DL=0 GENERATE
			
			-- Rx FSM		
			UL_absp_dl_rx_fsm_inst : entity work.UL_absp_dl_rx_fsm(lite)
				generic map (
					C_PL_RX_ERR_WIDTH		=> 0,
					C_CHECKSUM				=> 0
				)
				port map ( 
					clk_i 					=> clk_i,
					reset_i 					=> reset_i,
					
					-- RxFIFO interface		
					rx_err_i 				=> "",
					clear_errors_o			=> rx_err_clr_o,
					flush_rx_fifo_o		=> flush_rx_fifo,
					
					-- ASCII Decoder interface
					bin_vld_i 				=> rx_bin_vld,
					bin_pc_i					=> rx_bin_pc,
					bin_ac_i					=> rx_bin_ac,
					bin_ad_i					=> rx_bin_ad,
					bin_data_i 				=> rx_bin_data,
					bin_rd_o 				=> rx_bin_rd,
					st_rd_ac_o				=> st_rd_ac,
					st_rd_ad_o				=> st_rd_ad,
					clr_err_o				=> clr_err,
					err_invd_i 				=> err_invd,
					err_mdb_i 				=> err_mdb,
					
					-- Dual FIFO MUX interface
					rxfifo_in_sel_o 		=> rxfifo_in_sel,
					rxfifo_in_wr_o 		=> rxfifo_in_wr,
					rxfifo_in_data_in_o 	=> rxfifo_in_data_in,
					rxfifo_in_reset_o 	=> rxfifo_in_reset,
					rxfifo_in_full_i 		=> rxfifo_in_full,
					
					rxfifo_out_sel_o 		=> rxfifo_out_sel,
					rxfifo_out_empty_i 	=> rxfifo_out_empty,
					
					-- TxFIFO B interface
					txfifo_b_wr_o 			=> txfifo_b_wr,
					txfifo_b_data_in_o 	=> txfifo_b_data_in,
					txfifo_b_full_i 		=> txfifo_b_full
					);
					
					rx_fifo_flush_req_o <= flush_rx_fifo;
					
				-- FIFO_Reg				
				fifo_reg_rx_inst : fifo_reg
					generic map(
						C_DATA_WIDTH		=> 9
					)
					port map( 
						clk_i					=> clk_i,
						reset_i				=> reset_i,
						wr_i 					=> rxfifo_in_wr,
						data_i 				=> rxfifo_in_data_in,
						full_o 				=> rxfifo_in_full,
						rd_i 					=> rx_fifo_rd_i,
						data_o 				=> rx_fifo_data_o,
						empty_o 				=> rxfifo_out_empty
						);				
				
					rx_fifo_empty_o <= rxfifo_out_empty;				
				
		END GENERATE;
			
	---------------------------------------------------
	
	---------------------------------------------------
	-- TX line
	---------------------------------------------------

		FULL_DL_TX_GEN:
		IF C_FULL_DL=1 GENERATE
			
			-- TxFIFO A
			txfifo_a_inst : fifo
				generic map (	
					ADDR_WIDTH		=> C_TXFIFO_A_ADDR_WIDTH,	-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
					DATA_WIDTH		=> 9,								-- Data width					
					CLOCK_MODE		=> 0,    						-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
					SYNC_DEPTH		=> 2,								-- Synchronizer depth (asynch mode only)
					PRE_LOAD			=> 0,								-- Write<>Read Ptr offset before deasserting empty signal (read logic)
					EN_WRT_ACK		=> 0,  							-- Write acknowledge; 0 -> disabled, 1 -> enabled									
					READ_MODE		=> 1,								-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
					PRE_SP6_MODE	=> C_PRE_SP6_MODE,			-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
					RAMSTYLE			=> "AUTO"						-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)					
				)
				port map (
					-- Common clock input
					clk_i				=> clk_i,						-- use this if CLOCK_MODE=0, else connect to '0'
					-- Input clock domain
					clkw_asynch_i	=> '0',							-- use this if CLOCK_MODE=1, else connect to '0'
					wr_i				=> tx_fifo_wr_i,
					data_in_i 		=> tx_fifo_data_i,
					wr_ack_o 		=> open,
					full_o			=> tx_fifo_full_o,
					-- Output clock domain
					clkr_asynch_i	=> '0',							-- use this if CLOCK_MODE=1, else connect to '0'
					rd_i				=> txfifo_a_rd,
					data_out_o 		=> txfifo_a_data_out,
					empty_o			=> txfifo_a_empty,
					-- Common inputs
					reset_i 			=> reset_i
				);
			
			-- TxFIFO B
			txfifo_b_inst : fifo
				generic map (	
					ADDR_WIDTH		=> C_TXFIFO_B_ADDR_WIDTH,	-- Reg file address width / Fifo depth
					DATA_WIDTH		=> 8,								-- Data width
					CLOCK_MODE		=> 0,    						-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
					SYNC_DEPTH		=> 2,								-- Synchronizer depth (asynch mode only)
					PRE_LOAD			=> 0,								-- Write<>Read Ptr offset before deasserting empty signal (read logic)
					EN_WRT_ACK		=> 0,  							-- Write acknowledge; 0 -> disabled, 1 -> enabled									
					READ_MODE		=> 1,								-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
					PRE_SP6_MODE	=> C_PRE_SP6_MODE,			-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
					RAMSTYLE			=> "AUTO"						-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)			
				)
				port map (
					-- Common clock input
					clk_i				=> clk_i,						-- use this if CLOCK_MODE=0, else connect to '0'
					-- Input clock domain
					clkw_asynch_i	=> '0',							-- use this if CLOCK_MODE=1, else connect to '0'
					wr_i				=> txfifo_b_wr,
					data_in_i 		=> txfifo_b_data_in,
					wr_ack_o 		=> open,
					full_o			=> txfifo_b_full,
					-- Output clock domain
					clkr_asynch_i	=> '0',							-- use this if CLOCK_MODE=1, else connect to '0'
					rd_i				=> txfifo_b_rd,
					data_out_o 		=> txfifo_b_data_out,
					empty_o			=> txfifo_b_empty,
					-- Common inputs
					reset_i 			=> reset_i
				);
					
		END GENERATE;
		
		LITE_DL_TX_GEN:
		IF C_FULL_DL=0 GENERATE
			
			-- TxFIFO A
			fifo_reg_txa_inst : fifo_reg
				generic map(
					C_DATA_WIDTH		=> 9
				)
				port map( 
					clk_i					=> clk_i,
					reset_i				=> reset_i,
					wr_i 					=> tx_fifo_wr_i,
					data_i 				=> tx_fifo_data_i,
					full_o 				=> tx_fifo_full_o,
					rd_i 					=> txfifo_a_rd,
					data_o 				=> txfifo_a_data_out,
					empty_o 				=> txfifo_a_empty
					);					
			
			-- TxFIFO B			
			fifo_reg_txb_inst : fifo_reg
				generic map(
					C_DATA_WIDTH		=> 8
				)
				port map( 
					clk_i					=> clk_i,
					reset_i				=> reset_i,
					wr_i 					=> txfifo_b_wr,
					data_i 				=> txfifo_b_data_in,
					full_o 				=> txfifo_b_full,
					rd_i 					=> txfifo_b_rd,
					data_o 				=> txfifo_b_data_out,
					empty_o 				=> txfifo_b_empty
					);						
					
		END GENERATE;		
		
		-- Tx FSM
		UL_absp_DL_tx_fsm_inst : entity work.UL_absp_DL_tx_fsm
			generic map (
				C_CHECKSUM				=> C_CHECKSUM
			)		
			port map ( 
				clk_i 					=> clk_i,
				reset_i 					=> reset_i,
				
				-- TxFIFO A interface
				txfifo_a_rd_o 			=> txfifo_a_rd,
				txfifo_a_data_out_i 	=> txfifo_a_data_out,
				txfifo_a_empty_i 		=> txfifo_a_empty,
				
				-- TxFIFO B interface
				txfifo_b_rd_o 			=> txfifo_b_rd,
				txfifo_b_data_out_i 	=> txfifo_b_data_out,
				txfifo_b_empty_i 		=> txfifo_b_empty,
				
				-- ASCII encoder interface
				bin_vld_o 				=> tx_bin_vld,
				bin_rd_i 				=> tx_bin_rd,
				bin_cmd_o 				=> tx_bin_cmd,
				bin_data_o 				=> tx_bin_data
				);

		-- ASCII encoder
		UL_absp_dl_enc_inst : entity work.UL_absp_dl_enc
			port map ( 
				clk_i				=> clk_i,
				reset_i			=> reset_i,
						
				bin_vld_i		=> tx_bin_vld,		-- bin data valid
				bin_rd_o			=> tx_bin_rd,		-- read
				bin_cmd_i		=> tx_bin_cmd,		-- command/data
				bin_i 			=> tx_bin_data,	-- bin data
									
				ascii_vld_o		=> tx_ascii_vld,		-- data valid
				ascii_o			=> tx_fifo_data_o,	-- ascii data
				ascii_rd_i		=> tx_ascii_rd	   	-- read data
				);	
		
		tx_ascii_rd <= '1' when tx_ascii_vld='1' and tx_fifo_full_i='0' else '0';
		
		tx_fifo_write_o <= tx_ascii_rd;
	---------------------------------------------------
	
end structural;

