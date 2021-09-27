/**
 */
package unityGameDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import unityGameDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see unityGameDSL.UnityGameDSLPackage
 * @generated
 */
public class UnityGameDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnityGameDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnityGameDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UnityGameDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnityGameDSLSwitch<Adapter> modelSwitch = new UnityGameDSLSwitch<Adapter>() {
		@Override
		public Adapter caseMovement(Movement object) {
			return createMovementAdapter();
		}

		@Override
		public Adapter caseSideways(Sideways object) {
			return createSidewaysAdapter();
		}

		@Override
		public Adapter caseTopDown(TopDown object) {
			return createTopDownAdapter();
		}

		@Override
		public Adapter caseObjectCreation(ObjectCreation object) {
			return createObjectCreationAdapter();
		}

		@Override
		public Adapter caseObjectDestruction(ObjectDestruction object) {
			return createObjectDestructionAdapter();
		}

		@Override
		public Adapter caseColision(Colision object) {
			return createColisionAdapter();
		}

		@Override
		public Adapter caseGUIElement(GUIElement object) {
			return createGUIElementAdapter();
		}

		@Override
		public Adapter caseTextDisplay(TextDisplay object) {
			return createTextDisplayAdapter();
		}

		@Override
		public Adapter caseBarDisplay(BarDisplay object) {
			return createBarDisplayAdapter();
		}

		@Override
		public Adapter caseApplyForce(ApplyForce object) {
			return createApplyForceAdapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseRigidBody(RigidBody object) {
			return createRigidBodyAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseGameAction(GameAction object) {
			return createGameActionAdapter();
		}

		@Override
		public Adapter caseDataChange(DataChange object) {
			return createDataChangeAdapter();
		}

		@Override
		public Adapter caseAdd(Add object) {
			return createAddAdapter();
		}

		@Override
		public Adapter caseSubtract(Subtract object) {
			return createSubtractAdapter();
		}

		@Override
		public Adapter caseSet(Set object) {
			return createSetAdapter();
		}

		@Override
		public Adapter caseActionkey(Actionkey object) {
			return createActionkeyAdapter();
		}

		@Override
		public Adapter caseGameObject(GameObject object) {
			return createGameObjectAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Movement
	 * @generated
	 */
	public Adapter createMovementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Sideways <em>Sideways</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Sideways
	 * @generated
	 */
	public Adapter createSidewaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.TopDown <em>Top Down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.TopDown
	 * @generated
	 */
	public Adapter createTopDownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.ObjectCreation <em>Object Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.ObjectCreation
	 * @generated
	 */
	public Adapter createObjectCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.ObjectDestruction <em>Object Destruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.ObjectDestruction
	 * @generated
	 */
	public Adapter createObjectDestructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Colision <em>Colision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Colision
	 * @generated
	 */
	public Adapter createColisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.GUIElement <em>GUI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.GUIElement
	 * @generated
	 */
	public Adapter createGUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.TextDisplay <em>Text Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.TextDisplay
	 * @generated
	 */
	public Adapter createTextDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.BarDisplay <em>Bar Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.BarDisplay
	 * @generated
	 */
	public Adapter createBarDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.ApplyForce <em>Apply Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.ApplyForce
	 * @generated
	 */
	public Adapter createApplyForceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.RigidBody <em>Rigid Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.RigidBody
	 * @generated
	 */
	public Adapter createRigidBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.GameAction <em>Game Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.GameAction
	 * @generated
	 */
	public Adapter createGameActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.DataChange <em>Data Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.DataChange
	 * @generated
	 */
	public Adapter createDataChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Subtract
	 * @generated
	 */
	public Adapter createSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.Actionkey <em>Actionkey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.Actionkey
	 * @generated
	 */
	public Adapter createActionkeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unityGameDSL.GameObject <em>Game Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unityGameDSL.GameObject
	 * @generated
	 */
	public Adapter createGameObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UnityGameDSLAdapterFactory
