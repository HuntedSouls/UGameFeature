/**
 */
package unityGameDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.ApplyForce#isIsInstant <em>Is Instant</em>}</li>
 *   <li>{@link unityGameDSL.ApplyForce#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link unityGameDSL.ApplyForce#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getApplyForce()
 * @model
 * @generated
 */
public interface ApplyForce extends GameAction {
	/**
	 * Returns the value of the '<em><b>Is Instant</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instant</em>' attribute.
	 * @see #setIsInstant(boolean)
	 * @see unityGameDSL.UnityGameDSLPackage#getApplyForce_IsInstant()
	 * @model default="True"
	 * @generated
	 */
	boolean isIsInstant();

	/**
	 * Sets the value of the '{@link unityGameDSL.ApplyForce#isIsInstant <em>Is Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instant</em>' attribute.
	 * @see #isIsInstant()
	 * @generated
	 */
	void setIsInstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' attribute.
	 * @see #setIntensity(float)
	 * @see unityGameDSL.UnityGameDSLPackage#getApplyForce_Intensity()
	 * @model
	 * @generated
	 */
	float getIntensity();

	/**
	 * Sets the value of the '{@link unityGameDSL.ApplyForce#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' attribute.
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(float value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute list.
	 * @see unityGameDSL.UnityGameDSLPackage#getApplyForce_Direction()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Integer> getDirection();

} // ApplyForce
