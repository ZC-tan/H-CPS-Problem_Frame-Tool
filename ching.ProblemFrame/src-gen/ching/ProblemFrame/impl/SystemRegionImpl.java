/**
 */
package ching.ProblemFrame.impl;

import ching.ProblemFrame.MyStateMachine;
import ching.ProblemFrame.ProblemFramePackage;
import ching.ProblemFrame.SystemDomain;
import ching.ProblemFrame.SystemRegion;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.impl.SystemRegionImpl#getSystemDomain <em>System Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.SystemRegionImpl#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.SystemRegionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRegionImpl extends MinimalEObjectImpl.Container implements SystemRegion {
	/**
	 * The cached value of the '{@link #getSystemDomain() <em>System Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemDomain> systemDomain;

	/**
	 * The cached value of the '{@link #getStatemachine() <em>Statemachine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachine()
	 * @generated
	 * @ordered
	 */
	protected EList<MyStateMachine> statemachine;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemFramePackage.Literals.SYSTEM_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemDomain> getSystemDomain() {
		if (systemDomain == null) {
			systemDomain = new EObjectContainmentEList<SystemDomain>(SystemDomain.class, this,
					ProblemFramePackage.SYSTEM_REGION__SYSTEM_DOMAIN);
		}
		return systemDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MyStateMachine> getStatemachine() {
		if (statemachine == null) {
			statemachine = new EObjectContainmentEList<MyStateMachine>(MyStateMachine.class, this,
					ProblemFramePackage.SYSTEM_REGION__STATEMACHINE);
		}
		return statemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemFramePackage.SYSTEM_REGION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemFramePackage.SYSTEM_REGION__SYSTEM_DOMAIN:
			return ((InternalEList<?>) getSystemDomain()).basicRemove(otherEnd, msgs);
		case ProblemFramePackage.SYSTEM_REGION__STATEMACHINE:
			return ((InternalEList<?>) getStatemachine()).basicRemove(otherEnd, msgs);
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
		case ProblemFramePackage.SYSTEM_REGION__SYSTEM_DOMAIN:
			return getSystemDomain();
		case ProblemFramePackage.SYSTEM_REGION__STATEMACHINE:
			return getStatemachine();
		case ProblemFramePackage.SYSTEM_REGION__NAME:
			return getName();
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
		case ProblemFramePackage.SYSTEM_REGION__SYSTEM_DOMAIN:
			getSystemDomain().clear();
			getSystemDomain().addAll((Collection<? extends SystemDomain>) newValue);
			return;
		case ProblemFramePackage.SYSTEM_REGION__STATEMACHINE:
			getStatemachine().clear();
			getStatemachine().addAll((Collection<? extends MyStateMachine>) newValue);
			return;
		case ProblemFramePackage.SYSTEM_REGION__NAME:
			setName((String) newValue);
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
		case ProblemFramePackage.SYSTEM_REGION__SYSTEM_DOMAIN:
			getSystemDomain().clear();
			return;
		case ProblemFramePackage.SYSTEM_REGION__STATEMACHINE:
			getStatemachine().clear();
			return;
		case ProblemFramePackage.SYSTEM_REGION__NAME:
			setName(NAME_EDEFAULT);
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
		case ProblemFramePackage.SYSTEM_REGION__SYSTEM_DOMAIN:
			return systemDomain != null && !systemDomain.isEmpty();
		case ProblemFramePackage.SYSTEM_REGION__STATEMACHINE:
			return statemachine != null && !statemachine.isEmpty();
		case ProblemFramePackage.SYSTEM_REGION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemRegionImpl
