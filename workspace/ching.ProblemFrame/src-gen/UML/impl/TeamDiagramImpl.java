/**
 */
package UML.impl;

import UML.Human;
import UML.HumanToMachineRelation;
import UML.Machine;
import UML.MachineToHumanRelation;
import UML.TeamDiagram;
import UML.UMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.TeamDiagramImpl#getHuman <em>Human</em>}</li>
 *   <li>{@link UML.impl.TeamDiagramImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link UML.impl.TeamDiagramImpl#getHumantomachinerelation <em>Humantomachinerelation</em>}</li>
 *   <li>{@link UML.impl.TeamDiagramImpl#getMachinetohumanrelation <em>Machinetohumanrelation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamDiagramImpl extends MinimalEObjectImpl.Container implements TeamDiagram {
	/**
	 * The cached value of the '{@link #getHuman() <em>Human</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHuman()
	 * @generated
	 * @ordered
	 */
	protected EList<Human> human;

	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> machine;

	/**
	 * The cached value of the '{@link #getHumantomachinerelation() <em>Humantomachinerelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumantomachinerelation()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanToMachineRelation> humantomachinerelation;

	/**
	 * The cached value of the '{@link #getMachinetohumanrelation() <em>Machinetohumanrelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachinetohumanrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<MachineToHumanRelation> machinetohumanrelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEAM_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Human> getHuman() {
		if (human == null) {
			human = new EObjectContainmentEList<Human>(Human.class, this, UMLPackage.TEAM_DIAGRAM__HUMAN);
		}
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getMachine() {
		if (machine == null) {
			machine = new EObjectContainmentEList<Machine>(Machine.class, this, UMLPackage.TEAM_DIAGRAM__MACHINE);
		}
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanToMachineRelation> getHumantomachinerelation() {
		if (humantomachinerelation == null) {
			humantomachinerelation = new EObjectContainmentEList<HumanToMachineRelation>(HumanToMachineRelation.class,
					this, UMLPackage.TEAM_DIAGRAM__HUMANTOMACHINERELATION);
		}
		return humantomachinerelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MachineToHumanRelation> getMachinetohumanrelation() {
		if (machinetohumanrelation == null) {
			machinetohumanrelation = new EObjectContainmentEList<MachineToHumanRelation>(MachineToHumanRelation.class,
					this, UMLPackage.TEAM_DIAGRAM__MACHINETOHUMANRELATION);
		}
		return machinetohumanrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UMLPackage.TEAM_DIAGRAM__HUMAN:
			return ((InternalEList<?>) getHuman()).basicRemove(otherEnd, msgs);
		case UMLPackage.TEAM_DIAGRAM__MACHINE:
			return ((InternalEList<?>) getMachine()).basicRemove(otherEnd, msgs);
		case UMLPackage.TEAM_DIAGRAM__HUMANTOMACHINERELATION:
			return ((InternalEList<?>) getHumantomachinerelation()).basicRemove(otherEnd, msgs);
		case UMLPackage.TEAM_DIAGRAM__MACHINETOHUMANRELATION:
			return ((InternalEList<?>) getMachinetohumanrelation()).basicRemove(otherEnd, msgs);
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
		case UMLPackage.TEAM_DIAGRAM__HUMAN:
			return getHuman();
		case UMLPackage.TEAM_DIAGRAM__MACHINE:
			return getMachine();
		case UMLPackage.TEAM_DIAGRAM__HUMANTOMACHINERELATION:
			return getHumantomachinerelation();
		case UMLPackage.TEAM_DIAGRAM__MACHINETOHUMANRELATION:
			return getMachinetohumanrelation();
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
		case UMLPackage.TEAM_DIAGRAM__HUMAN:
			getHuman().clear();
			getHuman().addAll((Collection<? extends Human>) newValue);
			return;
		case UMLPackage.TEAM_DIAGRAM__MACHINE:
			getMachine().clear();
			getMachine().addAll((Collection<? extends Machine>) newValue);
			return;
		case UMLPackage.TEAM_DIAGRAM__HUMANTOMACHINERELATION:
			getHumantomachinerelation().clear();
			getHumantomachinerelation().addAll((Collection<? extends HumanToMachineRelation>) newValue);
			return;
		case UMLPackage.TEAM_DIAGRAM__MACHINETOHUMANRELATION:
			getMachinetohumanrelation().clear();
			getMachinetohumanrelation().addAll((Collection<? extends MachineToHumanRelation>) newValue);
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
		case UMLPackage.TEAM_DIAGRAM__HUMAN:
			getHuman().clear();
			return;
		case UMLPackage.TEAM_DIAGRAM__MACHINE:
			getMachine().clear();
			return;
		case UMLPackage.TEAM_DIAGRAM__HUMANTOMACHINERELATION:
			getHumantomachinerelation().clear();
			return;
		case UMLPackage.TEAM_DIAGRAM__MACHINETOHUMANRELATION:
			getMachinetohumanrelation().clear();
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
		case UMLPackage.TEAM_DIAGRAM__HUMAN:
			return human != null && !human.isEmpty();
		case UMLPackage.TEAM_DIAGRAM__MACHINE:
			return machine != null && !machine.isEmpty();
		case UMLPackage.TEAM_DIAGRAM__HUMANTOMACHINERELATION:
			return humantomachinerelation != null && !humantomachinerelation.isEmpty();
		case UMLPackage.TEAM_DIAGRAM__MACHINETOHUMANRELATION:
			return machinetohumanrelation != null && !machinetohumanrelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TeamDiagramImpl
