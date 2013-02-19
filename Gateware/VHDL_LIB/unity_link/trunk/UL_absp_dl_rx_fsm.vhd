----------------------------------------------------------------------------------
-- Company: University of Southern Denmark
-- Engineer: Anders Blaabjerg Lange
-- 
-- Create Date:    11:34:14 28/12-2011 
-- Design Name: 
-- Module Name:    uart_unity_link_dl_rx_fsm - behavioral  
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 	Unity-Link ASCII Byte-Stream-Protocol Datalink-Layer RX-FSM
--
-- Dependencies: 
--
--		Unity-HDL libraries:
--			- checksum_v02_00_a
--
-- Revision History:
-- -----------------------------------------
-- Version	Date			Author	Comment
-- 0.01		28/12-2011	ANLAN		File Created
-- 0.02		09/01-2012	ANLAN		logic to clear star_reg after succesfull CHKS 
--											verification added to enable reception of 
--											additional checksum packets.
-- 0.03		11/01-2012	ANLAN		WAIT_DATA state updated to accept 'CR' 
--											(carriage return) as valid end of packet,
--											This is done to ensure compatability with windows 
--											terminals which dosn't send '\n' (line feed).
-- 0.04		12/01-2012	ANLAN		C_UART_PARITY generic changed to C_UART_PARITY_EN
-- 0.05  	17/01-2012  ANLAN    parity checking made conditional on the C_UART_PARITY_EN 
--       	                     generic, rxfifo selection made independent of C_UART_PARITY_EN.
-- 0.06  	19/03-2012	ANLAN		Updated to support new protocol with separation between payload command and payload data
-- 0.07  	04/04-2012	ANLAN		Updated for the new message format: [#],([cmd]]]{:([d1],[d2])))}),[\n] OR [$],([cmd]]]{:([d1],[d2])))}),[*],([chk1],[chk2]),[\n]
-- 0.08  	30/04-2012	ANLAN		Updated to support checksum messages without [:] for example: $RLC*9b\n, or $DPS*9f\n
-- 0.09		01/05-2012	ANLAN		filename changed to uart_gab_link_dl_rx_fsm
-- 0.10		20/09-2012	ANLAN		filename changed to uart_unity_link_dl_rx_fsm
-- 0.11		21/09-2012	ANLAN		filename changed to UL_absp_dl_rx_fsm
--											C_UART_PARITY_EN generic removed
--											UART specific functionality replaced with generic
-- 0.12		26/09-2012 	ANLAN 	Licensing info added to header, library module dependencies added
-- 0.13		22/11-2012	ANLAN		Updated to use checksum_pkg v02_00_a			 
-- 0.14			 
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

library checksum_v02_00_a;
use checksum_v02_00_a.checksum_pkg.all;

entity UL_absp_dl_rx_fsm is
	generic (
		C_PL_RX_ERR_WIDTH		: integer range 0 to	3	:= 3;			-- Number of rx error input lines from the physical layer
		C_CHECKSUM				: integer range 0 to 2  := 2			-- checksum mode: 0 = NONE, 1 = BYTE WISE XOR, 2 = CRC-8-CCIT
	);
	port ( 
		clk_i 					: in  std_logic;
		reset_i 					: in  std_logic;
		
		-- RxFIFO interface		
		rx_err_i 				: in  std_logic_vector(C_PL_RX_ERR_WIDTH-1 downto 0);
		clear_errors_o			: out std_logic;
		flush_rx_fifo_o		: out std_logic;
		
		-- ASCII Decoder interface
		bin_vld_i 				: in  std_logic;
		bin_pc_i 				: in  std_logic;
		bin_ac_i 				: in  std_logic;
		bin_ad_i 				: in  std_logic;		
		bin_data_i 				: in  std_logic_vector (7 downto 0);
		bin_rd_o 				: out std_logic;
		st_rd_ac_o 				: out std_logic;
		st_rd_ad_o 				: out std_logic;
		clr_err_o				: out std_logic;							-- Clear errors (necesarry for receiving additional data)
		err_invd_i 				: in  std_logic;
		err_mdb_i 				: in  std_logic;		
		
		-- Dual FIFO MUX interface
		rxfifo_in_sel_o 		: out std_logic;		
		rxfifo_in_wr_o 		: out std_logic;
		rxfifo_in_data_in_o 	: out std_logic_vector (8 downto 0);
		rxfifo_in_reset_o 	: out std_logic;
		rxfifo_in_full_i 		: in  std_logic;
		
		rxfifo_out_sel_o 		: out std_logic;
		rxfifo_out_empty_i 	: in  std_logic;
		
		-- TxFIFO B interface
		txfifo_b_wr_o 			: out std_logic;
		txfifo_b_data_in_o 	: out std_logic_vector (7 downto 0);
		txfifo_b_full_i 		: in  std_logic
		);
end UL_absp_dl_rx_fsm;

architecture full of UL_absp_dl_rx_fsm is

	-- Datalink Layer Errorcodes
	constant F_MTL : std_logic_vector(7 downto 0) := x"F0";	-- Message too large
	constant F_IMF : std_logic_vector(7 downto 0) := x"F1";	-- Invalid message formatting
	constant F_MDB : std_logic_vector(7 downto 0) := x"F2";  -- Missing databyte / invalid alignment
	constant F_IMD : std_logic_vector(7 downto 0) := x"F3";  -- Invalid message data (Invalid data in message)
	constant F_MCE : std_logic_vector(7 downto 0) := x"F4";  -- Message checksum error
	constant F_RX  : std_logic_vector(7 downto 0) := x"F5";  -- RX error
	
	-- Datalink Layer Packet Command codes
	constant PCMD_REQ			: unsigned(7 downto 0) := x"23";	-- '#'
	constant PCMD_REQ_CHK	: unsigned(7 downto 0) := x"24"; -- '$'
	constant PCMD_PUB			: unsigned(7 downto 0) := x"25"; -- '%'
	constant PCMD_PUB_CHK	: unsigned(7 downto 0) := x"26"; -- '&'
	constant PCMD_COLON		: unsigned(7 downto 0) := x"3A"; -- ':'
	constant PCMD_STR			: unsigned(7 downto 0) := x"2A"; -- '*'
	constant PCMD_END			: unsigned(7 downto 0) := x"0A"; -- 'LF' or '\n'	(line feed/newline)
	constant PCMD_CRTN		: unsigned(7 downto 0) := x"0D"; -- 'CR'				(carriage return)	
	constant PCMD_TAB			: unsigned(7 downto 0) := x"09"; -- 'TAB'
	constant PCMD_WHTSP		: unsigned(7 downto 0) := x"20"; -- ' '
	constant PCMD_COMMA		: unsigned(7 downto 0) := x"2C"; -- ','
	constant PCMD_PERIOD		: unsigned(7 downto 0) := x"2E"; -- '.'

	-- RxFSM States
	type rxfsm_states is (INIT, WAIT_HEAD, SELECT_IN_FIFO, STORE_HEAD, WAIT_DATA, CALC_CHKS, STORE_COLON, STORE_DATA, STORE_TAIL, VERIFY_CHKS, SWAP_OUT_FIFO,
								 ERR_RX, ERR_FORMAT, ERR_ALIGNMENT, ERR_INVALID_DATA, ERR_CHECKSUM, ERR_OVERSIZE, FLUSH_FIFOS);
								 
	signal state_reg : rxfsm_states := INIT;
	signal state_nxt : rxfsm_states;
	
	signal head_reg	: std_logic_vector(7 downto 0);
	signal head_nxt	: std_logic_vector(7 downto 0);

	signal data_reg	: std_logic_vector(7 downto 0);
	signal data_nxt	: std_logic_vector(7 downto 0);
	
	signal star_reg	: std_logic := '0';
	signal star_nxt	: std_logic;
	
	signal rxfifo_in_reg		: std_logic := '0';
	signal rxfifo_in_nxt 	: std_logic;
	signal rxfifo_out_reg	: std_logic := '0';
	signal rxfifo_out_nxt 	: std_logic;

	signal st_rd_cnd_reg		: std_logic := '0';		-- state reading command not data: '0' = data, '1' = command
	signal st_rd_cnd_nxt		: std_logic;

	-- checksum module signals
	signal chks_reset 		: std_logic;
	signal chks_data_vld		: std_logic;
	signal chks_data			: std_logic_vector (7 downto 0);
	signal chks_chks			: std_logic_vector (7 downto 0);

begin

	CHECKSUM_XOR_GEN:
   if C_CHECKSUM=1 generate
      begin
		-- checksum XOR instance
		checksum_xor8 : checksum_xor
			generic map(
				C_DATA_WIDTH 		=> 8,
				C_CHKS_WIDTH 		=> 8
				)
			port map( 
				clk_i 		=> clk_i,
				reset_i		=> chks_reset, 
				data_vld_i 	=> chks_data_vld,
				data_i 		=> chks_data,
				chks_o 		=> chks_chks,
				chks_vld_o 	=> open
				);		         
   end generate;
	
	CHECKSUM_CRC_GEN:
   if C_CHECKSUM=2 generate
      begin
		-- checksum CRC instance
		checksum_crc8 : checksum_crc
			generic map(
				C_DATA_WIDTH 		=> 8,
				C_CHKS_WIDTH 		=> 8,			
				C_CRC_POLYNOMIAL	=> 7	-- C_CHKS_WIDTH = 8, C_CRC_POLYNOMIAL = 7 => x^8+x^2+x^1+1 (CRC-8-CCIT)
				)
			port map( 
				clk_i 		=> clk_i,
				reset_i		=> chks_reset, 
				data_vld_i 	=> chks_data_vld,
				data_i 		=> chks_data,
				chks_o 		=> chks_chks,
				chks_vld_o 	=> open
				);	         
   end generate;	
	

	-- register process
	process (clk_i)
	begin
		if rising_edge(clk_i) then
			if reset_i='1' then
				state_reg <= INIT;			
			else
				state_reg <= state_nxt;
				
				st_rd_cnd_reg <= st_rd_cnd_nxt;
				
				head_reg 		<= head_nxt;
				data_reg			<= data_nxt;
				star_reg			<= star_nxt;
				rxfifo_in_reg	<= rxfifo_in_nxt;
				rxfifo_out_reg	<= rxfifo_out_nxt;
			end if;
		end if;
	end process;
	
	-- next state logic
	process(state_reg, bin_vld_i, rx_err_i, bin_pc_i, bin_ac_i, bin_ad_i, bin_data_i, rxfifo_out_empty_i,
			  rxfifo_in_reg, rxfifo_out_reg, head_reg, data_reg, star_reg, rxfifo_in_full_i, txfifo_b_full_i, err_mdb_i, err_invd_i,
			  chks_chks, st_rd_cnd_reg)
	begin
		-- default
		state_nxt 		<= state_reg;
		st_rd_cnd_nxt 	<= st_rd_cnd_reg;
		head_nxt	 		<= head_reg;
		data_nxt			<= data_reg;
		star_nxt			<= star_reg;
		rxfifo_in_nxt	<= rxfifo_in_reg;
		rxfifo_out_nxt	<= rxfifo_out_reg;

		chks_reset				<= '0';
		chks_data_vld 			<= '0';
		chks_data 				<= (others=>'0');	
					
		clear_errors_o 		<= '0';
		flush_rx_fifo_o		<= '0';

		bin_rd_o <= '0';		
		clr_err_o <= '0';
		
		rxfifo_in_data_in_o 	<= (others=>'0');
		rxfifo_in_wr_o			<= '0';
		rxfifo_in_reset_o		<= '0';		
		
		txfifo_b_wr_o  		<= '0';
		txfifo_b_data_in_o 	<= (others=>'0');
		
		case state_reg is
			
			-------------------------------------
			-- State INIT
			-------------------------------------
				when INIT =>
					st_rd_cnd_nxt  <= '1';
					
					star_nxt			<= '0';
					rxfifo_in_nxt	<= '0';
					rxfifo_out_nxt	<= '0';
					
					chks_reset		<= '1';
					
					state_nxt <= WAIT_HEAD;
			-------------------------------------
			
			-------------------------------------		
			-- State WAIT_HEAD
			-------------------------------------
				when WAIT_HEAD =>
					clr_err_o <= '1'; 	-- ignore/clear any errors of missing/invalid data while waiting for command
					
					if	unsigned(rx_err_i)>0 then	-- if rx-error
						data_nxt <= std_logic_vector(unsigned(F_RX) + unsigned(rx_err_i));	-- calculate the resulting rx-error code
						state_nxt <= ERR_RX;
					elsif bin_vld_i='1' then																			-- if valid data/command
					
						if bin_pc_i='1' then																					-- 	if valid packet command
							-- test if valid/invalid format (ignore data separators, '*' and '\n')
							if unsigned(bin_data_i)=PCMD_PUB or unsigned(bin_data_i)=PCMD_PUB_CHK then		-- 		if invalid format (cmd = % or &)
								state_nxt <= ERR_FORMAT;
							elsif	unsigned(bin_data_i)=PCMD_REQ or unsigned(bin_data_i)=PCMD_REQ_CHK then	--			if valid format and cmd = # or $
								head_nxt <= bin_data_i;																		--				save head
								state_nxt <= SELECT_IN_FIFO;
							end if;
						end if;
						
						bin_rd_o <= '1';
					end if;					
			-------------------------------------
			
			-------------------------------------
			-- State SELECT_IN_FIFO
			-------------------------------------
				when SELECT_IN_FIFO =>										
					rxfifo_in_nxt	<= not rxfifo_out_reg;						
					state_nxt <= STORE_HEAD;
					
			-------------------------------------
			
			-------------------------------------
			-- State STORE_HEAD
			-------------------------------------
				when STORE_HEAD =>
					if rxfifo_in_full_i='0' then
						rxfifo_in_data_in_o 	<= '1' & head_reg;	-- write head_reg marked as command
						rxfifo_in_wr_o			<= '1';
						state_nxt <= WAIT_DATA;
					else
						state_nxt <= ERR_OVERSIZE;
					end if;
			-------------------------------------
			
			-------------------------------------
			-- State WAIT_DATA
			-- --------------------
			-- handles: rx-error, aligment (missing databyte), format (bin_data= #, $, %, & or *[!$]), invalid data and oversize errors
			-- ignores: dataseperators (TAB, whitespace, comma, period) + carriage return (0x0D)
			-------------------------------------
				when WAIT_DATA =>		
					if rxfifo_in_full_i='0' then								-- if space in RxFIFO

						if	unsigned(rx_err_i)>0 then										-- if rx-error
							data_nxt <= std_logic_vector(unsigned(F_RX) + unsigned(rx_err_i));	-- calculate the resulting rx-error code
							state_nxt <= ERR_RX;
						elsif err_mdb_i='1' then							
							clr_err_o <= '1';
							state_nxt <= ERR_ALIGNMENT;
						elsif err_invd_i= '1' then
							state_nxt <= ERR_INVALID_DATA;
						elsif bin_vld_i='1' then								-- if valid data/command
						
							if bin_pc_i='1' then									-- if packet command
						
								if unsigned(bin_data_i)=PCMD_REQ or 
									unsigned(bin_data_i)=PCMD_REQ_CHK or
									unsigned(bin_data_i)=PCMD_PUB or 
									unsigned(bin_data_i)=PCMD_PUB_CHK then				-- 	if invalid format (cmd = #, $, % or &)
									
									state_nxt <= ERR_FORMAT;
								elsif unsigned(bin_data_i)=PCMD_COLON then 			--		if valid format and cmd = ':'
									if st_rd_cnd_reg='1' then								--			if reading app. command (st_rd_cnd_reg=1)
										st_rd_cnd_nxt  <= '0';								--				switch to reading app. data
										state_nxt <= STORE_COLON;							--				save colon	
									else															--			else
										state_nxt <= ERR_FORMAT;							--				format error (can't receive more than one :)
									end if;
								elsif	unsigned(bin_data_i)=PCMD_STR then				--		if valid format and cmd = '*'
									if unsigned(head_reg)=PCMD_REQ_CHK and star_reg='0' then
										st_rd_cnd_nxt  <= '0';								--				ensure ASCII decoding is active for checksum data
										star_nxt	 <= '1';
									else
										state_nxt <= ERR_FORMAT;
									end if;
								elsif	unsigned(bin_data_i)=PCMD_END or 				--		if valid format and cmd = '\n' / 'LF'
										unsigned(bin_data_i)=PCMD_CRTN then				--		if valid format and cmd = 'CR'
									state_nxt <= STORE_TAIL;								
								end if;
							elsif bin_ad_i='1' or bin_ac_i='1' then					-- if application data or command
								data_nxt <= bin_data_i;										-- 	save data
								if unsigned(head_reg)=PCMD_REQ_CHK then
									state_nxt <= CALC_CHKS;
								else								
									state_nxt <= STORE_DATA;
								end if;
							end if;
							
							bin_rd_o <= '1';
						end if;
						
					else																-- if RxFIFO full (message is too large...)
						state_nxt <= ERR_OVERSIZE;
					end if;						
			-------------------------------------

			-------------------------------------
			-- State CALC_CHKS
			-------------------------------------
				when CALC_CHKS =>					
					chks_data 		<= data_reg;								-- write data to checksum generator
					chks_data_vld 	<= '1';
					
					if star_reg='1' then						
						state_nxt <= WAIT_DATA;
					else
						state_nxt <= STORE_DATA;
					end if;
			-------------------------------------		

			-------------------------------------
			-- State STORE_DATA
			-------------------------------------
				when STORE_DATA =>					
					rxfifo_in_data_in_o 	<= '0' & data_reg;				-- write data_reg marked as data
					rxfifo_in_wr_o 		<= '1';
					
					state_nxt <= WAIT_DATA;
			-------------------------------------

			-------------------------------------
			-- State STORE_COLON
			-------------------------------------
				when STORE_COLON =>
					rxfifo_in_data_in_o 	<= '1' & std_logic_vector(PCMD_COLON);	-- write colon marked as command
					rxfifo_in_wr_o 		<= '1';
					
					state_nxt <= WAIT_DATA;
			-------------------------------------

			-------------------------------------
			-- State STORE_TAIL
			-------------------------------------
				when STORE_TAIL =>
					rxfifo_in_data_in_o 	<= '1' & std_logic_vector(PCMD_END);	-- write tail marked as command
					rxfifo_in_wr_o 		<= '1';
					
					st_rd_cnd_nxt  		<= '1';
					
					if unsigned(head_reg)=PCMD_REQ_CHK then
						state_nxt <= VERIFY_CHKS;
					else
						state_nxt <= SWAP_OUT_FIFO;
					end if;
			-------------------------------------

			-------------------------------------
			-- State VERIFY_CHKS
			-------------------------------------
				when VERIFY_CHKS =>					
					if unsigned(chks_chks)=0 then				-- Verify checksum
						star_nxt	 <= '0';
						state_nxt <= SWAP_OUT_FIFO;						
					else
						state_nxt <= ERR_CHECKSUM;
					end if;
			-------------------------------------

			-------------------------------------
			-- State SWAP_OUT_FIFO
			-------------------------------------
				when SWAP_OUT_FIFO =>
					-- wait for current output RxFIFO to be empty
					if rxfifo_out_empty_i='1' then					-- if OutFIFO is empty						
						if rxfifo_in_reg /= rxfifo_out_reg then	-- if InFIFO != OutFIFO (InFIFO contains new RX data)
							-- swap out fifo
							rxfifo_out_nxt <= not rxfifo_out_reg;					
						end if;
						state_nxt <= WAIT_HEAD;
					end if;
			-------------------------------------
			
			-------------------------------------
			-- State ERR_RX
			-------------------------------------
				when ERR_RX =>
					if txfifo_b_full_i='0' then
						txfifo_b_wr_o  <= '1';
						txfifo_b_data_in_o <= data_reg;	-- write error-code to TxFIFO B (TxFSM will insert the necesarry head+tail commands)
						state_nxt <= FLUSH_FIFOS;
					end if;
			-------------------------------------		

			-------------------------------------
			-- State ERR_OVERSIZE
			-------------------------------------
				when ERR_OVERSIZE =>
					if txfifo_b_full_i='0' then
						txfifo_b_wr_o  <= '1';
						txfifo_b_data_in_o <= F_MTL;	-- write error code to TxFIFO B (TxFSM will insert the necesarry head+tail commands)
						state_nxt <= FLUSH_FIFOS;
					end if;
			-------------------------------------
			
			-------------------------------------
			-- State ERR_FORMAT
			-------------------------------------
				when ERR_FORMAT =>
					if txfifo_b_full_i='0' then
						txfifo_b_wr_o  <= '1';
						txfifo_b_data_in_o <= F_IMF;	-- write error code to TxFIFO B (TxFSM will insert the necesarry head+tail commands)
						state_nxt <= FLUSH_FIFOS;
					end if;
			-------------------------------------		
			
			-------------------------------------
			-- State ERR_ALIGNMENT
			-------------------------------------
				when ERR_ALIGNMENT =>
					if txfifo_b_full_i='0' then
						txfifo_b_wr_o  <= '1';
						txfifo_b_data_in_o <= F_MDB;	-- write error code to TxFIFO B (TxFSM will insert the necesarry head+tail commands)
						state_nxt <= FLUSH_FIFOS;
					end if;
			-------------------------------------

			-------------------------------------
			-- State ERR_INVALID_DATA
			-------------------------------------
				when ERR_INVALID_DATA =>
					if txfifo_b_full_i='0' then
						txfifo_b_wr_o  <= '1';
						txfifo_b_data_in_o <= F_IMD;	-- write error code to TxFIFO B (TxFSM will insert the necesarry head+tail commands)
						state_nxt <= FLUSH_FIFOS;
					end if;
			-------------------------------------

			-------------------------------------
			-- State ERR_CHECKSUM
			-------------------------------------
				when ERR_CHECKSUM =>
					if txfifo_b_full_i='0' then
						txfifo_b_wr_o  <= '1';
						txfifo_b_data_in_o <= F_MCE;	-- write error code to TxFIFO B (TxFSM will insert the necesarry head+tail commands)
						state_nxt <= FLUSH_FIFOS;
					end if;
			-------------------------------------			
			
			-------------------------------------
			-- State FLUSH_FIFOS
			-------------------------------------
				when FLUSH_FIFOS =>
					
					st_rd_cnd_nxt  	<= '1';					
					
					star_nxt				<= '0';	-- clear star received flag
					
					rxfifo_in_reset_o <= '1';	-- flush current (Rx) InFIFO
					flush_rx_fifo_o 	<= '1';	-- flush UART RxFIFO
					clear_errors_o 	<= '1';	-- clear UART errors
					
					chks_reset			<= '1';	-- reset checksum generator
					
					state_nxt <= WAIT_HEAD;
			-------------------------------------
			
		end case;
		
	end process;
	
	st_rd_ac_o <= st_rd_cnd_reg;
	st_rd_ad_o <= not st_rd_cnd_reg;
	
	rxfifo_in_sel_o	<= rxfifo_in_reg;
	rxfifo_out_sel_o	<= rxfifo_out_reg;


end full;


architecture lite of UL_absp_dl_rx_fsm is

	-- Datalink Layer Errorcodes
	constant F_MTL : std_logic_vector(7 downto 0) := x"F0";	-- Message too large
	constant F_IMF : std_logic_vector(7 downto 0) := x"F1";	-- Invalid message formatting
	constant F_MDB : std_logic_vector(7 downto 0) := x"F2";  -- Missing databyte / invalid alignment
	constant F_IMD : std_logic_vector(7 downto 0) := x"F3";  -- Invalid message data (Invalid data in message)
	constant F_MCE : std_logic_vector(7 downto 0) := x"F4";  -- Message checksum error
	constant F_RX  : std_logic_vector(7 downto 0) := x"F5";  -- RX error
	
	-- Datalink Layer Packet Command codes
	constant PCMD_REQ			: unsigned(7 downto 0) := x"23";	-- '#'
	constant PCMD_REQ_CHK	: unsigned(7 downto 0) := x"24"; -- '$'
	constant PCMD_PUB			: unsigned(7 downto 0) := x"25"; -- '%'
	constant PCMD_PUB_CHK	: unsigned(7 downto 0) := x"26"; -- '&'
	constant PCMD_COLON		: unsigned(7 downto 0) := x"3A"; -- ':'
	constant PCMD_STR			: unsigned(7 downto 0) := x"2A"; -- '*'
	constant PCMD_END			: unsigned(7 downto 0) := x"0A"; -- 'LF' or '\n'	(line feed/newline)
	constant PCMD_CRTN		: unsigned(7 downto 0) := x"0D"; -- 'CR'				(carriage return)	
	constant PCMD_TAB			: unsigned(7 downto 0) := x"09"; -- 'TAB'
	constant PCMD_WHTSP		: unsigned(7 downto 0) := x"20"; -- ' '
	constant PCMD_COMMA		: unsigned(7 downto 0) := x"2C"; -- ','	
	constant PCMD_PERIOD		: unsigned(7 downto 0) := x"2E"; -- '.'

	-- RxFSM States
	type rxfsm_states is (INIT, WAIT_STORE_HEAD, WAIT_STORE_DATA, STORE_TAIL, ERR_FORMAT);
								 
	signal state_reg : rxfsm_states := INIT;
	signal state_nxt : rxfsm_states;
	
	signal st_rd_cnd_reg		: std_logic := '0';		-- state reading command not data: '0' = data, '1' = command
	signal st_rd_cnd_nxt		: std_logic;	

begin

	ASSERT (C_PL_RX_ERR_WIDTH=0) REPORT "Lite version of the RxFSM does not support C_PL_RX_ERR_WIDTH>0" SEVERITY warning;
	ASSERT (C_CHECKSUM=0) REPORT "Lite version of the RxFSM does not support C_CHECKSUM>0" SEVERITY failure;

	clear_errors_o 	<= '1';	-- ignore any errors from the physical layer
	flush_rx_fifo_o	<= '0';  -- never flush rx fifo's
	clr_err_o 			<= '1';	-- ingore any erros from the ASCII decoder
	rxfifo_in_sel_o	<= '0';	-- ignore / permanently select rxfifo_0
	rxfifo_out_sel_o	<= '0'; 	-- ignore / permanently select rxfifo_0

	-- register process
	process (clk_i)
	begin
		if rising_edge(clk_i) then
			if reset_i='1' then
				state_reg <= INIT;
				st_rd_cnd_reg <= '1';
			else
				state_reg <= state_nxt;
				st_rd_cnd_reg <= st_rd_cnd_nxt;
			end if;
		end if;
	end process;
	
	-- next state logic
	process(state_reg, bin_vld_i, bin_pc_i, bin_ac_i, bin_ad_i, bin_data_i, 
			  rxfifo_out_empty_i, rxfifo_in_full_i, txfifo_b_full_i, st_rd_cnd_reg)
	begin
		-- default
		state_nxt 		<= state_reg;
		st_rd_cnd_nxt	<= st_rd_cnd_reg;
		
		bin_rd_o <= '0';		
		
		rxfifo_in_data_in_o 	<= (others=>'0');
		rxfifo_in_wr_o			<= '0';
		rxfifo_in_reset_o		<= '0';		
		
		txfifo_b_wr_o  		<= '0';
		txfifo_b_data_in_o 	<= (others=>'0');
		
		case state_reg is
			
			-------------------------------------
			-- State INIT
			-------------------------------------
				when INIT =>
					st_rd_cnd_nxt  <= '1';
					state_nxt <= WAIT_STORE_HEAD;
			-------------------------------------
			
			-------------------------------------		
			-- State WAIT_STORE_HEAD
			-------------------------------------
				when WAIT_STORE_HEAD =>
					if rxfifo_in_full_i='0' then									-- if space in RxFIFO
						if bin_vld_i='1' then										-- 	if valid data/command
						
							if bin_pc_i='1' then										-- 		if valid packet command
								-- test if valid/invalid format (ignore data separators, '*' and '\n')
								if unsigned(bin_data_i)=PCMD_PUB or 
									unsigned(bin_data_i)=PCMD_PUB_CHK or 
									unsigned(bin_data_i)=PCMD_REQ_CHK then		-- 			if invalid format (cmd = %, & or $)
										state_nxt <= ERR_FORMAT;
								elsif	unsigned(bin_data_i)=PCMD_REQ then		--				if valid format and cmd = #																	
									rxfifo_in_data_in_o 	<= '1' & bin_data_i;	-- 				write head marked as command
									rxfifo_in_wr_o			<= '1';
									state_nxt <= WAIT_STORE_DATA;
								end if;
							end if;
							
							bin_rd_o <= '1';
						end if;
					end if;
			-------------------------------------

			-------------------------------------
			-- State WAIT_STORE_DATA
			-- --------------------
			-- ignores: format (bin_data= #, $, % or &),
			-- 			parity, framing, overrun, aligment (missing databyte),
			--				invalid data and oversize errors,
			--				dataseperators (TAB, whitespace, comma, period) + carriage return (0x0D)
			-------------------------------------
				when WAIT_STORE_DATA =>		
					if rxfifo_in_full_i='0' then								-- if space in RxFIFO

						if bin_vld_i='1' then									-- 	if valid data/command
						
							if bin_pc_i='1' then									-- 	if packet command
						
								if	unsigned(bin_data_i)=PCMD_END or 		--			if valid format and cmd = '\n' / 'LF'
									unsigned(bin_data_i)=PCMD_CRTN then		--			if valid format and cmd = 'CR'
									st_rd_cnd_nxt  <= '1';						--			switch to reading app. command
									state_nxt <= STORE_TAIL;								
									
								elsif unsigned(bin_data_i)=PCMD_COLON then 			--		if valid format and cmd = ':'
									st_rd_cnd_nxt  <= '0';									--			switch to reading app. data
									
									rxfifo_in_data_in_o 	<= '1' & bin_data_i;			-- 		write bin_data_i marked as command
									rxfifo_in_wr_o 		<= '1';

								end if;
							else																		-- 	if application data/command
								rxfifo_in_data_in_o 	<= '0' & bin_data_i;					-- 		write bin_data_i marked as data
								rxfifo_in_wr_o 		<= '1';
							end if;
							
							bin_rd_o <= '1';
						end if;

					end if;						
			-------------------------------------

			-------------------------------------
			-- State STORE_TAIL
			-------------------------------------
				when STORE_TAIL =>
					rxfifo_in_data_in_o 	<= '1' & std_logic_vector(PCMD_END);	-- write tail marked as command
					rxfifo_in_wr_o 		<= '1';
					
					state_nxt <= WAIT_STORE_HEAD;
			-------------------------------------
			
			-------------------------------------
			-- State ERR_FORMAT
			-------------------------------------
				when ERR_FORMAT =>
					if txfifo_b_full_i='0' then
						txfifo_b_wr_o  <= '1';
						txfifo_b_data_in_o <= F_IMF;	-- write error code to TxFIFO B (TxFSM will insert the necesarry head+tail commands)
						state_nxt <= WAIT_STORE_HEAD;
					end if;
			-------------------------------------				
			
		end case;
		
	end process;

	st_rd_ac_o <= st_rd_cnd_reg;
	st_rd_ad_o <= not st_rd_cnd_reg;

end lite;

