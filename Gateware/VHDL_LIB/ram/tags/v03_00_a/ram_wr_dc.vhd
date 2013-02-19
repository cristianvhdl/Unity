----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    11:05:16 04/10/2012 
-- Design Name: 
-- Module Name:    ram_wr_dc - Behavioral  
-- Project Name: 
-- Target Devices: 
-- Tool versions:  ISE 13.4 - 14.2
-- Description:  	 
--	
--		Simple Dual Ported Memory with one write and one read port with independent clock inputs
--
--		N.B. This module provides two components: ram_wr_dc_async and ram_wr_dc_sync
--
--			(1) The async_rd architecture of entity ram_wr_dc_async implements the memory as a
--				 distributed RAM using LUTs, it provides possibility for asynchronous data output.
--
--			(2) The sync_rd architecture of entity ram_wr_dc_sync can implement the memory as both 
--				 distributed or block RAM, it provides a synchronous data output with an independent
--				 read clock-input
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		04/10-2012	ANLAN		File Created
-- 0.02		09/10-2012	ANLAN		Minor error corrected in architecture Async_RD causing it to loose the first data written to it.
--											'shared variable bram' renamed and redeclared as 'signal ram'
-- 0.03 		16/10-2012 	ANLAN		Module split into two components and added to the ram_pkg package.
-- 0.04
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

entity ram_wr_dc_async is
   generic ( 
      ADDR_WIDTH    : integer := 9;
      DATA_WIDTH    : integer := 32;
      RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
      PIPE_REGB_EN  : integer range 0 to 1 := 0;
      INIT_DATA     : integer := 0
      );   
   port ( 
      clk_a_i 	: in std_logic;
      en_a_i 	: in std_logic;
      addr_a_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);
      we_a_i   : in std_logic;
      data_a_i : in std_logic_vector(DATA_WIDTH-1 downto 0);
      
      clk_b_i 	: in std_logic;
		en_b_i 	: in std_logic;		
      addr_b_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);                    
      data_b_o : out std_logic_vector(DATA_WIDTH-1 downto 0)          
      );    
end ram_wr_dc_async;

--------------------------------------------------------------------------------
-- Architecture : Async_RD
-- -------------------------------------------
-- This architecture can only be implemented as DISTRIBUTED (LUT) RAM, 
-- hence the RAMSTYLE generic has no effect on this architecture.
--------------------------------------------------------------------------------
architecture async_rd of ram_wr_dc_async is
   attribute RAM_STYLE : string;  
   
   constant ram_init : std_logic_vector(DATA_WIDTH-1 downto 0) := (std_logic_vector(TO_SIGNED(INIT_DATA, DATA_WIDTH)));
   
   type ram_type is array (2**ADDR_WIDTH-1 downto 0) of std_logic_vector (DATA_WIDTH-1 downto 0);
   signal ram: ram_type := (others=>ram_init);
   attribute RAM_STYLE of ram: signal is "DISTRIBUTED";
   
   signal data_a, data_b : std_logic_vector (DATA_WIDTH-1 downto 0);

begin

   process (clk_a_i)
   begin
      if rising_edge(clk_a_i) then
         if (en_a_i = '1') then       
            -- Write
            if (we_a_i = '1') then
              ram(TO_INTEGER(unsigned(addr_a_i))) <= data_a_i;
            end if;
         end if;
      end if;
   end process;
	
	-- Read
	data_b <= ram(TO_INTEGER(unsigned(addr_b_i))); 	

   PIPEB_GEN0: 
   if PIPE_REGB_EN=0 generate
      data_b_o <= data_b;
   end generate; 

   PIPEB_GEN1: 
   if PIPE_REGB_EN=1 generate
      process (clk_b_i)
      begin
         if rising_edge(clk_b_i) then
				if en_b_i='1' then
					data_b_o <= data_b;
				end if;
         end if;
      end process;
   end generate;     
   
end async_rd;


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

entity ram_wr_dc_sync is
   generic ( 
      ADDR_WIDTH    : integer := 9;
      DATA_WIDTH    : integer := 32;
      RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
      PIPE_REGB_EN  : integer range 0 to 1 := 0;
      INIT_DATA     : integer := 0
      );   
   port ( 
      clk_a_i 	: in std_logic;
      en_a_i 	: in std_logic;
      addr_a_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);
      we_a_i   : in std_logic;
      data_a_i : in std_logic_vector(DATA_WIDTH-1 downto 0);
      
      clk_b_i 	: in std_logic;
		en_b_i 	: in std_logic;		
      addr_b_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);                    
      data_b_o : out std_logic_vector(DATA_WIDTH-1 downto 0)          
      );    
end ram_wr_dc_sync;

--------------------------------------------------------------------------------
-- Architecture : Sync_RD
-- -------------------------------------------
-- This architecture can be implemented both as DISTRIBUTED (LUT) and BLOCK RAM, 
-- hence the RAMSTYLE generic can be used to control the RAM implementation 
-- style of this architecture.
--------------------------------------------------------------------------------
architecture sync_rd of ram_wr_dc_sync is
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
         if (en_a_i = '1') then
            if (we_a_i = '1') then
              bram(TO_INTEGER(unsigned(addr_a_i))) := data_a_i;
            end if;
         end if;
      end if;
   end process;
	
   process (clk_b_i)
   begin
      if rising_edge(clk_b_i) then
			if en_b_i='1' then
				data_b <= bram(TO_INTEGER(unsigned(addr_b_i)));
			end if;
      end if;
   end process;	

   PIPEB_GEN0: 
   if PIPE_REGB_EN=0 generate
      data_b_o <= data_b;
   end generate; 

   PIPEB_GEN1: 
   if PIPE_REGB_EN=1 generate
      process (clk_b_i)
      begin
         if rising_edge(clk_b_i) then
            data_b_o <= data_b;
         end if;
      end process;
   end generate;
   
end sync_rd;