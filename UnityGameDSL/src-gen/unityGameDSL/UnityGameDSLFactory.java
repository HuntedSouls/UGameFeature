/**
 */
package unityGameDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see unityGameDSL.UnityGameDSLPackage
 * @generated
 */
public interface UnityGameDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnityGameDSLFactory eINSTANCE = unityGameDSL.impl.UnityGameDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sideways</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sideways</em>'.
	 * @generated
	 */
	Sideways createSideways();

	/**
	 * Returns a new object of class '<em>Top Down</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Down</em>'.
	 * @generated
	 */
	TopDown createTopDown();

	/**
	 * Returns a new object of class '<em>Object Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Creation</em>'.
	 * @generated
	 */
	ObjectCreation createObjectCreation();

	/**
	 * Returns a new object of class '<em>Object Destruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Destruction</em>'.
	 * @generated
	 */
	ObjectDestruction createObjectDestruction();

	/**
	 * Returns a new object of class '<em>Text Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Display</em>'.
	 * @generated
	 */
	TextDisplay createTextDisplay();

	/**
	 * Returns a new object of class '<em>Bar Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar Display</em>'.
	 * @generated
	 */
	BarDisplay createBarDisplay();

	/**
	 * Returns a new object of class '<em>Apply Force</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Force</em>'.
	 * @generated
	 */
	ApplyForce createApplyForce();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Rigid Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rigid Body</em>'.
	 * @generated
	 */
	RigidBody createRigidBody();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtract</em>'.
	 * @generated
	 */
	Subtract createSubtract();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	Set createSet();

	/**
	 * Returns a new object of class '<em>Actionkey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actionkey</em>'.
	 * @generated
	 */
	Actionkey createActionkey();

	/**
	 * Returns a new object of class '<em>Game Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Object</em>'.
	 * @generated
	 */
	GameObject createGameObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnityGameDSLPackage getUnityGameDSLPackage();

} //UnityGameDSLFactory
