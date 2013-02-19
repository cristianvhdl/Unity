----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    09:12:47 03/30/2012 
-- Design Name: 
-- Module Name:    wb_mem_io - structural 
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
use ieee.numeric_std.all;

library wishbone_v01_00_a;
use wishbone_v01_00_a.wb_classic_interface.all;

library ram_v01_00_a;
use ram_v01_00_a.all;

entity wb_mem_io is
	generic (
		-- MEM configuration
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
		C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
		C_RAMSTYLE      		: string  := "AUTO"; 				-- DISTRIBUTED, BLOCK, AUTO
		C_IO_ADDR_BIT 			: integer range -2 to 31 := 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], INPUT-ONLY mode: -2, OUTPUT-ONLY mode: -1
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
end wb_mem_io;

architecture structural of wb_mem_io is

	signal ctrl_we_o		: std_logic;
	signal ctrl_addr_o	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal ctrl_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_w_ack_i	: std_logic;
	signal ctrl_w_err_i	: std_logic;
	
	signal mem_we_i		: std_logic;
	signal mem_addr_i		: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal mem_data_i		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal mem_data_o		: std_logic_vector(C_DATA_WIDTH-1 downto 0);	

	signal usr_we_i		: std_logic;
	
	signal we_i		: std_logic;
	signal addr_i	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);
	signal data_i 	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);	
	signal w_ack_o	: std_logic;
	signal w_err_o	: std_logic;	

	--------------------------------------------
	-- Insert User Logic below this line
		
	type states is (RD1, RD2, WR);
	
	signal cur_state : states := RD1;
	signal nxt_state : states;
	
	signal count_reg	: unsigned(31 downto 0) := (others=>'0');
	signal count_nxt	: unsigned(31 downto 0);
	
	signal led_reg		: std_logic_vector(6 downto 0) := (others=>'0');
	signal led_nxt		: std_logic_vector(6 downto 0);
	
	
	-- Insert User Logic above this line
	--------------------------------------------

begin

	-- Wishbone Slave memory controller
	wb_slv_mem_ctrl_inst : entity wishbone_v01_00_a.wb_slv_mem_ctrl
		generic map(
			C_MEM_ADDR_WIDTH 		=> C_MEM_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_i,
			wb_o 	=> wb_o,
			
			-- mem interface
			mem_addr_o  => ctrl_addr_o,
			mem_we_o    => ctrl_we_o,
			mem_data_o  => ctrl_data_o,
			mem_data_i	=> ctrl_data_i,
			mem_w_ack_i	=> ctrl_w_ack_i,
			mem_w_err_i	=> ctrl_w_err_i
		);

	-- write ack/err combinatorial feedback logic:
	
		-- input-only mode
		IO_GEN_IN:
		if C_IO_ADDR_BIT=-2 generate
			begin
				-- in input mode the wb interface cannot write to any address
				ctrl_w_ack_i <= '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' else '0';
				
				-- in input mode the user ram interface can write to all addresses
				w_ack_o <= '1' when we_i='1' else '0';
				w_err_o <= '0';
		end generate;
		
		-- output-only mode
		IO_GEN_OUT:
		if C_IO_ADDR_BIT=-1 generate
			begin
				-- in output mode the wb interface can write to all addresses
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' else '0';
				ctrl_w_err_i <= '0';
				
				-- in output mode the user ram interface cannot write to any address
				w_ack_o <= '0';
				w_err_o <= '1' when we_i='1' else '0';
		end generate;

		-- mixed-IO mode
		IO_GEN_MIX:
		if C_IO_ADDR_BIT>=0 generate
			begin
				-- wb interface can read+write input addresses (C_IO_ADDR_BIT=1) and read output addresses (C_IO_ADDR_BIT=0)
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='1' else '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='0' else '0';
				
				-- user ram interface can read+write output addresses (C_IO_ADDR_BIT=0) and read input addresses (C_IO_ADDR_BIT=1)
				w_ack_o <= '1' when we_i='1' and addr_i(C_IO_ADDR_BIT)='0' else '0';
				w_err_o <= '1' when we_i='1' and addr_i(C_IO_ADDR_BIT)='1' else '0'; 
		end generate;
		
	mem_we_i <= ctrl_w_ack_i;
	mem_addr_i <= ctrl_addr_o;
	mem_data_i <= ctrl_data_o;
	ctrl_data_i <= mem_data_o;
	
	usr_we_i <= w_ack_o;

	-- Dual ported ram
	ram_rwrw_inst : entity ram_v01_00_a.ram_rwrw
		generic map( 
			ADDR_WIDTH    => C_MEM_ADDR_WIDTH,
			DATA_WIDTH    => C_DATA_WIDTH,
			RAMSTYLE      => C_RAMSTYLE,
			PIPE_REGA_EN  => 0,
			PIPE_REGB_EN  => 0,
			INIT_DATA     => 0
			)
		port map( 
			clk_a_i    => clk_i,
			enable_a_i => '1',
			we_a_i     => mem_we_i,
			addr_a_i   => mem_addr_i,
			data_a_i   => mem_data_i,
			data_a_o   => mem_data_o,

			clk_b_i    => clk_i,
			enable_b_i => '1',
			we_b_i     => usr_we_i,
			addr_b_i   => addr_i,
			data_b_i   => data_i,
			data_b_o   => data_o
			);

	--------------------------------------------
	-- RAM interface:
	--
	--		we_i		: RAM write enable input
	-- 	addr_i	: RAM address input
	--		data_i	: RAM data input
	-- 	data_o	: RAM data output
	--		w_ack_o	: combinatorial write acknowledge signal 
	--		w_err_o	: combinatorial write error signal (write not allowed to the selected address)
	--
	--	-------------------------------------
	-- INPUT-ONLY Mode:
	--		user ram interface can write to and read from any address
	--
	-- OUTPUT-ONLY Mode:
	--		user ram interface can read from any address, but not write
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
		
		process(cur_state, count_reg, led_reg, data_o, w_ack_o, w_err_o)
		begin
			nxt_state <= cur_state;
			count_nxt <= count_reg;
			led_nxt	 <= led_reg;
			
			we_i  	 	<= '0';
			addr_i 		<= (others=>'0');
			data_i		<= (others=>'0');
			
			case cur_state is
				
				when RD1 =>
					we_i   <= '0';				-- Read
					addr_i <= "00" & x"4";	-- Input address 0x04
					nxt_state <= RD2;

				when RD2 =>
					we_i   <= '0';				-- Read
					addr_i <= "00" & x"4";	-- Input address 0x04
					
					led_nxt <= data_o(6 downto 0);
					nxt_state <= WR;				
				
				when WR =>
					we_i   <= '1';				-- Write
					addr_i <= "00" & x"0";	-- Input address 0x00
					data_i <= std_logic_vector(count_reg);
					
					if w_ack_o='1' then					
						count_nxt <= count_reg+1;
						nxt_state <= RD1;
					elsif w_err_o='1' then
						count_nxt <= (others=>'0');					
					end if;					
				
			end case;
			
		end process;
		
		-- output mapping
		led_o <= led_reg;
	
	-- Insert User Logic above this line
	--------------------------------------------

end structural;