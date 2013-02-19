----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange 
-- 
-- Create Date:    12:47:05 05/09-2012 
-- Design Name: 
-- Module Name:    wb_slv_cwrm_tosnet_ctrl - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
--		Wishbone slave controller component providing a wishbone slave 
--		interface for the Commit-Write<>Read-multiple version of TosNet.
--
--		This component requires a 11-bit address space.
--
--		All addresses listed in the Memory and Register space definition 
--		example below is based on a baseaddr of 0x000.
--
--		For detailed information about the TosNet or the TosNet memory-space 
--		scheme please consult the TosNet documentation.
--
--	---------------------------------------------------------------------
-- 						TosNet Address space definition
--	---------------------------------------------------------------------
--					 					Memory space
--
-- 	Shared Memory/Data-Reg size: 0x400
--
-- 	Baseaddr:			0x000
-- 	Endaddr:				0x3FF
--
--		10-bit addr: [9-6] = nodeid, [5-3] = register, [2] = IO (IN=1, OUT=0), [1-0] = dword
--
--		Shared Memory Access control:
--
--		The Shared Memory Access control logic	verifies that the node has 
--		write permission to the provided address, by using the following 
--		access rules:
--
--				master node: Write permission to its own IN+OUT registers + slave node IN registers
--				slave node(s): Write permission to its own OUT registers
--		
--		The Shared Memory Access control logic	verifies that the node has 
--		read permission to the provided address, by using the following 
--		access rules:
--
--				master node: Read permission to all registers
-- 			slave node(s): Read permission to its own IN and all OUT registers	
--
--		Automatically raises the RM (Read multiple) flag on block access
-- 	Sets the CW (Commit Write) flag on any write to 0x400 (combined status and control register)
--
--	------------------------------------------------------------------
-- 									Registers space
--	
--		Status Register:	0x400	(read only)	(writes generate a set action on the CW-bit of the control register)
-- 	Packet Counter:	0x401	(read only)	
-- 	Reset Counter:		0x402	(read only)	
--		Error Counter:		0x403	(read only)	
--
--		Network Reg0:		0x500	(read only)	
--		Network Reg1:		0x501	(read only)	
--		Network Reg2:		0x502	(read only)	
--		Network Reg3:		0x503	(read only)	
--		Network Reg4:		0x504	(read only)	
--		Network Reg5:		0x505	(read only)	
--		Network Reg6:		0x506	(read only)	
--		Network Reg7:		0x507	(read only)	
--		Network Reg8:		0x508	(read only)	
--		Network Reg9:		0x509	(read only)	
--		Network Reg10:		0x50A	(read only)	
--		Network Reg11:		0x50B	(read only)	
--		Network Reg12:		0x50C	(read only)	
--		Network Reg13:		0x50D	(read only)	
--		Network Reg14:		0x50E	(read only)	
--		Network Reg15:		0x50F	(read only)	
-- 
-- 	Async TX status:	0x600	(read only)
-- 	Async TX control:	0x601	(write only)
-- 	Async TX data:		0x602	(write only)
-- 
-- 	Async RX status:	0x700	(read only)
-- 	Async RX data:		0x702	(read only)
--	
--	---------------------------------------------------------------------
--
--  -----------------------------------------------------------------
--	 |								WISHBONE DATASHEET							  |
--  -----------------------------------------------------------------
--	 |	DESCRIPTION				|	SPECIFICATION								  |
--  -----------------------------------------------------------------
--	 |	General description	|  SLAVE TosNet controller enforcing     |
--	 |							   |  Commit Write and Read Multiple (CWRM) |
--	 |								|	functionality.								  |
--  -----------------------------------------------------------------
--	 |	Wishbone version 		| 	Protocol version B4 						  |
--  -----------------------------------------------------------------
--	 |	Supported cycles		| 	SLAVE, READ/WRITE							  |
--	 |								| 	SLAVE, BLOCK READ/WRITE					  |
--  -----------------------------------------------------------------
--  |	Data port:				|													  | 
--	 |		size					|	32 bit (QWORD)								  |
--	 |		granularity  		|	32-bit (QWORD)								  |
--	 |		max. operand size	|	32-bit (QWORD)								  |
--  |	Data transfer: 		|													  |
--	 |		ordering  			|	LITTLE ENDIAN								  |
--  |		sequence    		|	UNDEFINED									  |
--	 -----------------------------------------------------------------
--	 | 							SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | COMPONENT SIGNAL 	| WB SIGNAL 	| DESCRIPTION		  			  |
--	 -----------------------------------------------------------------
--	 | clk_i					| CLK_I			| slave clock input			  |
--	 | rst_i					| RST_I			| slave reset input			  |
--	 |							|					|									  |
--	 | wb_i 				  	|  				| (record type: wb_ad32sb_if)|
--	 |  .cyc					| CYC_I			| slave cycle input			  |
--	 |  .stb					| STB_I			| slave strobe input			  |
--	 |  .adr					| ADR_I			| slave addr input			  |
--	 |  .dat					| DAT_I			| slave data input			  |
--	 |  .we					| WE_I			| slave write enable input   |
--	 |  .sgl					| TGC_I()		| slave cycle-tag input		  |
--	 |  .blk					| TGC_I()		| slave cycle-tag input		  |
--	 |							|					|									  |
--	 | wb_o 				  	|  				| (record type: wb_d32ae_if) |
--	 |  .dat					| DAT_O			| slave data output			  |
--	 |  .ack					| ACK_O			| slave acknowledge output	  |
--	 |  .err					| ERR_O			| slave error output			  |
--	 -----------------------------------------------------------------
--	 | 						TAG SIGNAL DESCRIPTION							  |
--	 -----------------------------------------------------------------
--	 | SIGNAL NAME	| TAG TYPE	| DESCRIPTION								  |
--	 -----------------------------------------------------------------
--	 | wb_i.sgl		| TGC_I		| marks a cycle as a single access	  |
--	 | wb_i.blk		| TGC_I		| marks a cycle as a block access	  |
--	 -----------------------------------------------------------------
--	 | 							ERROR GENERATION 								  |
--	 | ERR_O is asserted under the following conditions				  |
--	 -----------------------------------------------------------------
--	 |	WB BUS CYCLE |	ERROR TRIGGER	| DESCRIPTION					 	  |
--	 -----------------------------------------------------------------
--	 |  read-cycle  | read error	| node is not allowed read access* |
--	 |  write-cycle | write error	| node is not allowed write access*|
--	 -----------------------------------------------------------------
--
--		* see access rules under the memory space description.
--
-- Dependencies: 
--
--		work.wb_classic_pkg.all
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment 
-- 0.01	 	05/09-2012	ANLAN		File Created
-- 0.02		12/10-2012 	ANLAN 	wb_slv_cwrn_tosnet_ctrl corrected to wb_slv_cwrm_tosnet_ctrl
--	0.03		22/10-2012	ANLAN		Headers, comments and licensing info updated.
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

entity wb_slv_cwrm_tosnet_ctrl is
	port ( 
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb slave interface
		wb_i 	: in  wb_ad32sb_if;
		wb_o 	: out wb_d32ae_if;
		
		-- tosnet cw/rm user io
		status_register_i		: in  std_logic_vector(31 downto 0);
		packet_counter_i		: in  std_logic_vector(31 downto 0);
		reset_counter_i		: in  std_logic_vector(31 downto 0);
		error_counter_i		: in  std_logic_vector(31 downto 0);

		data_reg_ctr_o			: out std_logic_vector(1 downto 0);
		data_reg_ctr_we_o		: out	std_logic;
		
		data_reg_addr_o		: out std_logic_vector(9 downto 0);
		data_reg_data_o		: out std_logic_vector(31 downto 0);
		data_reg_data_i		: in  std_logic_vector(31 downto 0);
		data_reg_re_o			: out std_logic;
		data_reg_r_ack_i		: in  std_logic;
		data_reg_r_err_i		: in  std_logic;		
		data_reg_we_o			: out std_logic;
		data_reg_w_ack_i		: in  std_logic;
		data_reg_w_err_i		: in  std_logic;		
		
		netwrk_reg_addr_o		: out std_logic_vector(3 downto 0);
		netwrk_reg_data_i		: in  std_logic_vector(31 downto 0);
		
		async_tx_str_i			: in  std_logic_vector(6 downto 0);
		async_tx_ctr_o			: out std_logic_vector(5 downto 0);
		async_tx_ctr_we_o		: out std_logic;
		async_tx_data_o		: out std_logic_vector(31 downto 0);
		async_tx_data_we_o	: out std_logic;
		
		async_rx_str_i			: in  std_logic_vector(7 downto 0);
		async_rx_data_i		: in  std_logic_vector(31 downto 0);
		async_rx_data_re_o	: out std_logic
		);
end wb_slv_cwrm_tosnet_ctrl;

architecture Behavioral of wb_slv_cwrm_tosnet_ctrl is

	constant MEM_ADDR_WIDTH 	: integer := 10;	-- Memory depth/size

	constant CW : integer := 0;
	constant RM : integer := 1;

	signal ack_reg : std_logic := '0';
	signal ack_nxt : std_logic;
	signal ack_req : std_logic;
	
	signal err_reg : std_logic := '0';
	signal err_nxt : std_logic;	
	signal err_req : std_logic;
	
	-- selected memory/register space bits
	signal mem		: std_logic;	-- shared memory
	signal scr		: std_logic;	-- status/control register
	signal pcnt		: std_logic;	-- packet counter
	signal rcnt		: std_logic;	-- reset counter
	signal ecnt		: std_logic;	-- error counter
	signal ntw		: std_logic;	-- network registers
	signal atx		: std_logic;	-- async tx registers
	signal arx		: std_logic;	-- asynx rx	registers
	signal err		: std_logic;	-- error/invalid address

begin

	------------------------------------------------------------------
	-- Acknowledge/error logic
	------------------------------------------------------------------
		-- register process
		process(clk_i)
		begin
			if rising_edge(clk_i) then
				if rst_i='1' then
					ack_reg <= '0';
					err_reg <= '0';
				else
					ack_reg <= ack_nxt;
					err_reg <= err_nxt;
				end if;
			end if;
		end process;

		ack_nxt <= '1' when ack_req='1' and ack_reg='0' else '0';	-- ensure cycle terminating signal can only be
		err_nxt <= '1' when err_req='1' and err_reg='0' else '0';	-- asserted for one clock cycle (CLASSIC STANDARD MODE).	
	------------------------------------------------------------------
	
	------------------------------------------------------------------
	-- Address decoder
	------------------------------------------------------------------
	--	Memory space: wb_i.adr(10)='0'
	--	Register space: wb_i.adr(10)='1'
	--		ctr/sts			: wb_i.adr(9:0)="0000000000"
	--		pcnt				: wb_i.adr(9:0)="0000000001"
	--		rcnt				: wb_i.adr(9:0)="0000000010"
	--		ecnt				: wb_i.adr(9:0)="0000000011"
	--		network reg(s) : wb_i.adr(9:4)="010000"
	--		async tx reg(s): wb_i.adr(9:2)="10000000"
	--		async rx reg(s): wb_i.adr(9:2)="11000000"
	--		error/invalid	: anything not within the above ranges
	------------------------------------------------------------------
		process(wb_i)
		begin
			-- defaults
			mem  <= '0';
			scr  <= '0';
			pcnt <= '0';
			rcnt <= '0';
			ecnt <= '0';
			ntw  <= '0';
			atx  <= '0';
			arx  <= '0';
			err  <= '0';
			
			if wb_i.adr(10)='0' then
				-- shared memory space
				mem <= '1';
			else
				-- register space
				if    wb_i.adr(9 downto 0)="0000000000" then
					scr <= '1';
				elsif wb_i.adr(9 downto 0)="0000000001" then
					pcnt <= '1';
				elsif wb_i.adr(9 downto 0)="0000000010" then
					rcnt <= '1';
				elsif wb_i.adr(9 downto 0)="0000000011" then
					ecnt <= '1';
				elsif wb_i.adr(9 downto 4)="010000" then
					ntw <= '1';
				elsif wb_i.adr(9 downto 2)="10000000" then
					atx <= '1';
				elsif wb_i.adr(9 downto 2)="11000000" then
					arx <= '1';
				else
					err <= '1';
				end if;
			end if;
		end process;		
	------------------------------------------------------------------
	
	-- Wishbone ack/err output mapping
	wb_o.ack	<= ack_reg;
	wb_o.err	<= err_reg;	
	
	-- Wishbone data output mapping
	wb_o.dat 	<= data_reg_data_i   when mem='1' else
						status_register_i	when scr='1'  else
						packet_counter_i	when pcnt='1' else
						reset_counter_i	when rcnt='1' else
						error_counter_i	when ecnt='1' else				
						netwrk_reg_data_i	when ntw='1'  else
						x"000000" & "0" & async_tx_str_i	when atx='1'  else
						x"000000" & async_rx_str_i		when arx='1' and wb_i.adr(1 downto 0)="00" else
						async_rx_data_i	when arx='1' and wb_i.adr(1 downto 0)="10" else
						(others=>'0');		-- err='1'
						
	
	-- CWRM TosNet address output mapping
	data_reg_addr_o   <= wb_i.adr(9 downto 0);
	netwrk_reg_addr_o <= wb_i.adr(3 downto 0);		
	
	-- CWRM TosNet data output mapping
	data_reg_data_o	<= wb_i.dat;
	async_tx_ctr_o		<= wb_i.dat(5 downto 0);
	async_tx_data_o	<= wb_i.dat;

	-- Wishbone <> CWRM TosNet control logic process
	process(wb_i, ack_reg, err_reg, mem, scr, atx, arx, pcnt, ecnt, rcnt, ntw, data_reg_r_ack_i, data_reg_r_err_i, data_reg_w_ack_i, data_reg_w_err_i, async_tx_str_i, async_rx_str_i)		
	begin
		
		-- cycle not started, 
		-- [RULE 3.30] slave MAY ONLY react to syscon signals		
		
		-- defaults
		ack_req <= '0';
		err_req <= '0';
		
		-- shared memory/data reg outputs	
		data_reg_ctr_we_o		<= '1';
		data_reg_ctr_o(CW)	<=	'0'; -- CW
		data_reg_ctr_o(RM)	<= '0'; -- RM
		data_reg_re_o			<= '0';
		data_reg_we_o			<= '0';
		
		async_tx_ctr_we_o		<= '0';
		async_tx_data_we_o	<= '0';
		async_rx_data_re_o	<= '0';
		
		if wb_i.cyc='1' then
			-- cycle started
			
			if wb_i.sgl='1' or wb_i.blk='1' then
			-- cycle started in SINGLE/BLOCK mode, slave MAY be active
				
				if wb_i.blk='1' and wb_i.we='0' then				-- READ BLOCK mode cycle in progress
					if mem='1' then											-- if shared memory access
						data_reg_ctr_o(RM) <= '1';								-- assert the read multiple flag to block any commit's during the block read
					end if;
				end if;			
				
				if wb_i.stb='1' then
				-- strobe high => slave selected
										
					if wb_i.we='0' then
					-- READ mode
					
						if mem='1' then										
						-- shared memory access (synchronous)						
							data_reg_re_o <= (not ack_reg) and (not err_reg);
							
							if data_reg_r_ack_i='1' then
								ack_req <= '1';						
							elsif data_reg_r_err_i='1' then
								err_req <= '1';
							end if;
						end if;
						
						if scr='1' or pcnt='1' or rcnt='1' or ecnt='1' or ntw='1' then
						-- status register, packet/reset/error counter or network register (synchronous)						
							ack_req <= '1';
						end if;
						
						if atx='1' then							
						-- Async TX	(synchronous)
							if wb_i.adr(1 downto 0)="00" then			-- Async TX status:	0x600	(read only)
								ack_req <= '1'; 
							else
								err_req <= '1';
							end if;
						end if;

						if arx='1' then							
						-- Async RX	(synchronous)
							if wb_i.adr(1 downto 0)="00" then			-- Async RX status:	0x700	(read only)
								ack_req <= '1';
							elsif wb_i.adr(1 downto 0)="10" and async_rx_str_i(6)='1' then		-- Async RX data:		0x702	(read only) and async RX data valid
								async_rx_data_re_o <= ack_reg;			-- assert the async_rx_data_re_o during 
																					-- the ONE clock cycle where ack_o is asserted
								ack_req <= '1';
							else
								err_req <= '1';
							end if;							
						end if;
						
						if err='1' then
							err_req <= '1';
						end if;
						
					end if;
										
					if wb_i.we='1' then													
					-- WRITE mode
					
						if mem='1' then										
						-- shared memory access (synchronous)						
							data_reg_we_o <= (not ack_reg) and (not err_reg);
							
							if data_reg_w_ack_i='1' then
								ack_req <= '1';								
							elsif data_reg_w_err_i='1' then
								err_req <= '1';
							end if;
						end if;
						
						if scr='1' then
						-- control register (synchronous)
							data_reg_ctr_o(CW) <= not ack_reg;			-- assert the commit write request during 
																					-- the ONE clock cycle before ack_o is asserted
							ack_req <= '1';
						end if;	
						
						if pcnt='1' or rcnt='1' or ecnt='1' or ntw='1' then
						-- packet/reset/error counter or network register (synchronous)						
							err_req <= '1'; 									
						end if;
						
						if atx='1' then							
						-- Async TX (synchronous)
							if wb_i.adr(1 downto 0)="01" then			-- Async TX control:	0x601	(write only)
								async_tx_ctr_we_o		<= not ack_reg;	-- assert the async_tx_ctr_we_o during 
																					-- the ONE clock cycle before ack_o is asserted																
								ack_req <= '1';
							elsif wb_i.adr(1 downto 0)="10" and async_tx_str_i(6)='0' then		-- Async TX data:	0x602	(write only) and asynx tx fifo not full
								async_tx_data_we_o	<= not ack_reg;	-- assert the async_tx_data_we_o during 
																					-- the ONE clock cycle before ack_o is asserted								
								ack_req <= '1';
							else
								err_req <= '1';
							end if;
						end if;

						if arx='1' then							
						-- Async RX (synchronous)
							err_req <= '1';
						end if;
						
						if err='1' then
							err_req <= '1';
						end if;
						
					end if;
					
				end if;		
				
			end if;
			
		end if;
		
	end process;

end Behavioral;