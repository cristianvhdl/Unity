/**
 */
package dk.sdu.mmmi.embedix.ulswig.util;

import dk.sdu.mmmi.embedix.ulswig.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage
 * @generated
 */
public class UlswigAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UlswigPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UlswigAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UlswigPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UlswigSwitch<Adapter> modelSwitch =
    new UlswigSwitch<Adapter>()
    {
      @Override
      public Adapter caseRobot(Robot object)
      {
        return createRobotAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseAddress(Address object)
      {
        return createAddressAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseLinkBinding(LinkBinding object)
      {
        return createLinkBindingAdapter();
      }
      @Override
      public Adapter caseLinkProperty(LinkProperty object)
      {
        return createLinkPropertyAdapter();
      }
      @Override
      public Adapter caseExpansion(Expansion object)
      {
        return createExpansionAdapter();
      }
      @Override
      public Adapter caseExpansionName(ExpansionName object)
      {
        return createExpansionNameAdapter();
      }
      @Override
      public Adapter caseAddressExpansionName(AddressExpansionName object)
      {
        return createAddressExpansionNameAdapter();
      }
      @Override
      public Adapter caseSimpleExpansionName(SimpleExpansionName object)
      {
        return createSimpleExpansionNameAdapter();
      }
      @Override
      public Adapter caseAddressBinding(AddressBinding object)
      {
        return createAddressBindingAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseInstantiation(Instantiation object)
      {
        return createInstantiationAdapter();
      }
      @Override
      public Adapter caseInstantiationProperty(InstantiationProperty object)
      {
        return createInstantiationPropertyAdapter();
      }
      @Override
      public Adapter caseIDProperty(IDProperty object)
      {
        return createIDPropertyAdapter();
      }
      @Override
      public Adapter caseCRCProperty(CRCProperty object)
      {
        return createCRCPropertyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.Robot
   * @generated
   */
  public Adapter createRobotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.Address
   * @generated
   */
  public Adapter createAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.LinkBinding <em>Link Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkBinding
   * @generated
   */
  public Adapter createLinkBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty <em>Link Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.LinkProperty
   * @generated
   */
  public Adapter createLinkPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.Expansion <em>Expansion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.Expansion
   * @generated
   */
  public Adapter createExpansionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.ExpansionName <em>Expansion Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.ExpansionName
   * @generated
   */
  public Adapter createExpansionNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.AddressExpansionName <em>Address Expansion Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressExpansionName
   * @generated
   */
  public Adapter createAddressExpansionNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.SimpleExpansionName <em>Simple Expansion Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.SimpleExpansionName
   * @generated
   */
  public Adapter createSimpleExpansionNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.AddressBinding <em>Address Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.AddressBinding
   * @generated
   */
  public Adapter createAddressBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation <em>Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.Instantiation
   * @generated
   */
  public Adapter createInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.InstantiationProperty <em>Instantiation Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.InstantiationProperty
   * @generated
   */
  public Adapter createInstantiationPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.IDProperty <em>ID Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.IDProperty
   * @generated
   */
  public Adapter createIDPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.embedix.ulswig.CRCProperty <em>CRC Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.embedix.ulswig.CRCProperty
   * @generated
   */
  public Adapter createCRCPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UlswigAdapterFactory