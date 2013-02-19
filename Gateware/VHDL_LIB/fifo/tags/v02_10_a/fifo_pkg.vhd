----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    14:55:20 16/10/2012
-- Design Name: 
-- Module Name:    ram_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib ram library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		16/10-2012	ANLAN 	File Created
-- 2.10.a	16/10-2012	ANLAN		First release
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

package fifo_pkg is

	----------------------------------------------------------------------------------
	--		Parameterized Asynchronous/Synchronous FIFO
	--
	--		Default generic config:
	--			ADDR_WIDTH 		= 4 		- Register depth: 16 (4 address bits)
	--			DATA_WIDTH 		= 4 		- Data width: 4 bit
	--			CLOCK_MODE 		= 1 		- Asynchronous Fifo mode (enabled)
	--			SYNC_DEPTH 		= 2 		- Synchronizer depth: 2 levels
	--			PRE_LOAD   		= 2 		- Pre load number: 2 words
	--			EN_WRT_ACK 		= 0 		- Write acknowledge (enabled)
	--			READ_MODE		= 1		- Synchronous data output enabled
	--			PRE_SP6_MODE	= 0		- Pre Spartan 6 compatibility mode disabled
	--			RAMSTYLE			= "AUTO"	- RAM implementation style is AUTO
	--
	----------------------------------------------------------------------------------
	component fifo is
		generic(	ADDR_WIDTH	: 	positive					:=  4;				-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
					DATA_WIDTH	: 	positive					:=  4;				-- Data width
					CLOCK_MODE	: 	natural range 0 to 1 :=  1;    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
					SYNC_DEPTH	: 	natural range 1 to 8 :=  2;				-- Synchronizer depth (asynch mode only)
					PRE_LOAD		: 	natural					:=  2;				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
					EN_WRT_ACK	: 	natural range 0 to 1 :=  0;    			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
					READ_MODE	:	natural range 0 to 1 :=  1;				-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
					PRE_SP6_MODE:  natural range 0 to 1 :=  0;				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
					RAMSTYLE		:	string 					:= "AUTO"			-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)
		);
		port(
			-- Common clock input
			clk_i				: in std_logic;											-- use this if CLOCK_MODE=0, else connect to '0'
			
			-- Input clock domain
			clkw_asynch_i	: in std_logic;											-- use this if CLOCK_MODE=1, else connect to '0'
			wr_i				: in std_logic;
			data_in_i 		: in std_logic_vector(DATA_WIDTH-1 downto 0);
			wr_ack_o 		: out std_logic;
			full_o			: out std_logic;
			
			-- Output clock domain
			clkr_asynch_i	: in std_logic;											-- use this if CLOCK_MODE=1, else connect to '0'
			rd_i				: in std_logic;
			data_out_o 		: out std_logic_vector(DATA_WIDTH-1 downto 0);
			empty_o			: out std_logic;
			
			-- Common inputs
			reset_i 			: in std_logic
		);
	end component;

end fifo_pkg;

package body fifo_pkg is
end fifo_pkg;
