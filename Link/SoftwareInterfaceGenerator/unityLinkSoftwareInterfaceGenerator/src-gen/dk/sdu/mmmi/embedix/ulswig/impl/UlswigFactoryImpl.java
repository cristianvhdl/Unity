/**
 */
package dk.sdu.mmmi.embedix.ulswig.impl;

import dk.sdu.mmmi.embedix.ulswig.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UlswigFactoryImpl extends EFactoryImpl implements UlswigFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UlswigFactory init()
  {
    try
    {
      UlswigFactory theUlswigFactory = (UlswigFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sdu.dk/mmmi/embedix/ULSWIG"); 
      if (theUlswigFactory != null)
      {
        return theUlswigFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UlswigFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UlswigFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UlswigPackage.LINK_SPEC: return createLinkSpec();
      case UlswigPackage.CONSTRUCTOR: return createConstructor();
      case UlswigPackage.CONSTRUCTOR_ADDRESS_PARAMETERS: return createConstructorAddressParameters();
      case UlswigPackage.NAMED_ADDRESSES: return createNamedAddresses();
      case UlswigPackage.ADDRESS_TUPLE: return createAddressTuple();
      case UlswigPackage.MEMBER: return createMember();
      case UlswigPackage.LINK_BINDING: return createLinkBinding();
      case UlswigPackage.TOS_NET_LINK_BINDING: return createTosNetLinkBinding();
      case UlswigPackage.LINK_PROPERTY: return createLinkProperty();
      case UlswigPackage.EXPANSION: return createExpansion();
      case UlswigPackage.SIMPLE_EXPANSION: return createSimpleExpansion();
      case UlswigPackage.ADDRESS_EXPANSION: return createAddressExpansion();
      case UlswigPackage.ARGUMENT: return createArgument();
      case UlswigPackage.ADDRESS_BINDING: return createAddressBinding();
      case UlswigPackage.INSTANTIATION: return createInstantiation();
      case UlswigPackage.ADDRESS_SPEC: return createAddressSpec();
      case UlswigPackage.DIRECT_ADDRESS_SPEC: return createDirectAddressSpec();
      case UlswigPackage.NAMED_ADDRESS_SPEC: return createNamedAddressSpec();
      case UlswigPackage.INSTANTIATION_PROPERTY: return createInstantiationProperty();
      case UlswigPackage.GROUPING: return createGrouping();
      case UlswigPackage.GROUP_ELEMENT: return createGroupElement();
      case UlswigPackage.PATH_ELEMENT: return createPathElement();
      case UlswigPackage.ID_PROPERTY: return createIDProperty();
      case UlswigPackage.CRC_PROPERTY: return createCRCProperty();
      case UlswigPackage.PUBLISH_PROPERTY: return createPublishProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkSpec createLinkSpec()
  {
    LinkSpecImpl linkSpec = new LinkSpecImpl();
    return linkSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorAddressParameters createConstructorAddressParameters()
  {
    ConstructorAddressParametersImpl constructorAddressParameters = new ConstructorAddressParametersImpl();
    return constructorAddressParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedAddresses createNamedAddresses()
  {
    NamedAddressesImpl namedAddresses = new NamedAddressesImpl();
    return namedAddresses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressTuple createAddressTuple()
  {
    AddressTupleImpl addressTuple = new AddressTupleImpl();
    return addressTuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkBinding createLinkBinding()
  {
    LinkBindingImpl linkBinding = new LinkBindingImpl();
    return linkBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TosNetLinkBinding createTosNetLinkBinding()
  {
    TosNetLinkBindingImpl tosNetLinkBinding = new TosNetLinkBindingImpl();
    return tosNetLinkBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkProperty createLinkProperty()
  {
    LinkPropertyImpl linkProperty = new LinkPropertyImpl();
    return linkProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expansion createExpansion()
  {
    ExpansionImpl expansion = new ExpansionImpl();
    return expansion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpansion createSimpleExpansion()
  {
    SimpleExpansionImpl simpleExpansion = new SimpleExpansionImpl();
    return simpleExpansion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressExpansion createAddressExpansion()
  {
    AddressExpansionImpl addressExpansion = new AddressExpansionImpl();
    return addressExpansion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressBinding createAddressBinding()
  {
    AddressBindingImpl addressBinding = new AddressBindingImpl();
    return addressBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instantiation createInstantiation()
  {
    InstantiationImpl instantiation = new InstantiationImpl();
    return instantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressSpec createAddressSpec()
  {
    AddressSpecImpl addressSpec = new AddressSpecImpl();
    return addressSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectAddressSpec createDirectAddressSpec()
  {
    DirectAddressSpecImpl directAddressSpec = new DirectAddressSpecImpl();
    return directAddressSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedAddressSpec createNamedAddressSpec()
  {
    NamedAddressSpecImpl namedAddressSpec = new NamedAddressSpecImpl();
    return namedAddressSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstantiationProperty createInstantiationProperty()
  {
    InstantiationPropertyImpl instantiationProperty = new InstantiationPropertyImpl();
    return instantiationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grouping createGrouping()
  {
    GroupingImpl grouping = new GroupingImpl();
    return grouping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupElement createGroupElement()
  {
    GroupElementImpl groupElement = new GroupElementImpl();
    return groupElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathElement createPathElement()
  {
    PathElementImpl pathElement = new PathElementImpl();
    return pathElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDProperty createIDProperty()
  {
    IDPropertyImpl idProperty = new IDPropertyImpl();
    return idProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CRCProperty createCRCProperty()
  {
    CRCPropertyImpl crcProperty = new CRCPropertyImpl();
    return crcProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PublishProperty createPublishProperty()
  {
    PublishPropertyImpl publishProperty = new PublishPropertyImpl();
    return publishProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UlswigPackage getUlswigPackage()
  {
    return (UlswigPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UlswigPackage getPackage()
  {
    return UlswigPackage.eINSTANCE;
  }

} //UlswigFactoryImpl
