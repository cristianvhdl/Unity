----------------------------------------------------------------------------------
-- Company: University Of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    19:21:28 17/01/2012 
-- Design Name: 
-- Module Name:    clock_gen_spartan_3e_dcm - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- 0.01	17/01/2012	ANLAN		File Created
-- 0.02	10/08/2012	ANLAN		Architecture with Spartan 3E DCM primitive
--	0.03	22/11/2012	ANLAN		Architectures moved to individual modules
--	0.04	
--
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

Library UNISIM;
use UNISIM.vcomponents.all;

entity clock_gen_spartan_3e_dcm is
	generic (
		C_INPUT_CLK_PERIOD_NS 	: real 							:= 5.0;	-- Input clock period [ns]
		C_CLK_MULTIPLY				: positive range 1 to 32	:=	2;		-- Clock multiplier	 : dcm: [1:32]	
		C_CLK_DIVIDE				: positive range 1 to 32	:=	8		-- Clock divisor		 : dcm: [1:32]	
	);
	port ( 
		clk_i		: in  std_logic;
		reset_i  : in  std_logic;
      clk_o 	: out std_logic;
		locked_o : out std_logic
		);
end clock_gen_spartan_3e_dcm;

architecture structural of clock_gen_spartan_3e_dcm is

begin

	ASSERT (C_CLK_MULTIPLY>=1 and C_CLK_MULTIPLY<=32) REPORT "The value of C_CLK_MULTIPLY must be between 1 and 32" SEVERITY failure;
	ASSERT (C_CLK_DIVIDE>=1 and C_CLK_DIVIDE<=32) REPORT "The value of C_CLK_DIVIDE must be between 1 and 32" SEVERITY failure;

	----------------------------------------------------------------------------
	-- DCM (Spartan 3A primitive)
	----------------------------------------------------------------------------
		SP3E_DCM_inst : DCM_SP
		generic map (
			CLKDV_DIVIDE => 2.0, --  Divide by: 1.5,2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5,6.0,6.5
										--     7.0,7.5,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0 or 16.0
			CLKFX_DIVIDE => C_CLK_DIVIDE,   --  Can be any interger from 1 to 32
			CLKFX_MULTIPLY => C_CLK_MULTIPLY, --  Can be any integer from 1 to 32
			CLKIN_DIVIDE_BY_2 => FALSE, --  TRUE/FALSE to enable CLKIN divide by two feature
			CLKIN_PERIOD => C_INPUT_CLK_PERIOD_NS, --  Specify period of input clock
			CLKOUT_PHASE_SHIFT => "NONE", --  Specify phase shift of "NONE", "FIXED" or "VARIABLE" 
			CLK_FEEDBACK => "NONE",         --  Specify clock feedback of "NONE", "1X" or "2X" 
			DESKEW_ADJUST => "SYSTEM_SYNCHRONOUS", -- "SOURCE_SYNCHRONOUS", "SYSTEM_SYNCHRONOUS" or
																--     an integer from 0 to 15
			DLL_FREQUENCY_MODE => "LOW",     -- "HIGH" or "LOW" frequency mode for DLL
			DUTY_CYCLE_CORRECTION => TRUE, --  Duty cycle correction, TRUE or FALSE
			PHASE_SHIFT => 0,        --  Amount of fixed phase shift from -255 to 255
			STARTUP_WAIT => FALSE) --  Delay configuration DONE until DCM_SP LOCK, TRUE/FALSE
		port map (
			CLK0 => open,     	-- 0 degree DCM CLK ouptput
			CLK180 => open, 		-- 180 degree DCM CLK output
			CLK270 => open, 		-- 270 degree DCM CLK output
			CLK2X => open,   		-- 2X DCM CLK output
			CLK2X180 => open, 	-- 2X, 180 degree DCM CLK out
			CLK90 => open,   		-- 90 degree DCM CLK output
			CLKDV => open,   		-- Divided DCM CLK out (CLKDV_DIVIDE)
			CLKFX => clk_o,   	-- DCM CLK synthesis out (M/D)
			CLKFX180 => open, 	-- 180 degree CLK synthesis out
			LOCKED => locked_o,	-- DCM LOCK status output
			PSDONE => open, 		-- Dynamic phase adjust done output
			STATUS => open, 		-- 8-bit DCM status bits output
			CLKFB => '0',   		-- DCM clock feedback
			CLKIN => clk_i,   	-- Clock input (from IBUFG, BUFG or DCM)
			PSCLK => '0',   		-- Dynamic phase adjust clock input
			PSEN => '0',     		-- Dynamic phase adjust enable input
			PSINCDEC => '0', 		-- Dynamic phase adjust increment/decrement
			RST => reset_i   		-- DCM asynchronous reset input
		);	
	----------------------------------------------------------------------------
	
end structural;