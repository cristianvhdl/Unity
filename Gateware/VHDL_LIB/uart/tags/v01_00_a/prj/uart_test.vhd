----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    08:56:38 12/23/2011 
-- Design Name: 
-- Module Name:    uart_test - structural 
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
library ieee;
use ieee.std_logic_1164.all;

entity uart_test is
	port ( 
		clk_200M_i : in  std_logic;
      rx_i  : in  std_logic;
      tx_o  : out std_logic;
		led_o : out std_logic_vector(6 downto 0)
		);
end uart_test;

architecture structural of uart_test is

	signal clk_i : std_logic;

	signal lsr : std_logic_vector (7 downto 0);
	
	signal data : std_logic_vector (7 downto 0);
	signal rx_empty : std_logic;
	signal wr_tx : std_logic;
	signal rd_rx : std_logic;
	
begin

	clk_gen_inst : entity work.clk_gen
		port map(	
			-- Clock in ports
			CLK_IN1 => clk_200M_i,
			-- Clock out ports
			CLK_OUT1 => clk_i
			);	

	uart_inst : entity work.uart
		generic map(
			C_ERROR_CNT_WIDTH	=> 8,		-- Bitwidth of the rrror counters (0 = counters disabled)
			C_BIT_TXRX_ORDER	=> 0,		-- databit tx/rx order: 0 = LSB, 1 = MSB		
			C_TICKS_PR_BIT		=> 16,	-- number of (baudrate generator) ticks for each bit. MUST BE AN EVEN NUMBER. default = 16
			C_BAUD_RATE_DVSR  => 2,		-- BAUD rate divisor: C_BAUD_RATE_DVSR = clk_frq/(C_TICKS_PR_BIT*baud_rate)
			C_RX_FIFO_ADDR_W	=> 4,		-- rx fifo depth = 2**C_RX_FIFO_ADDR_W
			C_TX_FIFO_ADDR_W	=> 4,		-- tx fifo depth = 2**C_TX_FIFO_ADDR_W
			C_DATABITS 			=> 8,		-- number of databits
			C_STOPBITS			=> 1,		-- number of stopbits
			C_PARITY				=> 1 		-- parity mode: 0 = NONE, 1 = ODD, 2 = EVEN, 3 = MARK, 4 = SPACE
		)
		port map( 
			clk_i 				=> clk_i,
			reset_i 				=> '0',
			
			lsr_o 				=> lsr,
			clr_lsr_errors_i	=> '0',
			
			framing_err_cnt_o	=> open,
			parity_err_cnt_o	=> open,
			overrun_err_cnt_o	=> open,
			clr_err_cnt_i		=> "000",

			rx_i 					=> rx_i,
			tx_o 					=> tx_o,
			
			rx_fifo_empty_o 	=> rx_empty,
			rx_fifo_read_i		=> rd_rx,	
			rx_fifo_data_o 	=> data,
			
			tx_fifo_full_o 	=> led_o(6),
			tx_fifo_write_i	=> wr_tx,
			tx_fifo_data_i 	=> data
			);
			
		wr_tx <= not rx_empty;
		rd_rx <= not rx_empty;
		
		led_o(5) <= lsr(5);  --		Bit 5	Rx data framing Error
		led_o(4) <= lsr(4);  --		Bit 4	Rx data parity Error
		led_o(3) <= lsr(3);  --		Bit 3	Rx data overrun Error
		led_o(2) <= lsr(2);  --		Bit 2	RxFIFO full (overrun eminent!)
		led_o(1) <= lsr(1);  --		Bit 1	Data Ready in the RxFiFO
		led_o(0) <= lsr(0);	--		Bit 0	Receiving (Rx) data

end structural;

