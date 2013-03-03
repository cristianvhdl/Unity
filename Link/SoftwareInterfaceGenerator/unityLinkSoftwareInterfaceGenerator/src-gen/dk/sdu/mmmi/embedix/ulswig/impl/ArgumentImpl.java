/**
 */
package dk.sdu.mmmi.embedix.ulswig.impl;

import dk.sdu.mmmi.embedix.ulswig.Argument;
import dk.sdu.mmmi.embedix.ulswig.UlswigPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ArgumentImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
{
  /**
   * The default value of the '{@link #getSimple() <em>Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple()
   * @generated
   * @ordered
   */
  protected static final String SIMPLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSimple() <em>Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple()
   * @generated
   * @ordered
   */
  protected String simple = SIMPLE_EDEFAULT;

  /**
   * The default value of the '{@link #getLhs() <em>Lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected static final String LHS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected String lhs = LHS_EDEFAULT;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected Argument rhs;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentImpl()
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
    return UlswigPackage.Literals.ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSimple()
  {
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimple(String newSimple)
  {
    String oldSimple = simple;
    simple = newSimple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.ARGUMENT__SIMPLE, oldSimple, simple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(String newLhs)
  {
    String oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.ARGUMENT__LHS, oldLhs, lhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(Argument newRhs, NotificationChain msgs)
  {
    Argument oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UlswigPackage.ARGUMENT__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(Argument newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UlswigPackage.ARGUMENT__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UlswigPackage.ARGUMENT__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.ARGUMENT__RHS, newRhs, newRhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.ARGUMENT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UlswigPackage.ARGUMENT__RHS:
        return basicSetRhs(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UlswigPackage.ARGUMENT__SIMPLE:
        return getSimple();
      case UlswigPackage.ARGUMENT__LHS:
        return getLhs();
      case UlswigPackage.ARGUMENT__RHS:
        return getRhs();
      case UlswigPackage.ARGUMENT__TEXT:
        return getText();
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
      case UlswigPackage.ARGUMENT__SIMPLE:
        setSimple((String)newValue);
        return;
      case UlswigPackage.ARGUMENT__LHS:
        setLhs((String)newValue);
        return;
      case UlswigPackage.ARGUMENT__RHS:
        setRhs((Argument)newValue);
        return;
      case UlswigPackage.ARGUMENT__TEXT:
        setText((String)newValue);
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
      case UlswigPackage.ARGUMENT__SIMPLE:
        setSimple(SIMPLE_EDEFAULT);
        return;
      case UlswigPackage.ARGUMENT__LHS:
        setLhs(LHS_EDEFAULT);
        return;
      case UlswigPackage.ARGUMENT__RHS:
        setRhs((Argument)null);
        return;
      case UlswigPackage.ARGUMENT__TEXT:
        setText(TEXT_EDEFAULT);
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
      case UlswigPackage.ARGUMENT__SIMPLE:
        return SIMPLE_EDEFAULT == null ? simple != null : !SIMPLE_EDEFAULT.equals(simple);
      case UlswigPackage.ARGUMENT__LHS:
        return LHS_EDEFAULT == null ? lhs != null : !LHS_EDEFAULT.equals(lhs);
      case UlswigPackage.ARGUMENT__RHS:
        return rhs != null;
      case UlswigPackage.ARGUMENT__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
    result.append(" (simple: ");
    result.append(simple);
    result.append(", lhs: ");
    result.append(lhs);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //ArgumentImpl
