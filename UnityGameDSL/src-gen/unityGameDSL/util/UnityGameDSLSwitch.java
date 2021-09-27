/**
 */
package unityGameDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import unityGameDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see unityGameDSL.UnityGameDSLPackage
 * @generated
 */
public class UnityGameDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnityGameDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnityGameDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = UnityGameDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UnityGameDSLPackage.MOVEMENT: {
			Movement movement = (Movement) theEObject;
			T result = caseMovement(movement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.SIDEWAYS: {
			Sideways sideways = (Sideways) theEObject;
			T result = caseSideways(sideways);
			if (result == null)
				result = caseMovement(sideways);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.TOP_DOWN: {
			TopDown topDown = (TopDown) theEObject;
			T result = caseTopDown(topDown);
			if (result == null)
				result = caseMovement(topDown);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.OBJECT_CREATION: {
			ObjectCreation objectCreation = (ObjectCreation) theEObject;
			T result = caseObjectCreation(objectCreation);
			if (result == null)
				result = caseGameAction(objectCreation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.OBJECT_DESTRUCTION: {
			ObjectDestruction objectDestruction = (ObjectDestruction) theEObject;
			T result = caseObjectDestruction(objectDestruction);
			if (result == null)
				result = caseGameAction(objectDestruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.COLISION: {
			Colision colision = (Colision) theEObject;
			T result = caseColision(colision);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.GUI_ELEMENT: {
			GUIElement guiElement = (GUIElement) theEObject;
			T result = caseGUIElement(guiElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.TEXT_DISPLAY: {
			TextDisplay textDisplay = (TextDisplay) theEObject;
			T result = caseTextDisplay(textDisplay);
			if (result == null)
				result = caseGUIElement(textDisplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.BAR_DISPLAY: {
			BarDisplay barDisplay = (BarDisplay) theEObject;
			T result = caseBarDisplay(barDisplay);
			if (result == null)
				result = caseGUIElement(barDisplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.APPLY_FORCE: {
			ApplyForce applyForce = (ApplyForce) theEObject;
			T result = caseApplyForce(applyForce);
			if (result == null)
				result = caseGameAction(applyForce);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.TRIGGER: {
			Trigger trigger = (Trigger) theEObject;
			T result = caseTrigger(trigger);
			if (result == null)
				result = caseColision(trigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.RIGID_BODY: {
			RigidBody rigidBody = (RigidBody) theEObject;
			T result = caseRigidBody(rigidBody);
			if (result == null)
				result = caseColision(rigidBody);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.GAME_ACTION: {
			GameAction gameAction = (GameAction) theEObject;
			T result = caseGameAction(gameAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.DATA_CHANGE: {
			DataChange dataChange = (DataChange) theEObject;
			T result = caseDataChange(dataChange);
			if (result == null)
				result = caseGameAction(dataChange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.ADD: {
			Add add = (Add) theEObject;
			T result = caseAdd(add);
			if (result == null)
				result = caseDataChange(add);
			if (result == null)
				result = caseGameAction(add);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.SUBTRACT: {
			Subtract subtract = (Subtract) theEObject;
			T result = caseSubtract(subtract);
			if (result == null)
				result = caseDataChange(subtract);
			if (result == null)
				result = caseGameAction(subtract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.SET: {
			Set set = (Set) theEObject;
			T result = caseSet(set);
			if (result == null)
				result = caseDataChange(set);
			if (result == null)
				result = caseGameAction(set);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.ACTIONKEY: {
			Actionkey actionkey = (Actionkey) theEObject;
			T result = caseActionkey(actionkey);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UnityGameDSLPackage.GAME_OBJECT: {
			GameObject gameObject = (GameObject) theEObject;
			T result = caseGameObject(gameObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovement(Movement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sideways</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sideways</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSideways(Sideways object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopDown(TopDown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectCreation(ObjectCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Destruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Destruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectDestruction(ObjectDestruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColision(Colision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIElement(GUIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDisplay(TextDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarDisplay(BarDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Force</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Force</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyForce(ApplyForce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rigid Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rigid Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRigidBody(RigidBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameAction(GameAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataChange(DataChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtract(Subtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actionkey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actionkey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionkey(Actionkey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameObject(GameObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UnityGameDSLSwitch
