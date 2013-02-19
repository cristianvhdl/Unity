----------------------------------------------------------------------------------
-- Company: Anders Blaabjerg Lange
-- Engineer: University Of Southern Denmark
-- 
-- Create Date:    12:15:19 23/01-2012 
-- Design Name: 
-- Module Name:    fifo_reg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 	 Data register emulating a synchronous FIFO interface
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01			23/01/2012	ANLAN		File Created
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

entity fifo_reg is
	generic (
		C_DATA_WIDTH	: positive := 8
	);
	port ( 
		clk_i		: in  std_logic;
		reset_i	: in  std_logic;
		wr_i 		: in  std_logic;
		data_i 	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		full_o 	: out std_logic;
		rd_i 		: in  std_logic;
		data_o 	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
		empty_o 	: out std_logic
		);
end fifo_reg;

architecture Behavioral of fifo_reg is

	signal data_reg : std_logic_vector(C_DATA_WIDTH-1 downto 0) := (others=>'0');	
	signal data_vld_reg : std_logic := '0';

	signal wr_en : std_logic;
	signal rd_en : std_logic;
	

begin

	wr_en <= '1' when data_vld_reg='0' and wr_i='1' else '0';
	rd_en <= '1' when data_vld_reg='1' and rd_i='1' else '0';
					
	process(clk_i)
	begin
		if rising_edge(clk_i) then
		
			if reset_i='1' then
				data_reg <= (others=>'0');
				data_vld_reg <= '0';
			else
				
				if wr_en = '1' then
					data_reg <= data_i;
					data_vld_reg <= '1';
				elsif rd_en = '1' then
					data_vld_reg <= '0';
				end if;				
				
			end if;
			
		end if;
	end process;
	
	full_o <= data_vld_reg;	
	data_o <= data_reg;
	empty_o <= not data_vld_reg;	

end Behavioral;

