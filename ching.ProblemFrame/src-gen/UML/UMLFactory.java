/**
 */
package UML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UML.UMLPackage
 * @generated
 */
public interface UMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLFactory eINSTANCE = UML.impl.UMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Point Reference</em>'.
	 * @generated
	 */
	ConnectionPointReference createConnectionPointReference();

	/**
	 * Returns a new object of class '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pseudostate</em>'.
	 * @generated
	 */
	Pseudostate createPseudostate();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Specification</em>'.
	 * @generated
	 */
	ValueSpecification createValueSpecification();

	/**
	 * Returns a new object of class '<em>Set Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Value</em>'.
	 * @generated
	 */
	SetValue createSetValue();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Send Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Event</em>'.
	 * @generated
	 */
	SendEvent createSendEvent();

	/**
	 * Returns a new object of class '<em>Team Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Diagram</em>'.
	 * @generated
	 */
	TeamDiagram createTeamDiagram();

	/**
	 * Returns a new object of class '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human</em>'.
	 * @generated
	 */
	Human createHuman();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Human To Machine Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human To Machine Relation</em>'.
	 * @generated
	 */
	HumanToMachineRelation createHumanToMachineRelation();

	/**
	 * Returns a new object of class '<em>Machine To Human Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine To Human Relation</em>'.
	 * @generated
	 */
	MachineToHumanRelation createMachineToHumanRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLPackage getUMLPackage();

} //UMLFactory
