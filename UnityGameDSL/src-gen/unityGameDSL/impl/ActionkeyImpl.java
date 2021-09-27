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
import unityGameDSL.GameAction;
import unityGameDSL.KeyType;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actionkey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.impl.ActionkeyImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link unityGameDSL.impl.ActionkeyImpl#getKey <em>Key</em>}</li>
 *   <li>{@link unityGameDSL.impl.ActionkeyImpl#getPressType <em>Press Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionkeyImpl extends MinimalEObjectImpl.Container implements Actionkey {
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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressType() <em>Press Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressType()
	 * @generated
	 * @ordered
	 */
	protected static final KeyType PRESS_TYPE_EDEFAULT = KeyType.INSTANT;

	/**
	 * The cached value of the '{@link #getPressType() <em>Press Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressType()
	 * @generated
	 * @ordered
	 */
	protected KeyType pressType = PRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionkeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnityGameDSLPackage.Literals.ACTIONKEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameAction> getExecute() {
		if (execute == null) {
			execute = new EObjectContainmentEList<GameAction>(GameAction.class, this,
					UnityGameDSLPackage.ACTIONKEY__EXECUTE);
		}
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.ACTIONKEY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType getPressType() {
		return pressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressType(KeyType newPressType) {
		KeyType oldPressType = pressType;
		pressType = newPressType == null ? PRESS_TYPE_EDEFAULT : newPressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.ACTIONKEY__PRESS_TYPE,
					oldPressType, pressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnityGameDSLPackage.ACTIONKEY__EXECUTE:
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
		case UnityGameDSLPackage.ACTIONKEY__EXECUTE:
			return getExecute();
		case UnityGameDSLPackage.ACTIONKEY__KEY:
			return getKey();
		case UnityGameDSLPackage.ACTIONKEY__PRESS_TYPE:
			return getPressType();
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
		case UnityGameDSLPackage.ACTIONKEY__EXECUTE:
			getExecute().clear();
			getExecute().addAll((Collection<? extends GameAction>) newValue);
			return;
		case UnityGameDSLPackage.ACTIONKEY__KEY:
			setKey((String) newValue);
			return;
		case UnityGameDSLPackage.ACTIONKEY__PRESS_TYPE:
			setPressType((KeyType) newValue);
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
		case UnityGameDSLPackage.ACTIONKEY__EXECUTE:
			getExecute().clear();
			return;
		case UnityGameDSLPackage.ACTIONKEY__KEY:
			setKey(KEY_EDEFAULT);
			return;
		case UnityGameDSLPackage.ACTIONKEY__PRESS_TYPE:
			setPressType(PRESS_TYPE_EDEFAULT);
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
		case UnityGameDSLPackage.ACTIONKEY__EXECUTE:
			return execute != null && !execute.isEmpty();
		case UnityGameDSLPackage.ACTIONKEY__KEY:
			return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
		case UnityGameDSLPackage.ACTIONKEY__PRESS_TYPE:
			return pressType != PRESS_TYPE_EDEFAULT;
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
		result.append(" (key: ");
		result.append(key);
		result.append(", pressType: ");
		result.append(pressType);
		result.append(')');
		return result.toString();
	}

} //ActionkeyImpl
