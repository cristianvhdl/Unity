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
-- Architecture:	Spartan 6, Xilinx MicroBlaze
--
-- Design Tool: 	Xilinx ISE 12.3
--
-- HDL-Standard:	VHDL'93
--
--! @file 	      ram_rwr.vhd
--! @brief        RAM RWRR
--!
--!               This module implement a tripple ported memory 
--!               with one read/write port and two read only ports.
--!               The memory can be implement either as 
--!               BLOCK ram or logic (luts+registers).
--!               The implementation style can be directed using the
--!               RAMSTYLE generic:
--!                   "BLOCK"        : implements the memory as BLOCK ram
--!                   "AUTO"         : implements the memory as BLOCK or LUT ram depending on what is most efficient. 
--!                   "DISTRIBUTED"  : implements the memory as LUT ram
--!
--!               Setting the generic PIPE_REG(A/B/C)_EN to 1 enables 
--!               pipeline/output registers for the specified output.
--
-- Change Log:
-- ------------------------------------------------------------------------------
-- Revision 		Date    		Id					Change
--                DD/MM/YYYY
-- ---------------------------------------------------------
-- Revision 0.01	24/03/2011	Anders Lange 	File Created
-- Revision 0.02	28/03/2011  Anders Lange   constant bram_init to hold the initial value for the RAM, in order to make the integer generic INIT_DATA work.
-- Revision 0.03	
--
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
entity ram_rwrr is
   generic ( 
      ADDR_WIDTH    : integer := 9;
      DATA_WIDTH    : integer := 32;
      RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
      PIPE_REGA_EN  : integer range 0 to 1 := 1;
      PIPE_REGB_EN  : integer range 0 to 1 := 1;
      PIPE_REGC_EN  : integer range 0 to 1 := 1;
      INIT_DATA     : integer := 0
      );   
   port ( 
      clk_i     : in  std_logic;      
      enable_i  : in std_logic;
            
      addr_a_i  : in  std_logic_vector (ADDR_WIDTH-1 downto 0);
      we_a_i    : in  std_logic;
      data_a_i  : in  std_logic_vector (DATA_WIDTH-1 downto 0);      
      data_a_o  : out std_logic_vector (DATA_WIDTH-1 downto 0);
      
      addr_b_i  : in  std_logic_vector (ADDR_WIDTH-1 downto 0);
      data_b_o  : out std_logic_vector (DATA_WIDTH-1 downto 0);
      
      addr_c_i  : in  std_logic_vector (ADDR_WIDTH-1 downto 0);
      data_c_o  : out std_logic_vector (DATA_WIDTH-1 downto 0)      
      );   
end ram_rwrr;

--------------------------------------------------------------------------------
-- Architecture
--------------------------------------------------------------------------------
architecture Behavioral of ram_rwrr is
   attribute RAM_STYLE : string;  
   
   constant bram_init : std_logic_vector(DATA_WIDTH-1 downto 0) := (std_logic_vector(TO_SIGNED(INIT_DATA, DATA_WIDTH)));
   
   type ram_type is array (2**ADDR_WIDTH-1 downto 0) of std_logic_vector (DATA_WIDTH-1 downto 0);
   signal bram: ram_type := (others=>bram_init);
   attribute RAM_STYLE of bram: signal is RAMSTYLE;
   
   signal data_a, data_b, data_c : std_logic_vector (DATA_WIDTH-1 downto 0);

begin

   process (clk_i)
   begin
      if rising_edge(clk_i) then
         if (enable_i = '1') then
            -- Read First
            data_a <= bram(TO_INTEGER(unsigned(addr_a_i)));
            data_b <= bram(TO_INTEGER(unsigned(addr_b_i))); 
            data_c <= bram(TO_INTEGER(unsigned(addr_c_i))); 
            -- Write Last
            if (we_a_i = '1') then
              bram(TO_INTEGER(unsigned(addr_a_i))) <= data_a_i;
            end if;
         end if;
      end if;
   end process;

   PIPEA_GEN0: 
   if PIPE_REGA_EN=0 generate
      data_a_o <= data_a;
   end generate; 

   PIPEB_GEN0: 
   if PIPE_REGB_EN=0 generate
      data_b_o <= data_b;
   end generate; 

   PIPEC_GEN0: 
   if PIPE_REGC_EN=0 generate
      data_c_o <= data_c;
   end generate; 

   PIPEA_GEN1: 
   if PIPE_REGA_EN=1 generate
      process (clk_i)
      begin
         if rising_edge(clk_i) then
            if (PIPE_REGA_EN = 1) then
               data_a_o <= data_a;
            end if;
         end if;
      end process;
   end generate; 

   PIPEB_GEN1: 
   if PIPE_REGB_EN=1 generate
      process (clk_i)
      begin
         if rising_edge(clk_i) then
            if (PIPE_REGB_EN = 1) then
               data_b_o <= data_b;
            end if;
         end if;
      end process;
   end generate;     

   PIPEC_GEN1: 
   if PIPE_REGC_EN=1 generate
      process (clk_i)
      begin
         if rising_edge(clk_i) then
            if (PIPE_REGC_EN = 1) then
               data_c_o <= data_c;
            end if;
         end if;
      end process;
   end generate; 
   
end Behavioral;
--------------------------------------------------------------------------------
-- End of file
--------------------------------------------------------------------------------