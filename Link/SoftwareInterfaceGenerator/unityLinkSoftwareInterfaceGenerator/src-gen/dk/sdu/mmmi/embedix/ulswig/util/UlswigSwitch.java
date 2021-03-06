/**
 */
package dk.sdu.mmmi.embedix.ulswig.util;

import dk.sdu.mmmi.embedix.ulswig.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage
 * @generated
 */
public class UlswigSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UlswigPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UlswigSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UlswigPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UlswigPackage.LINK_SPEC:
      {
        LinkSpec linkSpec = (LinkSpec)theEObject;
        T result = caseLinkSpec(linkSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.CONSTRUCTOR:
      {
        Constructor constructor = (Constructor)theEObject;
        T result = caseConstructor(constructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.CONSTRUCTOR_ADDRESS_PARAMETERS:
      {
        ConstructorAddressParameters constructorAddressParameters = (ConstructorAddressParameters)theEObject;
        T result = caseConstructorAddressParameters(constructorAddressParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.NAMED_ADDRESSES:
      {
        NamedAddresses namedAddresses = (NamedAddresses)theEObject;
        T result = caseNamedAddresses(namedAddresses);
        if (result == null) result = caseConstructorAddressParameters(namedAddresses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.ADDRESS_TUPLE:
      {
        AddressTuple addressTuple = (AddressTuple)theEObject;
        T result = caseAddressTuple(addressTuple);
        if (result == null) result = caseConstructorAddressParameters(addressTuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.LINK_BINDING:
      {
        LinkBinding linkBinding = (LinkBinding)theEObject;
        T result = caseLinkBinding(linkBinding);
        if (result == null) result = caseMember(linkBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.TOS_NET_LINK_BINDING:
      {
        TosNetLinkBinding tosNetLinkBinding = (TosNetLinkBinding)theEObject;
        T result = caseTosNetLinkBinding(tosNetLinkBinding);
        if (result == null) result = caseLinkBinding(tosNetLinkBinding);
        if (result == null) result = caseMember(tosNetLinkBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.LINK_PROPERTY:
      {
        LinkProperty linkProperty = (LinkProperty)theEObject;
        T result = caseLinkProperty(linkProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.EXPANSION:
      {
        Expansion expansion = (Expansion)theEObject;
        T result = caseExpansion(expansion);
        if (result == null) result = caseMember(expansion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.SIMPLE_EXPANSION:
      {
        SimpleExpansion simpleExpansion = (SimpleExpansion)theEObject;
        T result = caseSimpleExpansion(simpleExpansion);
        if (result == null) result = caseExpansion(simpleExpansion);
        if (result == null) result = caseMember(simpleExpansion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.ADDRESS_EXPANSION:
      {
        AddressExpansion addressExpansion = (AddressExpansion)theEObject;
        T result = caseAddressExpansion(addressExpansion);
        if (result == null) result = caseExpansion(addressExpansion);
        if (result == null) result = caseMember(addressExpansion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.ADDRESS_BINDING:
      {
        AddressBinding addressBinding = (AddressBinding)theEObject;
        T result = caseAddressBinding(addressBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.INSTANTIATION:
      {
        Instantiation instantiation = (Instantiation)theEObject;
        T result = caseInstantiation(instantiation);
        if (result == null) result = caseMember(instantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.ADDRESS_SPEC:
      {
        AddressSpec addressSpec = (AddressSpec)theEObject;
        T result = caseAddressSpec(addressSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.DIRECT_ADDRESS_SPEC:
      {
        DirectAddressSpec directAddressSpec = (DirectAddressSpec)theEObject;
        T result = caseDirectAddressSpec(directAddressSpec);
        if (result == null) result = caseAddressSpec(directAddressSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.NAMED_ADDRESS_SPEC:
      {
        NamedAddressSpec namedAddressSpec = (NamedAddressSpec)theEObject;
        T result = caseNamedAddressSpec(namedAddressSpec);
        if (result == null) result = caseAddressSpec(namedAddressSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.INSTANTIATION_PROPERTY:
      {
        InstantiationProperty instantiationProperty = (InstantiationProperty)theEObject;
        T result = caseInstantiationProperty(instantiationProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.GROUPING:
      {
        Grouping grouping = (Grouping)theEObject;
        T result = caseGrouping(grouping);
        if (result == null) result = caseMember(grouping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.GROUP_ELEMENT:
      {
        GroupElement groupElement = (GroupElement)theEObject;
        T result = caseGroupElement(groupElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.PATH_ELEMENT:
      {
        PathElement pathElement = (PathElement)theEObject;
        T result = casePathElement(pathElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.ID_PROPERTY:
      {
        IDProperty idProperty = (IDProperty)theEObject;
        T result = caseIDProperty(idProperty);
        if (result == null) result = caseInstantiationProperty(idProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.CRC_PROPERTY:
      {
        CRCProperty crcProperty = (CRCProperty)theEObject;
        T result = caseCRCProperty(crcProperty);
        if (result == null) result = caseInstantiationProperty(crcProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UlswigPackage.PUBLISH_PROPERTY:
      {
        PublishProperty publishProperty = (PublishProperty)theEObject;
        T result = casePublishProperty(publishProperty);
        if (result == null) result = caseInstantiationProperty(publishProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkSpec(LinkSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructor(Constructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Address Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Address Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorAddressParameters(ConstructorAddressParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Addresses</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Addresses</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedAddresses(NamedAddresses object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address Tuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address Tuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddressTuple(AddressTuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkBinding(LinkBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tos Net Link Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tos Net Link Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTosNetLinkBinding(TosNetLinkBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkProperty(LinkProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expansion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expansion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpansion(Expansion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Expansion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Expansion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleExpansion(SimpleExpansion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address Expansion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address Expansion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddressExpansion(AddressExpansion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddressBinding(AddressBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstantiation(Instantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddressSpec(AddressSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Address Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Address Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectAddressSpec(DirectAddressSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Address Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Address Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedAddressSpec(NamedAddressSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instantiation Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instantiation Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstantiationProperty(InstantiationProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grouping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grouping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrouping(Grouping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupElement(GroupElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathElement(PathElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDProperty(IDProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CRC Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CRC Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCRCProperty(CRCProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Publish Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Publish Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePublishProperty(PublishProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UlswigSwitch
