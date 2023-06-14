/**
 */
package ching.ProblemFrame.impl;

import ching.ProblemFrame.DType;
import ching.ProblemFrame.Domain;
import ching.ProblemFrame.MyStateMachine;
import ching.ProblemFrame.Phenomenon;
import ching.ProblemFrame.ProblemFramePackage;

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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.DomainImpl#getPhenomena <em>Phenomena</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.DomainImpl#getType <em>Type</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.DomainImpl#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
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
	 * The cached value of the '{@link #getPhenomena() <em>Phenomena</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhenomena()
	 * @generated
	 * @ordered
	 */
	protected EList<Phenomenon> phenomena;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DType TYPE_EDEFAULT = DType.GIVEN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DType type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemFramePackage.Literals.DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemFramePackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phenomenon> getPhenomena() {
		if (phenomena == null) {
			phenomena = new EObjectContainmentEList<Phenomenon>(Phenomenon.class, this,
					ProblemFramePackage.DOMAIN__PHENOMENA);
		}
		return phenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DType newType) {
		DType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemFramePackage.DOMAIN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MyStateMachine> getStatemachine() {
		if (statemachine == null) {
			statemachine = new EObjectContainmentEList<MyStateMachine>(MyStateMachine.class, this,
					ProblemFramePackage.DOMAIN__STATEMACHINE);
		}
		return statemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemFramePackage.DOMAIN__PHENOMENA:
			return ((InternalEList<?>) getPhenomena()).basicRemove(otherEnd, msgs);
		case ProblemFramePackage.DOMAIN__STATEMACHINE:
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
		case ProblemFramePackage.DOMAIN__NAME:
			return getName();
		case ProblemFramePackage.DOMAIN__PHENOMENA:
			return getPhenomena();
		case ProblemFramePackage.DOMAIN__TYPE:
			return getType();
		case ProblemFramePackage.DOMAIN__STATEMACHINE:
			return getStatemachine();
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
		case ProblemFramePackage.DOMAIN__NAME:
			setName((String) newValue);
			return;
		case ProblemFramePackage.DOMAIN__PHENOMENA:
			getPhenomena().clear();
			getPhenomena().addAll((Collection<? extends Phenomenon>) newValue);
			return;
		case ProblemFramePackage.DOMAIN__TYPE:
			setType((DType) newValue);
			return;
		case ProblemFramePackage.DOMAIN__STATEMACHINE:
			getStatemachine().clear();
			getStatemachine().addAll((Collection<? extends MyStateMachine>) newValue);
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
		case ProblemFramePackage.DOMAIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProblemFramePackage.DOMAIN__PHENOMENA:
			getPhenomena().clear();
			return;
		case ProblemFramePackage.DOMAIN__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ProblemFramePackage.DOMAIN__STATEMACHINE:
			getStatemachine().clear();
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
		case ProblemFramePackage.DOMAIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProblemFramePackage.DOMAIN__PHENOMENA:
			return phenomena != null && !phenomena.isEmpty();
		case ProblemFramePackage.DOMAIN__TYPE:
			return type != TYPE_EDEFAULT;
		case ProblemFramePackage.DOMAIN__STATEMACHINE:
			return statemachine != null && !statemachine.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
