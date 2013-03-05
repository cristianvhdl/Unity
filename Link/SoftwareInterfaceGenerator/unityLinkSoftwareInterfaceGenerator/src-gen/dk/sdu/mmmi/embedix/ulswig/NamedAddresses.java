/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Addresses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.NamedAddresses#getAddressNames <em>Address Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getNamedAddresses()
 * @model
 * @generated
 */
public interface NamedAddresses extends ConstructorAddressParameters
{
  /**
   * Returns the value of the '<em><b>Address Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Names</em>' attribute list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getNamedAddresses_AddressNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getAddressNames();

} // NamedAddresses
