----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange	(ANLAN)
-- 
-- Create Date:    14:23:00 23/04-2010 
-- Design Name: 
-- Module Name:    Synchronizer - Behavioral 
-- Project Name: 
-- Target Devices: Spartan3, Spartan6 and Virtex6
-- Tool versions:	 
-- Description: 
--
--		Parameterized D level FF N bit Synchronizer
--		
--		Default data width (bits): N = 4
--		Default synchronizer depth: D = 2
--
-- Dependencies: 
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		23/04-2010	ANLAN 	File Created	
-- 0.02		10/05-2010	ANLAN 	Copyright conditions & disclamer added
-- 1.00  	12/06-2010	ANLAN		Offical release
-- 1.90 		06/11-2010	ANLAN		Additional architecture added to handle synch depth of 1 correct
-- 1.91		06/11-2010	ANLAN		New Header & Copyright added, old Copyright conditions & disclamer removed
-- 1.02  	10/10-2012	ANLAN		New Header & Copyright added (Unity)
-- 1.03		16/10-2012	ANLAN		file/module renamed to synchronizer.vhd		
-- 1.04		
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

entity synchronizer is
   generic(N: natural := 4;	--N: number of bits in async IO
   		  D: natural := 2);  --D: synchroniser depth
   port(
      clk_i: in std_logic;
      reset_i: in std_logic;
      in_async_i: in std_logic_vector(N-1 downto 0);
      out_sync_o: out std_logic_vector(N-1 downto 0)
   );
end synchronizer;

--------------------------------------------------------------------------------
-- Architecture 1
--------------------------------------------------------------------------------
architecture synchdepth_1 of synchronizer is
	 -- Internal signals mapped to input port
   signal clk: std_logic;
   signal reset: std_logic;
      	 
	 -- Internal signals to be used as registers
    signal sync_reg, sync_next: std_logic_vector(N-1 downto 0) := (others => '0');

begin
	 -- Input
	 clk <= clk_i;
	 reset <= reset_i;
	 sync_next <= in_async_i;
	
   process(clk,reset)
   begin
      if (reset='1') then
         sync_reg <= (others=>'0');
      elsif (clk'event and clk='1') then
         sync_reg <= sync_next;
      end if;
   end process;  
   
   -- Output
   out_sync_o <= sync_reg;
   
end synchdepth_1;

--------------------------------------------------------------------------------
-- Architecture 2
--------------------------------------------------------------------------------
architecture synchdepth_2p of synchronizer is
	 -- Internal signals mapped to input port
   signal clk: std_logic;
   signal reset: std_logic;
   signal in_async: std_logic_vector(N-1 downto 0);

	 -- type declaration
	 type vector_array is array(integer range <>) of std_logic_vector(N-1 downto 0);
      	 
	 -- Internal signals to be used as registers
    signal sync_reg, sync_next: vector_array(D-1 downto 0) := (others=>(others => '0'));

begin
	 -- Input
	 clk <= clk_i;
	 reset <= reset_i;
	 in_async <= in_async_i;

   -- Update the next "state" registers	
	sync_next <= sync_reg(D-2 downto 0) & in_async;
	
   process(clk,reset)
   begin
      if (reset='1') then
         sync_reg <= (others=>(others=>'0'));
      elsif (clk'event and clk='1') then
         sync_reg <= sync_next;
      end if;
   end process;  
   
   -- Output
   out_sync_o <= sync_reg(D-1);
   
end synchdepth_2p;