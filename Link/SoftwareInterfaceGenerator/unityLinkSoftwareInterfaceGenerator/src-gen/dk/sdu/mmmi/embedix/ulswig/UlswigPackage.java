/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigFactory
 * @model kind="package"
 * @generated
 */
public interface UlswigPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ulswig";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/embedix/ULSWIG";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ulswig";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UlswigPackage eINSTANCE = dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.RobotImpl <em>Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.RobotImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getRobot()
   * @generated
   */
  int ROBOT = 0;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__CONSTRUCTORS = 0;

  /**
   * The number of structural features of the '<em>Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 1;

  /**
   * The feature id for the '<em><b>Is Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__IS_PUBLIC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__ADDRESSES = 3;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__MEMBERS = 4;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressImpl <em>Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddress()
   * @generated
   */
  int ADDRESS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.MemberImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 3;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkBindingImpl <em>Link Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.LinkBindingImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getLinkBinding()
   * @generated
   */
  int LINK_BINDING = 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_BINDING__PROPERTIES = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Link Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_BINDING_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl <em>Link Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getLinkProperty()
   * @generated
   */
  int LINK_PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Link Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROPERTY__LINK_NAME = 0;

  /**
   * The feature id for the '<em><b>Base Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROPERTY__BASE_VALUE = 1;

  /**
   * The number of structural features of the '<em>Link Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl <em>Expansion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getExpansion()
   * @generated
   */
  int EXPANSION = 6;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION__IDENTIFIER = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION__CONSTRUCTOR = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION__ARGUMENTS = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION__BINDINGS = MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expansion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionNameImpl <em>Expansion Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.ExpansionNameImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getExpansionName()
   * @generated
   */
  int EXPANSION_NAME = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Expansion Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionNameImpl <em>Address Expansion Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionNameImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressExpansionName()
   * @generated
   */
  int ADDRESS_EXPANSION_NAME = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_EXPANSION_NAME__NAME = EXPANSION_NAME__NAME;

  /**
   * The number of structural features of the '<em>Address Expansion Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_EXPANSION_NAME_FEATURE_COUNT = EXPANSION_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionNameImpl <em>Simple Expansion Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionNameImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getSimpleExpansionName()
   * @generated
   */
  int SIMPLE_EXPANSION_NAME = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPANSION_NAME__NAME = EXPANSION_NAME__NAME;

  /**
   * The number of structural features of the '<em>Simple Expansion Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPANSION_NAME_FEATURE_COUNT = EXPANSION_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressBindingImpl <em>Address Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressBindingImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressBinding()
   * @generated
   */
  int ADDRESS_BINDING = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_BINDING__NAME = 0;

  /**
   * The feature id for the '<em><b>Addresses</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_BINDING__ADDRESSES = 1;

  /**
   * The number of structural features of the '<em>Address Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 11;

  /**
   * The feature id for the '<em><b>Simple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__SIMPLE = 0;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__LHS = 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__RHS = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__TEXT = 3;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl <em>Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getInstantiation()
   * @generated
   */
  int INSTANTIATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__NAME = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__KIND = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__PROPERTIES = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.InstantiationPropertyImpl <em>Instantiation Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.InstantiationPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getInstantiationProperty()
   * @generated
   */
  int INSTANTIATION_PROPERTY = 13;

  /**
   * The number of structural features of the '<em>Instantiation Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.IDPropertyImpl <em>ID Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.IDPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getIDProperty()
   * @generated
   */
  int ID_PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_PROPERTY__ID = INSTANTIATION_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ID Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_PROPERTY_FEATURE_COUNT = INSTANTIATION_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.CRCPropertyImpl <em>CRC Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.CRCPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getCRCProperty()
   * @generated
   */
  int CRC_PROPERTY = 15;

  /**
   * The number of structural features of the '<em>CRC Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRC_PROPERTY_FEATURE_COUNT = INSTANTIATION_PROPERTY_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robot</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Robot
   * @generated
   */
  EClass getRobot();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.Robot#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Robot#getConstructors()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Constructors();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#isIsPublic <em>Is Public</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Public</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Constructor#isIsPublic()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_IsPublic();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Constructor#getName()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Name();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Constructor#getParameters()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getAddresses <em>Addresses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Addresses</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Constructor#getAddresses()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Addresses();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Constructor#getMembers()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Members();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Address
   * @generated
   */
  EClass getAddress();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Address#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Address#getName()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_Name();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.embedix.ulswig.Address#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Address#getElements()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.LinkBinding <em>Link Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Binding</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkBinding
   * @generated
   */
  EClass getLinkBinding();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.LinkBinding#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkBinding#getProperties()
   * @see #getLinkBinding()
   * @generated
   */
  EReference getLinkBinding_Properties();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty <em>Link Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Property</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkProperty
   * @generated
   */
  EClass getLinkProperty();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getLinkName <em>Link Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkProperty#getLinkName()
   * @see #getLinkProperty()
   * @generated
   */
  EAttribute getLinkProperty_LinkName();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getBaseValue <em>Base Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Value</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkProperty#getBaseValue()
   * @see #getLinkProperty()
   * @generated
   */
  EAttribute getLinkProperty_BaseValue();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Expansion <em>Expansion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expansion</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Expansion
   * @generated
   */
  EClass getExpansion();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Expansion#getIdentifier()
   * @see #getExpansion()
   * @generated
   */
  EReference getExpansion_Identifier();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Constructor</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Expansion#getConstructor()
   * @see #getExpansion()
   * @generated
   */
  EReference getExpansion_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Expansion#getArguments()
   * @see #getExpansion()
   * @generated
   */
  EReference getExpansion_Arguments();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Expansion#getBindings()
   * @see #getExpansion()
   * @generated
   */
  EReference getExpansion_Bindings();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.ExpansionName <em>Expansion Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expansion Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.ExpansionName
   * @generated
   */
  EClass getExpansionName();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.ExpansionName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.ExpansionName#getName()
   * @see #getExpansionName()
   * @generated
   */
  EAttribute getExpansionName_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.AddressExpansionName <em>Address Expansion Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Expansion Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressExpansionName
   * @generated
   */
  EClass getAddressExpansionName();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.SimpleExpansionName <em>Simple Expansion Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Expansion Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.SimpleExpansionName
   * @generated
   */
  EClass getSimpleExpansionName();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.AddressBinding <em>Address Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Binding</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressBinding
   * @generated
   */
  EClass getAddressBinding();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.AddressBinding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressBinding#getName()
   * @see #getAddressBinding()
   * @generated
   */
  EAttribute getAddressBinding_Name();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.embedix.ulswig.AddressBinding#getAddresses <em>Addresses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Addresses</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressBinding#getAddresses()
   * @see #getAddressBinding()
   * @generated
   */
  EAttribute getAddressBinding_Addresses();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getSimple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Argument#getSimple()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Simple();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Argument#getLhs()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Argument#getRhs()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Rhs();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Argument#getText()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Text();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation <em>Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiation</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Instantiation
   * @generated
   */
  EClass getInstantiation();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Instantiation#getName()
   * @see #getInstantiation()
   * @generated
   */
  EAttribute getInstantiation_Name();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Instantiation#getKind()
   * @see #getInstantiation()
   * @generated
   */
  EAttribute getInstantiation_Kind();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Instantiation#getProperties()
   * @see #getInstantiation()
   * @generated
   */
  EReference getInstantiation_Properties();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.InstantiationProperty <em>Instantiation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiation Property</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.InstantiationProperty
   * @generated
   */
  EClass getInstantiationProperty();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.IDProperty <em>ID Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Property</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.IDProperty
   * @generated
   */
  EClass getIDProperty();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.embedix.ulswig.IDProperty#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.IDProperty#getId()
   * @see #getIDProperty()
   * @generated
   */
  EReference getIDProperty_Id();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.CRCProperty <em>CRC Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CRC Property</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.CRCProperty
   * @generated
   */
  EClass getCRCProperty();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UlswigFactory getUlswigFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.RobotImpl <em>Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.RobotImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getRobot()
     * @generated
     */
    EClass ROBOT = eINSTANCE.getRobot();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__CONSTRUCTORS = eINSTANCE.getRobot_Constructors();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__IS_PUBLIC = eINSTANCE.getConstructor_IsPublic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__NAME = eINSTANCE.getConstructor_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

    /**
     * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__ADDRESSES = eINSTANCE.getConstructor_Addresses();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__MEMBERS = eINSTANCE.getConstructor_Members();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddress()
     * @generated
     */
    EClass ADDRESS = eINSTANCE.getAddress();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__NAME = eINSTANCE.getAddress_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__ELEMENTS = eINSTANCE.getAddress_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.MemberImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkBindingImpl <em>Link Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.LinkBindingImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getLinkBinding()
     * @generated
     */
    EClass LINK_BINDING = eINSTANCE.getLinkBinding();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_BINDING__PROPERTIES = eINSTANCE.getLinkBinding_Properties();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl <em>Link Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getLinkProperty()
     * @generated
     */
    EClass LINK_PROPERTY = eINSTANCE.getLinkProperty();

    /**
     * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_PROPERTY__LINK_NAME = eINSTANCE.getLinkProperty_LinkName();

    /**
     * The meta object literal for the '<em><b>Base Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_PROPERTY__BASE_VALUE = eINSTANCE.getLinkProperty_BaseValue();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl <em>Expansion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getExpansion()
     * @generated
     */
    EClass EXPANSION = eINSTANCE.getExpansion();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANSION__IDENTIFIER = eINSTANCE.getExpansion_Identifier();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANSION__CONSTRUCTOR = eINSTANCE.getExpansion_Constructor();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANSION__ARGUMENTS = eINSTANCE.getExpansion_Arguments();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANSION__BINDINGS = eINSTANCE.getExpansion_Bindings();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionNameImpl <em>Expansion Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.ExpansionNameImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getExpansionName()
     * @generated
     */
    EClass EXPANSION_NAME = eINSTANCE.getExpansionName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPANSION_NAME__NAME = eINSTANCE.getExpansionName_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionNameImpl <em>Address Expansion Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionNameImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressExpansionName()
     * @generated
     */
    EClass ADDRESS_EXPANSION_NAME = eINSTANCE.getAddressExpansionName();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionNameImpl <em>Simple Expansion Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionNameImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getSimpleExpansionName()
     * @generated
     */
    EClass SIMPLE_EXPANSION_NAME = eINSTANCE.getSimpleExpansionName();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressBindingImpl <em>Address Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressBindingImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressBinding()
     * @generated
     */
    EClass ADDRESS_BINDING = eINSTANCE.getAddressBinding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS_BINDING__NAME = eINSTANCE.getAddressBinding_Name();

    /**
     * The meta object literal for the '<em><b>Addresses</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS_BINDING__ADDRESSES = eINSTANCE.getAddressBinding_Addresses();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__SIMPLE = eINSTANCE.getArgument_Simple();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__LHS = eINSTANCE.getArgument_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__RHS = eINSTANCE.getArgument_Rhs();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__TEXT = eINSTANCE.getArgument_Text();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl <em>Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getInstantiation()
     * @generated
     */
    EClass INSTANTIATION = eINSTANCE.getInstantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANTIATION__NAME = eINSTANCE.getInstantiation_Name();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANTIATION__KIND = eINSTANCE.getInstantiation_Kind();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATION__PROPERTIES = eINSTANCE.getInstantiation_Properties();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.InstantiationPropertyImpl <em>Instantiation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.InstantiationPropertyImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getInstantiationProperty()
     * @generated
     */
    EClass INSTANTIATION_PROPERTY = eINSTANCE.getInstantiationProperty();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.IDPropertyImpl <em>ID Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.IDPropertyImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getIDProperty()
     * @generated
     */
    EClass ID_PROPERTY = eINSTANCE.getIDProperty();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_PROPERTY__ID = eINSTANCE.getIDProperty_Id();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.CRCPropertyImpl <em>CRC Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.CRCPropertyImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getCRCProperty()
     * @generated
     */
    EClass CRC_PROPERTY = eINSTANCE.getCRCProperty();

  }

} //UlswigPackage
