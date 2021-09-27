/**
 */
package unityGameDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import unityGameDSL.Actionkey;
import unityGameDSL.Add;
import unityGameDSL.ApplyForce;
import unityGameDSL.BarDisplay;
import unityGameDSL.Colision;
import unityGameDSL.ColisionTypes;
import unityGameDSL.Data;
import unityGameDSL.DataChange;
import unityGameDSL.DataTypes;
import unityGameDSL.GUIElement;
import unityGameDSL.GameAction;
import unityGameDSL.GameObject;
import unityGameDSL.KeyType;
import unityGameDSL.Movement;
import unityGameDSL.ObjectCreation;
import unityGameDSL.ObjectDestruction;
import unityGameDSL.RigidBody;
import unityGameDSL.Set;
import unityGameDSL.Sideways;
import unityGameDSL.Subtract;
import unityGameDSL.TextDisplay;
import unityGameDSL.TopDown;
import unityGameDSL.Trigger;
import unityGameDSL.UnityGameDSLFactory;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnityGameDSLPackageImpl extends EPackageImpl implements UnityGameDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sidewaysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topDownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectDestructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyForceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionkeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colisionTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see unityGameDSL.UnityGameDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnityGameDSLPackageImpl() {
		super(eNS_URI, UnityGameDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UnityGameDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnityGameDSLPackage init() {
		if (isInited)
			return (UnityGameDSLPackage) EPackage.Registry.INSTANCE.getEPackage(UnityGameDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUnityGameDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UnityGameDSLPackageImpl theUnityGameDSLPackage = registeredUnityGameDSLPackage instanceof UnityGameDSLPackageImpl
				? (UnityGameDSLPackageImpl) registeredUnityGameDSLPackage
				: new UnityGameDSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUnityGameDSLPackage.createPackageContents();

		// Initialize created meta-data
		theUnityGameDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnityGameDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnityGameDSLPackage.eNS_URI, theUnityGameDSLPackage);
		return theUnityGameDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovement() {
		return movementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovement_Aceleration() {
		return (EAttribute) movementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovement_MaxSpeed() {
		return (EAttribute) movementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSideways() {
		return sidewaysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSideways_IsJump() {
		return (EAttribute) sidewaysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSideways_JumpIntensity() {
		return (EAttribute) sidewaysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopDown() {
		return topDownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectCreation() {
		return objectCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectCreation_Position() {
		return (EAttribute) objectCreationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectDestruction() {
		return objectDestructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColision() {
		return colisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColision_Form() {
		return (EAttribute) colisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIElement() {
		return guiElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIElement_ShowData() {
		return (EReference) guiElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextDisplay() {
		return textDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDisplay_StandardText() {
		return (EAttribute) textDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarDisplay() {
		return barDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarDisplay_MaxValue() {
		return (EAttribute) barDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyForce() {
		return applyForceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyForce_IsInstant() {
		return (EAttribute) applyForceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyForce_Intensity() {
		return (EAttribute) applyForceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyForce_Direction() {
		return (EAttribute) applyForceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Execute() {
		return (EReference) triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_CollisionTAg() {
		return (EAttribute) triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidBody() {
		return rigidBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Type() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Name() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameAction() {
		return gameActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataChange() {
		return dataChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataChange_Modified() {
		return (EReference) dataChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataChange_Value() {
		return (EAttribute) dataChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataChange_Type() {
		return (EAttribute) dataChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtract() {
		return subtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionkey() {
		return actionkeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionkey_Execute() {
		return (EReference) actionkeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionkey_Key() {
		return (EAttribute) actionkeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionkey_PressType() {
		return (EAttribute) actionkeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameObject() {
		return gameObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameObject_Movement() {
		return (EReference) gameObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameObject_Colision() {
		return (EReference) gameObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameObject_Interaction() {
		return (EReference) gameObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameObject_Start() {
		return (EReference) gameObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameObject_Update() {
		return (EReference) gameObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColisionTypes() {
		return colisionTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypes() {
		return dataTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeyType() {
		return keyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnityGameDSLFactory getUnityGameDSLFactory() {
		return (UnityGameDSLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		movementEClass = createEClass(MOVEMENT);
		createEAttribute(movementEClass, MOVEMENT__ACELERATION);
		createEAttribute(movementEClass, MOVEMENT__MAX_SPEED);

		sidewaysEClass = createEClass(SIDEWAYS);
		createEAttribute(sidewaysEClass, SIDEWAYS__IS_JUMP);
		createEAttribute(sidewaysEClass, SIDEWAYS__JUMP_INTENSITY);

		topDownEClass = createEClass(TOP_DOWN);

		objectCreationEClass = createEClass(OBJECT_CREATION);
		createEAttribute(objectCreationEClass, OBJECT_CREATION__POSITION);

		objectDestructionEClass = createEClass(OBJECT_DESTRUCTION);

		colisionEClass = createEClass(COLISION);
		createEAttribute(colisionEClass, COLISION__FORM);

		guiElementEClass = createEClass(GUI_ELEMENT);
		createEReference(guiElementEClass, GUI_ELEMENT__SHOW_DATA);

		textDisplayEClass = createEClass(TEXT_DISPLAY);
		createEAttribute(textDisplayEClass, TEXT_DISPLAY__STANDARD_TEXT);

		barDisplayEClass = createEClass(BAR_DISPLAY);
		createEAttribute(barDisplayEClass, BAR_DISPLAY__MAX_VALUE);

		applyForceEClass = createEClass(APPLY_FORCE);
		createEAttribute(applyForceEClass, APPLY_FORCE__IS_INSTANT);
		createEAttribute(applyForceEClass, APPLY_FORCE__INTENSITY);
		createEAttribute(applyForceEClass, APPLY_FORCE__DIRECTION);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__EXECUTE);
		createEAttribute(triggerEClass, TRIGGER__COLLISION_TAG);

		rigidBodyEClass = createEClass(RIGID_BODY);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__TYPE);
		createEAttribute(dataEClass, DATA__NAME);

		gameActionEClass = createEClass(GAME_ACTION);

		dataChangeEClass = createEClass(DATA_CHANGE);
		createEReference(dataChangeEClass, DATA_CHANGE__MODIFIED);
		createEAttribute(dataChangeEClass, DATA_CHANGE__VALUE);
		createEAttribute(dataChangeEClass, DATA_CHANGE__TYPE);

		addEClass = createEClass(ADD);

		subtractEClass = createEClass(SUBTRACT);

		setEClass = createEClass(SET);

		actionkeyEClass = createEClass(ACTIONKEY);
		createEReference(actionkeyEClass, ACTIONKEY__EXECUTE);
		createEAttribute(actionkeyEClass, ACTIONKEY__KEY);
		createEAttribute(actionkeyEClass, ACTIONKEY__PRESS_TYPE);

		gameObjectEClass = createEClass(GAME_OBJECT);
		createEReference(gameObjectEClass, GAME_OBJECT__MOVEMENT);
		createEReference(gameObjectEClass, GAME_OBJECT__COLISION);
		createEReference(gameObjectEClass, GAME_OBJECT__INTERACTION);
		createEReference(gameObjectEClass, GAME_OBJECT__START);
		createEReference(gameObjectEClass, GAME_OBJECT__UPDATE);

		// Create enums
		colisionTypesEEnum = createEEnum(COLISION_TYPES);
		dataTypesEEnum = createEEnum(DATA_TYPES);
		keyTypeEEnum = createEEnum(KEY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sidewaysEClass.getESuperTypes().add(this.getMovement());
		topDownEClass.getESuperTypes().add(this.getMovement());
		objectCreationEClass.getESuperTypes().add(this.getGameAction());
		objectDestructionEClass.getESuperTypes().add(this.getGameAction());
		textDisplayEClass.getESuperTypes().add(this.getGUIElement());
		barDisplayEClass.getESuperTypes().add(this.getGUIElement());
		applyForceEClass.getESuperTypes().add(this.getGameAction());
		triggerEClass.getESuperTypes().add(this.getColision());
		rigidBodyEClass.getESuperTypes().add(this.getColision());
		dataChangeEClass.getESuperTypes().add(this.getGameAction());
		addEClass.getESuperTypes().add(this.getDataChange());
		subtractEClass.getESuperTypes().add(this.getDataChange());
		setEClass.getESuperTypes().add(this.getDataChange());

		// Initialize classes, features, and operations; add parameters
		initEClass(movementEClass, Movement.class, "Movement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMovement_Aceleration(), ecorePackage.getEInt(), "aceleration", null, 0, 1, Movement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMovement_MaxSpeed(), ecorePackage.getEInt(), "maxSpeed", null, 0, 1, Movement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sidewaysEClass, Sideways.class, "Sideways", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSideways_IsJump(), ecorePackage.getEBoolean(), "isJump", "True", 0, 1, Sideways.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSideways_JumpIntensity(), ecorePackage.getEInt(), "jumpIntensity", null, 0, 1, Sideways.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topDownEClass, TopDown.class, "TopDown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectCreationEClass, ObjectCreation.class, "ObjectCreation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectCreation_Position(), ecorePackage.getEInt(), "position", "0", 2, 2,
				ObjectCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(objectDestructionEClass, ObjectDestruction.class, "ObjectDestruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(colisionEClass, Colision.class, "Colision", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColision_Form(), this.getColisionTypes(), "form", null, 0, 1, Colision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiElementEClass, GUIElement.class, "GUIElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIElement_ShowData(), this.getData(), null, "ShowData", null, 1, 1, GUIElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textDisplayEClass, TextDisplay.class, "TextDisplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextDisplay_StandardText(), ecorePackage.getEString(), "standardText", null, 0, 1,
				TextDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(barDisplayEClass, BarDisplay.class, "BarDisplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBarDisplay_MaxValue(), this.getDataTypes(), "maxValue", null, 0, 1, BarDisplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applyForceEClass, ApplyForce.class, "ApplyForce", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplyForce_IsInstant(), ecorePackage.getEBoolean(), "isInstant", "True", 0, 1,
				ApplyForce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyForce_Intensity(), ecorePackage.getEFloat(), "intensity", null, 0, 1, ApplyForce.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyForce_Direction(), ecorePackage.getEInt(), "direction", null, 2, 2, ApplyForce.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Execute(), this.getGameAction(), null, "Execute", null, 1, -1, Trigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_CollisionTAg(), ecorePackage.getEString(), "collisionTAg", null, 0, 1, Trigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rigidBodyEClass, RigidBody.class, "RigidBody", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Type(), this.getDataTypes(), "type", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Name(), ecorePackage.getEString(), "name", null, 0, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameActionEClass, GameAction.class, "GameAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataChangeEClass, DataChange.class, "DataChange", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataChange_Modified(), this.getData(), null, "Modified", null, 1, 1, DataChange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataChange_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataChange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataChange_Type(), this.getDataTypes(), "type", null, 0, 1, DataChange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractEClass, Subtract.class, "Subtract", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionkeyEClass, Actionkey.class, "Actionkey", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionkey_Execute(), this.getGameAction(), null, "Execute", null, 1, -1, Actionkey.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionkey_Key(), ecorePackage.getEString(), "key", null, 0, 1, Actionkey.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionkey_PressType(), this.getKeyType(), "pressType", null, 0, 1, Actionkey.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameObjectEClass, GameObject.class, "GameObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameObject_Movement(), this.getMovement(), null, "movement", null, 0, 1, GameObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameObject_Colision(), this.getColision(), null, "colision", null, 0, -1, GameObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameObject_Interaction(), this.getActionkey(), null, "interaction", null, 0, -1,
				GameObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameObject_Start(), this.getGameAction(), null, "Start", null, 0, -1, GameObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameObject_Update(), this.getGameAction(), null, "update", null, 0, -1, GameObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colisionTypesEEnum, ColisionTypes.class, "ColisionTypes");
		addEEnumLiteral(colisionTypesEEnum, ColisionTypes.SQUARE);
		addEEnumLiteral(colisionTypesEEnum, ColisionTypes.CIRCLE);
		addEEnumLiteral(colisionTypesEEnum, ColisionTypes.POLIGONAL);

		initEEnum(dataTypesEEnum, DataTypes.class, "DataTypes");
		addEEnumLiteral(dataTypesEEnum, DataTypes.INTEGER);
		addEEnumLiteral(dataTypesEEnum, DataTypes.DECIMAL);
		addEEnumLiteral(dataTypesEEnum, DataTypes.TEXT);

		initEEnum(keyTypeEEnum, KeyType.class, "KeyType");
		addEEnumLiteral(keyTypeEEnum, KeyType.INSTANT);
		addEEnumLiteral(keyTypeEEnum, KeyType.REPEATED);

		// Create resource
		createResource(eNS_URI);
	}

} //UnityGameDSLPackageImpl
