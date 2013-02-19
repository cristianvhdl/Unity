----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    09:13:34 11/23/2012 
-- Design Name: 
-- Module Name:    ul_bsp_wbm_test_top - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.numeric_std.all;

library wishbone_v03_00_a;
use wishbone_v03_00_a.wb_classic_pkg.all;

entity ul_bsp_wbm_test_top is
	port (
		-- WB syscon interface
		clk_i					: in  std_logic;
		rst_i					: in  std_logic;
		
		leds_o 				: out std_logic_vector(6 downto 0);
		
		-- RxFIFO
		rx_fifo_empty_i 		: in  std_logic;														-- (MANDATORY) : rx-fifo empty control signal
		rx_fifo_read_o 		: out std_logic;														-- (MANDATORY) : rx-fifo read control signal
		rx_fifo_data_i 		: in  std_logic_vector (7 downto 0);							-- (MANDATORY) : rx-fifo data bus
		
		-- Rx error signals
		rx_err_i 				: in  std_logic_vector(2 downto 0);								-- (OPTIONAL) : Can be used by the physical-layer to report RX-errors to the datalink-layer
		rx_err_clr_o		 	: out std_logic;														-- (OPTIONAL) : If the physical-layer asserts a rx_err_i signal it MUST deassert it (them all) synchroneous to the assertion of rx_err_clr_o
		rx_fifo_flush_req_o	: out std_logic;														-- (OPTIONAL) : Signal from the datalink-layer requesting the physical-layer to flush its rx-fifo (an error has been detected in the incoming (rx) message)
		
		-- TxFIFO
		tx_fifo_full_i 		: in  std_logic;														-- (MANDATORY) : tx-fifo full control signal
		tx_fifo_write_o 		: out std_logic;														-- (MANDATORY) : tx-fifo write control signal
		tx_fifo_data_o 		: out std_logic_vector (7 downto 0)							-- (MANDATORY) : tx-fifo data bus	
	);
end ul_bsp_wbm_test_top;

architecture Behavioral of ul_bsp_wbm_test_top is

	--**************************************************************************
	-- DO NOT EDIT BELOW THIS LINE
	--**************************************************************************

		-- wb master interface
		signal wb_mo_m0i : wb_ad32sb_if;
		signal wb_mi_m0o : wb_d32ae_if;
		
		signal wb_s0i_rso : wb_d32ae_if;
		signal wb_s0o_rsi : wb_ad32sb_if;

		signal wb_s1i_fso : wb_d32ae_if;
		signal wb_s1o_fsi : wb_ad32sb_if;
				
	--**************************************************************************
	-- DO NOT EDIT ABOVE THIS LINE
	--**************************************************************************
	
		signal fifo_irq_o		: std_logic;
		signal irq				: std_logic_vector(1 downto 0);
	
		signal fifo_empty_o 	: std_logic;
		signal fifo_rd_i 		: std_logic;
		signal fifo_data_o 	: std_logic_vector(31 downto 0);

		signal fifo_full_o 	: std_logic;
		signal fifo_wr_i 		: std_logic;
		signal fifo_data_i 	: std_logic_vector(31 downto 0);

begin

	UL_bsp_wbm_inst : entity work.UL_bsp_wbm
		generic map(
			-- C_BSP_MODE					: integer range 0 to 1	 := 0;			-- 0: ASCII mode, 1: BINARY mode (NOT SUPPORTED YET....)
			-- Datalink Layer Configuration
			C_DL_FULL						=> 1,			-- 1 = Full Datalink Layer, 0 = Lite Datalink Layer (No FIFO's, Checksum or error detection)
			C_DL_PL_RX_ERR_WIDTH			=> 3,			-- Number of rx error input lines from the physical layer		
			C_DL_CHECKSUM					=> 2,			-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT		
			-- Application Layer Configuration
			C_AL_RLC_EN						=> 1,			-- 0: Read Link Config command disabled, 1: Read Link Config command enabled
			C_AL_RM_SIZE					=> 32,			-- 0: RM disabled, 1-255: RM enabled (up to C_RM_SIZE reads allowed in one command RM)
			C_AL_PUB_MODE					=> 2,			-- 0: Publish mode disabled, 1: Prioritize incoming requests, 2: Prioritize Publish requests		
			C_AL_PUBLISH_BASE_FREQ		=> 1000,		-- Publish sync strobe base frequency [Hz]			
			C_AL_SUBMNGR_SGID_SIZE		=> 1,			-- Bitwidth of the Group ID port (controls the number of individual subscription groups)
			C_AL_SUBGRP_RATE_BYTE_CNT 	=> 2, 			-- Number of bytes in the RATE register of each subscription group
			C_AL_SUBGRP_ADDR_WIDTH 		=> 4,			-- Size/depth of each subscription group = (2**C_AL_SUBGRP_ADDR_WIDTH) : RANGE=[4,8,16,32]		
			-- Wishbone Bus Interface (WB) Configuration
			C_WB_CLK_FREQ					=> 50000000,	-- WB clock frequency [Hz]
			C_WB_ADDR_WIDTH				=> 8,				-- WB bus address space/size
			C_WB_DATA_WIDTH				=> 32,			-- WN bus data width: [8,16,32]
			-- Memory instantiation Options
			C_PRE_SP6_MODE					=> 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled		
			)
		port map(
		-------------------------------------------
		-- Physical-Layer interface
		-- ----------------------------------------
		-- The physical-layer must implement two FIFOs:
		--
		-- RxFIFO : used by the physical-layer to store incoming messages from an external device (e.g. PC)
		-- TxFIFO : used by the physical-layer to read messages (from the datalink-layer) to be sent to an external device (e.g. PC)
		-------------------------------------------
			
			-- RxFIFO
			rx_fifo_empty_i 		=> rx_fifo_empty_i,
			rx_fifo_read_o 		=> rx_fifo_read_o,
			rx_fifo_data_i 		=> rx_fifo_data_i,
			
			-- Rx error signals
			rx_err_i 				=> rx_err_i,
			rx_err_clr_o		 	=> rx_err_clr_o,
			rx_fifo_flush_req_o	=> rx_fifo_flush_req_o,
			
			-- TxFIFO
			tx_fifo_full_i 		=> tx_fifo_full_i,
			tx_fifo_write_o 		=> tx_fifo_write_o,
			tx_fifo_data_o 		=> tx_fifo_data_o,
			
		-------------------------------------------
		
		-------------------------------------------
		-- Wishbone Master interface
		-------------------------------------------
			-- WB syscon interface
			clk_i					=> clk_i,
			rst_i					=> rst_i,
			
			
			-- wb master interface
			wb_o 				=> wb_mo_m0i,
			wb_i 				=> wb_mi_m0o,
		-------------------------------------------
		
		-------------------------------------------
		-- Subscription-Group IRQ inputs
		-------------------------------------------
			sg_irq_i 		=> irq
		-------------------------------------------				
		);
	
		irq <= '0' & fifo_irq_o;

	wb_intercon_2slv_inst : entity wishbone_v03_00_a.wb_intercon_2slv
		generic map(
			C_M0_ADDR_WIDTH	=> 8,	-- must be wide enough to address all slaves
			C_S0_BASEADDR		=> X"00000000",
			C_S0_ENDADDR		=> X"0000000F", -- 4 bit address range
			C_S1_BASEADDR		=> X"00000010",
			C_S1_ENDADDR		=> X"00000010"  -- 0 ("½") bit address range
		)
		port map( 	
				-- wb master interface
				m0_wb_i 	=> wb_mo_m0i,
				m0_wb_o 	=> wb_mi_m0o,
			
				-- wb slave interface
				s0_wb_i 	=> wb_s0i_rso,
				s0_wb_o 	=> wb_s0o_rsi,
				
				-- wb slave interface
				s1_wb_i 	=> wb_s1i_fso,
				s1_wb_o 	=> wb_s1o_fsi
		);

	wb_fifo_inst : wb_fifo
		generic map(
			-- FIFO configuration
			C_FIFO_DEPTH			=> 4,				-- FIFO depth (fifo memory address bit-width)
			C_DATA_WIDTH			=> 32,			-- Data bit-width
			C_CLOCK_MODE			=> 0,    		-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
			C_SYNC_DEPTH			=> 2,				-- Synchronizer depth (asynch mode only)
			C_PRE_LOAD				=> 0,				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
			C_READ_MODE				=> 1,				-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
			C_PRE_SP6_MODE			=> 0,				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
			C_RAMSTYLE				=> "AUTO"		-- AUTO, BLOCK, DISTRIBUTED (only has effect if READ_MODE=1)		
		)
		port map( 
				-- wb syscon interface	
				clk_i => clk_i,
				rst_i => '0',
				
				-- wb slave interface
				wb_i 	=> wb_s1o_fsi,
				wb_o 	=> wb_s1i_fso,
				
				irq_o => fifo_irq_o,
				
				-- fifo interface
				fifo_clk_i		=> '0',	-- fifo clock input, only used in asynchronous clock mode (C_CLOCK_MODE=1)
															-- if C_CLOCK_MODE=0, tie input to zero '0'
															
				fifo_empty_o 	=> fifo_empty_o,
				fifo_rd_i 		=> fifo_rd_i,
				fifo_data_o 	=> fifo_data_o,

				fifo_full_o 	=> fifo_full_o,
				fifo_wr_i 		=> fifo_wr_i,
				fifo_data_i 	=> fifo_data_i
		);
		
		fifo_rd_i <= '1' when fifo_empty_o = '0' and fifo_full_o = '0' else '0';
		fifo_wr_i <= '1' when fifo_empty_o = '0' and fifo_full_o = '0' else '0';		
		fifo_data_i <= std_logic_vector(unsigned(fifo_data_o) + 2);
		
		wb_reg_io_inst : entity wishbone_v03_00_a.wb_reg_io
			generic map(
				-- REG configuration
				C_REG_ADDR_WIDTH 		=> 4,		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
				C_DATA_WIDTH 			=> 32,	-- Data bit size	(TosNet/uTosNet mode: 32)
				C_IO_ADDR_BIT 			=> 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], INPUT-ONLY mode: -2, OUTPUT-ONLY mode: -1
			)
			port map( 
					-- wb syscon interface	
					clk_i => clk_i,
					rst_i => '0',
					
					-- wb slave interface
					wb_i 	=> wb_s0o_rsi,
					wb_o 	=> wb_s0i_rso,

					--------------------------------------------
					-- Insert User Logic below this line
					
					led_o => leds_o
					
					-- Insert User Logic above this line
					--------------------------------------------
			);

end Behavioral;

