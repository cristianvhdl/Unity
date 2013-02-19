----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    13:43:30 03/09/2012 
-- Design Name: 
-- Module Name:    db_cwrm_ctrl_reg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- This module extends the DB_CWRM_CTRL module in order to provide control 
-- and status registers to the generic Master/Slave controller for use in 
-- a Double Buffered Commit-Write<>Read-Multiple Memory controller scheme 
-- targeted for use with TosNet and uTosNet.
--
-- The module can be configured to work either as a Master 
-- or Slave side controller:
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
-- 							 CONTROL REGISTER
--  --------------------------------------------------------------
--  | bit no | label | Access right     	  | Description 		  |
--  |    0   |  CW   | set:user, clear:auto | Commit Write req   | Set when user writes 1 to CW, automatically cleared on CW acknowledge, CW aborted or CW timeout.
--  |    1   |  RM   | write:user           | Read Multiple flag | Written by user.
--  --------------------------------------------------------------
--
-- 							 STATUS REGISTER
--  ---------------------------------------------------------------
--  | bit no | label  | Access right | Description 					|
--  |    0   |  CWP   | read:user 	 | Commit Write Pending     	| Equal to value of CW.
--  |    1   |  RMF   | read:user    | Read Multiple Flag			| Equal to value of RM.
--  |    2   |  WP    | read:user    | Write Pointer 					| Write Pointer (controlled internally)
--  |    3   |  RP    | read:user    | Read Pointer 					| Read Pointer  (controlled by the other side [opposing controller])
--  |    4   |  CWB   | read:user    | Commit Write Blocked 		| Set according to the BCW input (controlled by the other side)
--  |    5   |  CWA   | read:user    | Commit Write Aborted 		| Set if user writes data to the memory while CWP=1, Cleared when user writes 1 to CW
--  |    6   |  ECWT  | read:user    | Error Commit Write Timeout | Set if cw_timer==C_CW_TIMEOUT and BCW=1, Cleared when user writes 1 to CW
--  |    7   |  EWNP  | read:user    | Error Write Not Permitted 	| Set if w_err_o==1, cleared if w_ack_o==1 (The status of the last write attempt can be read here)
--  ---------------------------------------------------------------
--
-- 								  GENERICS
-- --------------------------------------------------------------
--  C_IO_ADDR_BIT : selects the address bit which determines 
--  					  whether the address is an input or output 
--					     address.
--
--  C_WRITE_POLARITY :
--
--  	Input addresses  : addr[2] = 1
--  	Output addresses : addr[2] = 0
-- 
--   	1 : (master mode) -> read+write input addresses, read output
--   	0 : (slave mode)  -> read input addresses, read+write output
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
-- --------------------------------------------------------------
--
-- Dependencies:
--		
--		library: work
--			- db_cwrm_ctrl.vhd
-- 	
--		library: utility_v01_00_a
--			- log_pkg
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01 		09/03-2012 	ANLAN		File Created.
-- 0.02 		22/03-2012 	ANLAN		C_IO_ADDR_BIT generic added.
-- 0.03 		23/03-2012 	ANLAN		w_ack_o + w_err_o outputs+logic added, EWNP added to status register.
--	1.00		17/10-2012	ANLAN		Headers updated and licensing info added, first official package release.
-- 1.01		
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
use ieee.numeric_std.all;

library utility_v01_00_a;
use utility_v01_00_a.log_pkg.all;

entity db_cwrm_ctrl_reg is
	generic (
		C_IO_ADDR_BIT : integer range 0 to 31 		:= 2;	-- default: 2 (TosNet mode)
		C_WRITE_POLARITY : integer range 0 to 1 	:= 1;
		C_ADDR_WIDTH : integer range 0 to 64 		:= 10;
		C_DATA_WIDTH : integer range 8 to 64 		:= 32;
		C_CW_TIMEOUT : natural 					 		:= 10	 -- 0: disabled, 1+: timeout enabled (C_CW_TIMEOUT = timeout latency in clock cycles)
	);
	port ( 
		clk_i 	: in  std_logic;
		reset_i 	: in  std_logic;
		
		-- user ports
		ctr_i  	: in  std_logic_vector(1 downto 0);						-- control register data in
		ctr_we_i : in  std_logic;												-- control register write enable
		str_o  	: out std_logic_vector(7 downto 0);						-- status register data out
				
		adr_i 	: in  std_logic_vector (C_ADDR_WIDTH-1 downto 0);	-- address
		data_i	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);	-- data in	(wr)
		we_i 		: in  std_logic;												-- write enable
		w_ack_o  : out std_logic;												-- write acknowledge, combinatorial feedback
		w_err_o  : out std_logic;												-- write error (not permitted), combinatorial feedback
		data_o	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);	-- data out (rd)		
		
		-- db cwrm ctrl ports
		bcw_i		: in std_logic;								-- block commit write input
		rp_o		: out std_logic;								-- readpointer output (writepointer negated)
		
		bcw_o		: out std_logic;								-- block commit write output
		rp_i		: in std_logic;								-- readpointer input
		
		-- memory A ports
		we_a_o	: out std_logic;
		adr_a_o 	: out std_logic_vector (C_ADDR_WIDTH-1 downto 0);
		data_a_i	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		data_a_o	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
		
		-- memory B ports
		we_b_o	: out std_logic;
		adr_b_o 	: out std_logic_vector (C_ADDR_WIDTH-1 downto 0);
		data_b_i	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		data_b_o	: out std_logic_vector (C_DATA_WIDTH-1 downto 0)
		);
end db_cwrm_ctrl_reg;

architecture Behavioral of db_cwrm_ctrl_reg is

	-- control register
	constant CTR_CW : integer := 0;
	constant CTR_RM : integer := 1;
	
	signal ctr_reg : std_logic_vector(1 downto 0) := "00";		--bit: |  1 |  0 |
	signal ctr_nxt : std_logic_vector(1 downto 0);					--     | RM | CW |
	
	-- status register
	signal str : std_logic_vector(7 downto 0); 						--bit: |   7  |   6  |  5  |  4  |  3 |  2 |  1  |  0  |
																					--     | EWNP | ECWT | CWA | CWB | RP | WP | RMF | CWP |

	signal str_cwa_reg : std_logic := '0';
	signal str_cwa_nxt : std_logic;
	
	signal str_ecwt_reg : std_logic := '0';
	signal str_ecwt_nxt : std_logic;
	
	signal str_ewnp_reg : std_logic := '0';
	signal str_ewnp_nxt : std_logic;	

	signal w_ack 	: std_logic;
	signal w_err 	: std_logic;
	signal rm 		: std_logic;
	signal cw_ack 	: std_logic;

	signal rp_out : std_logic;
	
	signal timer_reg : unsigned(log2r(C_CW_TIMEOUT+1)-1 downto 0) := (others=>'0');
	signal timer_nxt : unsigned(log2r(C_CW_TIMEOUT+1)-1 downto 0);
	
	signal event_cw : std_logic;		-- Event set Commit Write
	signal event_wecw : std_logic;	-- Event Write Enable while pending Commit Write
		
begin

	event_cw <= '1' when ctr_i(CTR_CW)='1' and ctr_we_i='1' else '0';
	event_wecw <= '1' when ctr_reg(CTR_CW)='1' and we_i='1' else '0';

	-- control register input mapping and logic
	ctr_nxt(CTR_CW) <= '0' when cw_ack='1' or str_cwa_nxt='1' or str_ecwt_nxt='1' else	-- clear (automatically) on CW acknowledge or CW abort or CW timeout
							 '1' when event_cw='1' 							else 	-- set (user) on Event set Commit Write
							 ctr_reg(CTR_CW);

	ctr_nxt(CTR_RM) <= ctr_i(CTR_RM) when ctr_we_i='1' else ctr_reg(CTR_RM);	-- write (user) on Write Enable (WE)


	-- status CWA register logic
	str_cwa_nxt <= '1' when event_wecw='1' else		-- if data is written while a CW is pending => set CWA
						'0' when event_cw='1'   else		-- if CW is being set => clear CWA
						str_cwa_reg;
	
	-- status EWNP register logic
	str_ewnp_nxt <= '1' when w_err='1' else
						 '0' when w_ack='1' else
						 str_ewnp_reg;
	
	C_CW_TIMEOUT_GEN:
   if C_CW_TIMEOUT>0 generate
      begin			
		-- status ECWT register logic
		str_ecwt_nxt <= '1' when timer_reg=C_CW_TIMEOUT and bcw_i='1' else		-- if timer = limit and BCW=1 => set Commit Write Timeout (CWT)
							 '0' when event_cw='1'   		  else		-- if CW is being set => clear CWT
						    str_ecwt_reg;
							
		-- timer logic
		timer_nxt <= timer_reg + 1 when ctr_reg(CTR_CW)='1' else	-- if pending CW => increment timer
						 (others=>'0') when (str_ecwt_reg='1' and event_cw='1') or ctr_reg(CTR_CW)='0' else	-- if CWT==1 and CW is being set OR CW==0 => clear timer
						 timer_reg;
	end generate;
		
	-- register process
	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if reset_i='1' then
				ctr_reg <= (others=>'0');
				str_cwa_reg <= '0';
				str_ecwt_reg <= '0';
				str_ewnp_reg <= '0';
				timer_reg <= (others=>'0');
			else
				ctr_reg <= ctr_nxt;
				str_cwa_reg <= str_cwa_nxt;				
				str_ewnp_reg <= str_ewnp_nxt;
				
				IF C_CW_TIMEOUT>0 then
					str_ecwt_reg <= str_ecwt_nxt;
					timer_reg <= timer_nxt;
				END IF;
				
			end if;
		end if;
	end process;
	
	-- Status register mappings
	str(7) <= str_ewnp_reg; -- EWNP: Error Write Not Permitted (when we_i=1 set if w_err=1, cleared if w_ack=1)
	str(6) <= str_ecwt_reg;	-- ECWT: Error Commit Write Timeout (while CW is pending a timer is incremented each clock, if timer_cnt>MAX => CWT is set) (autom. cleared uppon next CW)
	str(5) <= str_cwa_reg;	-- CWA: Commit Write Aborted	(a pending commit will be aborted if data is written before the commit is acknowledged) (autom. cleared uppon next CW)
	str(4) <= bcw_i;			-- CWB: Commit Write Blocked
	str(3) <= rp_i;			-- RP: Read Pointer
	str(2) <= not rp_out; 	-- WP: Write Pointer
	str(1) <= ctr_reg(CTR_RM);	-- RM: Reading Multiple
	str(0) <= ctr_reg(CTR_CW);	-- CW: Commit Write pending
	
	-- status register output mappings
	str_o <= str;
	rp_o <= rp_out;

	---------------------------------------------
	-- db_cwrm_ctrl instance
		
		rm <= ctr_reg(CTR_RM) or ctr_nxt(CTR_RM);		-- nxt OR reg (insures the bcw_o is asserted before the first read cycle)
		
		db_cwrm_ctrl_inst : entity work.db_cwrm_ctrl
		generic map(
			C_IO_ADDR_BIT		=> C_IO_ADDR_BIT,
			C_WRITE_POLARITY 	=> C_WRITE_POLARITY,
			C_ADDR_WIDTH 		=> C_ADDR_WIDTH,
			C_DATA_WIDTH 		=> C_DATA_WIDTH
		)
		port map( 
			clk_i 	=> clk_i,
			reset_i 	=> reset_i,
			
			-- user ports
			rm_i		=> rm,
			cw_i		=> ctr_reg(CTR_CW),
			cw_ack_o	=> cw_ack,
			
			we_i 		=> we_i,
			w_ack_o  => w_ack,
			w_err_o  => w_err,
			adr_i 	=> adr_i,
			data_i	=> data_i,
			data_o	=> data_o,
			
			-- db cwrm ctrl ports
			bcw_i		=> bcw_i,
			rp_o		=> rp_out,
			
			bcw_o		=> bcw_o,
			rp_i		=> rp_i,
			
			-- memory A ports
			we_a_o	=> we_a_o,
			adr_a_o 	=> adr_a_o,
			data_a_i	=> data_a_i,
			data_a_o	=> data_a_o,
			
			-- memory B ports
			we_b_o	=> we_b_o,
			adr_b_o 	=> adr_b_o,
			data_b_i	=> data_b_i,
			data_b_o	=> data_b_o
			);		
		
		-- output mappings
		w_ack_o  <= w_ack;
		w_err_o  <= w_err;
	---------------------------------------------
	
end Behavioral;

