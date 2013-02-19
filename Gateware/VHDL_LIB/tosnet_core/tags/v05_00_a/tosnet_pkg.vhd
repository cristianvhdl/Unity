----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    14:55:20 16/10/2012
-- Design Name: 
-- Module Name:    tosnet_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib TosNet library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		17/10-2012	ANLAN 	File Created
-- 4.20.b	17/10-2012	ANLAN		First release
--	4.20.c	
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
library ieee;
use ieee.std_logic_1164.all;

package tosnet_pkg is

	----------------------------------------------------------------------------------
	-- tosnet_core.vhd
	--
	--		TosNet is a fully FPGA-based isochronous network targeted for
	--		use in prototype, modular, distributed robot controllers. Full
	--		specification can be seen in the documentation.
	--
	--		This component is the top-level wrapper, containing the application
	--		and data-link/physical layer modules.	
	--
	--
	----------------------------------------------------------------------------------
	component tosnet_core is																-- Ports marked with * are required
		Generic (disable_slave			: STD_LOGIC := '0';							-- Disable the slave functionality
					disable_master			: STD_LOGIC := '0';							-- Disable the master functionality (can drastically reduce the amount of logic required for slave-only nodes)
					disable_async			: STD_LOGIC := '0';							-- Disable async functionality (async will still work for other nodes in the network, communication to a node with async disabled will be silently discarded)
					disable_commit_srreg	: STD_LOGIC := '0';							-- Disable use of Set/Reset registers on commit read+write inputs (use combinatorial inputs instead)
					pre_sp6_mode			: natural range 0 to 1 :=  0);			-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
		Port (	sig_in					: in	STD_LOGIC;								--*The serial input signal
					sig_out					: out	STD_LOGIC;								--*The serial output signal
					clk_50M					: in	STD_LOGIC;								--*The 50 MHz input clock
					reset						: in	STD_LOGIC;								-- Active high reset
					sync_strobe				: out	STD_LOGIC;								-- Active high synchronization strobe (asserted for one clock cycle during synchronication)
					online					: out	STD_LOGIC;								-- Active high online indicator (asserted when network is configured and running)
					is_master				: out	STD_LOGIC;								-- Active high is_master indicator (asserted when current node is master)
					node_address			: out	STD_LOGIC_VECTOR(3 downto 0); 	-- Address (position) of the node on the network relative to the master.
					packet_error			: out	STD_LOGIC;								-- Active high packet error indicator (asserted whenever the previously received packet was erroneous)
					system_halt				: out	STD_LOGIC;								-- Active high system halt signal (asserted when the max_skipped thresholds are exceeded)
					data_reg_read_ptr		: out STD_LOGIC;								-- buffer index user data_reg read's are made from (system writes to opposite buffer)
					data_reg_write_ptr	: out STD_LOGIC;								-- buffer index user data_reg write's are made to (system reads from opposite buffer)
					node_id					: in	STD_LOGIC_VECTOR(3 downto 0);		--*The id of the current node
					reg_enable				: in	STD_LOGIC_VECTOR(7 downto 0);		--*Bit-vector describing which registers are enabled (a '1' indicates that the corresponding register is enabled, '0' that it is disabled)
					watchdog_threshold	: in	STD_LOGIC_VECTOR(17 downto 0);	--*The threshold of the watchdog in 1.25 MHz clock cycles
					max_skipped_writes	: in	STD_LOGIC_VECTOR(15 downto 0);	--*The maximum amount of consecutive clock cycles without a write to the shared memory block (set to 0 to disable)
					max_skipped_reads		: in	STD_LOGIC_VECTOR(15 downto 0);	--*The maximum amount of consecutive clock cycles without a read from the shared memory block (set to 0 to disable)
					data_reg_addr			: in	STD_LOGIC_VECTOR(9 downto 0);		-- The address bus of the shared memory block
					data_reg_data_in		: in	STD_LOGIC_VECTOR(31 downto 0);	-- The input data bus to the shared memory block
					data_reg_data_out		: out	STD_LOGIC_VECTOR(31 downto 0);	-- The output data bus from the shared memory block
					data_reg_clk			: in	STD_LOGIC;								-- The clock for the shared memory block
					data_reg_we				: in	STD_LOGIC_VECTOR(0 downto 0);		-- Active high write enable for the shared memory block
					network_reg_addr_ext	: in	STD_LOGIC_VECTOR(3 downto 0);		-- The address input for access to the TosNet network register
					network_reg_data_ext	: out	STD_LOGIC_VECTOR(31 downto 0);	-- The data output from the TosNet network register
					network_reg_clk_ext	: in	STD_LOGIC;								-- The clock used for access to the TosNet network register
					commit_write 			: in	STD_LOGIC;								-- Active high signal to commit the out registers
					commit_read				: in	STD_LOGIC;								-- Active high signal to commit the in registers
					reset_counter			: out	STD_LOGIC_VECTOR(31 downto 0);	-- The number of resets since last configuration
					packet_counter			: out	STD_LOGIC_VECTOR(31 downto 0);	-- The number of data packets transmitted since last configuration
					error_counter			: out	STD_LOGIC_VECTOR(31 downto 0);	-- The number of erroneous packets received since last configuration
					async_in_data			: in	STD_LOGIC_VECTOR(37 downto 0);	-- The async input data bus
					async_out_data			: out	STD_LOGIC_VECTOR(37 downto 0);	-- The async output data bus
					async_in_clk			: in	STD_LOGIC;								-- The async input clock
					async_out_clk			: in	STD_LOGIC;								-- The async output clock
					async_in_full			: out	STD_LOGIC;								-- Active high async input full indicator (asserted when async input buffer is full)
					async_out_empty		: out	STD_LOGIC;								-- Active high async output empty indicator (asserted when async output buffer is empty)
					async_in_wr_en			: in	STD_LOGIC;								-- Active high async input write enable
					async_out_rd_en		: in	STD_LOGIC;								-- Active high async output read enable
					async_out_valid		: out	STD_LOGIC);								-- Active high async output valid indicator (asserted when valid data is present on the async output data bus)
	end component;

	----------------------------------------------------------------------------------
	-- tosnet_cwrm_wrapper.vhd
	--
	--		This component implements a Commit Write Read Multiple (CWRM)
	--		scheme on top of the standard TosNet core. 
	--
	--		Supported TosNet features:
	--			- Standard TosNet shared memory access
	--			  (TosNet access rights are enforced)
	--			- Network register access
	--			- Asynchronous data RX/TX
	--
	--		Please read through the documentation in module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	--
	----------------------------------------------------------------------------------
	component tosnet_cwrm_wrapper is
		generic(
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
			-- tosnet network io
			clk_tosnet_50M_i 		: in  std_logic;
			tosnet_sig_i			: in  std_logic;
			tosnet_sig_o			: out std_logic;
			
			-- tosnet cw/rm user io
			clk_user_io_i 			: in  std_logic;
			reset_i					: in  std_logic;

			node_id_i				: in  std_logic_vector(3 downto 0);		-- lowest id on network act's as master, valid range [0:15]
			curr_node_id_o			: out std_logic_vector(3 downto 0);
			
			status_register_o		: out std_logic_vector(31 downto 0);
			packet_counter_o		: out std_logic_vector(31 downto 0);
			reset_counter_o		: out std_logic_vector(31 downto 0);
			error_counter_o		: out std_logic_vector(31 downto 0);

			data_reg_ctr_i			: in  std_logic_vector(1 downto 0);
			data_reg_ctr_we_i		: in	std_logic;
			
			data_reg_addr_i		: in  std_logic_vector(9 downto 0);
			data_reg_data_i		: in  std_logic_vector(31 downto 0);
			data_reg_data_o		: out std_logic_vector(31 downto 0);
			data_reg_re_i			: in  std_logic;
			data_reg_r_ack_o		: out std_logic;
			data_reg_r_err_o		: out std_logic;		
			data_reg_we_i			: in  std_logic;
			data_reg_w_ack_o		: out std_logic;
			data_reg_w_err_o		: out std_logic;		
			
			netwrk_reg_addr_i		: in  std_logic_vector(3 downto 0);
			netwrk_reg_data_o		: out std_logic_vector(31 downto 0);
			
			async_tx_str_o			: out std_logic_vector(6 downto 0);
			async_tx_ctr_i			: in  std_logic_vector(5 downto 0);
			async_tx_ctr_we_i		: in  std_logic;
			async_tx_data_i		: in  std_logic_vector(31 downto 0);
			async_tx_data_we_i	: in  std_logic;
			
			async_rx_str_o			: out std_logic_vector(7 downto 0);
			async_rx_data_o		: out std_logic_vector(31 downto 0);
			async_rx_data_re_i	: in  std_logic
		);
	end component;

end tosnet_pkg;

package body tosnet_pkg is
end tosnet_pkg;
