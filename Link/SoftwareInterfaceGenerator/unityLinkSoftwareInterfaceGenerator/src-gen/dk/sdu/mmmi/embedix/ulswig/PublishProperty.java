/**
 */
package dk.sdu.mmmi.embedix.ulswig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publish Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.PublishProperty#getMode <em>Mode</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.PublishProperty#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getPublishProperty()
 * @model
 * @generated
 */
public interface PublishProperty extends InstantiationProperty
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(int)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getPublishProperty_Mode()
   * @model
   * @generated
   */
  int getMode();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.PublishProperty#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
  void setMode(int value);

  /**
   * Returns the value of the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' attribute.
   * @see #setRate(int)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getPublishProperty_Rate()
   * @model
   * @generated
   */
  int getRate();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.PublishProperty#getRate <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' attribute.
   * @see #getRate()
   * @generated
   */
  void setRate(int value);

} // PublishProperty
