----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    12:25:30 05/09-2012 
-- Design Name: 
-- Module Name:    wb_cwrm_tosnet - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave component providing a wishbone slave 
--		interface for the Commit-Write<>Read-multiple version of TosNet.
--
--		This component requires a 11-bit address space.
--
--		All addresses listed in the Memory and Register space definition 
--		example below is based on a baseaddr of 0x000.
--
--		For detailed information about the TosNet or the TosNet memory-space 
--		scheme please consult the TosNet documentation.
--
--	---------------------------------------------------------------------
-- 						TosNet Address space definition
--	---------------------------------------------------------------------
--					 					Memory space
--
-- 	Shared Memory/Data-Reg size: 0x400
--
-- 	Baseaddr:			0x000
-- 	Endaddr:				0x3FF
--
--		10-bit addr: [9-6] = nodeid, [5-3] = register, [2] = IO (IN=1, OUT=0), [1-0] = dword
--
--		Shared Memory Access control:
--
--		The Shared Memory Access control logic	verifies that the node has 
--		write permission to the provided address, by using the following 
--		access rules:
--
--				master node: Write permission to its own IN+OUT registers + slave node IN registers
--				slave node(s): Write permission to its own OUT registers
--		
--		The Shared Memory Access control logic	verifies that the node has 
--		read permission to the provided address, by using the following 
--		access rules:
--
--				master node: Read permission to all registers
-- 			slave node(s): Read permission to its own IN and all OUT registers	
--
--		Automatically raises the RM (Read multiple) flag on block access
-- 	Sets the CW (Commit Write) flag on any write to 0x400 (combined status and control register)
--
--	------------------------------------------------------------------
-- 									Registers space
--	
--		Status Register:	0x400	(read only)	(writes generate a set action on the CW-bit of the control register)
-- 	Packet Counter:	0x401	(read only)	
-- 	Reset Counter:		0x402	(read only)	
--		Error Counter:		0x403	(read only)	
--
--		Network Reg0:		0x500	(read only)	
--		Network Reg1:		0x501	(read only)	
--		Network Reg2:		0x502	(read only)	
--		Network Reg3:		0x503	(read only)	
--		Network Reg4:		0x504	(read only)	
--		Network Reg5:		0x505	(read only)	
--		Network Reg6:		0x506	(read only)	
--		Network Reg7:		0x507	(read only)	
--		Network Reg8:		0x508	(read only)	
--		Network Reg9:		0x509	(read only)	
--		Network Reg10:		0x50A	(read only)	
--		Network Reg11:		0x50B	(read only)	
--		Network Reg12:		0x50C	(read only)	
--		Network Reg13:		0x50D	(read only)	
--		Network Reg14:		0x50E	(read only)	
--		Network Reg15:		0x50F	(read only)	
-- 
-- 	Async TX status:	0x600	(read only)
-- 	Async TX control:	0x601	(write only)
-- 	Async TX data:		0x602	(write only)
-- 
-- 	Async RX status:	0x700	(read only)
-- 	Async RX data:		0x702	(read only)
--	
--	---------------------------------------------------------------------
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE TosNet component enforcing      |
--	 |							   |  Commit Write and Read Multiple (CWRM) |
--	 |								|	functionality.								  |
--  -----------------------------------------------------------------
--	 |	Wishbone version 		| 	Protocol version B4 						  |
--  -----------------------------------------------------------------
--	 |	Supported cycles		| 	SLAVE, READ/WRITE							  |
--	 |								| 	SLAVE, BLOCK READ/WRITE					  |
--  -----------------------------------------------------------------
--  |	Data port:				|													  | 
--	 |		size					|	32 bit (QWORD)								  |
--	 |		granularity  		|	32-bit (QWORD)								  |
--	 |		max. operand size	|	32-bit (QWORD)								  |
--  |	Data transfer: 		|													  |
--	 |		ordering  			|	LITTLE ENDIAN								  |
--  |		sequence    		|	UNDEFINED									  |
--	 -----------------------------------------------------------------
--	 | 							SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | COMPONENT SIGNAL 	| WB SIGNAL 	| DESCRIPTION		  			  |
--	 -----------------------------------------------------------------
--	 | clk_i					| CLK_I			| slave clock input			  |
--	 | rst_i					| RST_I			| slave reset input			  |
--	 |							|					|									  |
--	 | wb_i 				  	|  				| (record type: wb_ad32sb_if)|
--	 |  .cyc					| CYC_I			| slave cycle input			  |
--	 |  .stb					| STB_I			| slave strobe input			  |
--	 |  .adr					| ADR_I			| slave addr input			  |
--	 |  .dat					| DAT_I			| slave data input			  |
--	 |  .we					| WE_I			| slave write enable input   |
--	 |  .sgl					| TGC_I()		| slave cycle-tag input		  |
--	 |  .blk					| TGC_I()		| slave cycle-tag input		  |
--	 |							|					|									  |
--	 | wb_o 				  	|  				| (record type: wb_d32ae_if) |
--	 |  .dat					| DAT_O			| slave data output			  |
--	 |  .ack					| ACK_O			| slave acknowledge output	  |
--	 |  .err					| ERR_O			| slave error output			  |
--	 -----------------------------------------------------------------
--	 | 						TAG SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | SIGNAL NAME	| TAG TYPE	| DESCRIPTION								  |
--	 -----------------------------------------------------------------
--	 | wb_i.sgl		| TGC_I		| marks a cycle as a single access	  |
--	 | wb_i.blk		| TGC_I		| marks a cycle as a block access	  |
--	 -----------------------------------------------------------------
--	 | 							ERROR GENERATION 								  |
--	 | ERR_O is asserted under the following conditions				  |
--	 -----------------------------------------------------------------
--	 |	WB BUS CYCLE |	ERROR TRIGGER	| DESCRIPTION					 	  |
--	 -----------------------------------------------------------------
--	 |  read-cycle  | read error	| node is not allowed read access* |
--	 |  write-cycle | write error	| node is not allowed write access*|
--	 -----------------------------------------------------------------
--
--		* see access rules under the memory space description.
--
-- Dependencies: 
--
--		work.wb_classic_pkg.all
--
--		Unity-HDL libraries:
--			- tosnet_v04_20_b
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment 
-- 0.01	 	05/09-2012	ANLAN		File Created
-- 0.02						ANLAN		C_TN_NODE_ID generic removed and replaced with tosnet_node_id_i port, 
--						 					to enable "runtime" reconfiguration of the tosnet node id.
-- 0.03						ANLAN		Output port 'tosnet_curr_node_id_o' added to enable the user to verify 
--						 					the current node id.
--	0.04		22/10-2012	ANLAN		Headers, comments and licensing info updated.
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

library tosnet_core_v05_00_a;
use tosnet_core_v05_00_a.tosnet_pkg.all;

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb_cwrm_tosnet is
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
end wb_cwrm_tosnet;

architecture structural of wb_cwrm_tosnet is	

	-- TosNet signals
	signal status_register_o	: std_logic_vector(31 downto 0);
	signal packet_counter_o		: std_logic_vector(31 downto 0);
	signal reset_counter_o		: std_logic_vector(31 downto 0);
	signal error_counter_o		: std_logic_vector(31 downto 0);
	signal data_reg_ctr_i		: std_logic_vector(1 downto 0);
	signal data_reg_ctr_we_i	: std_logic;
	signal data_reg_addr_i		: std_logic_vector(9 downto 0);
	signal data_reg_data_i		: std_logic_vector(31 downto 0);
	signal data_reg_data_o		: std_logic_vector(31 downto 0);
	signal data_reg_re_i			: std_logic;
	signal data_reg_r_ack_o		: std_logic;
	signal data_reg_r_err_o		: std_logic;		
	signal data_reg_we_i			: std_logic;
	signal data_reg_w_ack_o		: std_logic;
	signal data_reg_w_err_o		: std_logic;		
	signal netwrk_reg_addr_i	: std_logic_vector(3 downto 0);
	signal netwrk_reg_data_o	: std_logic_vector(31 downto 0);
	signal async_tx_str_o		: std_logic_vector(6 downto 0);
	signal async_tx_ctr_i		: std_logic_vector(5 downto 0);
	signal async_tx_ctr_we_i	: std_logic;
	signal async_tx_data_i		: std_logic_vector(31 downto 0);
	signal async_tx_data_we_i	: std_logic;
	signal async_rx_str_o		: std_logic_vector(7 downto 0);
	signal async_rx_data_o		: std_logic_vector(31 downto 0);
	signal async_rx_data_re_i	: std_logic;

begin

	-- Wishbone CWRM TosNet slave controller instance
	wb_slv_cwrm_tosnet_ctrl_inst : wb_slv_cwrm_tosnet_ctrl
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_i,
			wb_o 	=> wb_o,
			
			-- tosnet cw/rm user io
			status_register_i		=> status_register_o,
			packet_counter_i		=> packet_counter_o,
			reset_counter_i		=> reset_counter_o,
			error_counter_i		=> error_counter_o,

			data_reg_ctr_o			=> data_reg_ctr_i,
			data_reg_ctr_we_o		=> data_reg_ctr_we_i,
			
			data_reg_addr_o		=> data_reg_addr_i,
			data_reg_data_o		=> data_reg_data_i,
			data_reg_data_i		=> data_reg_data_o,
			data_reg_re_o			=> data_reg_re_i,
			data_reg_r_ack_i		=> data_reg_r_ack_o,
			data_reg_r_err_i		=> data_reg_r_err_o,
			data_reg_we_o			=> data_reg_we_i,
			data_reg_w_ack_i		=> data_reg_w_ack_o,
			data_reg_w_err_i		=> data_reg_w_err_o,
			
			netwrk_reg_addr_o		=> netwrk_reg_addr_i,
			netwrk_reg_data_i		=> netwrk_reg_data_o,
			
			async_tx_str_i			=> async_tx_str_o,
			async_tx_ctr_o			=> async_tx_ctr_i,
			async_tx_ctr_we_o		=> async_tx_ctr_we_i,
			async_tx_data_o		=> async_tx_data_i,
			async_tx_data_we_o	=> async_tx_data_we_i,
			
			async_rx_str_i			=> async_rx_str_o,
			async_rx_data_i		=> async_rx_data_o,
			async_rx_data_re_o	=> async_rx_data_re_i
			);	
	
	-- Wishbone CWRM TosNet core instance
	tosnet_cwrm_wrapper_inst : tosnet_cwrm_wrapper
		generic map(
			C_TN_NODE_REG				=> C_TN_NODE_REG,
			C_TN_WATCHDOG_THESHOLD	=> C_TN_WATCHDOG_THESHOLD,
			C_TN_MAX_SKIPPED_WRITES => C_TN_MAX_SKIPPED_WRITES,
			C_TN_MAX_SKIPPED_READS  => C_TN_MAX_SKIPPED_READS,
			C_TN_DISABLE_MASTER		=> C_TN_DISABLE_MASTER,
			C_TN_DISABLE_SLAVE		=> C_TN_DISABLE_SLAVE,
			C_TN_DISABLE_ASYNC		=> C_TN_DISABLE_ASYNC,
			C_PRE_SPARTAN6_MODE		=> C_PRE_SPARTAN6_MODE
		)
		port map( 				
			-- tosnet network io
			clk_tosnet_50M_i 		=> clk_tosnet_50M_i,
			tosnet_sig_i			=> tosnet_sig_i,
			tosnet_sig_o			=> tosnet_sig_o,
			
			-- tosnet cw/rm user io
			clk_user_io_i 			=> clk_i,
			reset_i					=> rst_i,

			node_id_i				=> tosnet_node_id_i,
			curr_node_id_o			=> tosnet_curr_node_id_o,

			status_register_o		=> status_register_o,
			packet_counter_o		=> packet_counter_o,
			reset_counter_o		=> reset_counter_o,
			error_counter_o		=> error_counter_o,
			
			data_reg_ctr_i			=> data_reg_ctr_i,
			data_reg_ctr_we_i		=> data_reg_ctr_we_i,
			data_reg_addr_i		=> data_reg_addr_i,
			data_reg_data_i		=> data_reg_data_i,
			data_reg_data_o		=> data_reg_data_o,
			data_reg_re_i			=> data_reg_re_i,
			data_reg_r_ack_o		=> data_reg_r_ack_o,
			data_reg_r_err_o		=> data_reg_r_err_o,
			data_reg_we_i			=> data_reg_we_i,
			data_reg_w_ack_o		=> data_reg_w_ack_o,
			data_reg_w_err_o		=> data_reg_w_err_o,
			
			netwrk_reg_addr_i		=> netwrk_reg_addr_i,
			netwrk_reg_data_o		=> netwrk_reg_data_o,
			
			async_tx_str_o			=> async_tx_str_o,
			async_tx_ctr_i			=> async_tx_ctr_i,
			async_tx_ctr_we_i		=> async_tx_ctr_we_i,
			async_tx_data_i		=> async_tx_data_i,
			async_tx_data_we_i	=> async_tx_data_we_i,
			
			async_rx_str_o			=> async_rx_str_o,
			async_rx_data_o		=> async_rx_data_o,
			async_rx_data_re_i	=> async_rx_data_re_i
		);	
		
		
	online_o			<= status_register_o(31);
	master_o			<= status_register_o(30);
	packet_error_o	<= status_register_o(29);
	system_halt_o	<= status_register_o(28);
	sync_o			<= status_register_o(27);	

end structural;