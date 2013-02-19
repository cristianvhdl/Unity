----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange	(ANLAN)
-- 
-- Create Date:    15:37:00 06/04-2010 
-- Design Name: 
-- Module Name:    Fifo - Behavioral 
-- Project Name: 
-- Target Devices: Spartan3, Spartan6 and Virtex6
-- Tool versions:	 
-- Description: 
--
--		Parameterized Asynchronous/Synchronous FIFO
--
--		Default generic config:
--			ADDR_WIDTH 		= 4 		- Register depth: 16 (4 address bits)
--			DATA_WIDTH 		= 4 		- Data width: 4 bit
--			CLOCK_MODE 		= 1 		- Asynchronous Fifo mode (enabled)
--			SYNC_DEPTH 		= 2 		- Synchronizer depth: 2 levels
--			PRE_LOAD   		= 2 		- Pre load number: 2 words
--			EN_WRT_ACK 		= 0 		- Write acknowledge (enabled)
--			READ_MODE		= 1		- Synchronous data output enabled
--			PRE_SP6_MODE	= 0		- Pre Spartan 6 compatibility mode disabled
--			RAMSTYLE			= "AUTO"	- RAM implementation style is AUTO
--			
--
-- Dependencies:
--			
--			FifoCtrl.vhd
--				FifoReadPort.vhd
--				FifoWritePort.vhd
--				Synchroniser.vhd
--			
--			ram_sdp.vhd					(ram_v02_50_a)
--				ram_sdp_simple.vhd	(ram_v02_50_a)
--				ram_wr_dc.vhd			(ram_v02_50_a)
--				util_pkg.vhd			(utility_v01_00_a)
--				log_pkg.vhd				(utility_v01_00_a)
--
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01 		06/04-2010	ANLAN		File Created
-- 0.02 		17/04-2010	ANLAN		Logic added to prevent write to the ram when the fifo is full
--						 					and to make the fifo output 0's if the fifo is empty.
-- 0.03 		23/04-2010	ANLAN		SYNC_DEPTH generic added and fifo_ctrl component declaration and instantiation updated.
-- 0.04 		10/05-2010	ANLAN		Copyright conditions & disclamer added.
-- 0.05 		01/06-2010	ANLAN		wr_ack_o functionality added.
-- 0.06 		12/06-2010	ANLAN		PRE_LOAD generic added.
-- 1.00  	12/06-2010	ANLAN		Offical release
-- 1.90		06/11-2010 	ANLAN		MODE_ASYNC generic + conditional synthesis code added for support of synchronous and asynchronous fifo modes
-- 1.91		06/11-2010 	ANLAN		New Header & Copyright added, old Copyright conditions & disclamer removed
-- 2.00  	10/10-2012	ANLAN		New Header & Copyright added (Unity), MODE_ASYNC generic renamed to CLOCK_MODE.
--											Regfile2.vhd replaced by ram_sdp.vhd from the ram_v02_50_a library, providing support 
--											for both distributed and Block-RAM memory implementations.
--											READ_MODE, PRE_SP6_MODE, RAMSTYLE generics added.
-- 2.01		
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
----------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

library ram_v02_50_a;
use ram_v02_50_a.all;

entity fifo is
   generic(	ADDR_WIDTH	: 	positive					:=  4;				-- Reg file address width / Fifo depth = 2**ADDR_WIDTH
				DATA_WIDTH	: 	positive					:=  4;				-- Data width
				CLOCK_MODE	: 	natural range 0 to 1 :=  1;    			-- Fifo clocking scheme: 0 -> synchronous, 1 -> asynchronous
				SYNC_DEPTH	: 	natural range 1 to 8 :=  2;				-- Synchronizer depth (asynch mode only)
				PRE_LOAD		: 	natural					:=  2;				-- Write<>Read Ptr offset before deasserting empty signal (read logic)
				EN_WRT_ACK	: 	natural range 0 to 1 :=  0;    			-- Write acknowledge; 0 -> disabled, 1 -> enabled				
				READ_MODE	:	natural range 0 to 1 :=  1;				-- 0 -> async read data_out (DISTRIBUTED RAM ONLY), 1 -> sync read data_out
				PRE_SP6_MODE:  natural range 0 to 1 :=  0;				-- 0 -> disable, 1 -> Pre Spartan6 compatibility mode
				RAMSTYLE		:	string 					:= "AUTO"			-- AUTO, BLOCK, DISTRIBUTED (only has effect if SYNC_RD=1 or 2)
	);
   port(
		clk_i				: in std_logic;
		
   	-- Input clock domain
      clkw_asynch_i	: in std_logic;
      wr_i				: in std_logic;
      data_in_i 		: in std_logic_vector(DATA_WIDTH-1 downto 0);
      wr_ack_o 		: out std_logic;
		full_o			: out std_logic;
		
      -- Output clock domain
      clkr_asynch_i	: in std_logic;
      rd_i				: in std_logic;
      data_out_o 		: out std_logic_vector(DATA_WIDTH-1 downto 0);
      empty_o			: out std_logic;
		
      -- Common inputs
      reset_i 			: in std_logic
	);
end fifo;

architecture str_arch of fifo is

	-- Internal signals mapped to IO ports
	signal clkw					: std_logic;
	signal wr, ramwr			: std_logic;
	signal data_in 			: std_logic_vector(DATA_WIDTH-1 downto 0);
	signal wr_ack				: std_logic;
	signal full					: std_logic;
	signal clkr					: std_logic;
	signal rd, r_en			: std_logic;
	signal data_out 			: std_logic_vector(DATA_WIDTH-1 downto 0);
	signal empty, empty_reg	: std_logic;
	signal reset				: std_logic;
	
	-- Signals for internal interconnect
	signal w_addr, r_addr	: std_logic_vector(ADDR_WIDTH-1 downto 0);				

begin

	-- Input
	clkw <= clkw_asynch_i when CLOCK_MODE = 1 else clk_i;
	clkr <= clkr_asynch_i when CLOCK_MODE = 1 else clk_i;
	
	wr <= wr_i;
	ramwr <= wr when full='0' else '0';
	data_in <= data_in_i;

	rd <= rd_i;
	reset <= reset_i;
	
	-- Component instantiation and wiring
	fifo_ctrl_inst : entity work.fifo_ctrl
		generic map(	
			ADDR_WIDTH => ADDR_WIDTH,
			SYNC_DEPTH => SYNC_DEPTH,
			CLOCK_MODE => CLOCK_MODE,
			READ_MODE  => READ_MODE,
			PRE_LOAD   => PRE_LOAD
		)						
		port map(		
			clkw_i 	=> clkw,
			resetw_i => reset,
			wr_i 		=> wr,
			full_o	=> full,
			w_addr_o => w_addr,
			clkr_i 	=> clkr,
			resetr_i => reset,
			rd_i 		=> rd,
			empty_o 	=> empty,
			r_addr_o => r_addr,
			r_en_o	=> r_en
		);


	ASYNC_RAM_GEN:
	if READ_MODE=0 generate
		begin
		
		-- Asynchronous Read Mode
		regfile : entity ram_v02_50_a.ram_sdp(simple_sdp_ram_gen)
			generic map(
				C_RAMSTYLE      		=> "DISTRIBUTED",
				C_PORTA_DATA_WIDTH	=> DATA_WIDTH,
				C_PORTA_ADDR_WIDTH	=> ADDR_WIDTH,
				C_PORTB_DATA_WIDTH	=> DATA_WIDTH,
				C_PORTB_ADDR_WIDTH	=> ADDR_WIDTH,
				C_PORTB_OUTPUT_REG	=> 0,
				C_ASYNC_OUTPUT_EN		=> 1,
				C_INIT_DATA     		=> 0
			)
			port map(
				clk_a_i    => clkw,
				en_a_i 	  => '1',
				we_a_i     => ramwr,
				addr_a_i   => w_addr,
				din_a_i    => data_in,

				clk_b_i    => '0',
				en_b_i 	  => '1',
				addr_b_i   => r_addr,
				dout_b_o   => data_out
			);

	end generate;

	SYNC_RAM_GEN1:
	if READ_MODE=1 and PRE_SP6_MODE=0 generate
		begin
		
		-- Synchronous Read Mode (SPARTAN6 and above)
		regfile : entity ram_v02_50_a.ram_sdp(sp6_sdp_ram_gen)
			generic map(
				C_RAMSTYLE      		=> RAMSTYLE,
				C_PORTA_DATA_WIDTH	=> DATA_WIDTH,
				C_PORTA_ADDR_WIDTH	=> ADDR_WIDTH,
				C_PORTB_DATA_WIDTH	=> DATA_WIDTH,
				C_PORTB_ADDR_WIDTH	=> ADDR_WIDTH,
				C_PORTB_OUTPUT_REG	=> 0,
				C_ASYNC_OUTPUT_EN		=> 0,
				C_INIT_DATA     		=> 0
			)
			port map(
				clk_a_i    => clkw,
				en_a_i 	  => '1',
				we_a_i     => ramwr,
				addr_a_i   => w_addr,
				din_a_i    => data_in,

				clk_b_i    => clkr,
				en_b_i 	  => r_en,
				addr_b_i   => r_addr,
				dout_b_o   => data_out
			);
			
	end generate;
	
	SYNC_RAM_GEN2:
	if READ_MODE=1 and PRE_SP6_MODE=1 generate
		begin
		
		-- Synchronous Read Mode (PRE SPARTAN6 "compatibility mode")
		regfile : entity ram_v02_50_a.ram_sdp(simple_sdp_ram_gen)
			generic map(
				C_RAMSTYLE      		=> RAMSTYLE,
				C_PORTA_DATA_WIDTH	=> DATA_WIDTH,
				C_PORTA_ADDR_WIDTH	=> ADDR_WIDTH,
				C_PORTB_DATA_WIDTH	=> DATA_WIDTH,
				C_PORTB_ADDR_WIDTH	=> ADDR_WIDTH,
				C_PORTB_OUTPUT_REG	=> 0,
				C_ASYNC_OUTPUT_EN		=> 0,
				C_INIT_DATA     		=> 0
			)
			port map(
				clk_a_i    => clkw,
				en_a_i 	  => '1',
				we_a_i     => ramwr,
				addr_a_i   => w_addr,
				din_a_i    => data_in,

				clk_b_i    => clkr,
				en_b_i 	  => r_en,
				addr_b_i   => r_addr,
				dout_b_o   => data_out
			);
			
	end generate;

	-- Write acknowledge process
	process(clkw)
	begin
		if(clkw'event and clkw='1') then
			wr_ack <= '0'; -- reset
			if(wr='1') then -- write enable
				if(full='0') then 	
					wr_ack <= '1';
				end if;
			end if;
		end if;
	end process;
	
	-- Output logic
	wr_ack_o <= wr_ack when EN_WRT_ACK = 1 else '0';
	full_o <= full;		
	empty_o <= empty;
	data_out_o <= data_out when empty='0' else (others=>'0');

end str_arch;