--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   15:07:25 04/13/2012
-- Design Name:   
-- Module Name:   C:/XilinxProjects/PhD/vhdl_libs/qrc_link/application_layer/prj/qrc_al/tb_wsr_wsa_rsi.vhd
-- Project Name:  qrc_al
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: qrc_link_al_fsm
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
 
ENTITY tb_wsr_wsa_rsi IS
END tb_wsr_wsa_rsi;
 
ARCHITECTURE behavior OF tb_wsr_wsa_rsi IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT unity_link_al_fsm
    PORT(
         clk_i : IN  std_logic;
         reset_i : IN  std_logic;
         fifo_in_empty_i : IN  std_logic;
         fifo_in_rd_o : OUT  std_logic;
         fifo_in_data_i : IN  std_logic_vector(8 downto 0);
         fifo_out_full_i : IN  std_logic;
         fifo_out_wr_o : OUT  std_logic;
         fifo_out_data_o : OUT  std_logic_vector(8 downto 0);
         en_o : OUT  std_logic;
         we_o : OUT  std_logic;
         blk_o : OUT  std_logic;
         nxt_o : OUT  std_logic;
         adr_o : OUT  std_logic_vector(31 downto 0);
         dat_o : OUT  std_logic_vector(31 downto 0);
         dat_i : IN  std_logic_vector(31 downto 0);
         done_i : IN  std_logic;
         err_i : IN  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal clk_i : std_logic := '0';
   signal reset_i : std_logic := '0';
   signal fifo_in_empty_i : std_logic := '0';
   signal fifo_in_data_i : std_logic_vector(8 downto 0) := (others => '0');
   signal fifo_out_full_i : std_logic := '0';
   signal dat_i : std_logic_vector(31 downto 0) := (others => '0');
   signal done_i : std_logic := '0';
   signal err_i : std_logic := '0';

 	--Outputs
   signal fifo_in_rd_o : std_logic;
   signal fifo_out_wr_o : std_logic;
   signal fifo_out_data_o : std_logic_vector(8 downto 0);
   signal en_o : std_logic;
   signal we_o : std_logic;
   signal blk_o : std_logic;
   signal nxt_o : std_logic;
   signal adr_o : std_logic_vector(31 downto 0);
   signal dat_o : std_logic_vector(31 downto 0);

   -- Clock period definitions
   constant clk_i_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: unity_link_al_fsm PORT MAP (
          clk_i => clk_i,
          reset_i => reset_i,
          fifo_in_empty_i => fifo_in_empty_i,
          fifo_in_rd_o => fifo_in_rd_o,
          fifo_in_data_i => fifo_in_data_i,
          fifo_out_full_i => fifo_out_full_i,
          fifo_out_wr_o => fifo_out_wr_o,
          fifo_out_data_o => fifo_out_data_o,
          en_o => en_o,
          we_o => we_o,
          blk_o => blk_o,
          nxt_o => nxt_o,
          adr_o => adr_o,
          dat_o => dat_o,
          dat_i => dat_i,
          done_i => done_i,
          err_i => err_i
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

		-- #WSR 00 0f00\n
		
		-- command
		fifo_in_empty_i <= '0';
		fifo_in_data_i  <= '1' & x"23"; -- #
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"57"; -- W
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"53"; -- S
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"52"; -- R		
		wait for clk_i_period;
		fifo_in_data_i  <= '1' & x"3A"; -- :
		wait for clk_i_period;
		
		-- group-id: 0x01
		fifo_in_data_i  <= '0' & x"00"; -- 00
		wait for clk_i_period;
		
		-- Rate: 0x01f0
		fifo_in_data_i  <= '0' & x"0f"; -- 0f
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"00"; -- 00		
		wait for clk_i_period;
		
		wait for clk_i_period*10;
		
		-- #WSR0101f0\n
		
		-- command
		fifo_in_empty_i <= '0';
		fifo_in_data_i  <= '1' & x"23"; -- #
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"57"; -- W
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"53"; -- S
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"52"; -- R		
		wait for clk_i_period;
		fifo_in_data_i  <= '1' & x"3A"; -- :
		wait for clk_i_period;
		
		-- group-id: 0x01
		fifo_in_data_i  <= '0' & x"01"; -- 01
		wait for clk_i_period;
		
		-- Rate: 0x01f0
		fifo_in_data_i  <= '0' & x"01"; -- 01
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"f0"; -- f0		
		wait for clk_i_period;
		
		wait for clk_i_period*10;		
		
		-- #WSA 00 01 00a0010d\n
		
		-- command
		fifo_in_empty_i <= '0';
		fifo_in_data_i  <= '1' & x"23"; -- #
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"57"; -- W
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"53"; -- S
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"41"; -- A		
		wait for clk_i_period;
		fifo_in_data_i  <= '1' & x"3A"; -- :
		wait for clk_i_period;
		
		-- group-id: 0x01
		fifo_in_data_i  <= '0' & x"00"; -- 00
		wait for clk_i_period;
		
		-- lenght (max 16) : 1
		fifo_in_data_i  <= '0' & x"01"; -- 01
		wait for clk_i_period;
		
		-- address 1: 0x00a0010d
		fifo_in_data_i  <= '0' & x"00"; -- 00
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"a0"; -- a0		
		wait for clk_i_period;		
		fifo_in_data_i  <= '0' & x"01"; -- 01
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"0d"; -- 0d		
		wait for clk_i_period;
		
		wait for clk_i_period*10;
		
		
		-- #WSA 01 02 1000010d 100013fa\n
		
		-- command
		fifo_in_empty_i <= '0';
		fifo_in_data_i  <= '1' & x"23"; -- #
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"57"; -- W
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"53"; -- S
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"41"; -- A		
		wait for clk_i_period;
		fifo_in_data_i  <= '1' & x"3A"; -- :
		wait for clk_i_period;		
		
		-- group-id: 0x01
		fifo_in_data_i  <= '0' & x"01"; -- 01
		wait for clk_i_period;
		
		-- lenght (max 16) : 2
		fifo_in_data_i  <= '0' & x"02"; -- 02
		wait for clk_i_period;
		
		-- address 1: 0x1000010d
		fifo_in_data_i  <= '0' & x"10"; -- 10
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"00"; -- 00		
		wait for clk_i_period;		
		fifo_in_data_i  <= '0' & x"01"; -- 01
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"0d"; -- 0d		
		wait for clk_i_period;
		wait for clk_i_period;
		
		-- address 2: 0x100013fa
		fifo_in_data_i  <= '0' & x"10"; -- 10
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"00"; -- 00		
		wait for clk_i_period;		
		fifo_in_data_i  <= '0' & x"13"; -- 13
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"fa"; -- fa		
		wait for clk_i_period;	
		
		wait for clk_i_period*10;	
		
		-- #RSI 00
		
		-- command
		fifo_in_empty_i <= '0';
		fifo_in_data_i  <= '1' & x"23"; -- #
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"52"; -- R
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"53"; -- S
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"49"; -- I		
		wait for clk_i_period;
		fifo_in_data_i  <= '1' & x"3A"; -- :
		wait for clk_i_period;		
		
		-- group-id: 0x00
		fifo_in_data_i  <= '0' & x"00"; -- 00
		wait for clk_i_period;		
		
		wait for clk_i_period*20;		
		
		-- #RSI 01
		
		-- command
		fifo_in_empty_i <= '0';
		fifo_in_data_i  <= '1' & x"23"; -- #
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"52"; -- R
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"53"; -- S
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"49"; -- I		
		wait for clk_i_period;
		fifo_in_data_i  <= '1' & x"3A"; -- :
		wait for clk_i_period;		
		
		-- group-id: 0x00
		fifo_in_data_i  <= '0' & x"01"; -- 01
		wait for clk_i_period;		
		
		wait for clk_i_period*30;	
		

		-- #RLC 01
		
		-- command
		fifo_in_empty_i <= '0';
		fifo_in_data_i  <= '1' & x"23"; -- #
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"52"; -- R
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"4C"; -- L
		wait for clk_i_period;
		fifo_in_data_i  <= '0' & x"43"; -- C		
		wait for clk_i_period;
		fifo_in_data_i  <= '1' & x"0A"; -- \n
		wait for clk_i_period;				
		
      wait;
   end process;

END;
