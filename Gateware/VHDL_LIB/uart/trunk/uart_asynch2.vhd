----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    10:09:41 11/22/2012 
-- Design Name: 
-- Module Name:    uart_asynch2 - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 	 UART with Asynchronous FIFO interface and simplified Baudrate configuration
--
--	Line Status Register (LSR):
--		Bit 7	Empty transmitter (Tx) shift register
--		Bit 6	Empty transmitter (Tx) FIFO
--		Bit 5	Rx data framing Error
--		Bit 4	Rx data parity Error
--		Bit 3	Rx data overrun Error
--		Bit 2	RxFIFO full (overrun eminent!)
--		Bit 1	Data Ready in the RxFiFO
--		Bit 0	Receiving (Rx) data
--
-- Dependencies: 
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		22/11/2012	ANLAN		File Created
-- 0.02		
--
-- Additional Comments: 
--
-- For best results the uart clock frequency (uart_clk_i) must be an integer 
-- multiple of that of the UART in the opposite end of the RS232 (Rx/Tx) lines.
--
--		------------------------------------------------------------------------------
-- 	|         UART         | native clock |   recommended clock  | Max BAUD Rate |
-- 	-----------------------|------------------------------------------------------
-- 	| FTDI FT232R USB UART |     48 MHz   |  48, (96) or 192 MHz |    3 MBaud    |
-- 	-----------------------|------------------------------------------------------
-- 	|    SILABS CP2102     |     48 MHz   |  (48), 96 or 192 MHz |   500 KBaud   |
-- 	-----------------------|------------------------------------------------------
-- 	|                      |              |                      |               |
-- 	-----------------------|------------------------------------------------------
--     note: recommended clock in paranteses () is the default tested clock
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
use ieee.numeric_std.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE uart_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity uart_asynch2 is
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
end uart_asynch2;

architecture structural of uart_asynch2 is

	constant C_BAUD_RATE_DVSR : integer := 1;

	function sample_rate_calc(clk: integer; baud: integer; err: real) return integer is
		variable clock_freq 	: real := real(clk);
		variable baud_target	: real := real(baud);
		variable divisor		: real := real(C_BAUD_RATE_DVSR);
		variable sample_rate : integer;
		variable baud_final	: real;
		variable error			: real;
		variable err_max		: real := real(err)/100.0;
		variable err_min		: real := -1.0 * err_max;
	begin
		
		sample_rate := integer(clock_freq/(baud_target*divisor));		
				
		ASSERT not(sample_rate < 4) REPORT "UART clock frequency MUST be at least 4 times greater then the desired baudrate!" SEVERITY failure;
		
		baud_final := clock_freq/(real(sample_rate)*divisor);		
		error := abs((baud_final/baud_target)-1.0);

		ASSERT not(error > err_max) REPORT "Final baudrate diverts more than allowed by: C_PL_MAX_BAUD_RATE_ERR!" SEVERITY failure;
		
		return sample_rate;
	end sample_rate_calc;

	-- number of (baudrate generator) ticks for each bit. MUST BE AN EVEN NUMBER. default = 16
	constant C_TICKS_PR_BIT		: integer := sample_rate_calc(C_UART_CLK_FREQ, C_BAUD_RATE, C_MAX_BAUD_RATE_ERR);

begin

	--------------------------------------------------------------------------
	-- UART with Asynchronous FIFO interface
	--------------------------------------------------------------------------
	uart_asynch_inst : entity work.uart_asynch
		generic map(
			C_ERROR_CNT_WIDTH	=> C_ERROR_CNT_WIDTH,
			C_BIT_TXRX_ORDER	=> C_BIT_TXRX_ORDER,
			C_TICKS_PR_BIT		=> C_TICKS_PR_BIT,
			C_BAUD_RATE_DVSR  => C_BAUD_RATE_DVSR,
			C_RX_FIFO_ADDR_W	=> C_RX_FIFO_ADDR_W,
			C_TX_FIFO_ADDR_W	=> C_TX_FIFO_ADDR_W,
			C_DATABITS 			=> C_DATABITS,
			C_STOPBITS			=> C_STOPBITS,
			C_PARITY				=> C_PARITY,
			C_PRE_SP6_MODE		=> C_PRE_SP6_MODE
		)
		port map( 
			-- common io
			reset_i 				=> reset_i,
			reset_rx_i			=> reset_rx_i,
			reset_tx_i			=> reset_tx_i,
			
			-- uart clock domain io
			uart_clk_i			=> uart_clk_i,
			
			rx_i 					=> rx_i,
			tx_o 					=> tx_o,
			
			-- user logic (fifo+uart status) clock domain io
			user_clk_i			=> user_clk_i,
					
			lsr_o 				=> lsr_o,
			clr_lsr_errors_i	=> clr_lsr_errors_i,
			
			framing_err_cnt_o	=> framing_err_cnt_o,
			parity_err_cnt_o	=> parity_err_cnt_o,
			overrun_err_cnt_o	=> overrun_err_cnt_o,
			clr_err_cnt_i		=> clr_err_cnt_i,
			
			rx_fifo_empty_o 	=> rx_fifo_empty_o,
			rx_fifo_read_i		=> rx_fifo_read_i,
			rx_fifo_data_o 	=> rx_fifo_data_o,
			
			tx_fifo_full_o 	=> tx_fifo_full_o,
			tx_fifo_write_i	=> tx_fifo_write_i,
			tx_fifo_data_i 	=> tx_fifo_data_i
		);
	--------------------------------------------------------------------------

end structural;

