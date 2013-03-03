/**
 */
package dk.sdu.mmmi.embedix.ulswig.impl;

import dk.sdu.mmmi.embedix.ulswig.Address;
import dk.sdu.mmmi.embedix.ulswig.AddressBinding;
import dk.sdu.mmmi.embedix.ulswig.AddressExpansionName;
import dk.sdu.mmmi.embedix.ulswig.Argument;
import dk.sdu.mmmi.embedix.ulswig.CRCProperty;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.Expansion;
import dk.sdu.mmmi.embedix.ulswig.ExpansionName;
import dk.sdu.mmmi.embedix.ulswig.IDProperty;
import dk.sdu.mmmi.embedix.ulswig.Instantiation;
import dk.sdu.mmmi.embedix.ulswig.InstantiationProperty;
import dk.sdu.mmmi.embedix.ulswig.LinkBinding;
import dk.sdu.mmmi.embedix.ulswig.LinkProperty;
import dk.sdu.mmmi.embedix.ulswig.Member;
import dk.sdu.mmmi.embedix.ulswig.Robot;
import dk.sdu.mmmi.embedix.ulswig.SimpleExpansionName;
import dk.sdu.mmmi.embedix.ulswig.UlswigFactory;
import dk.sdu.mmmi.embedix.ulswig.UlswigPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UlswigPackageImpl extends EPackageImpl implements UlswigPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass robotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expansionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expansionNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressExpansionNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleExpansionNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instantiationPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crcPropertyEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UlswigPackageImpl()
  {
    super(eNS_URI, UlswigFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link UlswigPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UlswigPackage init()
  {
    if (isInited) return (UlswigPackage)EPackage.Registry.INSTANCE.getEPackage(UlswigPackage.eNS_URI);

    // Obtain or create and register package
    UlswigPackageImpl theUlswigPackage = (UlswigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UlswigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UlswigPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theUlswigPackage.createPackageContents();

    // Initialize created meta-data
    theUlswigPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUlswigPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UlswigPackage.eNS_URI, theUlswigPackage);
    return theUlswigPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRobot()
  {
    return robotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_Constructors()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructor()
  {
    return constructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_IsPublic()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Name()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Parameters()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_Addresses()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_Members()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddress()
  {
    return addressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddress_Name()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddress_Elements()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMember()
  {
    return memberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkBinding()
  {
    return linkBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkBinding_Properties()
  {
    return (EReference)linkBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkProperty()
  {
    return linkPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkProperty_LinkName()
  {
    return (EAttribute)linkPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkProperty_BaseValue()
  {
    return (EAttribute)linkPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpansion()
  {
    return expansionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpansion_Identifier()
  {
    return (EReference)expansionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpansion_Constructor()
  {
    return (EReference)expansionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpansion_Arguments()
  {
    return (EReference)expansionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpansion_Bindings()
  {
    return (EReference)expansionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpansionName()
  {
    return expansionNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpansionName_Name()
  {
    return (EAttribute)expansionNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddressExpansionName()
  {
    return addressExpansionNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleExpansionName()
  {
    return simpleExpansionNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddressBinding()
  {
    return addressBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddressBinding_Name()
  {
    return (EAttribute)addressBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddressBinding_Addresses()
  {
    return (EAttribute)addressBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Simple()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Lhs()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Rhs()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Text()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstantiation()
  {
    return instantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstantiation_Name()
  {
    return (EAttribute)instantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstantiation_Kind()
  {
    return (EAttribute)instantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstantiation_Properties()
  {
    return (EReference)instantiationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstantiationProperty()
  {
    return instantiationPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDProperty()
  {
    return idPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDProperty_Id()
  {
    return (EReference)idPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCRCProperty()
  {
    return crcPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UlswigFactory getUlswigFactory()
  {
    return (UlswigFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    robotEClass = createEClass(ROBOT);
    createEReference(robotEClass, ROBOT__CONSTRUCTORS);

    constructorEClass = createEClass(CONSTRUCTOR);
    createEAttribute(constructorEClass, CONSTRUCTOR__IS_PUBLIC);
    createEAttribute(constructorEClass, CONSTRUCTOR__NAME);
    createEAttribute(constructorEClass, CONSTRUCTOR__PARAMETERS);
    createEReference(constructorEClass, CONSTRUCTOR__ADDRESSES);
    createEReference(constructorEClass, CONSTRUCTOR__MEMBERS);

    addressEClass = createEClass(ADDRESS);
    createEAttribute(addressEClass, ADDRESS__NAME);
    createEAttribute(addressEClass, ADDRESS__ELEMENTS);

    memberEClass = createEClass(MEMBER);

    linkBindingEClass = createEClass(LINK_BINDING);
    createEReference(linkBindingEClass, LINK_BINDING__PROPERTIES);

    linkPropertyEClass = createEClass(LINK_PROPERTY);
    createEAttribute(linkPropertyEClass, LINK_PROPERTY__LINK_NAME);
    createEAttribute(linkPropertyEClass, LINK_PROPERTY__BASE_VALUE);

    expansionEClass = createEClass(EXPANSION);
    createEReference(expansionEClass, EXPANSION__IDENTIFIER);
    createEReference(expansionEClass, EXPANSION__CONSTRUCTOR);
    createEReference(expansionEClass, EXPANSION__ARGUMENTS);
    createEReference(expansionEClass, EXPANSION__BINDINGS);

    expansionNameEClass = createEClass(EXPANSION_NAME);
    createEAttribute(expansionNameEClass, EXPANSION_NAME__NAME);

    addressExpansionNameEClass = createEClass(ADDRESS_EXPANSION_NAME);

    simpleExpansionNameEClass = createEClass(SIMPLE_EXPANSION_NAME);

    addressBindingEClass = createEClass(ADDRESS_BINDING);
    createEAttribute(addressBindingEClass, ADDRESS_BINDING__NAME);
    createEAttribute(addressBindingEClass, ADDRESS_BINDING__ADDRESSES);

    argumentEClass = createEClass(ARGUMENT);
    createEAttribute(argumentEClass, ARGUMENT__SIMPLE);
    createEAttribute(argumentEClass, ARGUMENT__LHS);
    createEReference(argumentEClass, ARGUMENT__RHS);
    createEAttribute(argumentEClass, ARGUMENT__TEXT);

    instantiationEClass = createEClass(INSTANTIATION);
    createEAttribute(instantiationEClass, INSTANTIATION__NAME);
    createEAttribute(instantiationEClass, INSTANTIATION__KIND);
    createEReference(instantiationEClass, INSTANTIATION__PROPERTIES);

    instantiationPropertyEClass = createEClass(INSTANTIATION_PROPERTY);

    idPropertyEClass = createEClass(ID_PROPERTY);
    createEReference(idPropertyEClass, ID_PROPERTY__ID);

    crcPropertyEClass = createEClass(CRC_PROPERTY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    linkBindingEClass.getESuperTypes().add(this.getMember());
    expansionEClass.getESuperTypes().add(this.getMember());
    addressExpansionNameEClass.getESuperTypes().add(this.getExpansionName());
    simpleExpansionNameEClass.getESuperTypes().add(this.getExpansionName());
    instantiationEClass.getESuperTypes().add(this.getMember());
    idPropertyEClass.getESuperTypes().add(this.getInstantiationProperty());
    crcPropertyEClass.getESuperTypes().add(this.getInstantiationProperty());

    // Initialize classes and features; add operations and parameters
    initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRobot_Constructors(), this.getConstructor(), null, "constructors", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstructor_IsPublic(), ecorePackage.getEBoolean(), "isPublic", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_Addresses(), this.getAddress(), null, "addresses", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_Members(), this.getMember(), null, "members", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddress_Name(), ecorePackage.getEString(), "name", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_Elements(), ecorePackage.getEString(), "elements", null, 0, -1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linkBindingEClass, LinkBinding.class, "LinkBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinkBinding_Properties(), this.getLinkProperty(), null, "properties", null, 0, -1, LinkBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkPropertyEClass, LinkProperty.class, "LinkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinkProperty_LinkName(), ecorePackage.getEString(), "linkName", null, 0, 1, LinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinkProperty_BaseValue(), ecorePackage.getEInt(), "baseValue", null, 0, 1, LinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expansionEClass, Expansion.class, "Expansion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpansion_Identifier(), this.getExpansionName(), null, "identifier", null, 0, 1, Expansion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpansion_Constructor(), this.getConstructor(), null, "constructor", null, 0, 1, Expansion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpansion_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Expansion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpansion_Bindings(), this.getAddressBinding(), null, "bindings", null, 0, -1, Expansion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expansionNameEClass, ExpansionName.class, "ExpansionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpansionName_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExpansionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressExpansionNameEClass, AddressExpansionName.class, "AddressExpansionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleExpansionNameEClass, SimpleExpansionName.class, "SimpleExpansionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(addressBindingEClass, AddressBinding.class, "AddressBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddressBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, AddressBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddressBinding_Addresses(), ecorePackage.getEString(), "addresses", null, 0, -1, AddressBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArgument_Simple(), ecorePackage.getEString(), "simple", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Lhs(), ecorePackage.getEString(), "lhs", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgument_Rhs(), this.getArgument(), null, "rhs", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Text(), ecorePackage.getEString(), "text", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instantiationEClass, Instantiation.class, "Instantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstantiation_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, Instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstantiation_Properties(), this.getInstantiationProperty(), null, "properties", null, 0, -1, Instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instantiationPropertyEClass, InstantiationProperty.class, "InstantiationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(idPropertyEClass, IDProperty.class, "IDProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIDProperty_Id(), this.getArgument(), null, "id", null, 0, 1, IDProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crcPropertyEClass, CRCProperty.class, "CRCProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //UlswigPackageImpl
