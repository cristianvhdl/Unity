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

class PythonCompiler {
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
	
	def compile(Constructor c) '''
	class «c.name.constructorName(c)»:
		def __init__(self«FOR p:c.parameters»,«p»«ENDFOR»):
			«FOR p:c.parameters»
			self.ul_parameter_«p» = «p»
			«ENDFOR»
		
		def bind(self,ul_addresses):
			«FOR m: c.members»
			«m.compileMember»
			«ENDFOR»
	'''

	def constructorName(String name, Constructor constructor) { 
		"UL_"+if(constructor.isPublic) name else "private_"+name
	}

	def dispatch compileMember(LinkBinding m) {
		return (m as TosNetLinkBinding).compileBinding // Rewrite for multidispatch
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

	
	def dispatch compileMember(Expansion m) '''
			# initialization for «m.name»
			self.«m.name» = «m.constructor.name.constructorName(m.constructor)»(«FOR a:m.arguments SEPARATOR ","»«a.compileArgument»«ENDFOR»)
			«m.compileExpansionAddressBinding»
	'''

	def dispatch compileExpansionAddressBinding(SimpleExpansion m) '''
			self.«m.name».bind({
				«FOR b:m.bindings SEPARATOR ","»
				'«b.name»': [«FOR x:b.addresses SEPARATOR ","»«x»«ENDFOR»]
				«ENDFOR»
			})
	'''

	def dispatch compileExpansionAddressBinding(AddressExpansion m) '''
			self.«m.name».bind({
				'_': ul_addresses['«m.name»']
			}
	'''

	def compileArgument(Argument a) {
		return if(a.simple!=null) "self.ul_parameter_"+a.simple
				else if(a.text!=null) "\""+a.text+"\""
				else a.lhs+"+"+a.rhs.compileArgument
	}
	
	def dispatch compileMember(Instantiation m) '''
			# initialization for «m.address.name»
	'''
	
	def dispatch compileMember(Grouping m) '''
			# initialization for «m.name»
	'''
}