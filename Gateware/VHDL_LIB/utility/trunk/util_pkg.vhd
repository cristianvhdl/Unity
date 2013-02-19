----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:55:34 25/04-2012
-- Design Name: 	 
-- Module Name:    util_pkg - package 
-- Project Name: 	 
-- Target Devices: 
-- Tool versions:  
-- Description: 	 
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01 			25/04-2012 	ANLAN		File Created
-- 
--
-- Additional Comments: 
--
-- -----------------------------------------------------------------------------
-- Licensing:     (c) Copyright 2011, Anders Blaabjerg Lange
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

package util_pkg is
	function byte_cnt(n: integer) return integer;
	function max(a: integer; b: integer) return integer;
	function min(a: integer; b: integer) return integer;
end util_pkg;

package body util_pkg is

	-- returns the the number of bytes necesarry to hold the value of the integer argument
	function byte_cnt(n: integer) return integer is
		variable b, v: integer := 0;
	begin
		b := 1;
		v := 8;
		while v < n loop
			b := b + 1;
			v := 8 * b;
		end loop;
		return b;
	end byte_cnt;
	
	-- returns the largest of the two integer arguments
	function max(a: integer; b: integer) return integer is
 		variable c : integer := 0;
	begin
		if a>=b then
			c := a;
		else
			c := b;
		end if;
		return c;
	end max;
	
	-- returns the smallest of the two integer arguments
	function min(a: integer; b: integer) return integer is
 		variable c : integer := 0;
	begin
		if a<=b then
			c := a;
		else
			c := b;
		end if;
		return c;
	end min;	
	
end util_pkg;
