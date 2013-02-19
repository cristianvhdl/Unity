----------------------------------------------------------------------------------
-- Company: University Of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    19:21:28 17/01/2012 
-- Design Name: 
-- Module Name:    clock_gen_spartan_6_clkgen - structural 
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

entity clock_gen_spartan_6_clkgen is
	generic (
		C_INPUT_CLK_PERIOD_NS 	: real 							:= 5.0;	-- Input clock period [ns]
		C_CLK_MULTIPLY				: positive range 1 to 256	:=	2;		-- Clock multiplier	 : clkgen: [1:256]
		C_CLK_DIVIDE				: positive range 2 to 256	:=	8		-- Clock divisor		 : clkgen: [2:256]
	);
	port ( 
		clk_i		: in  std_logic;
		reset_i  : in  std_logic;
      clk_o 	: out std_logic;
		locked_o : out std_logic
		);
end clock_gen_spartan_6_clkgen;

architecture structural of clock_gen_spartan_6_clkgen is

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

end structural;
