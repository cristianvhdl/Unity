/**
 */
package dk.sdu.mmmi.embedix.ulswig.impl;

import dk.sdu.mmmi.embedix.ulswig.Address;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.Member;
import dk.sdu.mmmi.embedix.ulswig.UlswigPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ConstructorImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends MinimalEObjectImpl.Container implements Constructor
{
  /**
   * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPublic()
   * @generated
   * @ordered
   */
  protected static final boolean IS_PUBLIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPublic()
   * @generated
   * @ordered
   */
  protected boolean isPublic = IS_PUBLIC_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddresses()
   * @generated
   * @ordered
   */
  protected EList<Address> addresses;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorImpl()
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
    return UlswigPackage.Literals.CONSTRUCTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsPublic()
  {
    return isPublic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsPublic(boolean newIsPublic)
  {
    boolean oldIsPublic = isPublic;
    isPublic = newIsPublic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.CONSTRUCTOR__IS_PUBLIC, oldIsPublic, isPublic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.CONSTRUCTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EDataTypeEList<String>(String.class, this, UlswigPackage.CONSTRUCTOR__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Address> getAddresses()
  {
    if (addresses == null)
    {
      addresses = new EObjectContainmentEList<Address>(Address.class, this, UlswigPackage.CONSTRUCTOR__ADDRESSES);
    }
    return addresses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Member>(Member.class, this, UlswigPackage.CONSTRUCTOR__MEMBERS);
    }
    return members;
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
      case UlswigPackage.CONSTRUCTOR__ADDRESSES:
        return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
      case UlswigPackage.CONSTRUCTOR__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case UlswigPackage.CONSTRUCTOR__IS_PUBLIC:
        return isIsPublic();
      case UlswigPackage.CONSTRUCTOR__NAME:
        return getName();
      case UlswigPackage.CONSTRUCTOR__PARAMETERS:
        return getParameters();
      case UlswigPackage.CONSTRUCTOR__ADDRESSES:
        return getAddresses();
      case UlswigPackage.CONSTRUCTOR__MEMBERS:
        return getMembers();
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
      case UlswigPackage.CONSTRUCTOR__IS_PUBLIC:
        setIsPublic((Boolean)newValue);
        return;
      case UlswigPackage.CONSTRUCTOR__NAME:
        setName((String)newValue);
        return;
      case UlswigPackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
        return;
      case UlswigPackage.CONSTRUCTOR__ADDRESSES:
        getAddresses().clear();
        getAddresses().addAll((Collection<? extends Address>)newValue);
        return;
      case UlswigPackage.CONSTRUCTOR__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
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
      case UlswigPackage.CONSTRUCTOR__IS_PUBLIC:
        setIsPublic(IS_PUBLIC_EDEFAULT);
        return;
      case UlswigPackage.CONSTRUCTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UlswigPackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        return;
      case UlswigPackage.CONSTRUCTOR__ADDRESSES:
        getAddresses().clear();
        return;
      case UlswigPackage.CONSTRUCTOR__MEMBERS:
        getMembers().clear();
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
      case UlswigPackage.CONSTRUCTOR__IS_PUBLIC:
        return isPublic != IS_PUBLIC_EDEFAULT;
      case UlswigPackage.CONSTRUCTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UlswigPackage.CONSTRUCTOR__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case UlswigPackage.CONSTRUCTOR__ADDRESSES:
        return addresses != null && !addresses.isEmpty();
      case UlswigPackage.CONSTRUCTOR__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (isPublic: ");
    result.append(isPublic);
    result.append(", name: ");
    result.append(name);
    result.append(", parameters: ");
    result.append(parameters);
    result.append(')');
    return result.toString();
  }

} //ConstructorImpl
