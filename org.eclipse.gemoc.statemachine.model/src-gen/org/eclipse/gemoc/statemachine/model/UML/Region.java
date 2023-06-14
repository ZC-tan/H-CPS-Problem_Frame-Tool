/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Region#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Region#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Region#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentVertex <em>Current Vertex</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentDirectVertex <em>Current Direct Vertex</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Region#getTeamdiagram <em>Teamdiagram</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends Namespace {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion_Transition()
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.Vertex}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion_Subvertex()
	 * @see org.eclipse.gemoc.statemachine.model.UML.Vertex#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' container reference.
	 * @see #setStatemachine(StateMachine)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion_Statemachine()
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getRegion
	 * @model opposite="region" transient="false"
	 * @generated
	 */
	StateMachine getStatemachine();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getStatemachine <em>Statemachine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statemachine</em>' container reference.
	 * @see #getStatemachine()
	 * @generated
	 */
	void setStatemachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.State#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion_State()
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getRegion
	 * @model opposite="region" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Current Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Vertex</em>' reference.
	 * @see #setCurrentVertex(Vertex)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion_CurrentVertex()
	 * @model
	 * @generated
	 */
	Vertex getCurrentVertex();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentVertex <em>Current Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Vertex</em>' reference.
	 * @see #getCurrentVertex()
	 * @generated
	 */
	void setCurrentVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Current Direct Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Direct Vertex</em>' reference.
	 * @see #setCurrentDirectVertex(Vertex)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion_CurrentDirectVertex()
	 * @model
	 * @generated
	 */
	Vertex getCurrentDirectVertex();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentDirectVertex <em>Current Direct Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Direct Vertex</em>' reference.
	 * @see #getCurrentDirectVertex()
	 * @generated
	 */
	void setCurrentDirectVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Teamdiagram</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teamdiagram</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getRegion_Teamdiagram()
	 * @model containment="true"
	 * @generated
	 */
	EList<TeamDiagram> getTeamdiagram();

} // Region
