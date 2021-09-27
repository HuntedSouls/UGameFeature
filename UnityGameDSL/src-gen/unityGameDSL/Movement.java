/**
 */
package unityGameDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.Movement#getAceleration <em>Aceleration</em>}</li>
 *   <li>{@link unityGameDSL.Movement#getMaxSpeed <em>Max Speed</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getMovement()
 * @model abstract="true"
 * @generated
 */
public interface Movement extends EObject {
	/**
	 * Returns the value of the '<em><b>Aceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aceleration</em>' attribute.
	 * @see #setAceleration(int)
	 * @see unityGameDSL.UnityGameDSLPackage#getMovement_Aceleration()
	 * @model
	 * @generated
	 */
	int getAceleration();

	/**
	 * Sets the value of the '{@link unityGameDSL.Movement#getAceleration <em>Aceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aceleration</em>' attribute.
	 * @see #getAceleration()
	 * @generated
	 */
	void setAceleration(int value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(int)
	 * @see unityGameDSL.UnityGameDSLPackage#getMovement_MaxSpeed()
	 * @model
	 * @generated
	 */
	int getMaxSpeed();

	/**
	 * Sets the value of the '{@link unityGameDSL.Movement#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(int value);

} // Movement
