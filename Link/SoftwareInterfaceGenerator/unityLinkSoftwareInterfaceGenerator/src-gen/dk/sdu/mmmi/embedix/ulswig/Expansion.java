/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getArguments <em>Arguments</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getExpansion()
 * @model
 * @generated
 */
public interface Expansion extends Member
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(ExpansionName)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getExpansion_Identifier()
   * @model containment="true"
   * @generated
   */
  ExpansionName getIdentifier();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(ExpansionName value);

  /**
   * Returns the value of the '<em><b>Constructor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor</em>' reference.
   * @see #setConstructor(Constructor)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getExpansion_Constructor()
   * @model
   * @generated
   */
  Constructor getConstructor();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Expansion#getConstructor <em>Constructor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constructor</em>' reference.
   * @see #getConstructor()
   * @generated
   */
  void setConstructor(Constructor value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.embedix.ulswig.Argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getExpansion_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getArguments();

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.embedix.ulswig.AddressBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getExpansion_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<AddressBinding> getBindings();

} // Expansion
