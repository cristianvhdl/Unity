----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    16:13:15 03/22/2012 
-- Design Name: 
-- Module Name:    wb_db_cwrm_mem - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	| 	32-bit SLAVE double buffered memory   |
--	 |								|	with 32-bit granularity, Commit Write |
--	 |								|	+ Read Multiple (CWRM) functionality. |
--  -----------------------------------------------------------------
--	 |	Wishbone version 		| 	Protocol version B4 						  |
--  -----------------------------------------------------------------
--	 |	Supported cycles		| 	SLAVE, READ/WRITE							  |
--	 |								| 	SLAVE, BLOCK READ/WRITE					  |
--  -----------------------------------------------------------------
--  |	Data port:				|													  | 
--	 |		size					|	32-bit (QWORD)								  |
--	 |		granularity  		|	32-bit (QWORD)								  |
--	 |		max. operand size	|	32-bit (QWORD)								  |
--  |	Data transfer: 		|													  |
--	 |		ordering  			|	LITTLE ENDIAN								  |
--  |		sequence    		|	UNDEFINED									  |
--  -----------------------------------------------------------------
--
--  Signal name description and cross references:
--	 .... PENDING
--  .........
--  .............
--
--  Error generation : ERR_O is asserted under the following conditions
--	 .... PENDING
--  .........
--  .............
--
--  -----------------------------------------------------------------
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use work.wb_classic_interface.all;

library db_mem_v01_00_a;
use db_mem_v01_00_a.db_mem.all;

entity wb_db_cwrm_mem is
	generic (
		-- DB CWRM MEM configuration
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10;	-- Memory depth/size
		C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
		C_IO_ADDR_BIT 			: integer range 0 to 31 := 2;		-- default: 2 (TosNet mode)
		C_CW_TIMEOUT 			: natural 					:= 10;
		C_RST_ON_CW_TIMEOUT 	: integer range 0 to 1 	:= 0		
	);
	port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
			
			-- db cwrm mem interface
			db_i 	: in  db_mem_cwrm_i_if;
			db_o 	: out db_mem_cwrm_o_if			
	);
end wb_db_cwrm_mem;

architecture structural of wb_db_cwrm_mem is

	signal m_db_i : db_mem_cwrm_i_if;
	signal m_db_o : db_mem_cwrm_o_if;

begin

	wb_slv_db_mem_ctrl_inst : entity work.wb_slv_db_mem_ctrl
	generic map(
		C_MEM_ADDR_WIDTH 	=> C_MEM_ADDR_WIDTH
	)
	port map( 
		-- wb syscon interface	
		clk_i => clk_i,
		rst_i => rst_i,
		
		-- wb slave interface
		wb_i 	=> wb_i,
		wb_o 	=> wb_o,
		
		-- db_mem interface
		db_i 	=> m_db_o,
		db_o 	=> m_db_i
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
			s_db_i 		=> db_i,
			s_db_o 		=> db_o
		);

end structural;



