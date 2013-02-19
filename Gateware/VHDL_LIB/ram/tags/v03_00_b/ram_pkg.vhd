----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    11:04:17 06/01/2011
-- Design Name: 
-- Module Name:    ram_pkg - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions:	 
-- Description:  	 
--
--		This package module declares all the components in the Unity-lib ram library
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		16/10-2012	ANLAN 	File Created
-- 3.00.a	16/10-2012	ANLAN		First release
--	3.00.b	22/10-2012	ANLAN		local lib folder removed, from ISE projects
--	3.00.c	
--
-- Additional Comments: 
--
-- -----------------------------------------------------------------------------
-- Licensing:     (c) Copyright 2012, Anders Blaabjerg Lange
--                            All Rights Reserved
--
--  This file is part of the Unity HDL Library (Unity-lib).
--
--  Unity-lib is free software: you can redistribute it and/or modify
--  it under the terms of the GNU General Public License as published by
--  the Free Software Foundation, either version 3 of the License, or
--  (at your option) any later version.
--
--  Unity-lib is distributed in the hope that it will be useful,
--  but WITHOUT ANY WARRANTY; without even the implied warranty of
--  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
--  GNU General Public License for more details.
--
--  You should have received a copy of the GNU General Public License
--  along with Unity-lib.  If not, see <http://www.gnu.org/licenses/>.
-----------------------------------------------------------------------------------

library ieee;
use ieee.std_logic_1164.all;

package ram_pkg is

	----------------------------------------------------------------------------------
	-- Dual Port RAM with 2 individual read/write ports and Byte enable
	----------------------------------------------------------------------------------
	component ram_be_rwrw is
		generic ( 
			C_ADDR_WIDTH   : integer 						:= 9;
			C_DATA_WIDTH 	: integer range 8 to 256 	:= 32;		-- must be in hole byte sizes i.e. [8, 16, 32, 64, 128, 256]
			C_DATA_RES		: integer range 8 to 256	:= 8;			-- must be in hole byte sizes i.e. [8, 16, 32, 64, 128, 256]		
			C_RAMSTYLE     : string  						:= "AUTO"; 	-- DISTRIBUTED, BLOCK, AUTO
			C_PIPE_REGA_EN : integer range 0 to 1	 	:= 1;
			C_PIPE_REGB_EN : integer range 0 to 1 		:= 1;
			C_WRITE_MODE_A : integer range 0 to 2 		:= 0;			-- 0: Read First, 1: Write First, 2: No Change
			C_WRITE_MODE_B : integer range 0 to 2 		:= 0;			-- 0: Read First, 1: Write First, 2: No Change		
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
	end component;
	
	----------------------------------------------------------------------------------
	-- Dual Port RAM with 2 individual read/write ports
	----------------------------------------------------------------------------------
	component ram_rwrw is
		generic ( 
			ADDR_WIDTH    : integer := 9;
			DATA_WIDTH    : integer := 32;
			RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
			PIPE_REGA_EN  : integer range 0 to 1 := 0;
			PIPE_REGB_EN  : integer range 0 to 1 := 0;
			WRITE_MODE_A  : integer range 0 to 2 := 0;	-- 0: Read First, 1: Write First, 2: No Change
			WRITE_MODE_B  : integer range 0 to 2 := 0;	-- 0: Read First, 1: Write First, 2: No Change
			INIT_DATA     : integer := 0
			);        
		port ( 
			clk_a_i    : in std_logic;          
			enable_a_i : in std_logic;          
			we_a_i     : in std_logic;
			addr_a_i   : in std_logic_vector(ADDR_WIDTH-1 downto 0);
			data_a_i   : in std_logic_vector(DATA_WIDTH-1 downto 0);
			data_a_o   : out std_logic_vector(DATA_WIDTH-1 downto 0);

			clk_b_i    : in std_logic;
			enable_b_i : in std_logic;
			we_b_i     : in std_logic;
			addr_b_i   : in std_logic_vector(ADDR_WIDTH-1 downto 0);
			data_b_i   : in std_logic_vector(DATA_WIDTH-1 downto 0);
			data_b_o   : out std_logic_vector(DATA_WIDTH-1 downto 0)          
			);
	end component;	
	
	----------------------------------------------------------------------------------
	-- Triple Port RAM with 1 read/write port and two read-only ports
	----------------------------------------------------------------------------------
	component ram_rwrr is
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
	end component;	

	----------------------------------------------------------------------------------
	--		This component implement a true dual ported memory 
	--    with one read/write port and one read-only port.
	--
	--    The dual ported memory can be implement either as 
	--    BLOCK ram or logic (luts+registers).
	--
	--    The implementation style can be directed using the
	--    RAMSTYLE generic:
	--    	"BLOCK"        : implements the memory as BLOCK ram
	--       "AUTO"         : implements the memory as BLOCK ram, as LUT ram can't be used as true dual port memory
	--       "DISTRIBUTED"  : implements the memory as logic, as LUT ram can't be used as true dual port memory
	--
	--    Setting the generic PIPE_REG(A/B)_EN to 1 enables 
	--    pipeline/output registers for the specified output.
	--
	----------------------------------------------------------------------------------
	component ram_rwr_sync is
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
	end component;
	
	----------------------------------------------------------------------------------
	--		This component implement a true dual ported memory 
	--    with one read/write port and one read-only port.
	--
	--		Data can be read asynchronously fromt the memory.
	--
	--    The dual ported memory is implemnented using logic (luts+registers).
	--
	--    Setting the generic PIPE_REG(A/B)_EN to 1 enables 
	--    pipeline/output registers for the specified output.
	--
	----------------------------------------------------------------------------------	
	component ram_rwr_async is
		generic ( 
			ADDR_WIDTH    : integer := 9;
			DATA_WIDTH    : integer := 32;
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
	end component;	
		
	----------------------------------------------------------------------------------
	-- Simple Dual Ported Memory with one write and one read port with independent 
	--	clock inputs and asynchronous output.
	--
	--			The async_rd architecture implements the memory as a distributed RAM 
	--			using LUTs, it provides possibility for asynchronous data output.
	--
	----------------------------------------------------------------------------------
	component ram_wr_dc_async is
		generic ( 
			ADDR_WIDTH    : integer := 9;
			DATA_WIDTH    : integer := 32;
			RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
			PIPE_REGB_EN  : integer range 0 to 1 := 0;
			INIT_DATA     : integer := 0
			);   
		port ( 
			clk_a_i 	: in std_logic;
			en_a_i 	: in std_logic;
			addr_a_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);
			we_a_i   : in std_logic;
			data_a_i : in std_logic_vector(DATA_WIDTH-1 downto 0);
			
			clk_b_i 	: in std_logic;
			en_b_i 	: in std_logic;		
			addr_b_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);                    
			data_b_o : out std_logic_vector(DATA_WIDTH-1 downto 0)          
			);    
	end component;
	
	----------------------------------------------------------------------------------
	-- Simple Dual Ported Memory with one write and one read port with independent 
	--	clock inputs and synchronous output.
	--
	--		The sync_rd architecture can implement the memory as both distributed or block RAM, 
	--		it provides a synchronous data output with an independent read clock-input	
	--
	----------------------------------------------------------------------------------	
	component ram_wr_dc_sync is
		generic ( 
			ADDR_WIDTH    : integer := 9;
			DATA_WIDTH    : integer := 32;
			RAMSTYLE      : string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
			PIPE_REGB_EN  : integer range 0 to 1 := 0;
			INIT_DATA     : integer := 0
			);   
		port ( 
			clk_a_i 	: in std_logic;
			en_a_i 	: in std_logic;
			addr_a_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);
			we_a_i   : in std_logic;
			data_a_i : in std_logic_vector(DATA_WIDTH-1 downto 0);
			
			clk_b_i 	: in std_logic;
			en_b_i 	: in std_logic;		
			addr_b_i : in std_logic_vector(ADDR_WIDTH-1 downto 0);                    
			data_b_o : out std_logic_vector(DATA_WIDTH-1 downto 0)          
			);    
	end component;	
	
	----------------------------------------------------------------------------------
	--		Simple Dual Ported Memory with support for different aspect 
	--		ratios on port_a <> port_b.
	--
	--		N.B. 
	--		This component is written for optimal usage of the FPGA (Xillinx Spartan 6) block 
	--		ram resources, the current ISE synthesis tool can't efficiently infer 
	--		more than one BlockRAM, hence if larger memories is needed, use the ram_sdp component. 
	--		The ram_sdp component can efficiently instantiate multiple ram_sdp_simple instances.
	--
	--		The current ISE synthesis tool can't synthesize this component for 
	--		devices older than Spartan6 and Virtex6.
	----------------------------------------------------------------------------------
	component ram_sdp_simple is
		generic (
			C_RAMSTYLE      		: string  := "AUTO"; 			-- DISTRIBUTED, BLOCK, AUTO
			C_PORTA_DATA_WIDTH	: integer range 0 to 36 := 8;
			C_PORTA_ADDR_WIDTH	: integer range 0 to 14 := 10;
			C_PORTB_DATA_WIDTH	: integer range 0 to 36 := 8;
			C_PORTB_ADDR_WIDTH	: integer range 0 to 14 := 10;
			C_OUTPUT_REG  			: integer range 0 to 1  := 0;	-- 0: Pipeline output registers disabled, 1: Pipeline output registers enabled
			C_INIT_DATA     		: integer := 0						-- Init data for each dataword (smallest data width)
		);
		port (
			clk_a_i    : in std_logic;
			enable_a_i : in std_logic;
			we_a_i     : in std_logic;
			addr_a_i   : in std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
			data_a_i   : in std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);

			clk_b_i    : in std_logic;
			enable_b_i : in std_logic;
			addr_b_i   : in std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
			data_b_o   : out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
		);
	end component;
		
	----------------------------------------------------------------------------------
	--		Simple Dual Ported Memory with support for different aspect 
	--		ratios on port_a <> port_b.
	--
	--			N.B. 	- Only works on Spartan/Virtex 6 and newer devices
	--					- For synthesis on older devices e.g. Spartan 3 or 
	--					  possibility for asynchronous data output use 
	--					  the ram_sdp_legacy component.
	--
	----------------------------------------------------------------------------------
	component ram_sdp is
		generic ( 
			C_RAMSTYLE      		: string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
			C_PORTA_DATA_WIDTH	: integer := 8;
			C_PORTA_ADDR_WIDTH	: integer := 13;
			C_PORTB_DATA_WIDTH	: integer := 32;
			C_PORTB_ADDR_WIDTH	: integer := 11;
			C_PORTB_OUTPUT_REG  	: integer range 0 to 1 := 0;	-- 1: Activates output (pipeline) registers
			C_INIT_DATA     		: integer := 0
			); 
		port (
			 clk_a_i		: in  std_logic;
			 en_a_i		: in  std_logic;
			 we_a_i		: in	std_logic;
			 addr_a_i	: in  std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
			 din_a_i		: in  std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
			 
			 clk_b_i		: in  std_logic;
			 en_b_i		: in  std_logic;
			 addr_b_i 	: in  std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
			 dout_b_o 	: out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
		);
	end component;	
	
	----------------------------------------------------------------------------------
	--		Simple Dual Ported Memory with support for different aspect 
	--		ratios on port_a <> port_b.
	--
	--			N.B. - Possibility of asynchronous data output.
	--				  - works on legacy devis such as Spartan 3
	--
	----------------------------------------------------------------------------------
	component ram_sdp_legacy is
		generic ( 
			C_RAMSTYLE      		: string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
			C_PORTA_DATA_WIDTH	: integer := 8;
			C_PORTA_ADDR_WIDTH	: integer := 13;
			C_PORTB_DATA_WIDTH	: integer := 32;
			C_PORTB_ADDR_WIDTH	: integer := 11;
			C_PORTB_OUTPUT_REG  	: integer range 0 to 1 := 0;	-- 1: Activates output (pipeline) registers
			C_ASYNC_OUTPUT_EN		: integer range 0 to 1 := 0;	-- 1: Enables asynchronous data output from the generated RAM, N.B. NOT AVAILABLE IN "BLOCK" MODE!
			C_INIT_DATA     		: integer := 0
			); 
		port (
			 clk_a_i		: in  std_logic;
			 en_a_i		: in  std_logic;
			 we_a_i		: in	std_logic;
			 addr_a_i	: in  std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
			 din_a_i		: in  std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
			 
			 clk_b_i		: in  std_logic;
			 en_b_i		: in  std_logic;
			 addr_b_i 	: in  std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
			 dout_b_o 	: out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
		);
	end component;	
	
	----------------------------------------------------------------------------------
	--		True Dual Ported Memory with support for different aspect 
	--		ratios on port_a <> port_b.
	--
	--		N.B. 
	--		This component is written for optimal usage of the FPGA (Xillinx Spartan 6) block 
	--		ram resources, the current ISE synthesis tool can't efficiently infer 
	--		more than one BlockRAM, hence if larger memories is needed, use the ram_tdp component. 
	--		The ram_tdp component can efficiently instantiate multiple ram_tdp_simple instanses.
	--
	--		The current ISE synthesis tool can't synthesize this module for 
	--		devices older than Spartan6 and Virtex6.
	----------------------------------------------------------------------------------
	component ram_tdp_simple is
		generic (
			C_RAMSTYLE      		: string  := "AUTO"; 			-- DISTRIBUTED, BLOCK, AUTO
			C_PORTA_DATA_WIDTH	: integer range 0 to 36 := 8;
			C_PORTA_ADDR_WIDTH	: integer range 0 to 14 := 11;
			C_PORTB_DATA_WIDTH	: integer range 0 to 36 := 32;
			C_PORTB_ADDR_WIDTH	: integer range 0 to 14 := 9;
			C_WRITE_MODE_A			: integer range 0 to 2  := 1;	-- 0: Read First, 1: Write First, 2: No Change
			C_WRITE_MODE_B 		: integer range 0 to 2  := 1;	-- 0: Read First, 1: Write First, 2: No Change
			C_PORTA_OUTPUT_REG  	: integer range 0 to 1  := 0;	-- 0: Pipeline output registers disabled, 1: Pipeline output registers enabled
			C_PORTB_OUTPUT_REG  	: integer range 0 to 1  := 0;	-- 0: Pipeline output registers disabled, 1: Pipeline output registers enabled
			C_INIT_DATA     		: integer := 0						-- Init data for each dataword (smallest data width)
		);
		port (
			clk_a_i    : in std_logic;
			enable_a_i : in std_logic;
			we_a_i     : in std_logic;
			addr_a_i   : in std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
			data_a_i   : in std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
			data_a_o   : out std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);

			clk_b_i    : in std_logic;
			enable_b_i : in std_logic;
			we_b_i     : in std_logic;
			addr_b_i   : in std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
			data_b_i   : in std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0);
			data_b_o   : out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
		);
	end component;

	----------------------------------------------------------------------------------
	--		True Dual Ported Memory with support for different aspect 
	--		ratios on port_a <> port_b.
	--
	--			N.B. 	- Only works on Spartan/Virtex 6 and newer devices
	--					- For synthesis on older devices e.g. Spartan 3 use 
	--					  the ram_tdp_legacy component
	--
	----------------------------------------------------------------------------------	
	component ram_tdp is
		generic ( 
			C_RAMSTYLE      		: string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
			C_PORTA_DATA_WIDTH	: integer := 8;
			C_PORTA_ADDR_WIDTH	: integer := 13;
			C_PORTB_DATA_WIDTH	: integer := 32;
			C_PORTB_ADDR_WIDTH	: integer := 11;
			C_WRITE_MODE_A			: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
			C_WRITE_MODE_B 		: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
			C_PORTA_OUTPUT_REG  	: integer range 0 to 1 := 0;
			C_PORTB_OUTPUT_REG  	: integer range 0 to 1 := 0;
			C_INIT_DATA     		: integer := 0
			); 
		port (
			 clk_a_i		: in  std_logic;
			 en_a_i		: in  std_logic;
			 we_a_i		: in	std_logic;
			 addr_a_i	: in  std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
			 din_a_i		: in  std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
			 dout_a_o 	: out std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
			 
			 clk_b_i		: in  std_logic;
			 en_b_i		: in  std_logic;
			 we_b_i 		: in  std_logic;
			 addr_b_i 	: in  std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
			 din_b_i 	: in  std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0);
			 dout_b_o 	: out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
		);
	end component;	

	----------------------------------------------------------------------------------
	--		True Dual Ported Memory with support for different aspect 
	--		ratios on port_a <> port_b.
	--
	--			N.B. 	- works on legacy devices such as Spartan 3
	--
	----------------------------------------------------------------------------------	
	component ram_tdp_legacy is
		generic ( 
			C_RAMSTYLE      		: string  := "AUTO"; -- DISTRIBUTED, BLOCK, AUTO
			C_PORTA_DATA_WIDTH	: integer := 8;
			C_PORTA_ADDR_WIDTH	: integer := 13;
			C_PORTB_DATA_WIDTH	: integer := 32;
			C_PORTB_ADDR_WIDTH	: integer := 11;
			C_WRITE_MODE_A			: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
			C_WRITE_MODE_B 		: integer range 0 to 2 := 1;	-- 0: Read First, 1: Write First, 2: No Change
			C_PORTA_OUTPUT_REG  	: integer range 0 to 1 := 0;
			C_PORTB_OUTPUT_REG  	: integer range 0 to 1 := 0;
			C_INIT_DATA     		: integer := 0
			); 
		port (
			 clk_a_i		: in  std_logic;
			 en_a_i		: in  std_logic;
			 we_a_i		: in	std_logic;
			 addr_a_i	: in  std_logic_vector(C_PORTA_ADDR_WIDTH-1 downto 0);
			 din_a_i		: in  std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
			 dout_a_o 	: out std_logic_vector(C_PORTA_DATA_WIDTH-1 downto 0);
			 
			 clk_b_i		: in  std_logic;
			 en_b_i		: in  std_logic;
			 we_b_i 		: in  std_logic;
			 addr_b_i 	: in  std_logic_vector(C_PORTB_ADDR_WIDTH-1 downto 0);
			 din_b_i 	: in  std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0);
			 dout_b_o 	: out std_logic_vector(C_PORTB_DATA_WIDTH-1 downto 0)
		);
	end component;	

end ram_pkg;

package body ram_pkg is
end ram_pkg;