--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   16:42:55 05/07/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/ram/prj/ram_true_dp/tb.vhd
-- Project Name:  ram_true_dp
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: ram_tdp_test
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
 
    COMPONENT ram_tdp_test
    PORT(
         clka : IN  std_logic;
         wea : IN  std_logic_vector(0 downto 0);
         addra : IN  std_logic_vector(12 downto 0);
         dina : IN  std_logic_vector(7 downto 0);
         douta1 : OUT  std_logic_vector(7 downto 0);
         douta2 : OUT  std_logic_vector(7 downto 0);
         clkb : IN  std_logic;
         web : IN  std_logic_vector(0 downto 0);
         addrb : IN  std_logic_vector(10 downto 0);
         dinb : IN  std_logic_vector(31 downto 0);
         doutb1 : OUT  std_logic_vector(31 downto 0);
         doutb2 : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal clka : std_logic := '0';
   signal wea : std_logic_vector(0 downto 0) := (others => '0');
   signal addra : std_logic_vector(12 downto 0) := (others => '0');
   signal dina : std_logic_vector(7 downto 0) := (others => '0');
   signal clkb : std_logic := '0';
   signal web : std_logic_vector(0 downto 0) := (others => '0');
   signal addrb : std_logic_vector(10 downto 0) := (others => '0');
   signal dinb : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal douta1 : std_logic_vector(7 downto 0);
   signal douta2 : std_logic_vector(7 downto 0);
   signal doutb1 : std_logic_vector(31 downto 0);
   signal doutb2 : std_logic_vector(31 downto 0);

   -- Clock period definitions
   constant clka_period : time := 10 ns;
   constant clkb_period : time := 5 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: ram_tdp_test PORT MAP (
          clka => clka,
          wea => wea,
          addra => addra,
          dina => dina,
          douta1 => douta1,
          douta2 => douta2,
          clkb => clkb,
          web => web,
          addrb => addrb,
          dinb => dinb,
          doutb1 => doutb1,
          doutb2 => doutb2
        );

   -- Clock process definitions
   clka_process :process
   begin
		clka <= '0';
		wait for clka_period/2;
		clka <= '1';
		wait for clka_period/2;
   end process;
 
   clkb_process :process
   begin
		clkb <= '0';
		wait for clkb_period/2;
		clkb <= '1';
		wait for clkb_period/2;
   end process;
 

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
      wait for 100 ns;	

      wait for clka_period*10;

      -- insert stimulus here 
		addra <= "1000000000000";
		dina	<= x"21";
		wea 	<= "1";
		wait for clka_period;
		
		addra <= "1000000000001";
		dina	<= x"43";
		wea 	<= "1";
		wait for clka_period;
		
		addra <= "1000000000010";
		dina	<= x"65";
		wea 	<= "1";
		wait for clka_period;

		addra <= "1000000000011";
		dina	<= x"87";
		wea 	<= "1";
		wait for clka_period;
		
		addra <= "0000000000000";
		wea 	<= "0";
		wait for clka_period;
		
		addra <= "1000000000000";
		wait for clka_period;
		
		addra <= "1000000000001";
		wait for clka_period;
		
		addra <= "1000000000010";
		wait for clka_period;

		addra <= "1000000000011";
		wait for clka_period;			

		addrb <= "10000000000";
		wait for clkb_period;

		addrb <= "01000000000";
		dinb	<= x"12345678";
		web 	<= "1";
		wait for clkb_period;
		
		addrb <= "00000000000";
		web 	<= "0";
		wait for clkb_period;		
		
		addrb <= "01000000000";	
		wait for clkb_period;	


		addra <= "0100000000000";
		wait for clka_period;
		
		addra <= "0100000000001";
		wait for clka_period;
		
		addra <= "0100000000010";
		wait for clka_period;

		addra <= "0100000000011";
		wait for clka_period;		

      wait;
   end process;

END;
