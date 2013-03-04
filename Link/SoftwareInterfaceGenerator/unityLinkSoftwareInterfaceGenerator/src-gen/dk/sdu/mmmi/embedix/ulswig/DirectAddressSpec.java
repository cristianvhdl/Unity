/**
 */
package dk.sdu.mmmi.embedix.ulswig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Address Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getDirectAddressSpec()
 * @model
 * @generated
 */
public interface DirectAddressSpec extends AddressSpec
{
  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getDirectAddressSpec_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

} // DirectAddressSpec
