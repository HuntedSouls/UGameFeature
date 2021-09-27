/**
 */
package unityGameDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.DataChange#getModified <em>Modified</em>}</li>
 *   <li>{@link unityGameDSL.DataChange#getValue <em>Value</em>}</li>
 *   <li>{@link unityGameDSL.DataChange#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getDataChange()
 * @model abstract="true"
 * @generated
 */
public interface DataChange extends GameAction {
	/**
	 * Returns the value of the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' containment reference.
	 * @see #setModified(Data)
	 * @see unityGameDSL.UnityGameDSLPackage#getDataChange_Modified()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getModified();

	/**
	 * Sets the value of the '{@link unityGameDSL.DataChange#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Data value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see unityGameDSL.UnityGameDSLPackage#getDataChange_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link unityGameDSL.DataChange#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link unityGameDSL.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see unityGameDSL.DataTypes
	 * @see #setType(DataTypes)
	 * @see unityGameDSL.UnityGameDSLPackage#getDataChange_Type()
	 * @model
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link unityGameDSL.DataChange#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see unityGameDSL.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

} // DataChange
