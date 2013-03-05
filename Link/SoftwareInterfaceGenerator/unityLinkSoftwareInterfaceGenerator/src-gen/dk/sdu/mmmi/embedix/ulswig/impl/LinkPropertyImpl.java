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
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl#getCtrlName <em>Ctrl Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.LinkPropertyImpl#getUartName <em>Uart Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkPropertyImpl extends MinimalEObjectImpl.Container implements LinkProperty
{
  /**
   * The default value of the '{@link #getCtrlName() <em>Ctrl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCtrlName()
   * @generated
   * @ordered
   */
  protected static final String CTRL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCtrlName() <em>Ctrl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCtrlName()
   * @generated
   * @ordered
   */
  protected String ctrlName = CTRL_NAME_EDEFAULT;

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
   * The default value of the '{@link #getUartName() <em>Uart Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUartName()
   * @generated
   * @ordered
   */
  protected static final String UART_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUartName() <em>Uart Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUartName()
   * @generated
   * @ordered
   */
  protected String uartName = UART_NAME_EDEFAULT;

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
  public String getCtrlName()
  {
    return ctrlName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCtrlName(String newCtrlName)
  {
    String oldCtrlName = ctrlName;
    ctrlName = newCtrlName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.LINK_PROPERTY__CTRL_NAME, oldCtrlName, ctrlName));
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
  public String getUartName()
  {
    return uartName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUartName(String newUartName)
  {
    String oldUartName = uartName;
    uartName = newUartName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.LINK_PROPERTY__UART_NAME, oldUartName, uartName));
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
      case UlswigPackage.LINK_PROPERTY__CTRL_NAME:
        return getCtrlName();
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        return getBaseValue();
      case UlswigPackage.LINK_PROPERTY__UART_NAME:
        return getUartName();
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
      case UlswigPackage.LINK_PROPERTY__CTRL_NAME:
        setCtrlName((String)newValue);
        return;
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        setBaseValue((Integer)newValue);
        return;
      case UlswigPackage.LINK_PROPERTY__UART_NAME:
        setUartName((String)newValue);
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
      case UlswigPackage.LINK_PROPERTY__CTRL_NAME:
        setCtrlName(CTRL_NAME_EDEFAULT);
        return;
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        setBaseValue(BASE_VALUE_EDEFAULT);
        return;
      case UlswigPackage.LINK_PROPERTY__UART_NAME:
        setUartName(UART_NAME_EDEFAULT);
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
      case UlswigPackage.LINK_PROPERTY__CTRL_NAME:
        return CTRL_NAME_EDEFAULT == null ? ctrlName != null : !CTRL_NAME_EDEFAULT.equals(ctrlName);
      case UlswigPackage.LINK_PROPERTY__BASE_VALUE:
        return baseValue != BASE_VALUE_EDEFAULT;
      case UlswigPackage.LINK_PROPERTY__UART_NAME:
        return UART_NAME_EDEFAULT == null ? uartName != null : !UART_NAME_EDEFAULT.equals(uartName);
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
    result.append(" (ctrlName: ");
    result.append(ctrlName);
    result.append(", baseValue: ");
    result.append(baseValue);
    result.append(", uartName: ");
    result.append(uartName);
    result.append(')');
    return result.toString();
  }

} //LinkPropertyImpl
