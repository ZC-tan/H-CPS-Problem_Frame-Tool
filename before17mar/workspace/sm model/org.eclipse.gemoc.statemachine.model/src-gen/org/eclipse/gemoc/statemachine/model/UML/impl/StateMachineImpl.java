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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.statemachine.model.UML.Property;
import org.eclipse.gemoc.statemachine.model.UML.Pseudostate;
import org.eclipse.gemoc.statemachine.model.UML.Region;
import org.eclipse.gemoc.statemachine.model.UML.State;
import org.eclipse.gemoc.statemachine.model.UML.StateMachine;
import org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage;
import org.eclipse.gemoc.statemachine.model.UML.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl#getCurrentVertex <em>Current Vertex</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl#getEventPool <em>Event Pool</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoint;

	/**
	 * The cached value of the '{@link #getSubmachineState() <em>Submachine State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> submachineState;

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
	 * The cached value of the '{@link #getEventPool() <em>Event Pool</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPool()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eventPool;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<String> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentWithInverseEList<Region>(Region.class, this,
					StatemachinePackage.STATE_MACHINE__REGION, StatemachinePackage.REGION__STATEMACHINE);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentWithInverseEList<Pseudostate>(Pseudostate.class, this,
					StatemachinePackage.STATE_MACHINE__CONNECTION_POINT, StatemachinePackage.PSEUDOSTATE__STATEMACHINE);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getSubmachineState() {
		if (submachineState == null) {
			submachineState = new EObjectWithInverseResolvingEList<State>(State.class, this,
					StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE, StatemachinePackage.STATE__SUBMACHINE);
		}
		return submachineState;
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
							StatemachinePackage.STATE_MACHINE__CURRENT_VERTEX, oldCurrentVertex, currentVertex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__CURRENT_VERTEX,
					oldCurrentVertex, currentVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEventPool() {
		if (eventPool == null) {
			eventPool = new EDataTypeUniqueEList<String>(String.class, this,
					StatemachinePackage.STATE_MACHINE__EVENT_POOL);
		}
		return eventPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this,
					StatemachinePackage.STATE_MACHINE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInput() {
		if (input == null) {
			input = new EDataTypeUniqueEList<String>(String.class, this, StatemachinePackage.STATE_MACHINE__INPUT);
		}
		return input;
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
		case StatemachinePackage.STATE_MACHINE__REGION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegion()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__CONNECTION_POINT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectionPoint()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubmachineState()).basicAdd(otherEnd, msgs);
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
		case StatemachinePackage.STATE_MACHINE__REGION:
			return ((InternalEList<?>) getRegion()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__CONNECTION_POINT:
			return ((InternalEList<?>) getConnectionPoint()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE:
			return ((InternalEList<?>) getSubmachineState()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__PROPERTY:
			return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
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
		case StatemachinePackage.STATE_MACHINE__REGION:
			return getRegion();
		case StatemachinePackage.STATE_MACHINE__CONNECTION_POINT:
			return getConnectionPoint();
		case StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE:
			return getSubmachineState();
		case StatemachinePackage.STATE_MACHINE__CURRENT_VERTEX:
			if (resolve)
				return getCurrentVertex();
			return basicGetCurrentVertex();
		case StatemachinePackage.STATE_MACHINE__EVENT_POOL:
			return getEventPool();
		case StatemachinePackage.STATE_MACHINE__PROPERTY:
			return getProperty();
		case StatemachinePackage.STATE_MACHINE__INPUT:
			return getInput();
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
		case StatemachinePackage.STATE_MACHINE__REGION:
			getRegion().clear();
			getRegion().addAll((Collection<? extends Region>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__CONNECTION_POINT:
			getConnectionPoint().clear();
			getConnectionPoint().addAll((Collection<? extends Pseudostate>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE:
			getSubmachineState().clear();
			getSubmachineState().addAll((Collection<? extends State>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENT_VERTEX:
			setCurrentVertex((Vertex) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__EVENT_POOL:
			getEventPool().clear();
			getEventPool().addAll((Collection<? extends String>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection<? extends Property>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends String>) newValue);
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
		case StatemachinePackage.STATE_MACHINE__REGION:
			getRegion().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__CONNECTION_POINT:
			getConnectionPoint().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE:
			getSubmachineState().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENT_VERTEX:
			setCurrentVertex((Vertex) null);
			return;
		case StatemachinePackage.STATE_MACHINE__EVENT_POOL:
			getEventPool().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__PROPERTY:
			getProperty().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__INPUT:
			getInput().clear();
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
		case StatemachinePackage.STATE_MACHINE__REGION:
			return region != null && !region.isEmpty();
		case StatemachinePackage.STATE_MACHINE__CONNECTION_POINT:
			return connectionPoint != null && !connectionPoint.isEmpty();
		case StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE:
			return submachineState != null && !submachineState.isEmpty();
		case StatemachinePackage.STATE_MACHINE__CURRENT_VERTEX:
			return currentVertex != null;
		case StatemachinePackage.STATE_MACHINE__EVENT_POOL:
			return eventPool != null && !eventPool.isEmpty();
		case StatemachinePackage.STATE_MACHINE__PROPERTY:
			return property != null && !property.isEmpty();
		case StatemachinePackage.STATE_MACHINE__INPUT:
			return input != null && !input.isEmpty();
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
		result.append(" (eventPool: ");
		result.append(eventPool);
		result.append(", input: ");
		result.append(input);
		result.append(')');
		return result.toString();
	}

} //StateMachineImpl
