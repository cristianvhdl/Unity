----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    13:01:20 22/11/2012
-- Design Name: 
-- Module Name:    registers_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib Registers library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		22/11-2012	ANLAN 	File Created
-- 2.00.a	22/11-2012	ANLAN		First release
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

package registers_pkg is

	-------------------------------------------------------------------------------
	-- fifo_reg.vhd
	--
	--		Data register emulating a synchronous FIFO interface
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component fifo_reg is
		generic (
			C_DATA_WIDTH	: positive := 8
		);
		port ( 
			clk_i		: in  std_logic;
			reset_i	: in  std_logic;
			wr_i 		: in  std_logic;
			data_i 	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
			full_o 	: out std_logic;
			rd_i 		: in  std_logic;
			data_o 	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
			empty_o 	: out std_logic
			);
	end component;
	
	-------------------------------------------------------------------------------
	-- Ds_reg.vhd
	--
	--		Data synchrone Register
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------	
	component Ds_reg is
		generic ( REG_WIDTH : integer range 1 to 32 := 32 );
		port ( clk_i  : in  std_logic;
				 reset_i : in  std_logic;
				 we_i  : in  std_logic;
				 d_i   : in  std_logic_vector (REG_WIDTH-1 downto 0);
				 d_o   : out std_logic_vector (REG_WIDTH-1 downto 0));
	end component;	
	
	-------------------------------------------------------------------------------
	-- DOBs_reg.vhd
	--
	--		Data -> regular Output + Bus synchrone Register
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------	
	component DOBs_reg is
		generic ( REG_WIDTH    : integer range 1 to 32 := 32;
					 BUS_TRISTATE : integer range 0 to 1  := 1);  -- 1/0: enable/disable Tri-state output
		port ( clk_i : in  std_logic;
				 reset_i : in  std_logic;
				 we_i  : in  std_logic;
				 d_i   : in  std_logic_vector (REG_WIDTH-1 downto 0);
				 boe_i : in  std_logic;
				 db_o  : out std_logic_vector (REG_WIDTH-1 downto 0);
				 d_o  : out std_logic_vector (REG_WIDTH-1 downto 0));
	end component;	

	-------------------------------------------------------------------------------
	-- DBs_reg.vhd
	--
	--		Data -> Bus synchrone Register
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component DBs_reg is
		generic ( REG_WIDTH    : integer range 1 to 32 := 32;
					 BUS_TRISTATE : integer range 0 to 1  := 1); -- 1/0: enable/disable Tri-state output
		port ( clk_i : in  std_logic;
				 reset_i : in  std_logic;
				 we_i  : in  std_logic;
				 d_i   : in  std_logic_vector (REG_WIDTH-1 downto 0);
				 boe_i : in  std_logic;
				 db_o  : out std_logic_vector (REG_WIDTH-1 downto 0));
	end component;

end registers_pkg;

package body registers_pkg is
end registers_pkg;
