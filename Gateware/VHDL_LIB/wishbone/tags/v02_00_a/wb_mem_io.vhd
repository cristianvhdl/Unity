----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    09:12:47 30/03-2012 
-- Design Name: 
-- Module Name:    wb_mem_io - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave IO component offering a wishbone interface to a single dual-ported
--		memory, and template code for direct IO interfacing with the memory.
--
--		The memory can be configured as either (seen from the wishbone interface): 
--
--			- READ ONLY MEMORY (aka mem-input-only mode, IO point-of-view)
-- 				
--				C_IO_ADDR_BIT = -2
-- 				
--				In memory input mode the wb interface
--				cannot write to any address.
-- 			The user (logic) memory interface can 
--				write to all addresses.
--
--			- WRITE ONLY MEMORY (aka mem-output-only mode, IO point-of-view)
-- 				
--				C_IO_ADDR_BIT = -1
-- 				
--				In memory output mode the wb interface
--				can write to all addresses.
-- 			The user (logic) memory interface cannot 
--				write to any address.
--
--			- READ AND WRITE MEMORY (aka mixed-io mode)
--
--				C_IO_ADDR_BIT = [0:C_MEM_ADDR_WIDTH-1]
--
-- 			The wb interface can read+write input addresses (C_IO_ADDR_BIT=1) 
--				and read output addresses (C_IO_ADDR_BIT=0).
--
--	 			The user (logic) memory interface can read+write output addresses
--				(C_IO_ADDR_BIT=0) and read input addresses (C_IO_ADDR_BIT=1).
--
--				Setting C_IO_ADDR_BIT=2 makes the memory act like a uTosNet memory interface.
--				(or TosNet interface without the double buffered memory scheme)
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE dual-port memory component      |
--	 |								|	with 1-bit granularity on data-width  |
--	 |								|	and address-width 						  |
--  -----------------------------------------------------------------
--	 |	Wishbone version 		| 	Protocol version B4 						  |
--  -----------------------------------------------------------------
--	 |	Supported cycles		| 	SLAVE, READ/WRITE							  |
--	 |								| 	SLAVE, BLOCK READ/WRITE					  |
--  -----------------------------------------------------------------
--  |	Data port:				|													  | 
--	 |		size					|	1-32 bit (QWORD)							  |
--	 |		granularity  		|	1-bit     									  |
--	 |		max. operand size	|	32-bit (QWORD)								  |
--  |	Data transfer: 		|													  |
--	 |		ordering  			|	LITTLE ENDIAN								  |
--  |		sequence    		|	UNDEFINED									  |
--	 -----------------------------------------------------------------
--	 | 							SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | COMPONENT SIGNAL 	| WB SIGNAL 	| DESCRIPTION		  			  |
--	 -----------------------------------------------------------------
--	 | clk_i					| CLK_I			| slave clock input			  |
--	 | rst_i					| RST_I			| slave reset input			  |
--	 |							|					|									  |
--	 | wb_i 				  	|  				| (record type: wb_ad32sb_if)|
--	 |  .cyc					| CYC_I			| slave cycle input			  |
--	 |  .stb					| STB_I			| slave strobe input			  |
--	 |  .adr					| ADR_I			| slave addr input			  |
--	 |  .dat					| DAT_I			| slave data input			  |
--	 |  .we					| WE_I			| slave write enable input   |
--	 |  .sgl					| TGC_I()		| slave cycle-tag input		  |
--	 |  .blk					| TGC_I()		| slave cycle-tag input		  |
--	 |							|					|									  |
--	 | wb_o 				  	|  				| (record type: wb_d32ae_if) |
--	 |  .dat					| DAT_O			| slave data output			  |
--	 |  .ack					| ACK_O			| slave acknowledge output	  |
--	 |  .err					| ERR_O			| slave error output			  |
--	 -----------------------------------------------------------------
--	 | 						TAG SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | SIGNAL NAME	| TAG TYPE	| DESCRIPTION								  |
--	 -----------------------------------------------------------------
--	 | wb_i.sgl		| TGC_I		| marks a cycle as a single access	  |
--	 | wb_i.blk		| TGC_I		| marks a cycle as a block access	  |
--	 -----------------------------------------------------------------
--	 | 							ERROR GENERATION 								  |
--	 | ERR_O is asserted under the following conditions				  |
--	 -----------------------------------------------------------------
--	 |	WB BUS CYCLE |	ERROR TRIGGER	| DESCRIPTION					 	  |
--	 -----------------------------------------------------------------
--	 |  read-cycle  | never			   | a read is allways successful  |
--	 |  write-cycle | write error		| address is not writeable 	  |
--	 -----------------------------------------------------------------
--
-- Dependencies:
--
--		work.wb_classic_pkg.all
--
--		Unity-HDL libraries:
--			- ram_v03_00_a
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		30/03-2012	ANLAN		File Created
--	0.02 		12/10-2012 	ANLAN		Module updated with library definitions (hints) 
--											for the user to be able to copy this module into 
--											his work library for integration into his project.
-- 0.03		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		18/10-2012	ANLAN		Headers, comments and licensing info updated.
-- 1.01		
--
-- Additional Comments:
--
--		It is recommended to copy this module (wb_mem_io.vhd) 
--		to the local work library for editing.
--		(PLEASE DO NOT EDIT YOUR LIBRARY FILE!)
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

library ram_v03_00_a;

use ram_v03_00_a.ram_pkg.all;
use work.wb_classic_pkg.all;

entity wb_mem_io is
	generic (
		-- MEM configuration
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
		C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
		C_RAMSTYLE      		: string  := "AUTO"; 				-- DISTRIBUTED, BLOCK, AUTO
		C_IO_ADDR_BIT 			: integer range -2 to 31 := 2;	-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], MEM-INPUT-ONLY mode: -2, MEM-OUTPUT-ONLY mode: -1
		
		--------------------------------------------
		-- Insert User Generics below this line
		
		LED_WIDTH				: integer := 7
		
		-- Insert User Generics above this line			
		--------------------------------------------			
	);
	port (
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb slave interface
		wb_i 	: in  wb_ad32sb_if;
		wb_o 	: out wb_d32ae_if;
		
		--------------------------------------------
		-- Insert User Ports below this line
		
		led_o : out std_logic_vector(LED_WIDTH-1 downto 0)
		
		-- Insert User Ports above this line
		--------------------------------------------			
	);
end wb_mem_io;

architecture structural of wb_mem_io is
	
	signal we_i		: std_logic;
	signal addr_i	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);
	signal data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);	
	signal w_ack_o	: std_logic;
	signal w_err_o	: std_logic;	

	--------------------------------------------
	-- Insert User Logic below this line
	
	
	signal led		: std_logic_vector(LED_WIDTH-1 downto 0);
	
	
	-- Insert User Logic above this line
	--------------------------------------------

begin

	-- Wishbone memory
	wb_mem_inst : wb_mem
		generic map(
			-- MEM configuration
			C_MEM_ADDR_WIDTH 		=> C_MEM_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH,
			C_RAMSTYLE      		=> C_RAMSTYLE,
			C_IO_ADDR_BIT 			=> C_IO_ADDR_BIT
		)
		port map(
				-- wb syscon interface	
				clk_i 		=> clk_i,
				rst_i 		=> rst_i,
				
				-- wb slave interface
				wb_i 			=> wb_i,
				wb_o 			=> wb_o,
				
				-- memory interface
				mem_we_i		=> we_i,
				mem_addr_i	=> addr_i,
				mem_data_i	=> data_i,
				mem_data_o	=> data_o,
				mem_w_ack_o => w_ack_o,
				mem_w_err_o => w_err_o
		);

	--------------------------------------------
	-- RAM interface:
	--
	--		we_i		: RAM write enable input
	-- 	addr_i	: RAM address input
	--		data_i	: RAM data input
	-- 	data_o	: RAM data output
	--		w_ack_o	: combinatorial write acknowledge signal 
	--		w_err_o	: combinatorial write error signal (write not allowed to the selected address)
	--
	--	-------------------------------------
	-- INPUT-ONLY Mode:
	--		user ram interface can write to and read from any address
	--
	-- OUTPUT-ONLY Mode:
	--		user ram interface can read from any address, but not write
	--
	-- MIXED-IO Mode:
	--		user ram interface can read+write output addresses (C_IO_ADDR_BIT=0)
	--		and read input addresses (C_IO_ADDR_BIT=1)
	--	-------------------------------------
	--
	-- Insert User Logic below this line
	
		-- compatible with TosNet mode
		
			-- logic
			we_i <= '0';			-- Read
			addr_i <= "000100";	-- Input address 0x04
			led <= data_o(led'range);
		
			-- output mapping
			led_o <= led;
	
	-- Insert User Logic above this line
	--------------------------------------------

end structural;