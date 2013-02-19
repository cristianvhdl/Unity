Unity is a unified hardware/gateware/software framework for FPGAs.

The vison and goal of the Unity-framework is to: (1) enable inexperienced 
users to build high quality interface and control systems using FPGAs and 
interface them to high-level software frameworks (such as ROS), but also to (2) provide 
a framework to speed up and increase the innovation level of researchers 
and engineers working in experimental robotics.

The Unity framework is split into three main parts: Hardware, Gateware and Software.

HARDWARE:
------------
The hardware part of the Unity-framework contains schematic and pcb 
designs (primarily made in Altium Designer) of various hardware modules 
used for building experimental robot controllers.

GATEWARE:
------------
The gatware part of the Unity-framework contains a library of VHDL components.

The VHDL components are designed for handling the most common tasks when one is 
building mechatronic/robot control systems and interfacing them to PC's.

Some components are very simple, others are more advanced, most can configured using 
generics and some are build to the specific users needs by codegeneration 
scripts, e.g. python-scripts.

SOFTWARE:
------------
The software part of the Unity-framework primarily contains drivers and communication 

components for interfacing the Unity gateware framework to PC based tools or programming languages.
Examples of tools can be ROS: a high-level software framework for robot control, or an engineering tool such as MatLab.

SUpported Programming languges are currently: C, C++ and Python, but drivers for C# and JAVA are planned.
