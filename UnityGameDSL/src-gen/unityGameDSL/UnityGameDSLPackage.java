/**
 */
package unityGameDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unityGameDSL.UnityGameDSLFactory
 * @model kind="package"
 * @generated
 */
public interface UnityGameDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unityGameDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/unityGameDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unityGameDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnityGameDSLPackage eINSTANCE = unityGameDSL.impl.UnityGameDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.MovementImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 0;

	/**
	 * The feature id for the '<em><b>Aceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__ACELERATION = 0;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__MAX_SPEED = 1;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.SidewaysImpl <em>Sideways</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.SidewaysImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getSideways()
	 * @generated
	 */
	int SIDEWAYS = 1;

	/**
	 * The feature id for the '<em><b>Aceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWAYS__ACELERATION = MOVEMENT__ACELERATION;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWAYS__MAX_SPEED = MOVEMENT__MAX_SPEED;

	/**
	 * The feature id for the '<em><b>Is Jump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWAYS__IS_JUMP = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jump Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWAYS__JUMP_INTENSITY = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sideways</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWAYS_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sideways</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWAYS_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.TopDownImpl <em>Top Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.TopDownImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getTopDown()
	 * @generated
	 */
	int TOP_DOWN = 2;

	/**
	 * The feature id for the '<em><b>Aceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_DOWN__ACELERATION = MOVEMENT__ACELERATION;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_DOWN__MAX_SPEED = MOVEMENT__MAX_SPEED;

	/**
	 * The number of structural features of the '<em>Top Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_DOWN_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_DOWN_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.GameActionImpl <em>Game Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.GameActionImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getGameAction()
	 * @generated
	 */
	int GAME_ACTION = 13;

	/**
	 * The number of structural features of the '<em>Game Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Game Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.ObjectCreationImpl <em>Object Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.ObjectCreationImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getObjectCreation()
	 * @generated
	 */
	int OBJECT_CREATION = 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CREATION__POSITION = GAME_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CREATION_FEATURE_COUNT = GAME_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CREATION_OPERATION_COUNT = GAME_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.ObjectDestructionImpl <em>Object Destruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.ObjectDestructionImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getObjectDestruction()
	 * @generated
	 */
	int OBJECT_DESTRUCTION = 4;

	/**
	 * The number of structural features of the '<em>Object Destruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DESTRUCTION_FEATURE_COUNT = GAME_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Destruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DESTRUCTION_OPERATION_COUNT = GAME_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.ColisionImpl <em>Colision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.ColisionImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getColision()
	 * @generated
	 */
	int COLISION = 5;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLISION__FORM = 0;

	/**
	 * The number of structural features of the '<em>Colision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLISION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Colision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.GUIElementImpl <em>GUI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.GUIElementImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getGUIElement()
	 * @generated
	 */
	int GUI_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Show Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENT__SHOW_DATA = 0;

	/**
	 * The number of structural features of the '<em>GUI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GUI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.TextDisplayImpl <em>Text Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.TextDisplayImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getTextDisplay()
	 * @generated
	 */
	int TEXT_DISPLAY = 7;

	/**
	 * The feature id for the '<em><b>Show Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY__SHOW_DATA = GUI_ELEMENT__SHOW_DATA;

	/**
	 * The feature id for the '<em><b>Standard Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY__STANDARD_TEXT = GUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY_FEATURE_COUNT = GUI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY_OPERATION_COUNT = GUI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.BarDisplayImpl <em>Bar Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.BarDisplayImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getBarDisplay()
	 * @generated
	 */
	int BAR_DISPLAY = 8;

	/**
	 * The feature id for the '<em><b>Show Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_DISPLAY__SHOW_DATA = GUI_ELEMENT__SHOW_DATA;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_DISPLAY__MAX_VALUE = GUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bar Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_DISPLAY_FEATURE_COUNT = GUI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bar Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_DISPLAY_OPERATION_COUNT = GUI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.ApplyForceImpl <em>Apply Force</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.ApplyForceImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getApplyForce()
	 * @generated
	 */
	int APPLY_FORCE = 9;

	/**
	 * The feature id for the '<em><b>Is Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FORCE__IS_INSTANT = GAME_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FORCE__INTENSITY = GAME_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FORCE__DIRECTION = GAME_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Apply Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FORCE_FEATURE_COUNT = GAME_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Apply Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FORCE_OPERATION_COUNT = GAME_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.TriggerImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__FORM = COLISION__FORM;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EXECUTE = COLISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collision TAg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__COLLISION_TAG = COLISION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = COLISION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = COLISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.RigidBodyImpl <em>Rigid Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.RigidBodyImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getRigidBody()
	 * @generated
	 */
	int RIGID_BODY = 11;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY__FORM = COLISION__FORM;

	/**
	 * The number of structural features of the '<em>Rigid Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_FEATURE_COUNT = COLISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rigid Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_OPERATION_COUNT = COLISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.DataImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getData()
	 * @generated
	 */
	int DATA = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.DataChangeImpl <em>Data Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.DataChangeImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getDataChange()
	 * @generated
	 */
	int DATA_CHANGE = 14;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CHANGE__MODIFIED = GAME_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CHANGE__VALUE = GAME_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CHANGE__TYPE = GAME_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CHANGE_FEATURE_COUNT = GAME_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CHANGE_OPERATION_COUNT = GAME_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.AddImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 15;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__MODIFIED = DATA_CHANGE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__VALUE = DATA_CHANGE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TYPE = DATA_CHANGE__TYPE;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = DATA_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = DATA_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.SubtractImpl <em>Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.SubtractImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getSubtract()
	 * @generated
	 */
	int SUBTRACT = 16;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__MODIFIED = DATA_CHANGE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__VALUE = DATA_CHANGE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__TYPE = DATA_CHANGE__TYPE;

	/**
	 * The number of structural features of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_FEATURE_COUNT = DATA_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_OPERATION_COUNT = DATA_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.SetImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getSet()
	 * @generated
	 */
	int SET = 17;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__MODIFIED = DATA_CHANGE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VALUE = DATA_CHANGE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__TYPE = DATA_CHANGE__TYPE;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = DATA_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = DATA_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.ActionkeyImpl <em>Actionkey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.ActionkeyImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getActionkey()
	 * @generated
	 */
	int ACTIONKEY = 18;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONKEY__EXECUTE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONKEY__KEY = 1;

	/**
	 * The feature id for the '<em><b>Press Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONKEY__PRESS_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Actionkey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONKEY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actionkey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONKEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.impl.GameObjectImpl <em>Game Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.impl.GameObjectImpl
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getGameObject()
	 * @generated
	 */
	int GAME_OBJECT = 19;

	/**
	 * The feature id for the '<em><b>Movement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT__MOVEMENT = 0;

	/**
	 * The feature id for the '<em><b>Colision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT__COLISION = 1;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT__INTERACTION = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT__START = 3;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT__UPDATE = 4;

	/**
	 * The number of structural features of the '<em>Game Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Game Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unityGameDSL.ColisionTypes <em>Colision Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.ColisionTypes
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getColisionTypes()
	 * @generated
	 */
	int COLISION_TYPES = 20;

	/**
	 * The meta object id for the '{@link unityGameDSL.DataTypes <em>Data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.DataTypes
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getDataTypes()
	 * @generated
	 */
	int DATA_TYPES = 21;

	/**
	 * The meta object id for the '{@link unityGameDSL.KeyType <em>Key Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unityGameDSL.KeyType
	 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 22;

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see unityGameDSL.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Movement#getAceleration <em>Aceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aceleration</em>'.
	 * @see unityGameDSL.Movement#getAceleration()
	 * @see #getMovement()
	 * @generated
	 */
	EAttribute getMovement_Aceleration();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Movement#getMaxSpeed <em>Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Speed</em>'.
	 * @see unityGameDSL.Movement#getMaxSpeed()
	 * @see #getMovement()
	 * @generated
	 */
	EAttribute getMovement_MaxSpeed();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Sideways <em>Sideways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sideways</em>'.
	 * @see unityGameDSL.Sideways
	 * @generated
	 */
	EClass getSideways();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Sideways#isIsJump <em>Is Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Jump</em>'.
	 * @see unityGameDSL.Sideways#isIsJump()
	 * @see #getSideways()
	 * @generated
	 */
	EAttribute getSideways_IsJump();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Sideways#getJumpIntensity <em>Jump Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump Intensity</em>'.
	 * @see unityGameDSL.Sideways#getJumpIntensity()
	 * @see #getSideways()
	 * @generated
	 */
	EAttribute getSideways_JumpIntensity();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.TopDown <em>Top Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Down</em>'.
	 * @see unityGameDSL.TopDown
	 * @generated
	 */
	EClass getTopDown();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.ObjectCreation <em>Object Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Creation</em>'.
	 * @see unityGameDSL.ObjectCreation
	 * @generated
	 */
	EClass getObjectCreation();

	/**
	 * Returns the meta object for the attribute list '{@link unityGameDSL.ObjectCreation#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see unityGameDSL.ObjectCreation#getPosition()
	 * @see #getObjectCreation()
	 * @generated
	 */
	EAttribute getObjectCreation_Position();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.ObjectDestruction <em>Object Destruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Destruction</em>'.
	 * @see unityGameDSL.ObjectDestruction
	 * @generated
	 */
	EClass getObjectDestruction();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Colision <em>Colision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colision</em>'.
	 * @see unityGameDSL.Colision
	 * @generated
	 */
	EClass getColision();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Colision#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see unityGameDSL.Colision#getForm()
	 * @see #getColision()
	 * @generated
	 */
	EAttribute getColision_Form();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.GUIElement <em>GUI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Element</em>'.
	 * @see unityGameDSL.GUIElement
	 * @generated
	 */
	EClass getGUIElement();

	/**
	 * Returns the meta object for the containment reference '{@link unityGameDSL.GUIElement#getShowData <em>Show Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Show Data</em>'.
	 * @see unityGameDSL.GUIElement#getShowData()
	 * @see #getGUIElement()
	 * @generated
	 */
	EReference getGUIElement_ShowData();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.TextDisplay <em>Text Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Display</em>'.
	 * @see unityGameDSL.TextDisplay
	 * @generated
	 */
	EClass getTextDisplay();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.TextDisplay#getStandardText <em>Standard Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Text</em>'.
	 * @see unityGameDSL.TextDisplay#getStandardText()
	 * @see #getTextDisplay()
	 * @generated
	 */
	EAttribute getTextDisplay_StandardText();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.BarDisplay <em>Bar Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Display</em>'.
	 * @see unityGameDSL.BarDisplay
	 * @generated
	 */
	EClass getBarDisplay();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.BarDisplay#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see unityGameDSL.BarDisplay#getMaxValue()
	 * @see #getBarDisplay()
	 * @generated
	 */
	EAttribute getBarDisplay_MaxValue();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.ApplyForce <em>Apply Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Force</em>'.
	 * @see unityGameDSL.ApplyForce
	 * @generated
	 */
	EClass getApplyForce();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.ApplyForce#isIsInstant <em>Is Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Instant</em>'.
	 * @see unityGameDSL.ApplyForce#isIsInstant()
	 * @see #getApplyForce()
	 * @generated
	 */
	EAttribute getApplyForce_IsInstant();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.ApplyForce#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see unityGameDSL.ApplyForce#getIntensity()
	 * @see #getApplyForce()
	 * @generated
	 */
	EAttribute getApplyForce_Intensity();

	/**
	 * Returns the meta object for the attribute list '{@link unityGameDSL.ApplyForce#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Direction</em>'.
	 * @see unityGameDSL.ApplyForce#getDirection()
	 * @see #getApplyForce()
	 * @generated
	 */
	EAttribute getApplyForce_Direction();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see unityGameDSL.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link unityGameDSL.Trigger#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execute</em>'.
	 * @see unityGameDSL.Trigger#getExecute()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Execute();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Trigger#getCollisionTAg <em>Collision TAg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collision TAg</em>'.
	 * @see unityGameDSL.Trigger#getCollisionTAg()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_CollisionTAg();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.RigidBody <em>Rigid Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Body</em>'.
	 * @see unityGameDSL.RigidBody
	 * @generated
	 */
	EClass getRigidBody();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see unityGameDSL.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see unityGameDSL.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Type();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unityGameDSL.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.GameAction <em>Game Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Action</em>'.
	 * @see unityGameDSL.GameAction
	 * @generated
	 */
	EClass getGameAction();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.DataChange <em>Data Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Change</em>'.
	 * @see unityGameDSL.DataChange
	 * @generated
	 */
	EClass getDataChange();

	/**
	 * Returns the meta object for the containment reference '{@link unityGameDSL.DataChange#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see unityGameDSL.DataChange#getModified()
	 * @see #getDataChange()
	 * @generated
	 */
	EReference getDataChange_Modified();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.DataChange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see unityGameDSL.DataChange#getValue()
	 * @see #getDataChange()
	 * @generated
	 */
	EAttribute getDataChange_Value();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.DataChange#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see unityGameDSL.DataChange#getType()
	 * @see #getDataChange()
	 * @generated
	 */
	EAttribute getDataChange_Type();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see unityGameDSL.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtract</em>'.
	 * @see unityGameDSL.Subtract
	 * @generated
	 */
	EClass getSubtract();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see unityGameDSL.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.Actionkey <em>Actionkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actionkey</em>'.
	 * @see unityGameDSL.Actionkey
	 * @generated
	 */
	EClass getActionkey();

	/**
	 * Returns the meta object for the containment reference list '{@link unityGameDSL.Actionkey#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execute</em>'.
	 * @see unityGameDSL.Actionkey#getExecute()
	 * @see #getActionkey()
	 * @generated
	 */
	EReference getActionkey_Execute();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Actionkey#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see unityGameDSL.Actionkey#getKey()
	 * @see #getActionkey()
	 * @generated
	 */
	EAttribute getActionkey_Key();

	/**
	 * Returns the meta object for the attribute '{@link unityGameDSL.Actionkey#getPressType <em>Press Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Press Type</em>'.
	 * @see unityGameDSL.Actionkey#getPressType()
	 * @see #getActionkey()
	 * @generated
	 */
	EAttribute getActionkey_PressType();

	/**
	 * Returns the meta object for class '{@link unityGameDSL.GameObject <em>Game Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Object</em>'.
	 * @see unityGameDSL.GameObject
	 * @generated
	 */
	EClass getGameObject();

	/**
	 * Returns the meta object for the containment reference '{@link unityGameDSL.GameObject#getMovement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Movement</em>'.
	 * @see unityGameDSL.GameObject#getMovement()
	 * @see #getGameObject()
	 * @generated
	 */
	EReference getGameObject_Movement();

	/**
	 * Returns the meta object for the containment reference list '{@link unityGameDSL.GameObject#getColision <em>Colision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colision</em>'.
	 * @see unityGameDSL.GameObject#getColision()
	 * @see #getGameObject()
	 * @generated
	 */
	EReference getGameObject_Colision();

	/**
	 * Returns the meta object for the containment reference list '{@link unityGameDSL.GameObject#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction</em>'.
	 * @see unityGameDSL.GameObject#getInteraction()
	 * @see #getGameObject()
	 * @generated
	 */
	EReference getGameObject_Interaction();

	/**
	 * Returns the meta object for the containment reference list '{@link unityGameDSL.GameObject#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start</em>'.
	 * @see unityGameDSL.GameObject#getStart()
	 * @see #getGameObject()
	 * @generated
	 */
	EReference getGameObject_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link unityGameDSL.GameObject#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update</em>'.
	 * @see unityGameDSL.GameObject#getUpdate()
	 * @see #getGameObject()
	 * @generated
	 */
	EReference getGameObject_Update();

	/**
	 * Returns the meta object for enum '{@link unityGameDSL.ColisionTypes <em>Colision Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colision Types</em>'.
	 * @see unityGameDSL.ColisionTypes
	 * @generated
	 */
	EEnum getColisionTypes();

	/**
	 * Returns the meta object for enum '{@link unityGameDSL.DataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Types</em>'.
	 * @see unityGameDSL.DataTypes
	 * @generated
	 */
	EEnum getDataTypes();

	/**
	 * Returns the meta object for enum '{@link unityGameDSL.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Type</em>'.
	 * @see unityGameDSL.KeyType
	 * @generated
	 */
	EEnum getKeyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnityGameDSLFactory getUnityGameDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.MovementImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '<em><b>Aceleration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEMENT__ACELERATION = eINSTANCE.getMovement_Aceleration();

		/**
		 * The meta object literal for the '<em><b>Max Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEMENT__MAX_SPEED = eINSTANCE.getMovement_MaxSpeed();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.SidewaysImpl <em>Sideways</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.SidewaysImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getSideways()
		 * @generated
		 */
		EClass SIDEWAYS = eINSTANCE.getSideways();

		/**
		 * The meta object literal for the '<em><b>Is Jump</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIDEWAYS__IS_JUMP = eINSTANCE.getSideways_IsJump();

		/**
		 * The meta object literal for the '<em><b>Jump Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIDEWAYS__JUMP_INTENSITY = eINSTANCE.getSideways_JumpIntensity();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.TopDownImpl <em>Top Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.TopDownImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getTopDown()
		 * @generated
		 */
		EClass TOP_DOWN = eINSTANCE.getTopDown();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.ObjectCreationImpl <em>Object Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.ObjectCreationImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getObjectCreation()
		 * @generated
		 */
		EClass OBJECT_CREATION = eINSTANCE.getObjectCreation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_CREATION__POSITION = eINSTANCE.getObjectCreation_Position();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.ObjectDestructionImpl <em>Object Destruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.ObjectDestructionImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getObjectDestruction()
		 * @generated
		 */
		EClass OBJECT_DESTRUCTION = eINSTANCE.getObjectDestruction();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.ColisionImpl <em>Colision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.ColisionImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getColision()
		 * @generated
		 */
		EClass COLISION = eINSTANCE.getColision();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLISION__FORM = eINSTANCE.getColision_Form();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.GUIElementImpl <em>GUI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.GUIElementImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getGUIElement()
		 * @generated
		 */
		EClass GUI_ELEMENT = eINSTANCE.getGUIElement();

		/**
		 * The meta object literal for the '<em><b>Show Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_ELEMENT__SHOW_DATA = eINSTANCE.getGUIElement_ShowData();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.TextDisplayImpl <em>Text Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.TextDisplayImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getTextDisplay()
		 * @generated
		 */
		EClass TEXT_DISPLAY = eINSTANCE.getTextDisplay();

		/**
		 * The meta object literal for the '<em><b>Standard Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_DISPLAY__STANDARD_TEXT = eINSTANCE.getTextDisplay_StandardText();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.BarDisplayImpl <em>Bar Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.BarDisplayImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getBarDisplay()
		 * @generated
		 */
		EClass BAR_DISPLAY = eINSTANCE.getBarDisplay();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR_DISPLAY__MAX_VALUE = eINSTANCE.getBarDisplay_MaxValue();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.ApplyForceImpl <em>Apply Force</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.ApplyForceImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getApplyForce()
		 * @generated
		 */
		EClass APPLY_FORCE = eINSTANCE.getApplyForce();

		/**
		 * The meta object literal for the '<em><b>Is Instant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_FORCE__IS_INSTANT = eINSTANCE.getApplyForce_IsInstant();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_FORCE__INTENSITY = eINSTANCE.getApplyForce_Intensity();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_FORCE__DIRECTION = eINSTANCE.getApplyForce_Direction();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.TriggerImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EXECUTE = eINSTANCE.getTrigger_Execute();

		/**
		 * The meta object literal for the '<em><b>Collision TAg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__COLLISION_TAG = eINSTANCE.getTrigger_CollisionTAg();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.RigidBodyImpl <em>Rigid Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.RigidBodyImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getRigidBody()
		 * @generated
		 */
		EClass RIGID_BODY = eINSTANCE.getRigidBody();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.DataImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.GameActionImpl <em>Game Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.GameActionImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getGameAction()
		 * @generated
		 */
		EClass GAME_ACTION = eINSTANCE.getGameAction();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.DataChangeImpl <em>Data Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.DataChangeImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getDataChange()
		 * @generated
		 */
		EClass DATA_CHANGE = eINSTANCE.getDataChange();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CHANGE__MODIFIED = eINSTANCE.getDataChange_Modified();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CHANGE__VALUE = eINSTANCE.getDataChange_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CHANGE__TYPE = eINSTANCE.getDataChange_Type();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.AddImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.SubtractImpl <em>Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.SubtractImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getSubtract()
		 * @generated
		 */
		EClass SUBTRACT = eINSTANCE.getSubtract();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.SetImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.ActionkeyImpl <em>Actionkey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.ActionkeyImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getActionkey()
		 * @generated
		 */
		EClass ACTIONKEY = eINSTANCE.getActionkey();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONKEY__EXECUTE = eINSTANCE.getActionkey_Execute();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONKEY__KEY = eINSTANCE.getActionkey_Key();

		/**
		 * The meta object literal for the '<em><b>Press Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONKEY__PRESS_TYPE = eINSTANCE.getActionkey_PressType();

		/**
		 * The meta object literal for the '{@link unityGameDSL.impl.GameObjectImpl <em>Game Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.impl.GameObjectImpl
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getGameObject()
		 * @generated
		 */
		EClass GAME_OBJECT = eINSTANCE.getGameObject();

		/**
		 * The meta object literal for the '<em><b>Movement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_OBJECT__MOVEMENT = eINSTANCE.getGameObject_Movement();

		/**
		 * The meta object literal for the '<em><b>Colision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_OBJECT__COLISION = eINSTANCE.getGameObject_Colision();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_OBJECT__INTERACTION = eINSTANCE.getGameObject_Interaction();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_OBJECT__START = eINSTANCE.getGameObject_Start();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_OBJECT__UPDATE = eINSTANCE.getGameObject_Update();

		/**
		 * The meta object literal for the '{@link unityGameDSL.ColisionTypes <em>Colision Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.ColisionTypes
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getColisionTypes()
		 * @generated
		 */
		EEnum COLISION_TYPES = eINSTANCE.getColisionTypes();

		/**
		 * The meta object literal for the '{@link unityGameDSL.DataTypes <em>Data Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.DataTypes
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getDataTypes()
		 * @generated
		 */
		EEnum DATA_TYPES = eINSTANCE.getDataTypes();

		/**
		 * The meta object literal for the '{@link unityGameDSL.KeyType <em>Key Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unityGameDSL.KeyType
		 * @see unityGameDSL.impl.UnityGameDSLPackageImpl#getKeyType()
		 * @generated
		 */
		EEnum KEY_TYPE = eINSTANCE.getKeyType();

	}

} //UnityGameDSLPackage
