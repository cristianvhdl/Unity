----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    11:04:17 06/01/2011
-- Design Name: 
-- Module Name:    ram_rwrw - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This module implement a true dual ported memory 
--    with two independant read/write ports.
--
--    The dual ported memory can be implement either as 
--    BLOCK ram or logic (luts+registers).
--
--    The implementation style can be directed using the
--    RAMSTYLE generic:
--    	"BLOCK"        : implements the memory as BLOCK ram
--       "AUTO"         : implements the memory as BLOCK ram, as LUT ram can't be used as true dual port memory
--       "DISTRIBUTED"  : implements the memory as logic, as LUT ram can't be used as true dual port memory
--
--    Setting the generic PIPE_REGA_EN/PIPE_REGB_EN to 1 enables pipeline/output registers on port A/B.
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		06/01-2011	ANLAN 	File Created (Tested in Behavioral simulation)
-- 0.02 		17/01-2011  ANLAN   	PIPE_REG_EN generic + logic added to enable usage of BRAM output pipeline registers
-- 0.03 		17/03-2011  ANLAN   	RAM_RWRW updated to implement Read before Write	behavior.
-- 0.04 		22/03-2011  ANLAN   	Individual generics added to rwrw_ram to insure correct 
--                               functionality of API Processor when C_RAM_PIPEREG_EN=1.
-- 0.05 		24/04-2011  ANLAN   	ram_rwrw made generic (and independent of any packages) to enable reuse in all parts of the kernel.
-- 0.06		28/03-2011  ANLAN   	constant bram_init to hold the initial value for the RAM, in order to make the integer generic INIT_DATA work.
-- 0.07		06/05-2012	ANLAN		WRITE_MODE_A/B generics added to let the user control the write mode (Read First / Write First)	
-- 0.08 		15/05-2012	ANLAN		WRITE_MODE_A/B updated to support No Change access mode.
-- 0.09		04/10-2012	ANLAN		Header updated with new layout and GPL v3 license 
-- 0.10			 
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

entity ram_rwrw is
   generic ( 
      ADDR_WIDTH    : integer := 9;
      DATA_WIDTH    : integer := 32;
      RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
      PIPE_REGA_EN  : integer range 0 to 1 := 0;
      PIPE_REGB_EN  : integer range 0 to 1 := 0;
		WRITE_MODE_A  : integer range 0 to 2 := 0;	-- 0: Read First, 1: Write First, 2: No Change
		WRITE_MODE_B  : integer range 0 to 2 := 0;	-- 0: Read First, 1: Write First, 2: No Change
      INIT_DATA     : integer := 0
      );        
   port ( 
      clk_a_i    : in std_logic;          
      enable_a_i : in std_logic;          
      we_a_i     : in std_logic;
      addr_a_i   : in std_logic_vector(ADDR_WIDTH-1 downto 0);
      data_a_i   : in std_logic_vector(DATA_WIDTH-1 downto 0);
      data_a_o   : out std_logic_vector(DATA_WIDTH-1 downto 0);

      clk_b_i    : in std_logic;
      enable_b_i : in std_logic;
      we_b_i     : in std_logic;
      addr_b_i   : in std_logic_vector(ADDR_WIDTH-1 downto 0);
      data_b_i   : in std_logic_vector(DATA_WIDTH-1 downto 0);
      data_b_o   : out std_logic_vector(DATA_WIDTH-1 downto 0)          
      );
end ram_rwrw;

architecture Behavioral of ram_rwrw is
   attribute RAM_STYLE : string;  
   
   constant bram_init : std_logic_vector(DATA_WIDTH-1 downto 0) := (std_logic_vector(TO_SIGNED(INIT_DATA, DATA_WIDTH)));
   
   type ram_type is array (2**ADDR_WIDTH-1 downto 0) of std_logic_vector (DATA_WIDTH-1 downto 0);
   shared variable bram: ram_type := (others=>bram_init);
   attribute RAM_STYLE of bram: variable is RAMSTYLE;
   
   signal data_a, data_b : std_logic_vector (DATA_WIDTH-1 downto 0);

begin

   process (clk_a_i)
   begin
      if rising_edge(clk_a_i) then
         if (enable_a_i = '1') then
            IF WRITE_MODE_A=0 THEN
					-- Read First
					data_a <= bram(TO_INTEGER(unsigned(addr_a_i)));
				   -- Write Last
					if (we_a_i = '1') then
						bram(TO_INTEGER(unsigned(addr_a_i))) := data_a_i;
					end if;
				END IF;
            IF WRITE_MODE_A=1 THEN
				   -- Write First
					if (we_a_i = '1') then
						bram(TO_INTEGER(unsigned(addr_a_i))) := data_a_i;
					end if;				
					-- Read Last
					data_a <= bram(TO_INTEGER(unsigned(addr_a_i)));
				END IF;
            IF WRITE_MODE_A=2 THEN
				   -- No Change
					if (we_a_i = '1') then
						bram(TO_INTEGER(unsigned(addr_a_i))) := data_a_i;
					else
						data_a <= bram(TO_INTEGER(unsigned(addr_a_i)));
					end if;
				END IF;					
         end if;
      end if;
   end process;
   
   process (clk_b_i)
   begin
      if rising_edge(clk_b_i) then
         if (enable_b_i = '1') then
            IF WRITE_MODE_B=0 THEN
					-- Read First
					data_b <= bram(TO_INTEGER(unsigned(addr_b_i)));
				   -- Write Last
					if (we_b_i = '1') then
						bram(TO_INTEGER(unsigned(addr_b_i))) := data_b_i;
					end if;
				END IF;
            IF WRITE_MODE_B=1 THEN
				   -- Write First
					if (we_b_i = '1') then
						bram(TO_INTEGER(unsigned(addr_b_i))) := data_b_i;
					end if;				
					-- Read Last
					data_b <= bram(TO_INTEGER(unsigned(addr_b_i)));
				END IF;
            IF WRITE_MODE_B=2 THEN
				   -- No Change
					if (we_b_i = '1') then
						bram(TO_INTEGER(unsigned(addr_b_i))) := data_b_i;
					else
						data_b <= bram(TO_INTEGER(unsigned(addr_b_i)));
					end if;										
				END IF;				
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

   PIPEA_GEN1: 
   if PIPE_REGA_EN=1 generate
      process (clk_a_i)
      begin
         if rising_edge(clk_a_i) then
            if (PIPE_REGA_EN = 1) then
               data_a_o <= data_a;
            end if;
         end if;
      end process;
   end generate; 

   PIPEB_GEN1: 
   if PIPE_REGB_EN=1 generate
      process (clk_b_i)
      begin
         if rising_edge(clk_b_i) then
            if (PIPE_REGB_EN = 1) then
               data_b_o <= data_b;
            end if;
         end if;
      end process;
   end generate;    

end Behavioral;