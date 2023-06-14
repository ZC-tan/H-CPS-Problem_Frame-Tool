/**
 */
package ching.ProblemFrame.impl;

import ching.ProblemFrame.Domain;
import ching.ProblemFrame.Interface;
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
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.impl.InterfaceImpl#getSharedPhenomena <em>Shared Phenomena</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.InterfaceImpl#getTargetDomain <em>Target Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.InterfaceImpl#getSourceDomain <em>Source Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.InterfaceImpl#getBeginControlSharedPhenomena <em>Begin Control Shared Phenomena</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.InterfaceImpl#getEndControlSharedPhenomena <em>End Control Shared Phenomena</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
	/**
	 * The cached value of the '{@link #getSharedPhenomena() <em>Shared Phenomena</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedPhenomena()
	 * @generated
	 * @ordered
	 */
	protected EList<Phenomenon> sharedPhenomena;

	/**
	 * The cached value of the '{@link #getTargetDomain() <em>Target Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain targetDomain;

	/**
	 * The cached value of the '{@link #getSourceDomain() <em>Source Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain sourceDomain;

	/**
	 * The default value of the '{@link #getBeginControlSharedPhenomena() <em>Begin Control Shared Phenomena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginControlSharedPhenomena()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGIN_CONTROL_SHARED_PHENOMENA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginControlSharedPhenomena() <em>Begin Control Shared Phenomena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginControlSharedPhenomena()
	 * @generated
	 * @ordered
	 */
	protected String beginControlSharedPhenomena = BEGIN_CONTROL_SHARED_PHENOMENA_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndControlSharedPhenomena() <em>End Control Shared Phenomena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndControlSharedPhenomena()
	 * @generated
	 * @ordered
	 */
	protected static final String END_CONTROL_SHARED_PHENOMENA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndControlSharedPhenomena() <em>End Control Shared Phenomena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndControlSharedPhenomena()
	 * @generated
	 * @ordered
	 */
	protected String endControlSharedPhenomena = END_CONTROL_SHARED_PHENOMENA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemFramePackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phenomenon> getSharedPhenomena() {
		if (sharedPhenomena == null) {
			sharedPhenomena = new EObjectContainmentEList<Phenomenon>(Phenomenon.class, this,
					ProblemFramePackage.INTERFACE__SHARED_PHENOMENA);
		}
		return sharedPhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTargetDomain() {
		if (targetDomain != null && targetDomain.eIsProxy()) {
			InternalEObject oldTargetDomain = (InternalEObject) targetDomain;
			targetDomain = (Domain) eResolveProxy(oldTargetDomain);
			if (targetDomain != oldTargetDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProblemFramePackage.INTERFACE__TARGET_DOMAIN, oldTargetDomain, targetDomain));
			}
		}
		return targetDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetTargetDomain() {
		return targetDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDomain(Domain newTargetDomain) {
		Domain oldTargetDomain = targetDomain;
		targetDomain = newTargetDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemFramePackage.INTERFACE__TARGET_DOMAIN,
					oldTargetDomain, targetDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getSourceDomain() {
		if (sourceDomain != null && sourceDomain.eIsProxy()) {
			InternalEObject oldSourceDomain = (InternalEObject) sourceDomain;
			sourceDomain = (Domain) eResolveProxy(oldSourceDomain);
			if (sourceDomain != oldSourceDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProblemFramePackage.INTERFACE__SOURCE_DOMAIN, oldSourceDomain, sourceDomain));
			}
		}
		return sourceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetSourceDomain() {
		return sourceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDomain(Domain newSourceDomain) {
		Domain oldSourceDomain = sourceDomain;
		sourceDomain = newSourceDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemFramePackage.INTERFACE__SOURCE_DOMAIN,
					oldSourceDomain, sourceDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeginControlSharedPhenomena() {
		return beginControlSharedPhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginControlSharedPhenomena(String newBeginControlSharedPhenomena) {
		String oldBeginControlSharedPhenomena = beginControlSharedPhenomena;
		beginControlSharedPhenomena = newBeginControlSharedPhenomena;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProblemFramePackage.INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA, oldBeginControlSharedPhenomena,
					beginControlSharedPhenomena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndControlSharedPhenomena() {
		return endControlSharedPhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndControlSharedPhenomena(String newEndControlSharedPhenomena) {
		String oldEndControlSharedPhenomena = endControlSharedPhenomena;
		endControlSharedPhenomena = newEndControlSharedPhenomena;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProblemFramePackage.INTERFACE__END_CONTROL_SHARED_PHENOMENA, oldEndControlSharedPhenomena,
					endControlSharedPhenomena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemFramePackage.INTERFACE__SHARED_PHENOMENA:
			return ((InternalEList<?>) getSharedPhenomena()).basicRemove(otherEnd, msgs);
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
		case ProblemFramePackage.INTERFACE__SHARED_PHENOMENA:
			return getSharedPhenomena();
		case ProblemFramePackage.INTERFACE__TARGET_DOMAIN:
			if (resolve)
				return getTargetDomain();
			return basicGetTargetDomain();
		case ProblemFramePackage.INTERFACE__SOURCE_DOMAIN:
			if (resolve)
				return getSourceDomain();
			return basicGetSourceDomain();
		case ProblemFramePackage.INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA:
			return getBeginControlSharedPhenomena();
		case ProblemFramePackage.INTERFACE__END_CONTROL_SHARED_PHENOMENA:
			return getEndControlSharedPhenomena();
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
		case ProblemFramePackage.INTERFACE__SHARED_PHENOMENA:
			getSharedPhenomena().clear();
			getSharedPhenomena().addAll((Collection<? extends Phenomenon>) newValue);
			return;
		case ProblemFramePackage.INTERFACE__TARGET_DOMAIN:
			setTargetDomain((Domain) newValue);
			return;
		case ProblemFramePackage.INTERFACE__SOURCE_DOMAIN:
			setSourceDomain((Domain) newValue);
			return;
		case ProblemFramePackage.INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA:
			setBeginControlSharedPhenomena((String) newValue);
			return;
		case ProblemFramePackage.INTERFACE__END_CONTROL_SHARED_PHENOMENA:
			setEndControlSharedPhenomena((String) newValue);
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
		case ProblemFramePackage.INTERFACE__SHARED_PHENOMENA:
			getSharedPhenomena().clear();
			return;
		case ProblemFramePackage.INTERFACE__TARGET_DOMAIN:
			setTargetDomain((Domain) null);
			return;
		case ProblemFramePackage.INTERFACE__SOURCE_DOMAIN:
			setSourceDomain((Domain) null);
			return;
		case ProblemFramePackage.INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA:
			setBeginControlSharedPhenomena(BEGIN_CONTROL_SHARED_PHENOMENA_EDEFAULT);
			return;
		case ProblemFramePackage.INTERFACE__END_CONTROL_SHARED_PHENOMENA:
			setEndControlSharedPhenomena(END_CONTROL_SHARED_PHENOMENA_EDEFAULT);
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
		case ProblemFramePackage.INTERFACE__SHARED_PHENOMENA:
			return sharedPhenomena != null && !sharedPhenomena.isEmpty();
		case ProblemFramePackage.INTERFACE__TARGET_DOMAIN:
			return targetDomain != null;
		case ProblemFramePackage.INTERFACE__SOURCE_DOMAIN:
			return sourceDomain != null;
		case ProblemFramePackage.INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA:
			return BEGIN_CONTROL_SHARED_PHENOMENA_EDEFAULT == null ? beginControlSharedPhenomena != null
					: !BEGIN_CONTROL_SHARED_PHENOMENA_EDEFAULT.equals(beginControlSharedPhenomena);
		case ProblemFramePackage.INTERFACE__END_CONTROL_SHARED_PHENOMENA:
			return END_CONTROL_SHARED_PHENOMENA_EDEFAULT == null ? endControlSharedPhenomena != null
					: !END_CONTROL_SHARED_PHENOMENA_EDEFAULT.equals(endControlSharedPhenomena);
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
		result.append(" (beginControlSharedPhenomena: ");
		result.append(beginControlSharedPhenomena);
		result.append(", endControlSharedPhenomena: ");
		result.append(endControlSharedPhenomena);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
