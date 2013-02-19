--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   13:48:33 12/30/2011
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/checksum/prj/tb_crc.vhd
-- Project Name:  checksum
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: checksum
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
 
ENTITY tb_crc IS
END tb_crc;
 
ARCHITECTURE behavior OF tb_crc IS  

   --Inputs
   signal clk_i : std_logic := '0';
   signal reset_i : std_logic := '0';
   signal data_vld_i : std_logic := '0';
   signal data_i : std_logic_vector(7 downto 0) := (others => '0');

 	--Outputs
   signal chks_o : std_logic_vector(7 downto 0);
   signal chks_vld_o : std_logic;

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
	constant data : std_logic_vector(39 downto 0) := "0010010110100010110011110011010100000000"; -- crc = 10111011
	--constant data : std_logic_vector(39 downto 0) := "0010010110100010110011110011010110111011"; -- crc = 00000000 
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut : entity work.checksum(crc)
	PORT MAP (
          clk_i => clk_i,
          reset_i => reset_i,
          data_vld_i => data_vld_i,
          data_i => data_i,
          chks_o => chks_o,
          chks_vld_o => chks_vld_o
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
		data_vld_i <= '1';
		data_i <= data(39 downto 32);
		wait for clk_i_period;
		data_vld_i <= '0';
		wait for clk_i_period*10;
		data_vld_i <= '1';
		data_i <= data(31 downto 24);
		wait for clk_i_period;
		data_i <= data(23 downto 16);
		wait for clk_i_period;
		data_i <= data(15 downto 8);
		wait for clk_i_period;		
		data_i <= data(7 downto 0);
		wait for clk_i_period;	
		data_vld_i <= '0';

      wait;
   end process;

END;
