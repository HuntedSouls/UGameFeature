/**
 */
package unityGameDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.BarDisplay#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getBarDisplay()
 * @model
 * @generated
 */
public interface BarDisplay extends GUIElement {

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The literals are from the enumeration {@link unityGameDSL.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see unityGameDSL.DataTypes
	 * @see #setMaxValue(DataTypes)
	 * @see unityGameDSL.UnityGameDSLPackage#getBarDisplay_MaxValue()
	 * @model
	 * @generated
	 */
	DataTypes getMaxValue();

	/**
	 * Sets the value of the '{@link unityGameDSL.BarDisplay#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see unityGameDSL.DataTypes
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(DataTypes value);
} // BarDisplay
