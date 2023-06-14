/**
 */
package ching.ProblemFrame.impl;

import ching.ProblemFrame.ConstrainingRequirementReference;
import ching.ProblemFrame.Domain;
import ching.ProblemFrame.ProblemFramePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraining Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.impl.ConstrainingRequirementReferenceImpl#getConstrains <em>Constrains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstrainingRequirementReferenceImpl extends ReferenceImpl implements ConstrainingRequirementReference {
	/**
	 * The cached value of the '{@link #getConstrains() <em>Constrains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrains()
	 * @generated
	 * @ordered
	 */
	protected Domain constrains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainingRequirementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemFramePackage.Literals.CONSTRAINING_REQUIREMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getConstrains() {
		if (constrains != null && constrains.eIsProxy()) {
			InternalEObject oldConstrains = (InternalEObject) constrains;
			constrains = (Domain) eResolveProxy(oldConstrains);
			if (constrains != oldConstrains) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS, oldConstrains,
							constrains));
			}
		}
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetConstrains() {
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrains(Domain newConstrains) {
		Domain oldConstrains = constrains;
		constrains = newConstrains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS, oldConstrains, constrains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS:
			if (resolve)
				return getConstrains();
			return basicGetConstrains();
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
		case ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS:
			setConstrains((Domain) newValue);
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
		case ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS:
			setConstrains((Domain) null);
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
		case ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS:
			return constrains != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstrainingRequirementReferenceImpl
