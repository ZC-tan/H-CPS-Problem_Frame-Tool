/**
 */
package org.eclipse.gemoc.statemachine.model.UML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gemoc.statemachine.model.UML.Human;
import org.eclipse.gemoc.statemachine.model.UML.Machine;
import org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation;
import org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine To Human Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.MachineToHumanRelationImpl#getMachineSource <em>Machine Source</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.MachineToHumanRelationImpl#getHumanTarget <em>Human Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineToHumanRelationImpl extends MinimalEObjectImpl.Container implements MachineToHumanRelation {
	/**
	 * The cached value of the '{@link #getMachineSource() <em>Machine Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineSource()
	 * @generated
	 * @ordered
	 */
	protected Machine machineSource;

	/**
	 * The cached value of the '{@link #getHumanTarget() <em>Human Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanTarget()
	 * @generated
	 * @ordered
	 */
	protected Human humanTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineToHumanRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.MACHINE_TO_HUMAN_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine getMachineSource() {
		if (machineSource != null && machineSource.eIsProxy()) {
			InternalEObject oldMachineSource = (InternalEObject) machineSource;
			machineSource = (Machine) eResolveProxy(oldMachineSource);
			if (machineSource != oldMachineSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatemachinePackage.MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE, oldMachineSource,
							machineSource));
			}
		}
		return machineSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetMachineSource() {
		return machineSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMachineSource(Machine newMachineSource) {
		Machine oldMachineSource = machineSource;
		machineSource = newMachineSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE, oldMachineSource, machineSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Human getHumanTarget() {
		if (humanTarget != null && humanTarget.eIsProxy()) {
			InternalEObject oldHumanTarget = (InternalEObject) humanTarget;
			humanTarget = (Human) eResolveProxy(oldHumanTarget);
			if (humanTarget != oldHumanTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatemachinePackage.MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET, oldHumanTarget, humanTarget));
			}
		}
		return humanTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Human basicGetHumanTarget() {
		return humanTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanTarget(Human newHumanTarget) {
		Human oldHumanTarget = humanTarget;
		humanTarget = newHumanTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET, oldHumanTarget, humanTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE:
			if (resolve)
				return getMachineSource();
			return basicGetMachineSource();
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET:
			if (resolve)
				return getHumanTarget();
			return basicGetHumanTarget();
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
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE:
			setMachineSource((Machine) newValue);
			return;
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET:
			setHumanTarget((Human) newValue);
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
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE:
			setMachineSource((Machine) null);
			return;
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET:
			setHumanTarget((Human) null);
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
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE:
			return machineSource != null;
		case StatemachinePackage.MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET:
			return humanTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //MachineToHumanRelationImpl
