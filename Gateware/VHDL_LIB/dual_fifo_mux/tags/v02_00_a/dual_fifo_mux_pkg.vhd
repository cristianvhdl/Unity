----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    09:45:17 22/10-2012
-- Design Name: 
-- Module Name:    dual_fifo_mux_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib dual_fifo_mux library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 1.00.a	22/10-2012	ANLAN 	File Created
-- 1.00.b		
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

library ieee;
use ieee.std_logic_1164.all;

package dual_fifo_mux_pkg is

	----------------------------------------------------------------------------------
	--	dual_fifo_mux.vhd
	--
	-- 	This component implements a Dual-FIFO Mux suiteable for use e.g. 
	--		protocol stacks etc.
	--
	--		The FIFOs can be implements either as synchronous or as asynchronous FIFOs.
	--
	--		Various other parameters can be adjusted on the FIFOs, such as:
	--			- synchonizer depth
	--			- pre-load depth
	--			- enable/disable write acknowledge output
	--			- asynchronous/synchrnous data read output
	--			- RAM implementation style, etc.
	--
	----------------------------------------------------------------------------------
	component dual_fifo_mux is
		generic(	
			C_ADDR_WIDTH		: positive					:= 8;			-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
			C_DATA_WIDTH		: positive					:= 9;			-- Data width
			C_CLOCK_MODE		: natural range 0 to 1 	:= 0;    	-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			C_SYNC_DEPTH		: natural range 1 to 8 	:= 2;			-- Synchronizer depth (asynch mode only)		
			C_PRE_LOAD			: natural					:= 0;			-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			C_EN_WRT_ACK		: natural range 0 to 1 	:= 0; 		-- Write acknowledge; 0 -> disabled, 1 -> enabled
			C_READ_MODE			: natural range 0 to 1 	:= 1;			-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			C_PRE_SP6_MODE		: natural range 0 to 1 	:= 0;			-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			C_RAMSTYLE			: string 					:= "AUTO"	-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)		
			);
		port ( 
			-- Common clock input
			clk_i 				: in  std_logic;											-- use this if C_CLOCK_MODE=0, else connect to '0'
			
			-- Common inputs
			reset_i 				: in  std_logic;		
			sel_in_fifo_i		: in  std_logic;
			sel_out_fifo_i 	: in  std_logic;
			
			-- fifo input domain
			clkw_asynch_i		: in std_logic;											-- use this if C_CLOCK_MODE=1, else connect to '0'
			fifo_wr_i 			: in  std_logic;
			fifo_data_in_i		: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
			fifo_reset_i 		: in  std_logic;
			fifo_wr_ack_o 		: out std_logic;
			fifo_full_o 		: out std_logic;
			
			-- fifo output domain
			clkr_asynch_i		: in std_logic;											-- use this if C_CLOCK_MODE=1, else connect to '0'
			fifo_rd_i 			: in  std_logic;
			fifo_data_out_o 	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
			fifo_empty_o 		: out std_logic
			);
	end component;

end dual_fifo_mux_pkg;

package body dual_fifo_mux_pkg is 
end dual_fifo_mux_pkg;