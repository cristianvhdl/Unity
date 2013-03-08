package dk.sdu.mmmi.embedix.generator

import dk.sdu.mmmi.embedix.ulswig.GroupElement
import java.util.ArrayList
import java.util.List
import dk.sdu.mmmi.embedix.ulswig.Constructor
import dk.sdu.mmmi.embedix.ulswig.Expansion

class Utilities {
	
	def static computeGroupComponents(GroupElement element,Constructor context,String head,String dot) {
		val expansion = new ArrayList<StringBuffer>
		for(segment: element.path) {
			if(segment.simple!=null) {
				val List<String> x = new ArrayList
				x.add(segment.simple)
				addGroupAccessSegment(expansion,x,head,dot)
			} else {
				val name = findAllDeclarations(context,segment.type)
				addGroupAccessSegment(expansion,name,head,dot)
			}
		}
		expansion.map([x|x.toString])
	}

	def static findAllDeclarations(Constructor context, Constructor target) { 
		val result = new ArrayList<String>
		for(m: context.members) switch m {
			Expansion case m: if(m.constructor==target) result.add(m.name)
		}
		return result
	}

	def static addGroupAccessSegment(List<StringBuffer> list, List<String> strings, String head, String dot) {
		if(list.size==0) for(s:strings) list.add(new StringBuffer(head+s))
		else for(ref: list) for(s:strings) ref.append(dot+s)
	}

	
}