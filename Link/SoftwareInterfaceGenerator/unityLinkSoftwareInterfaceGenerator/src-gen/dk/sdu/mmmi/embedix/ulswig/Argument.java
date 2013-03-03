/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Argument#getSimple <em>Simple</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Argument#getLhs <em>Lhs</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Argument#getRhs <em>Rhs</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Argument#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject
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
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getArgument_Simple()
   * @model
   * @generated
   */
  String getSimple();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getSimple <em>Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' attribute.
   * @see #getSimple()
   * @generated
   */
  void setSimple(String value);

  /**
   * Returns the value of the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' attribute.
   * @see #setLhs(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getArgument_Lhs()
   * @model
   * @generated
   */
  String getLhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getLhs <em>Lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' attribute.
   * @see #getLhs()
   * @generated
   */
  void setLhs(String value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Argument)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getArgument_Rhs()
   * @model containment="true"
   * @generated
   */
  Argument getRhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Argument value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getArgument_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Argument#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // Argument
