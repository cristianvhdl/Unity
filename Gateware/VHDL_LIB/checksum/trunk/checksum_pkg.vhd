----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    12:07:20 22/11/2012
-- Design Name: 
-- Module Name:    checksum_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib checksum library
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

package checksum_pkg is

	-------------------------------------------------------------------------------
	-- checksum_crc.vhd
	--
	--		Customizable CRC checksum generator
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component checksum_crc is
		generic (
			C_DATA_WIDTH 		: integer := 8;
			C_CHKS_WIDTH 		: integer := 8;			
			C_CRC_POLYNOMIAL	: integer := 7	-- ex: C_CHKS_WIDTH = 8, C_CRC_POLYNOMIAL = 7 => 0b00000111 => x^8+x^2+x^1+1
		);
		port ( 
			clk_i 		: in  std_logic;
			reset_i		: in  std_logic;
			data_vld_i 	: in  std_logic;		
			data_i 		: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
			chks_o 		: out std_logic_vector (C_CHKS_WIDTH-1 downto 0);
			chks_vld_o 	: out std_logic
			);
	end component;
	
	-------------------------------------------------------------------------------
	-- checksum_xor.vhd
	--
	--		Customizable XOR checksum generator
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component checksum_xor is
		generic (
			C_DATA_WIDTH 		: integer := 8;
			C_CHKS_WIDTH 		: integer := 8
		);
		port ( 
			clk_i 		: in  std_logic;
			reset_i		: in  std_logic;
			data_vld_i 	: in  std_logic;		
			data_i 		: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
			chks_o 		: out std_logic_vector (C_CHKS_WIDTH-1 downto 0);
			chks_vld_o 	: out std_logic
			);
	end component;

end checksum_pkg;

package body checksum_pkg is
end checksum_pkg;
