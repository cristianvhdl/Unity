----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    12:25:25 03/30/2012 
-- Design Name: 
-- Module Name:    wb_reg_io - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:
--
--		Wishbone slave IO component offering a wishbone interface to a register file
--		and template code for direct IO interfacing.
--
--		The registers can be configured as either (seen from the wishbone interface): 
--
--			- READ ONLY (aka input-only mode, IO point-of-view)
-- 				
--				C_IO_ADDR_BIT = -2
-- 				
--				In input mode the wb interface
--				cannot write to any address.
-- 			The user (logic) interface can 
--				write to all addresses.
--
--			- WRITE ONLY (aka output-only mode, IO point-of-view)
-- 				
--				C_IO_ADDR_BIT = -1
-- 				
--				In output mode the wb interface
--				can write to all addresses.
-- 			The user (logic) interface cannot 
--				write to any address.
--
--			- READ AND WRITE (aka mixed-io mode)
--
--				C_IO_ADDR_BIT = [0:C_REG_ADDR_WIDTH-1]
--
-- 			The wb interface can read+write input addresses (C_IO_ADDR_BIT=1) 
--				and read output addresses (C_IO_ADDR_BIT=0).
--
--	 			The user (logic) interface can read+write output addresses
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
--	 |	General description	|  SLAVE register file component         |
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
-- 1.01		01/12-2012	ANLAN		Default library-path set to wishbone-lib instead for work-lib.
-- 1.02			
--
-- Additional Comments:
--
--		It is recommended to copy this module (wb_reg_io.vhd) 
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
--#force_copy
--#force_work

library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

library wishbone_v03_50_a;
use wishbone_v03_50_a.wb_classic_pkg.all;

--use work.wb_classic_pkg.all;		-- only used during development

entity wb_reg_io is
	generic (
		-- REG configuration
		C_REG_ADDR_WIDTH 		: integer range 0 to 8 	 := 6;	-- Register count (uTosNet mode: 6)
		C_DATA_WIDTH 			: integer range 1 to 32  := 32;	-- Data bit size	(uTosNet mode: 32)
		C_IO_ADDR_BIT 			: integer range -2 to 31 := 2;	-- default: 2 (uTosNet mode), MIXED-IO: [0:C_REG_ADDR_WIDTH-1], INPUT-ONLY mode: -2, OUTPUT-ONLY mode: -1
		
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
end wb_reg_io;

architecture structural of wb_reg_io is
	
	-- register signal
	type reg_type is array (natural range <>) of std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal d_reg : reg_type((2**C_REG_ADDR_WIDTH)-1 downto 0) := (others=>(others=>'0'));
	signal d_nxt : reg_type((2**C_REG_ADDR_WIDTH)-1 downto 0);

	-- control/data signals	
	signal ctrl_we_o		: std_logic;
	signal ctrl_addr_o	: std_logic_vector(C_REG_ADDR_WIDTH-1 downto 0);	
	signal ctrl_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_w_ack_i	: std_logic;
	signal ctrl_w_err_i	: std_logic;
	
	signal mem_we_i		: std_logic;
	signal mem_addr_i		: std_logic_vector(C_REG_ADDR_WIDTH-1 downto 0);	
	signal mem_data_i		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal mem_data_o		: std_logic_vector(C_DATA_WIDTH-1 downto 0);

	--------------------------------------------
	-- Insert User Logic below this line
	
	
	signal led		: std_logic_vector(LED_WIDTH-1 downto 0);
	
	
	-- Insert User Logic above this line
	--------------------------------------------

begin

	-- Wishbone Slave memory controller
	wb_slv_mem_ctrl_inst : wb_slv_mem_ctrl
		generic map(
			C_MEM_ADDR_WIDTH 		=> C_REG_ADDR_WIDTH,
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

	-- wishbone write ack/err combinatorial feedback logic + output and input logic:
	
		-- input-only mode
		IO_GEN_IN:
		if C_IO_ADDR_BIT=-2 generate
			begin
				-- in input mode the wb interface cannot write to any address
				ctrl_w_ack_i <= '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' else '0';
		end generate;
		
		-- output-only mode
		IO_GEN_OUT:
		if C_IO_ADDR_BIT=-1 generate
			begin				
				-- in output mode the wb interface can write to all addresses
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' else '0';
				ctrl_w_err_i <= '0';
				
				WB_DATA_O_GEN:
				for i in 0 to (2**C_REG_ADDR_WIDTH)-1 generate
					begin
						d_nxt(i) <= ctrl_data_o when ctrl_w_ack_i='1' and to_integer(unsigned(ctrl_addr_o))=i else d_reg(i);
				end generate;					
				
		end generate;

		-- mixed-IO mode
		IO_GEN_MIX:
		if C_IO_ADDR_BIT>=0 generate
			begin
				-- wb interface can read+write input addresses (C_IO_ADDR_BIT=1) and read output addresses (C_IO_ADDR_BIT=0)
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='1' else '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='0' else '0';
				
				WB_DATA_O_GEN:
				for i in 0 to (2**C_REG_ADDR_WIDTH)-1 generate
					begin
						WB_DATA_O_MUX_GEN:
						if to_unsigned(i,C_REG_ADDR_WIDTH)(C_IO_ADDR_BIT)='1' generate
							d_nxt(i) <= ctrl_data_o when ctrl_w_ack_i='1' and to_integer(unsigned(ctrl_addr_o))=i else d_reg(i);
						end generate;
				end generate;					
		end generate;

	ctrl_data_i <= d_reg(to_integer(unsigned(ctrl_addr_o)));


	-- data register(s)
	process(clk_i)
	begin	
		if rising_edge(clk_i) then
			if rst_i='1' then				
				d_reg <= (others=>(others=>'0'));
			else
				d_reg <= d_nxt;
			end if;			
		end if;
	end process;
		

	--------------------------------------------
	-- Register interface:
	--
	--		read data from reg @ adr 4 into signal x:
	--
	--			x <= d_reg(4);
	--
	--		write data value x"00BEEF00" to reg @ addr 0:
	--
	--			d_nxt <= x"00BEEF00";
	--
	--	-------------------------------------
	-- INPUT-ONLY Mode:
	--		user register interface can write to and read from any address
	--
	-- OUTPUT-ONLY Mode:
	--		user register interface can read from any address, but not write
	--
	-- MIXED-IO Mode:
	--		user register interface can read+write output addresses (C_IO_ADDR_BIT=0)
	--		and read input addresses (C_IO_ADDR_BIT=1)
	--	-------------------------------------
	--
	-- Insert User Logic below this line
	
		d_nxt(0) <= x"01abcdef";
		d_nxt(1) <= x"02bcdefa";
		d_nxt(2) <= x"03cdefab";
		d_nxt(3) <= x"04defabc";
		
		led_o <= d_reg(4)(led_o'range);
	
	-- Insert User Logic above this line
	--------------------------------------------		

end structural;