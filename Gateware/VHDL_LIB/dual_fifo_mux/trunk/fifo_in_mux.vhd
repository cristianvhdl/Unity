----------------------------------------------------------------------------------
-- Company: Anders Blaabjerg Lange
-- Engineer: University Of Southern Denmark
-- 
-- Create Date:    09:13:12 28/12/2011 
-- Design Name: 
-- Module Name:    fifo_mux - Behavioral  
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01 			28/12-2011 	ANLAN		File Created
-- 
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
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
--use ieee.numeric_std.all;

entity fifo_in_mux is
   generic (	
		C_DATA_WIDTH: positive:=8										   -- Fifo data width
		);
	port ( 
		-- common fifo input domain signals
		fifo_sel_i 			: in  std_logic;
		
		fifo_wr_i 			: in  std_logic;
		fifo_data_in_i 	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		fifo_reset_i		: in  std_logic;
		fifo_wr_ack_o 		: out std_logic;
		fifo_full_o 		: out std_logic;		
		
		-- fifo 1 input domain signals
		fifo_1_wr_o 		: out std_logic;
		fifo_1_data_in_o 	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
		fifo_1_reset_o		: out std_logic;
		fifo_1_wr_ack_i 	: in  std_logic;
		fifo_1_full_i 		: in  std_logic;

		-- fifo 2 input domain signals
		fifo_2_wr_o 		: out std_logic;
		fifo_2_data_in_o 	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
		fifo_2_reset_o		: out std_logic;
		fifo_2_wr_ack_i 	: in  std_logic;
		fifo_2_full_i 		: in  std_logic	
		);
end fifo_in_mux;

architecture behavioral of fifo_in_mux is

begin

	fifo_1_wr_o <= fifo_wr_i when fifo_sel_i='0' else '0';
	fifo_2_wr_o <= fifo_wr_i when fifo_sel_i='1' else '0';
	
	fifo_1_data_in_o <= fifo_data_in_i when fifo_sel_i='0' else (others=>'0');
	fifo_2_data_in_o <= fifo_data_in_i when fifo_sel_i='1' else (others=>'0');
	
	fifo_1_reset_o <= fifo_reset_i when fifo_sel_i='0' else '0';
	fifo_2_reset_o <= fifo_reset_i when fifo_sel_i='1' else '0';
	
	
	fifo_wr_ack_o <= fifo_1_wr_ack_i when fifo_sel_i='0' else
						  fifo_2_wr_ack_i;
	
	fifo_full_o <= fifo_1_full_i when fifo_sel_i='0' else
						fifo_2_full_i;

end behavioral;

