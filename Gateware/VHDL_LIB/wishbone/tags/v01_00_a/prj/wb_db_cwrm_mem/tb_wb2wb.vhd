--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   16:11:45 03/28/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/double_buffered_memory/prj/wb_db_cwrm_mem/tb_wb2wb.vhd
-- Project Name:  wb_db_cwrm_mem
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: wb2wb_db_cwrm_mem
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
use work.db_mem.all;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;
 
ENTITY tb_wb2wb IS
END tb_wb2wb;
 
ARCHITECTURE behavior OF tb_wb2wb IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT wb2wb_db_cwrm_mem
    PORT(
         clk_i : IN  std_logic;
         rst_i : IN  std_logic;
         wb_si1_i : IN  wb_ad32sb_if;
         wb_si1_o : OUT wb_d32ae_if;
         wb_si2_i : IN  wb_ad32sb_if;
         wb_si2_o : OUT wb_d32ae_if
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal rst_i : std_logic := '0';
   signal wb_si1_i : wb_ad32sb_if := ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
   signal wb_si2_i : wb_ad32sb_if := ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');

 	--Outputs
   signal wb_si1_o : wb_d32ae_if;
   signal wb_si2_o : wb_d32ae_if;

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: wb2wb_db_cwrm_mem PORT MAP (
          clk_i => clk_i,
          rst_i => rst_i,
          wb_si1_i => wb_si1_i,
          wb_si1_o => wb_si1_o,
          wb_si2_i => wb_si2_i,
          wb_si2_o => wb_si2_o
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
		wait for 105 ns;	
		rst_i <= '0';
		
      wait for clk_i_period*10;

      -- insert stimulus here 
		
		-- write to read-only address 0x00 (must fail: OK)		
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000000";
		wb_si1_i.dat <= x"f0000001";
		wb_si1_i.we  <= '1';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- read from address 0x04 (must read x"00000000": OK)
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000004";
		wb_si1_i.we  <= '0';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		

		-- write to read+write address 0x04 (must succeed: OK)
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000004";
		wb_si1_i.dat <= x"f0000001";
		wb_si1_i.we  <= '1';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;

		-- read from address 0x04 (must read x"f0000001": OK)
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000004";
		wb_si1_i.we  <= '0';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		
		
		
		-- write to read-only address 0x05 (must fail: OK)		
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000005";
		wb_si2_i.dat <= x"f0000001";
		wb_si2_i.we  <= '1';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- read from address 0x01 (must read x"00000000": OK)
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000001";
		wb_si2_i.we  <= '0';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		

		-- write to read+write address 0x01 (must succeed: OK)
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000001";
		wb_si2_i.dat <= x"f0000010";
		wb_si2_i.we  <= '1';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;

		-- read from address 0x01 (must read x"f0000001": OK)
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000001";
		wb_si2_i.we  <= '0';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		


		----------------------------------------------------------
		-- Block read+write test
		

		-------------------------------------------------------
		-------------------------------------------------------
		-- WB_SI1
		
			-- block read to read+write address 0x05, 0x06, 0x07 (RP=1, WP=1) (must succeed with RM==1: OK)
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000005";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000006";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000007";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;			
			
			-- block write to read+write address 0x05, 0x06, 0x07 (RP=1, WP=1) (must succeed: ok)
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000005";
			wb_si1_i.dat <= x"f0000002";
			wb_si1_i.we  <= '1';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
			wait for clk_i_period*1;
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000006";
			wb_si1_i.dat <= x"f0000003";
			wb_si1_i.we  <= '1';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000007";
			wb_si1_i.dat <= x"f0000004";
			wb_si1_i.we  <= '1';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;

			-- block read to read+write address 0x05, 0x06, 0x07 (RP=1, WP=1) (must succeed with RM==1: OK)
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000005";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000006";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000007";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;			
			
			-- block read to read address 0x01, 0x02, 0x03 (RP=0, WP=0) (must succeed with RM==1: OK)
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000001";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000002";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000003";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;				
		
		-------------------------------------------------------
		-------------------------------------------------------
		-- WB_SI2
		
			-- block read to read+write address 0x01, 0x02, 0x03 (RP=0, WP=0) (must succeed with RM==1: OK)
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000001";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000002";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000003";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;			
			
			-- block write to read+write address 0x01, 0x02, 0x03 (RP=0, WP=0) (must succeed: ok)
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000001";
			wb_si2_i.dat <= x"f0000020";
			wb_si2_i.we  <= '1';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
			wait for clk_i_period*1;
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000002";
			wb_si2_i.dat <= x"f0000030";
			wb_si2_i.we  <= '1';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000003";
			wb_si2_i.dat <= x"f0000040";
			wb_si2_i.we  <= '1';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;

			-- block read to read+write address 0x01, 0x02, 0x03 (RP=0, WP=0) (must succeed with RM==1: OK)
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000001";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000002";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000003";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;	
			
			-- block read to read address 0x05, 0x06, 0x07 (RP=0, WP=0) (must succeed with RM==1: OK)
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000005";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000006";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000007";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;				

		-------------------------------------------------------
		-------------------------------------------------------
		
		-- read status register (OK)
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000400";
		wb_si1_i.we  <= '0';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;

		-- read status register (OK)
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000400";
		wb_si2_i.we  <= '0';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- commit write
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000400";
		wb_si1_i.we  <= '1';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- read status register (OK)
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000400";
		wb_si1_i.we  <= '0';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;

		-- read status register (OK)
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000400";
		wb_si2_i.we  <= '0';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		

		-- commit write
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000400";
		wb_si2_i.we  <= '1';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;

		-- read status register (OK)
		wb_si1_i.cyc <= '1';
		wb_si1_i.stb <= '1';
		wb_si1_i.adr <= x"00000400";
		wb_si1_i.we  <= '0';
		wb_si1_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;

		-- read status register (OK)
		wb_si2_i.cyc <= '1';
		wb_si2_i.stb <= '1';
		wb_si2_i.adr <= x"00000400";
		wb_si2_i.we  <= '0';
		wb_si2_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		
		
		
		-------------------------------------------------------
		-------------------------------------------------------
		-- WB_SI1
		
			-- block read to read+write address 0x05, 0x06, 0x07 (RP=0, WP=0) (must succeed with RM==1: OK)
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000005";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000006";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000007";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;		

			-- block read to read address 0x01, 0x02, 0x03 (RP=0, WP=0) (must succeed with RM==1: OK)
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000001";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000002";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si1_i.cyc <= '1';
			wb_si1_i.stb <= '1';
			wb_si1_i.adr <= x"00000003";
			wb_si1_i.we  <= '0';
			wb_si1_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si1_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;			

		-------------------------------------------------------
		-------------------------------------------------------

		-------------------------------------------------------
		-------------------------------------------------------
		-- WB_SI2

			-- block read to read+write address 0x01, 0x02, 0x03 (RP=1, WP=1) (must succeed with RM==1: OK)
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000001";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000002";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000003";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;	
			
			-- block read to read address 0x05, 0x06, 0x07 (RP=1, WP=1) (must succeed with RM==1: OK)
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000005";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000006";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
			wait for clk_i_period*1;	
			
			wb_si2_i.cyc <= '1';
			wb_si2_i.stb <= '1';
			wb_si2_i.adr <= x"00000007";
			wb_si2_i.we  <= '0';
			wb_si2_i.blk <= '1';		
			wait for clk_i_period*2;
			wb_si2_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
			wait for clk_i_period*2;				

		-------------------------------------------------------
		-------------------------------------------------------

      wait;
   end process;

END;
