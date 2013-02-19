----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:07:11 24/03/2011
-- Design Name: 
-- Module Name:    ram_rwrr - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This module implement a triple ported memory 
--    with one read/write port and two read only ports.
--    The memory can be implement either as 
--    BLOCK ram or logic (luts+registers).
--    The implementation style can be directed using the
--    RAMSTYLE generic:
--        "BLOCK"        : implements the memory as BLOCK ram
--        "AUTO"         : implements the memory as BLOCK or LUT ram depending on what is most efficient. 
--        "DISTRIBUTED"  : implements the memory as LUT ram
--
--    Setting the generic PIPE_REG(A/B/C)_EN to 1 enables 
--    pipeline/output registers for the specified output.
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		24/03-2011	ANLAN 	File Created
-- 0.02		28/03-2011  ANLAN		Constant bram_init to hold the initial value for the RAM, in order to make the integer generic INIT_DATA work.
--	0.03		04/10-2012	ANLAN		Header updated with new layout and GPL v3 license 
-- 0.04 		16/10-2012 	ANLAN		Module added to the ram_pkg package.
-- 0.05			 
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
-- THIS MODULE IS PART OF THE ram_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity ram_rwrr is
   generic ( 
      ADDR_WIDTH    : integer := 9;
      DATA_WIDTH    : integer := 32;
      RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
      PIPE_REGA_EN  : integer range 0 to 1 := 1;
      PIPE_REGB_EN  : integer range 0 to 1 := 1;
      PIPE_REGC_EN  : integer range 0 to 1 := 1;
      INIT_DATA     : integer := 0
      );   
   port ( 
      clk_i     : in  std_logic;      
      enable_i  : in std_logic;
            
      addr_a_i  : in  std_logic_vector (ADDR_WIDTH-1 downto 0);
      we_a_i    : in  std_logic;
      data_a_i  : in  std_logic_vector (DATA_WIDTH-1 downto 0);      
      data_a_o  : out std_logic_vector (DATA_WIDTH-1 downto 0);
      
      addr_b_i  : in  std_logic_vector (ADDR_WIDTH-1 downto 0);
      data_b_o  : out std_logic_vector (DATA_WIDTH-1 downto 0);
      
      addr_c_i  : in  std_logic_vector (ADDR_WIDTH-1 downto 0);
      data_c_o  : out std_logic_vector (DATA_WIDTH-1 downto 0)      
      );   
end ram_rwrr;

architecture Behavioral of ram_rwrr is
   attribute RAM_STYLE : string;  
   
   constant bram_init : std_logic_vector(DATA_WIDTH-1 downto 0) := (std_logic_vector(TO_SIGNED(INIT_DATA, DATA_WIDTH)));
   
   type ram_type is array (2**ADDR_WIDTH-1 downto 0) of std_logic_vector (DATA_WIDTH-1 downto 0);
   signal bram: ram_type := (others=>bram_init);
   attribute RAM_STYLE of bram: signal is RAMSTYLE;
   
   signal data_a, data_b, data_c : std_logic_vector (DATA_WIDTH-1 downto 0);

begin

   process (clk_i)
   begin
      if rising_edge(clk_i) then
         if (enable_i = '1') then
            -- Read First
            data_a <= bram(TO_INTEGER(unsigned(addr_a_i)));
            data_b <= bram(TO_INTEGER(unsigned(addr_b_i))); 
            data_c <= bram(TO_INTEGER(unsigned(addr_c_i))); 
            -- Write Last
            if (we_a_i = '1') then
              bram(TO_INTEGER(unsigned(addr_a_i))) <= data_a_i;
            end if;
         end if;
      end if;
   end process;

   PIPEA_GEN0: 
   if PIPE_REGA_EN=0 generate
      data_a_o <= data_a;
   end generate; 

   PIPEB_GEN0: 
   if PIPE_REGB_EN=0 generate
      data_b_o <= data_b;
   end generate; 

   PIPEC_GEN0: 
   if PIPE_REGC_EN=0 generate
      data_c_o <= data_c;
   end generate; 

   PIPEA_GEN1: 
   if PIPE_REGA_EN=1 generate
      process (clk_i)
      begin
         if rising_edge(clk_i) then
            if (PIPE_REGA_EN = 1) then
               data_a_o <= data_a;
            end if;
         end if;
      end process;
   end generate; 

   PIPEB_GEN1: 
   if PIPE_REGB_EN=1 generate
      process (clk_i)
      begin
         if rising_edge(clk_i) then
            if (PIPE_REGB_EN = 1) then
               data_b_o <= data_b;
            end if;
         end if;
      end process;
   end generate;     

   PIPEC_GEN1: 
   if PIPE_REGC_EN=1 generate
      process (clk_i)
      begin
         if rising_edge(clk_i) then
            if (PIPE_REGC_EN = 1) then
               data_c_o <= data_c;
            end if;
         end if;
      end process;
   end generate; 
   
end Behavioral;