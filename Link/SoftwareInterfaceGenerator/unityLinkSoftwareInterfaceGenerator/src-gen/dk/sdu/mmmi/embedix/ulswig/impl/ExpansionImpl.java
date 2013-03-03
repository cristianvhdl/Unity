/**
 */
package dk.sdu.mmmi.embedix.ulswig.impl;

import dk.sdu.mmmi.embedix.ulswig.AddressBinding;
import dk.sdu.mmmi.embedix.ulswig.Argument;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.Expansion;
import dk.sdu.mmmi.embedix.ulswig.ExpansionName;
import dk.sdu.mmmi.embedix.ulswig.UlswigPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.impl.ExpansionImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionImpl extends MemberImpl implements Expansion
{
  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected ExpansionName identifier;

  /**
   * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected Constructor constructor;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Argument> arguments;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<AddressBinding> bindings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpansionImpl()
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
    return UlswigPackage.Literals.EXPANSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpansionName getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier(ExpansionName newIdentifier, NotificationChain msgs)
  {
    ExpansionName oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UlswigPackage.EXPANSION__IDENTIFIER, oldIdentifier, newIdentifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(ExpansionName newIdentifier)
  {
    if (newIdentifier != identifier)
    {
      NotificationChain msgs = null;
      if (identifier != null)
        msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UlswigPackage.EXPANSION__IDENTIFIER, null, msgs);
      if (newIdentifier != null)
        msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UlswigPackage.EXPANSION__IDENTIFIER, null, msgs);
      msgs = basicSetIdentifier(newIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.EXPANSION__IDENTIFIER, newIdentifier, newIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor getConstructor()
  {
    if (constructor != null && constructor.eIsProxy())
    {
      InternalEObject oldConstructor = (InternalEObject)constructor;
      constructor = (Constructor)eResolveProxy(oldConstructor);
      if (constructor != oldConstructor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UlswigPackage.EXPANSION__CONSTRUCTOR, oldConstructor, constructor));
      }
    }
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor basicGetConstructor()
  {
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstructor(Constructor newConstructor)
  {
    Constructor oldConstructor = constructor;
    constructor = newConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlswigPackage.EXPANSION__CONSTRUCTOR, oldConstructor, constructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Argument>(Argument.class, this, UlswigPackage.EXPANSION__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AddressBinding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<AddressBinding>(AddressBinding.class, this, UlswigPackage.EXPANSION__BINDINGS);
    }
    return bindings;
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
      case UlswigPackage.EXPANSION__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case UlswigPackage.EXPANSION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case UlswigPackage.EXPANSION__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case UlswigPackage.EXPANSION__IDENTIFIER:
        return getIdentifier();
      case UlswigPackage.EXPANSION__CONSTRUCTOR:
        if (resolve) return getConstructor();
        return basicGetConstructor();
      case UlswigPackage.EXPANSION__ARGUMENTS:
        return getArguments();
      case UlswigPackage.EXPANSION__BINDINGS:
        return getBindings();
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
      case UlswigPackage.EXPANSION__IDENTIFIER:
        setIdentifier((ExpansionName)newValue);
        return;
      case UlswigPackage.EXPANSION__CONSTRUCTOR:
        setConstructor((Constructor)newValue);
        return;
      case UlswigPackage.EXPANSION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Argument>)newValue);
        return;
      case UlswigPackage.EXPANSION__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends AddressBinding>)newValue);
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
      case UlswigPackage.EXPANSION__IDENTIFIER:
        setIdentifier((ExpansionName)null);
        return;
      case UlswigPackage.EXPANSION__CONSTRUCTOR:
        setConstructor((Constructor)null);
        return;
      case UlswigPackage.EXPANSION__ARGUMENTS:
        getArguments().clear();
        return;
      case UlswigPackage.EXPANSION__BINDINGS:
        getBindings().clear();
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
      case UlswigPackage.EXPANSION__IDENTIFIER:
        return identifier != null;
      case UlswigPackage.EXPANSION__CONSTRUCTOR:
        return constructor != null;
      case UlswigPackage.EXPANSION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case UlswigPackage.EXPANSION__BINDINGS:
        return bindings != null && !bindings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpansionImpl
