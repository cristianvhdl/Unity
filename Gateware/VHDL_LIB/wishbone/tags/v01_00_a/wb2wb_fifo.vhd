----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    09:22:43 04/25/2012 
-- Design Name: 
-- Module Name:    wb2wb_fifo - structural 
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
--	 |	General description	| 	32-bit SLAVE fifo with 32-bit 	     |
--	 |								|	granularity, Commit Write 				  |
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

library fifo_v01_00_a;
use fifo_v01_00_a.all;

entity wb2wb_fifo is
	generic (
		-- MEM configuration
		C_FIFO_DEPTH 			: integer range 0 to 32 := 4;		-- FIFO depth (fifo memory address width)
		C_DATA_WIDTH 			: integer range 1 to 32 := 32		-- Data bit size
	);
	port ( 
			-- wb syscon interface	
			clk_i 	: in  std_logic;
			rst_i 	: in  std_logic;
			
			-- wb slave interface A
			wb_a_i 	: in  wb_ad32sb_if;
			wb_a_o	: out wb_d32ae_if;
			
			-- wb slave interface B
			wb_b_i 	: in  wb_ad32sb_if;
			wb_b_o 	: out wb_d32ae_if
	);
end wb2wb_fifo;

architecture structural of wb2wb_fifo is

	signal wb_a_fifo_wr_o 		: std_logic;
	signal wb_a_fifo_data_o 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_a_fifo_full_i 	: std_logic;
	signal wb_a_fifo_empty_i 	: std_logic;
	signal wb_a_fifo_data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_a_fifo_rd_o 		: std_logic;

	signal wb_b_fifo_wr_o 		: std_logic;
	signal wb_b_fifo_data_o 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_b_fifo_full_i 	: std_logic;
	signal wb_b_fifo_empty_i 	: std_logic;
	signal wb_b_fifo_data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_b_fifo_rd_o 		: std_logic;

begin

	-- Wishbone Slave fifo controller A
	wb_slv_fifo_ctrl_inst_a : entity work.wb_slv_fifo_ctrl
		generic map(
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_a_i,
			wb_o 	=> wb_a_o,
			
			-- fifo interface
			fifo_wr_o    => wb_a_fifo_wr_o,
			fifo_data_o  => wb_a_fifo_data_o,
			fifo_full_i  => wb_a_fifo_full_i,
			fifo_empty_i => wb_a_fifo_empty_i,
			fifo_data_i	 => wb_a_fifo_data_i,
			fifo_rd_o	 => wb_a_fifo_rd_o
		);
		
	-- Wishbone Slave fifo controller B
	wb_slv_fifo_ctrl_inst_b : entity work.wb_slv_fifo_ctrl
		generic map(
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_b_i,
			wb_o 	=> wb_b_o,
			
			-- fifo interface
			fifo_wr_o    => wb_b_fifo_wr_o,
			fifo_data_o  => wb_b_fifo_data_o,
			fifo_full_i  => wb_b_fifo_full_i,
			fifo_empty_i => wb_b_fifo_empty_i,
			fifo_data_i	 => wb_b_fifo_data_i,
			fifo_rd_o	 => wb_b_fifo_rd_o
		);		

	-- Wishbone input fifo
	fifo_wb_a_in_inst : entity fifo_v01_00_a.fifo
		generic map(	
			ADDR_WIDTH	=> C_FIFO_DEPTH,
			DATA_WIDTH	=> C_DATA_WIDTH,
			MODE_ASYNC	=> 0,    			-- Fifo mode: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH	=> 2,					-- Synchronizer depth (asynch mode only)
			PRE_LOAD		=>	0,				   -- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK	=> 0   				-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			)
		port map(
			clk_i			=> clk_i,
			-- Input clock domain
			clkw_asynch_i => '0',
			wr_i			  => wb_a_fifo_wr_o,
			data_in_i	  => wb_a_fifo_data_o,
			wr_ack_o 	  => open,
			full_o		  => wb_a_fifo_full_i,
			-- Output clock domain
			clkr_asynch_i => '0',
			rd_i			  => wb_b_fifo_rd_o,
			data_out_o 	  => wb_b_fifo_data_i,
			empty_o		  => wb_b_fifo_empty_i,
			-- Common inputs
			reset_i 		  => rst_i
			);
			
	-- Wishbone output fifo
	fifo_wb_a_out_inst : entity fifo_v01_00_a.fifo
		generic map(	
			ADDR_WIDTH	=> C_FIFO_DEPTH,
			DATA_WIDTH	=> C_DATA_WIDTH,
			MODE_ASYNC	=> 0,    			-- Fifo mode: 0 -> synchronous, 1 -> asynchronous
			SYNC_DEPTH	=> 2,					-- Synchronizer depth (asynch mode only)
			PRE_LOAD		=>	0,				   -- Write<>Read Ptr offset before deasserting empty signal (read logic)
			EN_WRT_ACK	=> 0   				-- Write acknowledge; 0 -> disabled, 1 -> enabled				
			)
		port map(
			clk_i			=> clk_i,
			-- Input clock domain
			clkw_asynch_i => '0',
			wr_i			  => wb_b_fifo_wr_o,
			data_in_i	  => wb_b_fifo_data_o,
			wr_ack_o 	  => open,
			full_o		  => wb_b_fifo_full_i,
			-- Output clock domain
			clkr_asynch_i => '0',
			rd_i			  => wb_a_fifo_rd_o,
			data_out_o 	  => wb_a_fifo_data_i,
			empty_o		  => wb_a_fifo_empty_i,
			-- Common inputs
			reset_i 		  => rst_i
			);

end structural;