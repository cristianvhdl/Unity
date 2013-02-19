----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:17:05 10/16-2012 
-- Design Name: 
-- Module Name:    db_mem_cwrm - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- This module implements a simplified interface (using records) of the 
--	DB_CWRM_MEM module.
--
-- The DB_CWRM_MEM module uses the DB_CWRM_CTRL module and the DB_CWRM_CTRL_REG module 
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
--		library: work
--			- db_mem_pkg.vhd
--			- db_cwrm_mem.vhd
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		10/16-2012	ANLAN		File created.
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

use work.db_mem_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE ram_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity db_mem_cwrm is
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
		m_db_i 		: in  db_mem_cwrm_i_if;
		m_db_o 		: out db_mem_cwrm_o_if;
		
		-- slave io
		s_db_i 		: in  db_mem_cwrm_i_if;
		s_db_o 		: out db_mem_cwrm_o_if
	);
end db_mem_cwrm;

architecture structural of db_mem_cwrm is	
	
	signal m_str, s_str : std_logic_vector(7 downto 0);
	
	signal m_adr_i  : std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal m_data_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal m_data_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	
	signal s_adr_i  : std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal s_data_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal s_data_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);
		
begin

	m_adr_i	<= m_db_i.adr(m_adr_i'range);
	m_data_i <= m_db_i.data(m_data_i'range);
	m_db_o.data(m_data_o'range) <= m_data_o;
	
	s_adr_i	<= s_db_i.adr(s_adr_i'range);
	s_data_i <= s_db_i.data(s_data_i'range);
	s_db_o.data(s_data_o'range) <= s_data_o;
	
	db_cwrm_mem_inst : entity work.db_cwrm_mem
		generic map(
			C_IO_ADDR_BIT 			=> C_IO_ADDR_BIT,
			C_ADDR_WIDTH 			=> C_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH,
			C_CW_TIMEOUT 			=> C_CW_TIMEOUT,
			C_RST_ON_CW_TIMEOUT 	=> C_RST_ON_CW_TIMEOUT
		)
		port map( 
			clk_i    	=> clk_i,
			reset_i  	=> reset_i,
			
			-- master io
			m_ctr_i  	=> m_db_i.ctr,
			m_ctr_we_i 	=> m_db_i.ctr_we,
			m_str_o  	=> m_str,
					
			m_adr_i 		=> m_adr_i,
			m_data_i		=> m_data_i,
			m_we_i 		=> m_db_i.we,
			m_w_ack_o   => m_db_o.w_ack,
			m_w_err_o   => m_db_o.w_err,
			m_data_o		=> m_data_o,
			
			-- slave io
			s_ctr_i  	=> s_db_i.ctr,
			s_ctr_we_i 	=> s_db_i.ctr_we,
			s_str_o  	=> s_str,
					
			s_adr_i 		=> s_adr_i,
			s_data_i		=> s_data_i,
			s_we_i 		=> s_db_i.we,
			s_w_ack_o   => s_db_o.w_ack,
			s_w_err_o   => s_db_o.w_err,
			s_data_o		=> s_data_o
		);	
	
	m_db_o.str <= x"00" & s_str & x"00" & m_str;
	s_db_o.str <= x"00" & m_str & x"00" & s_str;
	
end structural;