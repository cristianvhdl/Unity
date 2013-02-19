----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:19:20 22/11/2012
-- Design Name: 
-- Module Name:    rr_prio_enc_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib Round-Robin Priority Encoder library
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

library utility_v01_00_a;
use utility_v01_00_a.log_pkg.all;

package rr_prio_enc_pkg is

	-------------------------------------------------------------------------------
	-- rr_prio_enc.vhd
	--
	--		Round Robin Priority Encoder for non-mutual-exclusive one-hot encoded inputs.
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component rr_prio_enc is
		generic (
			C_REQ_SIZE : positive := 4													-- Number of request inputs
		);
		port ( 
			req_i : in  std_logic_vector(C_REQ_SIZE-1 downto 0);				-- One-Hot encoded request inputs
			cur_i : in  std_logic_vector (log2r(C_REQ_SIZE)-1 downto 0);	-- Current selected input (binary)
			vld_o : out std_logic;														-- Output (ptr_o) valid
			ptr_o : out std_logic_vector (log2r(C_REQ_SIZE)-1 downto 0)		-- Next input to be granted access/permission (binary)
		);
	end component;

end rr_prio_enc_pkg;

package body rr_prio_enc_pkg is
end rr_prio_enc_pkg;
