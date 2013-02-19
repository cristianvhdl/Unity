----------------------------------------------------------------------------------
-- Company: Anders Blaabjerg Lange
-- Engineer: University Of Southern Denmark
-- 
-- Create Date:    16:10:54 22/02-2011
-- Design Name: 
-- Module Name:    DBs_reg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	Data -> Bus synchrone Register
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01			22/02-2011	Anders Lange 	File Created	
-- 0.02			25/02-2011  Anders Lange   BUS_TRISTATE generic added to control 
--                                        implementation style of bus output
-- 0.03			12/03-2011  Anders Lange   Reset input added
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
entity DBs_reg is
   generic ( REG_WIDTH    : integer range 1 to 32 := 32;
             BUS_TRISTATE : integer range 0 to 1  := 1); -- 1/0: enable/disable Tri-state output
   port ( clk_i : in  std_logic;
          reset_i : in  std_logic;
          we_i  : in  std_logic;
          d_i   : in  std_logic_vector (REG_WIDTH-1 downto 0);
          boe_i : in  std_logic;
          db_o  : out std_logic_vector (REG_WIDTH-1 downto 0));
end DBs_reg;

--------------------------------------------------------------------------------
-- Architecture
--------------------------------------------------------------------------------
architecture Behavioral of DBs_reg is

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

   OUTPUT_GEN1:
   if BUS_TRISTATE=1 generate
      db_o <= reg when boe_i='1' else (others=>'Z');
   end generate;   
   
   OUTPUT_GEN0:
   if BUS_TRISTATE=0 generate
      db_o <= reg when boe_i='1' else (others=>'0');
   end generate;  

end Behavioral;
--------------------------------------------------------------------------------
-- End of file
--------------------------------------------------------------------------------