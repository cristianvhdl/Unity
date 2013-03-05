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

class PythonCompiler {

	/**
	 * Header and overall file structure
	 */

	def generate(LinkSpec link) '''
	# Automatically generated code
	from unity_link import * #@UnusedWildImport
	from unity_link_hw import * #@UnusedWildImport
	from unity_link_data import * #@UnusedWildImport
	from unity_link_data import ul_data_proxy
	from unity_link_hw import ul_hw_mem
	
	«FOR c: link.constructors»
	«c.compile»

	«ENDFOR»
	'''

	/**
	 * Constructor
	 */
	
	def compile(Constructor c) '''
	class «c.name.constructorName(c)»:
		def __init__(self«FOR p:c.parameters»,«p»«ENDFOR»):
			«FOR p:c.parameters»
			self.ul_parameter_«p» = «p»
			«ENDFOR»
		
		def bind(self,ul_addresses):
			«IF c.addresses instanceof AddressTuple»
			ul_addresses = dict(zip([«FOR n:(c.addresses as AddressTuple).elements SEPARATOR ","»'«n»'«ENDFOR»],ul_addresses["_"]))
			«ENDIF»
			«FOR m: c.members»
			«m.compileMember»
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
				else a.lhs+"+"+a.rhs.compileArgument
	}
	
	/**
	 * Link bindings
	 */

	def dispatch compileMember(LinkBinding m) {
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
	
	def dispatch compileMember(Expansion m) '''
			# initialization for expansion «m.name»
			self.«m.name» = «m.constructor.name.constructorName(m.constructor)»(«FOR a:m.arguments SEPARATOR ","»«a.compileArgument»«ENDFOR»)
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

	def dispatch compileMember(Instantiation m) '''
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
	
	def dispatch compileMember(Grouping m) '''
			# initialization for grouping a«m.name»
	'''
}