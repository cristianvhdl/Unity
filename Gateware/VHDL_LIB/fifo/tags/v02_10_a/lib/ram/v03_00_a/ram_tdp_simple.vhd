----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    14:22:00 12/05-2012 
-- Design Name: 
-- Module Name:    ram_tdp_simple - Behavioral 
-- Project Name: 
-- Target Devices: Spartan6 and Virtex6 (Spartan3 using the simple_tdp_ram_gen architecture)
-- Tool versions:  ISE 13.4 - 14.2 
-- Description:  	 
--
--		True Dual Ported Memory with support for different aspect 
--		ratios on port_a <> port_b.
--
--		N.B. 
--		This module is written for optimal usage of the FPGA (Xillinx Spartan 6) block 
--		ram resources, the current ISE synthesis tool can't efficiently infer 
--		more than one BlockRAM, hence if larger memories is needed, use the ram_tdp module. 
--		The ram_tdp module can efficiently instantiate multiple ram_tdp_simple instanses.
--
--		The current ISE synthesis tool can't synthesize this module for 
--		devices older than Spartan6 and Virtex6.
--
--		RULE:	port_a_data_width * 2^port_a_addr_width = port_b_data_width * 2^port_b_addr_width
--
-- Dependencies: 
--
--		Unity-HDL libraries:
--			- utility_v01_00_a
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		12/05-2012	ANLAN		File Created
-- 0.02		04/10-2012	ANLAN		Header updated with new layout and GPL v3 license
-- 0.03 		16/10-2012 	ANLAN		Module added to the ram_pkg package.
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

library utility_v01_00_a;
use utility_v01_00_a.util_pkg.all;
use utility_v01_00_a.log_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE ram_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity ram_tdp_simple is
	generic (
      C_RAMSTYLE      		: string  := "AUTO"; 			-- DISTRIBUTED, BLOCK, AUTO
		C_PORTA_DATA_WIDTH	: integer range 0 to 36 := 8;
		C_PORTA_ADDR_WIDTH	: integer range 0 to 14 := 11;
		C_PORTB_DATA_WIDTH	: integer range 0 to 36 := 32;
      C_PORTB_ADDR_WIDTH	: integer range 0 to 14 := 9;
      C_WRITE_MODE_A			: integer range 0 to 2  := 1;	-- 0: Read First, 1: Write First, 2: No Change
		C_WRITE_MODE_B 		: integer range 0 to 2  := 1;	-- 0: Read First, 1: Write First, 2: No Change
		C_PORTA_OUTPUT_REG  	: integer range 0 to 1  := 0;	-- 0: Pipeline output registers disabled, 1: Pipeline output registers enabled
		C_PORTB_OUTPUT_REG  	: integer range 0 to 1  := 0;	-- 0: Pipeline output registers disabled, 1: Pipeline output registers enabled
      C_INIT_DATA     		: integer := 0						-- Init data for each dataword (smallest data width)
	);
	port (
      clk_a_i    : in std_logic;
      enable_a_i : in std_logic;
      we_a_i     : in std_logic;
      addr_a_i   : in std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
      data_a_i   : in std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
      data_a_o   : out std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);

      clk_b_i    : in std_logic;
      enable_b_i : in std_logic;
      we_b_i     : in std_logic;
      addr_b_i   : in std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
      data_b_i   : in std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0);
      data_b_o   : out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
	);
end ram_tdp_simple;

architecture behavioral of ram_tdp_simple is

	attribute RAM_STYLE : string;

	constant MAX_DATA_WIDTH	: integer := max(C_PORTA_DATA_WIDTH, C_PORTB_DATA_WIDTH);
	constant MIN_DATA_WIDTH	: integer := min(C_PORTA_DATA_WIDTH, C_PORTB_DATA_WIDTH);
	constant MAX_ADDR_WIDTH	: integer := max(C_PORTA_ADDR_WIDTH, C_PORTB_ADDR_WIDTH);
	constant MIN_ADDR_WIDTH	: integer := min(C_PORTA_ADDR_WIDTH, C_PORTB_ADDR_WIDTH);
	
	constant RATIO 	 : integer := MAX_DATA_WIDTH / MIN_DATA_WIDTH;

	constant ram_init : std_logic_vector(MIN_DATA_WIDTH-1 downto 0) := (std_logic_vector(TO_SIGNED(C_INIT_DATA, MIN_DATA_WIDTH)));
	
	type ramType is array (0 to (2**MAX_ADDR_WIDTH)-1) of std_logic_vector(MIN_DATA_WIDTH-1 downto 0);

	shared variable ram : ramType := (others => ram_init);
	attribute RAM_STYLE of ram: variable is C_RAMSTYLE;
  
	signal clkA	 : std_logic;
	signal clkB	 : std_logic;
	signal enA	 : std_logic;
	signal enB	 : std_logic;	
	signal weA	 : std_logic;
	signal weB	 : std_logic;
	signal diA	 : std_logic_vector(MIN_DATA_WIDTH-1 downto 0);
	signal diB	 : std_logic_vector(MAX_DATA_WIDTH-1 downto 0);
	signal addrA : std_logic_vector(MAX_ADDR_WIDTH-1 downto 0);
	signal addrB : std_logic_vector(MIN_ADDR_WIDTH-1 downto 0);
	signal readA : std_logic_vector(MIN_DATA_WIDTH-1 downto 0)		:= (others => '0');
	signal readB : std_logic_vector(MAX_DATA_WIDTH-1 downto 0)		:= (others => '0');
	signal regA  : std_logic_vector(MIN_DATA_WIDTH-1 downto 0)		:= (others => '0');
	signal regB  : std_logic_vector(MAX_DATA_WIDTH-1 downto 0)		:= (others => '0');

begin

	ASSERT 2**C_PORTA_ADDR_WIDTH * C_PORTA_DATA_WIDTH = 2**C_PORTB_ADDR_WIDTH * C_PORTB_DATA_WIDTH REPORT "Number of accessible bits on port_a and port_b MUST be identical!" SEVERITY FAILURE;
	--ASSERT MIN_DATA_WIDTH*(2**MAX_ADDR_WIDTH)<=16384 REPORT "Memories larger than one BlockRAM (16Kbit) can't efficiently be inferred with the current (ISE 13.4) tool version!" SEVERITY FAILURE;
	ASSERT MIN_DATA_WIDTH*(2**MAX_ADDR_WIDTH)<=18432 REPORT "Memories larger than one BlockRAM (18Kbit) can't efficiently be inferred with the current (ISE 13.4) tool version!" SEVERITY FAILURE;

	prc_a_io_mapping1:
	if C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH generate
	begin
		clkA 		<= clk_a_i;
		enA		<= enable_a_i;
		weA		<= we_a_i;
		diA		<= data_a_i;
		addrA		<= addr_a_i;
		
		enable_a_o_reg:
		if C_PORTA_OUTPUT_REG=1 generate
			data_a_o	<= regA;
		end generate;
		disable_a_o_reg:
		if C_PORTA_OUTPUT_REG=0 generate
			data_a_o	<= readA;
		end generate;	
		
		clkB 		<= clk_b_i;
		enB		<= enable_b_i;
		weB		<= we_b_i;
		addrB		<= addr_b_i;
		diB		<= data_b_i;

		enable_b_o_reg:
		if C_PORTB_OUTPUT_REG=1 generate
			data_b_o	<= regB;
		end generate;
		disable_b_o_reg:
		if C_PORTB_OUTPUT_REG=0 generate
			data_b_o	<= readB;
		end generate;	
		
	end generate;

	prc_a_io_mapping2:
	if C_PORTB_DATA_WIDTH < C_PORTA_DATA_WIDTH generate
	begin
		clkA 		<= clk_b_i;
		enA		<= enable_b_i;
		weA		<= we_b_i;
		addrA		<= addr_b_i;
		diA		<= data_b_i;
		enable_b_o_reg:
		if C_PORTB_OUTPUT_REG=1 generate
			data_b_o	<= regA;
		end generate;
		disable_b_o_reg:
		if C_PORTB_OUTPUT_REG=0 generate
			data_b_o	<= readA;
		end generate;		
		
		clkB 		<= clk_a_i;
		enB		<= enable_a_i;
		weB		<= we_a_i;
		addrB		<= addr_a_i;
		diB		<= data_a_i;		
		enable_a_o_reg:
		if C_PORTA_OUTPUT_REG=1 generate
			data_a_o	<= regB;
		end generate;
		disable_a_o_reg:
		if C_PORTA_OUTPUT_REG=0 generate
			data_a_o	<= readB;
		end generate;	
	end generate;

	process (clkA)
	begin
	 if rising_edge(clkA) then
	 
		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_WRITE_MODE_A=0) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_WRITE_MODE_B=0)
		THEN
			-- READ FIRST			
			if enA = '1' then
				readA <= ram(to_integer(unsigned(addrA)));			
				if weA = '1' then
					ram(to_integer(unsigned(addrA))) := diA;
				end if;			  
			end if;
		END IF;	 
	 
		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_WRITE_MODE_A=1) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_WRITE_MODE_B=1)
		THEN
			-- WRITE FIRST
			if enA = '1' then
			  if weA = '1' then
				 ram(to_integer(unsigned(addrA))) := diA;
			  end if;
			  readA <= ram(to_integer(unsigned(addrA)));
			end if;
		END IF;
		
		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_WRITE_MODE_A=2) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_WRITE_MODE_B=2)
		THEN
			-- NO CHANGE
			if enA = '1' then
				if weA = '1' then
					ram(to_integer(unsigned(addrA))) := diA;
				else
					readA <= ram(to_integer(unsigned(addrA)));
				end if;			  
			end if;
		END IF;		
		
		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_PORTA_OUTPUT_REG=1) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_PORTB_OUTPUT_REG=1)
		THEN
			regA <= readA;
		END IF;
		
	 end if;
	end process;

	process (clkB)
		variable addr : std_logic_vector(MAX_ADDR_WIDTH-1 downto 0);
	begin
	 if rising_edge(clkB) then

		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_WRITE_MODE_B=0) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_WRITE_MODE_A=0)
		THEN
			-- READ FIRST
			if enB = '1' then        
				for i in 0 to RATIO-1 loop
					addr := addrB & std_logic_vector(to_unsigned(i,log2c(RATIO)));
					readB((i+1)*MIN_DATA_WIDTH-1 downto i*MIN_DATA_WIDTH) <= ram(to_integer(unsigned(addr)));
					if weB = '1' then
						ram(to_integer(unsigned(addr))) := diB((i+1)*MIN_DATA_WIDTH-1 downto i*MIN_DATA_WIDTH);
					end if;					
				end loop;
			end if;

		END IF;
	 
		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_WRITE_MODE_B=1) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_WRITE_MODE_A=1)
		THEN
			-- WRITE FIRST
			if enB = '1' then        
				for i in 0 to RATIO-1 loop
					addr := addrB & std_logic_vector(to_unsigned(i,log2c(RATIO)));
					if weB = '1' then
						ram(to_integer(unsigned(addr))) := diB((i+1)*MIN_DATA_WIDTH-1 downto i*MIN_DATA_WIDTH);
					end if;
					readB((i+1)*MIN_DATA_WIDTH-1 downto i*MIN_DATA_WIDTH) <= ram(to_integer(unsigned(addr)));
				end loop;
			end if;

		END IF;

		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_WRITE_MODE_B=2) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_WRITE_MODE_A=2)
		THEN
			-- NO CHANGE
			if enB = '1' then        
				for i in 0 to RATIO-1 loop
					addr := addrB & std_logic_vector(to_unsigned(i,log2c(RATIO)));
					if weB = '1' then
						ram(to_integer(unsigned(addr))) := diB((i+1)*MIN_DATA_WIDTH-1 downto i*MIN_DATA_WIDTH);
					else
						readB((i+1)*MIN_DATA_WIDTH-1 downto i*MIN_DATA_WIDTH) <= ram(to_integer(unsigned(addr)));
					end if;					
				end loop;
			end if;

		END IF;

		IF ((C_PORTA_DATA_WIDTH <= C_PORTB_DATA_WIDTH) AND C_PORTB_OUTPUT_REG=1) OR
			((C_PORTB_DATA_WIDTH <  C_PORTA_DATA_WIDTH) AND C_PORTA_OUTPUT_REG=1)
		THEN
			regB <= readB;
		END IF;

	 end if;
	end process;
  
end behavioral;

							