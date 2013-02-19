----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    09:49:02 21/12-2011
-- Design Name: 	 
-- Module Name:    xtra_types_pkg - package 
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
-- 0.01 			21/12-2011 	ANLAN		File Created
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

package xtra_types_pkg is
	type std_logic_1d 	is array(integer range <>) of std_logic;
	type std_logic_1d1d	is array(integer range <>) of std_logic_1d;
	type std_logic_2d 	is array(integer range <>, integer range <>) of std_logic;
   --type std_logic_1dx1d is array(integer range <>) of std_logic_vector(<>);

end xtra_types_pkg ;

package body xtra_types_pkg is
	
end xtra_types_pkg;