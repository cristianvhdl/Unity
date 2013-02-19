----------------------------------------------------------------------------------
-- Company: Anders Blaabjerg Lange
-- Engineer: University Of Southern Denmark
-- 
-- Create Date:    16:10:54 12/04-2012 
-- Design Name: 
-- Module Name:    rr_prio_enc - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:  	Round Robin Priority Encoder for non mutual 
-- 					exclusive one-hot encoded inputs.
--
-- Dependencies:
--
-- Revision History:
-- -----------------------------------------
-- Version		Date			Author	Comment
-- 0.01 			12/04-2012 	ANLAN		File Created
-- 0.02 			26/09-2012 	ANLAN		Updated to use libraries for external modules/components
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

library utility_v01_00_a;
use utility_v01_00_a.log_pkg.all;

entity rr_prio_enc is
	generic (
		C_REQ_SIZE : positive := 4													-- Number of request inputs
	);
	port ( 
		req_i : in  std_logic_vector(C_REQ_SIZE-1 downto 0);				-- One-Hot encoded request inputs
		cur_i : in  std_logic_vector (log2r(C_REQ_SIZE)-1 downto 0);	-- Current selected input (binary)
		vld_o : out std_logic;														-- Cutput (ptr_o) valid
      ptr_o : out std_logic_vector (log2r(C_REQ_SIZE)-1 downto 0)		-- Next input to be granted access/permission (binary)
	);
end rr_prio_enc;

architecture Behavioral of rr_prio_enc is

begin

	vld_o <= '1' when unsigned(req_i)/=0 else '0';
	
	process(cur_i, req_i)
		variable x : natural range 0 to C_REQ_SIZE-1;
	begin
		
		ptr_o <= (others=>'0');
		
		IF C_REQ_SIZE>1 THEN

			for n in 0 to C_REQ_SIZE-1 loop

				if unsigned(cur_i)=n then
									
					for i in 0 to C_REQ_SIZE-1 loop

						x := (n+i) mod (C_REQ_SIZE);
						
						if req_i(x)='1' then
							ptr_o <= std_logic_vector(to_unsigned(x,ptr_o'length));
						end if;

					end loop;
				
				end if;	

			end loop;		
			
		END IF;		
		
	end process;

end Behavioral;

--architecture manual of rr_prio_enc is
--
--begin
--	-- C_REQ_SIZE = 4
--	
--	vld_o <= '1' when unsigned(req_i)/=0 else '0';
--	
--	process(cur_i, req_i)
--	begin
--		
--		ptr_o <= (others=>'0');
--		
--		IF C_REQ_SIZE>1 THEN
--
--			if unsigned(cur_i)=0 then
--								
--				if req_i(0)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(1)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;					
--			
--				if req_i(2)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(3)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;			
--			
--			end if;
--			
--			if unsigned(cur_i)=1 then
--								
--				if req_i(1)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(2)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;					
--			
--				if req_i(3)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(0)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;			
--			
--			end if;			
--			
--			if unsigned(cur_i)=2 then
--								
--				if req_i(2)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(3)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;					
--			
--				if req_i(0)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(1)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;			
--			
--			end if;	
--
--			if unsigned(cur_i)=3 then
--								
--				if req_i(3)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(0)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;					
--			
--				if req_i(1)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(0,ptr_o'length));
--				end if;								
--								
--				if req_i(2)='1' then
--					ptr_o <= std_logic_vector(to_unsigned(1,ptr_o'length));
--				end if;			
--			
--			end if;			
--			
--		END IF;		
--		
--	end process;
--
--end manual;