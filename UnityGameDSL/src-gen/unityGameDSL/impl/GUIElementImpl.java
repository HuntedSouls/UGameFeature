/**
 */
package unityGameDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import unityGameDSL.Data;
import unityGameDSL.GUIElement;
import unityGameDSL.UnityGameDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GUI Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unityGameDSL.impl.GUIElementImpl#getShowData <em>Show Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GUIElementImpl extends MinimalEObjectImpl.Container implements GUIElement {
	/**
	 * The cached value of the '{@link #getShowData() <em>Show Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowData()
	 * @generated
	 * @ordered
	 */
	protected Data showData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnityGameDSLPackage.Literals.GUI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getShowData() {
		return showData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShowData(Data newShowData, NotificationChain msgs) {
		Data oldShowData = showData;
		showData = newShowData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA, oldShowData, newShowData);
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
	public void setShowData(Data newShowData) {
		if (newShowData != showData) {
			NotificationChain msgs = null;
			if (showData != null)
				msgs = ((InternalEObject) showData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA, null, msgs);
			if (newShowData != null)
				msgs = ((InternalEObject) newShowData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA, null, msgs);
			msgs = basicSetShowData(newShowData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA,
					newShowData, newShowData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA:
			return basicSetShowData(null, msgs);
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
		case UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA:
			return getShowData();
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
		case UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA:
			setShowData((Data) newValue);
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
		case UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA:
			setShowData((Data) null);
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
		case UnityGameDSLPackage.GUI_ELEMENT__SHOW_DATA:
			return showData != null;
		}
		return super.eIsSet(featureID);
	}

} //GUIElementImpl
