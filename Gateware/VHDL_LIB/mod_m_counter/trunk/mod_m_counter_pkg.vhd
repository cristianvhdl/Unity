----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    08:58:30 22/11/2012
-- Design Name: 
-- Module Name:    mod_m_counter_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib mod_m_counter library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		22/11-2012	ANLAN 	File Created
-- 1.00.b	22/10-2012	ANLAN		First release
--	2.00.a	
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
library IEEE;
use IEEE.STD_LOGIC_1164.all;

package mod_m_counter_pkg is

	----------------------------------------------------------------------------------
	--		Modulus M Counter
	--
	--		Default generic config:
	--			C_WIDTH 		= 8 		- Counter bit width
	--			C_MOD 		= 230		- Max count-value (counter modulus value)
	--
	----------------------------------------------------------------------------------
	component mod_m_counter is
		generic (
			C_WIDTH 	: natural := 8;
			C_MOD		: positive := 230
			);
		port ( 
			clk_i 		: in  std_logic;
			reset_i 		: in  std_logic;
			count_o 		: out std_logic_vector (C_WIDTH-1 downto 0);
			max_count_o : out std_logic
			);
	end component;

end mod_m_counter_pkg;

package body mod_m_counter_pkg is
end mod_m_counter_pkg;