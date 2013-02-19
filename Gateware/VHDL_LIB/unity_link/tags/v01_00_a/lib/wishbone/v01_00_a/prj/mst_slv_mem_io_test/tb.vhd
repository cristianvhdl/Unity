--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   14:23:50 04/03/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/wishbone/prj/mst_slv_mem_io_test/tb.vhd
-- Project Name:  mst_slv_mem_io_test
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: mst_slv_mem_io_test_top
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
 
ENTITY tb IS
END tb;
 
ARCHITECTURE behavior OF tb IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT mst_slv_mem_io_test_top
    PORT(
         clk_i : IN  std_logic;
         rst_i : IN  std_logic;
         en_i : IN  std_logic;
         we_i : IN  std_logic;
         blk_i : IN  std_logic;
         nxt_i : IN  std_logic;
         adr_i : IN  std_logic_vector(5 downto 0);
         dat_i : IN  std_logic_vector(31 downto 0);
         dat_o : OUT  std_logic_vector(31 downto 0);
         done_o : OUT  std_logic;
         err_o : OUT  std_logic;
         led_o : OUT  std_logic_vector(6 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal rst_i : std_logic := '0';
   signal en_i : std_logic := '0';
   signal we_i : std_logic := '0';
   signal blk_i : std_logic := '0';
   signal nxt_i : std_logic := '0';
   signal adr_i : std_logic_vector(5 downto 0) := (others => '0');
   signal dat_i : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal dat_o : std_logic_vector(31 downto 0);
   signal done_o : std_logic;
   signal err_o : std_logic;
   signal led_o : std_logic_vector(6 downto 0);

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: mst_slv_mem_io_test_top PORT MAP (
          clk_i => clk_i,
          rst_i => rst_i,
          en_i => en_i,
          we_i => we_i,
          blk_i => blk_i,
          nxt_i => nxt_i,
          adr_i => adr_i,
          dat_i => dat_i,
          dat_o => dat_o,
          done_o => done_o,
          err_o => err_o,
          led_o => led_o
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
		rst_i <= '1';
      wait for 100 ns;	
		rst_i <= '0';
		
      wait for clk_i_period*10;

      -- insert stimulus here 
		en_i <= '1';
		we_i <= '1';
		adr_i <= "000000";
		dat_i <= x"0000001a";
		wait for clk_i_period*2;
		en_i <= '0';
		we_i <= '0';
		wait for clk_i_period*2;
		en_i <= '1';
		we_i <= '1';
		adr_i <= "000100";
		dat_i <= x"0000001a";	
		wait for clk_i_period*15;
		en_i <= '0';
		we_i <= '0';
		adr_i <= "000000";
		dat_i <= x"00000000";
		wait for clk_i_period*2;
		
		en_i <= '1';
		we_i <= '1';
		blk_i <= '1';
		nxt_i <= '1';
		adr_i <= "000100";
		dat_i <= x"000000a1";
		wait until done_o='1';wait for clk_i_period;
		dat_i <= x"000000a2";
		wait until done_o='1';wait for clk_i_period;
		dat_i <= x"000000a3";
		wait until done_o='1';wait for clk_i_period;
		nxt_i <= '0';
		dat_i <= x"000000a4";
		wait until done_o='1';wait for clk_i_period;
		en_i <= '0';
		we_i <= '0';
		blk_i <= '0';
		adr_i <= "000000";
		dat_i <= x"00000000";
		
		wait for clk_i_period*2;
		
		en_i <= '1';
		we_i <= '1';
		blk_i <= '1';
		nxt_i <= '1';
		adr_i <= "000100";
		dat_i <= x"000000a1";
		wait until done_o='1';wait for clk_i_period;
		adr_i <= "000101";
		dat_i <= x"000000a2";
		wait until done_o='1';wait for clk_i_period;
		adr_i <= "000110";
		dat_i <= x"000000a3";
		wait until done_o='1';wait for clk_i_period;
		nxt_i <= '0';
		adr_i <= "000111";
		dat_i <= x"000000a4";
		wait until done_o='1';wait for clk_i_period;
		en_i <= '0';
		we_i <= '0';
		blk_i <= '0';
		adr_i <= "000000";
		dat_i <= x"00000000";		
		
		wait for clk_i_period*2;
		
		en_i <= '1';
		we_i <= '0';
		blk_i <= '1';
		nxt_i <= '1';
		adr_i <= "000100";
		wait until done_o='1';wait for clk_i_period;
		adr_i <= "000101";
		wait until done_o='1';wait for clk_i_period;
		adr_i <= "000110";
		wait until done_o='1';wait for clk_i_period;
		nxt_i <= '0';
		adr_i <= "000111";
		wait until done_o='1';wait for clk_i_period;
		en_i <= '0';
		we_i <= '0';
		blk_i <= '0';
		adr_i <= "000000";
		dat_i <= x"00000000";

		wait for clk_i_period*2;		
		en_i <= '1';
		we_i <= '0';
		adr_i <= "000100";
		wait until done_o='1';wait for clk_i_period;
		adr_i <= "000101";
		wait until done_o='1';wait for clk_i_period;
		adr_i <= "000110";
		wait until done_o='1';wait for clk_i_period;
		adr_i <= "000111";
		wait until done_o='1';wait for clk_i_period;
		en_i <= '0';
		we_i <= '0';
		blk_i <= '0';
		adr_i <= "000000";
		dat_i <= x"00000000";
		
      wait;
   end process;

END;
