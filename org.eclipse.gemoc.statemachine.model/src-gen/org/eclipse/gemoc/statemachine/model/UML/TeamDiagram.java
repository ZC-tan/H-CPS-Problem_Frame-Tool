/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getHuman <em>Human</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getMachine <em>Machine</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getHumantomachinerelation <em>Humantomachinerelation</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getMachinetohumanrelation <em>Machinetohumanrelation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTeamDiagram()
 * @model
 * @generated
 */
public interface TeamDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Human</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.Human}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTeamDiagram_Human()
	 * @model containment="true"
	 * @generated
	 */
	EList<Human> getHuman();

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTeamDiagram_Machine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machine> getMachine();

	/**
	 * Returns the value of the '<em><b>Humantomachinerelation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humantomachinerelation</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTeamDiagram_Humantomachinerelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<HumanToMachineRelation> getHumantomachinerelation();

	/**
	 * Returns the value of the '<em><b>Machinetohumanrelation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machinetohumanrelation</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTeamDiagram_Machinetohumanrelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<MachineToHumanRelation> getMachinetohumanrelation();

} // TeamDiagram
