/**
 */
package unityGameDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.GUIElement#getShowData <em>Show Data</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getGUIElement()
 * @model abstract="true"
 * @generated
 */
public interface GUIElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Show Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Data</em>' containment reference.
	 * @see #setShowData(Data)
	 * @see unityGameDSL.UnityGameDSLPackage#getGUIElement_ShowData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getShowData();

	/**
	 * Sets the value of the '{@link unityGameDSL.GUIElement#getShowData <em>Show Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Data</em>' containment reference.
	 * @see #getShowData()
	 * @generated
	 */
	void setShowData(Data value);

} // GUIElement
