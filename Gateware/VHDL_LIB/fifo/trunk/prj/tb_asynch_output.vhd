--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   16:00:30 01/02/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/fifo/prj/tb_asynch_output.vhd
-- Project Name:  fifo
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: fifo
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
 
ENTITY tb_asynch_output IS
END tb_asynch_output;
 
ARCHITECTURE behavior OF tb_asynch_output IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT fifo
    PORT(
         clk_i : IN  std_logic;
         clkw_asynch_i : IN  std_logic;
         wr_i : IN  std_logic;
         data_in_i : IN  std_logic_vector(7 downto 0);
         wr_ack_o : OUT  std_logic;
         full_o : OUT  std_logic;
         clkr_asynch_i : IN  std_logic;
         rd_i : IN  std_logic;
         data_out_o : OUT  std_logic_vector(7 downto 0);
         empty_o : OUT  std_logic;
         reset_i : IN  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal clkw_asynch_i : std_logic := '0';
   signal wr_i : std_logic := '0';
   signal data_in_i : std_logic_vector(7 downto 0) := (others => '0');
   signal clkr_asynch_i : std_logic := '0';
   signal rd_i : std_logic := '0';
   signal reset_i : std_logic := '0';

 	--Outputs
   signal wr_ack_o : std_logic;
   signal full_o : std_logic;
   signal data_out_o : std_logic_vector(7 downto 0);
   signal empty_o : std_logic;

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;   
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: fifo PORT MAP (
          clk_i => clk_i,
          clkw_asynch_i => clkw_asynch_i,
          wr_i => wr_i,
          data_in_i => data_in_i,
          wr_ack_o => wr_ack_o,
          full_o => full_o,
          clkr_asynch_i => clkr_asynch_i,
          rd_i => rd_i,
          data_out_o => data_out_o,
          empty_o => empty_o,
          reset_i => reset_i
        );

   -- Clock process definitions
   clk_i_process :process
   begin
		clk_i <= '0';
		wait for clk_i_period/2;
		clk_i <= '1';
		wait for clk_i_period/2;
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
		wr_i <= '1';
		data_in_i <= x"aa";
		wait for clk_i_period;
		wr_i <= '0';
		data_in_i <= x"00";
		wait for clk_i_period*2;
		wr_i <= '1';
		data_in_i <= x"bb";
		wait for clk_i_period;
		wr_i <= '0';
		data_in_i <= x"00";
		wait for clk_i_period*2;		
		wr_i <= '1';
		data_in_i <= x"cc";
		wait for clk_i_period;		
		wr_i <= '0';
		data_in_i <= x"00";
		
		--wait until empty_o='0';
		wait for clk_i_period*2;
		
		rd_i<='1';
		wait for clk_i_period;
		rd_i<='0';
		wait for clk_i_period*2;

		rd_i<='1';
		wait for clk_i_period;
		rd_i<='0';
		wait for clk_i_period*2;

		rd_i<='1';
		wait for clk_i_period;
		rd_i<='0';
		wait for clk_i_period*2;

		rd_i<='1';
		wait for clk_i_period;
		rd_i<='0';
		wait for clk_i_period*2;		
		
      wait;
   end process;

END;
