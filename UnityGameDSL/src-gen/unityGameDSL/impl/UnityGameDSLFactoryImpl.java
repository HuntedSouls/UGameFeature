/**
 */
package unityGameDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import unityGameDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnityGameDSLFactoryImpl extends EFactoryImpl implements UnityGameDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnityGameDSLFactory init() {
		try {
			UnityGameDSLFactory theUnityGameDSLFactory = (UnityGameDSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(UnityGameDSLPackage.eNS_URI);
			if (theUnityGameDSLFactory != null) {
				return theUnityGameDSLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnityGameDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnityGameDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UnityGameDSLPackage.SIDEWAYS:
			return createSideways();
		case UnityGameDSLPackage.TOP_DOWN:
			return createTopDown();
		case UnityGameDSLPackage.OBJECT_CREATION:
			return createObjectCreation();
		case UnityGameDSLPackage.OBJECT_DESTRUCTION:
			return createObjectDestruction();
		case UnityGameDSLPackage.TEXT_DISPLAY:
			return createTextDisplay();
		case UnityGameDSLPackage.BAR_DISPLAY:
			return createBarDisplay();
		case UnityGameDSLPackage.APPLY_FORCE:
			return createApplyForce();
		case UnityGameDSLPackage.TRIGGER:
			return createTrigger();
		case UnityGameDSLPackage.RIGID_BODY:
			return createRigidBody();
		case UnityGameDSLPackage.DATA:
			return createData();
		case UnityGameDSLPackage.ADD:
			return createAdd();
		case UnityGameDSLPackage.SUBTRACT:
			return createSubtract();
		case UnityGameDSLPackage.SET:
			return createSet();
		case UnityGameDSLPackage.ACTIONKEY:
			return createActionkey();
		case UnityGameDSLPackage.GAME_OBJECT:
			return createGameObject();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UnityGameDSLPackage.COLISION_TYPES:
			return createColisionTypesFromString(eDataType, initialValue);
		case UnityGameDSLPackage.DATA_TYPES:
			return createDataTypesFromString(eDataType, initialValue);
		case UnityGameDSLPackage.KEY_TYPE:
			return createKeyTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UnityGameDSLPackage.COLISION_TYPES:
			return convertColisionTypesToString(eDataType, instanceValue);
		case UnityGameDSLPackage.DATA_TYPES:
			return convertDataTypesToString(eDataType, instanceValue);
		case UnityGameDSLPackage.KEY_TYPE:
			return convertKeyTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sideways createSideways() {
		SidewaysImpl sideways = new SidewaysImpl();
		return sideways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopDown createTopDown() {
		TopDownImpl topDown = new TopDownImpl();
		return topDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCreation createObjectCreation() {
		ObjectCreationImpl objectCreation = new ObjectCreationImpl();
		return objectCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDestruction createObjectDestruction() {
		ObjectDestructionImpl objectDestruction = new ObjectDestructionImpl();
		return objectDestruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDisplay createTextDisplay() {
		TextDisplayImpl textDisplay = new TextDisplayImpl();
		return textDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarDisplay createBarDisplay() {
		BarDisplayImpl barDisplay = new BarDisplayImpl();
		return barDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyForce createApplyForce() {
		ApplyForceImpl applyForce = new ApplyForceImpl();
		return applyForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidBody createRigidBody() {
		RigidBodyImpl rigidBody = new RigidBodyImpl();
		return rigidBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtract createSubtract() {
		SubtractImpl subtract = new SubtractImpl();
		return subtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actionkey createActionkey() {
		ActionkeyImpl actionkey = new ActionkeyImpl();
		return actionkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameObject createGameObject() {
		GameObjectImpl gameObject = new GameObjectImpl();
		return gameObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColisionTypes createColisionTypesFromString(EDataType eDataType, String initialValue) {
		ColisionTypes result = ColisionTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColisionTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes createDataTypesFromString(EDataType eDataType, String initialValue) {
		DataTypes result = DataTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType createKeyTypeFromString(EDataType eDataType, String initialValue) {
		KeyType result = KeyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnityGameDSLPackage getUnityGameDSLPackage() {
		return (UnityGameDSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnityGameDSLPackage getPackage() {
		return UnityGameDSLPackage.eINSTANCE;
	}

} //UnityGameDSLFactoryImpl
