/**
 */
package org.eclipse.gemoc.statemachine.model.UML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gemoc.statemachine.model.UML.Pseudostate;
import org.eclipse.gemoc.statemachine.model.UML.PseudostateKind;
import org.eclipse.gemoc.statemachine.model.UML.State;
import org.eclipse.gemoc.statemachine.model.UML.StateMachine;
import org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.PseudostateImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.PseudostateImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.PseudostateImpl#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PseudostateImpl extends VertexImpl implements Pseudostate {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PseudostateKind KIND_EDEFAULT = PseudostateKind.INITIAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PseudostateKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudostateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.PSEUDOSTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PseudostateKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(PseudostateKind newKind) {
		PseudostateKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.PSEUDOSTATE__KIND, oldKind,
					kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (eContainerFeatureID() != StatemachinePackage.PSEUDOSTATE__STATE)
			return null;
		return (State) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newState, StatemachinePackage.PSEUDOSTATE__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		if (newState != eInternalContainer()
				|| (eContainerFeatureID() != StatemachinePackage.PSEUDOSTATE__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this, StatemachinePackage.STATE__CONNECTION_POINT,
						State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.PSEUDOSTATE__STATE, newState,
					newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine getStatemachine() {
		if (eContainerFeatureID() != StatemachinePackage.PSEUDOSTATE__STATEMACHINE)
			return null;
		return (StateMachine) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachine(StateMachine newStatemachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStatemachine, StatemachinePackage.PSEUDOSTATE__STATEMACHINE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatemachine(StateMachine newStatemachine) {
		if (newStatemachine != eInternalContainer()
				|| (eContainerFeatureID() != StatemachinePackage.PSEUDOSTATE__STATEMACHINE
						&& newStatemachine != null)) {
			if (EcoreUtil.isAncestor(this, newStatemachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatemachine != null)
				msgs = ((InternalEObject) newStatemachine).eInverseAdd(this,
						StatemachinePackage.STATE_MACHINE__CONNECTION_POINT, StateMachine.class, msgs);
			msgs = basicSetStatemachine(newStatemachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.PSEUDOSTATE__STATEMACHINE,
					newStatemachine, newStatemachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.PSEUDOSTATE__STATE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetState((State) otherEnd, msgs);
		case StatemachinePackage.PSEUDOSTATE__STATEMACHINE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStatemachine((StateMachine) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.PSEUDOSTATE__STATE:
			return basicSetState(null, msgs);
		case StatemachinePackage.PSEUDOSTATE__STATEMACHINE:
			return basicSetStatemachine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case StatemachinePackage.PSEUDOSTATE__STATE:
			return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE__CONNECTION_POINT, State.class,
					msgs);
		case StatemachinePackage.PSEUDOSTATE__STATEMACHINE:
			return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE_MACHINE__CONNECTION_POINT,
					StateMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatemachinePackage.PSEUDOSTATE__KIND:
			return getKind();
		case StatemachinePackage.PSEUDOSTATE__STATE:
			return getState();
		case StatemachinePackage.PSEUDOSTATE__STATEMACHINE:
			return getStatemachine();
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
		case StatemachinePackage.PSEUDOSTATE__KIND:
			setKind((PseudostateKind) newValue);
			return;
		case StatemachinePackage.PSEUDOSTATE__STATE:
			setState((State) newValue);
			return;
		case StatemachinePackage.PSEUDOSTATE__STATEMACHINE:
			setStatemachine((StateMachine) newValue);
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
		case StatemachinePackage.PSEUDOSTATE__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case StatemachinePackage.PSEUDOSTATE__STATE:
			setState((State) null);
			return;
		case StatemachinePackage.PSEUDOSTATE__STATEMACHINE:
			setStatemachine((StateMachine) null);
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
		case StatemachinePackage.PSEUDOSTATE__KIND:
			return kind != KIND_EDEFAULT;
		case StatemachinePackage.PSEUDOSTATE__STATE:
			return getState() != null;
		case StatemachinePackage.PSEUDOSTATE__STATEMACHINE:
			return getStatemachine() != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //PseudostateImpl
