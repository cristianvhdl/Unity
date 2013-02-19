----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    10:01:36 04/02/2012 
-- Design Name: 
-- Module Name:    wb_dbmem_io - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
--
-- Additional Comments: 
--
-- Address space width = C_MEM_ADDR_WIDTH+1
-- Commit Write: Write any data to any address in the range	: [2**C_MEM_ADDR_WIDTH, (2**(C_MEM_ADDR_WIDTH+1))-1]
-- Read Status register: Read from any address int the range: [2**C_MEM_ADDR_WIDTH, (2**(C_MEM_ADDR_WIDTH+1))-1]
-- 
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

library wishbone_v01_00_a;
use wishbone_v01_00_a.wb_classic_interface.all;

library db_mem_v01_00_a;
use db_mem_v01_00_a.db_mem.all;

entity wb_dbmem_io is
	generic (
		-- MEM configuration
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10) NB: Address space width = C_MEM_ADDR_WIDTH+1
		C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
		C_IO_ADDR_BIT 			: integer range 0 to 31 := 2;		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1]
		C_CW_TIMEOUT 			: natural 					:= 10;
		C_RST_ON_CW_TIMEOUT 	: integer range 0 to 1 	:= 0		
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
end wb_dbmem_io;

architecture structural of wb_dbmem_io is

	signal db_i : db_mem_cwrm_i_if;
	signal db_o : db_mem_cwrm_o_if;

	--------------------------------------------
	-- Insert User Logic below this line
	
	type states is (RD1, RD2, WR, CM);
	
	signal cur_state : states := RD1;
	signal nxt_state : states;
	
	signal count_reg	: unsigned(31 downto 0) := (others=>'0');
	signal count_nxt	: unsigned(31 downto 0);
	
	signal led_reg		: std_logic_vector(6 downto 0) := (others=>'0');
	signal led_nxt		: std_logic_vector(6 downto 0);
	
	
	-- Insert User Logic above this line
	--------------------------------------------

begin

	-- Wishbone Slave double buffered CWRM memory instance
	wb_db_cwrm_mem_inst : entity wishbone_v01_00_a.wb_db_cwrm_mem
		generic map(
			-- DB CWRM MEM configuration									
			C_MEM_ADDR_WIDTH		=> C_MEM_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH,
			C_IO_ADDR_BIT 			=> C_IO_ADDR_BIT,
			C_CW_TIMEOUT 			=> C_CW_TIMEOUT,
			C_RST_ON_CW_TIMEOUT 	=> C_RST_ON_CW_TIMEOUT
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_i,
			wb_o 	=> wb_o,
			
			-- db_mem interface
			db_i 	=> db_i,
			db_o 	=> db_o		
		);	
		
	--------------------------------------------
	-- DB CWRM Memory/RAM interface:
	--
	-- Inputs:
	--		db_i.ctr  	: control register data [1:0]=[RM,CW]
	--		db_i.ctr_we : control register we
	--		db_i.adr 	: address
	--		db_i.data	: data in (wr)
	--		db_i.we 		: write enable
	--
	-- Outputs:
	--		db_o.str  	: status register [31:24][23:16][15:8][7:0]=[0x00][mst status][0x00][slv status] : [status]=[EWNP,ECWT,CWA,CWB,RP,WP,RMF,CWP]
	--		db_o.w_ack	: write acknowledge, combinatorial feedback
	--		db_o.w_err	: write error (not permitted), combinatorial feedback		
	--		db_o.data	: data out (rd)
	--
	-- N.B.
	-- User has access to the slave (slv) side interface,
	-- the WB-bus has acces to the master (mst) side interface.
	--	-------------------------------------
	--
	-- MIXED-IO Mode:
	--		user ram interface can read+write output addresses (C_IO_ADDR_BIT=0)
	--		and read input addresses (C_IO_ADDR_BIT=1)
	--	-------------------------------------
	--
	-- Insert User Logic below this line
	
		-- compatible with TosNet mode
	
		-- counter
		process(clk_i)
		begin
			if rising_edge(clk_i) then
				if rst_i='1' then
					cur_state <= RD1;
					count_reg <= (others=>'0');
					led_reg	 <= (others=>'0');
				else
					cur_state <= nxt_state;
					count_reg <= count_nxt;
					led_reg	 <= led_nxt;
				end if;
			end if;
		end process;
		
		process(cur_state, count_reg, led_reg, db_o)
		begin
			nxt_state <= cur_state;
			count_nxt <= count_reg;
			led_nxt	 <= led_reg;
			
			db_i.ctr  	<= (others=>'0');
			db_i.ctr_we <= '0';
			db_i.adr 	<= (others=>'0');
			db_i.data	<= (others=>'0');
			db_i.we 		<= '0';
			
			case cur_state is
				
				when RD1 =>
					db_i.we  <= '0';				-- Read
					db_i.adr <= x"00000004";	-- Input address 0x04
					nxt_state <= RD2;

				when RD2 =>
					db_i.we  <= '0';				-- Read
					db_i.adr <= x"00000004";	-- Input address 0x04
					
					led_nxt <= db_o.data(led_nxt'range);
					nxt_state <= WR;				
				
				when WR =>
					db_i.we  <= '1';				-- Write
					db_i.adr <= x"00000000";	-- Input address 0x00
					db_i.data <= std_logic_vector(count_reg);
					
					if db_o.w_ack='1' then					
						count_nxt <= count_reg+1;
						nxt_state <= CM;
					elsif db_o.w_err='1' then
						count_nxt <= (others=>'0');					
					end if;					
				
				when CM =>
					db_i.ctr(0) <= '1';
					db_i.ctr_we <= '1';
					nxt_state <= RD1;
				
			end case;
			
		end process;
		
		-- output mapping
		led_o <= led_reg;
	
	-- Insert User Logic above this line	
		
end structural;

