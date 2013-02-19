----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:35:40 03/06/2012 
-- Design Name: 
-- Module Name:    db_cwrm_mem - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- This module uses the DB_CWRM_CTRL module and the DB_CWRM_CTRL_REG module 
-- to implement a Double Buffered Commit-Write<>Read-Multiple Memory controller 
-- scheme targeted for use with TosNet and uTosNet.
--
-- This module contains two true dual ported memories and two memory controllers:
-- a master and slave controller.
--
-- The Master side always reads Output addresses from 
-- the opposite memory of what the Slave side writes to!
-- I.e. the Slave side r_ptr is controlled be the Master 
-- sides w_ptr: r_ptr_slave = not(w_ptr_master)
--
-- The Slave side always reads Input addresses from 
-- the opposite memory of what the Master side writes to!
-- I.e. the Master side r_ptr is controlled be the Slave 
-- sides w_ptr: r_ptr_master = not(w_ptr_slave)
-- 
-- When the CW (Commit Write) flag of a controller is asserted the w_ptr
-- is negated and hence also the r_ptr of the opposite controller.
-- But the opposing controller will block this w_ptr<>r_ptr switch during 
-- reads of a value or values spanning multiple address locations, 
-- if the RM (Read multiple) flag is asserted.
--
--
-- 							MASTER CONTROL REGISTER
--  --------------------------------------------------------------
--  | bit no | label | Access right     	  | Description 		  |
--  |    0   |  CW   | set:user, clear:auto | Commit Write req   | Set when user writes 1 to CW, automatically cleared on CW acknowledge, CW aborted or CW timeout.
--  |    1   |  RM   | write:user           | Read Multiple flag | Written by user.
--  --------------------------------------------------------------
--
-- 							MASTER STATUS REGISTER
--  ---------------------------------------------------------------
--  | bit no | label  | Access right | Description 					|
--  |    0   |  CWP   | read:user 	 | Commit Write Pending     	| Equal to value of CW.
--  |    1   |  RMF   | read:user    | Read Multiple Flag			| Equal to value of RM.
--  |    2   |  WP    | read:user    | Write Pointer 					| Write Pointer (controlled by the master side)
--  |    3   |  RP    | read:user    | Read Pointer 					| Read Pointer  (controlled by the slave side)
--  |    4   |  CWB   | read:user    | Commit Write Blocked 		| Set according to the BCW input (controlled by the other side)
--  |    5   |  CWA   | read:user    | Commit Write Aborted 		| Set if user writes data to the memory while CWP=1, Cleared when user writes 1 to CW
--  |    6   |  ECWT  | read:user    | Error Commit Write Timeout | Set if cw_timer==C_CW_TIMEOUT and BCW=1, Cleared when user writes 1 to CW
--  |    7   |  EWNP  | read:user    | Error Write Not Permitted 	| Set if w_err_o==1, cleared if w_ack_o==1 (The status of the last write attempt can be read here)
--  ---------------------------------------------------------------
--
-- 							SLAVE CONTROL REGISTER
--  --------------------------------------------------------------
--  | bit no | label | Access right     	  | Description 		  |
--  |    0   |  CW   | set:user, clear:auto | Commit Write req   | Set when user writes 1 to CW, automatically cleared on CW acknowledge, CW aborted or CW timeout.
--  |    1   |  RM   | write:user           | Read Multiple flag | Written by user.
--  --------------------------------------------------------------
--
-- 							SLAVE STATUS REGISTER
--  ---------------------------------------------------------------
--  | bit no | label  | Access right | Description 					|
--  |    0   |  CWP   | read:user 	 | Commit Write Pending     	| Equal to value of CW.
--  |    1   |  RMF   | read:user    | Read Multiple Flag			| Equal to value of RM.
--  |    2   |  WP    | read:user    | Write Pointer 					| Write Pointer (controlled by the slave side)
--  |    3   |  RP    | read:user    | Read Pointer 					| Read Pointer  (controlled by the master side)
--  |    4   |  CWB   | read:user    | Commit Write Blocked 		| Set according to the BCW input (controlled by the other side)
--  |    5   |  CWA   | read:user    | Commit Write Aborted 		| Set if user writes data to the memory while CWP=1, Cleared when user writes 1 to CW
--  |    6   |  ECWT  | read:user    | Error Commit Write Timeout | Set if cw_timer==C_CW_TIMEOUT and BCW=1, Cleared when user writes 1 to CW
--  |    7   |  EWNP  | read:user    | Error Write Not Permitted 	| Set if w_err_o==1, cleared if w_ack_o==1 (The status of the last write attempt can be read here)
--  ---------------------------------------------------------------
--
-- 								  GENERICS
-- --------------------------------------------------------------
--  C_IO_ADDR_BIT : selects the address bit which determines 
--  					  whether the address is an input or an output 
--					     address.
--
--   	Master access rights: 	read+write input addresses
--										read output addresses
--
--   	Slave access rights: 	read input addresses
--										read+write output addresses
--
--  C_ADDR_WIDTH : Address bitwidth of the memory
-- 
--  C_DATA_WIDTH : Data bitwidth of the memory
--
--  C_CW_TIMEOUT : Commit Write Timeout
-- 
--   	0  : disabled
--   	1+ : timeout enabled 
--	    	  (C_CW_TIMEOUT = timeout latency in clock cycles)
--			  Describes number of clock cycles a pending CW is 
--			  allowed to be blocked before a timeout is generated.
--
--  C_RST_ON_CW_TIMEOUT: Reset on Commit Write Timeout
--
--   	0 : disabled (default)
--   	1 : enabled 
-- --------------------------------------------------------------
--
-- Dependencies: 
--
-- db_cwrm_ctrl_reg.vhd
--
-- Revision: 
-- Revision 0.01 - 03/06/2012 - File Created
-- Revision 0.02 - 03/22/2012 - C_IO_ADDR_BIT generic added
-- Revision 0.03 - 03/22/2012 - C_DATA_RES generic + ram_be_rwrw added to support byte-enable read+write
-- Revision 0.04 - 03/27/2012 - REMOVED: C_DATA_RES generic + ram_be_rwrw supporting byte-enable read+write
-- Revision 0.05
--
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;

library ram_v01_00_a;
use ram_v01_00_a.all;

entity db_cwrm_mem is
	generic(
		C_IO_ADDR_BIT 	: integer range 0 to 31 		:= 2;		-- default: 2 (TosNet mode)
		C_ADDR_WIDTH 	: integer range 0 to 32 		:= 10;
		C_DATA_WIDTH 	: integer range 8 to 32 		:= 32;	-- must be in hole byte sizes i.e. [8, 16, 32, 64]
		C_CW_TIMEOUT 	: natural 							:= 10;
		C_RST_ON_CW_TIMEOUT : integer range 0 to 1 	:= 0
	);
	port ( 
		clk_i    	: in  std_logic;
      reset_i  	: in  std_logic;
		
		-- master io
		m_ctr_i  	: in  std_logic_vector(1 downto 0);
		m_ctr_we_i 	: in  std_logic;
		m_str_o  	: out std_logic_vector(7 downto 0);
				
		m_adr_i 		: in  std_logic_vector (C_ADDR_WIDTH-1 downto 0);	-- address
		m_data_i		: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);	-- data in	(wr)
		m_we_i 		: in  std_logic;												-- write enable
		m_w_ack_o   : out std_logic;												-- write acknowledge, combinatorial feedback
		m_w_err_o   : out std_logic;												-- write error (not permitted), combinatorial feedback		
		m_data_o		: out std_logic_vector (C_DATA_WIDTH-1 downto 0);	-- data out (rd)
		
		-- slave io
		s_ctr_i  	: in  std_logic_vector(1 downto 0);
		s_ctr_we_i 	: in  std_logic;
		s_str_o  	: out std_logic_vector(7 downto 0);
				
		s_adr_i 		: in  std_logic_vector (C_ADDR_WIDTH-1 downto 0);	-- address
		s_data_i		: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);	-- data in	(wr)
		s_we_i 		: in  std_logic;												-- write enable
		s_w_ack_o   : out std_logic;												-- write acknowledge, combinatorial feedback
		s_w_err_o   : out std_logic;												-- write error (not permitted), combinatorial feedback
		s_data_o		: out std_logic_vector (C_DATA_WIDTH-1 downto 0)	-- data out (rd)
	);
end db_cwrm_mem;

architecture structural of db_cwrm_mem is
	
	signal m_str	: std_logic_vector(7 downto 0);
	signal s_str	: std_logic_vector(7 downto 0);
	
	signal bcw_m	: std_logic;	-- block commit write master (slave -> master)
	signal r_ptr_s	: std_logic;	-- read pointer slave (master -> slave)
	
	signal bcw_s	: std_logic;	-- block commit write slave (master -> slave)
	signal r_ptr_m	: std_logic;	-- read pointer master (slave -> master)

	signal m_we_a 		: std_logic;
	signal m_adr_a 	: std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal m_data_a_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal m_data_a_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);

	signal m_we_b 		: std_logic;
	signal m_adr_b 	: std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal m_data_b_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal m_data_b_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	
	signal s_we_a 		: std_logic;
	signal s_adr_a 	: std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal s_data_a_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal s_data_a_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);

	signal s_we_b 		: std_logic;
	signal s_adr_b 	: std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal s_data_b_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal s_data_b_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);

	signal cwt_reset  : std_logic;
	signal reset 	   : std_logic;
		
begin
	
	cwt_reset <= '1' when C_RST_ON_CW_TIMEOUT=1 and (m_str(6)='1' or s_str(6)='1') else '0';
	reset <= cwt_reset or reset_i;

	db_cwrm_ctrl_reg_master : entity work.db_cwrm_ctrl_reg
	generic map(
		C_IO_ADDR_BIT		=> C_IO_ADDR_BIT,
		C_WRITE_POLARITY 	=> 1,
		C_ADDR_WIDTH 		=> C_ADDR_WIDTH,
		C_DATA_WIDTH 		=> C_DATA_WIDTH,
		C_CW_TIMEOUT 		=> C_CW_TIMEOUT
	)
	port map( 
		clk_i 	=> clk_i,
		reset_i 	=> reset,
		
		-- user ports
		ctr_i  	=> m_ctr_i,
		ctr_we_i => m_ctr_we_i,
		str_o  	=> m_str,
		
		we_i 		=> m_we_i,
		w_ack_o	=> m_w_ack_o,
		w_err_o	=> m_w_err_o,
		adr_i 	=> m_adr_i,
		data_i	=> m_data_i,
		data_o	=> m_data_o,
		
		-- db cwrm ctrl ports
		bcw_i		=> bcw_m,
		rp_o		=> r_ptr_s,
		
		bcw_o		=> bcw_s,
		rp_i		=> r_ptr_m,
		
		-- memory A ports
		we_a_o	=> m_we_a,
		adr_a_o 	=> m_adr_a,
		data_a_i	=> m_data_a_i,
		data_a_o	=> m_data_a_o,
		
		-- memory B ports
		we_b_o	=> m_we_b,
		adr_b_o 	=> m_adr_b,
		data_b_i	=> m_data_b_i,
		data_b_o	=> m_data_b_o
		);
	
	m_str_o <= m_str;
	
	db_cwrm_ctrl_reg_slave : entity work.db_cwrm_ctrl_reg
	generic map(
		C_IO_ADDR_BIT		=> C_IO_ADDR_BIT,
		C_WRITE_POLARITY 	=> 0,
		C_ADDR_WIDTH 		=> C_ADDR_WIDTH,
		C_DATA_WIDTH 		=> C_DATA_WIDTH,
		C_CW_TIMEOUT 		=> C_CW_TIMEOUT
	)
	port map( 
		clk_i 	=> clk_i,
		reset_i 	=> reset,
		
		-- user ports
		ctr_i  	=> s_ctr_i,
		ctr_we_i => s_ctr_we_i,
		str_o  	=> s_str,
		
		we_i 		=> s_we_i,
		w_ack_o	=> s_w_ack_o,
		w_err_o	=> s_w_err_o,		
		adr_i 	=> s_adr_i,
		data_i	=> s_data_i,
		data_o	=> s_data_o,
		
		-- db cwrm ctrl ports
		bcw_i		=> bcw_s,
		rp_o		=> r_ptr_m,
		
		bcw_o		=> bcw_m,
		rp_i		=> r_ptr_s,
		
		-- memory A ports
		we_a_o	=> s_we_a,
		adr_a_o 	=> s_adr_a,
		data_a_i	=> s_data_a_i,
		data_a_o	=> s_data_a_o,
		
		-- memory B ports
		we_b_o	=> s_we_b,
		adr_b_o 	=> s_adr_b,
		data_b_i	=> s_data_b_i,
		data_b_o	=> s_data_b_o
		);		

	s_str_o <= s_str;
	
	ram_a : entity ram_v01_00_a.ram_rwrw
		generic map( 
			ADDR_WIDTH    => C_ADDR_WIDTH,
			DATA_WIDTH    => C_DATA_WIDTH,
			RAMSTYLE      => "AUTO",
			PIPE_REGA_EN  => 0,
			PIPE_REGB_EN  => 0,
			INIT_DATA     => 0
			)
		port map( 
			clk_a_i    => clk_i,
			enable_a_i => '1',
			we_a_i     => m_we_a,
			addr_a_i   => m_adr_a,
			data_a_i   => m_data_a_o,
			data_a_o   => m_data_a_i,

			clk_b_i    => clk_i,
			enable_b_i => '1',
			we_b_i     => s_we_a,
			addr_b_i   => s_adr_a,
			data_b_i   => s_data_a_o,
			data_b_o   => s_data_a_i
			);
			
	ram_b : entity ram_v01_00_a.ram_rwrw
		generic map( 
			ADDR_WIDTH    => C_ADDR_WIDTH,
			DATA_WIDTH    => C_DATA_WIDTH,
			RAMSTYLE      => "AUTO",
			PIPE_REGA_EN  => 0,
			PIPE_REGB_EN  => 0,
			INIT_DATA     => 0
			)
		port map( 
			clk_a_i    => clk_i,
			enable_a_i => '1',
			we_a_i     => m_we_b,
			addr_a_i   => m_adr_b,
			data_a_i   => m_data_b_o,
			data_a_o   => m_data_b_i,

			clk_b_i    => clk_i,
			enable_b_i => '1',
			we_b_i     => s_we_b,
			addr_b_i   => s_adr_b,
			data_b_i   => s_data_b_o,
			data_b_o   => s_data_b_i
			);			

end structural;

