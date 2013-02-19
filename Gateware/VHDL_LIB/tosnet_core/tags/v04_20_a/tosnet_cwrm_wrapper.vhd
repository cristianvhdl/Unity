----------------------------------------------------------------------------------
-- Company: University Of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:52:22 05/03/2012 
-- Design Name: 
-- Module Name:    tosnet_cwrm_wrapper - behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--	
--	*********************************************************************
--
--		This module implements a Commit Write Read Multiple (CWRM)
--		scheme on top of the standard TosNet core. 
--
--		Supported TosNet features:
--			- Standard TosNet shared memory access
--			  (TosNet access rights are enforced)
--			- Network register access
--			- Asynchronous data RX/TX
--
--		Please read through the documentation below for a detailed 
--		description of the usage and capabilities of this module!
--
--	*********************************************************************
--
--										STATUS REGISTER
--		--------------------------------------------------------------------
--		| signal: status_register_o													 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
-- 	|   31   | ONLINE |  read:user   | Node is online						 |
-- 	|   30   | MASTER |  read:user   | Node is master						 |
-- 	|   29   | PCKERR |  read:user   | Packet Error							 |
-- 	|   28   | SYSHLT |  read:user   | System Halt							 |
-- 	|   27   | SNCSTR |  read:user   | Network Sync Strobe				 |
-- 	|  26-24 |        |              |   (unused)							 |
-- 	|  23-20 | NODEID |  read:user   | Node ID								 |
-- 	|  19-16 | NODEAD |  read:user   | Node address							 |
-- 	|  15-9  |        |              |   (unused)							 |
--		|	  8 	| ERNP   |  read:user   | Error Read Not Permitted 		 | Set if r_err_o==1, cleared if r_ack_o==1 (The status of the last read attempt can be read here)
--		|	  7 	| EWNP   |  read:user   | Error Write Not Permitted 		 | Set if w_err_o==1, cleared if w_ack_o==1 (The status of the last write attempt can be read here)
--		|	  6 	|  	   |				   |	(unused)								 | (left blank to ensure compatability with the db_cwrm_mem module)
--		|	  5 	|	CWA   |  read:user   | Commit Write Aborted 				 | Set if user writes data to the memory while CWP=1, Cleared when user writes 1 to CW
--		|	  4 	|	 	   |				   |	(unused)								 | (left blank to ensure compatability with the db_cwrm_mem module)
--		|	  3 	|	RP	   |  read:user   | Read Pointer 						 | Buffer index user data_reg read's are made from
--		|	  2 	|	WP	   |  read:user   | Write Pointer 						 | Buffer index user data_reg write's are made to
-- 	|	  1	|	RMF   |  read:user   | Read Multiple Flag					 | Equal to value of RM in data_reg_ctr
--		| 	  0	|  CWP   |  read:user   | Commit Write Pending				 | Equal to value of CW in data_reg_ctr
-- 	--------------------------------------------------------------------
--
--										PACKET COUNTER
--		--------------------------------------------------------------------
--		| signal: packet_counter_o														 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
--		|  31-0	| PCKCNT | read:user		| packet counter						 |
--		--------------------------------------------------------------------
--
--										RESET COUNTER
--		--------------------------------------------------------------------
--		| signal: reset_counter_o														 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
--		|  31-0	| RSTCNT | read:user		| reset counter						 |
--		--------------------------------------------------------------------
--
--										ERROR COUNTER
--		--------------------------------------------------------------------
--		| signal: error_counter_o														 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
--		|  31-0	| ERRCNT | read:user		| error counter						 |
--		--------------------------------------------------------------------
--
--	*********************************************************************
--						TOSNET DATA REG / SHARED MEMORY ACCESS
--
--		The TosNet data register (shared memory) is accessed through
--		the following signals:
--		----------------------------------------------------
--		|	data_reg_addr_i	|	10-bit Address input			|	[9-6] = nodeid, [5-3] = register, [2] = IO (IN=1, OUT=0), [1-0] = dword
--		|	data_reg_data_i	|	32-bit Data input (write)	|
--		|	data_reg_data_o	|	32-bit Data output (read)	|
--		|---------------------------------------------------
--		|	data_reg_re_i		|	Read Enable input				|
--		|	data_reg_r_ack_o	|	Read Acknowledge Output		|
--		|	data_reg_r_err_o	|	Read Error Output				|
--		|---------------------------------------------------
--		|	data_reg_we_i		|	Write Enable input			|
--		|	data_reg_w_ack_o	|	Write Acknowledge Output	|
--		|	data_reg_w_err_o	|	Write Error Output			|
--		----------------------------------------------------
--
--		Data written to the shared memory has to be committed in order 
--		to be available to the rest of the TosNet network, this can be 
--		done through writing a logic 1 to the commit write (CW) bit in 
--		the Data reg control register (data_reg_ctr_i).
--
--		This wrapper modifies the standard commit write/commit read scheme 
--		of TosNet nad instead implements a CWRM scheme: CW (commit write) 
--		RM (read multiple). This means the user will always read the newest 
--		available data from the network (automatic commit read after each 
--		network cycle/strobe). 
--
--		In order to enable the user to read data spanning across multiple 
--		addresses, and guarantee that an automatic commit of the read 
--		(Read pointer) registers dosn't occur and potentially corrupts the 
--		data being read, a Read Multiple (RM) flag can be set by writing a 
--		logic 1 to the read multiple (RM) bit in the Data reg control 
--		register (data_reg_ctr_i).
--		OBS: The RM bit MUST be deasserted after the multi word access is 
--		finished in order to ensure the newest network data will be available!
--
--		Shared Memory Access control:
--
--		The Shared Memory Access control logic	verifies that the node has 
--		write permission to the address provided on the data_reg_addr signal, 
--		by using the following access rules:
--
--				master: Write permission to its own IN+OUT registers + slave node IN registers
--				slave : Write permission to its own OUT registers
--		
--		The Shared Memory Access control logic	verifies that the node has 
--		read permission to the address provided on the data_reg_addr signal, 
--		by using the following access rules:
--
--				master: Read permission to all registers
-- 			slave : Read permission to its own IN and all OUT registers
--
--		The Memory Access control logic does not verify whether or not the 
--		register being accessed is actually enabled. This could be implemented using 
--		additional logic as the network register is accessible.
--
--								DATA REG CONTROL REGISTER
--		--------------------------------------------------------------------
--		| signals: data_reg_ctr_i														 |
--		|			  data_reg_ctr_we_i (write enable)			 					 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right				| Description				 |
-- 	|   1    |   RM   |  write:user           | Read Multiple flag 	 | Written by user.
-- 	|   0    |   CW   |  set:user, clear:auto | Commit Write req   	 | Set when user writes 1 to CW, automatically cleared on CW acknowledge or CW aborted.
--		--------------------------------------------------------------------
--
--	*********************************************************************
--							  TOSNET NETWORK REG ACCESS
--
--		The TosNet network register can be access through the following signals:
--
--		----------------------------------------------------
--		|	netwrk_reg_addr_i	|	4-bit Node address input	|
--		|	netwrk_reg_data_o	|	32-bit Data output			|
--		----------------------------------------------------
--
--						    NETWORK REGISTER DATA FORMAT
--		--------------------------------------------------------------------
--		| signal: netwrk_reg_data_o													 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
-- 	|  31-24 |        |  read:user   | Node is online						 |
--		|  23-16 | 			|	read:user	| Writeable register segments*	 |
--		|  15-8  | 			|	read:user	| Readable register segments*		 |
-- 	|   7-4  |			|	read:user	| Node address							 |
-- 	|   3-0  | 			|	read:user	| Node id								 |
--		--------------------------------------------------------------------
--		|	*: The current TosNet core doesn't distinguish between 			 |
--		|		writeable and readable register segments.							 |
--		--------------------------------------------------------------------
--
--
--	*********************************************************************
--							TOSNET ASYNC DATA RX/TX
--		
--		The master can transmit asynchronous data to a specific slave 
--		node or to all slaves (broadcast).
--		Each slave node can only transmit asynchronous data to the master
--		(i.e. as repsonse to recieved asynchronous data from the master)
--
--		Asynchronous data is transmitted using the following signals:
--		----------------------------------------------------------
--		|	async_tx_str_o			| 7-bit status register 			|
--		|	async_tx_ctr_i			| 6-bit control register			|
--		|	async_tx_ctr_we_i		| Control register write enable	|
--		|	async_tx_data_i		| 32-bit data input					|
--		|	async_tx_data_we_i	| Data write enable (transmit)	|
--		----------------------------------------------------------
--
--		--------------------------------------------------------------------
--		| signal: async_tx_str_o														 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
-- 	|    6   | TXFULL	|  read:user   | Transmit Fifo full					 |
--		|   5-4  | DCOUNT	|	read:user	| Data (Byte) count					 |
--		|   3-0  | NODEID	|	read:user	| NodeID*(1) 							 |
--		--------------------------------------------------------------------
--		|*(1): For a transmitting Master the NodeID is the value written 	 |
--		|		 to the NODEID field of the async tx control register.		 |
--		|		 The value either be the ID of the target slave or "0000" 	 |
--		|		 for a broadcast to all slaves.					 					 |
--		|																						 |
--		|		 For a transmitting Slave the NodeID is the slaves own 		 |
--		|		 nodeid in order to enable the Master node receiving the  	 |
--		|		 data to identify the sender.											 |
--		--------------------------------------------------------------------
--
--		--------------------------------------------------------------------
--		| signal: async_tx_ctr_i														 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
--		|   5-4  | DCOUNT	|	write:user	| Data (Byte) count*(1)				 |
--		|   3-0  | NODEID	|	write:user	| NodeID*(2) 							 |
--		--------------------------------------------------------------------
--		|*(1): The value of DCOUNT specifies the index of the last valid 	 |
--		|		 byte in the current frame. 											 |
--		|		 Byte 0 will thus always be valid.									 |
--		|																						 |
--		|		 Asynchronous Frame: 													 |
--		| bit	  37-36    35-32	   31-24     23-16	   15-8      7-0		 |
--		|		-----------------------------------------------------------	 |
--		|		| DCOUNT | NODEID | DBYTE 0 | DBYTE 1 | DBYTE 2 | DBYTE 3 |	 |
--		|		-----------------------------------------------------------	 |
--		|																						 |
--		|*(2): For a transmitting Master the NodeID can be set to 			 |
--		|		 either the ID of the target slave or "0000" for a 			 |
--		|		 broadcast to all slaves.					 					 		 |
--		|																						 |
--		|		 For a transmitting Slave writing the NodeID has no effect.	 |
--		--------------------------------------------------------------------
--
--		Asynchronous data is received using the following signals:
--				
--		----------------------------------------------------------
--		|	async_rx_str_o			| 7-bit status register 			|
--		|	async_rx_data_o		| 32-bit data output					|
--		|	async_rx_data_re_i	| Data read enable					|
--		----------------------------------------------------------
--
--		--------------------------------------------------------------------
--		| signal: async_rx_str_o														 |
--		--------------------------------------------------------------------
--		| bit no | label  | Access right | Description							 |
-- 	|    7   | REMPTY	|  read:user   | Receive Fifo empty					 |
-- 	|    6   | DVALID	|  read:user   | Data valid							 |
--		|   5-4  | DCOUNT	|	read:user	| Data (Byte) count					 |
--		|   3-0  | NODEID	|	read:user	| NodeID*(1) 							 |
--		--------------------------------------------------------------------
--		|*(1): For a recieving Master the NodeID is the nodeid of slave 	 |
--		|		 that send the message.													 |
--		|																						 |
--		|		 For a recieving Slave the NodeID is either the nodeid  		 |
--		|		 of the slave itself or "0000" if the message is a broadcast |
--		|		 to all slaves.															 |
--		--------------------------------------------------------------------
--		
--
--	*********************************************************************
--										GENERICS
--
--		C_TN_NODE_REG					: Activated/Enabled Node registers, 
--											  8-bit vector: "00001111"	("00001111" => register 0-3 enabled)
--
--		C_TN_WATCHDOG_THESHOLD		: Threshold of the TosNet watchdog in 1.25 MHz clock cycles, 
--											  18-bit vector: default="000100000000000000" (16384)
--
--		C_TN_MAX_SKIPPED_WRITES 	: The maximum amount of consecutive clock cycles without a write 
--											  to the shared memory block, without generating a system halt 
--											  (set to 0 to disable), 16-bit vector.
--
--		C_TN_MAX_SKIPPED_READS  	: The maximum amount of consecutive clock cycles without a read 
--											  to the shared memory block, without generating a system halt 
--											  (set to 0 to disable), 16-bit vector.
--
--		C_TN_DISABLE_MASTER			: Disable the master functionality
--
--		C_TN_DISABLE_SLAVE			: Disable the slave functionality
--
--		C_TN_DISABLE_ASYNC			: Disable async functionality
--											  Async will still work for other nodes in the network, 
--											  communication to a node with async disabled will be silently discarded.
--	
--	*********************************************************************
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Revision 0.02 - C_TN_NODE_ID generic removed and replaced with node_id_i port, 
--						 to enable "runtime" reconfiguration of the tosnet node id.
-- Revision 0.03 - power up reset delay of 256 user clock periods added, to ensure
--						 the node id is read 256 user clock periods after a reset/power up, 
--						 and that the tosnet core is kept reset until the node id is valid.
-- Revision 0.04 - output port 'curr_node_id_o' added to enable the user to verify 
--						 the current node id.
--
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

entity tosnet_cwrm_wrapper is
	generic(
		C_TN_NODE_REG					: std_logic_vector (7 downto 0) := "00001111";
		C_TN_WATCHDOG_THESHOLD		: std_logic_vector(17 downto 0) := "000100000000000000";
		C_TN_MAX_SKIPPED_WRITES 	: std_logic_vector(15 downto 0) := "0000000000000000";
		C_TN_MAX_SKIPPED_READS  	: std_logic_vector(15 downto 0) := "0000000000000000";
		C_TN_DISABLE_MASTER			: std_logic := '0';					-- Disable the master functionality
		C_TN_DISABLE_SLAVE			: std_logic := '0';					-- Disable the slave functionality
		C_TN_DISABLE_ASYNC			: std_logic := '0'					-- Disable async functionality (async will still work for other nodes in the network, communication to a node with async disabled will be silently discarded)
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
end tosnet_cwrm_wrapper;

architecture behavioral of tosnet_cwrm_wrapper is

	signal power_up_reset_cnt	: unsigned(7 downto 0) := (others=>'1');
	signal power_up_reset		: std_logic;
	signal tosnet_reset			: std_logic;	
	signal node_id_locked		: std_logic := '0';
	signal node_id_reg			: std_logic_vector(3 downto 0) := "0000";

	signal sync_strobe			: std_logic;								-- Active high synchronization strobe (asserted for one clock cycle during synchronication)
	signal online					: std_logic;								-- Active high online indicator (asserted when network is configured and running)
	signal is_master				: std_logic;								-- Active high is_master indicator (asserted when current node is master)
	signal node_address			: std_logic_vector(3 downto 0); 		-- Address (position) of the node on the network relative to the master.
	signal packet_error			: std_logic;								-- Active high packet error indicator (asserted whenever the previously received packet was erroneous)
	signal system_halt			: std_logic;								-- Active high system halt signal (asserted when the max_skipped thresholds are exceeded)
	signal data_reg_read_ptr	: std_logic;								-- buffer index user data_reg read's are made from (system writes to opposite buffer)
	signal data_reg_write_ptr	: std_logic;								-- buffer index user data_reg write's are made to (system reads from opposite buffer)

	signal packet_counter		: std_logic_vector(31 downto 0);
	signal reset_counter			: std_logic_vector(31 downto 0);
	signal error_counter			: std_logic_vector(31 downto 0);

	signal async_in_data			: std_logic_vector(37 downto 0);
	signal async_out_data		: std_logic_vector(37 downto 0);
	signal async_in_full			: std_logic;
	signal async_out_empty		: std_logic;
	signal async_in_wr_en		: std_logic;
	signal async_out_rd_en		: std_logic;
	signal async_out_valid		: std_logic;
	
	signal tx_count_reg			: std_logic_vector(1 downto 0) := (others=>'0');
	signal tx_count_nxt			: std_logic_vector(1 downto 0);
	
	signal tx_nodeid_reg			: std_logic_vector(3 downto 0) := (others=>'0');
	signal tx_nodeid_nxt			: std_logic_vector(3 downto 0);
	
	signal rx_count_reg 			: std_logic_vector(1 downto 0) := (others=>'0');
	signal rx_count_nxt 			: std_logic_vector(1 downto 0);
	
	signal rx_nodeid_reg			: std_logic_vector(3 downto 0) := (others=>'0');
	signal rx_nodeid_nxt			: std_logic_vector(3 downto 0);
	
	signal commit_write			: std_logic;
	signal commit_read			: std_logic;
	signal data_reg_we			: std_logic_vector(0 downto 0);
	
	signal w_ack, w_err			: std_logic;
	signal r_ack, r_err			: std_logic;
	
	-- control register
	constant CTR_CW : integer := 0;
	constant CTR_RM : integer := 1;
	
	signal ctr_reg : std_logic_vector(1 downto 0) := "00";		--bit: |  1 |  0 |
	signal ctr_nxt : std_logic_vector(1 downto 0);					--     | RM | CW |	

	-- status register	

	signal str_ernp_reg : std_logic := '0';
	signal str_ernp_nxt : std_logic;
	
	signal str_ewnp_reg : std_logic := '0';
	signal str_ewnp_nxt : std_logic;		
	
	signal str_cwa_reg : std_logic := '0';
	signal str_cwa_nxt : std_logic;	
	
	
	-- event signals
	signal event_cw : std_logic;		-- Event set Commit Write
	signal event_wecw : std_logic;	-- Event Write Enable (data) while pending Commit Write	

begin

	-------------------------------------------------------
	-- TosNet powerup reset and node id register logic
	-------------------------------------------------------	
		process(clk_user_io_i)
		begin
			if rising_edge(clk_user_io_i) then
				if reset_i='1' then
					power_up_reset_cnt <= (others=>'1');
					power_up_reset <= '1';
					node_id_locked <= '0';
					node_id_reg <= "0000";
				elsif node_id_locked='0' then
					power_up_reset_cnt <= power_up_reset_cnt-1;
					power_up_reset <= '1';
					if power_up_reset_cnt=0 then
						node_id_locked <= '1';
						node_id_reg <= node_id_i;
					end if;
				else
					power_up_reset <= '0';
				end if;
			end if;			
		end process;
		
		tosnet_reset <= power_up_reset or reset_i;
		curr_node_id_o <= node_id_reg;
	-------------------------------------------------------
	
	-------------------------------------------------------
	-- TosNet core
	-------------------------------------------------------
	 tosnet_core_4_2_inst: entity work.tosnet_core							-- Ports marked with * are required
		generic map(
			disable_slave			=> C_TN_DISABLE_SLAVE,						-- Disable the slave functionality
			disable_master			=> C_TN_DISABLE_MASTER,						-- Disable the master functionality (can drastically reduce the amount of logic required for slave-only nodes)
			disable_async			=> C_TN_DISABLE_ASYNC,						-- Disable async functionality (async will still work for other nodes in the network, communication to a node with async disabled will be silently discarded)
			disable_commit_srreg	=> '1'											-- Disable use of Set/Reset registers on commit read+write inputs (use combinatorial inputs instead)
		)
		port map(
			sig_in					=> tosnet_sig_i,								--*The serial input signal
			sig_out					=> tosnet_sig_o,								--*The serial output signal
			clk_50M					=> clk_tosnet_50M_i,							--*The 50 MHz input clock
			
			reset						=> tosnet_reset,								-- Active high reset
			sync_strobe				=> sync_strobe,								-- Active high synchronization strobe (asserted for one clock cycle during synchronication)
			online					=> online,										-- Active high online indicator (asserted when network is configured and running)
			is_master				=> is_master,									-- Active high is_master indicator (asserted when current node is master)
			node_address			=> node_address, 								-- Address (position) of the node on the network relative to the master.
			packet_error			=> packet_error,								-- Active high packet error indicator (asserted whenever the previously received packet was erroneous)
			system_halt				=> system_halt,								-- Active high system halt signal (asserted when the max_skipped thresholds are exceeded)
			data_reg_read_ptr		=> data_reg_read_ptr,						-- buffer index user data_reg read's are made from (system writes to opposite buffer)
			data_reg_write_ptr	=> data_reg_write_ptr,						-- buffer index user data_reg write's are made to (system reads from opposite buffer)
			
			node_id					=> node_id_reg,								--*The id of the current node
			reg_enable				=> C_TN_NODE_REG,								--*Bit-vector describing which registers are enabled (a '1' indicates that the corresponding register is enabled, '0' that it is disabled)
			watchdog_threshold	=> C_TN_WATCHDOG_THESHOLD,					--*The threshold of the watchdog in 1.25 MHz clock cycles
			max_skipped_writes	=> C_TN_MAX_SKIPPED_WRITES,				--*The maximum amount of consecutive clock cycles without a write to the shared memory block (set to 0 to disable)
			max_skipped_reads		=> C_TN_MAX_SKIPPED_READS,					--*The maximum amount of consecutive clock cycles without a read from the shared memory block (set to 0 to disable)
			
			data_reg_addr			=> data_reg_addr_i, 							-- The address bus of the shared memory block
			data_reg_data_in		=> data_reg_data_i,							-- The input data bus to the shared memory block
			data_reg_data_out		=> data_reg_data_o,							-- The output data bus from the shared memory block
			data_reg_clk			=> clk_user_io_i,								-- The clock for the shared memory block
			data_reg_we				=> data_reg_we,								-- Active high write enable for the shared memory block
			
			network_reg_addr_ext	=> netwrk_reg_addr_i,						-- The address input for access to the TosNet network register
			network_reg_data_ext	=> netwrk_reg_data_o,						-- The data output from the TosNet network register
			network_reg_clk_ext	=> clk_user_io_i,								-- The clock used for access to the TosNet network register
			
			commit_write 			=> commit_write,								-- Active high signal to commit the out registers
			commit_read				=> commit_read,								-- Active high signal to commit the in registers
			
			reset_counter			=> reset_counter,								-- The number of resets since last configuration
			packet_counter			=> packet_counter,							-- The number of data packets transmitted since last configuration
			error_counter			=> error_counter,								-- The number of erroneous packets received since last configuration
			
			async_in_data			=> async_in_data,								-- The async input data bus
			async_out_data			=> async_out_data,							-- The async output data bus
			async_in_clk			=> clk_user_io_i,								-- The async input clock
			async_out_clk			=> clk_user_io_i,								-- The async output clock
			async_in_full			=> async_in_full,								-- Active high async input full indicator (asserted when async input buffer is full)
			async_out_empty		=> async_out_empty,							-- Active high async output empty indicator (asserted when async output buffer is empty)
			async_in_wr_en			=> async_in_wr_en,							-- Active high async input write enable
			async_out_rd_en		=> async_out_rd_en,							-- Active high async output read enable
			async_out_valid		=> async_out_valid							-- Active high async output valid indicator (asserted when valid data is present on the async output data bus)
		);
	-------------------------------------------------------
	
	-------------------------------------------------------
	-- TosNet status and counter synchronization process
	-------------------------------------------------------
		process(clk_user_io_i)
		begin
			if rising_edge(clk_user_io_i) then
				-- status register
				status_register_o(31) <= online;
				status_register_o(30) <= is_master;
				status_register_o(29) <= packet_error;
				status_register_o(28) <= system_halt;
				status_register_o(27) <= sync_strobe;
				status_register_o(26 downto 24) <= (others=>'0');
				status_register_o(23 downto 20) <= node_id_reg;
				status_register_o(19 downto 16) <= node_address;
				status_register_o(15 downto 9)  <= (others=>'0');
				status_register_o(8) <= str_ernp_nxt;			-- ERNP
				status_register_o(7) <= str_ewnp_nxt;			-- EWNP
				status_register_o(6) <= '0';
				status_register_o(5) <= str_cwa_nxt;			-- CWA
				status_register_o(4) <= '0';
				status_register_o(3) <= data_reg_read_ptr;	-- RP
				status_register_o(2) <= data_reg_write_ptr;	-- WP
				status_register_o(1) <= ctr_reg(CTR_RM); 		-- RMF
				status_register_o(0) <= ctr_reg(CTR_CW);		-- CWP
				
				str_ernp_reg <= str_ernp_nxt;
				str_ewnp_reg <= str_ewnp_nxt;
				str_cwa_reg	 <= str_cwa_nxt;
				
				-- packet counter
				packet_counter_o		<= packet_counter;
				
				-- reset counter			
				reset_counter_o		<= reset_counter;
				
				-- error counter
				error_counter_o		<= error_counter;
				
			end if;
		end process;
	-------------------------------------------------------
	
	-------------------------------------------------------
	-- TosNet control register logic
	-------------------------------------------------------
		-- synchronization process (sync control_reg to tosnet clock)
		process(clk_tosnet_50M_i)
		begin
			if rising_edge(clk_tosnet_50M_i) then
				-- control register
				ctr_reg <= ctr_nxt;
			end if;
		end process;
		
		-- control logic

			-- events			
			event_cw <= '1' when data_reg_ctr_i(CTR_CW)='1' and data_reg_ctr_we_i='1' else '0'; --	Event set Commit Write
			event_wecw <= '1' when ctr_reg(CTR_CW)='1' and data_reg_we_i='1' else '0';	-- Event Write Enable (data) while pending Commit Write	

			-- status CWA register logic
			str_cwa_nxt <= '1' when event_wecw='1' else		-- if data is written while a CW is pending => set CWA
								'0' when event_cw='1'   else		-- if CW is being set => clear CWA
								str_cwa_reg;
			
			-- status EWNP register logic
			str_ewnp_nxt <= '1' when w_err='1' else			-- set if write acknowledge=1
								 '0' when w_ack='1' else			-- clear if write acknowledge=0
								 str_ewnp_reg;
			
			-- status ERNP register logic
			str_ernp_nxt <= '1' when r_err='1' else			-- set if read acknowledge=1
								 '0' when r_ack='1' else			-- clear if read acknowledge=0
								 str_ernp_reg;								 

			-- CW control logic	
			ctr_nxt(CTR_CW) <= '0' when sync_strobe='1' or str_cwa_nxt='1' else	-- clear (automatically) on sync_strobe or CW abort
									 '1' when event_cw='1' 						 		else 	-- set (user) on Event set Commit Write
									 ctr_reg(CTR_CW);		
			
			-- RM control logic
			ctr_nxt(CTR_RM) <= data_reg_ctr_i(CTR_RM) when data_reg_ctr_we_i='1' else ctr_reg(CTR_RM);	-- write (user) on Write Enable (WE)			
			
				
			-- control reg -> tosnet mapping
			commit_write	<= ctr_reg(CTR_CW);			-- commit write (change writepointer)
			commit_read		<= not ctr_reg(CTR_RM);		-- commit read  (change readpointer)
			
	-------------------------------------------------------
	
	
	-------------------------------------------------------
	-- TosNet Shared Memory Access Control logic
	-------------------------------------------------------
		
		------------------------------------------
		-- Write control logic : verifies node has write permission to data_reg_addr
		------------------------------------------
		-- master: Write permission to its own IN+OUT registers, slave node IN registers
		-- slave : Write permission to its own OUT registers
			
			data_reg_we(0)		<= '1' when data_reg_we_i='1' and data_reg_addr_i(2)='0' and data_reg_addr_i(9 downto 6)=node_id_reg else	-- master/slave can only write to its own OUT registers
										'1' when is_master='1' and data_reg_we_i='1' and data_reg_addr_i(2)='1' else	-- master can write to all IN registers
										'0';
			
			w_ack	<= '1' when data_reg_we="1" else '0';
			w_err	<= '1' when data_reg_we="0" and data_reg_we_i='1' else '0';
						
			data_reg_w_ack_o	<= w_ack;
			data_reg_w_err_o	<= w_err;
		------------------------------------------
		
		------------------------------------------
		-- Read control logic : verifies node has read permission to data_reg_addr
		------------------------------------------
		-- master: Read permission to its all registers
		-- slave : Read permission to its own IN and all OUT registers
			
			r_ack	<= '1' when is_master='1' and data_reg_re_i='1' else
						'1' when is_master='0' and data_reg_re_i='1' and data_reg_addr_i(2)='0' else
						'1' when is_master='0' and data_reg_re_i='1' and data_reg_addr_i(2)='1' and data_reg_addr_i(9 downto 6)=node_id_reg else
						'0';
				
			r_err	<= '1' when is_master='0' and data_reg_re_i='1' and data_reg_addr_i(2)='1' and not(data_reg_addr_i(9 downto 6)=node_id_reg) else
						'0';
			
			data_reg_r_ack_o	<= r_ack;
			data_reg_r_err_o	<= r_err;
		------------------------------------------
		
	-------------------------------------------------------
	
	
	---------------------------------------------------------
	-- asyncronous data transfer register process
	---------------------------------------------------------
		process(clk_user_io_i)
		begin
			if rising_edge(clk_user_io_i) then
				tx_count_reg   <= tx_count_nxt;
				tx_nodeid_reg  <= tx_nodeid_nxt;
				rx_count_reg	<= rx_count_nxt;	
				rx_nodeid_reg	<= rx_nodeid_nxt;
			end if;
		end process;
	---------------------------------------------------------

	---------------------------------------------------------
	-- Asyncronous data TX transfer logic
	---------------------------------------------------------
	-- if master: node can transmit async data to any slave node	  (tx_nodeid can be the nodeid of any slave node or "0000" for broadcast)
	-- if slave: node can only respond to async data from the master (tx_nodeid can only be node_id_reg)
		
		tx_count_nxt  <= async_tx_ctr_i(5 downto 4) when async_tx_ctr_we_i='1' else tx_count_reg;
		
		tx_nodeid_nxt <= async_tx_ctr_i(3 downto 0) when is_master='1' and async_tx_ctr_we_i='1' else 
							  node_id_reg 				  	  when is_master='0' 								  else
							  tx_nodeid_reg;
					
		async_tx_str_o <= async_in_full & tx_count_reg & tx_nodeid_reg;

		async_in_data  <= tx_count_reg & tx_nodeid_reg & async_tx_data_i;
		async_in_wr_en <= async_tx_data_we_i;
	
	---------------------------------------------------------
	
	---------------------------------------------------------
	-- Asyncronous data RX transfer logic
	---------------------------------------------------------	
		async_rx_str_o <= async_out_empty & async_out_valid & async_out_data(37 downto 36) & async_out_data(35 downto 32);
		async_rx_data_o <= async_out_data(31 downto 0);
		async_out_rd_en <= async_rx_data_re_i;
	---------------------------------------------------------
	

end behavioral;

