/**
 */
package unityGameDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.Trigger#getExecute <em>Execute</em>}</li>
 *   <li>{@link unityGameDSL.Trigger#getCollisionTAg <em>Collision TAg</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends Colision {
	/**
	 * Returns the value of the '<em><b>Execute</b></em>' containment reference list.
	 * The list contents are of type {@link unityGameDSL.GameAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' containment reference list.
	 * @see unityGameDSL.UnityGameDSLPackage#getTrigger_Execute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GameAction> getExecute();

	/**
	 * Returns the value of the '<em><b>Collision TAg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collision TAg</em>' attribute.
	 * @see #setCollisionTAg(String)
	 * @see unityGameDSL.UnityGameDSLPackage#getTrigger_CollisionTAg()
	 * @model
	 * @generated
	 */
	String getCollisionTAg();

	/**
	 * Sets the value of the '{@link unityGameDSL.Trigger#getCollisionTAg <em>Collision TAg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collision TAg</em>' attribute.
	 * @see #getCollisionTAg()
	 * @generated
	 */
	void setCollisionTAg(String value);

} // Trigger
