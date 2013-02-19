----------------------------------------------------------------------------------
-- Company: Anders Blaabjerg Lange
-- Engineer: University Of Southern Denmark
-- 
-- Create Date:    09:41:01 30/12/2011 
-- Design Name: 
-- Module Name:    checksum_xor module
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	
--
-- 	XOR / parity checksum generator
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01 			30/12-2012 	ANLAN		File Created
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

entity checksum_xor is
	generic (
		C_DATA_WIDTH 		: integer := 8;
		C_CHKS_WIDTH 		: integer := 8
	);
	port ( 
		clk_i 		: in  std_logic;
		reset_i		: in  std_logic;
		data_vld_i 	: in  std_logic;		
		data_i 		: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		chks_o 		: out std_logic_vector (C_CHKS_WIDTH-1 downto 0);
		chks_vld_o 	: out std_logic
		);
end checksum_xor;

architecture behavioral of checksum_xor is	

	signal data_reg : std_logic_vector (C_CHKS_WIDTH-1 downto 0) := (others=>'0');
	signal data_nxt : std_logic_vector (C_CHKS_WIDTH-1 downto 0);
	signal data_vld_reg : std_logic := '0';

begin
	
	ASSERT C_DATA_WIDTH<=C_CHKS_WIDTH REPORT "C_DATA_WIDTH must be less than or equal C_CHKS_WIDTH" SEVERITY failure;
	
	data_nxt(C_DATA_WIDTH-1 downto 0) <= data_reg(C_DATA_WIDTH-1 downto 0) xor data_i(C_DATA_WIDTH-1 downto 0);

	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if reset_i='1' then
				data_reg <= (others=>'0');
				data_vld_reg <= '0';
			elsif data_vld_i='1' then
				data_reg <= data_nxt;
				data_vld_reg <= '1';
			end if;
		end if;
	end process;

	chks_o <= data_reg;
	chks_vld_o <= data_vld_reg;

end behavioral;