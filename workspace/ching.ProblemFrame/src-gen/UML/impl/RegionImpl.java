/**
 */
package UML.impl;

import UML.Region;
import UML.State;
import UML.StateMachine;
import UML.TeamDiagram;
import UML.Transition;
import UML.UMLPackage;
import UML.Vertex;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link UML.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link UML.impl.RegionImpl#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link UML.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link UML.impl.RegionImpl#getCurrentVertex <em>Current Vertex</em>}</li>
 *   <li>{@link UML.impl.RegionImpl#getCurrentDirectVertex <em>Current Direct Vertex</em>}</li>
 *   <li>{@link UML.impl.RegionImpl#getTeamdiagram <em>Teamdiagram</em>}</li>
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
		return UMLPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this,
					UMLPackage.REGION__TRANSITION, UMLPackage.TRANSITION__CONTAINER);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, UMLPackage.REGION__SUBVERTEX,
					UMLPackage.VERTEX__CONTAINER);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStatemachine() {
		if (eContainerFeatureID() != UMLPackage.REGION__STATEMACHINE)
			return null;
		return (StateMachine) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachine(StateMachine newStatemachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStatemachine, UMLPackage.REGION__STATEMACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatemachine(StateMachine newStatemachine) {
		if (newStatemachine != eInternalContainer()
				|| (eContainerFeatureID() != UMLPackage.REGION__STATEMACHINE && newStatemachine != null)) {
			if (EcoreUtil.isAncestor(this, newStatemachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatemachine != null)
				msgs = ((InternalEObject) newStatemachine).eInverseAdd(this, UMLPackage.STATE_MACHINE__REGION,
						StateMachine.class, msgs);
			msgs = basicSetStatemachine(newStatemachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.REGION__STATEMACHINE, newStatemachine,
					newStatemachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != UMLPackage.REGION__STATE)
			return null;
		return (State) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newState, UMLPackage.REGION__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer()
				|| (eContainerFeatureID() != UMLPackage.REGION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this, UMLPackage.STATE__REGION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.REGION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getCurrentVertex() {
		if (currentVertex != null && currentVertex.eIsProxy()) {
			InternalEObject oldCurrentVertex = (InternalEObject) currentVertex;
			currentVertex = (Vertex) eResolveProxy(oldCurrentVertex);
			if (currentVertex != oldCurrentVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.REGION__CURRENT_VERTEX,
							oldCurrentVertex, currentVertex));
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
	public void setCurrentVertex(Vertex newCurrentVertex) {
		Vertex oldCurrentVertex = currentVertex;
		currentVertex = newCurrentVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.REGION__CURRENT_VERTEX, oldCurrentVertex,
					currentVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getCurrentDirectVertex() {
		if (currentDirectVertex != null && currentDirectVertex.eIsProxy()) {
			InternalEObject oldCurrentDirectVertex = (InternalEObject) currentDirectVertex;
			currentDirectVertex = (Vertex) eResolveProxy(oldCurrentDirectVertex);
			if (currentDirectVertex != oldCurrentDirectVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.REGION__CURRENT_DIRECT_VERTEX,
							oldCurrentDirectVertex, currentDirectVertex));
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
	public void setCurrentDirectVertex(Vertex newCurrentDirectVertex) {
		Vertex oldCurrentDirectVertex = currentDirectVertex;
		currentDirectVertex = newCurrentDirectVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.REGION__CURRENT_DIRECT_VERTEX,
					oldCurrentDirectVertex, currentDirectVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamDiagram> getTeamdiagram() {
		if (teamdiagram == null) {
			teamdiagram = new EObjectContainmentEList<TeamDiagram>(TeamDiagram.class, this,
					UMLPackage.REGION__TEAMDIAGRAM);
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
		case UMLPackage.REGION__TRANSITION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransition()).basicAdd(otherEnd, msgs);
		case UMLPackage.REGION__SUBVERTEX:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubvertex()).basicAdd(otherEnd, msgs);
		case UMLPackage.REGION__STATEMACHINE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStatemachine((StateMachine) otherEnd, msgs);
		case UMLPackage.REGION__STATE:
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
		case UMLPackage.REGION__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case UMLPackage.REGION__SUBVERTEX:
			return ((InternalEList<?>) getSubvertex()).basicRemove(otherEnd, msgs);
		case UMLPackage.REGION__STATEMACHINE:
			return basicSetStatemachine(null, msgs);
		case UMLPackage.REGION__STATE:
			return basicSetState(null, msgs);
		case UMLPackage.REGION__TEAMDIAGRAM:
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
		case UMLPackage.REGION__STATEMACHINE:
			return eInternalContainer().eInverseRemove(this, UMLPackage.STATE_MACHINE__REGION, StateMachine.class,
					msgs);
		case UMLPackage.REGION__STATE:
			return eInternalContainer().eInverseRemove(this, UMLPackage.STATE__REGION, State.class, msgs);
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
		case UMLPackage.REGION__TRANSITION:
			return getTransition();
		case UMLPackage.REGION__SUBVERTEX:
			return getSubvertex();
		case UMLPackage.REGION__STATEMACHINE:
			return getStatemachine();
		case UMLPackage.REGION__STATE:
			return getState();
		case UMLPackage.REGION__CURRENT_VERTEX:
			if (resolve)
				return getCurrentVertex();
			return basicGetCurrentVertex();
		case UMLPackage.REGION__CURRENT_DIRECT_VERTEX:
			if (resolve)
				return getCurrentDirectVertex();
			return basicGetCurrentDirectVertex();
		case UMLPackage.REGION__TEAMDIAGRAM:
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
		case UMLPackage.REGION__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case UMLPackage.REGION__SUBVERTEX:
			getSubvertex().clear();
			getSubvertex().addAll((Collection<? extends Vertex>) newValue);
			return;
		case UMLPackage.REGION__STATEMACHINE:
			setStatemachine((StateMachine) newValue);
			return;
		case UMLPackage.REGION__STATE:
			setState((State) newValue);
			return;
		case UMLPackage.REGION__CURRENT_VERTEX:
			setCurrentVertex((Vertex) newValue);
			return;
		case UMLPackage.REGION__CURRENT_DIRECT_VERTEX:
			setCurrentDirectVertex((Vertex) newValue);
			return;
		case UMLPackage.REGION__TEAMDIAGRAM:
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
		case UMLPackage.REGION__TRANSITION:
			getTransition().clear();
			return;
		case UMLPackage.REGION__SUBVERTEX:
			getSubvertex().clear();
			return;
		case UMLPackage.REGION__STATEMACHINE:
			setStatemachine((StateMachine) null);
			return;
		case UMLPackage.REGION__STATE:
			setState((State) null);
			return;
		case UMLPackage.REGION__CURRENT_VERTEX:
			setCurrentVertex((Vertex) null);
			return;
		case UMLPackage.REGION__CURRENT_DIRECT_VERTEX:
			setCurrentDirectVertex((Vertex) null);
			return;
		case UMLPackage.REGION__TEAMDIAGRAM:
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
		case UMLPackage.REGION__TRANSITION:
			return transition != null && !transition.isEmpty();
		case UMLPackage.REGION__SUBVERTEX:
			return subvertex != null && !subvertex.isEmpty();
		case UMLPackage.REGION__STATEMACHINE:
			return getStatemachine() != null;
		case UMLPackage.REGION__STATE:
			return getState() != null;
		case UMLPackage.REGION__CURRENT_VERTEX:
			return currentVertex != null;
		case UMLPackage.REGION__CURRENT_DIRECT_VERTEX:
			return currentDirectVertex != null;
		case UMLPackage.REGION__TEAMDIAGRAM:
			return teamdiagram != null && !teamdiagram.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
