--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   10:59:16 12/21/2011
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/Components/uart/prj/tb_uart_tx.vhd
-- Project Name:  uart
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: uart_tx
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
 
ENTITY tb_uart_tx IS
END tb_uart_tx;
 
ARCHITECTURE behavior OF tb_uart_tx IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT uart_tx
    PORT(
         clk_i : IN  std_logic;
         reset_i : IN  std_logic;
         tx_start_i : IN  std_logic;
         tick_i : IN  std_logic;
         data_i : IN  std_logic_vector(7 downto 0);
         tx_done_tick_o : OUT  std_logic;
         tx_o : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal reset_i : std_logic := '0';
   signal tx_start_i : std_logic := '0';
   signal tick_i : std_logic := '0';
   signal data_i : std_logic_vector(7 downto 0) := (others => '0');

 	--Outputs
   signal tx_done_tick_o : std_logic;
   signal tx_o : std_logic;

   -- Clock period definitions
   constant clk_i_period : time := 5 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: uart_tx PORT MAP (
          clk_i => clk_i,
          reset_i => reset_i,
          tx_start_i => tx_start_i,
          tick_i => tick_i,
          data_i => data_i,
          tx_done_tick_o => tx_done_tick_o,
          tx_o => tx_o
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

   -- Stimulus process
   stim_proc: process
   begin			
      -- hold reset state for 100 ns.
		reset_i <= '1';
      wait for 100 ns;	
		reset_i <= '0';
      wait for clk_i_period*10;

      -- insert stimulus here 
		data_i <= "01010111"; -- paritybit = 0
		tx_start_i <= '1';
		wait for clk_i_period;
		data_i <= "00000000";
		tx_start_i <= '0';
		
		wait until tx_done_tick_o='1';
		wait for clk_i_period;
		
		data_i <= "11010100";	-- paritybit = 1
		tx_start_i <= '1';
		wait for clk_i_period;
		data_i <= "00000000";
		tx_start_i <= '0';

      wait;
   end process;

END;
