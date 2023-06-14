/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human To Machine Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getHumanSource <em>Human Source</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getMachineTarget <em>Machine Target</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getHumanToMachineRelation()
 * @model
 * @generated
 */
public interface HumanToMachineRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Human Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Source</em>' reference.
	 * @see #setHumanSource(Human)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getHumanToMachineRelation_HumanSource()
	 * @model
	 * @generated
	 */
	Human getHumanSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getHumanSource <em>Human Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Source</em>' reference.
	 * @see #getHumanSource()
	 * @generated
	 */
	void setHumanSource(Human value);

	/**
	 * Returns the value of the '<em><b>Machine Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Target</em>' reference.
	 * @see #setMachineTarget(Machine)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getHumanToMachineRelation_MachineTarget()
	 * @model
	 * @generated
	 */
	Machine getMachineTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getMachineTarget <em>Machine Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Target</em>' reference.
	 * @see #getMachineTarget()
	 * @generated
	 */
	void setMachineTarget(Machine value);

	/**
	 * Returns the value of the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Name</em>' attribute.
	 * @see #setRelationName(String)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getHumanToMachineRelation_RelationName()
	 * @model
	 * @generated
	 */
	String getRelationName();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getRelationName <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Name</em>' attribute.
	 * @see #getRelationName()
	 * @generated
	 */
	void setRelationName(String value);

} // HumanToMachineRelation
