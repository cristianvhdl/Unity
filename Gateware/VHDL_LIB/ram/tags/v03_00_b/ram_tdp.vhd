----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:13:49 05/05-2012 
-- Design Name: 
-- Module Name:    ram_tdp - Behavioral
-- Project Name: 
-- Target Devices: Spartan6 and Virtex6 (Spartan3 using the simple_tdp_ram_gen architecture)
-- Tool versions:  ISE 13.4 - 14.2 
-- Description:  	 
--	
--		True Dual Ported Memory with support for different aspect 
--		ratios on port_a <> port_b.
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
-- 0.01		05/05-2012	ANLAN		File Created
-- 1.00		06/05-2012	ANLAN		First release
-- 1.01		07/05-2012	ANLAN		Output logic updated to ensure correct data selection.
-- 2.00		15/05-2012	ANLAN		sp6_tdp_ram_gen architecture added, providing optimized implementation for spartan 6 and virtex 6 devices (or newer)
-- 2.01		04/10-2012	ANLAN		Header updated with new layout and GPL v3 license
-- 3.00		09/10-2012	ANLAN		sp6_tdp_ram_gen architecture updated with new procedure for calculating the memory-matrix's width and depth
-- 3.01		11/10-2012	ANLAN		Negative/Null range indexing removed from the 'simple_tdp_ram_gen'
--											architecture to avoid Spartan3 synthesizer malfunction.
-- 3.02 		16/10-2012 	ANLAN		Module split into two components and added to the ram_pkg package.
--	3.03		
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

use work.ram_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE ram_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity ram_tdp is
   generic ( 
      C_RAMSTYLE      		: string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
		C_PORTA_DATA_WIDTH	: integer := 8;
		C_PORTA_ADDR_WIDTH	: integer := 13;
		C_PORTB_DATA_WIDTH	: integer := 32;
      C_PORTB_ADDR_WIDTH	: integer := 11;
      C_WRITE_MODE_A			: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
		C_WRITE_MODE_B 		: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
		C_PORTA_OUTPUT_REG  	: integer range 0 to 1 := 0;
		C_PORTB_OUTPUT_REG  	: integer range 0 to 1 := 0;
      C_INIT_DATA     		: integer := 0
      ); 
	port (
		 clk_a_i		: in  std_logic;
		 en_a_i		: in  std_logic;
		 we_a_i		: in	std_logic;
		 addr_a_i	: in  std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
		 din_a_i		: in  std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
		 dout_a_o 	: out std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
		 
		 clk_b_i		: in  std_logic;
		 en_b_i		: in  std_logic;
		 we_b_i 		: in  std_logic;
		 addr_b_i 	: in  std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
		 din_b_i 	: in  std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0);
		 dout_b_o 	: out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
	);
end ram_tdp;

architecture tdp_ram_gen of ram_tdp is

	------------------------------------------------------
	-- Symmetric W*D (X*Y) matrix BRAM calculator
	------------------------------------------------------	
   procedure bram_mem_calc (port_a_addr_width, port_a_data_width, port_b_addr_width, port_b_data_width : in integer;
									 memory_depth, memory_width : out integer) is
		
		constant MAX_BRAM_ADDR_WIDTH 	: integer := 14;		-- bits
		constant MAX_BRAM_DATA_WIDTH 	: integer := 36;		-- bits
		constant MAX_BRAM_MEMORY_SIZE : integer := 18432;	-- bits (18kB)
		
		constant min_addr_width 		: integer := min(port_a_addr_width, port_b_addr_width);
		constant max_addr_width 		: integer := max(port_a_addr_width, port_b_addr_width);
		constant min_data_width 		: integer := min(port_a_data_width, port_b_data_width);
		constant max_data_width 		: integer := max(port_a_data_width, port_b_data_width);
		
		constant mem_size_a				: integer := (2**port_a_addr_width)*port_a_data_width;
		constant mem_size_b				: integer := (2**port_b_addr_width)*port_b_data_width;
		
		variable mem_size					: integer;
		variable n_optimal				: integer;
		variable n_actual					: integer;
		
		variable tmp						: real;
		
		variable mem_d						: integer;
		variable mem_w						: integer;
   begin
      
		-- Verify port A/B memory size
		if mem_size_a = mem_size_b then
			mem_size := mem_size_a;
		else
			ASSERT FALSE REPORT "Number of accessible bits on port_a and port_b MUST be identical!" SEVERITY FAILURE;
		end if;
		
		-- Calc optimal BRAM count
		n_optimal := 1;
		tmp := real(mem_size)/real(n_optimal);
		while tmp > real(MAX_BRAM_MEMORY_SIZE) loop
			n_optimal := n_optimal+1;
			tmp := real(mem_size)/real(n_optimal);
		end loop;
		
		n_actual := n_optimal;
		
		-- Fit using mem_width (mem_w) and mem_depth (mem_d) @ current n_actual while minimizing mem_d, if unsuccessful increment n_actual"
		-- RULE: mem_d * mem_w == n_actual
		-- RULE: mem_d must be power of 2
		-- RULE: port_a/b_data_width must be module of mem_w
		
		mem_d := 1;
		mem_w	:= n_actual;
		
		while not((mem_size <= mem_d*mem_w*MAX_BRAM_MEMORY_SIZE) and 									-- mem_d*mem_w*MAX_BRAM_MEMORY_SIZE MUST be equal or greater than needed mem_size
					 (mem_d=1 or (mem_d mod 2)=0) and 															-- mem_d MUST be power of 2
					 ((port_a_data_width mod mem_w)=0) and ((port_b_data_width mod mem_w)=0) and	-- port_a/b_data_width MOD mem_w MUST yeild 0
					 ((max_data_width/mem_w) <= MAX_BRAM_DATA_WIDTH) and									-- max_data_width/mem_w MUST be less or equal to MAX_BRAM_DATA_WIDTH
					 ((max_addr_width-log2c(mem_d)) <= MAX_BRAM_DATA_WIDTH)								-- max_addr_width-log2(mem_d) MUST be less or equal to MAX_BRAM_DATA_WIDTH
					 ) loop
			mem_d := mem_d*2;
			mem_w := integer(real(n_actual)/real(mem_d));
			
			if mem_d*mem_w>n_actual or mem_w=0 then
				n_actual := n_actual+1;
				mem_d := 1;
				mem_w := n_actual;
			end if;
			
		end loop;
		
		memory_depth := mem_d;
		memory_width := mem_w;
				
   end bram_mem_calc;
	------------------------------------------------------
	
	-- wrapper function in order to enable usage of the bram_mem_calc procedure to initialize the MEM_DEPTH constant
   function calc_memory_depth (port_a_addr_width, port_a_data_width, port_b_addr_width, port_b_data_width : in integer) return integer is
		variable mem_d, mem_w : integer;
	begin      
		
		bram_mem_calc(port_a_addr_width, port_a_data_width, port_b_addr_width, port_b_data_width, mem_d, mem_w);		
		return mem_d;		
		
   end calc_memory_depth;
	
	-- wrapper function in order to enable usage of the bram_mem_calc procedure to initialize the MEM_WIDTH constant
   function calc_memory_width (port_a_addr_width, port_a_data_width, port_b_addr_width, port_b_data_width : in integer) return integer is
		variable mem_d, mem_w : integer;
	begin      
		
		bram_mem_calc(port_a_addr_width, port_a_data_width, port_b_addr_width, port_b_data_width, mem_d, mem_w);		
		return mem_w;		
		
   end calc_memory_width;	
	
	------------------------------------------------------
	-- Memory matrix parameters
	------------------------------------------------------	
	-- Memory depth (address width) : Y
	constant MEM_DEPTH  			: integer := calc_memory_depth(C_PORTA_ADDR_WIDTH, C_PORTA_DATA_WIDTH, C_PORTB_ADDR_WIDTH, C_PORTB_DATA_WIDTH);

	-- Memory width (data width) : X
	constant MEM_WIDTH  			: integer := calc_memory_width(C_PORTA_ADDR_WIDTH, C_PORTA_DATA_WIDTH, C_PORTB_ADDR_WIDTH, C_PORTB_DATA_WIDTH);

	constant PORTA_DATA_WIDTH 	: integer := C_PORTA_DATA_WIDTH/MEM_WIDTH;
	constant PORTA_ADDR_WIDTH 	: integer := C_PORTA_ADDR_WIDTH-log2c(MEM_DEPTH);
	constant PORTB_DATA_WIDTH 	: integer := C_PORTB_DATA_WIDTH/MEM_WIDTH;
	constant PORTB_ADDR_WIDTH 	: integer := C_PORTB_ADDR_WIDTH-log2c(MEM_DEPTH);
	------------------------------------------------------
	
	type din_a_array is array (0 to MEM_WIDTH-1) of std_logic_vector(PORTA_DATA_WIDTH-1 downto 0);
	type din_b_array is array (0 to MEM_WIDTH-1) of std_logic_vector(PORTB_DATA_WIDTH-1 downto 0);
	type dout_a_array is array (0 to MEM_WIDTH-1) of std_logic_vector(PORTA_DATA_WIDTH-1 downto 0);
	type dout_b_array is array (0 to MEM_WIDTH-1) of std_logic_vector(PORTB_DATA_WIDTH-1 downto 0);
	
	type dout_a_matrix is array (0 to MEM_DEPTH-1) of dout_a_array;
	type dout_b_matrix is array (0 to MEM_DEPTH-1) of dout_b_array;
	
	signal we_a 	: std_logic_vector(MEM_DEPTH-1 downto 0);
	signal din_a	: din_a_array;
	signal dout_a	: dout_a_matrix;
	
	signal we_b 	: std_logic_vector(MEM_DEPTH-1 downto 0);
	signal din_b	: din_b_array;
	signal dout_b	: dout_b_matrix;

	signal addr_a_hreg : std_logic_vector(C_PORTA_ADDR_WIDTH-PORTA_ADDR_WIDTH-1 downto 0) := (others=>'0');
	signal addr_b_hreg : std_logic_vector(C_PORTB_ADDR_WIDTH-PORTB_ADDR_WIDTH-1 downto 0) := (others=>'0');

begin

	-- address a (high part) register
	process(clk_a_i)
	begin
		if rising_edge(clk_a_i) then
			addr_a_hreg <= addr_a_i(C_PORTA_ADDR_WIDTH-1 downto PORTA_ADDR_WIDTH);
		end if;
	end process;
	
	-- address b (high part) register
	process(clk_b_i)
	begin
		if rising_edge(clk_b_i) then
			addr_b_hreg <= addr_b_i(C_PORTB_ADDR_WIDTH-1 downto PORTB_ADDR_WIDTH);
		end if;
	end process;

	MEM_DEPTH_GEN:
	for y in 0 to MEM_DEPTH-1 generate
	begin
		MEM_WIDTH_GEN:
		for x in 0 to MEM_WIDTH-1 generate
		begin
		
			WE_GEN1:
			if MEM_DEPTH=1 generate
				we_a(y) <= '1' when we_a_i='1' else '0';
				we_b(y) <= '1' when we_b_i='1' else '0';
			end generate;		
		
			WE_GEN2:
			if MEM_DEPTH>1 generate
				we_a(y) <= '1' when unsigned(addr_a_hreg)=y and we_a_i='1' else '0';
				we_b(y) <= '1' when unsigned(addr_b_hreg)=y and we_b_i='1' else '0';
			end generate;
			
		
			DATA_IN_GEN1:
			if PORTA_DATA_WIDTH=PORTB_DATA_WIDTH generate
				din_a(x) <= din_a_i(((x+1)*PORTA_DATA_WIDTH)-1 downto ((x)*PORTA_DATA_WIDTH));
				din_b(x) <= din_b_i(((x+1)*PORTB_DATA_WIDTH)-1 downto ((x)*PORTB_DATA_WIDTH));
			end generate;
			
			DATA_IN_GEN2:
			if PORTA_DATA_WIDTH<PORTB_DATA_WIDTH generate
				
				din_a(x) <= din_a_i(((x+1)*PORTA_DATA_WIDTH)-1 downto ((x)*PORTA_DATA_WIDTH));
				
				SPLIT_DATA_OUT_GEN1:
				for i in 0 to (PORTB_DATA_WIDTH/PORTA_DATA_WIDTH)-1 generate
				begin
					din_b(x)(((i+1)*PORTA_DATA_WIDTH)-1 downto (i*PORTA_DATA_WIDTH)) <= din_b_i((i*(C_PORTB_DATA_WIDTH/(PORTB_DATA_WIDTH/PORTA_DATA_WIDTH)))+((x+1)*PORTA_DATA_WIDTH)-1 downto (i*(C_PORTB_DATA_WIDTH/(PORTB_DATA_WIDTH/PORTA_DATA_WIDTH)))+(x*PORTA_DATA_WIDTH));
				end generate;																																	
				
			end generate;
		
			DATA_IN_GEN3:
			if PORTA_DATA_WIDTH>PORTB_DATA_WIDTH generate
			
				SPLIT_DATA_OUT_GEN2:
				for i in 0 to (PORTA_DATA_WIDTH/PORTB_DATA_WIDTH)-1 generate
				begin
					din_a(x)(((i+1)*PORTB_DATA_WIDTH)-1 downto (i*PORTB_DATA_WIDTH)) <= din_a_i((i*(C_PORTA_DATA_WIDTH/(PORTA_DATA_WIDTH/PORTB_DATA_WIDTH)))+((x+1)*PORTB_DATA_WIDTH)-1 downto (i*(C_PORTA_DATA_WIDTH/(PORTA_DATA_WIDTH/PORTB_DATA_WIDTH)))+(x*PORTB_DATA_WIDTH));					
				end generate;
				
				din_b(x) <= din_b_i(((x+1)*PORTB_DATA_WIDTH)-1 downto ((x)*PORTB_DATA_WIDTH));
				
			end generate;		
		
		
			ram_tdp_simple_inst : ram_tdp_simple
			generic map(
				C_RAMSTYLE      		=> C_RAMSTYLE,
				C_PORTA_DATA_WIDTH	=> PORTA_DATA_WIDTH,
				C_PORTA_ADDR_WIDTH	=> PORTA_ADDR_WIDTH,
				C_PORTB_DATA_WIDTH	=> PORTB_DATA_WIDTH,
				C_PORTB_ADDR_WIDTH	=> PORTB_ADDR_WIDTH,
				C_WRITE_MODE_A			=> C_WRITE_MODE_A,
				C_WRITE_MODE_B 		=> C_WRITE_MODE_B,
				C_PORTA_OUTPUT_REG  	=> C_PORTA_OUTPUT_REG,
				C_PORTB_OUTPUT_REG  	=> C_PORTB_OUTPUT_REG,
				C_INIT_DATA     		=> C_INIT_DATA
			)
			port map(
				clk_a_i    => clk_a_i,
				enable_a_i => en_a_i,
				we_a_i     => we_a(y),
				addr_a_i   => addr_a_i(PORTA_ADDR_WIDTH-1 downto 0),
				data_a_i   => din_a(x),
				data_a_o   => dout_a(y)(x),

				clk_b_i    => clk_b_i,
				enable_b_i => en_b_i,
				we_b_i     => we_b(y),
				addr_b_i   => addr_b_i(PORTB_ADDR_WIDTH-1 downto 0),
				data_b_i   => din_b(x),
				data_b_o   => dout_b(y)(x)
			);
			

			DATA_OUT_GEN1:
			if PORTA_DATA_WIDTH=PORTB_DATA_WIDTH generate
				dout_a_o(((x+1)*PORTA_DATA_WIDTH)-1 downto ((x)*PORTA_DATA_WIDTH)) <= dout_a(to_integer(unsigned(addr_a_hreg)))(x);
				dout_b_o(((x+1)*PORTB_DATA_WIDTH)-1 downto ((x)*PORTB_DATA_WIDTH)) <= dout_b(to_integer(unsigned(addr_b_hreg)))(x);
			end generate;
			
			DATA_OUT_GEN2:
			if PORTA_DATA_WIDTH<PORTB_DATA_WIDTH generate
				
				dout_a_o(((x+1)*PORTA_DATA_WIDTH)-1 downto ((x)*PORTA_DATA_WIDTH)) <= dout_a(to_integer(unsigned(addr_a_hreg)))(x);				
				
				SPLIT_DATA_OUT_GEN1:
				for i in 0 to (PORTB_DATA_WIDTH/PORTA_DATA_WIDTH)-1 generate
				begin
					dout_b_o((i*(C_PORTB_DATA_WIDTH/(PORTB_DATA_WIDTH/PORTA_DATA_WIDTH)))+((x+1)*PORTA_DATA_WIDTH)-1 downto (i*(C_PORTB_DATA_WIDTH/(PORTB_DATA_WIDTH/PORTA_DATA_WIDTH)))+(x*PORTA_DATA_WIDTH)) <= dout_b(to_integer(unsigned(addr_b_hreg)))(x)(((i+1)*PORTA_DATA_WIDTH)-1 downto (i*PORTA_DATA_WIDTH));
				end generate;
				
			end generate;
		
			DATA_OUT_GEN3:
			if PORTA_DATA_WIDTH>PORTB_DATA_WIDTH generate
			
				SPLIT_DATA_OUT_GEN2:
				for i in 0 to (PORTA_DATA_WIDTH/PORTB_DATA_WIDTH)-1 generate
				begin
					dout_a_o((i*(C_PORTA_DATA_WIDTH/(PORTA_DATA_WIDTH/PORTB_DATA_WIDTH)))+((x+1)*PORTB_DATA_WIDTH)-1 downto (i*(C_PORTA_DATA_WIDTH/(PORTA_DATA_WIDTH/PORTB_DATA_WIDTH)))+(x*PORTB_DATA_WIDTH)) <= dout_a(to_integer(unsigned(addr_a_hreg)))(x)(((i+1)*PORTB_DATA_WIDTH)-1 downto (i*PORTB_DATA_WIDTH));
				end generate;
				
				dout_b_o(((x+1)*PORTB_DATA_WIDTH)-1 downto ((x)*PORTB_DATA_WIDTH)) <= dout_b(to_integer(unsigned(addr_b_hreg)))(x);
				
			end generate;
			
		end generate;
	end generate;		

end tdp_ram_gen;


library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

library utility_v01_00_a;
use utility_v01_00_a.util_pkg.all;
use utility_v01_00_a.log_pkg.all;

use work.ram_pkg.all;


-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE ram_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity ram_tdp_legacy is
   generic ( 
      C_RAMSTYLE      		: string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
		C_PORTA_DATA_WIDTH	: integer := 8;
		C_PORTA_ADDR_WIDTH	: integer := 13;
		C_PORTB_DATA_WIDTH	: integer := 32;
      C_PORTB_ADDR_WIDTH	: integer := 11;
      C_WRITE_MODE_A			: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
		C_WRITE_MODE_B 		: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
		C_PORTA_OUTPUT_REG  	: integer range 0 to 1 := 0;
		C_PORTB_OUTPUT_REG  	: integer range 0 to 1 := 0;
      C_INIT_DATA     		: integer := 0
      ); 
	port (
		 clk_a_i		: in  std_logic;
		 en_a_i		: in  std_logic;
		 we_a_i		: in	std_logic;
		 addr_a_i	: in  std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
		 din_a_i		: in  std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
		 dout_a_o 	: out std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
		 
		 clk_b_i		: in  std_logic;
		 en_b_i		: in  std_logic;
		 we_b_i 		: in  std_logic;
		 addr_b_i 	: in  std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
		 din_b_i 	: in  std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0);
		 dout_b_o 	: out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
	);
end ram_tdp_legacy;

architecture tdp_legacy_ram_gen of ram_tdp_legacy is

	------------------------------------------------------
	-- use the smallest data+addr width
	------------------------------------------------------
	constant MAX_DATA_WIDTH	: integer := max(C_PORTA_DATA_WIDTH, C_PORTB_DATA_WIDTH);
	constant MIN_DATA_WIDTH	: integer := min(C_PORTA_DATA_WIDTH, C_PORTB_DATA_WIDTH);
	constant MAX_ADDR_WIDTH	: integer := max(C_PORTA_ADDR_WIDTH, C_PORTB_ADDR_WIDTH);
	constant MIN_ADDR_WIDTH	: integer := min(C_PORTA_ADDR_WIDTH, C_PORTB_ADDR_WIDTH);
	
	constant DATA_WIDTH 	: integer := MIN_DATA_WIDTH;
	constant ADDR_WIDTH 	: integer := MIN_ADDR_WIDTH;
	constant ADDR_WDIF	: integer := MAX_ADDR_WIDTH-MIN_ADDR_WIDTH;
	constant MEM_COUNT  	: integer := MAX_DATA_WIDTH/MIN_DATA_WIDTH;
	------------------------------------------------------
	
	signal en_a 	: std_logic;
	signal we_a 	: std_logic_vector(MEM_COUNT-1 downto 0);
	signal addr_a 	: std_logic_vector(ADDR_WIDTH-1 downto 0);
	signal din_a 	: std_logic_vector((MEM_COUNT*DATA_WIDTH)-1 downto 0);
	signal dout_a 	: std_logic_vector((MEM_COUNT*DATA_WIDTH)-1 downto 0);

	signal en_b 	: std_logic;
	signal we_b 	: std_logic_vector(MEM_COUNT-1 downto 0);
	signal addr_b 	: std_logic_vector(ADDR_WIDTH-1 downto 0);
	signal din_b 	: std_logic_vector((MEM_COUNT*DATA_WIDTH)-1 downto 0);
	signal dout_b 	: std_logic_vector((MEM_COUNT*DATA_WIDTH)-1 downto 0);

	signal o_sel	: std_logic_vector(ADDR_WDIF-1 downto 0) := (others=>'0');

begin
	
	ASSERT 2**C_PORTA_ADDR_WIDTH * C_PORTA_DATA_WIDTH = 2**C_PORTB_ADDR_WIDTH * C_PORTB_DATA_WIDTH REPORT "Number of accessible bits on port_a and port_b MUST be identical!" SEVERITY FAILURE;

	DIN_GEN_A:
	if C_PORTA_DATA_WIDTH = C_PORTB_DATA_WIDTH generate
	begin	
		process(en_a_i, we_a_i, addr_a_i, din_a_i, en_b_i, we_b_i, addr_b_i, din_b_i)
		begin
			en_a <= en_a_i;
			we_a <= (others=>'0');
			we_a(0) <= we_a_i;		
			addr_a <= addr_a_i(C_PORTA_ADDR_WIDTH-1 downto ADDR_WDIF);			
			for i in 0 to MEM_COUNT-1 loop
				din_a((DATA_WIDTH*(i+1))-1 downto (DATA_WIDTH*i))  <= din_a_i;
			end loop;			
			
			en_b   <= en_b_i;			
			for i in 0 to MEM_COUNT-1 loop
				we_b(i) <= we_b_i;
			end loop;			
			addr_b <= addr_b_i;
			din_b  <= din_b_i;
		end process;
	end generate;
	
	DIN_GEN_B:
	if C_PORTA_DATA_WIDTH < C_PORTB_DATA_WIDTH generate
	begin	
		process(en_a_i, we_a_i, addr_a_i, din_a_i, en_b_i, we_b_i, addr_b_i, din_b_i)
		begin
			en_a <= en_a_i;
			we_a <= (others=>'0');
			we_a(to_integer(unsigned(addr_a_i(ADDR_WDIF-1 downto 0)))) <= we_a_i;		
			addr_a <= addr_a_i(C_PORTA_ADDR_WIDTH-1 downto ADDR_WDIF);			
			for i in 0 to MEM_COUNT-1 loop
				din_a((DATA_WIDTH*(i+1))-1 downto (DATA_WIDTH*i))  <= din_a_i;
			end loop;			
			
			en_b   <= en_b_i;			
			for i in 0 to MEM_COUNT-1 loop
				we_b(i) <= we_b_i;
			end loop;			
			addr_b <= addr_b_i;
			din_b  <= din_b_i;
		end process;
	end generate;	
	
	DIN_GEN_C:
	if C_PORTB_DATA_WIDTH < C_PORTA_DATA_WIDTH generate
	begin		
		process(en_a_i, we_a_i, addr_a_i, din_a_i, en_b_i, we_b_i, addr_b_i, din_b_i)
		begin
			en_a 	 <= en_a_i;
			for i in 0 to MEM_COUNT-1 loop
				we_a(i) <= we_a_i;
			end loop;
			addr_a <= addr_a_i;
			din_a  <= din_a_i;
			
			en_b   <= en_b_i;
			we_b   <= (others=>'0');
			we_b(to_integer(unsigned(addr_b_i(ADDR_WDIF-1 downto 0)))) <= we_b_i;
			addr_b <= addr_b_i(C_PORTB_ADDR_WIDTH-1 downto ADDR_WDIF);
			for i in 0 to MEM_COUNT-1 loop
				din_b((DATA_WIDTH*(i+1))-1 downto (DATA_WIDTH*i))  <= din_b_i;
			end loop;				
		end process;	
	end generate;
		
	MEM_GEN:
	for i in 0 to MEM_COUNT-1 generate
	begin
		ram_rwrw_inst : ram_rwrw
			generic map( 
				ADDR_WIDTH    => ADDR_WIDTH,
				DATA_WIDTH    => DATA_WIDTH,
				RAMSTYLE      => C_RAMSTYLE,
				PIPE_REGA_EN  => C_PORTA_OUTPUT_REG,
				PIPE_REGB_EN  => C_PORTB_OUTPUT_REG,
				WRITE_MODE_A  => C_WRITE_MODE_A,
				WRITE_MODE_B  => C_WRITE_MODE_B,
				INIT_DATA     => C_INIT_DATA
				)      
			port map( 
				clk_a_i    => clk_a_i,
				enable_a_i => en_a,
				we_a_i     => we_a(i),
				addr_a_i   => addr_a,
				data_a_i   => din_a((DATA_WIDTH*(i+1))-1 downto (DATA_WIDTH*i)),
				data_a_o   => dout_a((DATA_WIDTH*(i+1))-1 downto (DATA_WIDTH*i)),

				clk_b_i    => clk_b_i,
				enable_b_i => en_b,
				we_b_i     => we_b(i),
				addr_b_i   => addr_b,
				data_b_i   => din_b((DATA_WIDTH*(i+1))-1 downto (DATA_WIDTH*i)),
				data_b_o   => dout_b((DATA_WIDTH*(i+1))-1 downto (DATA_WIDTH*i))
				);
	end generate;
	
	
	DOUT_GEN_A:
	if C_PORTA_DATA_WIDTH = C_PORTB_DATA_WIDTH generate
	begin	
		dout_a_o <= dout_a;
		dout_b_o <= dout_b;		
	end generate;
	
	DOUT_GEN_B:
	if C_PORTA_DATA_WIDTH < C_PORTB_DATA_WIDTH generate
	begin	
		process(clk_a_i)
		begin
			if rising_edge(clk_a_i) then
				o_sel	<= addr_a_i(o_sel'range);
			end if;
		end process;

		process(o_sel, dout_a, dout_b)
			variable n : integer;
		begin
			n := to_integer(unsigned(o_sel));
			dout_a_o <= dout_a((DATA_WIDTH*(n+1))-1 downto (DATA_WIDTH*n));
			dout_b_o <= dout_b;
		end process;
	end generate;	
	
	DOUT_GEN_C:
	if C_PORTB_DATA_WIDTH < C_PORTA_DATA_WIDTH generate
	begin
		process(clk_b_i)
		begin
			if rising_edge(clk_b_i) then
				o_sel	<= addr_b_i(o_sel'range);
			end if;
		end process;

		process(o_sel, dout_a, dout_b)
			variable n : integer;
		begin
			n := to_integer(unsigned(o_sel));
			dout_a_o <= dout_a;
			dout_b_o <= dout_b((DATA_WIDTH*(n+1))-1 downto (DATA_WIDTH*n));
		end process;
	end generate;
	
end tdp_legacy_ram_gen;