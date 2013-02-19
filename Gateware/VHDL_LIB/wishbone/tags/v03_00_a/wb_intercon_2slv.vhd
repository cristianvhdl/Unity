----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    16:54:15 04/25/2012 
-- Design Name: 
-- Module Name:    wb_intercon_2slv - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Revision 0.02 - 12/10-2012 ANLAN	Module updated to use component declarations from 
--												wb_classic_pkg package.
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use work.wb_classic_pkg.all;

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb_intercon_2slv is
	generic(
		C_M0_ADDR_WIDTH	: integer range 0 to 32				:= 9;	-- must be wide enough to address all slaves
		C_S0_BASEADDR		: std_logic_vector(31 downto 0) 	:= X"00000100";
		C_S0_ENDADDR		: std_logic_vector(31 downto 0) 	:= X"0000017F"; -- 7 bit address range
		C_S1_BASEADDR		: std_logic_vector(31 downto 0) 	:= X"00000180";
		C_S1_ENDADDR		: std_logic_vector(31 downto 0) 	:= X"0000018F"  -- 4 bit address range
	);
	port ( 	
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
end wb_intercon_2slv;

architecture Behavioral of wb_intercon_2slv is

	signal slv_en  : std_logic_vector(1 downto 0);
	signal slv_cyc : std_logic_vector(1 downto 0);
	signal slv_stb : std_logic_vector(1 downto 0);
	
	signal mst_ack : std_logic;
	signal mst_err : std_logic;
	signal mst_dat : std_logic_vector(31 downto 0);

begin

	----------------------------------------------------------
	-- address decoder
	
		process(m0_wb_i)
		begin
		
			slv_en <= (others=>'0');
			
			if m0_wb_i.adr(C_M0_ADDR_WIDTH-1 downto 0) >= C_S0_BASEADDR(C_M0_ADDR_WIDTH-1 downto 0) and 
				m0_wb_i.adr(C_M0_ADDR_WIDTH-1 downto 0) <= C_S0_ENDADDR(C_M0_ADDR_WIDTH-1 downto 0) then
				slv_en <= "01";
			end if;
			
			if m0_wb_i.adr(C_M0_ADDR_WIDTH-1 downto 0) >= C_S1_BASEADDR(C_M0_ADDR_WIDTH-1 downto 0) and 
				m0_wb_i.adr(C_M0_ADDR_WIDTH-1 downto 0) <= C_S1_ENDADDR(C_M0_ADDR_WIDTH-1 downto 0) then
				slv_en <= "10";
			end if;		
			
		end process;
		
	----------------------------------------------------------
	
	----------------------------------------------------------
	-- master to slave logic
	
		-- cycle logic
		slv_cyc(0) <= m0_wb_i.cyc and slv_en(0);
		slv_cyc(1) <= m0_wb_i.cyc and slv_en(1);
		
		-- strobe logic
		slv_stb(0) <= m0_wb_i.stb and slv_en(0);
		slv_stb(1) <= m0_wb_i.stb and slv_en(1);

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
		mst_dat <= s1_wb_i.dat when slv_en = "10" else
					  s0_wb_i.dat;
		
	
		-- slave to master mapping
		
			m0_wb_o.dat <= mst_dat;
			m0_wb_o.ack <= mst_ack;
			m0_wb_o.err <= mst_err;
			
		
	----------------------------------------------------------

end Behavioral;

