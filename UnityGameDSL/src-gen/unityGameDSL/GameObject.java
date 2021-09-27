/**
 */
package unityGameDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.GameObject#getMovement <em>Movement</em>}</li>
 *   <li>{@link unityGameDSL.GameObject#getColision <em>Colision</em>}</li>
 *   <li>{@link unityGameDSL.GameObject#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link unityGameDSL.GameObject#getStart <em>Start</em>}</li>
 *   <li>{@link unityGameDSL.GameObject#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getGameObject()
 * @model
 * @generated
 */
public interface GameObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Movement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement</em>' containment reference.
	 * @see #setMovement(Movement)
	 * @see unityGameDSL.UnityGameDSLPackage#getGameObject_Movement()
	 * @model containment="true"
	 * @generated
	 */
	Movement getMovement();

	/**
	 * Sets the value of the '{@link unityGameDSL.GameObject#getMovement <em>Movement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement</em>' containment reference.
	 * @see #getMovement()
	 * @generated
	 */
	void setMovement(Movement value);

	/**
	 * Returns the value of the '<em><b>Colision</b></em>' containment reference list.
	 * The list contents are of type {@link unityGameDSL.Colision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colision</em>' containment reference list.
	 * @see unityGameDSL.UnityGameDSLPackage#getGameObject_Colision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Colision> getColision();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link unityGameDSL.Actionkey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see unityGameDSL.UnityGameDSLPackage#getGameObject_Interaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actionkey> getInteraction();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference list.
	 * The list contents are of type {@link unityGameDSL.GameAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference list.
	 * @see unityGameDSL.UnityGameDSLPackage#getGameObject_Start()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameAction> getStart();

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link unityGameDSL.GameAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see unityGameDSL.UnityGameDSLPackage#getGameObject_Update()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameAction> getUpdate();

} // GameObject
