/**
 */
package unityGameDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import unityGameDSL.Sideways;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sideways</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.impl.SidewaysImpl#isIsJump <em>Is Jump</em>}</li>
 *   <li>{@link unityGameDSL.impl.SidewaysImpl#getJumpIntensity <em>Jump Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SidewaysImpl extends MovementImpl implements Sideways {
	/**
	 * The default value of the '{@link #isIsJump() <em>Is Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJump()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_JUMP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsJump() <em>Is Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJump()
	 * @generated
	 * @ordered
	 */
	protected boolean isJump = IS_JUMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getJumpIntensity() <em>Jump Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_INTENSITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJumpIntensity() <em>Jump Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpIntensity()
	 * @generated
	 * @ordered
	 */
	protected int jumpIntensity = JUMP_INTENSITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SidewaysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnityGameDSLPackage.Literals.SIDEWAYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsJump() {
		return isJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJump(boolean newIsJump) {
		boolean oldIsJump = isJump;
		isJump = newIsJump;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.SIDEWAYS__IS_JUMP, oldIsJump,
					isJump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJumpIntensity() {
		return jumpIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpIntensity(int newJumpIntensity) {
		int oldJumpIntensity = jumpIntensity;
		jumpIntensity = newJumpIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.SIDEWAYS__JUMP_INTENSITY,
					oldJumpIntensity, jumpIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnityGameDSLPackage.SIDEWAYS__IS_JUMP:
			return isIsJump();
		case UnityGameDSLPackage.SIDEWAYS__JUMP_INTENSITY:
			return getJumpIntensity();
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
		case UnityGameDSLPackage.SIDEWAYS__IS_JUMP:
			setIsJump((Boolean) newValue);
			return;
		case UnityGameDSLPackage.SIDEWAYS__JUMP_INTENSITY:
			setJumpIntensity((Integer) newValue);
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
		case UnityGameDSLPackage.SIDEWAYS__IS_JUMP:
			setIsJump(IS_JUMP_EDEFAULT);
			return;
		case UnityGameDSLPackage.SIDEWAYS__JUMP_INTENSITY:
			setJumpIntensity(JUMP_INTENSITY_EDEFAULT);
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
		case UnityGameDSLPackage.SIDEWAYS__IS_JUMP:
			return isJump != IS_JUMP_EDEFAULT;
		case UnityGameDSLPackage.SIDEWAYS__JUMP_INTENSITY:
			return jumpIntensity != JUMP_INTENSITY_EDEFAULT;
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
		result.append(" (isJump: ");
		result.append(isJump);
		result.append(", jumpIntensity: ");
		result.append(jumpIntensity);
		result.append(')');
		return result.toString();
	}

} //SidewaysImpl
