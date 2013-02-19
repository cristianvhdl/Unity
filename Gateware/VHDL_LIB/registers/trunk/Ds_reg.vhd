----------------------------------------------------------------------------------
-- Company: Anders Blaabjerg Lange
-- Engineer: University Of Southern Denmark
-- 
-- Create Date:    16:10:54 22/02-2011 
-- Design Name: 
-- Module Name:    Ds_reg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	Data synchrone Register
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01 			22/02-2011 	ANLAN		File Created
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

--------------------------------------------------------------------------------
-- Libraries
--------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

--------------------------------------------------------------------------------
-- Entity
--------------------------------------------------------------------------------
entity Ds_reg is
   generic ( REG_WIDTH : integer range 1 to 32 := 32 );
   port ( clk_i  : in  std_logic;
          reset_i : in  std_logic;
          we_i  : in  std_logic;
          d_i   : in  std_logic_vector (REG_WIDTH-1 downto 0);
          d_o   : out std_logic_vector (REG_WIDTH-1 downto 0));
end Ds_reg;

--------------------------------------------------------------------------------
-- Architecture
--------------------------------------------------------------------------------
architecture Behavioral of Ds_reg is

   signal reg : std_logic_vector(REG_WIDTH-1 downto 0) := (others=>'0');

begin

   process(clk_i)
   begin
      if rising_edge(clk_i) then
         if reset_i='1' then
            reg <= (others=>'0');      
         elsif we_i='1' then
            reg <= d_i;
         end if;
      end if;
   end process;

   d_o <= reg;

end Behavioral;
--------------------------------------------------------------------------------
-- End of file
--------------------------------------------------------------------------------