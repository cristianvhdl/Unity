
package dk.sdu.mmmi.embedix;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ULSWIGStandaloneSetup extends ULSWIGStandaloneSetupGenerated{

	public static void doSetup() {
		new ULSWIGStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

