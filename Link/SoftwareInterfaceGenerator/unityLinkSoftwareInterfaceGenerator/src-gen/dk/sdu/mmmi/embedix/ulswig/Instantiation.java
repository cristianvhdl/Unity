/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getAddress <em>Address</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getKind <em>Kind</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getInstantiation()
 * @model
 * @generated
 */
public interface Instantiation extends Member
{
  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference.
   * @see #setAddress(AddressSpec)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getInstantiation_Address()
   * @model containment="true"
   * @generated
   */
  AddressSpec getAddress();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(AddressSpec value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see #setKind(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getInstantiation_Kind()
   * @model
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Instantiation#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.embedix.ulswig.InstantiationProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getInstantiation_Properties()
   * @model containment="true"
   * @generated
   */
  EList<InstantiationProperty> getProperties();

} // Instantiation
