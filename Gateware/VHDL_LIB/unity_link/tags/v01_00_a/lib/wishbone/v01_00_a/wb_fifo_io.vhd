----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    09:58:22 04/02/2012 
-- Design Name: 
-- Module Name:    wb_fifo_io - structural 
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
library ieee;
use ieee.std_logic_1164.all;
use work.wb_classic_interface.all;

entity wb_fifo_io is
	generic (
		-- MEM configuration
		C_FIFO_DEPTH 			: integer range 0 to 32 := 4;		-- FIFO depth (fifo memory address width)
		C_DATA_WIDTH 			: integer range 1 to 32 := 32		-- Data bit size
	);
	port ( 
			-- wb syscon interface	
			clk_i : in  std_logic;
			rst_i : in  std_logic;
			
			-- wb slave interface
			wb_i 	: in  wb_ad32sb_if;
			wb_o 	: out wb_d32ae_if;
			
			--------------------------------------------
			-- Insert User Logic below this line
			
			led_o : out std_logic_vector(6 downto 0)
			
			-- Insert User Logic above this line
			--------------------------------------------
	);
end wb_fifo_io;

architecture structural of wb_fifo_io is

	signal fifo_empty_o 		: std_logic;
	signal fifo_data_o 		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal fifo_rd_i 			: std_logic;

	signal fifo_wr_i 			: std_logic;
	signal fifo_data_i 		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal fifo_full_o 		: std_logic;
	
	--------------------------------------------
	-- Insert User Logic below this line
	
	
	signal led		: std_logic_vector(6 downto 0);
	
	
	-- Insert User Logic above this line
	--------------------------------------------	

begin

	-- Wishbone Slave Fifo instance
	wb_fifo_inst : entity work.wb_fifo
		generic map(
			-- MEM configuration
			C_FIFO_DEPTH	=> C_FIFO_DEPTH,
			C_DATA_WIDTH	=> C_DATA_WIDTH
		)
		port map( 
				-- wb syscon interface	
				clk_i => clk_i,
				rst_i => rst_i,
				
				-- wb slave interface
				wb_i 	=> wb_i,
				wb_o 	=> wb_o,
				
				-- fifo interface
				fifo_empty_o 	=> fifo_empty_o,
				fifo_rd_i 		=> fifo_rd_i,
				fifo_data_o 	=> fifo_data_o,

				fifo_full_o 	=> fifo_full_o,
				fifo_wr_i 		=> fifo_wr_i,
				fifo_data_i 	=> fifo_data_i
		);
	
		
	--------------------------------------------
	-- FIFO interface:
	--
	--	User output FIFO
	--		fifo_empty_o 	: FIFO empty flag
	--		fifo_rd_i 		: Read enable/request input
	--		fifo_data_o 	: Data output
	--
	--	User input FIFO
	--		fifo_full_o 	: FIFO full flag
	--		fifo_wr_i 		: Write enable/request input
	--		fifo_data_i 	: Data input
	--
	--	-------------------------------------
	--
	-- Insert User Logic below this line
	
		-- Example code
	
			-- logic
			process(clk_i)
			begin
				if rising_edge(clk_i) then
					fifo_rd_i <= '0';
					fifo_wr_i <= '0';
					
					if fifo_empty_o='0' then
						fifo_rd_i <= '1';
						led <= fifo_data_o(led'range);
					end if;
					
					if fifo_full_o='0' then
						fifo_wr_i <= '1';
						fifo_data_i(led'range) <= led;
					end if;
					
				end if;
			end process;
			
			-- output mapping
			led_o <= led;
	
	-- Insert User Logic above this line
	--------------------------------------------		


end structural;

