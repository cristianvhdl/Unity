----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    10:15:47 04/25/2012 
-- Design Name: 
-- Module Name:    wb2wb_mem - structural 
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

library ram_v01_00_a;
use ram_v01_00_a.all;

entity wb2wb_mem is
	generic (
		-- MEM configuration
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Memory depth/size (uTosNet mode: 6, TosNet node: 10)
		C_DATA_WIDTH 			: integer range 1 to 32 := 32;	-- Data bit size	(TosNet/uTosNet mode: 32)
		C_RAMSTYLE      		: string  := "AUTO"; 				-- DISTRIBUTED, BLOCK, AUTO
		C_IO_ADDR_BIT 			: integer range -2 to 31 := 2		-- default: 2 (uTosNet mode), MIXED-IO: [0:C_MEM_ADDR_WIDTH-1], MEM-INPUT-ONLY mode: -2, MEM-OUTPUT-ONLY mode: -1
	);
	port (
			-- wb syscon interface	
			clk_i 	: in  std_logic;
			rst_i 	: in  std_logic;
			
			-- wb slave interface 1
			wb_a_i 	: in  wb_ad32sb_if;
			wb_a_o 	: out wb_d32ae_if;
			
			-- wb slave interface 2
			wb_b_i 	: in  wb_ad32sb_if;
			wb_b_o 	: out wb_d32ae_if
	);
end wb2wb_mem;

architecture structural of wb2wb_mem is

	signal ctrl_a_we_o		: std_logic;
	signal ctrl_a_addr_o		: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal ctrl_a_data_o		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_a_data_i		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_a_w_ack_i	: std_logic;
	signal ctrl_a_w_err_i	: std_logic;
	
	signal ctrl_b_we_o		: std_logic;
	signal ctrl_b_addr_o		: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal ctrl_b_data_o		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_b_data_i		: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal ctrl_b_w_ack_i	: std_logic;
	signal ctrl_b_w_err_i	: std_logic;	
	
	signal wb_a_mem_we_i		: std_logic;
	signal wb_a_mem_addr_i	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal wb_a_mem_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_a_mem_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);	

	signal wb_b_mem_we_i		: std_logic;
	signal wb_b_mem_addr_i	: std_logic_vector(C_MEM_ADDR_WIDTH-1 downto 0);	
	signal wb_b_mem_data_i	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal wb_b_mem_data_o	: std_logic_vector(C_DATA_WIDTH-1 downto 0);
	
begin

	-- Wishbone Slave memory controller A
	wb_slv_mem_ctrl_inst_a : entity work.wb_slv_mem_ctrl
		generic map(
			C_MEM_ADDR_WIDTH 		=> C_MEM_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_a_i,
			wb_o 	=> wb_a_o,
			
			-- mem interface
			mem_addr_o  => ctrl_a_addr_o,
			mem_we_o    => ctrl_a_we_o,
			mem_data_o  => ctrl_a_data_o,
			mem_data_i	=> ctrl_a_data_i,
			mem_w_ack_i	=> ctrl_a_w_ack_i,
			mem_w_err_i	=> ctrl_a_w_err_i
		);

	-- Wishbone Slave memory controller B
	wb_slv_mem_ctrl_inst_b : entity work.wb_slv_mem_ctrl
		generic map(
			C_MEM_ADDR_WIDTH 		=> C_MEM_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH
		)
		port map( 
			-- wb syscon interface	
			clk_i => clk_i,
			rst_i => rst_i,
			
			-- wb slave interface
			wb_i 	=> wb_b_i,
			wb_o 	=> wb_b_o,
			
			-- mem interface
			mem_addr_o  => ctrl_b_addr_o,
			mem_we_o    => ctrl_b_we_o,
			mem_data_o  => ctrl_b_data_o,
			mem_data_i	=> ctrl_b_data_i,
			mem_w_ack_i	=> ctrl_b_w_ack_i,
			mem_w_err_i	=> ctrl_b_w_err_i
		);

	-- write ack/err combinatorial feedback logic:
			
		-- BI-AO mode
		IO_GEN_IN:
		if C_IO_ADDR_BIT=-2 generate
			begin
				-- in BI-AO mode the wb_a interface cannot write to any address
				ctrl_a_w_ack_i <= '0';
				ctrl_a_w_err_i <= '1' when ctrl_a_we_o='1' else '0';
				
				-- in BI-AO mode the wb_b interface can write to all addresses
				ctrl_b_w_ack_i <= '1' when ctrl_b_we_o='1' else '0';
				ctrl_b_w_err_i <= '0';
		end generate;
		
		-- AI-BO mode
		IO_GEN_OUT:
		if C_IO_ADDR_BIT=-1 generate
			begin
				-- in AI-BO mode the wb_a interface can write to all addresses
				ctrl_a_w_ack_i <= '1' when ctrl_a_we_o='1' else '0';
				ctrl_a_w_err_i <= '0';
				
				-- in AI-BO mode the wb_b interface cannot write to any address
				ctrl_b_w_ack_i <= '0';
				ctrl_b_w_err_i <= '1' when ctrl_b_we_o='1' else '0';
		end generate;

		-- mixed-IO mode
		IO_GEN_MIX:
		if C_IO_ADDR_BIT>=0 generate
			begin
				-- in mixed mode the wb_a interface can read+write input addresses (C_IO_ADDR_BIT=1) and read output addresses (C_IO_ADDR_BIT=0)
				ctrl_a_w_ack_i <= '1' when ctrl_a_we_o='1' and ctrl_a_addr_o(C_IO_ADDR_BIT)='1' else '0';
				ctrl_a_w_err_i <= '1' when ctrl_a_we_o='1' and ctrl_a_addr_o(C_IO_ADDR_BIT)='0' else '0';
				
				-- in mixed mode the wb_b interface can read+write output addresses (C_IO_ADDR_BIT=0) and read input addresses (C_IO_ADDR_BIT=1)
				ctrl_b_w_ack_i <= '1' when ctrl_b_we_o='1' and ctrl_b_addr_o(C_IO_ADDR_BIT)='0' else '0';
				ctrl_b_w_err_i <= '1' when ctrl_b_we_o='1' and ctrl_b_addr_o(C_IO_ADDR_BIT)='1' else '0';
		end generate;
	
	
	-- wb_a control <> memory signal mapping
	wb_a_mem_we_i 		<= ctrl_a_w_ack_i;
	wb_a_mem_addr_i 	<= ctrl_a_addr_o;
	wb_a_mem_data_i 	<= ctrl_a_data_o;
	ctrl_a_data_i 		<= wb_a_mem_data_o;
	
	-- wb_b control <> memory signal mapping
	wb_b_mem_we_i 		<= ctrl_b_w_ack_i;
	wb_b_mem_addr_i 	<= ctrl_b_addr_o;
	wb_b_mem_data_i 	<= ctrl_b_data_o;
	ctrl_b_data_i 		<= wb_b_mem_data_o;
	
	
	-- Dual ported memory
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
			we_a_i     => wb_a_mem_we_i,
			addr_a_i   => wb_a_mem_addr_i,
			data_a_i   => wb_a_mem_data_i,
			data_a_o   => wb_a_mem_data_o,

			clk_b_i    => clk_i,
			enable_b_i => '1',
			we_b_i     => wb_b_mem_we_i,
			addr_b_i   => wb_b_mem_addr_i,
			data_b_i   => wb_b_mem_data_i,
			data_b_o   => wb_b_mem_data_o
			);

end structural;