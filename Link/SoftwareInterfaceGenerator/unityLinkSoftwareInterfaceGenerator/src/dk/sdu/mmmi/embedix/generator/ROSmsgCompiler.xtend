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
			if(c.isPublic) for(m:c.members) expandTopicPath(spec.name.join(c.name,false),m,c)
	}
	
	def void generate(String basedirectory, IFileSystemAccess access) {
		val directory = basedirectory+"/"+(if(spec.packagename==null) spec.name else spec.packagename)
		writeTopics.generateMSG("W", directory, access)
		readTopics.generateMSG("R",directory,access)
		generateBridgeFile(directory,access)
		generateMainFile(directory,access)
	}

	// ROS msg files generation
	
	def void generateMSG(Map<TopicHolder,List<String>> map, String prefix, String directory, IFileSystemAccess access) {
		for(e:map.entrySet)
			access.generateFile(directory+"/msg/"+prefix+e.key.rosName+".msg",generateMSGelements(e.value))
	}
	
	def generateMSGelements(List<String> names) '''
		«FOR n:names»
		uint32 «n»
		«ENDFOR»
	'''

	// Python - ROS bridge
	
	def generateBridgeFile(String directory, IFileSystemAccess access) { 
		access.generateFile(directory+"/src/ros_"+spec.name+".py", generateBridge)
	}
	
	def generateBridge() '''
	import roslib
	import rospy
	«FOR e:writeTopics.entrySet»
	from «if(spec.packagename!=null) spec.packagename else spec.name».msg import W«e.key.rosName»
	«ENDFOR»
	«FOR e:readTopics.entrySet»
	from «if(spec.packagename!=null) spec.packagename else spec.name».msg import R«e.key.rosName»
	«ENDFOR»
	
	ul_instance_«spec.name» = None

	def unity_set_link(link,controller):
		global ul_instance_mini
		ul_instance_«spec.name» = link
		ul_attach_callbacks()
		controller.activate_publishing(True)
	
	# Helper functions for stand-alone ROS
	def ros_standalone_init(is_anonymous=False):
		rospy.init_node('«if(spec.packagename==null) spec.name else spec.packagename»', anonymous=is_anonymous)
	
	def ros_standalone_serve():
		rospy.spin()
	
	# Subscriptions
	«FOR e:writeTopics.entrySet»
	def ros_callback_«e.key.rosName»(data):
		ul_instance_«e.key.pythonName».write(«FOR n:e.value SEPARATOR ","»data.«n»«ENDFOR»)
	«ENDFOR»
	def init_subscriptions():
		«FOR e:writeTopics.entrySet»
		rospy.Subscriber("«e.key.rosName»",W«e.key.rosName»,ros_callback_«e.key.rosName»)
		«ENDFOR»
	
	# Publications
	«FOR e:readTopics.entrySet»
	ul_publisher_«e.key.rosName» = rospy.Publisher("«e.key.rosName»",R«e.key.rosName»)
	«IF e.key.group»
	def unity_callback_«e.key.rosName»(data):
		ul_publisher_«e.key.rosName».publish(R«e.key.rosName»(«FOR i:e.value.indices SEPARATOR ","»data[1][«i»]«ENDFOR»))
	«ELSE»
	ul_publisher_cache_«e.key.rosName» = {}
	«FOR f:e.value»
	def unity_callback_«e.key.rosName»_«f»(data,description,address):
		ul_publisher_cache_«e.key.rosName»["«f»"] = data
		ul_publisher_«e.key.rosName».publish(R«e.key.rosName»(«FOR n:e.value SEPARATOR ","»ul_publisher_cache_«e.key.rosName»["«n»"]«ENDFOR»))
	«ENDFOR»
	«ENDIF»
	«ENDFOR»
	def ul_attach_callbacks():
		«FOR e:readTopics.entrySet»
		«IF e.key.group»
		ul_instance_«e.key.pythonName».register_callback(unity_callback_«e.key.rosName»)
		«ELSE»
		«FOR f:e.value»
		ul_instance_«e.key.pythonName».«f».register_callback(unity_callback_«e.key.rosName»_«f»)
		«ENDFOR»
		«ENDIF»
		«ENDFOR»
	'''
	
	def indices(List<String> strings) {
		val result = new ArrayList<Integer>
		for(s: strings) result.add(result.size())
		return result
	}

	// Python - Default ROS main file
	
	def generateMainFile(String directory, IFileSystemAccess access) { 
		access.generateFile(directory+"/src/ros_"+spec.name+"_main.py", generateMain)
	}
	
	def generateMain() '''
	# Default main file, connects unity link to ROS
	# Relies on definitions in config.py (not generated):
	#
	# # config.connection: the connection, e.g.
	# connection = unity_link.ul_rs232('/dev/ttyUSB0', 3000000, serial.PARITY_NONE, serial.STOPBITS_ONE, serial.EIGHTBITS, 0.1)
	# # config.controller: the controller, e.g.
	# controller = unity_link.ul_link_controller([connection])
	#
	import config
	# Link ROS to Unity-Link
	import unity_link
	import «spec.name»
	import ros_«spec.name»
	link_proxy=«spec.name».UL_«spec.name»(config.controller,config.connection)
	link_proxy.bind(None)
	ros_«spec.name».ros_standalone_init()
	ros_«spec.name».unity_set_link(link_proxy,config.controller)
	ros_«spec.name».init_subscriptions()
	ros_«spec.name».ros_standalone_serve()
	'''
	
	// Expansion of all topic paths
	
	def dispatch void expandTopicPath(TopicHolder base, Member member, Constructor context) { }
	
	def dispatch void expandTopicPath(TopicHolder base, Expansion expansion, Constructor context) {
		for(m:expansion.constructor.members)
			expandTopicPath(base.join(expansion.name,false),m,expansion.constructor)
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
		for(e:expansion) writeTopics.putIntoList(base.join(group.name,true),e)
	}

	// Generally useful stuff

	def putIntoList(Map<TopicHolder,List<String>> map, TopicHolder base, String name) {
		if(map.get(base)==null) map.put(base,new ArrayList)
		map.get(base).add(name)
	}


	def TopicHolder join(String base, String extend, boolean group) { 
		new TopicHolder(base,extend,extend,group)
	}

	def TopicHolder join(TopicHolder holder, String extend, boolean group) { 
		new TopicHolder(holder.baseName,holder.rosName+"_"+extend,holder.pythonName+"."+extend,group)
	}

}

@Data class TopicHolder {
	String baseName
	String rosName
	String pythonName 
	boolean group
}
