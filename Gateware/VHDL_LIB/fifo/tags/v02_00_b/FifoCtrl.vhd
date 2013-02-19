----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange	(ANLAN)
-- 
-- Create Date:    15:37:00 06/04-2010 
-- Design Name: 
-- Module Name:    FifoCtrl - Behavioral 
-- Project Name: 
-- Target Devices: Spartan3, Spartan6 and Virtex6
-- Tool versions:	 
-- Description: 
--
--		Parameterized Asynchronous/Synchronous FIFO control circuitry
--
--		Default generic config:
--			ADDR_WIDTH = 4 - Register depth: 16 (4 address bits)
--			CLOCK_MODE = 1 - Asynchronous Fifo mode
--			READ_MODE  = 1 - Synchronous Data output
--			SYNC_DEPTH = 2 - Synchronizer depth: 2 levels
--			PRE_LOAD   = 2 - Pre load number: 2 words
--
-- Dependencies:
--
--			FifoReadPort.vhd
--			FifoWritePort.vhd
--			Synchroniser.vhd
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01 		06/04-2010	ANLAN 	File Created
-- 0.02 		22/04-2010	ANLAN 	Error regarding clk assignement for the synchronisers corrected
-- 0.03 		23/04-2010	ANLAN 	DEPTH generic changed to ADDR_WIDTH
-- 0.04 		29/04-2010	ANLAN 	SYNC_DEPTH generic added, two_ff_n_sync.vhd replaced by synchroniser.vhd
-- 0.05 		10/05-2010	ANLAN 	Copyright conditions & disclamer added.
-- 0.06 		12/06-2010	ANLAN 	PRE_LOAD generic added.
-- 1.00  	12/06-2010	ANLAN 	Offical release
-- 1.90		06/11-2010 	ANLAN		MODE_ASYNC generic + conditional synthesis code added for support of synchronous and asynchronous fifo modes
-- 1.91		06/11-2010 	ANLAN		New Header & Copyright added, old Copyright conditions & disclamer removed
-- 1.92  	10/10-2012	ANLAN		New Header & Copyright added (Unity), obsolete component declarations removed
-- 1.93		
--
-- Additional Comments:
-- Based on listing 16.16 from "RTL Hardware Design using VHDL" by Pong P. Chu
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
use ieee.numeric_std.all;

entity fifo_ctrl is
   generic(
		ADDR_WIDTH	: natural					:= 4;	-- Address width (depth)
		CLOCK_MODE	: natural range 0 to 1 	:= 1; -- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
		READ_MODE	: natural range 0 to 1 	:= 1;	-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out			  
		SYNC_DEPTH	: natural					:= 2;	-- Synchronizer depth
		PRE_LOAD		: natural					:= 2 	-- Write<>Read Ptr offset before deasserting empty signal (read logic)			  
	);
   port(
      clkw_i	: in  std_logic;
      resetw_i	: in  std_logic;
      wr_i		: in  std_logic;
      full_o	: out std_logic;
      w_addr_o	: out std_logic_vector (ADDR_WIDTH-1 downto 0);
      clkr_i	: in  std_logic;
      resetr_i	: in  std_logic;
      rd_i		: in  std_logic;
      empty_o	: out std_logic;
      r_addr_o	: out std_logic_vector (ADDR_WIDTH-1 downto 0);
		r_en_o	: out std_logic
   );
end fifo_ctrl;

architecture str_arch of fifo_ctrl is
	 
	 -- Internal signals mapped to input ports
   signal clkw: std_logic;
   signal resetw: std_logic;
   signal wr: std_logic;
   signal full: std_logic;
   signal w_addr: std_logic_vector (ADDR_WIDTH-1 downto 0);
   signal clkr: std_logic;
   signal resetr: std_logic;
   signal rd: std_logic;
   signal empty: std_logic;
   signal r_addr: std_logic_vector (ADDR_WIDTH-1 downto 0);	
	signal r_en_out: std_logic;
	
	 -- Signals for internal interconnect	
   signal r_ptr_in: std_logic_vector(ADDR_WIDTH downto 0);
   signal r_ptr_out: std_logic_vector(ADDR_WIDTH downto 0);
   signal w_ptr_in: std_logic_vector(ADDR_WIDTH downto 0);
   signal w_ptr_out: std_logic_vector(ADDR_WIDTH downto 0);
	signal w_ptr_async: std_logic_vector(ADDR_WIDTH downto 0);
	signal w_ptr_sync: std_logic_vector(ADDR_WIDTH downto 0);
	signal r_ptr_async: std_logic_vector(ADDR_WIDTH downto 0);
	signal r_ptr_sync: std_logic_vector(ADDR_WIDTH downto 0);
   
begin

	 -- Input
   clkw 		<= clkw_i;
   resetw 	<= resetw_i;
   wr 		<= wr_i;
   clkr 		<= clkr_i;
   resetr 	<= resetr_i;
   rd 		<= rd_i;     
	 
	 -- Component wiring
   read_ctrl: entity work.fifo_read_ctrl
      generic map(
			N				=>	ADDR_WIDTH,
			PRE_LOAD		=>	PRE_LOAD,
			READ_MODE	=>	READ_MODE
		)
      port map (
			clkr_i		=>	clkr, 
			resetr_i    =>	resetr, 
			rd_i			=>	rd,       					
			w_ptr_in_i  =>	w_ptr_in,      					
			empty_o		=>	empty,
			r_ptr_out_o =>	r_ptr_out, 
			r_addr_o	  	=>	r_addr,
			r_en_o		=> r_en_out
		);
                
   write_ctrl: entity work.fifo_write_ctrl
      generic map(
			N	=>	ADDR_WIDTH
		)
      port map (
			clkw_i		=>	clkw, 
			resetw_i		=>	resetw, 
			wr_i			=>	wr,
			r_ptr_in_i	=>	r_ptr_in, 
			full_o		=>	full,
			w_ptr_out_o	=>	w_ptr_out, 
			w_addr_o		=>	w_addr
		);

	
	w_ptr_async <= w_ptr_out  when CLOCK_MODE = 1 else (others => '0');
	w_ptr_in 	<= w_ptr_sync when CLOCK_MODE = 1 else w_ptr_out;

	r_ptr_async <= r_ptr_out  when CLOCK_MODE = 1 else (others => '0');
	r_ptr_in 	<= r_ptr_sync when CLOCK_MODE = 1 else r_ptr_out;

	synchdepth_1:
   if (CLOCK_MODE = 1 and SYNC_DEPTH = 1) generate
      begin
	
		sync_w_ptr: entity work.synchronizer(synchdepth_1)
			generic map(
				N	=>	ADDR_WIDTH+1,
				D	=>	SYNC_DEPTH
			)
			port map (
				clk_i			=>	clkr, 
				reset_i		=>	resetw,
				in_async_i	=>	w_ptr_async, 
				out_sync_o	=>	w_ptr_sync
			);
						
		sync_r_ptr: entity work.synchronizer(synchdepth_1)
			generic map(
				N	=>	ADDR_WIDTH+1,
				D	=>	SYNC_DEPTH
			)
			port map (
				clk_i			=>	clkw, 
				reset_i		=>	resetr,
				in_async_i	=>	r_ptr_async, 
				out_sync_o 	=>	r_ptr_sync
			);
						 
   end generate;
	
	synchdepth_2p:
   if (CLOCK_MODE = 1 and SYNC_DEPTH > 1) generate
      begin
	
		sync_w_ptr: entity work.synchronizer(synchdepth_2p)
			generic map(
				N	=>	ADDR_WIDTH+1,
				D	=>	SYNC_DEPTH
			)
			port map (
				clk_i			=>	clkr, 
				reset_i		=>	resetw,
				in_async_i	=>	w_ptr_async, 
				out_sync_o	=>	w_ptr_sync
			);
		

						
		sync_r_ptr: entity work.synchronizer(synchdepth_2p)
			generic map(
				N	=>	ADDR_WIDTH+1,
				D	=>	SYNC_DEPTH
			)
			port map (
				clk_i			=>	clkw, 
				reset_i		=>	resetr,
				in_async_i	=>	r_ptr_async, 
				out_sync_o 	=>	r_ptr_sync
			);
						 
   end generate;	
	
	 -- Output
   full_o 	<= full;
   w_addr_o <= w_addr;      
   empty_o 	<= empty;
   r_addr_o <= r_addr;
	r_en_o 	<= r_en_out;
	                
end str_arch;