'''
Created on Oct 25, 2012

@author: anlan
'''

import os

"***********************************************************************"
"user supplied info, to be entered using GUI or command-line tool"

ISE_INSTALL_PATH = "c:/Xilinx/14.2/ISE_DS/"
SETTINGS32 = "settings32.bat"
SETTINGS64 = "settings64.bat"

collenction_path = "C:\\XilinxProjects\\PhD\\vhdl_libs"
collection_name = "Unity-HDL libs"
ise_prj_path = "C:\\XilinxProjects\\PhD\\vhdl_libs\\tosnet_core\\trunk\\projnav\\ise.xise"
planahead_prj_path = "C:\\XilinxProjects\\PhD\\lib_test\\planahead_test\\planahead_test.ppr"

libs = []
libs.append(["fifo", "v02_10_b"])
libs.append(["ram", "v03_00_b"])

use_ise = True  
use_planahead = False
use_headless_tcl = True
use_xml_access = False
use_64_bit = True

"***********************************************************************"

class lib_collection(object):
    
    dir_prefix_excl_str = ('.', '_')  
    path = None
    name = None
    packages = None #list of packages
    
    def __init__(self, path, name):
        
        self.packages = []
                
        self.name = name
        self.path = path
        
        "index root directory"
        for root, dirs, files in os.walk(self.path):
            break
        
        "create packages, versions and source objects"        
        for dir in dirs:
            if not dir.startswith(self.dir_prefix_excl_str):
                self.packages.append(lib_package(dir, self))
        
        "remove invalid packages and library versions"
        for i in range(len(self.packages)-1,-1,-1):
            if self.packages[i].is_valid_package() == False:                
                del self.packages[i]
        
        "create cross-reference dependencies"
        for p in self.packages:
            p.update_dependencies()        
      
class lib_package(object):
    
    dir_match_str = ('tags')
    dir_prefix_excl_str = ('.', '_')

    parent = None
    path = None
    name = ""
    versions = None #list of versions (tags) in the package
    
    def __init__(self, name, parent):
        ""
        self.versions = []
        
        self.parent = parent        
        self.name = name    
        self.path = self.parent.path + '/' + self.name
        
        for root, dirs, files in os.walk(self.path):
            break
        
        for dir in dirs:
            if dir == (self.dir_match_str):
                
                for tag_root, tag_dirs, files in os.walk(self.path+'/'+dir):
                    break
                
                for tag_dir in tag_dirs:
                    if not tag_dir.startswith(self.dir_prefix_excl_str):
                        self.versions.append(lib_version(tag_dir, self))                
    
    def is_valid_package(self):
        returnVal = False
        
        for i in range(len(self.versions)-1,-1,-1):
            if self.versions[i].is_valid_library() == False:
                del self.versions[i]
            else:
                returnVal = True
        
        return returnVal
    
    def update_dependencies(self):
        for v in self.versions:
            v.update_dependencies()

class lib_version(object):
    
    file_suffix_incl_str = ('.vhd')
    validlib_suffix_incl_str = ('_pkg.vhd')
    
    parent = None
    path = None
    name = ""
    sources = None #list of source files in the specific library version
    
    def __init__(self, name, parent):
        ""
        self.sources = []
        
        self.parent = parent
        self.name = name
        self.path = self.parent.path + '/tags/' + self.name
        
        for root, dirs, files in os.walk(self.path):
            break
        
        for file in files:
            if file.endswith(self.file_suffix_incl_str):
                self.sources.append(lib_source(file, self))
    
    def is_valid_library(self):
        returnVal = False
        
        "verify at least one package vhdl file exists"
        for s in self.sources:
            if s.name.endswith(self.validlib_suffix_incl_str):
                returnVal = True
        
        "verify the version name is formatted correct, ex: v01_00_a"
        if not (len(self.name) == 8 and self.name[0]=='v' and self.name[1:2].isalnum() and self.name[4:5].isalnum() and self.name[3]=='_' and self.name[6]=='_' and self.name[7].isalpha()):
            returnVal = False
        
        return returnVal
    
    def update_dependencies(self):
        for s in self.sources:
            s.update_dependencies()

class lib_source(object):
        
    parent = None
    path = None    
    name = ""
    dependencies = None # list of lib_version objects
    
    def __init__(self, name, parent):
        ""
        self.dependencies = []
        
        self.parent = parent
        self.name = name
        self.path = self.parent.path + '/' + self.name

    def update_dependencies(self):
        ""
        dependency = []
        f = open(self.path)
        for line in f:
            l = line.strip()
            l = l.lower()
            if l.startswith("library") and l.find("ieee")==-1:
                l = l.replace(';','')
                l = l.split(' ')
                l = l[1]
                package = l[0:len(l)-9]
                version = l[len(l)-8:len(l)]
                dependency.append([package, version])
                
        f.close()
        
        collection = self.parent.parent.parent
        
        for package, version in dependency:  
            for p in collection.packages:
                if p.name == package:
                    for v in p.versions:
                        if v.name == version:
                            self.dependencies.append(v)

    def get_dependency_list(self):
        """
            if no dependencies exist, returns : None
            if dependencies exist, returns : [[package, version]]            
        """
        if self.dependencies == None or len(self.dependencies)==0:
            return None
        else:
            ""
            dl = []
            for version in self.dependencies:
                lv = version.name
                pn = version.parent.name
                dl.append([pn, lv])
            return dl
                
def import_list_builder(collection, libs, im={}):
    """
        libs        : list of lists on the form: [[package, version]],
                      containing the package name and version of all
                      packages to be used.
        
        returns:    : {lib_name: [file_path]}
                        
                        lib_name : package_name + version_name
                        file_path : full path of file including the file name
    """
    for l in libs:
        key = l[0]+"_"+l[1] 
        if key not in im:
            "not in import map, search collection for library"
            for pkg in collection.packages:
                if pkg.name == l[0]:
                    for version in pkg.versions:
                        if version.name == l[1]:
                            "library exist, create source list and insert in import map"
                            files = []
                            for s in version.sources:
                                dl = s.get_dependency_list()                            
                                if dl != None:                                    
                                    import_list_builder(collection, dl, im)
                                files.append(s.path)
                            im[key] = files
                                
def build_lib_import_list(collection, libs):
    """
        libs        : list of lists on the form: [[package, version]],
                      containing the package name and version of all
                      packages to be used.
        
        returns:    : {lib_name: [file_path]}
                        
                        lib_name : package_name + version_name
                        file_path : full path of file including the file name
    """
    import_map = {}

    import_list_builder(collection, libs, import_map)
    
    return import_map 

def generate_ise_tcl_script(xise_file, import_map):
    ""
    sl = []
    sl.append("project open " + xise_file)
    
    for key in import_map:
        lib = key
        files = import_map[key]        
        sl.append("lib_vhdl new " + lib)
        for file in files:
            sl.append("xfile add " + file + " -lib_vhdl " + lib + """ -view "All" """ )
    
    sl.append("project close")
    
    s = ""
    for l in sl:
        s = s + l + '\n'
    
    return s

def ise_lib_importer_headless_tcl(collection, xise_file, libs, _64bit=False):
    """
        collection  : reference to the library collection to use
        xise_file   : full path incl. filename of the xise project file to update
        libs        : list of lists on the form: [[package, version]],
                      containing the package name and version of all
                      packages to be used.
                      
    """
    
    "build complete map of libraries to import"
    import_map = build_lib_import_list(collection, libs)
    
    "generate tcl script"
    tcl_script = generate_ise_tcl_script(xise_file, import_map)
    
    "OPTION 1: headless generate TCL script then execute it automatically on the project"
    
    cmd = ISE_INSTALL_PATH
    if _64bit==True:
        cmd = cmd + SETTINGS64
    else:
        cmd = cmd + SETTINGS32
    
    f = open("import_libs.tcl", 'w')
    f.write(tcl_script)
    f.close()
        
    cmd = cmd + " xtclsh import_libs.tcl"
    os.system(cmd)    
    
def ise_lib_importer_2(collection, xise_file, libs):
    """
        collection  : reference to the library collection to use
        xise_file   : full path incl. filename of the xise project file to update
        libs        : list of lists on the form: [[package, version]],
                      containing the package name and version of all
                      packages to be used.
                      
    """
    
    "build complete map of libraries to import"
    import_map = build_lib_import_list(collection, libs)
    
    "OPTION 2: interface the python script into ISE as tool add on using TCL, and utilize ISE TCL command to add libraries and lib-files to the project"

def ise_lib_importer_3(collection, xise_file, libs):
    """
        collection  : reference to the library collection to use
        xise_file   : full path incl. filename of the xise project file to update
        libs        : list of lists on the form: [[package, version]],
                      containing the package name and version of all
                      packages to be used.
                      
    """
    
    "build complete map of libraries to import"
    import_map = build_lib_import_list(collection, libs)
    
    "OPTION 3.1: build list of existing libraries already imported in the xise file... parse the xml list"    
    "OPTION 3.2: compare import and existing lists, report and/or handle any issues..."    
    "OPTION 3.3: update xise file with libraries on import list... write xml to xise file"    

def generate_planahead_tcl_script(ppr_file, import_map):
    ""
    sl = []
    sl.append("open_project " + ppr_file)
       
    for key in import_map:               
        lib = key
        files = import_map[key]
        
        add_files = "add_files -norecurse {"
        set_property = "set_property library " + lib + " [get_files {"        
                     
        for file in files:
            add_files = add_files + file + "\n"
            set_property = set_property + file + "\n"
        
        add_files = add_files[0:len(add_files)-1]
        set_property = set_property[0:len(set_property)-1]
        
        add_files = add_files + "}"
        set_property = set_property + "}]"
        
        sl.append(add_files)
        sl.append(set_property)
        
        
    sl.append("close_project")
    
    s = ""
    for l in sl:
        s = s + l + '\n'
    
    return s    

def planahead_lib_importer_headless_tcl(collection, ppr_file, libs, _64bit=False):
    """
        collection  : reference to the library collection to use
        xise_file   : full path incl. filename of the xise project file to update
        libs        : list of lists on the form: [[package, version]],
                      containing the package name and version of all
                      packages to be used.
                      
    """
    
    "build complete map of libraries to import"
    import_map = build_lib_import_list(collection, libs)
    
    "generate tcl script"
    tcl_script = generate_planahead_tcl_script(ppr_file, import_map)
    
    " headless generate TCL script then execute it automatically on the project"
    
    cmd = ISE_INSTALL_PATH
    if _64bit==True:
        cmd = cmd + SETTINGS64
    else:
        cmd = cmd + SETTINGS32
    
    f = open("import_libs.tcl", 'w')
    f.write(tcl_script)
    f.close()
        
    cmd = cmd + " planahead -mode batch -source import_libs.tcl"
    os.system(cmd)

if __name__ == '__main__':
    
    
    "ensure paths use unix style slashes"
    collenction_path = collenction_path.replace('\\', '/')
    ise_prj_path = ise_prj_path.replace('\\', '/')
    planahead_prj_path = planahead_prj_path.replace('\\', '/')
    
    "create library collection"
    collection = lib_collection(collenction_path, collection_name)
    
    if use_ise:
        if use_headless_tcl:
            "execute ISE Headless TCL lib importer"
            ise_lib_importer_headless_tcl(collection, ise_prj_path, libs, use_64_bit)
        elif use_xml_access:
            ""
            print "ISE use_xml_access not implemented!" 
    elif use_planahead:
        if use_headless_tcl:
            "execute PlanAhead Headless TCL lib importer"
            planahead_lib_importer_headless_tcl(collection, planahead_prj_path, libs, use_64_bit)
        elif use_xml_access:
            ""
            print "PlanAhead use_xml_access not implemented!"
    
    
    print 'done'
    
