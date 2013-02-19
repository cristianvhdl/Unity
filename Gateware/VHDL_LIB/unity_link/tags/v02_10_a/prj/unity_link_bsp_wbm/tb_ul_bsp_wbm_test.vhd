--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   09:21:23 11/23/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/unity_link/trunk/prj/unity_link_bsp_wbm/tb_ul_bsp_wbm_test.vhd
-- Project Name:  unity_link_bsp_wbm
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: ul_bsp_wbm_test_top
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
use ieee.numeric_std.all;
 
-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;
 
ENTITY tb_ul_bsp_wbm_test IS
END tb_ul_bsp_wbm_test;
 
ARCHITECTURE behavior OF tb_ul_bsp_wbm_test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT ul_bsp_wbm_test_top
    PORT(
         clk_i : IN  std_logic;
         rst_i : IN  std_logic;
         rx_fifo_empty_i : IN  std_logic;
         rx_fifo_read_o : OUT  std_logic;
         rx_fifo_data_i : IN  std_logic_vector(7 downto 0);
         rx_err_i : IN  std_logic_vector(2 downto 0);
         rx_err_clr_o : OUT  std_logic;
         rx_fifo_flush_req_o : OUT  std_logic;
         tx_fifo_full_i : IN  std_logic;
         tx_fifo_write_o : OUT  std_logic;
         tx_fifo_data_o : OUT  std_logic_vector(7 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal rst_i : std_logic := '0';
   signal rx_fifo_empty_i : std_logic := '0';
   signal rx_fifo_data_i : std_logic_vector(7 downto 0) := (others => '0');
   signal rx_err_i : std_logic_vector(2 downto 0) := (others => '0');
   signal tx_fifo_full_i : std_logic := '0';

 	--Outputs
   signal rx_fifo_read_o : std_logic;
   signal rx_err_clr_o : std_logic;
   signal rx_fifo_flush_req_o : std_logic;
   signal tx_fifo_write_o : std_logic;
   signal tx_fifo_data_o : std_logic_vector(7 downto 0);

   -- Clock period definitions
   constant clk_i_period : time := 20 ns;	-- 50MHz
 
	type msg_type is array (0 to 4) of std_logic_vector(7 downto 0);
	constant msg : msg_type := (x"23", x"52", x"4C", X"43", x"0A"); --#RLC\n
	
	signal msg_ptr : unsigned(7 downto 0) := (others=>'0');
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: ul_bsp_wbm_test_top PORT MAP (
          clk_i => clk_i,
          rst_i => rst_i,
          rx_fifo_empty_i => rx_fifo_empty_i,
          rx_fifo_read_o => rx_fifo_read_o,
          rx_fifo_data_i => rx_fifo_data_i,
          rx_err_i => rx_err_i,
          rx_err_clr_o => rx_err_clr_o,
          rx_fifo_flush_req_o => rx_fifo_flush_req_o,
          tx_fifo_full_i => tx_fifo_full_i,
          tx_fifo_write_o => tx_fifo_write_o,
          tx_fifo_data_o => tx_fifo_data_o
        );

   -- Clock process definitions
   clk_i_process :process
   begin
		clk_i <= '0';
		wait for clk_i_period/2;
		clk_i <= '1';
		wait for clk_i_period/2;
   end process;
 
	tx_fifo_full_i <= '0';	

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		rst_i <= '1';
      wait for 100 ns;	
		rst_i <= '0';
		
      wait for clk_i_period*10;

      -- insert stimulus here	
		
		
      wait;
   end process;
	
	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if rst_i='1' then
				rx_fifo_empty_i <= '1';
				msg_ptr <= (others=>'0');
			else
				if msg_ptr < 5 then
					rx_fifo_empty_i <= '0';
					rx_fifo_data_i <= msg(to_integer(msg_ptr));
					if rx_fifo_read_o='1' then
						msg_ptr <= msg_ptr+1;
					end if;
				else
					rx_fifo_empty_i <= '1';
				end if;
			end if;
		end if;		
	end process;

END;
