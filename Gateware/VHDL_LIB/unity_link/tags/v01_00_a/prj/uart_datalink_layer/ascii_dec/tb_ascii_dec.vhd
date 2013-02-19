--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   17:03:32 03/16/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/decoder/prj/ascii_dev_v2/tb_ascii_dec_v2.vhd
-- Project Name:  ascii_dev_v2
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: qne_link_dll_ascii_dec
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
 
ENTITY tb_ascii_dec IS
END tb_ascii_dec;
 
ARCHITECTURE behavior OF tb_ascii_dec IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT uart_unity_link_dl_ascii_dec
    PORT(
         clk_i : IN  std_logic;
         reset_i : IN  std_logic;
         ascii_vld_i : IN  std_logic;
         ascii_rd_o : OUT  std_logic;
         ascii_i : IN  std_logic_vector(7 downto 0);
         bin_vld_o : OUT  std_logic;
         bin_pc_o : OUT  std_logic;
         bin_ac_o : OUT  std_logic;
         bin_ad_o : OUT  std_logic;
         bin_o : OUT  std_logic_vector(7 downto 0);
         bin_rd_i : IN  std_logic;
         st_rd_ac : IN  std_logic;
         st_rd_ad : IN  std_logic;
         clr_err_i : IN  std_logic;
         err_invd_o : OUT  std_logic;
         err_mdb_o : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal reset_i : std_logic := '0';
   signal ascii_vld_i : std_logic := '0';
   signal ascii_i : std_logic_vector(7 downto 0) := (others => '0');
   signal bin_rd_i : std_logic := '0';
   signal st_rd_ac : std_logic := '0';
   signal st_rd_ad : std_logic := '0';
   signal clr_err_i : std_logic := '0';

 	--Outputs
   signal ascii_rd_o : std_logic;
   signal bin_vld_o : std_logic;
   signal bin_pc_o : std_logic;
   signal bin_ac_o : std_logic;
   signal bin_ad_o : std_logic;
   signal bin_o : std_logic_vector(7 downto 0);
   signal err_invd_o : std_logic;
   signal err_mdb_o : std_logic;

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: uart_unity_link_dl_ascii_dec PORT MAP (
          clk_i => clk_i,
          reset_i => reset_i,
          ascii_vld_i => ascii_vld_i,
          ascii_rd_o => ascii_rd_o,
          ascii_i => ascii_i,
          bin_vld_o => bin_vld_o,
          bin_pc_o => bin_pc_o,
          bin_ac_o => bin_ac_o,
          bin_ad_o => bin_ad_o,
          bin_o => bin_o,
          bin_rd_i => bin_rd_i,
          st_rd_ac => st_rd_ac,
          st_rd_ad => st_rd_ad,
          clr_err_i => clr_err_i,
          err_invd_o => err_invd_o,
          err_mdb_o => err_mdb_o
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
		
		-----------------------------------
		-- 1	MUST WORK (OK)
		st_rd_ad <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"30";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		ascii_i <= X"31";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		st_rd_ad <= '0';
		bin_rd_i <= '1';
		wait for clk_i_period;
		bin_rd_i <= '0';
		
		-----------------------------------
		-- 1		MUST FAIL (OK)
		wait for clk_i_period;
		st_rd_ac <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"30";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
--		ascii_i <= X"31";		
--		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		clr_err_i <= '1';
		wait for clk_i_period;
		clr_err_i <= '0';
		st_rd_ac <= '0';
		
		-----------------------------------
		-- 170 (0xaa)	MUST WORK (OK)
		st_rd_ad <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"61";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		ascii_i <= X"61";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		st_rd_ad <= '0';
		bin_rd_i <= '1';
		wait for clk_i_period;
		bin_rd_i <= '0';
		
		-----------------------------------
		-- 97 (0xa)	MUST WORK (OK)
		wait for clk_i_period;
		st_rd_ac <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"61";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
--		ascii_i <= X"61";		
--		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		st_rd_ac <= '0';
		bin_rd_i <= '1';
		wait for clk_i_period;
		bin_rd_i <= '0';
		
		-----------------------------------
		-- , (0x2C) MUST WORK (OK)
		wait for clk_i_period;
		st_rd_ad <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"2C";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
--		ascii_i <= X"61";		
--		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		st_rd_ad <= '0';
		bin_rd_i <= '1';
		wait for clk_i_period;
		bin_rd_i <= '0';		
		
		-----------------------------------
		-- , MUST WORK (OK)
		wait for clk_i_period;
		st_rd_ac <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"2C";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
--		ascii_i <= X"61";		
--		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		st_rd_ac <= '0';
		bin_rd_i <= '1';
		wait for clk_i_period;
		bin_rd_i <= '0';			
		
		-----------------------------------
		-- 10,	MUST FAIL (?)
		st_rd_ad <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"61";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		ascii_i <= X"2C";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		st_rd_ad <= '0';
		wait for clk_i_period;
		clr_err_i <= '1';
		wait for clk_i_period;
		clr_err_i <= '0';
		
		-----------------------------------
		-- 10*	MUST FAIL (?)
		st_rd_ad <= '1';
		ascii_vld_i <= '1';		
		ascii_i <= X"61";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		ascii_i <= X"2A";		
		wait until ascii_rd_o='1';
		wait for clk_i_period;
		wait for clk_i_period;
		ascii_vld_i <= '0';
		st_rd_ad <= '0';
		wait for clk_i_period;
		clr_err_i <= '1';
		wait for clk_i_period;
		clr_err_i <= '0';		
		
      wait;
   end process;

END;
