----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    12:45:16 22/12-2011 
-- Design Name: 
-- Module Name:    mod_m_counter - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:
--
-- Dependencies: 
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		22/12-2012	ANLAN		File Created
-- 0.02		 
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
use ieee.numeric_std.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE mod_m_counter_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity mod_m_counter is
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
end mod_m_counter;

architecture behavioral of mod_m_counter is

	signal cnt_reg : unsigned(C_WIDTH-1 downto 0) := (others=>'0');
	signal cnt_nxt : unsigned(C_WIDTH-1 downto 0);
	
begin
	
	-- Register process
	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if reset_i='1' then
				cnt_reg <= (others=>'0');
			else
				cnt_reg <= cnt_nxt;
			end if;
		end if;
	end process;
	
	-- Next state logic
	cnt_nxt <= (others=>'0') when cnt_reg=C_MOD-1 else cnt_reg+1;
	
	-- Output logic
	count_o <= std_logic_vector(cnt_reg);
	max_count_o <= '1' when cnt_reg=C_MOD-1 else '0';

	ASSERT 2**C_WIDTH>=C_MOD REPORT "C_MOD can not be larger than 2^C_WIDTH!" SEVERITY failure;

end behavioral;

