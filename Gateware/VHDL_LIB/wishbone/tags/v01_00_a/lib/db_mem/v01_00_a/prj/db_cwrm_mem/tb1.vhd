--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   13:06:06 03/12/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/double_buffered_memory/prj/db_cwrm_mem/tb1.vhd
-- Project Name:  db_cwrm_mem
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: db_cwrm_mem
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
--
-- TB1: 
--			Master write data
--				master read (success)
--					slave read (fail)
--						master cw
--							master read (fail)
--								slave read (success)
--
--------------------------------------------------------------------------------
LIBRARY ieee;
USE ieee.std_logic_1164.ALL;
 
-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;
 
ENTITY tb1 IS
END tb1;
 
ARCHITECTURE behavior OF tb1 IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT db_cwrm_mem
    PORT(
         clk_i : IN  std_logic;
         reset_i : IN  std_logic;
         m_ctr_i : IN  std_logic_vector(1 downto 0);
         m_ctr_we_i : IN  std_logic;
         m_str_o : OUT  std_logic_vector(7 downto 0);
         m_adr_i : IN  std_logic_vector(9 downto 0);
         m_data_i : IN  std_logic_vector(31 downto 0);
         m_we_i : IN  std_logic;
			m_w_ack_o : OUT std_logic;
			m_w_err_o : OUT std_logic;
			m_sel_i	: IN  std_logic_vector (3 downto 0);
         m_data_o : OUT  std_logic_vector(31 downto 0);
         s_ctr_i : IN  std_logic_vector(1 downto 0);
         s_ctr_we_i : IN  std_logic;
         s_str_o : OUT  std_logic_vector(7 downto 0);
         s_adr_i : IN  std_logic_vector(9 downto 0);
         s_data_i : IN  std_logic_vector(31 downto 0);
         s_we_i : IN  std_logic;
			s_w_ack_o : OUT std_logic;
			s_w_err_o : OUT std_logic;
			s_sel_i	: IN  std_logic_vector (3 downto 0);
         s_data_o : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal reset_i : std_logic := '0';
   signal m_ctr_i : std_logic_vector(1 downto 0) := (others => '0');
   signal m_ctr_we_i : std_logic := '0';
   signal m_adr_i : std_logic_vector(9 downto 0) := (others => '0');
   signal m_data_i : std_logic_vector(31 downto 0) := (others => '0');
   signal m_we_i : std_logic := '0';
	signal m_sel_i	:  std_logic_vector (3 downto 0) := (others => '0');
   signal s_ctr_i : std_logic_vector(1 downto 0) := (others => '0');
   signal s_ctr_we_i : std_logic := '0';
   signal s_adr_i : std_logic_vector(9 downto 0) := (others => '0');
   signal s_data_i : std_logic_vector(31 downto 0) := (others => '0');
   signal s_we_i : std_logic := '0';
	signal s_sel_i	:  std_logic_vector (3 downto 0) := (others => '0');

 	--Outputs
   signal m_str_o : std_logic_vector(7 downto 0);
   signal m_data_o : std_logic_vector(31 downto 0);
   signal s_str_o : std_logic_vector(7 downto 0);
   signal s_data_o : std_logic_vector(31 downto 0);
	signal m_w_ack_o : std_logic;
	signal m_w_err_o : std_logic;
	signal s_w_ack_o : std_logic;
	signal s_w_err_o : std_logic;

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: db_cwrm_mem PORT MAP (
          clk_i => clk_i,
          reset_i => reset_i,
          m_ctr_i => m_ctr_i,
          m_ctr_we_i => m_ctr_we_i,
          m_str_o => m_str_o,
          m_adr_i => m_adr_i,
          m_data_i => m_data_i,
          m_we_i => m_we_i,
			 m_w_ack_o => m_w_ack_o,
			 m_w_err_o => m_w_err_o,
			 m_sel_i => m_sel_i,
          m_data_o => m_data_o,
          s_ctr_i => s_ctr_i,
          s_ctr_we_i => s_ctr_we_i,
          s_str_o => s_str_o,
          s_adr_i => s_adr_i,
          s_data_i => s_data_i,
          s_we_i => s_we_i,
			 s_w_ack_o => s_w_ack_o,
			 s_w_err_o => s_w_err_o,			 
			 s_sel_i => s_sel_i,
          s_data_o => s_data_o
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
		m_sel_i <= "1111";
		s_sel_i <= "1111";
		
		-- master writes data
		m_adr_i <= "0000000100";
		m_data_i <= x"00000001";
		m_we_i <= '1';
		wait for clk_i_period;
		m_adr_i <= "0000000101";
		m_data_i <= x"00000011";
		m_we_i <= '1';		
		wait for clk_i_period;
		m_adr_i <= "0000000110";
		m_data_i <= x"00000111";
		m_we_i <= '1';
		wait for clk_i_period;
		m_we_i <= '0';
		
		-- master reads data
		m_adr_i <= "0000000100";
		wait for clk_i_period*2;
		m_adr_i <= "0000000101";
		wait for clk_i_period*2;
		m_adr_i <= "0000000110";
		wait for clk_i_period*2;		
		
		-- slave reads data
		s_adr_i <= "0000000100";
		wait for clk_i_period*2;
		s_adr_i <= "0000000101";
		wait for clk_i_period*2;
		s_adr_i <= "0000000110";
		wait for clk_i_period*2;
		s_adr_i <= "0000000000";
		
		-- master commits data
		m_ctr_i <= "01";
		m_ctr_we_i <= '1';
		wait for clk_i_period;
		m_ctr_we_i <= '0';
		m_ctr_i <= "00";
		wait for clk_i_period;		
		
		-- master reads data
		m_adr_i <= "0000000100";
		wait for clk_i_period*2;
		m_adr_i <= "0000000101";
		wait for clk_i_period*2;
		m_adr_i <= "0000000110";
		wait for clk_i_period*2;		
		
		-- slave reads data
		s_adr_i <= "0000000100";
		wait for clk_i_period*2;
		s_adr_i <= "0000000101";
		wait for clk_i_period*2;
		s_adr_i <= "0000000110";
		wait for clk_i_period*2;
		s_adr_i <= "0000000000";

      wait;
   end process;

END;
