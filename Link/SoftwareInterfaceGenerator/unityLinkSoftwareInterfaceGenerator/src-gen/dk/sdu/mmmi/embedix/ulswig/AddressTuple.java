/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.AddressTuple#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getAddressTuple()
 * @model
 * @generated
 */
public interface AddressTuple extends ConstructorAddressParameters
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' attribute list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getAddressTuple_Elements()
   * @model unique="false"
   * @generated
   */
  EList<String> getElements();

} // AddressTuple
