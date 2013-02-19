----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    13:19:42 03/05/2012 
-- Design Name: 
-- Module Name:    db_cwrm_ctrl - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- This module provides a generic Master/Slave controller for 
-- use in a Double Buffered Commit-Write<>Read-Multiple Memory 
-- controller scheme primarily targeted for use with TosNet and uTosNet.
--
-- The module can be configured to work either as a Master 
-- or Slave side controller:
--
-- The Master side always reads Output addresses from 
-- the opposite memory of what the Slave side writes to!
-- I.e. the Slave side r_ptr is controlled be the Master 
-- sides w_ptr: r_ptr_slave = not(w_ptr_master)
--
-- The Slave side always reads Input addresses from 
-- the opposite memory of what the Master side writes to!
-- I.e. the Master side r_ptr is controlled be the Slave 
-- sides w_ptr: r_ptr_master = not(w_ptr_slave)
-- 
-- When the CW (Commit Write) flag of a controller is asserted the w_ptr
-- is negated and hence also the r_ptr of the opposite controller.
-- But the opposing controller will block this w_ptr<>r_ptr switch during 
-- reads of a value or values spanning multiple address locations, 
-- if the RM (Read multiple) flag is asserted.
--
-- 								  GENERICS
-- --------------------------------------------------------------
--  C_IO_ADDR_BIT : selects the address bit which determines 
--  whether the address is an input or output address.
-- --------------------------------------------------------------
--  C_WRITE_POLARITY
--
--  Input addresses: addr[C_IO_ADDR_BIT] = 1
--  Output addresses: addr[C_IO_ADDR_BIT] = 0
-- --------------------------------------------------------------
--   1 : (master mode) -> read+write input addresses, read output
--   0 : (slave mode)  -> read input addresses, read+write output
-- --------------------------------------------------------------
-- 
-- -------------------------------------------------------------- 
--  C_ADDR_WIDTH : Address bitwidth of the memory
-- --------------------------------------------------------------
--
-- --------------------------------------------------------------
--  C_DATA_WIDTH : Data bitwidth of the memory
-- --------------------------------------------------------------
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - 03/05/2012 - File Created
-- Revision 0.02 - 03/22/2012 - C_IO_ADDR_BIT generic added
-- Revision 0.03 - 03/23/2012 - w_ack_o + w_err_o outputs+logic added
-- Revision 0.04
--
-- Additional Comments: 
-- 
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

entity db_cwrm_ctrl is
	generic (		
		C_IO_ADDR_BIT : integer range 0 to 31 := 2;	-- default: 2 (TosNet mode)
		C_WRITE_POLARITY : integer range 0 to 1 := 1;			
		C_ADDR_WIDTH : integer range 0 to 64 := 10;
		C_DATA_WIDTH : integer range 8 to 64:= 32
	);
	port ( 
		clk_i 	: in  std_logic;
		reset_i 	: in  std_logic;
		
		-- user ports
		rm_i		: in  std_logic;								-- read multiple
		cw_i		: in  std_logic;								-- commit write
		cw_ack_o	: out std_logic;								-- commit write acknowledge
		
		we_i 		: in  std_logic;												-- write enable
		w_ack_o  : out std_logic;												-- write acknowledge, combinatorial feedback
		w_err_o  : out std_logic;												-- write error (not permitted), combinatorial feedback
		adr_i 	: in  std_logic_vector (C_ADDR_WIDTH-1 downto 0);	-- address
		data_i	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);	-- data in	(wr)
		data_o	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);	-- data out (rd)
		
		
		-- db cwrm ctrl ports
		bcw_i		: in std_logic;								-- block commit write input
		rp_o		: out std_logic;								-- readpointer output (writepointer negated)
		
		bcw_o		: out std_logic;								-- block commit write output
		rp_i		: in std_logic;								-- readpointer input
		
		-- memory A ports
		we_a_o	: out std_logic;
		adr_a_o 	: out std_logic_vector (C_ADDR_WIDTH-1 downto 0);
		data_a_i	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		data_a_o	: out std_logic_vector (C_DATA_WIDTH-1 downto 0);
		
		-- memory B ports
		we_b_o	: out std_logic;
		adr_b_o 	: out std_logic_vector (C_ADDR_WIDTH-1 downto 0);
		data_b_i	: in  std_logic_vector (C_DATA_WIDTH-1 downto 0);
		data_b_o	: out std_logic_vector (C_DATA_WIDTH-1 downto 0)
		);
end db_cwrm_ctrl;

architecture Behavioral of db_cwrm_ctrl is

	constant C_WPOL		 : std_logic := to_unsigned(C_WRITE_POLARITY,1)(0);
	constant C_RPOL		 : std_logic := not(C_WPOL);
	constant C_W_PTR_INIT : std_logic := C_WPOL;
	constant C_MEM_A		 : std_logic := '0';
	constant C_MEM_B		 : std_logic := '1';

	signal w_ptr : std_logic := C_W_PTR_INIT;
	signal r_ptr : std_logic;
	signal cw_reg : std_logic := '0';
	
	signal we_a : std_logic;
	signal we_b : std_logic;

begin

	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if reset_i='1' then
				w_ptr <= C_W_PTR_INIT;
				cw_reg <= '0';
			else				
				if cw_i='1' and bcw_i='0' and cw_reg='0' then
					w_ptr <= not w_ptr;
					cw_reg <= '1';
				elsif cw_i='0' then
					cw_reg <= '0';
				end if;
			end if;
		end if;
	end process;
	
	r_ptr <= rp_i;
	
	we_a <= we_i when w_ptr=C_MEM_A and adr_i(C_IO_ADDR_BIT)=C_WPOL else '0';
	we_b <= we_i when w_ptr=C_MEM_B and adr_i(C_IO_ADDR_BIT)=C_WPOL else '0';
	
	we_a_o <= we_a;
	we_b_o <= we_b;
	
	w_ack_o <= '1' when we_a='1' or we_b='1' else '0';
	w_err_o <= '1' when we_i='1' and we_a='0' and we_b='0' else '0';
	
	adr_a_o <= adr_i;
	adr_b_o <= adr_i;
	
	data_a_o <= data_i;
	data_b_o <= data_i;
	
	data_o <= data_a_i when adr_i(C_IO_ADDR_BIT)=C_RPOL and r_ptr=C_MEM_A else		-- Reads addressed toward the ReadPolarity of the controller are read from
				 data_b_i when adr_i(C_IO_ADDR_BIT)=C_RPOL and r_ptr=C_MEM_B else		-- the memory pointed to by the r_ptr (provided by the opposite controller)
				 data_a_i when adr_i(C_IO_ADDR_BIT)=C_WPOL and w_ptr=C_MEM_A else		-- Reads addressed toward the WritePolarity of the controller are read from
				 data_b_i when adr_i(C_IO_ADDR_BIT)=C_WPOL and w_ptr=C_MEM_B else		-- the memory pointed to by the w_ptr (held internally in the controller)
				 (others=>'0');
	
	rp_o <= not w_ptr;	-- the internal w_ptr (write pointer) is negated in order to 
								-- provide the read pointer fro the opposite controller
								
	bcw_o <= rm_i;			-- when the RM (read multiple) flag is set the controller blocks 
								-- any commit write attempts from the opposite controller
	
	--cw_ack_o <= cw_reg;	
	cw_ack_o <= '1' when cw_i='1' and bcw_i='0' and cw_reg='0' else '0';
								-- the commit write acknowledge flag is set if a commit write will be 
								-- succesfully executed (automatically cleared when cw_i is deasserted)

end Behavioral;

