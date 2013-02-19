----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:19:20 22/11/2012
-- Design Name: 
-- Module Name:    uart_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib UART library
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

package uart_pkg is

	-------------------------------------------------------------------------------
	-- uart.vhd
	--
	--		UART with Synchronous FIFO interface
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component uart is
		generic (
			C_ERROR_CNT_WIDTH	: integer range 0 to 32	:= 8;		-- Bitwidth of the error counters (0 = counters disabled)
			C_BIT_TXRX_ORDER	: integer range 0 to 1 	:= 0;		-- databit tx/rx order: 0 = LSB, 1 = MSB		
			C_TICKS_PR_BIT		: integer 				  	:= 16;	-- number of (baudrate generator) ticks for each bit. SHOULD BE AN EVEN NUMBER. default = 16
			C_BAUD_RATE_DVSR  : positive					:= 2;		-- BAUD rate divisor: C_BAUD_RATE_DVSR = clk_frq/(C_TICKS_PR_BIT*baud_rate)
			C_RX_FIFO_ADDR_W	: positive				  	:= 4;		-- rx fifo depth = 2**C_RX_FIFO_ADDR_W
			C_TX_FIFO_ADDR_W	: positive				  	:= 4;		-- tx fifo depth = 2**C_TX_FIFO_ADDR_W
			C_DATABITS 			: integer range 7 to 9 	:= 8;		-- number of databits
			C_STOPBITS			: integer range 1 to 2 	:= 1;		-- number of stopbits
			C_PARITY				: integer range 0 to 4 	:= 1;		-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE
			C_PRE_SP6_MODE		: natural range 0 to 1 	:= 0		-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
		);
		port ( 
			clk_i 				: in  std_logic;
			reset_i 				: in  std_logic;
			reset_rx_i			: in  std_logic;
			reset_tx_i			: in  std_logic;
			
			lsr_o 				: out std_logic_vector (7 downto 0);
			clr_lsr_errors_i	: in  std_logic;	
			
			framing_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			parity_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			overrun_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);
			clr_err_cnt_i		: in  std_logic_vector (2 downto 0);							-- (0)=>overrun, (1)=>parity, (2)=>framing

			rx_i 					: in  std_logic;
			tx_o 					: out std_logic;
			
			rx_fifo_empty_o 	: out std_logic;
			rx_fifo_read_i		: in  std_logic;		
			rx_fifo_data_o 	: out std_logic_vector (C_DATABITS-1 downto 0);
			
			tx_fifo_full_o 	: out std_logic;
			tx_fifo_write_i	: in  std_logic;
			tx_fifo_data_i 	: in  std_logic_vector (C_DATABITS-1 downto 0)	
		);
	end component;

	-------------------------------------------------------------------------------
	-- uart2.vhd
	--
	--		UART with Synchronous FIFO interface and simplified Baudrate configuration
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component uart2 is
		generic (
			-- basic configuration
			C_UART_CLK_FREQ		: positive					:= 96000000;	-- UART clock frequency [Hz] (MUST BE AT LEAST 4xC_BAUD_RATE)
			C_BAUD_RATE				: positive					:= 3000000;		-- desired baudrate				
			C_MAX_BAUD_RATE_ERR	: real						:= 3.0;			-- maximum allowed baudrate error in %
			
			C_DATABITS 				: integer range 7 to 9 	:= 8;				-- number of databits (default = 8)
			C_STOPBITS				: integer range 1 to 2 	:= 1;				-- number of stopbits (default = 1)
			C_PARITY					: integer range 0 to 4 	:= 1;				-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE
			
			-- advanced configuration
			C_ERROR_CNT_WIDTH		: integer range 0 to 32	:= 8;				-- Bitwidth of the error counters (0 = counters disabled)
			C_BIT_TXRX_ORDER		: integer range 0 to 1 	:= 0;				-- databit tx/rx order: 0 = LSB, 1 = MSB		
			C_RX_FIFO_ADDR_W		: positive				  	:= 4;				-- rx fifo depth = 2**C_RX_FIFO_ADDR_W
			C_TX_FIFO_ADDR_W		: positive				  	:= 4;				-- tx fifo depth = 2**C_TX_FIFO_ADDR_W
			C_PRE_SP6_MODE			: natural range 0 to 1 	:= 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
		);
		port ( 
			clk_i 				: in  std_logic;
			reset_i 				: in  std_logic;
			reset_rx_i			: in  std_logic;
			reset_tx_i			: in  std_logic;
			
			lsr_o 				: out std_logic_vector (7 downto 0);
			clr_lsr_errors_i	: in  std_logic;	
			
			framing_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			parity_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			overrun_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);
			clr_err_cnt_i		: in  std_logic_vector (2 downto 0);							-- (0)=>overrun, (1)=>parity, (2)=>framing

			rx_i 					: in  std_logic;
			tx_o 					: out std_logic;
			
			rx_fifo_empty_o 	: out std_logic;
			rx_fifo_read_i		: in  std_logic;		
			rx_fifo_data_o 	: out std_logic_vector (C_DATABITS-1 downto 0);
			
			tx_fifo_full_o 	: out std_logic;
			tx_fifo_write_i	: in  std_logic;
			tx_fifo_data_i 	: in  std_logic_vector (C_DATABITS-1 downto 0)	
			);
	end component;

	-------------------------------------------------------------------------------
	-- uart_asynch.vhd
	--
	--		UART with Asynchronous FIFO interface
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component uart_asynch is
		generic (
			C_ERROR_CNT_WIDTH	: integer range 0 to 32	:= 8;		-- Bitwidth of the error counters (0 = counters disabled)
			C_BIT_TXRX_ORDER	: integer range 0 to 1 	:= 0;		-- databit tx/rx order: 0 = LSB, 1 = MSB		
			C_TICKS_PR_BIT		: integer 				  	:= 16;	-- number of (baudrate generator) ticks for each bit. SHOULD BE AN EVEN NUMBER. default = 16
			C_BAUD_RATE_DVSR  : positive					:= 2;		-- BAUD rate divisor: C_BAUD_RATE_DVSR = clk_frq/(C_TICKS_PR_BIT*baud_rate)
			C_RX_FIFO_ADDR_W	: positive				  	:= 4;		-- rx fifo depth = 2**C_RX_FIFO_ADDR_W
			C_TX_FIFO_ADDR_W	: positive				  	:= 4;		-- tx fifo depth = 2**C_TX_FIFO_ADDR_W
			C_DATABITS 			: integer range 7 to 9 	:= 8;		-- number of databits
			C_STOPBITS			: integer range 1 to 2 	:= 1;		-- number of stopbits
			C_PARITY				: integer range 0 to 4 	:= 1;		-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE
			C_PRE_SP6_MODE		: natural range 0 to 1 	:= 0		-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
		);
		port ( 
			-- common io
			reset_i 				: in  std_logic;
			reset_rx_i			: in  std_logic;
			reset_tx_i			: in  std_logic;
			
			-- uart clock domain io
			uart_clk_i			: in  std_logic;	
			
			rx_i 					: in  std_logic;
			tx_o 					: out std_logic;
			
			-- user logic (fifo+uart status) clock domain io
			user_clk_i			: in  std_logic;
					
			lsr_o 				: out std_logic_vector (7 downto 0);
			clr_lsr_errors_i	: in  std_logic;	
			
			framing_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			parity_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			overrun_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);
			clr_err_cnt_i		: in  std_logic_vector (2 downto 0);							-- (0)=>overrun, (1)=>parity, (2)=>framing
			
			rx_fifo_empty_o 	: out std_logic;
			rx_fifo_read_i		: in  std_logic;		
			rx_fifo_data_o 	: out std_logic_vector (C_DATABITS-1 downto 0);
			
			tx_fifo_full_o 	: out std_logic;
			tx_fifo_write_i	: in  std_logic;
			tx_fifo_data_i 	: in  std_logic_vector (C_DATABITS-1 downto 0)	
		);
	end component;
	
	-------------------------------------------------------------------------------
	-- uart_asynch2.vhd
	--
	--		UART with Asynchronous FIFO interface and simplified Baudrate configuration
	--
	--		Please read through the documentation in the module implementation for
	--		a detailed description of the usage and capabilities of this component!	
	--
	-------------------------------------------------------------------------------
	component uart_asynch2 is
		generic (
			-- basic configuration
			C_UART_CLK_FREQ		: positive					:= 96000000;	-- UART clock frequency [Hz] (MUST BE AT LEAST 4xC_BAUD_RATE)
			C_BAUD_RATE				: positive					:= 3000000;		-- desired baudrate				
			C_MAX_BAUD_RATE_ERR	: real						:= 3.0;			-- maximum allowed baudrate error in %
			
			C_DATABITS 				: integer range 7 to 9 	:= 8;				-- number of databits (default = 8)
			C_STOPBITS				: integer range 1 to 2 	:= 1;				-- number of stopbits (default = 1)
			C_PARITY					: integer range 0 to 4 	:= 1;				-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE
			
			-- advanced configuration
			C_ERROR_CNT_WIDTH		: integer range 0 to 32	:= 8;				-- Bitwidth of the error counters (0 = counters disabled)
			C_BIT_TXRX_ORDER		: integer range 0 to 1 	:= 0;				-- databit tx/rx order: 0 = LSB, 1 = MSB		
			C_RX_FIFO_ADDR_W		: positive				  	:= 4;				-- rx fifo depth = 2**C_RX_FIFO_ADDR_W
			C_TX_FIFO_ADDR_W		: positive				  	:= 4;				-- tx fifo depth = 2**C_TX_FIFO_ADDR_W
			C_PRE_SP6_MODE			: natural range 0 to 1 	:= 0				-- Pre-Spartan6 compatibility mode: 0 = disabled, 1 = enabled
		);
		port ( 
			-- common io
			reset_i 				: in  std_logic;
			reset_rx_i			: in  std_logic;
			reset_tx_i			: in  std_logic;
			
			-- uart clock domain io
			uart_clk_i			: in  std_logic;	
			
			rx_i 					: in  std_logic;
			tx_o 					: out std_logic;
			
			-- user logic (fifo+uart status) clock domain io
			user_clk_i			: in  std_logic;
					
			lsr_o 				: out std_logic_vector (7 downto 0);
			clr_lsr_errors_i	: in  std_logic;	
			
			framing_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			parity_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);		
			overrun_err_cnt_o	: out std_logic_vector (C_ERROR_CNT_WIDTH-1 downto 0);
			clr_err_cnt_i		: in  std_logic_vector (2 downto 0);							-- (0)=>overrun, (1)=>parity, (2)=>framing
			
			rx_fifo_empty_o 	: out std_logic;
			rx_fifo_read_i		: in  std_logic;		
			rx_fifo_data_o 	: out std_logic_vector (C_DATABITS-1 downto 0);
			
			tx_fifo_full_o 	: out std_logic;
			tx_fifo_write_i	: in  std_logic;
			tx_fifo_data_i 	: in  std_logic_vector (C_DATABITS-1 downto 0)	
		);
	end component;	

end uart_pkg;

package body uart_pkg is
end uart_pkg;
