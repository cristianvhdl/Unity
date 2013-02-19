----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    12:59:42 21/09-2012 
-- Design Name: 
-- Module Name:    UL_bsp - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	 Unity-Link Byte-Stream-Protocol interface specification
--
-- Dependencies: 
--
--		Unity-HDL libraries:
--			- utility_v01_00_a
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

library utility_v01_00_a;
use utility_v01_00_a.util_pkg.all;
use utility_v01_00_a.log_pkg.all;

entity UL_bsp is
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
		-- BUS Independent Interface (BII) Configuration
		C_BII_CLK_FREQ					: positive					 := 50000000;	-- BII clock frequency [Hz]
		C_BII_ADDR_WIDTH				: integer range 1 to 32  := 32;			-- BII bus address space/size
		C_BII_DATA_WIDTH				: integer range 8 to 32  := 32;			-- BII bus data width: [8,16,32]
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
		rx_err_i 				: in  std_logic_vector(C_DL_PL_RX_ERR_WIDTH-1 downto 0);	-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 	: out std_logic;														-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o	: out std_logic;														-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 		: in  std_logic;														-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o 		: out std_logic;														-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 		: out std_logic_vector (7 downto 0);							-- (MANDATORY) : tx-fifo data bus
		
	-------------------------------------------
	
	-------------------------------------------
	-- Application-Layer <> User-Specific-Logic interface
	-------------------------------------------
	
		-- BUS Independent interface (BII)
		en_o					: out std_logic;														-- enable (keep high during a cycle/block)
		we_o					: out std_logic;														-- write enable: write=1, read=0 (must not change during a cycle/block)
		blk_o 				: out std_logic;														-- block mode: block=1, single=0
		nxt_o					: out std_logic;														-- has next (valid in block mode), set to 1 if current is not the last read/write in the block (update synchronous to clock when done=1)
		adr_o					: out std_logic_vector(C_BII_ADDR_WIDTH-1 downto 0);		-- address in	(clock synchronous update when done=1)
		dat_o					: out std_logic_vector(C_BII_DATA_WIDTH-1 downto 0);		-- data out (write) (update synchronous to clock when done=1)
		dat_i					: in  std_logic_vector(C_BII_DATA_WIDTH-1 downto 0);		-- data in (read)
		done_i				: in  std_logic;														-- done strobe	 (Success)
		err_i 				: in  std_logic														-- error strobe (Failure)	
		
	-------------------------------------------
	);
end UL_bsp;

architecture structural of UL_bsp is

	constant C_ADDR_BYTES : integer := byte_cnt(C_BII_ADDR_WIDTH);
	constant C_DATA_BYTES : integer := byte_cnt(C_BII_DATA_WIDTH);

	function max_inpacket_bytesize return integer is
		
		variable chks_bytes	: integer := 0;
		variable res			: integer := 0;		
		variable b				: integer := 0;
		
	begin
		if C_DL_CHECKSUM>0 then
			chks_bytes := 3;
		end if;
		
		-- max_sizeof(R)
		-- $R:[adr]]*[cs][cs]/n
		-- 4+C_ADDR_BYTES+C_CHKS_BYTES (no chks: min=5, max=8. with chks: min=8, max=11)
		b := 4+C_ADDR_BYTES+chks_bytes;
		res := max(b, res);
		
		-- max_sizeof(RM)
		-- $RM:[cnt]([adr]]))*[cs][cs]\n
		-- C_AL_RM_SIZE=0 -> 0
		-- C_AL_RM_SIZE>0 -> 6+C_CHKS_BYTES+C_ADDR_BYTES*C_AL_RM_SIZE (no chks: min=7, max=1026. with chks: min=10, max=1029)
		if C_AL_RM_SIZE>0 then
			b := 6+chks_bytes+C_ADDR_BYTES*C_AL_RM_SIZE;
			res := max(b, res);
		end if;
		
		-- max_sizeof(RSI)
		-- $RSI:[grp]*[cs][cs]\n
		-- C_AL_PUB_MODE=0 -> 0
		-- C_AL_PUB_MODE>0 -> 7+C_CHKS_BYTES (no chks: 7. with chks: 10)
		if C_AL_PUB_MODE>0 then
			b := 7+chks_bytes;
			res := max(b, res);
		end if;
		
		-- max_sizeof(W)
		-- $W:[add]][data]]*[cs][cs]\n
		-- 4+C_ADDR_BYTES+C_DATA_BYTES+C_CHKS_BYTES (no chks: min=6, max=12. with chks: min=9, max=15)
		b := 4+C_ADDR_BYTES+C_DATA_BYTES+chks_bytes;
		res := max(b, res);
		
		-- max_sizeof(WSR)
		-- $WSR:[grp][rate]]*[cs][cs]\n
		-- C_AL_PUB_MODE=0 -> 0
		-- C_AL_PUB_MODE>0 -> 7+C_AL_SUBGRP_RATE_BYTE_CNT+C_CHKS_BYTES (no chks: min=8, max=11. with chks: min=11, max=14)
		if C_AL_PUB_MODE>0 then
			b := 7+C_AL_SUBGRP_RATE_BYTE_CNT+chks_bytes;
			res := max(b, res);
		end if;
		
		-- max_sizeof: WSA
		-- $WSA:[grp][cnt]([adr]]))*[cs][cs]\n
		-- C_AL_PUB_MODE=0 -> 0
		-- C_AL_PUB_MODE>0 -> 7+(2**C_AL_SUBGRP_ADDR_WIDTH)*C_ADDR_BYTES+C_CHKS_BYTES (no chks: min=8, max=135. with chks: min=11, max=138)
		if C_AL_PUB_MODE>0 then
			b := 7+(2**C_AL_SUBGRP_ADDR_WIDTH)*C_ADDR_BYTES+chks_bytes;
			res := max(b, res);
		end if;
		
		-- max_sizeof: EPS
		-- $EPS*[cs][cs]\n
		-- C_AL_PUB_MODE=0 -> 0
		-- C_AL_PUB_MODE>0 -> 5+C_CHKS_BYTES | no chks: 8. with chks: 11
		
		-- max_sizeof: EPC
		-- $EPC*[cs][cs]\n
		-- C_AL_PUB_MODE=0 -> 0
		-- C_AL_PUB_MODE>0 -> 5+C_CHKS_BYTES | no chks: 8. with chks: 11

		-- max_sizeof: DPS
		-- $DPS*[cs][cs]\n
		-- C_AL_PUB_MODE=0 -> 0
		-- C_AL_PUB_MODE>0 -> 5+C_CHKS_BYTES | no chks: 8. with chks: 11		
		if C_AL_PUB_MODE>0 then
			b := 5+chks_bytes;
			res := max(b, res);
		end if;		
		
		return res;
	end max_inpacket_bytesize;
	
	constant C_DL_RXFIFO_ADDR_WIDTH : positive := log2c(max_inpacket_bytesize);

	-------------------------------------------
	-- Datalink-Layer <> Application-Layer interface
	-------------------------------------------
		-- RxFIFO
		signal dl_rx_fifo_empty_o			: std_logic;												-- (MANDATORY) : rx-fifo empty control signal
		signal dl_rx_fifo_read_i			: std_logic;												-- (MANDATORY) : rx-fifo read control signal
		signal dl_rx_fifo_data_o			: std_logic_vector(8 downto 0);						-- (MANDATORY) : rx-fifo data bus
			
		-- TxFIFO
		signal dl_tx_fifo_full_o			: std_logic;												-- (MANDATORY) : tx-fifo full control signal
		signal dl_tx_fifo_write_i			: std_logic;												-- (MANDATORY) : tx-fifo write control signal
		signal dl_tx_fifo_data_i			: std_logic_vector(8 downto 0);						-- (MANDATORY) : tx-fifo data bus
	-------------------------------------------

begin


	UL_bsp_dl_inst : entity work.UL_bsp_dl
	generic map (
		-- C_DL_BSP_MODE				=> C_BSP_MODE,										-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
		-- Datalink Layer Configuration
		C_FULL_DL						=> C_DL_FULL,										-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
		C_PL_RX_ERR_WIDTH				=> C_DL_PL_RX_ERR_WIDTH,						-- Number of rx error input lines from the physical layer				
		C_CHECKSUM						=> C_DL_CHECKSUM,									-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT
		C_RXFIFO_ADDR_WIDTH 			=> C_DL_RXFIFO_ADDR_WIDTH,						-- Must be able hold the largest incoming request packet
		C_TXFIFO_A_ADDR_WIDTH 		=> 4,													-- FIFO receiving response/publish data from the application layer
		C_TXFIFO_B_ADDR_WIDTH 		=> 2,													-- FIFO receiving error data from the datalink layer RxFSM				
		-- Memory instantiation Options
		C_PRE_SP6_MODE					=> C_PRE_SP6_MODE									-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled		
	)
	port map ( 
		clk_i 					=> clk_i,													-- BUS clock signal
		reset_i					=> reset_i,													-- General (synchronous) reset signal

	-------------------------------------------
	-- Physical-Layer <> Datalink-Layer interface
	-- ----------------------------------------
	-- The physical-layer must implement two FIFOs:
	--
	-- RxFIFO : used by the physical-layer to store incoming messages from an external device (e.g. PC)
	-- TxFIFO : used by the physical-layer to read messages (from the datalink-layer) to be sent to an external device (e.g. PC)
	-------------------------------------------
		
		-- RxFIFO
		rx_fifo_empty_i 		=> rx_fifo_empty_i,										-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_o 		=> rx_fifo_read_o,										-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_i 		=> rx_fifo_data_i,										-- (MANDATORY) : rx-fifo data bus
		
		-- Rx error signals
		rx_err_i 				=> rx_err_i,												-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 	=> rx_err_clr_o,											-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o	=> rx_fifo_flush_req_o,									-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 		=> tx_fifo_full_i,										-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o 		=> tx_fifo_write_o,										-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 		=> tx_fifo_data_o,										-- (MANDATORY) : tx-fifo data bus
	-------------------------------------------
	
	-------------------------------------------
	-- Datalink-Layer <> Application-Layer interface
	-------------------------------------------
		-- RxFIFO
		rx_fifo_empty_o			=> dl_rx_fifo_empty_o,								-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_i				=> dl_rx_fifo_read_i,								-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_o				=> dl_rx_fifo_data_o,								-- (MANDATORY) : rx-fifo data bus
		
		-- TxFIFO
		tx_fifo_full_o				=> dl_tx_fifo_full_o,								-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_i			=> dl_tx_fifo_write_i,								-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_i				=> dl_tx_fifo_data_i									-- (MANDATORY) : tx-fifo data bus
	-------------------------------------------
	);


	UL_bsp_al_inst : entity work.UL_bsp_al
	generic map (
		-- C_AL_BSP_MODE				=> C_BSP_MODE,									-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
		C_AL_RLC_EN						=> C_AL_RLC_EN,								-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
		C_AL_RM_SIZE					=> C_AL_RM_SIZE,								-- 0: RM disabled, 1: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
		C_AL_PUB_MODE					=> C_AL_PUB_MODE,								-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
		C_AL_PUBLISH_BASE_FREQ		=> C_AL_PUBLISH_BASE_FREQ,					-- Publish sync strobe base frequency [Hz]		
		C_AL_SUBMNGR_SGID_SIZE		=> C_AL_SUBMNGR_SGID_SIZE,					-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
		C_AL_SUBGRP_RATE_BYTE_CNT 	=> C_AL_SUBGRP_RATE_BYTE_CNT, 			-- Number of bytes in the RATE register of each subscription group
		C_AL_SUBGRP_ADDR_WIDTH 		=> C_AL_SUBGRP_ADDR_WIDTH,					-- Size/depth of each subscription group = (2**C_SG_ADDR_WIDTH) : RANGE=[4,8,16,32]		
		C_BII_CLK_FREQ					=> C_BII_CLK_FREQ,							-- BII clock frequency [Hz]
		C_BII_ADDR_WIDTH				=> C_BII_ADDR_WIDTH,							-- BII bus address space/size
		C_BII_DATA_WIDTH				=> C_BII_DATA_WIDTH							-- BII bus data width: [8,16,32]
	)
	port map ( 
	
		clk_i 				=> clk_i,													-- BUS clock signal
		reset_i				=> reset_i,													-- General (synchronous) reset signal
		
	-------------------------------------------
	-- Application-Layer <> Datalink-Layer interface
	-------------------------------------------
	
		-- RxFIFO
		rx_fifo_empty_i 	=> dl_rx_fifo_empty_o,									-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_o		=> dl_rx_fifo_read_i,									-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_i 	=> dl_rx_fifo_data_o,									-- (MANDATORY) : rx-fifo data bus
		
		-- TxFIFO
		tx_fifo_full_i 	=> dl_tx_fifo_full_o,									-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o	=> dl_tx_fifo_write_i,									-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 	=> dl_tx_fifo_data_i,									-- (MANDATORY) : tx-fifo data bus
		
	-------------------------------------------	
	
	-------------------------------------------
	-- Application-Layer <> User-Specific-Logic interface
	-------------------------------------------
	
		-- BUS Independent interface (BII)
		en_o		=> en_o,																	-- enable (keep high during a cycle/block)
		we_o		=> we_o,																	-- write enable: write=1, read=0 (must not change during a cycle/block)
		blk_o 	=> blk_o,																-- block mode: block=1, single=0
		nxt_o		=> nxt_o,																-- has next (valid in block mode), set to 1 if current is not the last read/write in the block (update synchronous to clock when done=1)
		adr_o		=> adr_o,																-- address in	(clock synchronous update when done=1)
		dat_o		=> dat_o,																-- data out (write) (update synchronous to clock when done=1)
		dat_i		=> dat_i,																-- data in (read)
		done_i	=> done_i,																-- done strobe	 (Success)		
		err_i 	=> err_i																	-- error strobe (Failure)
		
	-------------------------------------------		
	);

end structural;

