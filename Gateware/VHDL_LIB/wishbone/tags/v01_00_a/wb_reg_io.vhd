----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    12:25:25 03/30/2012 
-- Design Name: 
-- Module Name:    wb_reg_io - structural 
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
use work.wb_classic_interface.all;

entity wb_reg_io is
	generic (
		-- REG configuration
		C_REG_ADDR_WIDTH 		: integer range 0 to 8 	 := 6;	-- Register count (uTosNet mode: 6)
		C_DATA_WIDTH 			: integer range 1 to 32  := 32;	-- Data bit size	(uTosNet mode: 32)
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
end wb_reg_io;

architecture structural of wb_reg_io is
	
	-- register signal
	type reg_type is array (natural range <>) of std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal d_reg : reg_type((2**C_REG_ADDR_WIDTH)-1 downto 0) := (others=>(others=>'0'));
	signal d_nxt : reg_type((2**C_REG_ADDR_WIDTH)-1 downto 0);

	-- control/data signals	
	signal ctrl_we_o		: std_logic;
	signal ctrl_addr_o	: std_logic_vector(C_REG_ADDR_WIDTH-1 downto 0);	
	signal ctrl_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_w_ack_i	: std_logic;
	signal ctrl_w_err_i	: std_logic;
	
	signal mem_we_i		: std_logic;
	signal mem_addr_i		: std_logic_vector(C_REG_ADDR_WIDTH-1 downto 0);	
	signal mem_data_i		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal mem_data_o		: std_logic_vector(C_DATA_WIDTH-1 downto 0);

	--------------------------------------------
	-- Insert User Logic below this line
	
	
	signal led		: std_logic_vector(6 downto 0);
	
	
	-- Insert User Logic above this line
	--------------------------------------------

begin

	-- Wishbone Slave memory controller
	wb_slv_mem_ctrl_inst : entity work.wb_slv_mem_ctrl
		generic map(
			C_MEM_ADDR_WIDTH 		=> C_REG_ADDR_WIDTH,
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

	-- wishbone write ack/err combinatorial feedback logic + output and input logic:
	
		-- input-only mode
		IO_GEN_IN:
		if C_IO_ADDR_BIT=-2 generate
			begin
				-- in input mode the wb interface cannot write to any address
				ctrl_w_ack_i <= '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' else '0';
		end generate;
		
		-- output-only mode
		IO_GEN_OUT:
		if C_IO_ADDR_BIT=-1 generate
			begin				
				-- in output mode the wb interface can write to all addresses
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' else '0';
				ctrl_w_err_i <= '0';
				
				WB_DATA_O_GEN:
				for i in 0 to (2**C_REG_ADDR_WIDTH)-1 generate
					begin
						d_nxt(i) <= ctrl_data_o when ctrl_w_ack_i='1' and to_integer(unsigned(ctrl_addr_o))=i else d_reg(i);
				end generate;					
				
		end generate;

		-- mixed-IO mode
		IO_GEN_MIX:
		if C_IO_ADDR_BIT>=0 generate
			begin
				-- wb interface can read+write input addresses (C_IO_ADDR_BIT=1) and read output addresses (C_IO_ADDR_BIT=0)
				ctrl_w_ack_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='1' else '0';
				ctrl_w_err_i <= '1' when ctrl_we_o='1' and ctrl_addr_o(C_IO_ADDR_BIT)='0' else '0';
				
				WB_DATA_O_GEN:
				for i in 0 to (2**C_REG_ADDR_WIDTH)-1 generate
					begin
						WB_DATA_O_MUX_GEN:
						if to_unsigned(i,C_REG_ADDR_WIDTH)(C_IO_ADDR_BIT)='1' generate
							d_nxt(i) <= ctrl_data_o when ctrl_w_ack_i='1' and to_integer(unsigned(ctrl_addr_o))=i else d_reg(i);
						end generate;
				end generate;					
		end generate;

	ctrl_data_i <= d_reg(to_integer(unsigned(ctrl_addr_o)));


	-- data register(s)
	process(clk_i)
	begin	
		if rising_edge(clk_i) then
			if rst_i='1' then				
				d_reg <= (others=>(others=>'0'));
			else
				d_reg <= d_nxt;
			end if;			
		end if;
	end process;
		

	--------------------------------------------
	-- Register interface:
	--
	-- 	reg...
	--
	--	-------------------------------------
	-- INPUT-ONLY Mode:
	--		user register interface can write to and read from any address
	--
	-- OUTPUT-ONLY Mode:
	--		user register interface can read from any address, but not write
	--
	-- MIXED-IO Mode:
	--		user register interface can read+write output addresses (C_IO_ADDR_BIT=0)
	--		and read input addresses (C_IO_ADDR_BIT=1)
	--	-------------------------------------
	--
	-- Insert User Logic below this line
	
		d_nxt(0) <= x"01abcdef";
		d_nxt(1) <= x"02bcdefa";
		d_nxt(2) <= x"03cdefab";
		d_nxt(3) <= x"04defabc";
		
		led_o <= d_reg(4)(led_o'range);
	
	-- Insert User Logic above this line
	--------------------------------------------		

end structural;

