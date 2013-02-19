----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange	(ANLAN)
-- 
-- Create Date:    11:07:00 04/04-2010 
-- Design Name: 
-- Module Name:    FifoWritePort - Behavioral 
-- Project Name: 
-- Target Devices: Spartan3, Spartan6 and Virtex6
-- Tool versions:	 
-- Description: 
--
--		Parameterized FIFO write port
--
--		Default generic config:
--			N = 3 - Address width: 3 bits
--
-- Dependencies: 
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01  	04/04-2010  ANLAN   	File Created
-- 0.02  	17/04-2010  ANLAN   	Initial/startup values assigned to all internal signals.
-- 0.03  	10/05-2010  ANLAN 	Copyright conditions & disclamer added.
-- 1.00  	12/06-2010	ANLAN		Offical release
-- 1.01		11/11-2010 	ANLAN		New Header & Copyright added, old Copyright conditions & disclamer removed
-- 1.02  	10/10-2012	ANLAN		New Header & Copyright added (Unity)
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

entity fifo_write_ctrl is
   generic(N: natural:=3); --N: number of bits in address
   port(
      clkw_i: in std_logic;
      resetw_i: in std_logic;
      wr_i: in std_logic;
      r_ptr_in_i: in std_logic_vector(N downto 0);
      full_o: out std_logic;
      w_ptr_out_o: out std_logic_vector(N downto 0);
      w_addr_o: out std_logic_vector(N-1 downto 0)
   );
end fifo_write_ctrl;

architecture gray_arch of fifo_write_ctrl is
	 -- Internal signals mapped to input ports
   signal clkw: std_logic;
   signal resetw: std_logic;
   signal wr: std_logic;
   signal r_ptr_in: std_logic_vector(N downto 0);

   -- Signals for implementing registers, counters and flags
   signal w_ptr_reg, w_ptr_next: std_logic_vector(N downto 0) := (others => '0');
   signal gray1, bin, bin1: std_logic_vector(N downto 0) := (others => '0');
   signal waddr_all, raddr_all: std_logic_vector(N-1 downto 0) := (others => '0');
   signal waddr_msb, raddr_msb: std_logic := '0';
   signal full_flag: std_logic := '0';
begin
	 -- Input
	 clkw <= clkw_i;
	 resetw <= resetw_i;
	 wr <= wr_i;
	 r_ptr_in <= r_ptr_in_i;

   -- Update write ptr register
   process(clkw,resetw)
   begin
      if (resetw='1') then
          w_ptr_reg <= (others=>'0');
      elsif (clkw'event and clkw='1') then
         w_ptr_reg <= w_ptr_next;
      end if;
   end process;
   
   -- (N+1)-bit Gray counter
   bin <= w_ptr_reg xor ('0' & bin(N downto 1));  -- Gray to Bin
   bin1 <= std_logic_vector(unsigned(bin) + 1);   -- Bin increment
   gray1 <= bin1 xor ('0' & bin1(N downto 1));    -- Bin to Gray
     
   -- Update write pointer
   w_ptr_next <= gray1 when wr='1' and full_flag='0' else
                 w_ptr_reg;
                 
   -- N-bit Gray counter
   waddr_msb <= w_ptr_reg(N) xor w_ptr_reg(N-1);   
   waddr_all <= waddr_msb & w_ptr_reg(N-2 downto 0);
   
   -- Check for FIFO full
   raddr_msb <= r_ptr_in(N) xor r_ptr_in(N-1);
   raddr_all <= raddr_msb & r_ptr_in(N-2 downto 0);
   
   full_flag <= '1' when ((r_ptr_in(N) /= w_ptr_reg(N)) and (raddr_all = waddr_all))
                 else '0';
   
   -- Output
   w_addr_o <= waddr_all;
   w_ptr_out_o <= w_ptr_reg;
   full_o <= full_flag;
   
end gray_arch;