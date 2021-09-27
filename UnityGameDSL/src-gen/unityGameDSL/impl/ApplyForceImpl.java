/**
 */
package unityGameDSL.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import unityGameDSL.ApplyForce;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.impl.ApplyForceImpl#isIsInstant <em>Is Instant</em>}</li>
 *   <li>{@link unityGameDSL.impl.ApplyForceImpl#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link unityGameDSL.impl.ApplyForceImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyForceImpl extends GameActionImpl implements ApplyForce {
	/**
	 * The default value of the '{@link #isIsInstant() <em>Is Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INSTANT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsInstant() <em>Is Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInstant()
	 * @generated
	 * @ordered
	 */
	protected boolean isInstant = IS_INSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final float INTENSITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected float intensity = INTENSITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> direction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnityGameDSLPackage.Literals.APPLY_FORCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInstant() {
		return isInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInstant(boolean newIsInstant) {
		boolean oldIsInstant = isInstant;
		isInstant = newIsInstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.APPLY_FORCE__IS_INSTANT,
					oldIsInstant, isInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(float newIntensity) {
		float oldIntensity = intensity;
		intensity = newIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.APPLY_FORCE__INTENSITY,
					oldIntensity, intensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDirection() {
		if (direction == null) {
			direction = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					UnityGameDSLPackage.APPLY_FORCE__DIRECTION);
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnityGameDSLPackage.APPLY_FORCE__IS_INSTANT:
			return isIsInstant();
		case UnityGameDSLPackage.APPLY_FORCE__INTENSITY:
			return getIntensity();
		case UnityGameDSLPackage.APPLY_FORCE__DIRECTION:
			return getDirection();
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
		case UnityGameDSLPackage.APPLY_FORCE__IS_INSTANT:
			setIsInstant((Boolean) newValue);
			return;
		case UnityGameDSLPackage.APPLY_FORCE__INTENSITY:
			setIntensity((Float) newValue);
			return;
		case UnityGameDSLPackage.APPLY_FORCE__DIRECTION:
			getDirection().clear();
			getDirection().addAll((Collection<? extends Integer>) newValue);
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
		case UnityGameDSLPackage.APPLY_FORCE__IS_INSTANT:
			setIsInstant(IS_INSTANT_EDEFAULT);
			return;
		case UnityGameDSLPackage.APPLY_FORCE__INTENSITY:
			setIntensity(INTENSITY_EDEFAULT);
			return;
		case UnityGameDSLPackage.APPLY_FORCE__DIRECTION:
			getDirection().clear();
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
		case UnityGameDSLPackage.APPLY_FORCE__IS_INSTANT:
			return isInstant != IS_INSTANT_EDEFAULT;
		case UnityGameDSLPackage.APPLY_FORCE__INTENSITY:
			return intensity != INTENSITY_EDEFAULT;
		case UnityGameDSLPackage.APPLY_FORCE__DIRECTION:
			return direction != null && !direction.isEmpty();
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
		result.append(" (isInstant: ");
		result.append(isInstant);
		result.append(", intensity: ");
		result.append(intensity);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ApplyForceImpl
