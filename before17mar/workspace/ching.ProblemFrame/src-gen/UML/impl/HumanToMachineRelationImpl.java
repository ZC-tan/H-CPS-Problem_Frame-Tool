/**
 */
package UML.impl;

import UML.Human;
import UML.HumanToMachineRelation;
import UML.Machine;
import UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human To Machine Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.HumanToMachineRelationImpl#getHumanSource <em>Human Source</em>}</li>
 *   <li>{@link UML.impl.HumanToMachineRelationImpl#getMachineTarget <em>Machine Target</em>}</li>
 *   <li>{@link UML.impl.HumanToMachineRelationImpl#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumanToMachineRelationImpl extends MinimalEObjectImpl.Container implements HumanToMachineRelation {
	/**
	 * The cached value of the '{@link #getHumanSource() <em>Human Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanSource()
	 * @generated
	 * @ordered
	 */
	protected Human humanSource;

	/**
	 * The cached value of the '{@link #getMachineTarget() <em>Machine Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineTarget()
	 * @generated
	 * @ordered
	 */
	protected Machine machineTarget;

	/**
	 * The default value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationName()
	 * @generated
	 * @ordered
	 */
	protected String relationName = RELATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanToMachineRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.HUMAN_TO_MACHINE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Human getHumanSource() {
		if (humanSource != null && humanSource.eIsProxy()) {
			InternalEObject oldHumanSource = (InternalEObject) humanSource;
			humanSource = (Human) eResolveProxy(oldHumanSource);
			if (humanSource != oldHumanSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UMLPackage.HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE, oldHumanSource, humanSource));
			}
		}
		return humanSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Human basicGetHumanSource() {
		return humanSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanSource(Human newHumanSource) {
		Human oldHumanSource = humanSource;
		humanSource = newHumanSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE,
					oldHumanSource, humanSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getMachineTarget() {
		if (machineTarget != null && machineTarget.eIsProxy()) {
			InternalEObject oldMachineTarget = (InternalEObject) machineTarget;
			machineTarget = (Machine) eResolveProxy(oldMachineTarget);
			if (machineTarget != oldMachineTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UMLPackage.HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET, oldMachineTarget, machineTarget));
			}
		}
		return machineTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetMachineTarget() {
		return machineTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineTarget(Machine newMachineTarget) {
		Machine oldMachineTarget = machineTarget;
		machineTarget = newMachineTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET,
					oldMachineTarget, machineTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationName() {
		return relationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationName(String newRelationName) {
		String oldRelationName = relationName;
		relationName = newRelationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.HUMAN_TO_MACHINE_RELATION__RELATION_NAME,
					oldRelationName, relationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE:
			if (resolve)
				return getHumanSource();
			return basicGetHumanSource();
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET:
			if (resolve)
				return getMachineTarget();
			return basicGetMachineTarget();
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__RELATION_NAME:
			return getRelationName();
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
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE:
			setHumanSource((Human) newValue);
			return;
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET:
			setMachineTarget((Machine) newValue);
			return;
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__RELATION_NAME:
			setRelationName((String) newValue);
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
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE:
			setHumanSource((Human) null);
			return;
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET:
			setMachineTarget((Machine) null);
			return;
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__RELATION_NAME:
			setRelationName(RELATION_NAME_EDEFAULT);
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
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE:
			return humanSource != null;
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET:
			return machineTarget != null;
		case UMLPackage.HUMAN_TO_MACHINE_RELATION__RELATION_NAME:
			return RELATION_NAME_EDEFAULT == null ? relationName != null : !RELATION_NAME_EDEFAULT.equals(relationName);
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
		result.append(" (relationName: ");
		result.append(relationName);
		result.append(')');
		return result.toString();
	}

} //HumanToMachineRelationImpl
