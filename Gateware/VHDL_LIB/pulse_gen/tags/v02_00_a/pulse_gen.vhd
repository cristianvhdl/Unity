----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    09:25:43 17/04-2012 
-- Design Name: 
-- Module Name:    pulse_gen - Behavioral 
-- Project Name: 	 
-- Target Devices: 
-- Tool versions:  
-- Description: 	 
--
--		Pulse generator with adjustable period and pulse width
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01 			17/04-2012 	ANLAN		File Created
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

entity pulse_gen is
	generic(
		C_PULSE_WIDTH : integer := 1;			-- Pulse width in clk_i clock cycles
		C_PULSE_PERIOD : integer := 10		-- Pulse period in clk_i clock cycles
	);
   port( 
		clk_i 	: in std_logic;				-- clock input
      en_i 		: in std_logic;				-- enable input
      strb_o 	: out std_logic				-- strobe/pulse output
	);
end pulse_gen;

architecture Behavioral of pulse_gen is

	signal counter : integer range 0 to C_PULSE_PERIOD := 0;

begin

	ASSERT (C_PULSE_WIDTH>0) REPORT "Value of C_PULSE_WIDTH must be greater than 0!" SEVERITY failure;
	ASSERT (C_PULSE_PERIOD>0) REPORT "Value of C_PULSE_PERIOD must be greater than 0!" SEVERITY failure;
	ASSERT (C_PULSE_PERIOD>C_PULSE_WIDTH) REPORT "Value of C_PULSE_PERIOD must be greater than the value of C_PULSE_WIDTH!" SEVERITY failure;

	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if en_i='1' then
				if counter < C_PULSE_PERIOD-1 then
					counter <= counter+1;
				else
					counter <= 0;
				end if;

				if counter < C_PULSE_WIDTH then
					strb_o <= '1';
				else
					strb_o <= '0';
				end if;
			else
				counter <= 0;
			end if;
		end if;
	end process;

end Behavioral;