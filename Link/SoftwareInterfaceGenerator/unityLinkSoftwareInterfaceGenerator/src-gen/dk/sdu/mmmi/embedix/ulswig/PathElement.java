/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.PathElement#getSimple <em>Simple</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.PathElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getPathElement()
 * @model
 * @generated
 */
public interface PathElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple</em>' attribute.
   * @see #setSimple(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getPathElement_Simple()
   * @model
   * @generated
   */
  String getSimple();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.PathElement#getSimple <em>Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' attribute.
   * @see #getSimple()
   * @generated
   */
  void setSimple(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Constructor)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getPathElement_Type()
   * @model
   * @generated
   */
  Constructor getType();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.PathElement#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Constructor value);

} // PathElement
