----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    14:14:19 04/03/2012 
-- Design Name: 
-- Module Name:    mst_slv_mem_io_test_top - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use work.wb_classic_interface.all;

entity mst_slv_mem_io_test_top is
	port ( 
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			en_i	: in  std_logic;
			we_i	: in  std_logic;
			blk_i : in  std_logic;
			nxt_i	: in  std_logic;
			adr_i	: in  std_logic_vector(5 downto 0);
			dat_i	: in  std_logic_vector(31 downto 0);
			dat_o	: out std_logic_vector(31 downto 0);
			done_o: out std_logic;
			err_o : out std_logic;

			led_o : out std_logic_vector(6 downto 0)			
		);
end mst_slv_mem_io_test_top;

architecture Behavioral of mst_slv_mem_io_test_top is

	signal mst_wb_o	: wb_ad32sb_if;	
	signal mst_wb_i	: wb_d32ae_if;	

	signal slv_wb_i	: wb_ad32sb_if;	
	signal slv_wb_o	: wb_d32ae_if;

begin

	-- master
	wb_mst_ctrl : entity work.wb_mst_ctrl
		generic map(
			C_ADDR_WIDTH => 6,
			C_DATA_WIDTH => 32
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb master interface
			wb_o 	=> mst_wb_o,
			wb_i 	=> mst_wb_i,
			
			-- user logic interface
			en_i	=> en_i,
			we_i	=> we_i,
			blk_i => blk_i,
			nxt_i	=> nxt_i,
			adr_i	=> adr_i,
			dat_i	=> dat_i,
			dat_o	=> dat_o,
			done_o=> done_o,
			err_o => err_o
		);
		
	-- interconnect (Point to point)
	slv_wb_i <= mst_wb_o;
	mst_wb_i <= slv_wb_o;
	
	-- slave
	wb_mem_io : entity work.wb_mem_io
		generic map(
			-- MEM configuration
			C_MEM_ADDR_WIDTH 		=> 6,
			C_DATA_WIDTH 			=> 32,
			C_RAMSTYLE      		=> "AUTO",
			C_IO_ADDR_BIT 			=> 2
		)
		port map(
				-- wb syscon interface	
				clk_i => clk_i,
				rst_i => rst_i,
				
				-- wb slave interface
				wb_i 	=> slv_wb_i,
				wb_o 	=> slv_wb_o,
				
				--------------------------------------------
				-- Insert User Logic below this line
				
				led_o => led_o
				
				-- Insert User Logic above this line
				--------------------------------------------			
		);	

end Behavioral;

