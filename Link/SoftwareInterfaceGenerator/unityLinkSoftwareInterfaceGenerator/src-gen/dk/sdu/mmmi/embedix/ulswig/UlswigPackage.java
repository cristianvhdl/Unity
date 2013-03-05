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
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkSpecImpl <em>Link Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.LinkSpecImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getLinkSpec()
   * @generated
   */
  int LINK_SPEC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_SPEC__NAME = 0;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_SPEC__CONSTRUCTORS = 1;

  /**
   * The number of structural features of the '<em>Link Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_SPEC_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Addresses</b></em>' containment reference.
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
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorAddressParametersImpl <em>Constructor Address Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.ConstructorAddressParametersImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getConstructorAddressParameters()
   * @generated
   */
  int CONSTRUCTOR_ADDRESS_PARAMETERS = 2;

  /**
   * The number of structural features of the '<em>Constructor Address Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_ADDRESS_PARAMETERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressesImpl <em>Named Addresses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressesImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getNamedAddresses()
   * @generated
   */
  int NAMED_ADDRESSES = 3;

  /**
   * The feature id for the '<em><b>Address Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ADDRESSES__ADDRESS_NAMES = CONSTRUCTOR_ADDRESS_PARAMETERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Addresses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ADDRESSES_FEATURE_COUNT = CONSTRUCTOR_ADDRESS_PARAMETERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressTupleImpl <em>Address Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressTupleImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressTuple()
   * @generated
   */
  int ADDRESS_TUPLE = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_TUPLE__ELEMENTS = CONSTRUCTOR_ADDRESS_PARAMETERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Address Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_TUPLE_FEATURE_COUNT = CONSTRUCTOR_ADDRESS_PARAMETERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.MemberImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 5;

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
  int LINK_BINDING = 6;

  /**
   * The number of structural features of the '<em>Link Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_BINDING_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.TosNetLinkBindingImpl <em>Tos Net Link Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.TosNetLinkBindingImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getTosNetLinkBinding()
   * @generated
   */
  int TOS_NET_LINK_BINDING = 7;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOS_NET_LINK_BINDING__PROPERTIES = LINK_BINDING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tos Net Link Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOS_NET_LINK_BINDING_FEATURE_COUNT = LINK_BINDING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl <em>Link Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getLinkProperty()
   * @generated
   */
  int LINK_PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Ctrl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROPERTY__CTRL_NAME = 0;

  /**
   * The feature id for the '<em><b>Base Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROPERTY__BASE_VALUE = 1;

  /**
   * The feature id for the '<em><b>Uart Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROPERTY__UART_NAME = 2;

  /**
   * The number of structural features of the '<em>Link Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl <em>Expansion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getExpansion()
   * @generated
   */
  int EXPANSION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION__NAME = MEMBER_FEATURE_COUNT + 0;

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
   * The number of structural features of the '<em>Expansion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANSION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionImpl <em>Simple Expansion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getSimpleExpansion()
   * @generated
   */
  int SIMPLE_EXPANSION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPANSION__NAME = EXPANSION__NAME;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPANSION__CONSTRUCTOR = EXPANSION__CONSTRUCTOR;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPANSION__ARGUMENTS = EXPANSION__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPANSION__BINDINGS = EXPANSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Expansion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPANSION_FEATURE_COUNT = EXPANSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionImpl <em>Address Expansion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressExpansion()
   * @generated
   */
  int ADDRESS_EXPANSION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_EXPANSION__NAME = EXPANSION__NAME;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_EXPANSION__CONSTRUCTOR = EXPANSION__CONSTRUCTOR;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_EXPANSION__ARGUMENTS = EXPANSION__ARGUMENTS;

  /**
   * The number of structural features of the '<em>Address Expansion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_EXPANSION_FEATURE_COUNT = EXPANSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 12;

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
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressBindingImpl <em>Address Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressBindingImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressBinding()
   * @generated
   */
  int ADDRESS_BINDING = 13;

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
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl <em>Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getInstantiation()
   * @generated
   */
  int INSTANTIATION = 14;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__ADDRESS = MEMBER_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressSpecImpl <em>Address Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressSpecImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressSpec()
   * @generated
   */
  int ADDRESS_SPEC = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_SPEC__NAME = 0;

  /**
   * The number of structural features of the '<em>Address Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.DirectAddressSpecImpl <em>Direct Address Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.DirectAddressSpecImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getDirectAddressSpec()
   * @generated
   */
  int DIRECT_ADDRESS_SPEC = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_ADDRESS_SPEC__NAME = ADDRESS_SPEC__NAME;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_ADDRESS_SPEC__ADDRESS = ADDRESS_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Direct Address Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_ADDRESS_SPEC_FEATURE_COUNT = ADDRESS_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressSpecImpl <em>Named Address Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressSpecImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getNamedAddressSpec()
   * @generated
   */
  int NAMED_ADDRESS_SPEC = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ADDRESS_SPEC__NAME = ADDRESS_SPEC__NAME;

  /**
   * The number of structural features of the '<em>Named Address Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ADDRESS_SPEC_FEATURE_COUNT = ADDRESS_SPEC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.InstantiationPropertyImpl <em>Instantiation Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.InstantiationPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getInstantiationProperty()
   * @generated
   */
  int INSTANTIATION_PROPERTY = 18;

  /**
   * The number of structural features of the '<em>Instantiation Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.GroupingImpl <em>Grouping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.GroupingImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getGrouping()
   * @generated
   */
  int GROUPING = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__NAME = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__ELEMENTS = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Grouping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.GroupElementImpl <em>Group Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.GroupElementImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getGroupElement()
   * @generated
   */
  int GROUP_ELEMENT = 20;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT__PATH = 0;

  /**
   * The number of structural features of the '<em>Group Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.PathElementImpl <em>Path Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.PathElementImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getPathElement()
   * @generated
   */
  int PATH_ELEMENT = 21;

  /**
   * The feature id for the '<em><b>Simple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_ELEMENT__SIMPLE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_ELEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Path Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.IDPropertyImpl <em>ID Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.IDPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getIDProperty()
   * @generated
   */
  int ID_PROPERTY = 22;

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
  int CRC_PROPERTY = 23;

  /**
   * The number of structural features of the '<em>CRC Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRC_PROPERTY_FEATURE_COUNT = INSTANTIATION_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.PublishPropertyImpl <em>Publish Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.embedix.ulswig.impl.PublishPropertyImpl
   * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getPublishProperty()
   * @generated
   */
  int PUBLISH_PROPERTY = 24;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLISH_PROPERTY__MODE = INSTANTIATION_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLISH_PROPERTY__RATE = INSTANTIATION_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Publish Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLISH_PROPERTY_FEATURE_COUNT = INSTANTIATION_PROPERTY_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.LinkSpec <em>Link Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Spec</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkSpec
   * @generated
   */
  EClass getLinkSpec();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.LinkSpec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkSpec#getName()
   * @see #getLinkSpec()
   * @generated
   */
  EAttribute getLinkSpec_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.LinkSpec#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkSpec#getConstructors()
   * @see #getLinkSpec()
   * @generated
   */
  EReference getLinkSpec_Constructors();

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
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getAddresses <em>Addresses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Addresses</em>'.
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
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.ConstructorAddressParameters <em>Constructor Address Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Address Parameters</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.ConstructorAddressParameters
   * @generated
   */
  EClass getConstructorAddressParameters();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.NamedAddresses <em>Named Addresses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Addresses</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.NamedAddresses
   * @generated
   */
  EClass getNamedAddresses();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.embedix.ulswig.NamedAddresses#getAddressNames <em>Address Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Address Names</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.NamedAddresses#getAddressNames()
   * @see #getNamedAddresses()
   * @generated
   */
  EAttribute getNamedAddresses_AddressNames();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.AddressTuple <em>Address Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Tuple</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressTuple
   * @generated
   */
  EClass getAddressTuple();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.embedix.ulswig.AddressTuple#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressTuple#getElements()
   * @see #getAddressTuple()
   * @generated
   */
  EAttribute getAddressTuple_Elements();

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
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.TosNetLinkBinding <em>Tos Net Link Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tos Net Link Binding</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.TosNetLinkBinding
   * @generated
   */
  EClass getTosNetLinkBinding();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.TosNetLinkBinding#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.TosNetLinkBinding#getProperties()
   * @see #getTosNetLinkBinding()
   * @generated
   */
  EReference getTosNetLinkBinding_Properties();

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
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getCtrlName <em>Ctrl Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ctrl Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkProperty#getCtrlName()
   * @see #getLinkProperty()
   * @generated
   */
  EAttribute getLinkProperty_CtrlName();

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
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getUartName <em>Uart Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uart Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkProperty#getUartName()
   * @see #getLinkProperty()
   * @generated
   */
  EAttribute getLinkProperty_UartName();

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
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Expansion#getName()
   * @see #getExpansion()
   * @generated
   */
  EAttribute getExpansion_Name();

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
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.SimpleExpansion <em>Simple Expansion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Expansion</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.SimpleExpansion
   * @generated
   */
  EClass getSimpleExpansion();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.SimpleExpansion#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.SimpleExpansion#getBindings()
   * @see #getSimpleExpansion()
   * @generated
   */
  EReference getSimpleExpansion_Bindings();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.AddressExpansion <em>Address Expansion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Expansion</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressExpansion
   * @generated
   */
  EClass getAddressExpansion();

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
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation <em>Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiation</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Instantiation
   * @generated
   */
  EClass getInstantiation();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Instantiation#getAddress()
   * @see #getInstantiation()
   * @generated
   */
  EReference getInstantiation_Address();

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
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.AddressSpec <em>Address Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Spec</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressSpec
   * @generated
   */
  EClass getAddressSpec();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.AddressSpec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressSpec#getName()
   * @see #getAddressSpec()
   * @generated
   */
  EAttribute getAddressSpec_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec <em>Direct Address Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Address Spec</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec
   * @generated
   */
  EClass getDirectAddressSpec();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec#getAddress()
   * @see #getDirectAddressSpec()
   * @generated
   */
  EAttribute getDirectAddressSpec_Address();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.NamedAddressSpec <em>Named Address Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Address Spec</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.NamedAddressSpec
   * @generated
   */
  EClass getNamedAddressSpec();

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
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.Grouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grouping</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Grouping
   * @generated
   */
  EClass getGrouping();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.Grouping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Grouping#getName()
   * @see #getGrouping()
   * @generated
   */
  EAttribute getGrouping_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.Grouping#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.Grouping#getElements()
   * @see #getGrouping()
   * @generated
   */
  EReference getGrouping_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.GroupElement <em>Group Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Element</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.GroupElement
   * @generated
   */
  EClass getGroupElement();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.embedix.ulswig.GroupElement#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Path</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.GroupElement#getPath()
   * @see #getGroupElement()
   * @generated
   */
  EReference getGroupElement_Path();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.PathElement <em>Path Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Element</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.PathElement
   * @generated
   */
  EClass getPathElement();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.PathElement#getSimple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.PathElement#getSimple()
   * @see #getPathElement()
   * @generated
   */
  EAttribute getPathElement_Simple();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.embedix.ulswig.PathElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.PathElement#getType()
   * @see #getPathElement()
   * @generated
   */
  EReference getPathElement_Type();

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
   * Returns the meta object for class '{@link dk.sdu.mmmi.embedix.ulswig.PublishProperty <em>Publish Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Publish Property</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.PublishProperty
   * @generated
   */
  EClass getPublishProperty();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.PublishProperty#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.PublishProperty#getMode()
   * @see #getPublishProperty()
   * @generated
   */
  EAttribute getPublishProperty_Mode();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.embedix.ulswig.PublishProperty#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rate</em>'.
   * @see dk.sdu.mmmi.embedix.ulswig.PublishProperty#getRate()
   * @see #getPublishProperty()
   * @generated
   */
  EAttribute getPublishProperty_Rate();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkSpecImpl <em>Link Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.LinkSpecImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getLinkSpec()
     * @generated
     */
    EClass LINK_SPEC = eINSTANCE.getLinkSpec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_SPEC__NAME = eINSTANCE.getLinkSpec_Name();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_SPEC__CONSTRUCTORS = eINSTANCE.getLinkSpec_Constructors();

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
     * The meta object literal for the '<em><b>Addresses</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorAddressParametersImpl <em>Constructor Address Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.ConstructorAddressParametersImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getConstructorAddressParameters()
     * @generated
     */
    EClass CONSTRUCTOR_ADDRESS_PARAMETERS = eINSTANCE.getConstructorAddressParameters();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressesImpl <em>Named Addresses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressesImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getNamedAddresses()
     * @generated
     */
    EClass NAMED_ADDRESSES = eINSTANCE.getNamedAddresses();

    /**
     * The meta object literal for the '<em><b>Address Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ADDRESSES__ADDRESS_NAMES = eINSTANCE.getNamedAddresses_AddressNames();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressTupleImpl <em>Address Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressTupleImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressTuple()
     * @generated
     */
    EClass ADDRESS_TUPLE = eINSTANCE.getAddressTuple();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS_TUPLE__ELEMENTS = eINSTANCE.getAddressTuple_Elements();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.TosNetLinkBindingImpl <em>Tos Net Link Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.TosNetLinkBindingImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getTosNetLinkBinding()
     * @generated
     */
    EClass TOS_NET_LINK_BINDING = eINSTANCE.getTosNetLinkBinding();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOS_NET_LINK_BINDING__PROPERTIES = eINSTANCE.getTosNetLinkBinding_Properties();

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
     * The meta object literal for the '<em><b>Ctrl Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_PROPERTY__CTRL_NAME = eINSTANCE.getLinkProperty_CtrlName();

    /**
     * The meta object literal for the '<em><b>Base Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_PROPERTY__BASE_VALUE = eINSTANCE.getLinkProperty_BaseValue();

    /**
     * The meta object literal for the '<em><b>Uart Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_PROPERTY__UART_NAME = eINSTANCE.getLinkProperty_UartName();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPANSION__NAME = eINSTANCE.getExpansion_Name();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionImpl <em>Simple Expansion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.SimpleExpansionImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getSimpleExpansion()
     * @generated
     */
    EClass SIMPLE_EXPANSION = eINSTANCE.getSimpleExpansion();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPANSION__BINDINGS = eINSTANCE.getSimpleExpansion_Bindings();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionImpl <em>Address Expansion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressExpansionImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressExpansion()
     * @generated
     */
    EClass ADDRESS_EXPANSION = eINSTANCE.getAddressExpansion();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl <em>Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.InstantiationImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getInstantiation()
     * @generated
     */
    EClass INSTANTIATION = eINSTANCE.getInstantiation();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATION__ADDRESS = eINSTANCE.getInstantiation_Address();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.AddressSpecImpl <em>Address Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.AddressSpecImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getAddressSpec()
     * @generated
     */
    EClass ADDRESS_SPEC = eINSTANCE.getAddressSpec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS_SPEC__NAME = eINSTANCE.getAddressSpec_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.DirectAddressSpecImpl <em>Direct Address Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.DirectAddressSpecImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getDirectAddressSpec()
     * @generated
     */
    EClass DIRECT_ADDRESS_SPEC = eINSTANCE.getDirectAddressSpec();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_ADDRESS_SPEC__ADDRESS = eINSTANCE.getDirectAddressSpec_Address();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressSpecImpl <em>Named Address Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressSpecImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getNamedAddressSpec()
     * @generated
     */
    EClass NAMED_ADDRESS_SPEC = eINSTANCE.getNamedAddressSpec();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.GroupingImpl <em>Grouping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.GroupingImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getGrouping()
     * @generated
     */
    EClass GROUPING = eINSTANCE.getGrouping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUPING__NAME = eINSTANCE.getGrouping_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUPING__ELEMENTS = eINSTANCE.getGrouping_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.GroupElementImpl <em>Group Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.GroupElementImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getGroupElement()
     * @generated
     */
    EClass GROUP_ELEMENT = eINSTANCE.getGroupElement();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ELEMENT__PATH = eINSTANCE.getGroupElement_Path();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.PathElementImpl <em>Path Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.PathElementImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getPathElement()
     * @generated
     */
    EClass PATH_ELEMENT = eINSTANCE.getPathElement();

    /**
     * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_ELEMENT__SIMPLE = eINSTANCE.getPathElement_Simple();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_ELEMENT__TYPE = eINSTANCE.getPathElement_Type();

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

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.embedix.ulswig.impl.PublishPropertyImpl <em>Publish Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.embedix.ulswig.impl.PublishPropertyImpl
     * @see dk.sdu.mmmi.embedix.ulswig.impl.UlswigPackageImpl#getPublishProperty()
     * @generated
     */
    EClass PUBLISH_PROPERTY = eINSTANCE.getPublishProperty();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUBLISH_PROPERTY__MODE = eINSTANCE.getPublishProperty_Mode();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUBLISH_PROPERTY__RATE = eINSTANCE.getPublishProperty_Rate();

  }

} //UlswigPackage
