----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    16:37:54 05/07/2012 
-- Design Name: 
-- Module Name:    ram_tdp_test - Behavioral 
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

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity ram_tdp_test is
	  PORT (
		 clka : IN STD_LOGIC;
		 wea : IN STD_LOGIC_VECTOR(0 DOWNTO 0);
		 addra : IN STD_LOGIC_VECTOR(12 DOWNTO 0);
		 dina : IN STD_LOGIC_VECTOR(7 DOWNTO 0);
		 douta1 : OUT STD_LOGIC_VECTOR(7 DOWNTO 0);
		 douta2 : OUT STD_LOGIC_VECTOR(7 DOWNTO 0);
		 clkb : IN STD_LOGIC;
		 web : IN STD_LOGIC_VECTOR(0 DOWNTO 0);
		 addrb : IN STD_LOGIC_VECTOR(10 DOWNTO 0);
		 dinb : IN STD_LOGIC_VECTOR(31 DOWNTO 0);
		 doutb1 : OUT STD_LOGIC_VECTOR(31 DOWNTO 0);
		 doutb2 : OUT STD_LOGIC_VECTOR(31 DOWNTO 0)
	  );
end ram_tdp_test;

architecture Behavioral of ram_tdp_test is

	COMPONENT data_reg
	  PORT (
		 clka : IN STD_LOGIC;
		 wea : IN STD_LOGIC_VECTOR(0 DOWNTO 0);
		 addra : IN STD_LOGIC_VECTOR(12 DOWNTO 0);
		 dina : IN STD_LOGIC_VECTOR(7 DOWNTO 0);
		 douta : OUT STD_LOGIC_VECTOR(7 DOWNTO 0);
		 clkb : IN STD_LOGIC;
		 web : IN STD_LOGIC_VECTOR(0 DOWNTO 0);
		 addrb : IN STD_LOGIC_VECTOR(10 DOWNTO 0);
		 dinb : IN STD_LOGIC_VECTOR(31 DOWNTO 0);
		 doutb : OUT STD_LOGIC_VECTOR(31 DOWNTO 0)
	  );
	END COMPONENT;

begin

	data_reg_inst : data_reg
	  PORT MAP (
		 clka => clka,
		 wea => wea,
		 addra => addra,
		 dina => dina,
		 douta => douta1,
		 clkb => clkb,
		 web => web,
		 addrb => addrb,
		 dinb => dinb,
		 doutb => doutb1
	  );
	  
	ram_tdp_inst : entity work.ram_tdp(sp6_tdp_ram_gen)
	--ram_tdp_inst : entity work.ram_tdp(simple_tdp_ram_gen)
		generic map( 
			C_RAMSTYLE      		=> "AUTO",
			C_PORTA_DATA_WIDTH	=> 8,
			C_PORTA_ADDR_WIDTH	=> 13,
			C_PORTB_DATA_WIDTH	=> 32,
			C_PORTB_ADDR_WIDTH	=> 11,
			C_WRITE_MODE_A			=> 1,
			C_WRITE_MODE_B 		=> 1,
			C_PORTA_OUTPUT_REG  	=> 0,
			C_PORTB_OUTPUT_REG  	=> 0,
			C_INIT_DATA     		=> 0
			)
		port map(
		 clk_a_i => clka,
		 en_a_i => '1',
		 we_a_i => wea(0),
		 addr_a_i => addra,
		 din_a_i => dina,
		 dout_a_o => douta2,
		 clk_b_i => clkb,
		 en_b_i => '1',
		 we_b_i => web(0),
		 addr_b_i => addrb,
		 din_b_i => dinb,
		 dout_b_o => doutb2
		);	  


end Behavioral;

