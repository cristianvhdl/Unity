--------------------------------------------------------------------------------       
--    	    University of Southern Denmark - Faculty of Engineering
--
--                                Master Thesis
--
--                                   HartOS
--        Hardware implemented Advanced hard Real Time Operating System
--
--                (c) Copyright 2010, Anders Blaabjerg Lange
--                            All Rights Reserved
--
--
--! Architecture:	Spartan 6, Xilinx MicroBlaze
--!
--! Design Tool: 	Xilinx ISE 12.3
--!
--! HDL-Standard:	VHDL'93
--!
--! Modulename: 	ram_be_rwrw.vhd
--!
--! Description: 	This module implement a true dual ported memory 
--!               with byte select (sel) support on two independent read/write ports.
--!
--!					The byte select feature works on both writes (as byte write enable)
--!					and on reads (as byte read enable)
--!					
--!               The dual ported memory can be implement either as 
--!               BLOCK ram or logic (luts+registers).
--!               The implementation style can be directed using the
--!               C_RAMSTYLE generic:
--!                   "BLOCK"        : implements the memory as BLOCK ram
--!                   "AUTO"         : implements the memory as BLOCK ram, as LUT ram can't be used as true dual port memory
--!                   "DISTRIBUTED"  : implements the memory as logic, as LUT ram can't be used as true dual port memory
--!
--!               Setting the generic C_PIPE_REG_EN to 1 enables 
--!               pipeline/output registers.
--!
--! Dependencies:
--!
--!
--! Change Log:
--!------------------------------------------------------------------------------
--! Revision 		Date    		Id					Change
--!               DD/MM/YYYY
--! ---------------------------------------------------------
--! Revision 0.01	22/03/2012	Anders Lange 	File Created
--! Revision 0.02 26/03/2012	Anders Lange	pipeline registers added on sel inputs 
--! Revision 0.03 
--!
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
-- Libraries
--------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

--------------------------------------------------------------------------------
-- Entity
--------------------------------------------------------------------------------
entity ram_be_rwrw is
   generic ( 
      C_ADDR_WIDTH   : integer 						:= 9;
		C_DATA_WIDTH 	: integer range 8 to 256 	:= 32;	-- must be in hole byte sizes i.e. [8, 16, 32, 64, 128, 256]
		C_DATA_RES		: integer range 8 to 256	:= 8;	-- must be in hole byte sizes i.e. [8, 16, 32, 64, 128, 256]		
      C_RAMSTYLE     : string  						:= "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
      C_PIPE_REGA_EN : integer range 0 to 1	 	:= 1;
      C_PIPE_REGB_EN : integer range 0 to 1 		:= 1;
      C_INIT_DATA    : integer 						:= 0
      );        
   port ( 
      clk_a_i    : in std_logic;          
      enable_a_i : in std_logic;          
      we_a_i     : in std_logic;
		sel_a_i	  : in std_logic_vector ((C_DATA_WIDTH/C_DATA_RES)-1 downto 0);
      addr_a_i   : in std_logic_vector(C_ADDR_WIDTH-1 downto 0);
      data_a_i   : in std_logic_vector(C_DATA_WIDTH-1 downto 0);
      data_a_o   : out std_logic_vector(C_DATA_WIDTH-1 downto 0);

      clk_b_i    : in std_logic;
      enable_b_i : in std_logic;
      we_b_i     : in std_logic;
		sel_b_i	  : in std_logic_vector ((C_DATA_WIDTH/C_DATA_RES)-1 downto 0);
      addr_b_i   : in std_logic_vector(C_ADDR_WIDTH-1 downto 0);
      data_b_i   : in std_logic_vector(C_DATA_WIDTH-1 downto 0);
      data_b_o   : out std_logic_vector(C_DATA_WIDTH-1 downto 0)          
      );
end ram_be_rwrw;

--------------------------------------------------------------------------------
-- Architecture
--------------------------------------------------------------------------------
architecture Behavioral of ram_be_rwrw is

	constant C_MEM_CNT : integer := C_DATA_WIDTH/C_DATA_RES;

	signal we_a : std_logic_vector((C_DATA_WIDTH/C_DATA_RES)-1 downto 0);
	signal we_b : std_logic_vector((C_DATA_WIDTH/C_DATA_RES)-1 downto 0);

	signal data_a : std_logic_vector(C_DATA_WIDTH-1 downto 0);
	signal data_b : std_logic_vector(C_DATA_WIDTH-1 downto 0);

	signal sel_a_i_reg : std_logic_vector((C_DATA_WIDTH/C_DATA_RES)-1 downto 0) := (others=>'0');
	signal sel_b_i_reg : std_logic_vector((C_DATA_WIDTH/C_DATA_RES)-1 downto 0) := (others=>'0');

begin

	process(clk_a_i)
	begin
		if rising_edge(clk_a_i) and enable_a_i='1' then
			sel_a_i_reg <= sel_a_i;
		end if;
	end process;
	
	process(clk_b_i)
	begin
		if rising_edge(clk_b_i) and enable_b_i='1' then
			sel_b_i_reg <= sel_b_i;
		end if;
	end process;	

	MEM_GEN:
   for i in 0 to C_MEM_CNT-1 generate
      begin

		we_a(i) <= we_a_i and sel_a_i(i);
		we_b(i) <= we_b_i and sel_b_i(i);

		ram : entity work.ram_rwrw
			generic map( 
				ADDR_WIDTH    => C_ADDR_WIDTH,
				DATA_WIDTH    => C_DATA_RES,
				RAMSTYLE      => C_RAMSTYLE,
				PIPE_REGA_EN  => C_PIPE_REGA_EN,
				PIPE_REGB_EN  => C_PIPE_REGB_EN,
				INIT_DATA     => C_INIT_DATA
				)
			port map( 
				clk_a_i    => clk_a_i,
				enable_a_i => enable_a_i,
				we_a_i     => we_a(i),
				addr_a_i   => addr_a_i,
				data_a_i   => data_a_i((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i),
				data_a_o   => data_a((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i),

				clk_b_i    => clk_b_i,
				enable_b_i => enable_b_i,
				we_b_i     => we_b(i),
				addr_b_i   => addr_b_i,
				data_b_i   => data_b_i((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i),
				data_b_o   => data_b((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i)
				);  

		data_a_o((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i) <= data_a((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i) when sel_a_i_reg(i)='1' else (others=>'0');
		data_b_o((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i) <= data_b((C_DATA_RES*(i+1))-1 downto C_DATA_RES*i) when sel_b_i_reg(i)='1' else (others=>'0');

   end generate;

end Behavioral;
--------------------------------------------------------------------------------
-- End of file
--------------------------------------------------------------------------------