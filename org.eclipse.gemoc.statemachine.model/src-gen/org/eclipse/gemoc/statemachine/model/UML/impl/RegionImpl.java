/**
 */
package org.eclipse.gemoc.statemachine.model.UML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.statemachine.model.UML.Region;
import org.eclipse.gemoc.statemachine.model.UML.State;
import org.eclipse.gemoc.statemachine.model.UML.StateMachine;
import org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage;
import org.eclipse.gemoc.statemachine.model.UML.TeamDiagram;
import org.eclipse.gemoc.statemachine.model.UML.Transition;
import org.eclipse.gemoc.statemachine.model.UML.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl#getCurrentVertex <em>Current Vertex</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl#getCurrentDirectVertex <em>Current Direct Vertex</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl#getTeamdiagram <em>Teamdiagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends NamespaceImpl implements Region {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> subvertex;

	/**
	 * The cached value of the '{@link #getCurrentVertex() <em>Current Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex currentVertex;

	/**
	 * The cached value of the '{@link #getCurrentDirectVertex() <em>Current Direct Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDirectVertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex currentDirectVertex;

	/**
	 * The cached value of the '{@link #getTeamdiagram() <em>Teamdiagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamdiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamDiagram> teamdiagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this,
					StatemachinePackage.REGION__TRANSITION, StatemachinePackage.TRANSITION__CONTAINER);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vertex> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this,
					StatemachinePackage.REGION__SUBVERTEX, StatemachinePackage.VERTEX__CONTAINER);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine getStatemachine() {
		if (eContainerFeatureID() != StatemachinePackage.REGION__STATEMACHINE)
			return null;
		return (StateMachine) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachine(StateMachine newStatemachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStatemachine, StatemachinePackage.REGION__STATEMACHINE, msgs);
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
				|| (eContainerFeatureID() != StatemachinePackage.REGION__STATEMACHINE && newStatemachine != null)) {
			if (EcoreUtil.isAncestor(this, newStatemachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatemachine != null)
				msgs = ((InternalEObject) newStatemachine).eInverseAdd(this, StatemachinePackage.STATE_MACHINE__REGION,
						StateMachine.class, msgs);
			msgs = basicSetStatemachine(newStatemachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.REGION__STATEMACHINE,
					newStatemachine, newStatemachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (eContainerFeatureID() != StatemachinePackage.REGION__STATE)
			return null;
		return (State) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newState, StatemachinePackage.REGION__STATE, msgs);
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
				|| (eContainerFeatureID() != StatemachinePackage.REGION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this, StatemachinePackage.STATE__REGION, State.class,
						msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.REGION__STATE, newState,
					newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vertex getCurrentVertex() {
		if (currentVertex != null && currentVertex.eIsProxy()) {
			InternalEObject oldCurrentVertex = (InternalEObject) currentVertex;
			currentVertex = (Vertex) eResolveProxy(oldCurrentVertex);
			if (currentVertex != oldCurrentVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatemachinePackage.REGION__CURRENT_VERTEX, oldCurrentVertex, currentVertex));
			}
		}
		return currentVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetCurrentVertex() {
		return currentVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentVertex(Vertex newCurrentVertex) {
		Vertex oldCurrentVertex = currentVertex;
		currentVertex = newCurrentVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.REGION__CURRENT_VERTEX,
					oldCurrentVertex, currentVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vertex getCurrentDirectVertex() {
		if (currentDirectVertex != null && currentDirectVertex.eIsProxy()) {
			InternalEObject oldCurrentDirectVertex = (InternalEObject) currentDirectVertex;
			currentDirectVertex = (Vertex) eResolveProxy(oldCurrentDirectVertex);
			if (currentDirectVertex != oldCurrentDirectVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatemachinePackage.REGION__CURRENT_DIRECT_VERTEX, oldCurrentDirectVertex,
							currentDirectVertex));
			}
		}
		return currentDirectVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetCurrentDirectVertex() {
		return currentDirectVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentDirectVertex(Vertex newCurrentDirectVertex) {
		Vertex oldCurrentDirectVertex = currentDirectVertex;
		currentDirectVertex = newCurrentDirectVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.REGION__CURRENT_DIRECT_VERTEX,
					oldCurrentDirectVertex, currentDirectVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TeamDiagram> getTeamdiagram() {
		if (teamdiagram == null) {
			teamdiagram = new EObjectContainmentEList<TeamDiagram>(TeamDiagram.class, this,
					StatemachinePackage.REGION__TEAMDIAGRAM);
		}
		return teamdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.REGION__TRANSITION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransition()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.REGION__SUBVERTEX:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubvertex()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.REGION__STATEMACHINE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStatemachine((StateMachine) otherEnd, msgs);
		case StatemachinePackage.REGION__STATE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetState((State) otherEnd, msgs);
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
		case StatemachinePackage.REGION__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.REGION__SUBVERTEX:
			return ((InternalEList<?>) getSubvertex()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.REGION__STATEMACHINE:
			return basicSetStatemachine(null, msgs);
		case StatemachinePackage.REGION__STATE:
			return basicSetState(null, msgs);
		case StatemachinePackage.REGION__TEAMDIAGRAM:
			return ((InternalEList<?>) getTeamdiagram()).basicRemove(otherEnd, msgs);
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
		case StatemachinePackage.REGION__STATEMACHINE:
			return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE_MACHINE__REGION,
					StateMachine.class, msgs);
		case StatemachinePackage.REGION__STATE:
			return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE__REGION, State.class, msgs);
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
		case StatemachinePackage.REGION__TRANSITION:
			return getTransition();
		case StatemachinePackage.REGION__SUBVERTEX:
			return getSubvertex();
		case StatemachinePackage.REGION__STATEMACHINE:
			return getStatemachine();
		case StatemachinePackage.REGION__STATE:
			return getState();
		case StatemachinePackage.REGION__CURRENT_VERTEX:
			if (resolve)
				return getCurrentVertex();
			return basicGetCurrentVertex();
		case StatemachinePackage.REGION__CURRENT_DIRECT_VERTEX:
			if (resolve)
				return getCurrentDirectVertex();
			return basicGetCurrentDirectVertex();
		case StatemachinePackage.REGION__TEAMDIAGRAM:
			return getTeamdiagram();
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
		case StatemachinePackage.REGION__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case StatemachinePackage.REGION__SUBVERTEX:
			getSubvertex().clear();
			getSubvertex().addAll((Collection<? extends Vertex>) newValue);
			return;
		case StatemachinePackage.REGION__STATEMACHINE:
			setStatemachine((StateMachine) newValue);
			return;
		case StatemachinePackage.REGION__STATE:
			setState((State) newValue);
			return;
		case StatemachinePackage.REGION__CURRENT_VERTEX:
			setCurrentVertex((Vertex) newValue);
			return;
		case StatemachinePackage.REGION__CURRENT_DIRECT_VERTEX:
			setCurrentDirectVertex((Vertex) newValue);
			return;
		case StatemachinePackage.REGION__TEAMDIAGRAM:
			getTeamdiagram().clear();
			getTeamdiagram().addAll((Collection<? extends TeamDiagram>) newValue);
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
		case StatemachinePackage.REGION__TRANSITION:
			getTransition().clear();
			return;
		case StatemachinePackage.REGION__SUBVERTEX:
			getSubvertex().clear();
			return;
		case StatemachinePackage.REGION__STATEMACHINE:
			setStatemachine((StateMachine) null);
			return;
		case StatemachinePackage.REGION__STATE:
			setState((State) null);
			return;
		case StatemachinePackage.REGION__CURRENT_VERTEX:
			setCurrentVertex((Vertex) null);
			return;
		case StatemachinePackage.REGION__CURRENT_DIRECT_VERTEX:
			setCurrentDirectVertex((Vertex) null);
			return;
		case StatemachinePackage.REGION__TEAMDIAGRAM:
			getTeamdiagram().clear();
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
		case StatemachinePackage.REGION__TRANSITION:
			return transition != null && !transition.isEmpty();
		case StatemachinePackage.REGION__SUBVERTEX:
			return subvertex != null && !subvertex.isEmpty();
		case StatemachinePackage.REGION__STATEMACHINE:
			return getStatemachine() != null;
		case StatemachinePackage.REGION__STATE:
			return getState() != null;
		case StatemachinePackage.REGION__CURRENT_VERTEX:
			return currentVertex != null;
		case StatemachinePackage.REGION__CURRENT_DIRECT_VERTEX:
			return currentDirectVertex != null;
		case StatemachinePackage.REGION__TEAMDIAGRAM:
			return teamdiagram != null && !teamdiagram.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
