----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    12:17:20 22/11/2012
-- Design Name: 
-- Module Name:    pulse_gen_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib pulse-gen library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		22/11-2012	ANLAN 	File Created
-- 2.00.a	22/11-2012	ANLAN		First release
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

package pulse_gen_pkg is

	-------------------------------------------------------------------------------
	-- pulse_gen.vhd
	--
	--		Pulse generator with adjustable period and pulse width
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component pulse_gen is
		generic(
			C_PULSE_WIDTH : integer := 1;			-- Pulse width in clk_i clock cycles
			C_PULSE_PERIOD : integer := 10		-- Pulse period in clk_i clock cycles
		);
		port( 
			clk_i 	: in std_logic;				-- clock input
			en_i 		: in std_logic;				-- enable input
			strb_o 	: out std_logic				-- strobe/pulse output
		);
	end component;

end pulse_gen_pkg;

package body pulse_gen_pkg is
end pulse_gen_pkg;
