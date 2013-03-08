package dk.sdu.mmmi.embedix.generator

import dk.sdu.mmmi.embedix.ulswig.LinkSpec
import dk.sdu.mmmi.embedix.ulswig.LinkBinding
import dk.sdu.mmmi.embedix.ulswig.Expansion
import dk.sdu.mmmi.embedix.ulswig.Instantiation
import dk.sdu.mmmi.embedix.ulswig.Grouping
import dk.sdu.mmmi.embedix.ulswig.Constructor
import dk.sdu.mmmi.embedix.ulswig.TosNetLinkBinding
import dk.sdu.mmmi.embedix.ulswig.LinkProperty
import dk.sdu.mmmi.embedix.ulswig.Argument
import dk.sdu.mmmi.embedix.ulswig.SimpleExpansion
import dk.sdu.mmmi.embedix.ulswig.AddressExpansion
import dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec
import dk.sdu.mmmi.embedix.ulswig.NamedAddressSpec
import dk.sdu.mmmi.embedix.ulswig.InstantiationProperty
import org.eclipse.emf.common.util.EList
import dk.sdu.mmmi.embedix.ulswig.IDProperty
import dk.sdu.mmmi.embedix.ulswig.CRCProperty
import dk.sdu.mmmi.embedix.ulswig.PublishProperty
import dk.sdu.mmmi.embedix.ulswig.AddressTuple
import dk.sdu.mmmi.embedix.ulswig.GroupElement
import java.util.List
import java.util.ArrayList
import java.util.HashMap

import static extension dk.sdu.mmmi.embedix.generator.Utilities.*

class PythonULSWCompiler {

	var LinkSpec link
	val groupingMembers = new HashMap<String,List<String>>

	new(LinkSpec _link) {
		link = _link
	}

	/**
	 * Header and overall file structure
	 */

	def generate() '''
	# Automatically generated code
	from unity_link import * #@UnusedWildImport
	from unity_link_hw import * #@UnusedWildImport
	from unity_link_data import * #@UnusedWildImport
	from unity_link_data import ul_data_proxy
	from unity_link_hw import ul_hw_mem
	
	«FOR c: link.constructors»
	«c.compile»

	«ENDFOR»
	«FOR g:groupingMembers.keySet»
	«g.generateGroupingClass(groupingMembers.get(g).map([s|s.replace('.','_')]))»

	«ENDFOR»
	'''

	/**
	 * Constructor
	 */
	
	def compile(Constructor c) '''
	class «c.name.constructorName(c)»:
		def __init__(self«FOR p:c.parameters»,«p»«ENDFOR»,ul_hwp=None):
			«FOR p:c.parameters»
			self.ul_parameter_«p» = «p»
			«ENDFOR»
			self.ul_hwp = ul_hwp
		
		def bind(self,ul_addresses):
			«IF c.addresses instanceof AddressTuple»
			ul_addresses = dict(zip([«FOR n:(c.addresses as AddressTuple).elements SEPARATOR ","»'«n»'«ENDFOR»],ul_addresses["_"]))
			«ENDIF»
			«FOR m: c.members»
			«m.compileMember(c)»
			«ENDFOR»
	'''

	def constructorName(String name, Constructor constructor) { 
		"UL_"+if(constructor.isPublic) name else "private_"+name
	}

	/**
	 * All member types, utilities
	 */

	def compileArgument(Argument a) {
		return if(a.simple!=null) "self.ul_parameter_"+a.simple
				else if(a.text!=null) "\""+a.text+"\""
				else "self.ul_parameter_"+a.lhs+"+"+a.rhs.compileArgument
	}
	
	/**
	 * Link bindings
	 */

	def dispatch compileMember(LinkBinding m, Constructor c) {
		return (m as TosNetLinkBinding).compileBinding // TODO: rewrite for multidispatch
	}
	
	def compileBinding(TosNetLinkBinding t) '''
			# initialization for TOSNET link binding
			link_base = 0 # default value
			«FOR p:t.properties»
			«p.compileLinkProperty»
			«ENDFOR»
			self.ul_hwp = ul_hw_mem(link_base, 256, 2, link_ctrl, link_uart.getID())
	'''

	def compileLinkProperty(LinkProperty property) { 
		if(property.ctrlName!=null) '''link_ctrl = self.ul_parameter_«property.ctrlName»'''
		else if(property.uartName!=null) '''link_uart = self.ul_parameter_«property.uartName»'''
		else '''link_base = «property.baseValue»'''
	}

	/**
	 * Expansion member
	 */
	
	def dispatch compileMember(Expansion m, Constructor c) '''
			# initialization for expansion «m.name»
			self.«m.name» = «m.constructor.name.constructorName(m.constructor)»(«FOR a:m.arguments SEPARATOR ","»«a.compileArgument»«ENDFOR»,ul_hwp=self.ul_hwp)
			«m.compileExpansionAddressBinding»
	'''

	def dispatch compileExpansionAddressBinding(SimpleExpansion m) '''
			self.«m.name».bind({
				«FOR b:m.bindings SEPARATOR ","»
				'«b.name.providedOrDefaultName»': [«FOR x:b.addresses SEPARATOR ","»«x»«ENDFOR»]
				«ENDFOR»
			})
	'''
	
	def providedOrDefaultName(String name) {
		if(name==null) "_" else name
	}


	def dispatch compileExpansionAddressBinding(AddressExpansion m) '''
			self.«m.name».bind({
				'_': ul_addresses['«m.name»']
			})
	'''

	/**
	 * Instantiation member
	 */

	def dispatch compileMember(Instantiation m, Constructor c) '''
			# initialization for instantiation «m.address.name»
			ul_address = «m.address.getAddressFromSpec»
			self.«m.address.name» = ul_data_proxy(self.ul_hwp,ul_address, «m.properties.getInstantiationID», «m.kind.getKind», 0«FOR p:m.properties»«IF !(p instanceof IDProperty)»,«p.getNamedProperty»«ENDIF»«ENDFOR»)
	'''

	def dispatch getNamedProperty(CRCProperty p) {
		"crc=True"
	}

	def dispatch getNamedProperty(PublishProperty p) {
		"publish_config=["+p.mode+","+p.rate+"]"
	}
	
	def getKind(String string) { 
		if(string.equals("READ")) "ACCESS_RIGHT.R" else "ACCESS_RIGHT.W"
	}

	def getInstantiationID(EList<InstantiationProperty> list) { 
		for(p: list) if(p instanceof IDProperty) return (p as IDProperty).id.compileArgument
		return "(no name)"
	}
	
	def dispatch getAddressFromSpec(DirectAddressSpec spec) {
		spec.address
	}

	def dispatch getAddressFromSpec(NamedAddressSpec spec) {
		"ul_addresses['"+spec.name+"']"
	}

	/**
	 * Grouping member
	 */
	
	def dispatch compileMember(Grouping m, Constructor c) '''
			# initialization for grouping «m.name»
			ul_group_«m.name» = []
			«FOR e:m.elements»
			ul_group_«m.name».append(«e.generateGroupAccess("UL_private_group_"+m.name,c)»)
			«ENDFOR»
			self.«m.name» = UL_private_group_«m.name»(self.ul_hwp,ul_group_«m.name»)
	'''
	
	def generateGroupAccess(GroupElement element, String groupingName, Constructor context) { 
		// Compute proxies
		val expansion = computeGroupComponents(element,context,"self.",".")
		// Store for subsequent proxy class generation
		if(groupingMembers.get(groupingName)==null) groupingMembers.put(groupingName,new ArrayList<String>)
		for(e:expansion) groupingMembers.get(groupingName).add(e)
		// Construct result string
		val result = new StringBuffer
		for(b: expansion) {
			if(result.length>0) result.append(",")
			result.append(b)
		}
		return result
	}

	def generateGroupingClass(String className, List<String> proxyFlatNames) '''
	class «className»(ul_data_proxy_group):
		def __init__(self,ul_hwp,ul_proxies):
			self.ul_hwp = ul_hwp
			int ul_index = 0
			«FOR n:proxyFlatNames»
			self.ul_proxy_«n» = ul_proxies[ul_index]
			ul_index += 1
			«ENDFOR»
			ul_data_proxy_group.__init__(self, ul_data_proxy_group, 'Group «className»')
		
		def write(self«FOR n:proxyFlatNames»,ul_val_«n»«ENDFOR»):
			self._hwp_data_map[self.ul_hwp.getID()].write(addr=[«FOR n:proxyFlatNames SEPARATOR ","»self.ul_proxy_«n».addr«ENDFOR»], data=[«FOR n:proxyFlatNames»,ul_val_«n»«ENDFOR»], timestamp=None, quiet=True)
	'''

}