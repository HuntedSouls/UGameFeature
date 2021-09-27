/**
 */
package unityGameDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import unityGameDSL.Actionkey;
import unityGameDSL.Colision;
import unityGameDSL.GameAction;
import unityGameDSL.GameObject;
import unityGameDSL.Movement;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.impl.GameObjectImpl#getMovement <em>Movement</em>}</li>
 *   <li>{@link unityGameDSL.impl.GameObjectImpl#getColision <em>Colision</em>}</li>
 *   <li>{@link unityGameDSL.impl.GameObjectImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link unityGameDSL.impl.GameObjectImpl#getStart <em>Start</em>}</li>
 *   <li>{@link unityGameDSL.impl.GameObjectImpl#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameObjectImpl extends MinimalEObjectImpl.Container implements GameObject {
	/**
	 * The cached value of the '{@link #getMovement() <em>Movement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovement()
	 * @generated
	 * @ordered
	 */
	protected Movement movement;

	/**
	 * The cached value of the '{@link #getColision() <em>Colision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColision()
	 * @generated
	 * @ordered
	 */
	protected EList<Colision> colision;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<Actionkey> interaction;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EList<GameAction> start;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected EList<GameAction> update;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnityGameDSLPackage.Literals.GAME_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movement getMovement() {
		return movement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovement(Movement newMovement, NotificationChain msgs) {
		Movement oldMovement = movement;
		movement = newMovement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UnityGameDSLPackage.GAME_OBJECT__MOVEMENT, oldMovement, newMovement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovement(Movement newMovement) {
		if (newMovement != movement) {
			NotificationChain msgs = null;
			if (movement != null)
				msgs = ((InternalEObject) movement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UnityGameDSLPackage.GAME_OBJECT__MOVEMENT, null, msgs);
			if (newMovement != null)
				msgs = ((InternalEObject) newMovement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UnityGameDSLPackage.GAME_OBJECT__MOVEMENT, null, msgs);
			msgs = basicSetMovement(newMovement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.GAME_OBJECT__MOVEMENT,
					newMovement, newMovement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Colision> getColision() {
		if (colision == null) {
			colision = new EObjectContainmentEList<Colision>(Colision.class, this,
					UnityGameDSLPackage.GAME_OBJECT__COLISION);
		}
		return colision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actionkey> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<Actionkey>(Actionkey.class, this,
					UnityGameDSLPackage.GAME_OBJECT__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameAction> getStart() {
		if (start == null) {
			start = new EObjectContainmentEList<GameAction>(GameAction.class, this,
					UnityGameDSLPackage.GAME_OBJECT__START);
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameAction> getUpdate() {
		if (update == null) {
			update = new EObjectContainmentEList<GameAction>(GameAction.class, this,
					UnityGameDSLPackage.GAME_OBJECT__UPDATE);
		}
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnityGameDSLPackage.GAME_OBJECT__MOVEMENT:
			return basicSetMovement(null, msgs);
		case UnityGameDSLPackage.GAME_OBJECT__COLISION:
			return ((InternalEList<?>) getColision()).basicRemove(otherEnd, msgs);
		case UnityGameDSLPackage.GAME_OBJECT__INTERACTION:
			return ((InternalEList<?>) getInteraction()).basicRemove(otherEnd, msgs);
		case UnityGameDSLPackage.GAME_OBJECT__START:
			return ((InternalEList<?>) getStart()).basicRemove(otherEnd, msgs);
		case UnityGameDSLPackage.GAME_OBJECT__UPDATE:
			return ((InternalEList<?>) getUpdate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnityGameDSLPackage.GAME_OBJECT__MOVEMENT:
			return getMovement();
		case UnityGameDSLPackage.GAME_OBJECT__COLISION:
			return getColision();
		case UnityGameDSLPackage.GAME_OBJECT__INTERACTION:
			return getInteraction();
		case UnityGameDSLPackage.GAME_OBJECT__START:
			return getStart();
		case UnityGameDSLPackage.GAME_OBJECT__UPDATE:
			return getUpdate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UnityGameDSLPackage.GAME_OBJECT__MOVEMENT:
			setMovement((Movement) newValue);
			return;
		case UnityGameDSLPackage.GAME_OBJECT__COLISION:
			getColision().clear();
			getColision().addAll((Collection<? extends Colision>) newValue);
			return;
		case UnityGameDSLPackage.GAME_OBJECT__INTERACTION:
			getInteraction().clear();
			getInteraction().addAll((Collection<? extends Actionkey>) newValue);
			return;
		case UnityGameDSLPackage.GAME_OBJECT__START:
			getStart().clear();
			getStart().addAll((Collection<? extends GameAction>) newValue);
			return;
		case UnityGameDSLPackage.GAME_OBJECT__UPDATE:
			getUpdate().clear();
			getUpdate().addAll((Collection<? extends GameAction>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UnityGameDSLPackage.GAME_OBJECT__MOVEMENT:
			setMovement((Movement) null);
			return;
		case UnityGameDSLPackage.GAME_OBJECT__COLISION:
			getColision().clear();
			return;
		case UnityGameDSLPackage.GAME_OBJECT__INTERACTION:
			getInteraction().clear();
			return;
		case UnityGameDSLPackage.GAME_OBJECT__START:
			getStart().clear();
			return;
		case UnityGameDSLPackage.GAME_OBJECT__UPDATE:
			getUpdate().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UnityGameDSLPackage.GAME_OBJECT__MOVEMENT:
			return movement != null;
		case UnityGameDSLPackage.GAME_OBJECT__COLISION:
			return colision != null && !colision.isEmpty();
		case UnityGameDSLPackage.GAME_OBJECT__INTERACTION:
			return interaction != null && !interaction.isEmpty();
		case UnityGameDSLPackage.GAME_OBJECT__START:
			return start != null && !start.isEmpty();
		case UnityGameDSLPackage.GAME_OBJECT__UPDATE:
			return update != null && !update.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameObjectImpl
