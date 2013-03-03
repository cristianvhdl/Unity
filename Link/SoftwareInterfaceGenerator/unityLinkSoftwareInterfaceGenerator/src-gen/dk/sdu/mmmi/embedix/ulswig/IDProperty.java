/**
 */
package dk.sdu.mmmi.embedix.ulswig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.IDProperty#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getIDProperty()
 * @model
 * @generated
 */
public interface IDProperty extends InstantiationProperty
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Argument)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getIDProperty_Id()
   * @model containment="true"
   * @generated
   */
  Argument getId();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.IDProperty#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Argument value);

} // IDProperty
