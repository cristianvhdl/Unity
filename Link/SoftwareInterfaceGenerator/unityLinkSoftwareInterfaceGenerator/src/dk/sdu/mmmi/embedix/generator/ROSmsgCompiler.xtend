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
	val Map<TopicHolder,List<String>> writeTopics = new HashMap()
	val Map<TopicHolder,List<String>> readTopics = new HashMap()
	
	public new(LinkSpec spec) {
		this.spec = spec
		for(c:spec.constructors)
			if(c.isPublic) for(m:c.members) expandTopicPath(spec.name.join(c.name),m,c)
	}
	
	def void generate(String basedirectory, IFileSystemAccess access) {
		val directory = basedirectory+"/"+spec.name
		writeTopics.generateMSG("W", directory, access)
		readTopics.generateMSG("R",directory,access)
		generateBridgeFile(directory,access)
	}

	// ROS msg files generation
	
	def void generateMSG(Map<TopicHolder,List<String>> map, String prefix, String directory, IFileSystemAccess access) {
		for(e:map.entrySet)
			access.generateFile(directory+"/msg/"+prefix+e.key.rosName+".msg",generateMSGelements(e.value))
	}
	
	def generateMSGelements(List<String> names) '''
		«FOR n:names»
		int32 «n»
		«ENDFOR»
	'''

	// Python - ROS bridge
	
	def generateBridgeFile(String directory, IFileSystemAccess access) { 
		access.generateFile(directory+"/ros-"+spec.name+".py", generateBridge)
	}
	
	def generateBridge() '''
	import roslib
	import rospy
	
	ul_instance_«spec.name» = None
	
	# Helper functions for stand-alone ROS
	def ros_standalone_init():
		rospy.init_node('unity listener', anonymous=True)
	
	def ros_standalone_serve():
		rospy.spin()
	
	# Subscriptions
	«FOR e:writeTopics.entrySet»
	def ros_callback_«e.key.rosName»(data):
		«FOR n:e.value»
		ul_instance_«e.key.pythonName».«n».write(data.«n»)
		«ENDFOR»
	«ENDFOR»
	def init_subscriptions():
		«FOR e:writeTopics.entrySet»
		rospy.Subscriber("«e.key.baseName»/«e.key.rosName»","W«e.key.rosName»",ros_callback_«e.key.rosName»)
		«ENDFOR»
	# Publications
	'''

	// Expansion of all topic paths
	
	def dispatch void expandTopicPath(TopicHolder base, Member member, Constructor context) { }
	
	def dispatch void expandTopicPath(TopicHolder base, Expansion expansion, Constructor context) {
		for(m:expansion.constructor.members)
			expandTopicPath(base.join(expansion.name),m,expansion.constructor)
	}

	def dispatch void expandTopicPath(TopicHolder base, Instantiation instant, Constructor context) {
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

	def dispatch void expandTopicPath(TopicHolder base, Grouping group, Constructor context) {
		val List<String> expansion = new ArrayList
		for(e:group.elements) expansion.addAll(computeGroupComponents(e,context,"","_"))
		for(e:expansion) writeTopics.putIntoList(base.join(group.name),e)
	}

	// Generally useful stuff

	def putIntoList(Map<TopicHolder,List<String>> map, TopicHolder base, String name) {
		if(map.get(base)==null) map.put(base,new ArrayList)
		map.get(base).add(name)
	}


	def TopicHolder join(String base, String extend) { 
		new TopicHolder(base,extend,extend)
	}

	def TopicHolder join(TopicHolder holder, String extend) { 
		new TopicHolder(holder.baseName,holder.rosName+"_"+extend,holder.pythonName+"."+extend)
	}

}

@Data class TopicHolder {
	String baseName
	String rosName
	String pythonName 
}
