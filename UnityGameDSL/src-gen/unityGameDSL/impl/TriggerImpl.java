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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unityGameDSL.GameAction;
import unityGameDSL.Trigger;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.impl.TriggerImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link unityGameDSL.impl.TriggerImpl#getCollisionTAg <em>Collision TAg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends ColisionImpl implements Trigger {
	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected EList<GameAction> execute;

	/**
	 * The default value of the '{@link #getCollisionTAg() <em>Collision TAg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionTAg()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLISION_TAG_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCollisionTAg() <em>Collision TAg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionTAg()
	 * @generated
	 * @ordered
	 */
	protected String collisionTAg = COLLISION_TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnityGameDSLPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameAction> getExecute() {
		if (execute == null) {
			execute = new EObjectContainmentEList<GameAction>(GameAction.class, this,
					UnityGameDSLPackage.TRIGGER__EXECUTE);
		}
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollisionTAg() {
		return collisionTAg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollisionTAg(String newCollisionTAg) {
		String oldCollisionTAg = collisionTAg;
		collisionTAg = newCollisionTAg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.TRIGGER__COLLISION_TAG,
					oldCollisionTAg, collisionTAg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnityGameDSLPackage.TRIGGER__EXECUTE:
			return ((InternalEList<?>) getExecute()).basicRemove(otherEnd, msgs);
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
		case UnityGameDSLPackage.TRIGGER__EXECUTE:
			return getExecute();
		case UnityGameDSLPackage.TRIGGER__COLLISION_TAG:
			return getCollisionTAg();
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
		case UnityGameDSLPackage.TRIGGER__EXECUTE:
			getExecute().clear();
			getExecute().addAll((Collection<? extends GameAction>) newValue);
			return;
		case UnityGameDSLPackage.TRIGGER__COLLISION_TAG:
			setCollisionTAg((String) newValue);
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
		case UnityGameDSLPackage.TRIGGER__EXECUTE:
			getExecute().clear();
			return;
		case UnityGameDSLPackage.TRIGGER__COLLISION_TAG:
			setCollisionTAg(COLLISION_TAG_EDEFAULT);
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
		case UnityGameDSLPackage.TRIGGER__EXECUTE:
			return execute != null && !execute.isEmpty();
		case UnityGameDSLPackage.TRIGGER__COLLISION_TAG:
			return COLLISION_TAG_EDEFAULT == null ? collisionTAg != null : !COLLISION_TAG_EDEFAULT.equals(collisionTAg);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (collisionTAg: ");
		result.append(collisionTAg);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
