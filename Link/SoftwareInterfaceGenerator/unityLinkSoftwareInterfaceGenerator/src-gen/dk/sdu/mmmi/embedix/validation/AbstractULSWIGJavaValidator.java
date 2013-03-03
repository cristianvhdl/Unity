package dk.sdu.mmmi.embedix.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractULSWIGJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(dk.sdu.mmmi.embedix.ulswig.UlswigPackage.eINSTANCE);
		return result;
	}

}
