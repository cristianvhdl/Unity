----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    15:46:53 27/03-2012 
-- Design Name: 
-- Module Name:    wb2wb_db_cwrm_mem - structural 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave component providing a dual wishbone 
--		interface to a double-buffered dual-ported memory.
--
--		N.B. 	Actual address-bus width is C_MEM_ADDR_WIDTH+1
--
--				As the C_MEM_ADDR_WIDTH generic describes the 
--				address width of the double-buffered memory alone,
--				the actual address-bus width for this module will 
--				be 1 bit wider than just the memory address in order 
--				to enable access to the status and control registers 
--				of the double-buffer, commit-write memory controller.
--
--	*********************************************************************
--
--		Please read through the documentation below for a detailed 
--		description of the usage and capabilities of this module!
--
--	*********************************************************************
--
--		This module implement a wishbone slave double-buffered 
--		commit-write<>read-multiple memory component using the wb_db_cwrm_mem 
--		component which in turn uses the db_mem_cwrm	component (found in the 
--		db_mem_pkg in the db_mem Unity-lib library) and	the wb_slv_db_mem_ctrl 
--		component (found in the wb_classic_pkg in the wishbone  Unity-lib library).
--		
--		The db_mem_cwrm component implement a Double Buffered 
--		Commit-Write<>Read-Multiple Memory controller and memory.
--		It provides a status register for each of the two interfaces to 
--		the memory (master/slave) as well as a control register for each.
--
--		The wb_slv_db_mem_ctrl component abstracts away the control register 
--		used for issuing commit-write commands, and integrates the status register
--		into the same address space as the control register. 
--
--		In this way a read issued to to the shared control/status register 
--		address (CTR_STR_ADR) will return the status register(s) of the 
--		db_mem_cwrm controller(s). A write to the same address will generate a 
--		commit-write command.
--
--		The Control/Status Register Addss (CTR_STR_ADR) is: 2**C_MEM_ADDR_WIDTH
--			ex: if the C_MEM_ADDR_WIDTH=8, the CTR_STR_ADR will be at address 2**8 = 256
--
--		32-bit Status Register layout	(seen from the wishbone-bus slave-1 interface):
--
--			STR: x"00" & s_str & x"00" & m_str;
--
--				s_str: 8-bit status register for the slave 
--						 side of the db_mem component. 
--						 (connected to the wishbone-bus slave-2)
--
--				m_str: 8-bit status register for the master
--						 side of the db_mem component.
--						 (connected to the wishbone-bus slave-1)
--
--		32-bit Status Register layout	(seen from the wishbone-bus slave-2 interface):
--
--			STR: x"00" & m_str & x"00" & s_str;
--
--				s_str: 8-bit status register for the slave 
--						 side of the db_mem component. 
--						 (connected to the wishbone-bus slave-2)
--
--				m_str: 8-bit status register for the master
--						 side of the db_mem component.
--						 (connected to the wishbone-bus slave-1)
--
--		For details about the content of the m_str and s_str part of the status
--		register please read the documentation of the db_mem_cwrm component.
--
-- 								  GENERICS
--  --------------------------------------------------------------
--  	C_MEM_ADDR_WIDTH : Address bitwidth of the memory
-- 
--  	C_DATA_WIDTH : Data bitwidth of the memory
--
--  	C_IO_ADDR_BIT : selects the address bit which determines 
--  		  			    whether the address is an input or an output 
--					       address.
--
--  		Input addresses  : addr[C_IO_ADDR_BIT] = 1
--  		Output addresses : addr[C_IO_ADDR_BIT] = 0
--
--   		Wishbone-bus (slave 1) 
--			access rights: 
--							read+write input addresses
--							read output addresses
--
--   		Wishbone-bus (slave 2)
--			access rights: 	
--							read input addresses
--							read+write output addresses
--
--  	C_CW_TIMEOUT : Commit Write Timeout
-- 
--   		0  : disabled
--   		1+ : timeout enabled 
--	    	  	 (C_CW_TIMEOUT = timeout latency in clock cycles)
--			  	 Describes number of clock cycles a pending CW is 
--			  	 allowed to be blocked before a timeout is generated.
--
--  	C_RST_ON_CW_TIMEOUT: Reset on Commit Write Timeout
--
--   		0 : disabled (default)
--   		1 : enabled 
--	 --------------------------------------------------------------
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE double-buffered dual-port       |
--	 |								|	memory controller with 1-bit width    |
--	 |								|	granularity on data and address bus's,|
--	 |							   |  Commit Write, Read Multiple (CWRM) 	  |
--	 |								|	functionality								  |
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
--			- db_mem_v02_00_a
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		27/03-2012	ANLAN		File Created
-- 0.02		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		19/10-2012	ANLAN		Headers, comments and licensing info updated.
-- 1.01		
--
-- Additional Comments: 
--
--		It is recommended to copy this module (wb_dbmem_io.vhd)
--		to the local work library for editing.
--		(PLEASE DO NOT EDIT YOUR LIBRARY FILE!)
--
-- 	Address space width = C_MEM_ADDR_WIDTH+1
--
-- 	Commit Write: Write any data to any address in the range	: [2**C_MEM_ADDR_WIDTH, (2**(C_MEM_ADDR_WIDTH+1))-1]
--
-- 	Read Status register: Read from any address in the range: [2**C_MEM_ADDR_WIDTH, (2**(C_MEM_ADDR_WIDTH+1))-1]
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

library db_mem_v02_00_a;
use db_mem_v02_00_a.db_mem_pkg.all;

use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb2wb_db_cwrm_mem is
	generic (
		-- DB CWRM MEM configuration
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10;	-- Memory depth/size
		C_DATA_WIDTH			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
		C_IO_ADDR_BIT 			: integer range 0 to 31 := 2;		-- default: 2 (TosNet mode)
		C_CW_TIMEOUT 			: natural 					:= 10;
		C_RST_ON_CW_TIMEOUT 	: integer range 0 to 1 	:= 0		
	);
	port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface 1
			wb_si1_i 	: in  wb_ad32sb_if;
			wb_si1_o 	: out wb_d32ae_if;
			
			-- wb slave interface 2
			wb_si2_i 	: in  wb_ad32sb_if;
			wb_si2_o 	: out wb_d32ae_if		
	);
end wb2wb_db_cwrm_mem;

architecture structural of wb2wb_db_cwrm_mem is

	signal m_db_i : db_mem_cwrm_i_if;
	signal m_db_o : db_mem_cwrm_o_if;
	signal s_db_i : db_mem_cwrm_i_if;
	signal s_db_o : db_mem_cwrm_o_if;	

begin

	wb_slv_db_mem_ctrl_inst1 : wb_slv_db_mem_ctrl
	generic map(
		C_MEM_ADDR_WIDTH 	=> C_MEM_ADDR_WIDTH
	)
	port map( 
		-- wb syscon interface	
		clk_i => clk_i,
		rst_i => rst_i,
		
		-- wb slave interface
		wb_i 	=> wb_si1_i,
		wb_o 	=> wb_si1_o,
		
		-- db_mem interface
		db_i 	=> m_db_o,
		db_o 	=> m_db_i
	);
	
	wb_slv_db_mem_ctrl_inst2 : wb_slv_db_mem_ctrl
	generic map(
		C_MEM_ADDR_WIDTH 	=> C_MEM_ADDR_WIDTH
	)
	port map( 
		-- wb syscon interface	
		clk_i => clk_i,
		rst_i => rst_i,
		
		-- wb slave interface
		wb_i 	=> wb_si2_i,
		wb_o 	=> wb_si2_o,
		
		-- db_mem interface
		db_i 	=> s_db_o,
		db_o 	=> s_db_i
	);	

	db_mem_cwrm_inst : db_mem_cwrm
		generic map(
			C_IO_ADDR_BIT 			=> C_IO_ADDR_BIT,
			C_ADDR_WIDTH 			=> C_MEM_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH,
			C_CW_TIMEOUT 			=> C_CW_TIMEOUT,
			C_RST_ON_CW_TIMEOUT 	=> C_RST_ON_CW_TIMEOUT
		)
		port map( 
			clk_i    	=> clk_i,
			reset_i  	=> rst_i,
			
			-- master io
			m_db_i 		=> m_db_i,
			m_db_o 		=> m_db_o,
			
			-- slave io
			s_db_i 		=> s_db_i,
			s_db_o 		=> s_db_o
		);

end structural;
