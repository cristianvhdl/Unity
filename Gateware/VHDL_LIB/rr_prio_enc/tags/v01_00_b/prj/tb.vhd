--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   17:13:40 04/12/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/encoder/prj/priority_encoder/tb.vhd
-- Project Name:  priority_encoder
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: rr_prio_enc
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
 
    COMPONENT rr_prio_enc
    PORT(
         req_i : IN  std_logic_vector(3 downto 0);
         cur_i : IN  std_logic_vector(1 downto 0);
         vld_o : OUT  std_logic;
         ptr_o : OUT  std_logic_vector(1 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal req_i : std_logic_vector(3 downto 0) := (others => '0');
   signal cur_i : std_logic_vector(1 downto 0) := (others => '0');

 	--Outputs
   signal vld_o : std_logic;
   signal ptr_o : std_logic_vector(1 downto 0);
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: rr_prio_enc PORT MAP (
          req_i => req_i,
          cur_i => cur_i,
          vld_o => vld_o,
          ptr_o => ptr_o
        );


   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
      wait for 100 ns;	

      -- insert stimulus here 		
		cur_i <= "00";
		req_i <= "0001"; wait for 5 ns;		
		req_i <= "0010"; wait for 5 ns;
		req_i <= "0100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0001"; wait for 5 ns;
		req_i <= "0011"; wait for 5 ns;
		req_i <= "0111"; wait for 5 ns;
		req_i <= "1111"; wait for 5 ns;
		req_i <= "1110"; wait for 5 ns;
		req_i <= "1100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0000"; wait for 5 ns;
		
		cur_i <= "01";
		req_i <= "0001"; wait for 5 ns;		
		req_i <= "0010"; wait for 5 ns;
		req_i <= "0100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0001"; wait for 5 ns;
		req_i <= "0011"; wait for 5 ns;
		req_i <= "0111"; wait for 5 ns;
		req_i <= "1111"; wait for 5 ns;
		req_i <= "1110"; wait for 5 ns;
		req_i <= "1100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0000"; wait for 5 ns;

		cur_i <= "10";
		req_i <= "0001"; wait for 5 ns;		
		req_i <= "0010"; wait for 5 ns;
		req_i <= "0100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0001"; wait for 5 ns;
		req_i <= "0011"; wait for 5 ns;
		req_i <= "0111"; wait for 5 ns;
		req_i <= "1111"; wait for 5 ns;
		req_i <= "1110"; wait for 5 ns;
		req_i <= "1100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0000"; wait for 5 ns;

		cur_i <= "11";
		req_i <= "0001"; wait for 5 ns;		
		req_i <= "0010"; wait for 5 ns;
		req_i <= "0100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0001"; wait for 5 ns;
		req_i <= "0011"; wait for 5 ns;
		req_i <= "0111"; wait for 5 ns;
		req_i <= "1111"; wait for 5 ns;
		req_i <= "1110"; wait for 5 ns;
		req_i <= "1100"; wait for 5 ns;
		req_i <= "1000"; wait for 5 ns;
		req_i <= "0000"; wait for 5 ns;		

      wait;
   end process;

END;
