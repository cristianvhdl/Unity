----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange	(ANLAN)
-- 
-- Create Date:    12:37:00 12/10-2012
-- Design Name: 
-- Module Name:    wb_classic_pkg - Behavioral 
-- Project Name: 
-- Target Devices:
-- Tool versions:	 
-- Description: 
--
--		This package module declares all the components in the Unity-lib wishbone library
--			
--
-- Dependencies:
--			
--		Unity-HDL libraries:
--			- db_mem_v02_00_b
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01 		12/10-2012	ANLAN		File Created
-- 1.00 		17/10-2012	ANLAN		first official release
-- 2.00		22/10-2012	ANLAN		Headers and comments updated, component declarations added.
-- 2.01		22/10-2012	ANLAN		Updated to use db_mem_pkg v02_00_b
-- 3.50		01/12-2012	ANLAN		IRQ (fifo not empty) output added to the wishbone interfaces of the FIFO components.
-- 3.60		
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

library db_mem_v02_00_b;
use db_mem_v02_00_b.db_mem_pkg.all;

package wb_classic_pkg is

	----------------------------------------------------------------------------------
	-- Interface type declarations for wishbone modules and components
	----------------------------------------------------------------------------------
	
		--------------------------------------
		-- typical usage |  core  | intercon |
		--   wb master	  | output |  input	 |
		--   wb slave 	  | input  |  output	 |
		--------------------------------------	
		type wb_ad32s_if is record
			cyc : std_logic;
			stb : std_logic;		
			adr : std_logic_vector(31 downto 0);
			dat : std_logic_vector(31 downto 0);
			we  : std_logic;
			sgl : std_logic;
		end record;

		--------------------------------------
		-- typical usage |  core  | intercon |
		--   wb master	  | output |  input	 |
		--   wb slave 	  | input  |  output	 |
		--------------------------------------	
		type wb_ad32sb_if is record
			cyc : std_logic;
			stb : std_logic;		
			adr : std_logic_vector(31 downto 0);
			dat : std_logic_vector(31 downto 0);
			we  : std_logic;
			sgl : std_logic;
			blk : std_logic;
		end record;

		--------------------------------------
		-- typical usage |  core  | intercon |
		--   wb master	  | output |  input	 |
		--   wb slave 	  | input  |  output	 |
		--------------------------------------	
		type wb_ad32sbr_if is record
			cyc : std_logic;
			stb : std_logic;		
			adr : std_logic_vector(31 downto 0);
			dat : std_logic_vector(31 downto 0);
			we  : std_logic;
			sgl : std_logic;
			blk : std_logic;
			rmw : std_logic;
		end record;
			
		--------------------------------------
		-- typical usage |  core  | intercon |
		--   wb master	  | output |  input	 |
		--   wb slave 	  | input  |  output	 |
		--------------------------------------		
		type wb_ad32q8sbr_if is record
			cyc : std_logic;
			stb : std_logic;		
			adr : std_logic_vector(31 downto 0);
			dat : std_logic_vector(31 downto 0);
			we  : std_logic;
			sel : std_logic_vector(3 downto 0);
			sgl : std_logic;
			blk : std_logic;
			rmw : std_logic;
		end record;
		
		--------------------------------------
		-- typical usage |  core  | intercon |
		--   wb master	  | input  |  output	 |
		--   wb slave 	  | output |  input	 |
		--------------------------------------
		type wb_d32a_if is record
			dat : std_logic_vector(31 downto 0);
			ack : std_logic;
		end record;	
		
		--------------------------------------
		-- typical usage |  core  | intercon |
		--   wb master	  | input  |  output	 |
		--   wb slave 	  | output |  input	 |
		--------------------------------------	
		type wb_d32ae_if is record
			dat : std_logic_vector(31 downto 0);
			ack : std_logic;
			err : std_logic;
		end record;	
		
		--------------------------------------
		-- typical usage |  core  | intercon |
		--   wb master	  | input  |  output	 |
		--   wb slave 	  | output |  input	 |
		--------------------------------------	
		type wb_d32aer_if is record
			dat : std_logic_vector(31 downto 0);
			ack : std_logic;
			err : std_logic;
			rty : std_logic;
		end record;
	----------------------------------------------------------------------------------
	
	----------------------------------------------------------------------------------
	--	wb_mst_ctrl.vhd
	--
	--		Wishbone master controller component providing a wishbone 
	--		master interface to BII (Bus Independent Interface).	
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb_mst_ctrl
		generic (
			C_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Adressable memory depth/size
			C_DATA_WIDTH 		: integer range 1 to 32 := 32 	-- Data bit size
		);
		port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb master interface
			wb_o 	: out wb_ad32sb_if;
			wb_i 	: in  wb_d32ae_if;
			
			-- user logic interface
			en_i	: in  std_logic;												-- enable (keep high during a cycle/block)
			we_i	: in  std_logic;												-- write enable: write=1, read=0 (must not change during a cycle/block)
			blk_i : in  std_logic;												-- block mode: block=1, single=0
			nxt_i	: in  std_logic;												-- has next (valid in block mode), set to 1 if current is not the last read/write in the block (update synchronous to clock when done=1)
			adr_i	: in  std_logic_vector(C_ADDR_WIDTH-1 downto 0);	-- address in	(clock synchronous update when done=1)
			dat_i	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0);	-- data in (write) (update synchronous to clock when done=1)
			dat_o	: out std_logic_vector(C_DATA_WIDTH-1 downto 0);	-- data out (read) (update synchronous to clock when done=1)
			done_o: out std_logic;												-- done strobe	 (Success)
			err_o : out std_logic												-- error strobe (Failure)
		);
	end component;

	----------------------------------------------------------------------------------
	--	wb_slv_db_mem_ctrl.vhd
	--
	--		Wishbone slave controller component providing a wishbone 
	--		interface to a double-buffered dual-ported memory.
	--
	--		N.B. 	Actual address-bus width is C_MEM_ADDR_WIDTH+1	
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb_slv_db_mem_ctrl is
		generic (
			C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10	-- Memory depth/size	
		);
		port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
			
			-- db_mem interface
			db_i 	: in  db_mem_cwrm_o_if;
			db_o 	: out db_mem_cwrm_i_if
			);
	end component;

	----------------------------------------------------------------------------------
	--	wb_slv_cwrm_tosnet_ctrl.vhd
	--
	--		Wishbone slave controller component providing a wishbone slave 
	--		interface for the Commit-Write<>Read-multiple version of TosNet.
	--
	--		This component requires a 11-bit address space.	
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb_slv_cwrm_tosnet_ctrl is
		port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
			
			-- tosnet cw/rm user io
			status_register_i		: in  std_logic_vector(31 downto 0);
			packet_counter_i		: in  std_logic_vector(31 downto 0);
			reset_counter_i		: in  std_logic_vector(31 downto 0);
			error_counter_i		: in  std_logic_vector(31 downto 0);

			data_reg_ctr_o			: out std_logic_vector(1 downto 0);
			data_reg_ctr_we_o		: out	std_logic;
			
			data_reg_addr_o		: out std_logic_vector(9 downto 0);
			data_reg_data_o		: out std_logic_vector(31 downto 0);
			data_reg_data_i		: in  std_logic_vector(31 downto 0);
			data_reg_re_o			: out std_logic;
			data_reg_r_ack_i		: in  std_logic;
			data_reg_r_err_i		: in  std_logic;		
			data_reg_we_o			: out std_logic;
			data_reg_w_ack_i		: in  std_logic;
			data_reg_w_err_i		: in  std_logic;		
			
			netwrk_reg_addr_o		: out std_logic_vector(3 downto 0);
			netwrk_reg_data_i		: in  std_logic_vector(31 downto 0);
			
			async_tx_str_i			: in  std_logic_vector(6 downto 0);
			async_tx_ctr_o			: out std_logic_vector(5 downto 0);
			async_tx_ctr_we_o		: out std_logic;
			async_tx_data_o		: out std_logic_vector(31 downto 0);
			async_tx_data_we_o	: out std_logic;
			
			async_rx_str_i			: in  std_logic_vector(7 downto 0);
			async_rx_data_i		: in  std_logic_vector(31 downto 0);
			async_rx_data_re_o	: out std_logic
			);
	end component;

	----------------------------------------------------------------------------------
	-- wb_slv_mem_ctrl.vhd
	--
	--		Wishbone slave controller component providing a wishbone 
	--		interface to a single dual ported memory.
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb_slv_mem_ctrl is
		generic (
			C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10;	-- Memory depth/size	
			C_DATA_WIDTH 			: integer range 1 to 32 := 32		-- Data bit size
		);
		port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
			
			-- mem interface
			mem_addr_o  : out std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);
			mem_we_o    : out std_logic;
			mem_data_o  : out std_logic_vector(C_DATA_WIDTH-1 downto 0);
			mem_data_i	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0);
			mem_w_ack_i	: in  std_logic;
			mem_w_err_i	: in  std_logic
			);
	end component;
	
	----------------------------------------------------------------------------------
	-- wb_slv_fifo_ctrl.vhd
	--
	--		Wishbone slave controller component providing a wishbone 
	--		interface to a single FIFO.
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------	
	component wb_slv_fifo_ctrl is
		generic (
			C_DATA_WIDTH 			: integer range 1 to 32 := 32		-- Data bit size
		);
		port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
			
			-- fifo interface
			fifo_wr_o    : out std_logic;
			fifo_data_o  : out std_logic_vector(C_DATA_WIDTH-1 downto 0);
			fifo_full_i  : in  std_logic;
			fifo_empty_i : in  std_logic;
			fifo_data_i	 : in  std_logic_vector(C_DATA_WIDTH-1 downto 0);
			fifo_rd_o	 : out std_logic
			);
	end component;	

	----------------------------------------------------------------------------------
	--	wb_cwrm_tosnet.vhd
	--
	--		Wishbone slave component providing a wishbone slave 
	--		interface for the Commit-Write<>Read-multiple version of TosNet.
	--
	--		This component requires a 11-bit address space.
	--	
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb_cwrm_tosnet is
		generic (
			-- TosNet configuration
			C_TN_NODE_REG					: std_logic_vector (7 downto 0) := "00001111";
			C_TN_WATCHDOG_THESHOLD		: std_logic_vector(17 downto 0) := "000100000000000000";
			C_TN_MAX_SKIPPED_WRITES 	: std_logic_vector(15 downto 0) := "0000000000000000";
			C_TN_MAX_SKIPPED_READS  	: std_logic_vector(15 downto 0) := "0000000000000000";
			C_TN_DISABLE_MASTER			: std_logic := '0';					-- Disable the master functionality
			C_TN_DISABLE_SLAVE			: std_logic := '0';					-- Disable the slave functionality
			C_TN_DISABLE_ASYNC			: std_logic := '0';					-- Disable async functionality (async will still work for other nodes in the network, communication to a node with async disabled will be silently discarded)		
			C_PRE_SPARTAN6_MODE			: natural range 0 to 1 :=  0		-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
		);
		port ( 
				-- wb syscon interface	
				clk_i : in  std_logic;
				rst_i : in  std_logic;
				
				-- wb slave interface
				wb_i 	: in  wb_ad32sb_if;
				wb_o 	: out wb_d32ae_if;
				
				-- tosnet network io
				tosnet_node_id_i			: in  std_logic_vector(3 downto 0);
				clk_tosnet_50M_i 			: in  std_logic;
				tosnet_sig_i				: in  std_logic;
				tosnet_sig_o				: out std_logic;
				
				tosnet_curr_node_id_o	: out std_logic_vector(3 downto 0);
				online_o						: out std_logic;
				master_o						: out std_logic;			
				packet_error_o				: out std_logic;
				system_halt_o				: out std_logic;
				sync_o						: out std_logic
		);
	end component;

	----------------------------------------------------------------------------------
	--	wb_db_cwrm_mem.vhd
	--
	--		Wishbone slave component providing a wishbone 
	--		interface to a double-buffered dual-ported memory.
	--
	--		N.B. 	Actual address-bus width is C_MEM_ADDR_WIDTH+1		
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--	
	----------------------------------------------------------------------------------
	component wb_db_cwrm_mem is
		generic (
			-- DB CWRM MEM configuration
			C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10;	-- Memory depth/size
			C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
			C_IO_ADDR_BIT 			: integer range 0 to 31 := 2;		-- default: 2 (TosNet mode)
			C_CW_TIMEOUT 			: natural 					:= 10;
			C_RST_ON_CW_TIMEOUT 	: integer range 0 to 1 	:= 0		
		);
		port ( 
				-- wb syscon interface	
				clk_i : in  std_logic;
				rst_i : in  std_logic;
				
				-- wb slave interface
				wb_i 	: in  wb_ad32sb_if;
				wb_o 	: out wb_d32ae_if;
				
				-- db cwrm mem interface
				db_i 	: in  db_mem_cwrm_i_if;
				db_o 	: out db_mem_cwrm_o_if			
		);
	end component;

	----------------------------------------------------------------------------------
	--	wb2wb_db_cwrm_mem.vhd
	--
	--		Wishbone slave component providing a dual wishbone 
	--		interface to a double-buffered dual-ported memory.	
	--
	--		N.B. 	Actual address-bus width is C_MEM_ADDR_WIDTH+1		
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb2wb_db_cwrm_mem is
		generic (
			-- DB CWRM MEM configuration
			C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10;	-- Memory depth/size
			C_DATA_WIDTH			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
			C_IO_ADDR_BIT 			: integer range 0 to 31 := 2;		-- default: 2 (TosNet mode)
			C_CW_TIMEOUT 			: natural 					:= 10;
			C_RST_ON_CW_TIMEOUT 	: integer range 0 to 1 	:= 0		
		);
		port ( 
				-- wb syscon interface	
				clk_i : in  std_logic;
				rst_i : in  std_logic;
				
				-- wb slave interface 1
				wb_si1_i 	: in  wb_ad32sb_if;
				wb_si1_o 	: out wb_d32ae_if;
				
				-- wb slave interface 2
				wb_si2_i 	: in  wb_ad32sb_if;
				wb_si2_o 	: out wb_d32ae_if		
		);
	end component;

	----------------------------------------------------------------------------------
	--	wb_mem.vhd
	--
	--		Wishbone slave component offering a wishbone 
	--		interface to a single dual ported memory.
	--
	--		The memory can be configured as either (seen from the wishbone interface): 
	--
	--			- READ ONLY MEMORY (aka mem-input-only mode), C_IO_ADDR_BIT = -2
	--
	--			- WRITE ONLY MEMORY (aka mem-output-only mode), C_IO_ADDR_BIT = -1
	--
	--			- READ AND WRITE MEMORY (aka mixed-io mode), C_IO_ADDR_BIT = [0:C_MEM_ADDR_WIDTH-1]
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	----------------------------------------------------------------------------------	
	component wb_mem is
		generic (
			-- MEM configuration
			C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
			C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
			C_RAMSTYLE      		: string  := "AUTO"; 				-- DISTRIBUTED, BLOCK, AUTO
			C_IO_ADDR_BIT 			: integer range -2 to 31 := 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], MEM-INPUT-ONLY mode: -2, MEM-OUTPUT-ONLY mode: -1
		);
		port (
				-- wb syscon interface	
				clk_i : in  std_logic;
				rst_i : in  std_logic;
				
				-- wb slave interface
				wb_i 			: in  wb_ad32sb_if;
				wb_o 			: out wb_d32ae_if;
				
				-- memory interface
				mem_we_i		: in  std_logic;
				mem_addr_i	: in  std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
				mem_data_i	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0);
				mem_data_o	: out std_logic_vector(C_DATA_WIDTH-1 downto 0);
				mem_w_ack_o : out std_logic;
				mem_w_err_o : out std_logic
		);
	end component;
	
	----------------------------------------------------------------------------------
	-- wb2wb_mem.vhd (wb2wb_mem_sync)
	--
	--		Wishbone slave component offering a dual wishbone interface
	--		to a single dual-ported synchronous memory.
	--		
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb2wb_mem_sync is
		generic (
			-- MEM configuration
			C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
			C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
			C_RAMSTYLE      		: string  := "AUTO"; 				-- DISTRIBUTED, BLOCK, AUTO
			C_IO_ADDR_BIT 			: integer range -2 to 31 := 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], MEM-INPUT-ONLY mode: -2, MEM-OUTPUT-ONLY mode: -1
		);
		port (
				-- wb syscon interface	
				clk_i 	: in  std_logic;
				rst_i 	: in  std_logic;
				
				-- wb slave interface A
				wb_a_i 	: in  wb_ad32sb_if;
				wb_a_o 	: out wb_d32ae_if;
				
				-- wb slave interface B
				wb_b_i 	: in  wb_ad32sb_if;
				wb_b_o 	: out wb_d32ae_if
		);
	end component;
	
	----------------------------------------------------------------------------------
	-- wb2wb_mem.vhd (wb2wb_mem_async)
	--
	--		Wishbone slave component offering a dual wishbone interface
	--		to a single dual-ported asynchronous memory.
	--	
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------	
	component wb2wb_mem_async is
		generic (
			-- MEM configuration
			C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
			C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
			C_RAMSTYLE      		: string  := "AUTO"; 				-- DISTRIBUTED, BLOCK, AUTO
			C_IO_ADDR_BIT 			: integer range -2 to 31 := 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], MEM-INPUT-ONLY mode: -2, MEM-OUTPUT-ONLY mode: -1
		);
		port (
				-- wb syscon interface A
				clk_a_i 	: in  std_logic;
				rst_a_i 	: in  std_logic;
				
				-- wb slave interface A
				wb_a_i 	: in  wb_ad32sb_if;
				wb_a_o 	: out wb_d32ae_if;
				
				-- wb syscon interface B
				clk_b_i 	: in  std_logic;
				rst_b_i 	: in  std_logic;			
				
				-- wb slave interface B
				wb_b_i 	: in  wb_ad32sb_if;
				wb_b_o 	: out wb_d32ae_if
		);
	end component;	
	
	----------------------------------------------------------------------------------
	-- wb_fifo.vhd
	--
	--		Wishbone slave component offering af wishbone read and write 
	--		interface to a pair of configurable asynchronous/synchronous FIFOs.
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!
	--	
	----------------------------------------------------------------------------------	
	component wb_fifo is
		generic (
			-- FIFO configuration
			C_FIFO_DEPTH			: natural range 1 to 32 :=  4;				-- FIFO depth (fifo memory address bit-width)
			C_DATA_WIDTH			: natural range 1 to 32 := 32;				-- Data bit-width
			C_CLOCK_MODE			: natural range 0 to 1 	:=  0;    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			C_SYNC_DEPTH			: natural range 1 to 8 	:=  2;				-- Synchronizer depth (asynch mode only)
			C_PRE_LOAD				: natural					:=  0;				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			C_READ_MODE				: natural range 0 to 1 	:=  1;				-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			C_PRE_SP6_MODE			: natural range 0 to 1 	:=  0;				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			C_RAMSTYLE				: string 					:= "AUTO"			-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)		
		);
		port ( 
				-- wb syscon interface	
				clk_i : in  std_logic;
				rst_i : in  std_logic;
				
				-- wb slave interface
				wb_i 	: in  wb_ad32sb_if;
				wb_o 	: out wb_d32ae_if;
				
				irq_o : out std_logic;				-- IRQ: output-fifo not empty (valid data)
				
				-- fifo interface
				fifo_clk_i		: in  std_logic;	-- fifo clock input, only used in asynchronous clock mode (C_CLOCK_MODE=1)
															-- if C_CLOCK_MODE=0, tie input to zero '0'
															
				fifo_empty_o 	: out std_logic;
				fifo_rd_i 		: in  std_logic;
				fifo_data_o 	: out std_logic_vector(C_DATA_WIDTH-1 downto 0);

				fifo_full_o 	: out std_logic;
				fifo_wr_i 		: in  std_logic;
				fifo_data_i 	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0)
		);
	end component;
	
	----------------------------------------------------------------------------------
	-- wb2wb_fifo.vhd (wb2wb_fifo_sync)
	--
	--		Wishbone slave component offering af dual wishbone read and write 
	--		interface to a pair of configurable synchronous FIFOs.
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------
	component wb2wb_fifo_sync is
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
				
				irq_a_o 	: out std_logic;				-- IRQ: output-fifo not empty (valid data)
				
				-- wb slave interface B
				wb_b_i 	: in  wb_ad32sb_if;
				wb_b_o 	: out wb_d32ae_if;
				
				irq_b_o 	: out std_logic				-- IRQ: output-fifo not empty (valid data)
		);
	end component;
	
	----------------------------------------------------------------------------------
	-- wb2wb_fifo.vhd (wb2wb_fifo_async)
	--
	--		Wishbone slave component offering af dual wishbone read and write 
	--		interface to a pair of configurable asynchronous FIFOs.
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--		
	----------------------------------------------------------------------------------	
	component wb2wb_fifo_async is
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
				
				irq_a_o 	: out std_logic;				-- IRQ: output-fifo not empty (valid data)
				
				-- wb syscon interface B
				clk_b_i 	: in  std_logic;
				rst_b_i 	: in  std_logic;			
				
				-- wb slave interface B
				wb_b_i 	: in  wb_ad32sb_if;
				wb_b_o 	: out wb_d32ae_if;
				
				irq_b_o 	: out std_logic				-- IRQ: output-fifo not empty (valid data)
		);
	end component;

end wb_classic_pkg;

package body wb_classic_pkg is 
end wb_classic_pkg;
