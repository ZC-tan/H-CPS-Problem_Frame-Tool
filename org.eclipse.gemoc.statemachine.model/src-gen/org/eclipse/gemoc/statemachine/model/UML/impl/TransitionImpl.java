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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.statemachine.model.UML.Behavior;
import org.eclipse.gemoc.statemachine.model.UML.Constraint;
import org.eclipse.gemoc.statemachine.model.UML.Region;
import org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage;
import org.eclipse.gemoc.statemachine.model.UML.Transition;
import org.eclipse.gemoc.statemachine.model.UML.TransitionKind;
import org.eclipse.gemoc.statemachine.model.UML.Trigger;
import org.eclipse.gemoc.statemachine.model.UML.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamespaceImpl implements Transition {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionKind KIND_EDEFAULT = TransitionKind.EXTERNAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransitionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Constraint guard;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected Behavior effect;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Vertex target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Vertex source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(TransitionKind newKind) {
		TransitionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region getContainer() {
		if (eContainerFeatureID() != StatemachinePackage.TRANSITION__CONTAINER)
			return null;
		return (Region) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, StatemachinePackage.TRANSITION__CONTAINER, msgs);
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
				|| (eContainerFeatureID() != StatemachinePackage.TRANSITION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, StatemachinePackage.REGION__TRANSITION,
						Region.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__CONTAINER,
					newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					StatemachinePackage.TRANSITION__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Constraint newGuard, NotificationChain msgs) {
		Constraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.TRANSITION__GUARD, oldGuard, newGuard);
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
	public void setGuard(Constraint newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD, newGuard,
					newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(Behavior newEffect, NotificationChain msgs) {
		Behavior oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.TRANSITION__EFFECT, oldEffect, newEffect);
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
	public void setEffect(Behavior newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject) effect).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject) newEffect).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__EFFECT, newEffect,
					newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vertex getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Vertex) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Vertex newTarget, NotificationChain msgs) {
		Vertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.TRANSITION__TARGET, oldTarget, newTarget);
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
	public void setTarget(Vertex newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, StatemachinePackage.VERTEX__INCOMING,
						Vertex.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, StatemachinePackage.VERTEX__INCOMING,
						Vertex.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Vertex) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Vertex newSource, NotificationChain msgs) {
		Vertex oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.TRANSITION__SOURCE, oldSource, newSource);
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
	public void setSource(Vertex newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, StatemachinePackage.VERTEX__OUTGOING,
						Vertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, StatemachinePackage.VERTEX__OUTGOING,
						Vertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.TRANSITION__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((Region) otherEnd, msgs);
		case StatemachinePackage.TRANSITION__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, StatemachinePackage.VERTEX__INCOMING,
						Vertex.class, msgs);
			return basicSetTarget((Vertex) otherEnd, msgs);
		case StatemachinePackage.TRANSITION__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, StatemachinePackage.VERTEX__OUTGOING,
						Vertex.class, msgs);
			return basicSetSource((Vertex) otherEnd, msgs);
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
		case StatemachinePackage.TRANSITION__CONTAINER:
			return basicSetContainer(null, msgs);
		case StatemachinePackage.TRANSITION__TRIGGER:
			return ((InternalEList<?>) getTrigger()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.TRANSITION__GUARD:
			return basicSetGuard(null, msgs);
		case StatemachinePackage.TRANSITION__EFFECT:
			return basicSetEffect(null, msgs);
		case StatemachinePackage.TRANSITION__TARGET:
			return basicSetTarget(null, msgs);
		case StatemachinePackage.TRANSITION__SOURCE:
			return basicSetSource(null, msgs);
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
		case StatemachinePackage.TRANSITION__CONTAINER:
			return eInternalContainer().eInverseRemove(this, StatemachinePackage.REGION__TRANSITION, Region.class,
					msgs);
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
		case StatemachinePackage.TRANSITION__KIND:
			return getKind();
		case StatemachinePackage.TRANSITION__CONTAINER:
			return getContainer();
		case StatemachinePackage.TRANSITION__TRIGGER:
			return getTrigger();
		case StatemachinePackage.TRANSITION__GUARD:
			return getGuard();
		case StatemachinePackage.TRANSITION__EFFECT:
			return getEffect();
		case StatemachinePackage.TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case StatemachinePackage.TRANSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
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
		case StatemachinePackage.TRANSITION__KIND:
			setKind((TransitionKind) newValue);
			return;
		case StatemachinePackage.TRANSITION__CONTAINER:
			setContainer((Region) newValue);
			return;
		case StatemachinePackage.TRANSITION__TRIGGER:
			getTrigger().clear();
			getTrigger().addAll((Collection<? extends Trigger>) newValue);
			return;
		case StatemachinePackage.TRANSITION__GUARD:
			setGuard((Constraint) newValue);
			return;
		case StatemachinePackage.TRANSITION__EFFECT:
			setEffect((Behavior) newValue);
			return;
		case StatemachinePackage.TRANSITION__TARGET:
			setTarget((Vertex) newValue);
			return;
		case StatemachinePackage.TRANSITION__SOURCE:
			setSource((Vertex) newValue);
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
		case StatemachinePackage.TRANSITION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case StatemachinePackage.TRANSITION__CONTAINER:
			setContainer((Region) null);
			return;
		case StatemachinePackage.TRANSITION__TRIGGER:
			getTrigger().clear();
			return;
		case StatemachinePackage.TRANSITION__GUARD:
			setGuard((Constraint) null);
			return;
		case StatemachinePackage.TRANSITION__EFFECT:
			setEffect((Behavior) null);
			return;
		case StatemachinePackage.TRANSITION__TARGET:
			setTarget((Vertex) null);
			return;
		case StatemachinePackage.TRANSITION__SOURCE:
			setSource((Vertex) null);
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
		case StatemachinePackage.TRANSITION__KIND:
			return kind != KIND_EDEFAULT;
		case StatemachinePackage.TRANSITION__CONTAINER:
			return getContainer() != null;
		case StatemachinePackage.TRANSITION__TRIGGER:
			return trigger != null && !trigger.isEmpty();
		case StatemachinePackage.TRANSITION__GUARD:
			return guard != null;
		case StatemachinePackage.TRANSITION__EFFECT:
			return effect != null;
		case StatemachinePackage.TRANSITION__TARGET:
			return target != null;
		case StatemachinePackage.TRANSITION__SOURCE:
			return source != null;
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

} //TransitionImpl
