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
      case UlswigPackage.ROBOT: return createRobot();
      case UlswigPackage.CONSTRUCTOR: return createConstructor();
      case UlswigPackage.ADDRESS: return createAddress();
      case UlswigPackage.MEMBER: return createMember();
      case UlswigPackage.LINK_BINDING: return createLinkBinding();
      case UlswigPackage.LINK_PROPERTY: return createLinkProperty();
      case UlswigPackage.EXPANSION: return createExpansion();
      case UlswigPackage.EXPANSION_NAME: return createExpansionName();
      case UlswigPackage.ADDRESS_EXPANSION_NAME: return createAddressExpansionName();
      case UlswigPackage.SIMPLE_EXPANSION_NAME: return createSimpleExpansionName();
      case UlswigPackage.ADDRESS_BINDING: return createAddressBinding();
      case UlswigPackage.ARGUMENT: return createArgument();
      case UlswigPackage.INSTANTIATION: return createInstantiation();
      case UlswigPackage.INSTANTIATION_PROPERTY: return createInstantiationProperty();
      case UlswigPackage.ID_PROPERTY: return createIDProperty();
      case UlswigPackage.CRC_PROPERTY: return createCRCProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robot createRobot()
  {
    RobotImpl robot = new RobotImpl();
    return robot;
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
  public Address createAddress()
  {
    AddressImpl address = new AddressImpl();
    return address;
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
  public ExpansionName createExpansionName()
  {
    ExpansionNameImpl expansionName = new ExpansionNameImpl();
    return expansionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressExpansionName createAddressExpansionName()
  {
    AddressExpansionNameImpl addressExpansionName = new AddressExpansionNameImpl();
    return addressExpansionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpansionName createSimpleExpansionName()
  {
    SimpleExpansionNameImpl simpleExpansionName = new SimpleExpansionNameImpl();
    return simpleExpansionName;
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
