/**
 */
package dk.sdu.mmmi.embedix.ulswig.impl;

import dk.sdu.mmmi.embedix.ulswig.NamedAddresses;
import dk.sdu.mmmi.embedix.ulswig.UlswigPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Addresses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.NamedAddressesImpl#getAddressNames <em>Address Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedAddressesImpl extends ConstructorAddressParametersImpl implements NamedAddresses
{
  /**
   * The cached value of the '{@link #getAddressNames() <em>Address Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressNames()
   * @generated
   * @ordered
   */
  protected EList<String> addressNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedAddressesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UlswigPackage.Literals.NAMED_ADDRESSES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAddressNames()
  {
    if (addressNames == null)
    {
      addressNames = new EDataTypeEList<String>(String.class, this, UlswigPackage.NAMED_ADDRESSES__ADDRESS_NAMES);
    }
    return addressNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UlswigPackage.NAMED_ADDRESSES__ADDRESS_NAMES:
        return getAddressNames();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UlswigPackage.NAMED_ADDRESSES__ADDRESS_NAMES:
        getAddressNames().clear();
        getAddressNames().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UlswigPackage.NAMED_ADDRESSES__ADDRESS_NAMES:
        getAddressNames().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UlswigPackage.NAMED_ADDRESSES__ADDRESS_NAMES:
        return addressNames != null && !addressNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (addressNames: ");
    result.append(addressNames);
    result.append(')');
    return result.toString();
  }

} //NamedAddressesImpl
