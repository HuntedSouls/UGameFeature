/**
 */
package unityGameDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.ObjectCreation#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see unityGameDSL.UnityGameDSLPackage#getObjectCreation()
 * @model
 * @generated
 */
public interface ObjectCreation extends GameAction {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute list.
	 * @see unityGameDSL.UnityGameDSLPackage#getObjectCreation_Position()
	 * @model default="0" lower="2" upper="2"
	 * @generated
	 */
	EList<Integer> getPosition();

} // ObjectCreation
