----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    14:00:00 03/27/2012 
-- Design Name: 
-- Module Name:    db_mem_pkg - structural 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--	
--		TODO..... add description
--
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - 03/27/2012 - File Created
-- Revision 0.02 - 03/30/2012 - interface records updated: direction indicator removed from record signals, record name changed from ..._type to ..._if
-- Revision 0.03 - 
--
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;

package db_mem is

	---------------------------------------------------------------------------------------------------------
	-- 
	---------------------------------------------------------------------------------------------------------
		-- DB Mem Input interface
		type db_mem_cwrm_i_if is record
			ctr  		: std_logic_vector(1 downto 0);		-- control register data
			ctr_we 	: std_logic;								-- control register we
			adr 		: std_logic_vector(31 downto 0);		-- address
			data		: std_logic_vector(31 downto 0);		-- data in	(wr)
			we 		: std_logic;								-- write enable
		end record;
		
		-- DB Mem Output interface
		type db_mem_cwrm_o_if is record
			str  		: std_logic_vector(31 downto 0);		-- status register
			w_ack  	: std_logic;								-- write acknowledge, combinatorial feedback
			w_err  	: std_logic;								-- write error (not permitted), combinatorial feedback		
			data		: std_logic_vector(31 downto 0);		-- data out (rd)
		end record;
	---------------------------------------------------------------------------------------------------------	

	---------------------------------------------------------------------------------------------------------
	-- 
	---------------------------------------------------------------------------------------------------------
		component db_mem_cwrm
			generic(
				C_IO_ADDR_BIT 	: integer range 0 to 31 		:= 2;		-- default: 2 (TosNet mode)
				C_ADDR_WIDTH 	: integer range 0 to 32 		:= 10;
				C_DATA_WIDTH 	: integer range 8 to 32 		:= 32;	-- must be in hole byte sizes i.e. [8, 16, 32, 64]		
				C_CW_TIMEOUT 	: natural 							:= 10;
				C_RST_ON_CW_TIMEOUT : integer range 0 to 1 	:= 0
			);
			port ( 
				clk_i    	: in  std_logic;
				reset_i  	: in  std_logic;
				
				-- master io
				m_db_i 		: in  db_mem_cwrm_i_if;
				m_db_o 		: out db_mem_cwrm_o_if;
				
				-- slave io
				s_db_i 		: in  db_mem_cwrm_i_if;
				s_db_o 		: out db_mem_cwrm_o_if
			);
		end component;
	---------------------------------------------------------------------------------------------------------
	
end package;


library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;
use work.db_mem.all;
use work.db_cwrm_mem;


entity db_mem_cwrm is
	generic(
		C_IO_ADDR_BIT 	: integer range 0 to 31 		:= 2;		-- default: 2 (TosNet mode)
		C_ADDR_WIDTH 	: integer range 0 to 32 		:= 10;
		C_DATA_WIDTH 	: integer range 8 to 32 		:= 32;	-- must be in hole byte sizes i.e. [8, 16, 32, 64]		
		C_CW_TIMEOUT 	: natural 							:= 10;
		C_RST_ON_CW_TIMEOUT : integer range 0 to 1 	:= 0
	);
	port ( 
		clk_i    	: in  std_logic;
      reset_i  	: in  std_logic;
		
		-- master io
		m_db_i 		: in  db_mem_cwrm_i_if;
		m_db_o 		: out db_mem_cwrm_o_if;
		
		-- slave io
		s_db_i 		: in  db_mem_cwrm_i_if;
		s_db_o 		: out db_mem_cwrm_o_if
	);
end db_mem_cwrm;

architecture structural of db_mem_cwrm is	
	
	signal m_str, s_str : std_logic_vector(7 downto 0);
	
	signal m_adr_i  : std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal m_data_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal m_data_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	
	signal s_adr_i  : std_logic_vector (C_ADDR_WIDTH-1 downto 0);
	signal s_data_i : std_logic_vector (C_DATA_WIDTH-1 downto 0);
	signal s_data_o : std_logic_vector (C_DATA_WIDTH-1 downto 0);
		
begin

	m_adr_i	<= m_db_i.adr(m_adr_i'range);
	m_data_i <= m_db_i.data(m_data_i'range);
	m_db_o.data(m_data_o'range) <= m_data_o;
	
	s_adr_i	<= s_db_i.adr(s_adr_i'range);
	s_data_i <= s_db_i.data(s_data_i'range);
	s_db_o.data(s_data_o'range) <= s_data_o;
	
	db_cwrm_mem_inst : entity work.db_cwrm_mem
		generic map(
			C_IO_ADDR_BIT 			=> C_IO_ADDR_BIT,
			C_ADDR_WIDTH 			=> C_ADDR_WIDTH,
			C_DATA_WIDTH 			=> C_DATA_WIDTH,
			C_CW_TIMEOUT 			=> C_CW_TIMEOUT,
			C_RST_ON_CW_TIMEOUT 	=> C_RST_ON_CW_TIMEOUT
		)
		port map( 
			clk_i    	=> clk_i,
			reset_i  	=> reset_i,
			
			-- master io
			m_ctr_i  	=> m_db_i.ctr,
			m_ctr_we_i 	=> m_db_i.ctr_we,
			m_str_o  	=> m_str,
					
			m_adr_i 		=> m_adr_i,
			m_data_i		=> m_data_i,
			m_we_i 		=> m_db_i.we,
			m_w_ack_o   => m_db_o.w_ack,
			m_w_err_o   => m_db_o.w_err,
			m_data_o		=> m_data_o,
			
			-- slave io
			s_ctr_i  	=> s_db_i.ctr,
			s_ctr_we_i 	=> s_db_i.ctr_we,
			s_str_o  	=> s_str,
					
			s_adr_i 		=> s_adr_i,
			s_data_i		=> s_data_i,
			s_we_i 		=> s_db_i.we,
			s_w_ack_o   => s_db_o.w_ack,
			s_w_err_o   => s_db_o.w_err,
			s_data_o		=> s_data_o
		);	
	
	m_db_o.str <= x"00" & s_str & x"00" & m_str;
	s_db_o.str <= x"00" & m_str & x"00" & s_str;
	
end structural;