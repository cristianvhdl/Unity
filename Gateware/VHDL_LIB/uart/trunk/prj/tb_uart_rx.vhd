--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   09:37:12 12/22/2011
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/Components/uart/prj/tb_uart_rx.vhd
-- Project Name:  uart
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: uart_rx
-- 
-- Dependencies:
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
--
-- Notes: 
-- This testbench has been automatically generated using types std_logic and
-- std_logic_vector for the ports of the unit under test.  Xilinx recommends
-- that these types always be used for the top-level I/O of a design in order
-- to guarantee that the testbench will bind correctly to the post-implementation 
-- simulation model.
--------------------------------------------------------------------------------
LIBRARY ieee;
USE ieee.std_logic_1164.ALL;
 
-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;
 
ENTITY tb_uart_rx IS
END tb_uart_rx;
 
ARCHITECTURE behavior OF tb_uart_rx IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT uart_rx
    PORT(
         clk_i : IN  std_logic;
         reset_i : IN  std_logic;
         tick_i : IN  std_logic;
         rx_i : IN  std_logic;
         rx_done_tick_o : OUT  std_logic;
         p_err_tick_o : OUT  std_logic;
         f_err_tick_o : OUT  std_logic;
         data_o : OUT  std_logic_vector(7 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal reset_i : std_logic := '0';
   signal tick_i : std_logic := '0';
   signal rx_i : std_logic := '0';

 	--Outputs
   signal rx_done_tick_o : std_logic;
   signal p_err_tick_o : std_logic;
   signal f_err_tick_o : std_logic;
   signal data_o : std_logic_vector(7 downto 0);

   -- Clock period definitions
   constant clk_i_period : time := 5 ns;
 
	signal tx : std_logic := '0';
	
	--signal data : std_logic_vector(9 downto 0) := "0101010101";	-- data 10101010, no parity, one stop bit
	
	--signal data : std_logic_vector(10 downto 0) := "01010101001";	-- data 10101010, even parity (0), one stop bit
	--signal data : std_logic_vector(10 downto 0) := "01010101011";	-- data 10101010, even parity (0), one stop bit
	
	signal data : std_logic_vector(10 downto 0) := "01010101011";	-- data 10101010, odd parity (1), one stop bit
	--signal data : std_logic_vector(10 downto 0) := "01010101001";	-- data 10101010, odd parity (1), one stop bit
	--signal data : std_logic_vector(10 downto 0) := "01010101010";	-- data 10101010, odd parity (1), one stop bit
	
	--signal data : std_logic_vector(11 downto 0) := "010101010111";	-- data 10101010, odd parity (1), two stop bits
	--signal data : std_logic_vector(11 downto 0) := "010101010011";	-- data 10101010, odd parity (1), two stop bits
	--signal data : std_logic_vector(11 downto 0) := "010101010110";	-- data 10101010, odd parity (1), two stop bits
	--signal data : std_logic_vector(11 downto 0) := "010101010101";	-- data 10101010, odd parity (1), two stop bits
	--signal data : std_logic_vector(11 downto 0) := "010101010100";	-- data 10101010, odd parity (1), two stop bits
	--signal data : std_logic_vector(11 downto 0) := "010101010000";	-- data 10101010, odd parity (1), two stop bits
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: uart_rx PORT MAP (
          clk_i => clk_i,
          reset_i => reset_i,
          tick_i => tick_i,
          rx_i => rx_i,
          rx_done_tick_o => rx_done_tick_o,
          p_err_tick_o => p_err_tick_o,
          f_err_tick_o => f_err_tick_o,
          data_o => data_o
        );

   -- Clock process definitions
   clk_i_process :process
   begin
		clk_i <= '0';
		wait for clk_i_period/2;
		clk_i <= '1';
		wait for clk_i_period/2;
   end process;
 
   tick_gen_prc : process(clk_i)
   begin
		if rising_edge(clk_i) then
			tick_i <= not tick_i;
		end if;
   end process;
	
	tx_prc : process(clk_i)
		variable t_cnt : integer := 0;
	begin
		if rising_edge(clk_i) and tx='1' and tick_i='1' then
			t_cnt := t_cnt+1;
			rx_i <= data(data'high);
			if t_cnt=15 then
				t_cnt:=0;
				data <= data(data'high-1 downto 0) & '0';
			end if;
		end if;
	end process;

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		reset_i <= '1';
      wait for 100 ns;	
		reset_i <= '0';
      wait for clk_i_period*10;

      -- insert stimulus here 
		tx <= '1';
		
      wait;
   end process;

END;
