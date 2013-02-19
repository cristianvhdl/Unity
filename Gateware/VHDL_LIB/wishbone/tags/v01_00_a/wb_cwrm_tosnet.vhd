----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    12:25:30 09/05/2012 
-- Design Name: 
-- Module Name:    wb_cwrm_tosnet - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	| 	32-bit SLAVE double buffered memory   |
--	 |								|	with 32-bit granularity, Commit Write |
--	 |								|	+ Read Multiple (CWRM) functionality. |
--  -----------------------------------------------------------------
--	 |	Wishbone version 		| 	Protocol version B4 						  |
--  -----------------------------------------------------------------
--	 |	Supported cycles		| 	SLAVE, READ/WRITE							  |
--	 |								| 	SLAVE, BLOCK READ/WRITE					  |
--  -----------------------------------------------------------------
--  |	Data port:				|													  | 
--	 |		size					|	32-bit (QWORD)								  |
--	 |		granularity  		|	32-bit (QWORD)								  |
--	 |		max. operand size	|	32-bit (QWORD)								  |
--  |	Data transfer: 		|													  |
--	 |		ordering  			|	LITTLE ENDIAN								  |
--  |		sequence    		|	UNDEFINED									  |
--  -----------------------------------------------------------------
--
--  Signal name description and cross references:
--	 .... PENDING
--  .........
--  .............
--
--  Error generation : ERR_O is asserted under the following conditions
--	 .... PENDING
--  .........
--  .............
--
--  -----------------------------------------------------------------
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Revision 0.02 - C_TN_NODE_ID generic removed and replaced with tosnet_node_id_i port, 
--						 to enable "runtime" reconfiguration of the tosnet node id.
-- Revision 0.03 - output port 'tosnet_curr_node_id_o' added to enable the user to verify 
--						 the current node id.
--
-- Additional Comments: 
--
-- Address width: 11-bits
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use work.wb_classic_interface.all;

library tosnet_v04_20_a;
use tosnet_v04_20_a.all;

entity wb_cwrm_tosnet is
	generic (
		-- TosNet configuration
		C_TN_NODE_REG					: std_logic_vector (7 downto 0) := "00001111";
		C_TN_WATCHDOG_THESHOLD		: std_logic_vector(17 downto 0) := "000100000000000000";
		C_TN_MAX_SKIPPED_WRITES 	: std_logic_vector(15 downto 0) := "0000000000000000";
		C_TN_MAX_SKIPPED_READS  	: std_logic_vector(15 downto 0) := "0000000000000000";
		C_TN_DISABLE_MASTER			: std_logic := '0';					-- Disable the master functionality
		C_TN_DISABLE_SLAVE			: std_logic := '0';					-- Disable the slave functionality
		C_TN_DISABLE_ASYNC			: std_logic := '0'					-- Disable async functionality (async will still work for other nodes in the network, communication to a node with async disabled will be silently discarded)		
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
	wb_slv_cwrn_tosnet_ctrl_inst : entity work.wb_slv_cwrn_tosnet_ctrl
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
	tosnet_cwrm_wrapper_inst : entity tosnet_v04_20_a.tosnet_cwrm_wrapper
		generic map(
			C_TN_NODE_REG				=> C_TN_NODE_REG,
			C_TN_WATCHDOG_THESHOLD	=> C_TN_WATCHDOG_THESHOLD,
			C_TN_MAX_SKIPPED_WRITES => C_TN_MAX_SKIPPED_WRITES,
			C_TN_MAX_SKIPPED_READS  => C_TN_MAX_SKIPPED_READS,
			C_TN_DISABLE_MASTER		=> C_TN_DISABLE_MASTER,
			C_TN_DISABLE_SLAVE		=> C_TN_DISABLE_SLAVE,
			C_TN_DISABLE_ASYNC		=> C_TN_DISABLE_ASYNC
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