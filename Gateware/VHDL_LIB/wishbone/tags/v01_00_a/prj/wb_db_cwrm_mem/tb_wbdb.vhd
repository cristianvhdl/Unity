--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   09:23:00 03/28/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/double_buffered_memory/prj/wb_db_cwrm_mem/tb_wbdb.vhd
-- Project Name:  wb_db_cwrm_mem
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: wb_db_cwrm_mem
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
 
ENTITY tb_wbdb IS
END tb_wbdb;
 
ARCHITECTURE behavior OF tb_wbdb IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT wb_db_cwrm_mem
    PORT(
         clk_i : IN  std_logic;
         rst_i : IN  std_logic;
			wb_i 	: IN  wb_ad32sb_if;
			wb_o 	: OUT wb_d32ae_if;
			db_i 	: IN  db_mem_cwrm_i_if;
			db_o 	: OUT db_mem_cwrm_o_if
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal rst_i : std_logic := '0';
   signal wb_i : wb_ad32sb_if := ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
   signal db_i : db_mem_cwrm_i_if := ((others=>'0'), '0', (others=>'0'), (others=>'0'), '0');

 	--Outputs
   signal wb_o : wb_d32ae_if;
   signal db_o : db_mem_cwrm_o_if;

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: wb_db_cwrm_mem PORT MAP (
          clk_i => clk_i,
          rst_i => rst_i,
          wb_i => wb_i,
          wb_o => wb_o,
          db_i => db_i,
          db_o => db_o
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
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000000";
		wb_i.dat <= x"f0000001";
		wb_i.we  <= '1';
		wb_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- read from address 0x04 (must read x"00000000": OK)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000004";
		wb_i.we  <= '0';
		wb_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		

		-- write to read+write address 0x04 (must succeed: OK)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000004";
		wb_i.dat <= x"f0000001";
		wb_i.we  <= '1';
		wb_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;

		-- read from address 0x04 (must read x"f0000001": OK)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000004";
		wb_i.we  <= '0';
		wb_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- block write to read+write address 0x05, 0x06, 0x07 (RP=1, WP=1) (must succeed: ok)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000005";
		wb_i.dat <= x"f0000002";
		wb_i.we  <= '1';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
		wait for clk_i_period*1;
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000006";
		wb_i.dat <= x"f0000003";
		wb_i.we  <= '1';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
		wait for clk_i_period*1;	
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000007";
		wb_i.dat <= x"f0000004";
		wb_i.we  <= '1';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;	
		
		-- block read to read+write address 0x05, 0x06, 0x07 (RP=1, WP=1)  (must succeed with RM==1: ?)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000005";
		wb_i.we  <= '0';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
		wait for clk_i_period*1;

--		----------------------------
--		-- cw from db side (must be postponed until after the block read: ?)
--		
--		db_i.ctr_i(0) <= '1';
--		db_i.ctr_we_i <= '1';
--		
--		----------------------------
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000006";
		wb_i.we  <= '0';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
--		wait for clk_i_period;
--		db_i.ctr_i(0) <= '0';
--		db_i.ctr_we_i <= '0';		
--		wait for clk_i_period;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
		wait for clk_i_period*1;	
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000007";
		wb_i.we  <= '0';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;	


		-- read status register (OK)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000400";
		wb_i.we  <= '0';
		wb_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- commit write
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000400";
		wb_i.we  <= '1';
		wb_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- read status register
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000400";
		wb_i.we  <= '0';
		wb_i.sgl <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;
		
		-- block write to read+write address 0x05, 0x06, 0x07 (RP=1, WP=0) (must succeed: ok)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000005";
		wb_i.dat <= x"f0000020";
		wb_i.we  <= '1';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
		wait for clk_i_period*1;
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000006";
		wb_i.dat <= x"f0000030";
		wb_i.we  <= '1';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '1', '0', '1');
		wait for clk_i_period*1;	
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000007";
		wb_i.dat <= x"f0000040";
		wb_i.we  <= '1';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;		
		
		-- block read to read+write address 0x05, 0x06, 0x07 (RP=1, WP=0) (must succeed with RM==1: OK)
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000005";
		wb_i.we  <= '0';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
		wait for clk_i_period*1;
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000006";
		wb_i.we  <= '0';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('1', '0', (others=>'0'), (others=>'0'), '0', '0', '1');
		wait for clk_i_period*1;	
		
		wb_i.cyc <= '1';
		wb_i.stb <= '1';
		wb_i.adr <= x"00000007";
		wb_i.we  <= '0';
		wb_i.blk <= '1';		
		wait for clk_i_period*2;
		wb_i <= ('0', '0', (others=>'0'), (others=>'0'), '0', '0', '0');
		wait for clk_i_period*2;			
		
		
      wait;
   end process;

END;
