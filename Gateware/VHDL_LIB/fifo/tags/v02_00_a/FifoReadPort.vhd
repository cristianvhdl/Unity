----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange	(ANLAN)
-- 
-- Create Date:    14:22:00 06/04-2010 
-- Design Name: 
-- Module Name:    FifoReadPort - Behavioral 
-- Project Name: 
-- Target Devices: Spartan3, Spartan6 and Virtex6
-- Tool versions:	 
-- Description: 
--
--		Parameterized FIFO read port
--
--		Default generic config:
--			N = 3 - Address width: 3 bits
--			PRE_LOAD = 2 - Pre load number: 2 words
--			READ_MODE = 1 - Syncronous read-out of data (Block-RAM, pipelined distributed RAM, etc.)
--
-- Dependencies: 
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01  	06/04/2010  ANLAN   	File Created
-- 0.02  	17/04/2010  ANLAN   	Initial/startup values assigned to all internal signals.
-- 0.03  	10/05/2010  ANLAN   	Copyright conditions & disclamer added.
-- 0.04  	12/06/2010  ANLAN   	PRE_LOAD generic and functionality added to prevent false empty signal 
--          							in the event that metastability causes the synchronizer to register the wrong writepointer.
-- 0.05  	12/06/2010  ANLAN   	Calculation of pre_load limit changed to prevent glitch.
-- 1.00  	12/06/2010	ANLAN   	Offical release
-- 1.01		11/11/2010 	ANLAN   	New Header & Copyright added, old Copyright conditions & disclamer removed
-- 1.02  	01/10/2012	ANLAN		New Header & Copyright added (Unity), module updated to be able to handle 
--											synchronous memories such as Block-RAM.
-- 1.03		
--
-- Additional Comments: 
-- Based on listing 16.14 from "RTL Hardware Design using VHDL" by Pong P. Chu
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

entity fifo_read_ctrl is
   generic(
		N				: natural					:= 3;	-- N: number of bits in address (2**3 = 8)
		PRE_LOAD		: natural					:= 2;	-- Write<>Read Ptr offset before deasserting empty signal (read logic)
		READ_MODE	: natural range 0 to 1 	:= 1	-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
	);
   port(
      clkr_i		: in  std_logic;		
      resetr_i		: in  std_logic;
		
      rd_i			: in  std_logic;      
      w_ptr_in_i	: in  std_logic_vector(N downto 0);
		
      empty_o		: out std_logic;
      r_ptr_out_o	: out std_logic_vector(N downto 0);
      r_addr_o		: out std_logic_vector(N-1 downto 0);
		r_en_o		: out std_logic
   );
end fifo_read_ctrl;

architecture gray_arch of fifo_read_ctrl is

   -- Internal signals mapped to input ports
   signal clkr			: std_logic;
   signal resetr		: std_logic;
   signal w_ptr_in	: std_logic_vector(N downto 0);
   signal rd			: std_logic;

   -- Signals for implementing registers, counters and flags
   signal r_ptr_reg, r_ptr_next								: std_logic_vector(N downto 0) := (others => '0');
   signal gray1, bin, bin1										: std_logic_vector(N downto 0) := (others => '0');
   signal raddr_all, waddr_all								: std_logic_vector(N-1 downto 0) := (others => '0');
   signal raddr_msb, waddr_msb								: std_logic := '0';
   signal empty_flag, empty_flag_reg, empty_flag_nxt	: std_logic := '1';
	signal init_read 												: std_logic;
	
	signal wbin														: std_logic_vector(N downto 0) := (others => '0');
	
begin
	 -- Input
	 clkr <= clkr_i;
	 resetr <= resetr_i;
	 w_ptr_in <= w_ptr_in_i;
	 rd <= rd_i;

   -- Update read ptr register
   process(clkr,resetr)
   begin
      if (resetr='1') then
         r_ptr_reg <= (others=>'0');
			empty_flag_reg <= '1';
      elsif (clkr'event and clkr='1') then
         r_ptr_reg <= r_ptr_next;
			empty_flag_reg <= empty_flag_nxt;
      end if;
   end process;
   
   -- (N+1)-bit Gray counter
   bin <= r_ptr_reg xor ('0' & bin(N downto 1));  -- Gray to Bin
   bin1 <= std_logic_vector(unsigned(bin) + 1);   -- Bin increment
   gray1 <= bin1 xor ('0' & bin1(N downto 1));    -- Bin to Gray
   
   -- Update read pointer
   r_ptr_next <= gray1 when (rd='1' and empty_flag_nxt='0') or init_read='1' else
                 r_ptr_reg;
                 
   -- N-bit Gray counter
   raddr_msb <= r_ptr_reg(N) xor r_ptr_reg(N-1);
   raddr_all <= raddr_msb & r_ptr_reg(N-2 downto 0);  
   
   -- Check for FIFO empty
   waddr_msb <= w_ptr_in(N) xor w_ptr_in(N-1);
   waddr_all <= waddr_msb & w_ptr_in(N-2 downto 0);
	
		-- Keep empty signal high until w_ptr_in is PRE_LOAD words ahead of r_ptr_reg
		wbin <= w_ptr_in xor ('0' & wbin(N downto 1));	-- w_ptr_in Gray to Bin


   empty_flag_nxt <= '1' when ((w_ptr_in(N) = r_ptr_reg(N)) and (raddr_all = waddr_all)) else
							'1' when (empty_flag_reg = '1' and ((unsigned(wbin)-unsigned(bin)) <= PRE_LOAD) )
   						else '0';
   
	ASYNC_READ_GEN: 
	if READ_MODE=0 generate
	begin
		
		empty_flag <= empty_flag_nxt;		
		r_en_o <= '1';
		
   end generate;
	
	SYNC_READ_GEN: 
	if READ_MODE=1 generate
	begin
		
		empty_flag <= empty_flag_reg;

		init_read <= '1' when empty_flag_reg='1' and empty_flag_nxt='0' else '0';
		r_en_o <= rd_i or init_read;
		
   end generate;
	
	-- Output
	r_addr_o 	<= raddr_all;
	r_ptr_out_o <= r_ptr_reg;
	empty_o 		<= empty_flag;
    
end gray_arch;