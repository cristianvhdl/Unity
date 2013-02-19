----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange  
-- 
-- Create Date:    12:42:04 03/04-2012 
-- Design Name: 
-- Module Name:    wb_mst_ctrl - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone master controller component providing a wishbone 
--		master interface to BII (Bus Independent Interface).
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  Wishbone MASTER BUS controller with   |
--	 |								|	1-bit granularity on data-width and   |
--	 |								|	address-width 								  |
--  -----------------------------------------------------------------
--	 |	Wishbone version 		| 	Protocol version B4 						  |
--  -----------------------------------------------------------------
--	 |	Supported cycles		| 	MASTER, READ/WRITE						  |
--	 |								| 	MASTER, BLOCK READ/WRITE				  |
--  -----------------------------------------------------------------
--  |	Data port:				|													  | 
--	 |		size					|	1-32 bit (QWORD)							  |
--	 |		granularity  		|	1-bit     									  |
--	 |		max. operand size	|	32-bit (QWORD)								  |
--  |	Data transfer: 		|													  |
--	 |		ordering  			|	LITTLE ENDIAN								  |
--  |		sequence    		|	UNDEFINED									  |
--	 -----------------------------------------------------------------
--	 | 							SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | COMPONENT SIGNAL 	| WB SIGNAL 	| DESCRIPTION		  			  |
--	 -----------------------------------------------------------------
--	 | clk_i					| CLK_I			| master clock input			  |
--	 | rst_i					| RST_I			| master reset input			  |
--	 |							|					|									  |
--	 | wb_o 				  	|  				| (record type: wb_ad32sb_if)|
--	 |  .cyc					| CYC_O			| master cycle output		  |
--	 |  .stb					| STB_O			| master strobe output		  |
--	 |  .adr					| ADR_O			| master addr output			  |
--	 |  .dat					| DAT_O			| master data output			  |
--	 |  .we					| WE_O			| master write enable output |
--	 |  .sgl					| TGC_O()		| master cycle-tag output	  |
--	 |  .blk					| TGC_O()		| master cycle-tag output	  |
--	 |							|					|									  |
--	 | wb_i 				  	|  				| (record type: wb_d32ae_if) |
--	 |  .dat					| DAT_I			| master data input			  |
--	 |  .ack					| ACK_I			| master acknowledge input	  |
--	 |  .err					| ERR_I			| master error input			  |
--	 -----------------------------------------------------------------
--	 | 						TAG SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | SIGNAL NAME	| TAG TYPE	| DESCRIPTION								  |
--	 -----------------------------------------------------------------
--	 | wb_o.sgl		| TGC_O		| marks a cycle as a single access	  |
--	 | wb_o.blk		| TGC_O		| marks a cycle as a block access	  |
--	 -----------------------------------------------------------------
--
-- Dependencies:
--
--		work.wb_classic_pkg.all
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		03/04-2012	ANLAN		File Created
-- 0.02		12/10-2012 	ANLAN		Module updated to use component declarations from 
--											wb_classic_pkg package.
-- 1.00		19/10-2012	ANLAN		Headers, comments and licensing info updated.
-- 1.01		
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
use work.wb_classic_pkg.all;	

-- *********************** ATTENTION ***********************
--
-- THIS MODULE IS PART OF THE wb_classic_pkg PACKAGE
--
-- REMEMBER TO UPDATE THE COMPONENT DECLARATION IN 
-- THE PACKAGE FILE IF THE ENTITY IS CHANGED!
--
-- *********************************************************

entity wb_mst_ctrl is
	generic (
		C_ADDR_WIDTH 		: integer range 0 to 32 := 6;		-- Adressable memory depth/size
		C_DATA_WIDTH 		: integer range 1 to 32 := 32 	-- Data bit size
	);
	port ( 
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb master interface
		wb_o 	: out wb_ad32sb_if;
		wb_i 	: in  wb_d32ae_if;
		
		-- BII interface
		en_i	: in  std_logic;												-- enable (keep high during a cycle/block)
		we_i	: in  std_logic;												-- write enable: write=1, read=0 (must not change during a cycle/block)
		blk_i : in  std_logic;												-- block mode: block=1, single=0
		nxt_i	: in  std_logic;												-- has next (valid in block mode), set to 1 if current is not the last read/write in the block (update synchronous to clock when done=1)
		adr_i	: in  std_logic_vector(C_ADDR_WIDTH-1 downto 0);	-- address in	(clock synchronous update when done=1)
		dat_i	: in  std_logic_vector(C_DATA_WIDTH-1 downto 0);	-- data in (write) (update synchronous to clock when done=1)
		dat_o	: out std_logic_vector(C_DATA_WIDTH-1 downto 0);	-- data out (read) (update synchronous to clock when done=1)
		done_o: out std_logic;												-- done strobe	 (Success)
		err_o : out std_logic												-- error strobe (Failure)
	);
end wb_mst_ctrl;

architecture Behavioral of wb_mst_ctrl is

   type states is (IDLE, SGL, BLK1, BLK2, ERR); 
   signal state_reg : states := IDLE; 	
	signal state_nxt : states;
	
	signal we_i_reg : std_logic := '0';
	signal we_i_nxt : std_logic;

begin

	process(clk_i)
	begin
		if rising_edge(clk_i) then
			if rst_i='1' then
				state_reg <= IDLE;
				we_i_reg  <= '0';
			else
				state_reg <= state_nxt;
				we_i_reg  <= we_i_nxt;
			end if;
		end if;
	end process;
	
	process(state_reg, wb_i, en_i, blk_i, we_i, we_i_reg, adr_i, dat_i, nxt_i)
	begin
		
		state_nxt <= state_reg;
		we_i_nxt  <= we_i_reg;
		
		dat_o  <= (others=>'0');
		done_o <= '0';
		err_o  <= '0';
		
		wb_o.cyc <= '0';
		wb_o.stb <= '0';
		wb_o.adr <= (others=>'0');
		wb_o.dat <= (others=>'0');
		wb_o.we  <= '0';
		wb_o.sgl <= '0';
		wb_o.blk <= '0';
		
		case(state_reg) is
		
			when IDLE =>
				
				if en_i='1' then
					we_i_nxt <= we_i;
					if blk_i='1' then
						state_nxt <= BLK1;
					else
						state_nxt <= SGL;
					end if;				
				end if;
			
			when SGL =>
				wb_o.cyc <= '1';
				wb_o.stb <= '1';
				wb_o.adr(adr_i'range) <= adr_i;
				wb_o.dat(dat_i'range) <= dat_i;
				wb_o.we  <= we_i_reg;
				wb_o.sgl <= '1';			
				
				if wb_i.ack='1' then
					if we_i='0' then
						dat_o <= wb_i.dat(dat_o'range);
					end if;
					done_o <= '1';
					state_nxt <= IDLE;
				elsif wb_i.err='1' then
					err_o<='1';
					state_nxt <= ERR;
				end if;
				
			
			when BLK1 =>
				wb_o.cyc <= '1';
				wb_o.stb <= '1';
				wb_o.adr(adr_i'range) <= adr_i;
				wb_o.dat(dat_i'range) <= dat_i;
				wb_o.we  <= we_i_reg;
				wb_o.blk <= '1';
				
				if wb_i.ack='1' then
					if we_i_reg='0' then
						dat_o <= wb_i.dat(dat_o'range);
					end if;
					done_o <= '1';
					if nxt_i='1' then
						state_nxt <= BLK2;
					else
						state_nxt <= IDLE;
					end if;
				elsif wb_i.err='1' then
					err_o<='1';
					state_nxt <= ERR;
				end if;			
			
			when BLK2 =>
				wb_o.cyc <= '1';
				wb_o.we  <= we_i_reg;
				wb_o.blk <= '1';
				
				if en_i='1' and blk_i='1' then
					state_nxt <= BLK1;
				elsif en_i='0' and blk_i='0' then
					state_nxt <= IDLE;
				end if;
			
			when ERR =>
				err_o<='1';
				
				if en_i='0' and blk_i='0' and we_i='0' and nxt_i='0' then
					err_o<='0';
					state_nxt <= IDLE;
				end if;
			
		end case;
		
	end process;

end Behavioral;