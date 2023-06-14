/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ching.ProblemFrame.ProblemFramePackage
 * @generated
 */
public interface ProblemFrameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProblemFrameFactory eINSTANCE = ching.ProblemFrame.impl.ProblemFrameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Problem Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Diagram</em>'.
	 * @generated
	 */
	ProblemDiagram createProblemDiagram();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Lexical Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexical Domain</em>'.
	 * @generated
	 */
	LexicalDomain createLexicalDomain();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Phenomenon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phenomenon</em>'.
	 * @generated
	 */
	Phenomenon createPhenomenon();

	/**
	 * Returns a new object of class '<em>Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Reference</em>'.
	 * @generated
	 */
	RequirementReference createRequirementReference();

	/**
	 * Returns a new object of class '<em>Constraining Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraining Requirement Reference</em>'.
	 * @generated
	 */
	ConstrainingRequirementReference createConstrainingRequirementReference();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>My State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My State Machine</em>'.
	 * @generated
	 */
	MyStateMachine createMyStateMachine();

	/**
	 * Returns a new object of class '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human</em>'.
	 * @generated
	 */
	Human createHuman();

	/**
	 * Returns a new object of class '<em>External Causal Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Causal Domain</em>'.
	 * @generated
	 */
	ExternalCausalDomain createExternalCausalDomain();

	/**
	 * Returns a new object of class '<em>External Biddable Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Biddable Domain</em>'.
	 * @generated
	 */
	ExternalBiddableDomain createExternalBiddableDomain();

	/**
	 * Returns a new object of class '<em>Internal Causal Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Causal Domain</em>'.
	 * @generated
	 */
	InternalCausalDomain createInternalCausalDomain();

	/**
	 * Returns a new object of class '<em>System Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Region</em>'.
	 * @generated
	 */
	SystemRegion createSystemRegion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProblemFramePackage getProblemFramePackage();

} //ProblemFrameFactory
