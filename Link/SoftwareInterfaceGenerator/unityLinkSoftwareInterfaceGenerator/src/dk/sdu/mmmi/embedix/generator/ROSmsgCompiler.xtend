package dk.sdu.mmmi.embedix.generator

import dk.sdu.mmmi.embedix.ulswig.LinkSpec
import org.eclipse.xtext.generator.IFileSystemAccess
import dk.sdu.mmmi.embedix.ulswig.Member
import dk.sdu.mmmi.embedix.ulswig.Expansion
import dk.sdu.mmmi.embedix.ulswig.Instantiation
import java.util.List
import java.util.Map
import java.util.HashMap
import dk.sdu.mmmi.embedix.ulswig.InstantiationProperty
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import dk.sdu.mmmi.embedix.ulswig.PublishProperty
import dk.sdu.mmmi.embedix.ulswig.Grouping
import dk.sdu.mmmi.embedix.ulswig.Constructor

import static extension dk.sdu.mmmi.embedix.generator.Utilities.*

class ROSmsgCompiler {
	
	var LinkSpec spec
	val Map<String,List<String>> writeTopics = new HashMap()
	val Map<String,List<String>> readTopics = new HashMap()
	
	public new(LinkSpec spec) {
		this.spec = spec
		for(c:spec.constructors)
			if(c.isPublic) for(m:c.members) expandTopicPath(spec.name.join(c.name),m,c)
	}
	
	def void generate(String directory, IFileSystemAccess access) {
		writeTopics.generateMSG("W", directory, access)
		readTopics.generateMSG("R",directory,access)
	}
	
	def void generateMSG(Map<String,List<String>> map, String prefix, String directory, IFileSystemAccess access) {
		for(e:map.entrySet)
			access.generateFile(directory+"/"+prefix+e.key+".msg",generateMSGelements(e.value))
	}
	
	def generateMSGelements(List<String> names) '''
		«FOR n:names»
		int32 «n»
		«ENDFOR»
	'''

	// Expansion of all topic paths
	
	def dispatch void expandTopicPath(String base, Member member, Constructor context) { }
	
	def dispatch void expandTopicPath(String base, Expansion expansion, Constructor context) {
		for(m:expansion.constructor.members)
			expandTopicPath(base.join(expansion.name),m,expansion.constructor)
	}

	def dispatch void expandTopicPath(String base, Instantiation instant, Constructor context) {
		if(instant.kind.equals("READ")) {
			if(instant.properties.containsPublish) readTopics.putIntoList(base,instant.address.name)
		} else if(instant.kind.equals("WRITE"))
			writeTopics.putIntoList(base,instant.address.name)
		else throw new Error("Illegal kind: "+instant.kind)
	}

	def boolean containsPublish(EList<InstantiationProperty> list) { 
		for(p:list)
			if(p instanceof PublishProperty) return true
		return false
	}

	def dispatch void expandTopicPath(String base, Grouping group, Constructor context) {
		val List<String> expansion = new ArrayList
		for(e:group.elements) expansion.addAll(computeGroupComponents(e,context,"","_"))
		for(e:expansion) writeTopics.putIntoList(base.join(group.name),e)
	}

	// Generally useful stuff

	def putIntoList(Map<String,List<String>> map, String base, String name) {
		if(map.get(base)==null) map.put(base,new ArrayList)
		map.get(base).add(name)
	}


	def String join(String base, String extend) { base+"_"+extend }
}

