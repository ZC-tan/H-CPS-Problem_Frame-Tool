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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.statemachine.model.UML.Behavior;
import org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference;
import org.eclipse.gemoc.statemachine.model.UML.Constraint;
import org.eclipse.gemoc.statemachine.model.UML.Pseudostate;
import org.eclipse.gemoc.statemachine.model.UML.Region;
import org.eclipse.gemoc.statemachine.model.UML.State;
import org.eclipse.gemoc.statemachine.model.UML.StateMachine;
import org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage;
import org.eclipse.gemoc.statemachine.model.UML.Transition;
import org.eclipse.gemoc.statemachine.model.UML.Trigger;
import org.eclipse.gemoc.statemachine.model.UML.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl#isIsSubmachineState <em>Is Submachine State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamespaceImpl implements State {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

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
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPointReference> connection;

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
	 * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine submachine;

	/**
	 * The cached value of the '{@link #getDeferrableTrigger() <em>Deferrable Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> deferrableTrigger;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint stateInvariant;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORTHOGONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrthogonal = IS_ORTHOGONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimple = IS_SIMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBMACHINE_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubmachineState = IS_SUBMACHINE_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region getContainer() {
		if (eContainerFeatureID() != StatemachinePackage.STATE__CONTAINER)
			return null;
		return (Region) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, StatemachinePackage.STATE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer()
				|| (eContainerFeatureID() != StatemachinePackage.STATE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, StatemachinePackage.REGION__SUBVERTEX,
						Region.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					StatemachinePackage.STATE__INCOMING, StatemachinePackage.TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					StatemachinePackage.STATE__OUTGOING, StatemachinePackage.TRANSITION__SOURCE);
		}
		return outgoing;
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
					StatemachinePackage.STATE__REGION, StatemachinePackage.REGION__STATE);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionPointReference> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentWithInverseEList<ConnectionPointReference>(
					ConnectionPointReference.class, this, StatemachinePackage.STATE__CONNECTION,
					StatemachinePackage.CONNECTION_POINT_REFERENCE__STATE);
		}
		return connection;
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
					StatemachinePackage.STATE__CONNECTION_POINT, StatemachinePackage.PSEUDOSTATE__STATE);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine getSubmachine() {
		if (submachine != null && submachine.eIsProxy()) {
			InternalEObject oldSubmachine = (InternalEObject) submachine;
			submachine = (StateMachine) eResolveProxy(oldSubmachine);
			if (submachine != oldSubmachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.STATE__SUBMACHINE,
							oldSubmachine, submachine));
			}
		}
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetSubmachine() {
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmachine(StateMachine newSubmachine, NotificationChain msgs) {
		StateMachine oldSubmachine = submachine;
		submachine = newSubmachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.STATE__SUBMACHINE, oldSubmachine, newSubmachine);
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
	@Override
	public void setSubmachine(StateMachine newSubmachine) {
		if (newSubmachine != submachine) {
			NotificationChain msgs = null;
			if (submachine != null)
				msgs = ((InternalEObject) submachine).eInverseRemove(this,
						StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
			if (newSubmachine != null)
				msgs = ((InternalEObject) newSubmachine).eInverseAdd(this,
						StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
			msgs = basicSetSubmachine(newSubmachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__SUBMACHINE, newSubmachine,
					newSubmachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getDeferrableTrigger() {
		if (deferrableTrigger == null) {
			deferrableTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					StatemachinePackage.STATE__DEFERRABLE_TRIGGER);
		}
		return deferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint getStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(Constraint newStateInvariant, NotificationChain msgs) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.STATE__STATE_INVARIANT, oldStateInvariant, newStateInvariant);
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
	@Override
	public void setStateInvariant(Constraint newStateInvariant) {
		if (newStateInvariant != stateInvariant) {
			NotificationChain msgs = null;
			if (stateInvariant != null)
				msgs = ((InternalEObject) stateInvariant).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__STATE_INVARIANT, null, msgs);
			if (newStateInvariant != null)
				msgs = ((InternalEObject) newStateInvariant).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__STATE_INVARIANT, null, msgs);
			msgs = basicSetStateInvariant(newStateInvariant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__STATE_INVARIANT,
					newStateInvariant, newStateInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Behavior newEntry, NotificationChain msgs) {
		Behavior oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.STATE__ENTRY, oldEntry, newEntry);
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
	@Override
	public void setEntry(Behavior newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject) entry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject) newEntry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ENTRY, newEntry,
					newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Behavior newExit, NotificationChain msgs) {
		Behavior oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.STATE__EXIT, oldExit, newExit);
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
	@Override
	public void setExit(Behavior newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject) exit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject) newExit).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Behavior newDoActivity, NotificationChain msgs) {
		Behavior oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
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
	@Override
	public void setDoActivity(Behavior newDoActivity) {
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject) doActivity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__DO_ACTIVITY, null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject) newDoActivity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE__DO_ACTIVITY, null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__DO_ACTIVITY, newDoActivity,
					newDoActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__IS_COMPOSITE,
					oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsOrthogonal() {
		return isOrthogonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOrthogonal(boolean newIsOrthogonal) {
		boolean oldIsOrthogonal = isOrthogonal;
		isOrthogonal = newIsOrthogonal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__IS_ORTHOGONAL,
					oldIsOrthogonal, isOrthogonal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSimple() {
		return isSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSimple(boolean newIsSimple) {
		boolean oldIsSimple = isSimple;
		isSimple = newIsSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__IS_SIMPLE, oldIsSimple,
					isSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSubmachineState() {
		return isSubmachineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSubmachineState(boolean newIsSubmachineState) {
		boolean oldIsSubmachineState = isSubmachineState;
		isSubmachineState = newIsSubmachineState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__IS_SUBMACHINE_STATE,
					oldIsSubmachineState, isSubmachineState));
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
		case StatemachinePackage.STATE__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((Region) otherEnd, msgs);
		case StatemachinePackage.STATE__INCOMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.STATE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.STATE__REGION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegion()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.STATE__CONNECTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnection()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.STATE__CONNECTION_POINT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectionPoint()).basicAdd(otherEnd, msgs);
		case StatemachinePackage.STATE__SUBMACHINE:
			if (submachine != null)
				msgs = ((InternalEObject) submachine).eInverseRemove(this,
						StatemachinePackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
			return basicSetSubmachine((StateMachine) otherEnd, msgs);
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
		case StatemachinePackage.STATE__CONTAINER:
			return basicSetContainer(null, msgs);
		case StatemachinePackage.STATE__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE__REGION:
			return ((InternalEList<?>) getRegion()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE__CONNECTION:
			return ((InternalEList<?>) getConnection()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE__CONNECTION_POINT:
			return ((InternalEList<?>) getConnectionPoint()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE__SUBMACHINE:
			return basicSetSubmachine(null, msgs);
		case StatemachinePackage.STATE__DEFERRABLE_TRIGGER:
			return ((InternalEList<?>) getDeferrableTrigger()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE__STATE_INVARIANT:
			return basicSetStateInvariant(null, msgs);
		case StatemachinePackage.STATE__ENTRY:
			return basicSetEntry(null, msgs);
		case StatemachinePackage.STATE__EXIT:
			return basicSetExit(null, msgs);
		case StatemachinePackage.STATE__DO_ACTIVITY:
			return basicSetDoActivity(null, msgs);
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
		case StatemachinePackage.STATE__CONTAINER:
			return eInternalContainer().eInverseRemove(this, StatemachinePackage.REGION__SUBVERTEX, Region.class, msgs);
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
		case StatemachinePackage.STATE__CONTAINER:
			return getContainer();
		case StatemachinePackage.STATE__INCOMING:
			return getIncoming();
		case StatemachinePackage.STATE__OUTGOING:
			return getOutgoing();
		case StatemachinePackage.STATE__REGION:
			return getRegion();
		case StatemachinePackage.STATE__CONNECTION:
			return getConnection();
		case StatemachinePackage.STATE__CONNECTION_POINT:
			return getConnectionPoint();
		case StatemachinePackage.STATE__SUBMACHINE:
			if (resolve)
				return getSubmachine();
			return basicGetSubmachine();
		case StatemachinePackage.STATE__DEFERRABLE_TRIGGER:
			return getDeferrableTrigger();
		case StatemachinePackage.STATE__STATE_INVARIANT:
			return getStateInvariant();
		case StatemachinePackage.STATE__ENTRY:
			return getEntry();
		case StatemachinePackage.STATE__EXIT:
			return getExit();
		case StatemachinePackage.STATE__DO_ACTIVITY:
			return getDoActivity();
		case StatemachinePackage.STATE__IS_COMPOSITE:
			return isIsComposite();
		case StatemachinePackage.STATE__IS_ORTHOGONAL:
			return isIsOrthogonal();
		case StatemachinePackage.STATE__IS_SIMPLE:
			return isIsSimple();
		case StatemachinePackage.STATE__IS_SUBMACHINE_STATE:
			return isIsSubmachineState();
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
		case StatemachinePackage.STATE__CONTAINER:
			setContainer((Region) newValue);
			return;
		case StatemachinePackage.STATE__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends Transition>) newValue);
			return;
		case StatemachinePackage.STATE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends Transition>) newValue);
			return;
		case StatemachinePackage.STATE__REGION:
			getRegion().clear();
			getRegion().addAll((Collection<? extends Region>) newValue);
			return;
		case StatemachinePackage.STATE__CONNECTION:
			getConnection().clear();
			getConnection().addAll((Collection<? extends ConnectionPointReference>) newValue);
			return;
		case StatemachinePackage.STATE__CONNECTION_POINT:
			getConnectionPoint().clear();
			getConnectionPoint().addAll((Collection<? extends Pseudostate>) newValue);
			return;
		case StatemachinePackage.STATE__SUBMACHINE:
			setSubmachine((StateMachine) newValue);
			return;
		case StatemachinePackage.STATE__DEFERRABLE_TRIGGER:
			getDeferrableTrigger().clear();
			getDeferrableTrigger().addAll((Collection<? extends Trigger>) newValue);
			return;
		case StatemachinePackage.STATE__STATE_INVARIANT:
			setStateInvariant((Constraint) newValue);
			return;
		case StatemachinePackage.STATE__ENTRY:
			setEntry((Behavior) newValue);
			return;
		case StatemachinePackage.STATE__EXIT:
			setExit((Behavior) newValue);
			return;
		case StatemachinePackage.STATE__DO_ACTIVITY:
			setDoActivity((Behavior) newValue);
			return;
		case StatemachinePackage.STATE__IS_COMPOSITE:
			setIsComposite((Boolean) newValue);
			return;
		case StatemachinePackage.STATE__IS_ORTHOGONAL:
			setIsOrthogonal((Boolean) newValue);
			return;
		case StatemachinePackage.STATE__IS_SIMPLE:
			setIsSimple((Boolean) newValue);
			return;
		case StatemachinePackage.STATE__IS_SUBMACHINE_STATE:
			setIsSubmachineState((Boolean) newValue);
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
		case StatemachinePackage.STATE__CONTAINER:
			setContainer((Region) null);
			return;
		case StatemachinePackage.STATE__INCOMING:
			getIncoming().clear();
			return;
		case StatemachinePackage.STATE__OUTGOING:
			getOutgoing().clear();
			return;
		case StatemachinePackage.STATE__REGION:
			getRegion().clear();
			return;
		case StatemachinePackage.STATE__CONNECTION:
			getConnection().clear();
			return;
		case StatemachinePackage.STATE__CONNECTION_POINT:
			getConnectionPoint().clear();
			return;
		case StatemachinePackage.STATE__SUBMACHINE:
			setSubmachine((StateMachine) null);
			return;
		case StatemachinePackage.STATE__DEFERRABLE_TRIGGER:
			getDeferrableTrigger().clear();
			return;
		case StatemachinePackage.STATE__STATE_INVARIANT:
			setStateInvariant((Constraint) null);
			return;
		case StatemachinePackage.STATE__ENTRY:
			setEntry((Behavior) null);
			return;
		case StatemachinePackage.STATE__EXIT:
			setExit((Behavior) null);
			return;
		case StatemachinePackage.STATE__DO_ACTIVITY:
			setDoActivity((Behavior) null);
			return;
		case StatemachinePackage.STATE__IS_COMPOSITE:
			setIsComposite(IS_COMPOSITE_EDEFAULT);
			return;
		case StatemachinePackage.STATE__IS_ORTHOGONAL:
			setIsOrthogonal(IS_ORTHOGONAL_EDEFAULT);
			return;
		case StatemachinePackage.STATE__IS_SIMPLE:
			setIsSimple(IS_SIMPLE_EDEFAULT);
			return;
		case StatemachinePackage.STATE__IS_SUBMACHINE_STATE:
			setIsSubmachineState(IS_SUBMACHINE_STATE_EDEFAULT);
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
		case StatemachinePackage.STATE__CONTAINER:
			return getContainer() != null;
		case StatemachinePackage.STATE__INCOMING:
			return incoming != null && !incoming.isEmpty();
		case StatemachinePackage.STATE__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
		case StatemachinePackage.STATE__REGION:
			return region != null && !region.isEmpty();
		case StatemachinePackage.STATE__CONNECTION:
			return connection != null && !connection.isEmpty();
		case StatemachinePackage.STATE__CONNECTION_POINT:
			return connectionPoint != null && !connectionPoint.isEmpty();
		case StatemachinePackage.STATE__SUBMACHINE:
			return submachine != null;
		case StatemachinePackage.STATE__DEFERRABLE_TRIGGER:
			return deferrableTrigger != null && !deferrableTrigger.isEmpty();
		case StatemachinePackage.STATE__STATE_INVARIANT:
			return stateInvariant != null;
		case StatemachinePackage.STATE__ENTRY:
			return entry != null;
		case StatemachinePackage.STATE__EXIT:
			return exit != null;
		case StatemachinePackage.STATE__DO_ACTIVITY:
			return doActivity != null;
		case StatemachinePackage.STATE__IS_COMPOSITE:
			return isComposite != IS_COMPOSITE_EDEFAULT;
		case StatemachinePackage.STATE__IS_ORTHOGONAL:
			return isOrthogonal != IS_ORTHOGONAL_EDEFAULT;
		case StatemachinePackage.STATE__IS_SIMPLE:
			return isSimple != IS_SIMPLE_EDEFAULT;
		case StatemachinePackage.STATE__IS_SUBMACHINE_STATE:
			return isSubmachineState != IS_SUBMACHINE_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Vertex.class) {
			switch (derivedFeatureID) {
			case StatemachinePackage.STATE__CONTAINER:
				return StatemachinePackage.VERTEX__CONTAINER;
			case StatemachinePackage.STATE__INCOMING:
				return StatemachinePackage.VERTEX__INCOMING;
			case StatemachinePackage.STATE__OUTGOING:
				return StatemachinePackage.VERTEX__OUTGOING;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Vertex.class) {
			switch (baseFeatureID) {
			case StatemachinePackage.VERTEX__CONTAINER:
				return StatemachinePackage.STATE__CONTAINER;
			case StatemachinePackage.VERTEX__INCOMING:
				return StatemachinePackage.STATE__INCOMING;
			case StatemachinePackage.VERTEX__OUTGOING:
				return StatemachinePackage.STATE__OUTGOING;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isComposite: ");
		result.append(isComposite);
		result.append(", isOrthogonal: ");
		result.append(isOrthogonal);
		result.append(", isSimple: ");
		result.append(isSimple);
		result.append(", isSubmachineState: ");
		result.append(isSubmachineState);
		result.append(')');
		return result.toString();
	}

} //StateImpl
