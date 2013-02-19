
Unity/Gateware/VHDL_LIB
------------

VHDL Library containing packages with various VHDL components.

Please only use the released versions of the packages, contained in the 'tags' folder.
The 'trunk' folder contain the main development directory, and the 'branch' folder 
contain any work that significantly diverts from the trunk.

N.B.
At the present time all packages have only been tested on Xilinx Spartan 3 and 6 FPGAs.

Some modules make use of Xilinx specific primitives and others rely on the synthesizer 
being able infer certain primitives from behvioral code VHDL directly. 
These components will not work on tool chains from other vendor.

It is the goal of the Unity project to make the VHDL library as cross vendor compliant 
as possible, users who discover any incompatability in the packages contained in these 
library are encouraged to report this, and if possible suggest changes to 
improve cross vendor compliancy.