----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    09:58:47 25/04-2012 
-- Design Name: 
-- Module Name:    wb_mem - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave component offering a wishbone 
--		interface to a single dual ported memory.
--
--		The memory can be configured as either (seen from the wishbone interface): 
--
--			- READ ONLY MEMORY (aka mem-input-only mode, user-logic/IO point-of-view)
-- 				
--				C_IO_ADDR_BIT = -2
-- 				
--				In memory input mode the wb interface
--				cannot write to any address.
-- 			The user (logic) memory interface can 
--				write to all addresses.
--
--			- WRITE ONLY MEMORY (aka mem-output-only mode, user-logic/IO point-of-view)
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
-- 0.01		25/04-2012	ANLAN		File Created
-- 0.02		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		18/10-2012	ANLAN		Headers, comments and licensing info updated.
-- 1.01		22/10-2012	ANLAN		Updated to use ram_v03_00_b.
-- 1.02		
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

library ram_v03_00_b;
use ram_v03_00_b.ram_pkg.all;

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb_mem is
	generic (
		-- MEM configuration
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
		C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
		C_RAMSTYLE      		: string  := "AUTO"; 				-- DISTRIBUTED, BLOCK, AUTO
		C_IO_ADDR_BIT 			: integer range -2 to 31 := 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], MEM-INPUT-ONLY mode: -2, MEM-OUTPUT-ONLY mode: -1
	);
	port (
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 			: in  wb_ad32sb_if;
			wb_o 			: out wb_d32ae_if;
			
			-- memory interface
			mem_we_i		: in  std_logic;
			mem_addr_i	: in  std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
			mem_data_i	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0);
			mem_data_o	: out std_logic_vector(C_DATA_WIDTH-1 downto 0);
			mem_w_ack_o : out std_logic;
			mem_w_err_o : out std_logic
	);
end wb_mem;

architecture structural of wb_mem is

	signal ctrl_we_o		: std_logic;
	signal ctrl_addr_o	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal ctrl_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_w_ack_i	: std_logic;
	signal ctrl_w_err_i	: std_logic;
	
	signal wb_mem_we_i	: std_logic;
	signal wb_mem_addr_i	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal wb_mem_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_mem_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);	

	signal usr_mem_we_i		: std_logic;
	signal usr_mem_addr_i	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal usr_mem_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal usr_mem_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);		
	signal usr_mem_w_ack_o	: std_logic;
	signal usr_mem_w_err_o	: std_logic;
	
begin

	-- Wishbone Slave memory controller
	wb_slv_mem_ctrl_inst : wb_slv_mem_ctrl
		generic map(
			C_MEM_ADDR_WIDTH 		=> C_MEM_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_i,
			wb_o 	=> wb_o,
			
			-- mem interface
			mem_addr_o  => ctrl_addr_o,
			mem_we_o    => ctrl_we_o,
			mem_data_o  => ctrl_data_o,
			mem_data_i	=> ctrl_data_i,
			mem_w_ack_i	=> ctrl_w_ack_i,
			mem_w_err_i	=> ctrl_w_err_i
		);

	-- write ack/err combinatorial feedback logic:
	
		-- mem-input-only mode
		IO_GEN_IN:
		if C_IO_ADDR_BIT=-2 generate
			begin
				-- in memory input mode the wb interface cannot write to any address
				ctrl_w_ack_i <= '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' else '0';
				
				-- in memory input mode the user memory interface can write to all addresses
				usr_mem_w_ack_o <= '1' when mem_we_i='1' else '0';
				usr_mem_w_err_o <= '0';
		end generate;
		
		-- mem-output-only mode
		IO_GEN_OUT:
		if C_IO_ADDR_BIT=-1 generate
			begin
				-- in memory output mode the wb interface can write to all addresses
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' else '0';
				ctrl_w_err_i <= '0';
				
				-- in memory output mode the user memory interface cannot write to any address
				usr_mem_w_ack_o <= '0';
				usr_mem_w_err_o <= '1' when mem_we_i='1' else '0';
		end generate;

		-- mixed-IO mode
		IO_GEN_MIX:
		if C_IO_ADDR_BIT>=0 generate
			begin
				-- wb interface can read+write input addresses (C_IO_ADDR_BIT=1) and read output addresses (C_IO_ADDR_BIT=0)
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='1' else '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='0' else '0';
				
				-- user memory interface can read+write output addresses (C_IO_ADDR_BIT=0) and read input addresses (C_IO_ADDR_BIT=1)
				usr_mem_w_ack_o <= '1' when mem_we_i='1' and mem_addr_i(C_IO_ADDR_BIT)='0' else '0';
				usr_mem_w_err_o <= '1' when mem_we_i='1' and mem_addr_i(C_IO_ADDR_BIT)='1' else '0'; 
		end generate;
		
		
	-- wb control <> memory signal mapping
	wb_mem_we_i 	<= ctrl_w_ack_i;
	wb_mem_addr_i 	<= ctrl_addr_o;
	wb_mem_data_i 	<= ctrl_data_o;
	ctrl_data_i 	<= wb_mem_data_o;
	
	-- user io + control <> memory signal mapping
	usr_mem_we_i 	<= usr_mem_w_ack_o;
	usr_mem_addr_i <= mem_addr_i;
	usr_mem_data_i	<= mem_data_i;
	mem_data_o		<= usr_mem_data_o;
	mem_w_ack_o 	<= usr_mem_w_ack_o;
	mem_w_err_o 	<= usr_mem_w_err_o;
	
	-- Dual ported memory
	ram_rwrw_inst : ram_rwrw
		generic map( 
			ADDR_WIDTH    => C_MEM_ADDR_WIDTH,
			DATA_WIDTH    => C_DATA_WIDTH,
			RAMSTYLE      => C_RAMSTYLE,
			PIPE_REGA_EN  => 0,
			PIPE_REGB_EN  => 0,
			INIT_DATA     => 0
			)
		port map( 
			clk_a_i    => clk_i,
			enable_a_i => '1',
			we_a_i     => wb_mem_we_i,
			addr_a_i   => wb_mem_addr_i,
			data_a_i   => wb_mem_data_i,
			data_a_o   => wb_mem_data_o,

			clk_b_i    => clk_i,
			enable_b_i => '1',
			we_b_i     => usr_mem_we_i,
			addr_b_i   => usr_mem_addr_i,
			data_b_i   => usr_mem_data_i,
			data_b_o   => usr_mem_data_o
			);

end structural;