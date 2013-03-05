/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getCtrlName <em>Ctrl Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getUartName <em>Uart Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getLinkProperty()
 * @model
 * @generated
 */
public interface LinkProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Ctrl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ctrl Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ctrl Name</em>' attribute.
   * @see #setCtrlName(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getLinkProperty_CtrlName()
   * @model
   * @generated
   */
  String getCtrlName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getCtrlName <em>Ctrl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ctrl Name</em>' attribute.
   * @see #getCtrlName()
   * @generated
   */
  void setCtrlName(String value);

  /**
   * Returns the value of the '<em><b>Base Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Value</em>' attribute.
   * @see #setBaseValue(int)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getLinkProperty_BaseValue()
   * @model
   * @generated
   */
  int getBaseValue();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getBaseValue <em>Base Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Value</em>' attribute.
   * @see #getBaseValue()
   * @generated
   */
  void setBaseValue(int value);

  /**
   * Returns the value of the '<em><b>Uart Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uart Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uart Name</em>' attribute.
   * @see #setUartName(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getLinkProperty_UartName()
   * @model
   * @generated
   */
  String getUartName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.LinkProperty#getUartName <em>Uart Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uart Name</em>' attribute.
   * @see #getUartName()
   * @generated
   */
  void setUartName(String value);

} // LinkProperty
