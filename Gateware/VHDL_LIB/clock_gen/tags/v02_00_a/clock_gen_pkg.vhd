----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    14:36:20 22/11/2012
-- Design Name: 
-- Module Name:    clock_gen_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib clock-gen library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		22/11-2012	ANLAN 	File Created
-- 2.10.a	22/11-2012	ANLAN		First release
--	2.10.b	
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
-----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.all;

package clock_gen_pkg is

	----------------------------------------------------------------------------------
	-- clock_gen_spartan_3e_dcm.vhd
	--
	--		Clock generator for Xilinx Spartan 3E utilizing a single DCM
	--
	----------------------------------------------------------------------------------
	component clock_gen_spartan_3e_dcm is
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
	end component;
	
	----------------------------------------------------------------------------------
	-- clock_gen_spartan_3a_dcm.vhd
	--
	--		Clock generator for Xilinx Spartan 3A utilizing a single DCM
	--
	----------------------------------------------------------------------------------	
	component clock_gen_spartan_3a_dcm is
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
	end component;	

	----------------------------------------------------------------------------------
	-- clock_gen_spartan_6_dcm.vhd
	--
	--		Clock generator for Xilinx Spartan 6 utilizing a single DCM
	--
	----------------------------------------------------------------------------------
	component clock_gen_spartan_6_dcm is
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
	end component;

	----------------------------------------------------------------------------------
	-- clock_gen_spartan_6_clkgen.vhd
	--
	--		Clock generator for Xilinx Spartan 6 utilizing a Clock-Gen primitive
	--
	----------------------------------------------------------------------------------
	component clock_gen_spartan_6_clkgen is
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
	end component;	

end clock_gen_pkg;

package body clock_gen_pkg is
end clock_gen_pkg;
