/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine To Human Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getMachineSource <em>Machine Source</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getHumanTarget <em>Human Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getMachineToHumanRelation()
 * @model
 * @generated
 */
public interface MachineToHumanRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Machine Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Source</em>' reference.
	 * @see #setMachineSource(Machine)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getMachineToHumanRelation_MachineSource()
	 * @model
	 * @generated
	 */
	Machine getMachineSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getMachineSource <em>Machine Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Source</em>' reference.
	 * @see #getMachineSource()
	 * @generated
	 */
	void setMachineSource(Machine value);

	/**
	 * Returns the value of the '<em><b>Human Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Target</em>' reference.
	 * @see #setHumanTarget(Human)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getMachineToHumanRelation_HumanTarget()
	 * @model
	 * @generated
	 */
	Human getHumanTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getHumanTarget <em>Human Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Target</em>' reference.
	 * @see #getHumanTarget()
	 * @generated
	 */
	void setHumanTarget(Human value);

} // MachineToHumanRelation
