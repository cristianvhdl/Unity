----------------------------------------------------------------------------------
-- Company: University Of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    19:21:28 17/01/2012 
-- Design Name: 
-- Module Name:    clock_gen_spartan_6_dcm - structural 
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
-- 0.04
--
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

Library UNISIM;
use UNISIM.vcomponents.all;

entity clock_gen_spartan_6_dcm is
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
end clock_gen_spartan_6_dcm;

architecture structural of clock_gen_spartan_6_dcm is

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

end structural;