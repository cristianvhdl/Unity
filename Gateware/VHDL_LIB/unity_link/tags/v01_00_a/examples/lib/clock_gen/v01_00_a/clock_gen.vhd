----------------------------------------------------------------------------------
-- Company: University Of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    19:21:28 17/01/2012 
-- Design Name: 
-- Module Name:    clk_gen - structural 
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
--	0.03	
--
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

Library UNISIM;
use UNISIM.vcomponents.all;

entity clock_gen is
	generic (
		C_INPUT_CLK_PERIOD_NS 	: real 		:= 5.0;	-- Input clock period [ns]
		C_CLK_MULTIPLY				: positive 	:=	2;		-- Clock multiplier	 : clkgen: [1:256], dcm: [1:32]	
		C_CLK_DIVIDE				: positive 	:=	8		-- Clock divisor		 : clkgen: [2:256], dcm: [1:32]	
	);
	port ( 
		clk_i		: in  std_logic;
		reset_i  : in  std_logic;
      clk_o 	: out std_logic;
		locked_o : out std_logic
		);
end clock_gen;

architecture spartan_3e_dcm of clock_gen is

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
	
end spartan_3e_dcm;

architecture spartan_3a_dcm of clock_gen is

begin

	ASSERT (C_CLK_MULTIPLY>=1 and C_CLK_MULTIPLY<=32) REPORT "The value of C_CLK_MULTIPLY must be between 1 and 32" SEVERITY failure;
	ASSERT (C_CLK_DIVIDE>=1 and C_CLK_DIVIDE<=32) REPORT "The value of C_CLK_DIVIDE must be between 1 and 32" SEVERITY failure;

	----------------------------------------------------------------------------
	-- DCM (Spartan 3A primitive)
	----------------------------------------------------------------------------
		SP3A_DCM_inst : DCM_SP
		generic map (
			CLKDV_DIVIDE => 2.0, 						--  Divide by: 1.5,2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5,6.0,6.5
																--     7.0,7.5,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0 or 16.0
			CLKFX_DIVIDE => C_CLK_DIVIDE,   			--  Can be any interger from 1 to 32
			CLKFX_MULTIPLY => C_CLK_MULTIPLY, 		--  Can be any integer from 1 to 32
			CLKIN_DIVIDE_BY_2 => FALSE, 				--  TRUE/FALSE to enable CLKIN divide by two feature
			CLKIN_PERIOD => C_INPUT_CLK_PERIOD_NS, --  Specify period of input clock
			CLKOUT_PHASE_SHIFT => "NONE", 			--  Specify phase shift of "NONE", "FIXED" or "VARIABLE" 
			CLK_FEEDBACK => "NONE",         			--  Specify clock feedback of "NONE", "1X" or "2X" 
			DESKEW_ADJUST => "SYSTEM_SYNCHRONOUS", -- "SOURCE_SYNCHRONOUS", "SYSTEM_SYNCHRONOUS" or
																--     an integer from 0 to 15
			DLL_FREQUENCY_MODE => "LOW",     		-- "HIGH" or "LOW" frequency mode for DLL
			DUTY_CYCLE_CORRECTION => TRUE, 			--  Duty cycle correction, TRUE or FALSE
			PHASE_SHIFT => 0,        					--  Amount of fixed phase shift from -255 to 255
			STARTUP_WAIT => FALSE) 						--  Delay configuration DONE until DCM_SP LOCK, TRUE/FALSE
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
	
end spartan_3a_dcm;

architecture spartan_6_dcm of clock_gen is

begin
		
	ASSERT (C_CLK_MULTIPLY>=1 and C_CLK_MULTIPLY<=32) REPORT "The value of C_CLK_MULTIPLY must be between 1 and 32" SEVERITY failure;
	ASSERT (C_CLK_DIVIDE>=1 and C_CLK_DIVIDE<=32) REPORT "The value of C_CLK_DIVIDE must be between 1 and 32" SEVERITY failure;
	
	----------------------------------------------------------------------------
	-- DCM (Spartan 6 primitive)
	----------------------------------------------------------------------------
		SP6_DCM : DCM_SP
		generic map (
			CLKDV_DIVIDE => 2.0,                   -- CLKDV divide value
																-- (1.5,2,2.5,3,3.5,4,4.5,5,5.5,6,6.5,7,7.5,8,9,10,11,12,13,14,15,16).
			CLKFX_DIVIDE => C_CLK_DIVIDE,          -- Divide value on CLKFX outputs - D - (1-32)
			CLKFX_MULTIPLY => C_CLK_MULTIPLY,      -- Multiply value on CLKFX outputs - M - (2-32)
			CLKIN_DIVIDE_BY_2 => FALSE,            -- CLKIN divide by two (TRUE/FALSE)
			CLKIN_PERIOD => C_INPUT_CLK_PERIOD_NS,	-- Input clock period specified in nS
			CLKOUT_PHASE_SHIFT => "NONE",          -- Output phase shift (NONE, FIXED, VARIABLE)
			CLK_FEEDBACK => "NONE",                -- Feedback source (NONE, 1X, 2X)
			DESKEW_ADJUST => "SYSTEM_SYNCHRONOUS", -- SYSTEM_SYNCHRNOUS or SOURCE_SYNCHRONOUS
			DFS_FREQUENCY_MODE => "LOW",           -- Unsupported - Do not change value
			DLL_FREQUENCY_MODE => "LOW",           -- Unsupported - Do not change value
			DSS_MODE => "NONE",                    -- Unsupported - Do not change value
			DUTY_CYCLE_CORRECTION => TRUE,         -- Unsupported - Do not change value
			FACTORY_JF => X"c080",                 -- Unsupported - Do not change value
			PHASE_SHIFT => 0,                      -- Amount of fixed phase shift (-255 to 255)
			STARTUP_WAIT => FALSE                  -- Delay config DONE until DCM_SP LOCKED (TRUE/FALSE)
		)
		port map (
			CLK0 => open,       -- 1-bit output: 0 degree clock output
			CLK180 => open,     -- 1-bit output: 180 degree clock output
			CLK270 => open,     -- 1-bit output: 270 degree clock output
			CLK2X => open,      -- 1-bit output: 2X clock frequency clock output
			CLK2X180 => open,   -- 1-bit output: 2X clock frequency, 180 degree clock output
			CLK90 => open,      -- 1-bit output: 90 degree clock output
			CLKDV => open,      -- 1-bit output: Divided clock output
			CLKFX => clk_o,     -- 1-bit output: Digital Frequency Synthesizer output (DFS)
			CLKFX180 => open,   -- 1-bit output: 180 degree CLKFX output
			LOCKED => locked_o, -- 1-bit output: DCM_SP Lock Output
			PSDONE => open,     -- 1-bit output: Phase shift done output
			STATUS => open,     -- 8-bit output: DCM_SP status output
			CLKFB => '0',       -- 1-bit input: Clock feedback input
			CLKIN => clk_i,     -- 1-bit input: Clock input
			DSSEN => '0',       -- 1-bit input: Unsupported, specify to GND.
			PSCLK => '0',       -- 1-bit input: Phase shift clock input
			PSEN => '0',        -- 1-bit input: Phase shift enable
			PSINCDEC => '0', 	  -- 1-bit input: Phase shift increment/decrement input
			RST => reset_i      -- 1-bit input: Active high reset input
		);				
	----------------------------------------------------------------------------

end spartan_6_dcm;

architecture spartan_6_clkgen of clock_gen is

begin

	ASSERT (C_CLK_MULTIPLY>=2 and C_CLK_MULTIPLY<=256) REPORT "The value of C_CLK_MULTIPLY must be between 2 and 256" SEVERITY failure;
	ASSERT (C_CLK_DIVIDE>=1 and C_CLK_DIVIDE<=256) REPORT "The value of C_CLK_DIVIDE must be between 1 and 256" SEVERITY failure;
	
	----------------------------------------------------------------------------
	-- DCMCLK_GEN (Spartan 6 primitive)
	----------------------------------------------------------------------------
		USER_DCM_CLKGEN : DCM_CLKGEN
		generic map (
			CLKFXDV_DIVIDE => 2,       				-- CLKFXDV divide value (2, 4, 8, 16, 32)
			CLKFX_DIVIDE => C_CLK_DIVIDE,				-- Divide value - D - (1-256)
			CLKFX_MD_MAX => 0.0,       				-- Specify maximum M/D ratio for timing anlysis
			CLKFX_MULTIPLY => C_CLK_MULTIPLY,		-- Multiply value - M - (2-256)
			CLKIN_PERIOD => C_INPUT_CLK_PERIOD_NS,	-- Input clock period specified in nS
			SPREAD_SPECTRUM => "NONE", 				-- Spread Spectrum mode "NONE", "CENTER_LOW_SPREAD", "CENTER_HIGH_SPREAD",
																-- "VIDEO_LINK_M0", "VIDEO_LINK_M1" or "VIDEO_LINK_M2" 
			STARTUP_WAIT => FALSE      				-- Delay config DONE until DCM_CLKGEN LOCKED (TRUE/FALSE)
		)
		port map (
			CLKFX => clk_o,      	-- 1-bit output: Generated clock output
			CLKFX180 => open,   		-- 1-bit output: Generated clock output 180 degree out of phase from CLKFX.
			CLKFXDV => open,     	-- 1-bit output: Divided clock output
			LOCKED => locked_o,    	-- 1-bit output: Locked output
			PROGDONE => open,   		-- 1-bit output: Active high output to indicate the successful re-programming
			STATUS => open,       	-- 2-bit output: DCM_CLKGEN status
			CLKIN => clk_i,    		-- 1-bit input: Input clock
			FREEZEDCM => '1', 		-- 1-bit input: Prevents frequency adjustments to input clock
			PROGCLK => '0',     		-- 1-bit input: Clock input for M/D reconfiguration
			PROGDATA => '0',   		-- 1-bit input: Serial data input for M/D reconfiguration
			PROGEN => '0',       	-- 1-bit input: Active high program enable
			RST => reset_i          -- 1-bit input: Reset input pin
		);		
	----------------------------------------------------------------------------

end spartan_6_clkgen;
