/**
 */
package ching.ProblemFrame.impl;

import ching.ProblemFrame.Domain;
import ching.ProblemFrame.Interface;
import ching.ProblemFrame.ProblemDiagram;
import ching.ProblemFrame.ProblemFramePackage;
import ching.ProblemFrame.Reference;
import ching.ProblemFrame.Requirement;

import ching.ProblemFrame.SystemRegion;
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
 * An implementation of the model object '<em><b>Problem Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.impl.ProblemDiagramImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.ProblemDiagramImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.ProblemDiagramImpl#getProblemName <em>Problem Name</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.ProblemDiagramImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.ProblemDiagramImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link ching.ProblemFrame.impl.ProblemDiagramImpl#getSystemregion <em>Systemregion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProblemDiagramImpl extends MinimalEObjectImpl.Container implements ProblemDiagram {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domain;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

	/**
	 * The default value of the '{@link #getProblemName() <em>Problem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblemName() <em>Problem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemName()
	 * @generated
	 * @ordered
	 */
	protected String problemName = PROBLEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The cached value of the '{@link #getSystemregion() <em>Systemregion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemregion()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemRegion> systemregion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemFramePackage.Literals.PROBLEM_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<Domain>(Domain.class, this,
					ProblemFramePackage.PROBLEM_DIAGRAM__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this,
					ProblemFramePackage.PROBLEM_DIAGRAM__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblemName() {
		return problemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemName(String newProblemName) {
		String oldProblemName = problemName;
		problemName = newProblemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemFramePackage.PROBLEM_DIAGRAM__PROBLEM_NAME,
					oldProblemName, problemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Interface>(Interface.class, this,
					ProblemFramePackage.PROBLEM_DIAGRAM__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this,
					ProblemFramePackage.PROBLEM_DIAGRAM__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemRegion> getSystemregion() {
		if (systemregion == null) {
			systemregion = new EObjectContainmentEList<SystemRegion>(SystemRegion.class, this,
					ProblemFramePackage.PROBLEM_DIAGRAM__SYSTEMREGION);
		}
		return systemregion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemFramePackage.PROBLEM_DIAGRAM__DOMAIN:
			return ((InternalEList<?>) getDomain()).basicRemove(otherEnd, msgs);
		case ProblemFramePackage.PROBLEM_DIAGRAM__REQUIREMENT:
			return ((InternalEList<?>) getRequirement()).basicRemove(otherEnd, msgs);
		case ProblemFramePackage.PROBLEM_DIAGRAM__INTERFACES:
			return ((InternalEList<?>) getInterfaces()).basicRemove(otherEnd, msgs);
		case ProblemFramePackage.PROBLEM_DIAGRAM__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
		case ProblemFramePackage.PROBLEM_DIAGRAM__SYSTEMREGION:
			return ((InternalEList<?>) getSystemregion()).basicRemove(otherEnd, msgs);
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
		case ProblemFramePackage.PROBLEM_DIAGRAM__DOMAIN:
			return getDomain();
		case ProblemFramePackage.PROBLEM_DIAGRAM__REQUIREMENT:
			return getRequirement();
		case ProblemFramePackage.PROBLEM_DIAGRAM__PROBLEM_NAME:
			return getProblemName();
		case ProblemFramePackage.PROBLEM_DIAGRAM__INTERFACES:
			return getInterfaces();
		case ProblemFramePackage.PROBLEM_DIAGRAM__REFERENCE:
			return getReference();
		case ProblemFramePackage.PROBLEM_DIAGRAM__SYSTEMREGION:
			return getSystemregion();
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
		case ProblemFramePackage.PROBLEM_DIAGRAM__DOMAIN:
			getDomain().clear();
			getDomain().addAll((Collection<? extends Domain>) newValue);
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__REQUIREMENT:
			getRequirement().clear();
			getRequirement().addAll((Collection<? extends Requirement>) newValue);
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__PROBLEM_NAME:
			setProblemName((String) newValue);
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__SYSTEMREGION:
			getSystemregion().clear();
			getSystemregion().addAll((Collection<? extends SystemRegion>) newValue);
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
		case ProblemFramePackage.PROBLEM_DIAGRAM__DOMAIN:
			getDomain().clear();
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__REQUIREMENT:
			getRequirement().clear();
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__PROBLEM_NAME:
			setProblemName(PROBLEM_NAME_EDEFAULT);
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__INTERFACES:
			getInterfaces().clear();
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__REFERENCE:
			getReference().clear();
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__SYSTEMREGION:
			getSystemregion().clear();
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
		case ProblemFramePackage.PROBLEM_DIAGRAM__DOMAIN:
			return domain != null && !domain.isEmpty();
		case ProblemFramePackage.PROBLEM_DIAGRAM__REQUIREMENT:
			return requirement != null && !requirement.isEmpty();
		case ProblemFramePackage.PROBLEM_DIAGRAM__PROBLEM_NAME:
			return PROBLEM_NAME_EDEFAULT == null ? problemName != null : !PROBLEM_NAME_EDEFAULT.equals(problemName);
		case ProblemFramePackage.PROBLEM_DIAGRAM__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		case ProblemFramePackage.PROBLEM_DIAGRAM__REFERENCE:
			return reference != null && !reference.isEmpty();
		case ProblemFramePackage.PROBLEM_DIAGRAM__SYSTEMREGION:
			return systemregion != null && !systemregion.isEmpty();
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
		result.append(" (problemName: ");
		result.append(problemName);
		result.append(')');
		return result.toString();
	}

} //ProblemDiagramImpl
