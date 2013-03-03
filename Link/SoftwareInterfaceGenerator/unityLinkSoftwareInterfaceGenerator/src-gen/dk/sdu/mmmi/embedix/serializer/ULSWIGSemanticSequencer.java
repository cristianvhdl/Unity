package dk.sdu.mmmi.embedix.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.sdu.mmmi.embedix.services.ULSWIGGrammarAccess;
import dk.sdu.mmmi.embedix.ulswig.Address;
import dk.sdu.mmmi.embedix.ulswig.AddressBinding;
import dk.sdu.mmmi.embedix.ulswig.AddressExpansionName;
import dk.sdu.mmmi.embedix.ulswig.Argument;
import dk.sdu.mmmi.embedix.ulswig.CRCProperty;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.Expansion;
import dk.sdu.mmmi.embedix.ulswig.IDProperty;
import dk.sdu.mmmi.embedix.ulswig.Instantiation;
import dk.sdu.mmmi.embedix.ulswig.LinkBinding;
import dk.sdu.mmmi.embedix.ulswig.LinkProperty;
import dk.sdu.mmmi.embedix.ulswig.Robot;
import dk.sdu.mmmi.embedix.ulswig.SimpleExpansionName;
import dk.sdu.mmmi.embedix.ulswig.UlswigPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ULSWIGSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ULSWIGGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UlswigPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UlswigPackage.ADDRESS:
				if(context == grammarAccess.getAddressRule()) {
					sequence_Address(context, (Address) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.ADDRESS_BINDING:
				if(context == grammarAccess.getAddressBindingRule()) {
					sequence_AddressBinding(context, (AddressBinding) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.ADDRESS_EXPANSION_NAME:
				if(context == grammarAccess.getAddressExpansionNameRule() ||
				   context == grammarAccess.getExpansionNameRule()) {
					sequence_AddressExpansionName(context, (AddressExpansionName) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.ARGUMENT:
				if(context == grammarAccess.getArgumentRule()) {
					sequence_Argument(context, (Argument) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.CRC_PROPERTY:
				if(context == grammarAccess.getInstantiationPropertyRule()) {
					sequence_InstantiationProperty(context, (CRCProperty) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.CONSTRUCTOR:
				if(context == grammarAccess.getConstructorRule()) {
					sequence_Constructor(context, (Constructor) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.EXPANSION:
				if(context == grammarAccess.getExpansionRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Expansion(context, (Expansion) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.ID_PROPERTY:
				if(context == grammarAccess.getInstantiationPropertyRule()) {
					sequence_InstantiationProperty(context, (IDProperty) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.INSTANTIATION:
				if(context == grammarAccess.getInstantiationRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Instantiation(context, (Instantiation) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.LINK_BINDING:
				if(context == grammarAccess.getLinkBindingRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_LinkBinding(context, (LinkBinding) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.LINK_PROPERTY:
				if(context == grammarAccess.getLinkPropertyRule()) {
					sequence_LinkProperty(context, (LinkProperty) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.ROBOT:
				if(context == grammarAccess.getRobotRule()) {
					sequence_Robot(context, (Robot) semanticObject); 
					return; 
				}
				else break;
			case UlswigPackage.SIMPLE_EXPANSION_NAME:
				if(context == grammarAccess.getExpansionNameRule() ||
				   context == grammarAccess.getSimpleExpansionNameRule()) {
					sequence_SimpleExpansionName(context, (SimpleExpansionName) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID addresses+=HEX_NUM addresses+=HEX_NUM*)
	 */
	protected void sequence_AddressBinding(EObject context, AddressBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AddressExpansionName(EObject context, AddressExpansionName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UlswigPackage.Literals.EXPANSION_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlswigPackage.Literals.EXPANSION_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddressExpansionNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | (elements+=ID elements+=ID*))
	 */
	protected void sequence_Address(EObject context, Address semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simple=ID | (lhs=ID rhs=Argument) | text=STRING)
	 */
	protected void sequence_Argument(EObject context, Argument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isPublic?='public'? name=ID (parameters+=ID parameters+=ID*)? (addresses+=Address addresses+=Address*)? members+=Member*)
	 */
	protected void sequence_Constructor(EObject context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         identifier=ExpansionName 
	 *         constructor=[Constructor|ID] 
	 *         (arguments+=Argument arguments+=Argument*)? 
	 *         (bindings+=AddressBinding bindings+=AddressBinding*)?
	 *     )
	 */
	protected void sequence_Expansion(EObject context, Expansion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CRCProperty}
	 */
	protected void sequence_InstantiationProperty(EObject context, CRCProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=Argument
	 */
	protected void sequence_InstantiationProperty(EObject context, IDProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UlswigPackage.Literals.ID_PROPERTY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlswigPackage.Literals.ID_PROPERTY__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID kind=Kind (properties+=InstantiationProperty properties+=InstantiationProperty*)?)
	 */
	protected void sequence_Instantiation(EObject context, Instantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (properties+=LinkProperty properties+=LinkProperty)
	 */
	protected void sequence_LinkBinding(EObject context, LinkBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (linkName=ID | baseValue=INT)
	 */
	protected void sequence_LinkProperty(EObject context, LinkProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constructors+=Constructor*
	 */
	protected void sequence_Robot(EObject context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SimpleExpansionName(EObject context, SimpleExpansionName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UlswigPackage.Literals.EXPANSION_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlswigPackage.Literals.EXPANSION_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleExpansionNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
