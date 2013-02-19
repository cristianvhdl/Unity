----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    13:37:05 03/23/2012 
-- Design Name: 
-- Module Name:    wb_slv_db_mem_ctrl_a6 - Behavioral 
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
library ieee;
use ieee.std_logic_1164.all;
use work.wb_classic_interface.all;

library db_mem_v01_00_a;
use db_mem_v01_00_a.db_mem.all;

entity wb_slv_db_mem_ctrl is
	generic (
		C_MEM_ADDR_WIDTH 		: integer range 0 to 32 := 10	-- Memory depth/size	
	);
	port ( 
		-- wb syscon interface	
		clk_i : in  std_logic;
		rst_i : in  std_logic;
		
		-- wb slave interface
		wb_i 	: in  wb_ad32sb_if;
		wb_o 	: out wb_d32ae_if;
		
		-- db_mem interface
		db_i 	: in  db_mem_cwrm_o_if;
		db_o 	: out db_mem_cwrm_i_if
		);
end wb_slv_db_mem_ctrl;

architecture Behavioral of wb_slv_db_mem_ctrl is

	constant CW : integer := 0;
	constant RM : integer := 1;

	signal ack_reg : std_logic := '0';
	signal ack_nxt : std_logic;
	signal ack_req : std_logic;
	
	signal err_reg : std_logic := '0';
	signal err_nxt : std_logic;	
	signal err_req : std_logic;

begin

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


	-- algorithm/logic/combinatorial process
	
	ack_nxt <= '1' when ack_req='1' and ack_reg='0' else '0';	-- ensure cycle terminating signal can only be
	err_nxt <= '1' when err_req='1' and err_reg='0' else '0';	-- asserted for one clock cycle (CLASSIC STANDARD MODE).
	
	wb_o.dat 	<= db_i.str when wb_i.adr(C_MEM_ADDR_WIDTH)='1' else db_i.data; 		-- data output (reg/mem->wb)
	
	db_o.data	<= wb_i.dat;																					-- data output (wb->mem)
	db_o.adr(C_MEM_ADDR_WIDTH-1 downto 0) 	<= wb_i.adr(C_MEM_ADDR_WIDTH-1 downto 0);	-- "decode" addr
	
	wb_o.ack	<= ack_reg;
	wb_o.err	<= err_reg;
	
	process(wb_i, db_i, ack_reg, err_reg)		
	begin
		
		-- cycle not started, 
		-- [RULE 3.30] slave MAY ONLY react to syscon signals		
		
		-- defaults
		ack_req <= '0';
		err_req <= '0';
		
		-- db_mem outputs
		db_o.ctr_we		<= '1';
		db_o.ctr(CW)	<= '0';	-- CW
		db_o.ctr(RM)	<= '0';	-- RM
		db_o.we			<= '0';

		if wb_i.cyc='1' then
		
			if wb_i.sgl='1' or wb_i.blk='1' then					-- cycle started in SINGLE/BLOCK mode, slave MAY be active
			
				if wb_i.blk='1' and wb_i.we='0' then				-- READ BLOCK mode cycle in progress
					db_o.ctr(RM) <= '1';										-- assert the read multiple flag to block any commit's during the block read
				end if;			
			
				if wb_i.stb='1' then
					
					if wb_i.we='0' then									-- READ mode	
						ack_req <= '1'; 										-- status register/shared memory access (synchronous)
					end if;
					
					if wb_i.we='1' then									-- WRITE mode				
						if wb_i.adr(C_MEM_ADDR_WIDTH)='1' then		-- status register access (synchronous)
							db_o.ctr(CW) <= not ack_reg;					-- ensure the commit write request is only asserted during 
																					-- the ONE clock cycle before ack_o is asserted
							ack_req <= '1';
						else														-- shared memory access (synchronous)
							db_o.we <= (not ack_reg) and (not err_reg); -- ensure the write enable request is only asserted during 
																					  -- the ONE clock cycle before ack_o or err_o is asserted
							
							if db_i.w_ack='1' then
								ack_req <= '1';
							elsif db_i.w_err='1' then
								err_req <= '1';
							end if;
						end if;
					end if;
					
				end if;		
				
			end if;
			
		end if;
		
	end process;

end Behavioral;