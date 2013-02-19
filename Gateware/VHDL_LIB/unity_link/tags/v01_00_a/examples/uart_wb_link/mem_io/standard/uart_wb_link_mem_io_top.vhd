----------------------------------------------------------------------------------
-- Company: University Of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    14:18:02 11/05/2012 
-- Design Name: 
-- Module Name:    uart_wb_link_mem_io_top - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- 0.01	11/05/2012	ANLAN		File Created
-- 0.02	10/08/2012	ANLAN		support for SPARTAN 3E clock generation added.
-- 0.03
--
-- Additional Comments: 
--
-- Depending on the FPGA family the CLK_MULTIPLY and CLK_DIDIVE generic
-- has the following constraints:
--
--         -----------------------------------------------
--         | generic \ fpga     | SPARTAN_6 | SPARTAN_3A |
--         -----------------------------------------------
-- 		  | Clock multiplier	  |  [1:256]  |   [1:32]   |
-- 		  | Clock divisor		  |  [2:256]  |   [1:32]   |
--         -----------------------------------------------
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

library wishbone_v01_00_a;
use wishbone_v01_00_a.wb_classic_interface.all;

library clock_gen_v01_00_a;
use clock_gen_v01_00_a.all;

entity uart_wb_link_mem_io_top is
	generic (
		C_FPGA_FAMILY					: string		:= "SPARTAN_6";	-- "SPARTAN_6", "SPARTAN_3A", "SPARTAN_3E"
		C_INPUT_CLK_PERIOD_NS 		: real		:= 5.0;				-- Period of the input clock source [ns]
		
		C_INPUT_CLK_MULTIPLY_96M	: positive	:= 12;				-- Adjust C_INPUT_CLK_MULTIPLY_96M and C_INPUT_CLK_DIVIDE_96M
		C_INPUT_CLK_DIVIDE_96M		: positive	:= 25;				-- so C_INPUT_CLK_MULTIPLY_96M/(C_INPUT_CLK_PERIOD_NS*C_INPUT_CLK_DIVIDE_96M) = 96 MHz
		
		C_INPUT_CLK_MULTIPLY_50M	: positive	:= 2;					-- Adjust C_INPUT_CLK_MULTIPLY_50M and C_INPUT_CLK_DIVIDE_50M
		C_INPUT_CLK_DIVIDE_50M		: positive	:= 8					-- so C_INPUT_CLK_MULTIPLY_50M/(C_INPUT_CLK_PERIOD_NS*C_INPUT_CLK_DIVIDE_50M) = 50 MHz
		);
	port ( 
		clk_i 	: in  std_logic;	

		rx_i 		: in  std_logic;
		tx_o 		: out std_logic;
		
		-- ADD/REMOVE USER IO PORT HERE ------

		leds_o 	: out std_logic_vector (6 downto 0)
		
		
		--------------------------------------		
		);
end uart_wb_link_mem_io_top;

architecture structural of uart_wb_link_mem_io_top is

	--**************************************************************************
	-- DO NOT EDIT BELOW THIS LINE
	--**************************************************************************

		-- Clock signals
		signal clk_uart : std_logic;
		signal clk_user : std_logic;
		
		signal wb_o : wb_ad32sb_if;
		signal wb_i : wb_d32ae_if;

	--**************************************************************************
	-- DO NOT EDIT ABOVE THIS LINE
	--**************************************************************************
	
begin	

	--**************************************************************************
	-- DO NOT EDIT BELOW THIS LINE
	--**************************************************************************
	
		-------------------------------------------------------------------------
		-- Clock generation logic
		-------------------------------------------------------------------------
		SPARTAN6_GEN:
		if C_FPGA_FAMILY = "SPARTAN_6" generate
			-- UART CLOCK GENERATOR @ 96MHz
			uart_clk_dcm : entity clock_gen_v01_00_a.clock_gen(spartan_6_clkgen)
				generic map (
					C_INPUT_CLK_PERIOD_NS 	=> C_INPUT_CLK_PERIOD_NS,
					C_CLK_MULTIPLY				=> C_INPUT_CLK_MULTIPLY_96M,
					C_CLK_DIVIDE				=> C_INPUT_CLK_DIVIDE_96M
				)
				port map ( 
					clk_i		=> clk_i,
					reset_i  => '0',
					clk_o 	=> clk_uart,
					locked_o => open
					);

			-- USER CLOCK GENERATOR @ 50MHz
			user_clk_dcm : entity clock_gen_v01_00_a.clock_gen(spartan_6_clkgen)
				generic map (
					C_INPUT_CLK_PERIOD_NS 	=> C_INPUT_CLK_PERIOD_NS,
					C_CLK_MULTIPLY				=> C_INPUT_CLK_MULTIPLY_50M,
					C_CLK_DIVIDE				=> C_INPUT_CLK_DIVIDE_50M
				)
				port map ( 
					clk_i		=> clk_i,
					reset_i  => '0',
					clk_o 	=> clk_user,
					locked_o => open
					);
		end generate;
		
		SPARTAN3A_GEN:
		if C_FPGA_FAMILY = "SPARTAN_3A" generate
			-- UART CLOCK GENERATOR @ 96MHz
			uart_clk_dcm : entity clock_gen_v01_00_a.clock_gen(spartan_3a_dcm)
				generic map (
					C_INPUT_CLK_PERIOD_NS 	=> C_INPUT_CLK_PERIOD_NS,
					C_CLK_MULTIPLY				=> C_INPUT_CLK_MULTIPLY_96M,
					C_CLK_DIVIDE				=> C_INPUT_CLK_DIVIDE_96M
				)
				port map ( 
					clk_i		=> clk_i,
					reset_i  => '0',
					clk_o 	=> clk_uart,
					locked_o => open
					);

			-- USER CLOCK GENERATOR @ 50MHz
			user_clk_dcm : entity clock_gen_v01_00_a.clock_gen(spartan_3a_dcm)
				generic map (
					C_INPUT_CLK_PERIOD_NS 	=> C_INPUT_CLK_PERIOD_NS,
					C_CLK_MULTIPLY				=> C_INPUT_CLK_MULTIPLY_50M,
					C_CLK_DIVIDE				=> C_INPUT_CLK_DIVIDE_50M
				)
				port map ( 
					clk_i		=> clk_i,
					reset_i  => '0',
					clk_o 	=> clk_user,
					locked_o => open
					);
		end generate;		
		
		SPARTAN3E_GEN:
		if C_FPGA_FAMILY = "SPARTAN_3E" generate
			-- UART CLOCK GENERATOR @ 96MHz
			uart_clk_dcm : entity clock_gen_v01_00_a.clock_gen(spartan_3e_dcm)
				generic map (
					C_INPUT_CLK_PERIOD_NS 	=> C_INPUT_CLK_PERIOD_NS,
					C_CLK_MULTIPLY				=> C_INPUT_CLK_MULTIPLY_96M,
					C_CLK_DIVIDE				=> C_INPUT_CLK_DIVIDE_96M
				)
				port map ( 
					clk_i		=> clk_i,
					reset_i  => '0',
					clk_o 	=> clk_uart,
					locked_o => open
					);

			-- USER CLOCK GENERATOR @ 50MHz
			user_clk_dcm : entity clock_gen_v01_00_a.clock_gen(spartan_3e_dcm)
				generic map (
					C_INPUT_CLK_PERIOD_NS 	=> C_INPUT_CLK_PERIOD_NS,
					C_CLK_MULTIPLY				=> C_INPUT_CLK_MULTIPLY_50M,
					C_CLK_DIVIDE				=> C_INPUT_CLK_DIVIDE_50M
				)
				port map ( 
					clk_i		=> clk_i,
					reset_i  => '0',
					clk_o 	=> clk_user,
					locked_o => open
					);
		end generate;				
		-------------------------------------------------------------------------

	--**************************************************************************
	-- DO NOT EDIT ABOWE THIS LINE
	--**************************************************************************

	--**************************************************************************
	-- ONLY EDIT BELOW THIS LINE TO ADJUST THE GENERIC CONFIGURATION OF THE 
	-- uart_wb_link_inst, READ THE GENERIC EDITING INFO BOX FIRST! 
	--**************************************************************************
		
		-----------------------------------------------------------------------
		-- GENERIC EDITING INFO:
		--
		-- Ensure the baud rate controlling generics is configured correct!
		--
		-- Generic that has been commented out are inactive, meaning the 
		-- qrc_uart_wb_link_inst uses its default value.
		-- Only uncomment and change these generics if you 
		-- understand what it will do! 
		-- Refer to the User Guide for detailed information.
		--		
		-----------------------------------------------------------------------

		-- C_PL_TICKS_PR_BIT=16, C_PL_BAUD_RATE_DVSR=2 : BAUD = 3000000
		-- C_PL_TICKS_PR_BIT=416, C_PL_BAUD_RATE_DVSR=2 : BAUD = 115200

		uart_wb_link_inst : entity work.uart_wb_link
			generic map (
			-- Physical Layer Configuration
			C_PL_TICKS_PR_BIT				=> 16,			-- number of (baudrate generator) ticks for each bit. MUST BE AN EVEN NUMBER. default = 16
			C_PL_BAUD_RATE_DVSR  		=> 2,				-- BAUD rate divisor: C_BAUD_RATE_DVSR = clk_frq/(C_TICKS_PR_BIT*baud_rate)
			--C_PL_STOPBITS					=> 1,			-- number of stopbits
			--C_PL_PARITY						=> 0,			-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE		
			-- Datalink Layer Configuration
			--C_DL_FULL						=> 1,				-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
			--C_DL_CHECKSUM					=> 2,			-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT		
			-- Application Layer Configuration
			--C_AL_RLC_EN						=> 1,			-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
			--C_AL_RM_SIZE						=> 32,		-- 0: RM disabled, 1-255: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
			--C_AL_PUB_MODE					=> 2,			-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
			--C_AL_PUBLISH_BASE_FREQ		=> 1000,		-- Publish sync strobe base frequency [Hz]			
			--C_AL_SUBMNGR_SGID_SIZE		=> 1,			-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
			--C_AL_SUBGRP_RATE_BYTE_CNT 	=> 2, 		-- Number of bytes in the RATE register of each subscription group
			--C_AL_SUBGRP_ADDR_WIDTH 		=> 4,			-- Size/depth of each subscription group = (2**C_AL_SUBGRP_ADDR_WIDTH) : RANGE=[4,8,16,32]		
			-- Wishbone Interface Configuration
			C_WB_CLK_FREQ					=> 50000000,	-- Wishbone clock frequency [Hz]
			C_WB_ADDR_WIDTH				=> 6				-- Wishbone bus address space/size
			--C_WB_DATA_WIDTH				=> 32				-- Wishbone bus data width: [8,16,32]
			)
			port map (		
				-- uart interface
				clk_uart_i		=> clk_uart,
				rx_uart_i		=> rx_i,
				tx_uart_o		=> tx_o,
				
				-- WB interface
				clk_i 			=> clk_user,
				rst_i 			=> '0',
				
				-- wb master interface
				wb_o 				=> wb_o,
				wb_i 				=> wb_i
			);
		
	--**************************************************************************
	-- ONLY EDIT ABOWE THIS LINE TO ADJUST THE GENERIC CONFIGURATION OF THE 
	-- uart_wb_link_inst, READ THE GENERIC EDITING INFO BOX FIRST! 
	--**************************************************************************


		-- point-to-point memory instance
		wb_mem_io_inst : entity work.wb_mem_io
			generic map(
				-- MEM configuration
				C_MEM_ADDR_WIDTH 		=> 6,		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
				C_DATA_WIDTH 			=> 32,	-- Data bit size	(TosNet/uTosNet mode: 32)
				C_RAMSTYLE				=> "AUTO",
				C_IO_ADDR_BIT 			=> 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], INPUT-ONLY mode: -2, OUTPUT-ONLY mode: -1
			)
			port map( 
					-- wb syscon interface	
					clk_i => clk_user,
					rst_i => '0',
					
					-- wb slave interface
					wb_i 	=> wb_o,
					wb_o 	=> wb_i,
					
					--------------------------------------------
					-- Insert User Logic below this line
					
					led_o => leds_o
					
					-- Insert User Logic above this line
					--------------------------------------------
			);
	
end structural;


