----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    13:24:14 09/10/2012 
-- Design Name: 
-- Module Name:    wb_intercon_2slv_sw_logic - Behavioral 
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

entity wb_intercon_2slv_sw_logic is
	port ( 
			-- slave select, one-hot encoding
			ss_i		: in std_logic_vector(1 downto 0);
			
			-- wb master interface
			m0_wb_i 	: in  wb_ad32sb_if;
			m0_wb_o 	: out wb_d32ae_if;
		
			-- wb slave interface
			s0_wb_i 	: in  wb_d32ae_if;
			s0_wb_o 	: out wb_ad32sb_if;
			
			-- wb slave interface
			s1_wb_i 	: in wb_d32ae_if;
			s1_wb_o 	: out wb_ad32sb_if
	);
end wb_intercon_2slv_sw_logic;

architecture Behavioral of wb_intercon_2slv_sw_logic is

	signal slv_cyc : std_logic_vector(1 downto 0);
	signal slv_stb : std_logic_vector(1 downto 0);
	
	signal mst_ack : std_logic;
	signal mst_err : std_logic;
	signal mst_dat : std_logic_vector(31 downto 0);

begin

	----------------------------------------------------------
	-- master to slave logic
	
		-- cycle logic
		slv_cyc(0) <= m0_wb_i.cyc and ss_i(0);
		slv_cyc(1) <= m0_wb_i.cyc and ss_i(1);
		
		-- strobe logic
		slv_stb(0) <= m0_wb_i.stb and ss_i(0);
		slv_stb(1) <= m0_wb_i.stb and ss_i(1);

		-- master to slave mapping
		
			-- slave 0
			s0_wb_o.cyc <= slv_cyc(0);
			s0_wb_o.stb <= slv_stb(0);
			s0_wb_o.adr	<= m0_wb_i.adr;
			s0_wb_o.dat	<= m0_wb_i.dat;
			s0_wb_o.we	<= m0_wb_i.we;
			s0_wb_o.sgl	<= m0_wb_i.sgl;
			s0_wb_o.blk	<= m0_wb_i.blk;
			
			-- slave 1
			s1_wb_o.cyc <= slv_cyc(1);
			s1_wb_o.stb <= slv_stb(1);
			s1_wb_o.adr	<= m0_wb_i.adr;
			s1_wb_o.dat	<= m0_wb_i.dat;
			s1_wb_o.we	<= m0_wb_i.we;
			s1_wb_o.sgl	<= m0_wb_i.sgl;
			s1_wb_o.blk	<= m0_wb_i.blk;	
	
	----------------------------------------------------------
	
	----------------------------------------------------------
	-- slave to master logic
	
		-- ack logic
		mst_ack <= s0_wb_i.ack or s1_wb_i.ack;
		
		-- err logic
		mst_err <= s0_wb_i.err or s1_wb_i.err;
		
		-- data mux
		mst_dat <= s1_wb_i.dat when ss_i = "10" else
					  s0_wb_i.dat;
		
	
		-- slave to master mapping		
		m0_wb_o.dat <= mst_dat;
		m0_wb_o.ack <= mst_ack;
		m0_wb_o.err <= mst_err;
			
		
	----------------------------------------------------------

end Behavioral;