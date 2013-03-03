/**
 */
package dk.sdu.mmmi.embedix.ulswig.impl;

import dk.sdu.mmmi.embedix.ulswig.LinkProperty;
import dk.sdu.mmmi.embedix.ulswig.UlswigPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl#getBaseValue <em>Base Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkPropertyImpl extends MinimalEObjectImpl.Container implements LinkProperty
{
  /**
   * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkName()
   * @generated
   * @ordered
   */
  protected static final String LINK_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkName()
   * @generated
   * @ordered
   */
  protected String linkName = LINK_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBaseValue() <em>Base Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseValue()
   * @generated
   * @ordered
   */
  protected static final int BASE_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBaseValue() <em>Base Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseValue()
   * @generated
   * @ordered
   */
  protected int baseValue = BASE_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkPropertyImpl()
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
    return UlswigPackage.Literals.LINK_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLinkName()
  {
    return linkName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkName(String newLinkName)
  {
    String oldLinkName = linkName;
    linkName = newLinkName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.LINK_PROPERTY__LINK_NAME, oldLinkName, linkName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBaseValue()
  {
    return baseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseValue(int newBaseValue)
  {
    int oldBaseValue = baseValue;
    baseValue = newBaseValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.LINK_PROPERTY__BASE_VALUE, oldBaseValue, baseValue));
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
      case UlswigPackage.LINK_PROPERTY__LINK_NAME:
        return getLinkName();
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        return getBaseValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UlswigPackage.LINK_PROPERTY__LINK_NAME:
        setLinkName((String)newValue);
        return;
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        setBaseValue((Integer)newValue);
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
      case UlswigPackage.LINK_PROPERTY__LINK_NAME:
        setLinkName(LINK_NAME_EDEFAULT);
        return;
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        setBaseValue(BASE_VALUE_EDEFAULT);
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
      case UlswigPackage.LINK_PROPERTY__LINK_NAME:
        return LINK_NAME_EDEFAULT == null ? linkName != null : !LINK_NAME_EDEFAULT.equals(linkName);
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        return baseValue != BASE_VALUE_EDEFAULT;
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
    result.append(" (linkName: ");
    result.append(linkName);
    result.append(", baseValue: ");
    result.append(baseValue);
    result.append(')');
    return result.toString();
  }

} //LinkPropertyImpl
