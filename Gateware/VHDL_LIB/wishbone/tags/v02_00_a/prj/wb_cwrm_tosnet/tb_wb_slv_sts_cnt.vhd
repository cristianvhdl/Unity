--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   13:20:50 05/10/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/wishbone/prj/wb_cwrm_tosnet/tb_wb_slv_sts_cnt.vhd
-- Project Name:  wb_cwrm_tosnet
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: wb_slv_cwrn_tosnet_ctrl
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
use work.wb_classic_interface.all;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;
 
ENTITY tb_wb_slv_sts_cnt IS
END tb_wb_slv_sts_cnt;
 
ARCHITECTURE behavior OF tb_wb_slv_sts_cnt IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT wb_slv_cwrn_tosnet_ctrl
    PORT(
         clk_i : IN  std_logic;
         rst_i : IN  std_logic;
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
         status_register_i : IN  std_logic_vector(31 downto 0);
         packet_counter_i : IN  std_logic_vector(31 downto 0);
         reset_counter_i : IN  std_logic_vector(31 downto 0);
         error_counter_i : IN  std_logic_vector(31 downto 0);
         data_reg_ctr_o : OUT  std_logic_vector(1 downto 0);
         data_reg_ctr_we_o : OUT  std_logic;
         data_reg_addr_o : OUT  std_logic_vector(9 downto 0);
         data_reg_data_o : OUT  std_logic_vector(31 downto 0);
         data_reg_data_i : IN  std_logic_vector(31 downto 0);
         data_reg_re_o : OUT  std_logic;
         data_reg_r_ack_i : IN  std_logic;
         data_reg_r_err_i : IN  std_logic;
         data_reg_we_o : OUT  std_logic;
         data_reg_w_ack_i : IN  std_logic;
         data_reg_w_err_i : IN  std_logic;
         netwrk_reg_addr_o : OUT  std_logic_vector(3 downto 0);
         netwrk_reg_data_i : IN  std_logic_vector(31 downto 0);
         async_tx_str_i : IN  std_logic_vector(6 downto 0);
         async_tx_ctr_o : OUT  std_logic_vector(5 downto 0);
         async_tx_ctr_we_o : OUT  std_logic;
         async_tx_data_o : OUT  std_logic_vector(31 downto 0);
         async_tx_data_we_o : OUT  std_logic;
         async_rx_str_i : IN  std_logic_vector(7 downto 0);
         async_rx_data_i : IN  std_logic_vector(31 downto 0);
         async_rx_data_re_o : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal rst_i : std_logic := '0';
	signal wb_i  : wb_ad32sb_if := ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');		
   signal status_register_i : std_logic_vector(31 downto 0) := x"DEADBEEF";
   signal packet_counter_i : std_logic_vector(31 downto 0) :=  x"CAFFE101";
   signal reset_counter_i : std_logic_vector(31 downto 0) :=   x"FAA00000";
   signal error_counter_i : std_logic_vector(31 downto 0) :=   x"BEEBBEEB";
   signal data_reg_data_i : std_logic_vector(31 downto 0) := (others => '0');
   signal data_reg_r_ack_i : std_logic := '0';
   signal data_reg_r_err_i : std_logic := '0';
   signal data_reg_w_ack_i : std_logic := '0';
   signal data_reg_w_err_i : std_logic := '0';
   signal netwrk_reg_data_i : std_logic_vector(31 downto 0) := (others => '0');
   signal async_tx_str_i : std_logic_vector(6 downto 0) := (others => '0');
   signal async_rx_str_i : std_logic_vector(7 downto 0) := (others => '0');
   signal async_rx_data_i : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
	signal wb_o : wb_d32ae_if;	
   signal data_reg_ctr_o : std_logic_vector(1 downto 0);
   signal data_reg_ctr_we_o : std_logic;
   signal data_reg_addr_o : std_logic_vector(9 downto 0);
   signal data_reg_data_o : std_logic_vector(31 downto 0);
   signal data_reg_re_o : std_logic;
   signal data_reg_we_o : std_logic;
   signal netwrk_reg_addr_o : std_logic_vector(3 downto 0);
   signal async_tx_ctr_o : std_logic_vector(5 downto 0);
   signal async_tx_ctr_we_o : std_logic;
   signal async_tx_data_o : std_logic_vector(31 downto 0);
   signal async_tx_data_we_o : std_logic;
   signal async_rx_data_re_o : std_logic;

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: wb_slv_cwrn_tosnet_ctrl PORT MAP (
          clk_i => clk_i,
          rst_i => rst_i,
          wb_i => wb_i,
          wb_o => wb_o,
          status_register_i => status_register_i,
          packet_counter_i => packet_counter_i,
          reset_counter_i => reset_counter_i,
          error_counter_i => error_counter_i,
          data_reg_ctr_o => data_reg_ctr_o,
          data_reg_ctr_we_o => data_reg_ctr_we_o,
          data_reg_addr_o => data_reg_addr_o,
          data_reg_data_o => data_reg_data_o,
          data_reg_data_i => data_reg_data_i,
          data_reg_re_o => data_reg_re_o,
          data_reg_r_ack_i => data_reg_r_ack_i,
          data_reg_r_err_i => data_reg_r_err_i,
          data_reg_we_o => data_reg_we_o,
          data_reg_w_ack_i => data_reg_w_ack_i,
          data_reg_w_err_i => data_reg_w_err_i,
          netwrk_reg_addr_o => netwrk_reg_addr_o,
          netwrk_reg_data_i => netwrk_reg_data_i,
          async_tx_str_i => async_tx_str_i,
          async_tx_ctr_o => async_tx_ctr_o,
          async_tx_ctr_we_o => async_tx_ctr_we_o,
          async_tx_data_o => async_tx_data_o,
          async_tx_data_we_o => async_tx_data_we_o,
          async_rx_str_i => async_rx_str_i,
          async_rx_data_i => async_rx_data_i,
          async_rx_data_re_o => async_rx_data_re_o
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
      wait for 100 ns;	

      wait for clk_i_period*10;

      -- insert stimulus here 
		
			wait for 6 ns;
		
			-- read status register
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.adr <= x"00000400";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*5;
			
			-- read packet counter
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.adr <= x"00000401";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');			
			wait for clk_i_period*5;
			
			-- read reset counter
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.adr <= x"00000402";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*5;
			
			-- read error counter
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.adr <= x"00000403";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*5;
			
			-- write status register
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.we  <= '1';
			wb_i.adr <= x"00000400";
			wb_i.dat <= x"FFFFFFFF";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*5;
			
			-- write packet counter
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.we  <= '1';
			wb_i.adr <= x"00000401";
			wb_i.dat <= x"FFFFFFFF";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');			
			wait for clk_i_period*5;
			
			-- write reset counter
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.we  <= '1';
			wb_i.adr <= x"00000402";
			wb_i.dat <= x"FFFFFFFF";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');			
			wait for clk_i_period*5;
			
			-- write error counter
			wb_i.cyc <= '1';
			wb_i.stb <= '1';
			wb_i.we  <= '1';
			wb_i.adr <= x"00000403";
			wb_i.dat <= x"FFFFFFFF";
			wb_i.sgl <= '1';
			
			wait until wb_o.ack='1' or wb_o.err='1';
			wait for clk_i_period;
			wb_i  <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');			
			wait for clk_i_period*5;		

      wait;
   end process;

END;
