/**
 */
package ching.ProblemFrame.impl;

import ching.ProblemFrame.Domain;
import ching.ProblemFrame.Phenomenon;
import ching.ProblemFrame.ProblemFramePackage;
import ching.ProblemFrame.RequirementReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.impl.RequirementReferenceImpl#getPhenomenon <em>Phenomenon</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.RequirementReferenceImpl#getReqReference <em>Req Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementReferenceImpl extends ReferenceImpl implements RequirementReference {
	/**
	 * The cached value of the '{@link #getPhenomenon() <em>Phenomenon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhenomenon()
	 * @generated
	 * @ordered
	 */
	protected EList<Phenomenon> phenomenon;

	/**
	 * The cached value of the '{@link #getReqReference() <em>Req Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqReference()
	 * @generated
	 * @ordered
	 */
	protected Domain reqReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemFramePackage.Literals.REQUIREMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phenomenon> getPhenomenon() {
		if (phenomenon == null) {
			phenomenon = new EObjectContainmentEList<Phenomenon>(Phenomenon.class, this,
					ProblemFramePackage.REQUIREMENT_REFERENCE__PHENOMENON);
		}
		return phenomenon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getReqReference() {
		if (reqReference != null && reqReference.eIsProxy()) {
			InternalEObject oldReqReference = (InternalEObject) reqReference;
			reqReference = (Domain) eResolveProxy(oldReqReference);
			if (reqReference != oldReqReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProblemFramePackage.REQUIREMENT_REFERENCE__REQ_REFERENCE, oldReqReference, reqReference));
			}
		}
		return reqReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetReqReference() {
		return reqReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqReference(Domain newReqReference) {
		Domain oldReqReference = reqReference;
		reqReference = newReqReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProblemFramePackage.REQUIREMENT_REFERENCE__REQ_REFERENCE, oldReqReference, reqReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemFramePackage.REQUIREMENT_REFERENCE__PHENOMENON:
			return ((InternalEList<?>) getPhenomenon()).basicRemove(otherEnd, msgs);
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
		case ProblemFramePackage.REQUIREMENT_REFERENCE__PHENOMENON:
			return getPhenomenon();
		case ProblemFramePackage.REQUIREMENT_REFERENCE__REQ_REFERENCE:
			if (resolve)
				return getReqReference();
			return basicGetReqReference();
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
		case ProblemFramePackage.REQUIREMENT_REFERENCE__PHENOMENON:
			getPhenomenon().clear();
			getPhenomenon().addAll((Collection<? extends Phenomenon>) newValue);
			return;
		case ProblemFramePackage.REQUIREMENT_REFERENCE__REQ_REFERENCE:
			setReqReference((Domain) newValue);
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
		case ProblemFramePackage.REQUIREMENT_REFERENCE__PHENOMENON:
			getPhenomenon().clear();
			return;
		case ProblemFramePackage.REQUIREMENT_REFERENCE__REQ_REFERENCE:
			setReqReference((Domain) null);
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
		case ProblemFramePackage.REQUIREMENT_REFERENCE__PHENOMENON:
			return phenomenon != null && !phenomenon.isEmpty();
		case ProblemFramePackage.REQUIREMENT_REFERENCE__REQ_REFERENCE:
			return reqReference != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementReferenceImpl
