/**
 */
package unityGameDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actionkey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.Actionkey#getExecute <em>Execute</em>}</li>
 *   <li>{@link unityGameDSL.Actionkey#getKey <em>Key</em>}</li>
 *   <li>{@link unityGameDSL.Actionkey#getPressType <em>Press Type</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getActionkey()
 * @model
 * @generated
 */
public interface Actionkey extends EObject {
	/**
	 * Returns the value of the '<em><b>Execute</b></em>' containment reference list.
	 * The list contents are of type {@link unityGameDSL.GameAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' containment reference list.
	 * @see unityGameDSL.UnityGameDSLPackage#getActionkey_Execute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GameAction> getExecute();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see unityGameDSL.UnityGameDSLPackage#getActionkey_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link unityGameDSL.Actionkey#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Press Type</b></em>' attribute.
	 * The literals are from the enumeration {@link unityGameDSL.KeyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Press Type</em>' attribute.
	 * @see unityGameDSL.KeyType
	 * @see #setPressType(KeyType)
	 * @see unityGameDSL.UnityGameDSLPackage#getActionkey_PressType()
	 * @model
	 * @generated
	 */
	KeyType getPressType();

	/**
	 * Sets the value of the '{@link unityGameDSL.Actionkey#getPressType <em>Press Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Press Type</em>' attribute.
	 * @see unityGameDSL.KeyType
	 * @see #getPressType()
	 * @generated
	 */
	void setPressType(KeyType value);

} // Actionkey
