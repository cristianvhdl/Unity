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
--! @brief        RAM RWR module:
--!
--!               This module implement a true dual ported memory 
--!               with one read/write port and one read only port.
--!               The dual ported memory can be implement either as 
--!               BLOCK ram or logic (luts+registers).
--!               The implementation style can be directed using the
--!               RAMSTYLE generic:
--!                   "BLOCK"        : implements the memory as BLOCK ram
--!                   "AUTO"         : implements the memory as BLOCK or LUT ram depending on what is most efficient. 
--!                   "DISTRIBUTED"  : implements the memory as LUT ram
--!
--!               Setting the generic PIPE_REG(A/B)_EN to 1 enables 
--!               pipeline/output registers for the specified output.
--
-- Change Log:
-- ------------------------------------------------------------------------------
-- Revision 		Date    		Id					Change
--                DD/MM/YYYY
-- ---------------------------------------------------------
-- Revision 0.01	06/01/2011	Anders Lange 	File Created (Tested in Behavioral simulation)
-- Revision 0.02  17/01/2011  Anders Lange   PIPE_REG_EN generic + logic added to enable usage of BRAM output pipeline registers	
-- Revision 0.03  22/03/2011  Anders Lange   Individual generics added to rwr_ram to insure correct 
--                                           functionality of API Processor when C_RAM_PIPEREG_EN=1.
-- Revision 0.04  24/04/2011  Anders Lange   ram_rwr made generic (and independent of any packages) to enable reuse in all parts of the kernel.
-- Revision 0.05	28/03/2011  Anders Lange   constant bram_init to hold the initial value for the RAM, in order to make the integer generic INIT_DATA work.
-- Revision 0.06	03/01/2012	Anders Lange	Behavioral architecture replced with async_rd and sync_rd architectures.
-- Revision 0.07	
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
entity ram_rwr is
   generic ( 
      ADDR_WIDTH    : integer := 9;
      DATA_WIDTH    : integer := 32;
      RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
      PIPE_REGA_EN  : integer range 0 to 1 := 1;
      PIPE_REGB_EN  : integer range 0 to 1 := 1;
      INIT_DATA     : integer := 0
      );   
   port ( 
      clk_i : in std_logic;
      enable_i : in std_logic;
          
      addr_a_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);
      we_a_i   : in std_logic;
      data_a_i : in std_logic_vector(DATA_WIDTH-1 downto 0);
      data_a_o : out std_logic_vector(DATA_WIDTH-1 downto 0);   
      
      addr_b_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);                    
      data_b_o : out std_logic_vector(DATA_WIDTH-1 downto 0)          
      );    
end ram_rwr;

--------------------------------------------------------------------------------
-- Architecture : Async_RD
-- -------------------------------------------
-- This architecture can only be implemented as DISTRIBUTED (LUT) RAM, 
-- hence the RAMSTYLE generic has no effect on this architecture.
--------------------------------------------------------------------------------
architecture async_rd of ram_rwr is
   attribute RAM_STYLE : string;  
   
   constant bram_init : std_logic_vector(DATA_WIDTH-1 downto 0) := (std_logic_vector(TO_SIGNED(INIT_DATA, DATA_WIDTH)));
   
   type ram_type is array (2**ADDR_WIDTH-1 downto 0) of std_logic_vector (DATA_WIDTH-1 downto 0);
   signal bram: ram_type := (others=>bram_init);

   attribute RAM_STYLE of bram: signal is "DISTRIBUTED";
   
   signal data_a, data_b : std_logic_vector (DATA_WIDTH-1 downto 0);

begin

   process (clk_i)
   begin
      if rising_edge(clk_i) then
         if (enable_i = '1') then       
            -- Write
            if (we_a_i = '1') then
              bram(TO_INTEGER(unsigned(addr_a_i))) <= data_a_i;
            end if;
         end if;
      end if;
   end process;
	
	-- Read
	data_a <= bram(TO_INTEGER(unsigned(addr_a_i)));
	data_b <= bram(TO_INTEGER(unsigned(addr_b_i))); 	

   PIPEA_GEN0: 
   if PIPE_REGA_EN=0 generate
      data_a_o <= data_a;
   end generate; 

   PIPEB_GEN0: 
   if PIPE_REGB_EN=0 generate
      data_b_o <= data_b;
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
   
end async_rd;

--------------------------------------------------------------------------------
-- Architecture : Sync_RD
-- -------------------------------------------
-- This architecture can be implemented both as DISTRIBUTED (LUT) and BLOCK RAM, 
-- hence the RAMSTYLE genericcan be used to control the RAM implementation 
-- style of this architecture.
--------------------------------------------------------------------------------
architecture sync_rd of ram_rwr is
   attribute RAM_STYLE : string;  
   
   constant bram_init : std_logic_vector(DATA_WIDTH-1 downto 0) := (std_logic_vector(TO_SIGNED(INIT_DATA, DATA_WIDTH)));
   
   type ram_type is array (2**ADDR_WIDTH-1 downto 0) of std_logic_vector (DATA_WIDTH-1 downto 0);
   signal bram: ram_type := (others=>bram_init);

   attribute RAM_STYLE of bram: signal is RAMSTYLE;
   
   signal data_a, data_b : std_logic_vector (DATA_WIDTH-1 downto 0);

begin

   process (clk_i)
   begin
      if rising_edge(clk_i) then
         if (enable_i = '1') then
            -- Read First
            data_a <= bram(TO_INTEGER(unsigned(addr_a_i)));
            data_b <= bram(TO_INTEGER(unsigned(addr_b_i)));         
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
   
end sync_rd;
--------------------------------------------------------------------------------
-- End of file
--------------------------------------------------------------------------------