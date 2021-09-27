/**
 */
package unityGameDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import unityGameDSL.Movement;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.impl.MovementImpl#getAceleration <em>Aceleration</em>}</li>
 *   <li>{@link unityGameDSL.impl.MovementImpl#getMaxSpeed <em>Max Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MovementImpl extends MinimalEObjectImpl.Container implements Movement {
	/**
	 * The default value of the '{@link #getAceleration() <em>Aceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAceleration()
	 * @generated
	 * @ordered
	 */
	protected static final int ACELERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAceleration() <em>Aceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAceleration()
	 * @generated
	 * @ordered
	 */
	protected int aceleration = ACELERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected int maxSpeed = MAX_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnityGameDSLPackage.Literals.MOVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAceleration() {
		return aceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAceleration(int newAceleration) {
		int oldAceleration = aceleration;
		aceleration = newAceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.MOVEMENT__ACELERATION,
					oldAceleration, aceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSpeed(int newMaxSpeed) {
		int oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.MOVEMENT__MAX_SPEED, oldMaxSpeed,
					maxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnityGameDSLPackage.MOVEMENT__ACELERATION:
			return getAceleration();
		case UnityGameDSLPackage.MOVEMENT__MAX_SPEED:
			return getMaxSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UnityGameDSLPackage.MOVEMENT__ACELERATION:
			setAceleration((Integer) newValue);
			return;
		case UnityGameDSLPackage.MOVEMENT__MAX_SPEED:
			setMaxSpeed((Integer) newValue);
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
		case UnityGameDSLPackage.MOVEMENT__ACELERATION:
			setAceleration(ACELERATION_EDEFAULT);
			return;
		case UnityGameDSLPackage.MOVEMENT__MAX_SPEED:
			setMaxSpeed(MAX_SPEED_EDEFAULT);
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
		case UnityGameDSLPackage.MOVEMENT__ACELERATION:
			return aceleration != ACELERATION_EDEFAULT;
		case UnityGameDSLPackage.MOVEMENT__MAX_SPEED:
			return maxSpeed != MAX_SPEED_EDEFAULT;
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
		result.append(" (aceleration: ");
		result.append(aceleration);
		result.append(", maxSpeed: ");
		result.append(maxSpeed);
		result.append(')');
		return result.toString();
	}

} //MovementImpl
