/**
 */
package unityGameDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sideways</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.Sideways#isIsJump <em>Is Jump</em>}</li>
 *   <li>{@link unityGameDSL.Sideways#getJumpIntensity <em>Jump Intensity</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getSideways()
 * @model
 * @generated
 */
public interface Sideways extends Movement {
	/**
	 * Returns the value of the '<em><b>Is Jump</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Jump</em>' attribute.
	 * @see #setIsJump(boolean)
	 * @see unityGameDSL.UnityGameDSLPackage#getSideways_IsJump()
	 * @model default="True"
	 * @generated
	 */
	boolean isIsJump();

	/**
	 * Sets the value of the '{@link unityGameDSL.Sideways#isIsJump <em>Is Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Jump</em>' attribute.
	 * @see #isIsJump()
	 * @generated
	 */
	void setIsJump(boolean value);

	/**
	 * Returns the value of the '<em><b>Jump Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump Intensity</em>' attribute.
	 * @see #setJumpIntensity(int)
	 * @see unityGameDSL.UnityGameDSLPackage#getSideways_JumpIntensity()
	 * @model
	 * @generated
	 */
	int getJumpIntensity();

	/**
	 * Sets the value of the '{@link unityGameDSL.Sideways#getJumpIntensity <em>Jump Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump Intensity</em>' attribute.
	 * @see #getJumpIntensity()
	 * @generated
	 */
	void setJumpIntensity(int value);

} // Sideways
