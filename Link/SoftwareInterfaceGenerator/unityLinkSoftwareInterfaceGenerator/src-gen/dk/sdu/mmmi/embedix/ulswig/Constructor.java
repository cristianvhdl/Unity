/**
 */
package dk.sdu.mmmi.embedix.ulswig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Constructor#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Public</em>' attribute.
   * @see #setIsPublic(boolean)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getConstructor_IsPublic()
   * @model
   * @generated
   */
  boolean isIsPublic();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#isIsPublic <em>Is Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Public</em>' attribute.
   * @see #isIsPublic()
   * @generated
   */
  void setIsPublic(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getConstructor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.embedix.ulswig.Constructor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getConstructor_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

  /**
   * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.embedix.ulswig.Address}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addresses</em>' containment reference list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getConstructor_Addresses()
   * @model containment="true"
   * @generated
   */
  EList<Address> getAddresses();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.embedix.ulswig.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see dk.sdu.mmmi.embedix.ulswig.UlswigPackage#getConstructor_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Constructor
