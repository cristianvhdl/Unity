----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    13:08:21 21/09-2012 
-- Design Name: 
-- Module Name:    UL_bsp_al - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	 Unity-Link Byte-Stream-Protocol Application-Layer interface specification
--
-- Dependencies: 
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		21/09-2012	ANLAN		File Created
-- 0.02		26/09-2012 	ANLAN 	Licensing info added to header, library module dependencies added
-- 0.03		28/11-2012	ANLAN	Comments updated about address aliasing
-- 0.04
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

entity UL_bsp_al is
	generic (
		-- C_AL_BSP_MODE				: integer range 0 to 1	 := 0;				-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
		C_AL_RLC_EN						: integer range 0 to 1	 := 1;				-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
		C_AL_RM_SIZE					: integer range 0 to 255 := 32;				-- 0: RM disabled, 1: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
		
		C_AL_PUB_MODE					: integer range 0 to 2 	 := 2;				-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests
		
		C_AL_PUBLISH_BASE_FREQ		: positive					 := 1000;			-- Publish sync strobe base frequency [Hz]		
		C_AL_SUBMNGR_SGID_SIZE		: integer range 0 to 4   := 1;				-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
		C_AL_SUBGRP_RATE_BYTE_CNT 	: integer range 1 to 4 	 := 2; 				-- Number of bytes in the RATE register of each subscription group
		C_AL_SUBGRP_ADDR_WIDTH 		: integer range 2 to 5	 := 4;				-- Size/depth of each subscription group = (2**C_SG_ADDR_WIDTH) : RANGE=[4,8,16,32]
		
		C_BII_CLK_FREQ					: positive					 := 50000000;		-- BII clock frequency [Hz]
		C_BII_ADDR_WIDTH				: integer range 1 to 32  := 32;				-- BII bus address space/size, N.B. avoid aliasing use [8,16,24,32], see comment 1
		C_BII_DATA_WIDTH				: integer range 8 to 32  := 32				-- BII bus data width: [8,16,32]
	);
	port ( 
	
		clk_i 				: in  std_logic;												-- BUS clock signal
		reset_i				: in  std_logic;												-- General (synchronous) reset signal
		
	-------------------------------------------
	-- Application-Layer <> Datalink-Layer interface
	-------------------------------------------
	
		-- RxFIFO
		rx_fifo_empty_i 	: in  std_logic;												-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_o		: out std_logic;												-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_i 	: in  std_logic_vector (8 downto 0);					-- (MANDATORY) : rx-fifo data bus
		
		-- TxFIFO
		tx_fifo_full_i 	: in  std_logic;												-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o	: out std_logic;												-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 	: out std_logic_vector (8 downto 0);					-- (MANDATORY) : tx-fifo data bus
		
	-------------------------------------------		
	
	-------------------------------------------
	-- Application-Layer <> User-Specific-Logic interface
	-------------------------------------------
	
		-- BUS Independent interface (BII)
		en_o	: out std_logic;																-- enable (keep high during a cycle/block)
		we_o	: out std_logic;																-- write enable: write=1, read=0 (must not change during a cycle/block)
		blk_o : out std_logic;																-- block mode: block=1, single=0
		nxt_o	: out std_logic;																-- has next (valid in block mode), set to 1 if current is not the last read/write in the block (update synchronous to clock when done=1)
		adr_o	: out std_logic_vector(C_BII_ADDR_WIDTH-1 downto 0);				-- address in	(clock synchronous update when done=1)
		dat_o	: out std_logic_vector(C_BII_DATA_WIDTH-1 downto 0);				-- data out (write) (update synchronous to clock when done=1)
		dat_i	: in  std_logic_vector(C_BII_DATA_WIDTH-1 downto 0);				-- data in (read)
		done_i: in  std_logic;																-- done strobe	 (Success)
		err_i : in  std_logic																-- error strobe (Failure)
		
	-------------------------------------------		
		);
end UL_bsp_al;

architecture structural of UL_bsp_al is

begin

	UL_absp_al_fsm: entity work.UL_absp_al_fsm
		generic map (
			C_RLC_EN						=> C_AL_RLC_EN,									-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
			C_RM_SIZE					=> C_AL_RM_SIZE,									-- 0: RM disabled, 1: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
			
			C_PUB_MODE					=> C_AL_PUB_MODE,									-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
			
			C_CLK_FREQ					=> C_BII_CLK_FREQ,								-- Clock frequency [Hz]
			C_PUBLISH_SYNC_FREQ		=> C_AL_PUBLISH_BASE_FREQ,						-- Publish sync strobe base frequency [Hz]		
			C_SUBMNGR_SGID_SIZE		=> C_AL_SUBMNGR_SGID_SIZE,						-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
			C_SUBGRP_RATE_BYTE_CNT 	=> C_AL_SUBGRP_RATE_BYTE_CNT, 				-- Number of bytes in the RATE register of each subscription group
			C_SUBGRP_ADDR_WIDTH 		=> C_AL_SUBGRP_ADDR_WIDTH,						-- Size/depth of each subscription group = (2**C_SG_ADDR_WIDTH) : RANGE=[4,8,16,32]					

			C_BII_ADDR_WIDTH			=> C_BII_ADDR_WIDTH,								-- BII bus address space/size
			C_BII_DATA_WIDTH			=> C_BII_DATA_WIDTH								-- BII bus data width: [8,16,32]
		)
		port map( 
			clk_i 						=> clk_i,
			reset_i						=> reset_i,
			
		-------------------------------------------
		-- Application-Layer <> Datalink-Layer interface
		-------------------------------------------
		
			-- RxFIFO
			fifo_in_empty_i 			=> rx_fifo_empty_i,
			fifo_in_rd_o 				=> rx_fifo_read_o,
			fifo_in_data_i 			=> rx_fifo_data_i,
			
			-- TxFIFO
			fifo_out_full_i 			=> tx_fifo_full_i,
			fifo_out_wr_o 				=> tx_fifo_write_o,
			fifo_out_data_o 			=> tx_fifo_data_o,
			
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

