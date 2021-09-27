/**
 */
package unityGameDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.Colision#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getColision()
 * @model abstract="true"
 * @generated
 */
public interface Colision extends EObject {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * The literals are from the enumeration {@link unityGameDSL.ColisionTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see unityGameDSL.ColisionTypes
	 * @see #setForm(ColisionTypes)
	 * @see unityGameDSL.UnityGameDSLPackage#getColision_Form()
	 * @model
	 * @generated
	 */
	ColisionTypes getForm();

	/**
	 * Sets the value of the '{@link unityGameDSL.Colision#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see unityGameDSL.ColisionTypes
	 * @see #getForm()
	 * @generated
	 */
	void setForm(ColisionTypes value);

} // Colision
