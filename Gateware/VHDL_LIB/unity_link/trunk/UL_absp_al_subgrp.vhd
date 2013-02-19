----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    13:50:13 19/12-2011 
-- Design Name: 
-- Module Name:    UL_absp_al_subgrp - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: Unity-Link ASCII Byte-Stream-Protocol Application-Layer Subscription-Group
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		19/12-2011	ANLAN		First edition finished.
-- 0.02 		16/01-2012 	ANLAN 	Sync cnt next state logic updated to prevent
--                               glitch when updating rate_reg to a smaller value.
-- 0.03		26/09-2012 	ANLAN 	Licensing info added to header
-- 0.04		30/11-2012	ANLAN		Interrupt-triggered publishing feature added.
-- 0.05			 
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

entity subscription_group is
	generic (
		C_SG_ADDR_WIDTH  : integer range 2 to 5 	:= 4; 	-- Address width of the data register ram.
		C_SG_DATA_SIZE	  : integer range 1 to 32 	:= 10;	-- Bitwidth of the data register.		
		C_SG_RATE_SIZE	  : integer range 1 to 32 	:= 16; 	-- Bitwidth of the rate register.	
		C_SG_IRQ_ENABLE  : std_logic					:= '1';	-- '0' = Disabled, '1' = Enabled
		C_SG_IRQ_IS_EDGE : std_logic					:= '0'	-- '0' = Level (high), '1' = Edge (rising)
	);
	port ( 
		clk_i 				: in  std_logic;
		reset_i 				: in  std_logic;
		sync_strobe_i 		: in  std_logic;
		
		irq_publish_en_i	: in  std_logic; -- Interrupt-Publishing enable input
		irq_i					: in  std_logic; -- Interrupt Request input (Level/Edge triggered)
													  -- The source generating an irq request MUST deassert irq_i by itself!		
		
		publish_ack_i 		: in  std_logic;
		publish_req_o 		: out std_logic;
		
		-- rate io
		rate_we_i 		: in  std_logic;
		rate_data_i 	: in  std_logic_vector (C_SG_RATE_SIZE-1 downto 0);
		rate_data_o		: out std_logic_vector (C_SG_RATE_SIZE-1 downto 0);
		
		-- data cnt io
		data_cnt_we_i	: in  std_logic;
		data_cnt_i		: in  std_logic_vector (C_SG_ADDR_WIDTH downto 0);
		data_cnt_o 		: out std_logic_vector (C_SG_ADDR_WIDTH downto 0);
		
		-- data ram io
		data_we_i 		: in  std_logic;
		addr_i			: in  std_logic_vector (C_SG_ADDR_WIDTH-1 downto 0);
		data_i 			: in  std_logic_vector (C_SG_DATA_SIZE-1 downto 0);		
		data_o 			: out std_logic_vector (C_SG_DATA_SIZE-1 downto 0)
		);
end subscription_group;

architecture Behavioral of subscription_group is

   type data_ram is array ((2**C_SG_ADDR_WIDTH)-1 downto 0) of std_logic_vector (C_SG_DATA_SIZE-1 downto 0);
   signal ram : data_ram := (others=>(others=>'0'));
	 
	signal addr	: integer range 0 to (2**C_SG_ADDR_WIDTH)-1;
	
	signal data_cnt_reg : unsigned (C_SG_ADDR_WIDTH downto 0) := (others=>'0');
	signal data_cnt_nxt : unsigned (C_SG_ADDR_WIDTH downto 0);
	
	signal rate_reg : unsigned (C_SG_RATE_SIZE-1 downto 0) := (others=>'0');
	signal rate_nxt : unsigned (C_SG_RATE_SIZE-1 downto 0);	

	signal sync_strobe_reg : std_logic_vector(1 downto 0) := "11";

	signal sync_cnt_reg : unsigned (C_SG_RATE_SIZE-1 downto 0) := (others=>'0');
	signal sync_cnt_nxt : unsigned (C_SG_RATE_SIZE-1 downto 0);	
	
	signal publish_req_reg : std_logic := '0';
	signal publish_req_nxt : std_logic;
	
	signal irq_edge_nxt : std_logic_vector(1 downto 0);
	signal irq_edge_reg : std_logic_vector(1 downto 0) := "11";
	
	signal irq_event_nxt	: std_logic;
	signal irq_event_reg	: std_logic := '0';
	
	signal irq_publish_req : std_logic;
	signal irq_publish_ack : std_logic;
	
begin
	
	--------------------------------------------------
	-- data RAM logic
	--------------------------------------------------
		ram_prc :
		process(clk_i)
		begin
			if rising_edge(clk_i) then
				if data_we_i = '1' then
					ram(TO_INTEGER(unsigned(addr_i))) <= data_i;
				end if;
				
				data_o <= ram(TO_INTEGER(unsigned(addr_i)));
			end if;
		end process;
	--------------------------------------------------
	
	--------------------------------------------------
	-- Data cnt logic
	--------------------------------------------------
		data_cnt_nxt <= unsigned(data_cnt_i);
		
		data_cnt_prc :
		process(clk_i)
		begin
			if rising_edge(clk_i) then
				if reset_i='1' then
					data_cnt_reg <= (others=>'0');
				elsif data_cnt_we_i = '1' then
					data_cnt_reg <= data_cnt_nxt;
				end if;
			end if;
		end process;
		
		data_cnt_o <= std_logic_vector(data_cnt_reg);	
	--------------------------------------------------
	
	--------------------------------------------------
	-- Rate logic
	--------------------------------------------------
		rate_nxt <= unsigned(rate_data_i);
		
		rate_prc :
		process(clk_i)
		begin
			if rising_edge(clk_i) then
				if reset_i='1' then
					rate_reg <= (others=>'0');
				elsif rate_we_i = '1' then
					rate_reg <= rate_nxt;
				end if;			
			end if;
		end process;	
		
		rate_data_o <= std_logic_vector(rate_reg);
	--------------------------------------------------	

	--------------------------------------------------
	-- IRQ detection, publish-req/ack logic
	--------------------------------------------------		
	IRQ_ENABLE_GEN:
	if C_SG_IRQ_ENABLE='1' generate
	
		IRQ_LEVEL_GEN:
		if C_SG_IRQ_IS_EDGE='0' generate
		
			irq_event_nxt <= '1' when irq_i='1' and irq_publish_en_i='1' else 
								  '0' when irq_publish_ack='1' else
									irq_event_reg;
			
		end generate;
		
		IRQ_EDGE_GEN:
		if C_SG_IRQ_IS_EDGE='1' generate

			irq_edge_nxt <= irq_edge_reg(0) & irq_i when irq_publish_en_i='1' else (others=>'1');		
			
			irq_event_nxt <= '1' when irq_edge_reg="01" else 
								  '0' when irq_publish_ack='1' else
								  irq_event_reg;
			
		end generate;
		
		irq_publish_req <= '1' when irq_event_reg='1' and publish_req_reg='0' else '0';
		irq_publish_ack <= '1' when publish_ack_i='1' and irq_publish_req='1' else '0';
		
		irq_prc:
		process(clk_i)
		begin
			if rising_edge(clk_i) then
				if reset_i='1' then
					irq_edge_reg <= "11";
					irq_event_reg <= '0';
				else
					irq_edge_reg <= irq_edge_nxt;
					irq_event_reg <= irq_event_nxt;
				end if;
			end if;
		end process;
	
	end generate;
	
	IRQ_DISABLED_GEN:
	if C_SG_IRQ_ENABLE='0' generate	
	
		irq_publish_req <= '0';
		
	end generate;
	--------------------------------------------------
	
	--------------------------------------------------
	-- Sync strobe cnt & publish req/ack logic
	--------------------------------------------------
		publish_req_nxt <= '1' when rate_reg>0 and sync_cnt_reg=rate_reg else
								 '0' when publish_ack_i='1' else
								 publish_req_reg;

		sync_cnt_nxt <= (others=>'0')  when sync_cnt_reg>=rate_reg else
							 sync_cnt_reg+1 when rate_reg>0 and sync_strobe_reg="01" else
							 sync_cnt_reg;		
		
		sync_strobe_prc :
		process(clk_i)
		begin
			if rising_edge(clk_i) then
				if reset_i='1' then
					sync_strobe_reg <= "11";
					sync_cnt_reg <= (others=>'0');					
					publish_req_reg <= '0';
				else
					sync_strobe_reg <= sync_strobe_reg(0) & sync_strobe_i;
					sync_cnt_reg <= sync_cnt_nxt;
					publish_req_reg <= publish_req_nxt;
				end if;			
			end if;
		end process;
	--------------------------------------------------
	
	publish_req_o <= publish_req_reg or irq_publish_req;
	
end Behavioral;

