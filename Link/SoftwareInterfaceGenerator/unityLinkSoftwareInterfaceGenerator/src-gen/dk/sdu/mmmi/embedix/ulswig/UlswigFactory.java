/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage
 * @generated
 */
public interface UlswigFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UlswigFactory eINSTANCE = dk.sdu.mmmi.embedix.ulswig.impl.UlswigFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robot</em>'.
   * @generated
   */
  Robot createRobot();

  /**
   * Returns a new object of class '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor</em>'.
   * @generated
   */
  Constructor createConstructor();

  /**
   * Returns a new object of class '<em>Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Address</em>'.
   * @generated
   */
  Address createAddress();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Link Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Binding</em>'.
   * @generated
   */
  LinkBinding createLinkBinding();

  /**
   * Returns a new object of class '<em>Link Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Property</em>'.
   * @generated
   */
  LinkProperty createLinkProperty();

  /**
   * Returns a new object of class '<em>Expansion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expansion</em>'.
   * @generated
   */
  Expansion createExpansion();

  /**
   * Returns a new object of class '<em>Expansion Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expansion Name</em>'.
   * @generated
   */
  ExpansionName createExpansionName();

  /**
   * Returns a new object of class '<em>Address Expansion Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Address Expansion Name</em>'.
   * @generated
   */
  AddressExpansionName createAddressExpansionName();

  /**
   * Returns a new object of class '<em>Simple Expansion Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Expansion Name</em>'.
   * @generated
   */
  SimpleExpansionName createSimpleExpansionName();

  /**
   * Returns a new object of class '<em>Address Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Address Binding</em>'.
   * @generated
   */
  AddressBinding createAddressBinding();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Instantiation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instantiation</em>'.
   * @generated
   */
  Instantiation createInstantiation();

  /**
   * Returns a new object of class '<em>Instantiation Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instantiation Property</em>'.
   * @generated
   */
  InstantiationProperty createInstantiationProperty();

  /**
   * Returns a new object of class '<em>ID Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Property</em>'.
   * @generated
   */
  IDProperty createIDProperty();

  /**
   * Returns a new object of class '<em>CRC Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CRC Property</em>'.
   * @generated
   */
  CRCProperty createCRCProperty();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UlswigPackage getUlswigPackage();

} //UlswigFactory
