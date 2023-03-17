/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.StateMachine#getRegion <em>Region</em>}</li>
 *   <li>{@link UML.StateMachine#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link UML.StateMachine#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link UML.StateMachine#getCurrentVertex <em>Current Vertex</em>}</li>
 *   <li>{@link UML.StateMachine#getEventPool <em>Event Pool</em>}</li>
 *   <li>{@link UML.StateMachine#getProperty <em>Property</em>}</li>
 *   <li>{@link UML.StateMachine#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends Behavior {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Region}.
	 * It is bidirectional and its opposite is '{@link UML.Region#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see UML.UMLPackage#getStateMachine_Region()
	 * @see UML.Region#getStatemachine
	 * @model opposite="statemachine" containment="true" required="true"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link UML.Pseudostate#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see UML.UMLPackage#getStateMachine_ConnectionPoint()
	 * @see UML.Pseudostate#getStatemachine
	 * @model opposite="statemachine" containment="true"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Submachine State</b></em>' reference list.
	 * The list contents are of type {@link UML.State}.
	 * It is bidirectional and its opposite is '{@link UML.State#getSubmachine <em>Submachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine State</em>' reference list.
	 * @see UML.UMLPackage#getStateMachine_SubmachineState()
	 * @see UML.State#getSubmachine
	 * @model opposite="submachine"
	 * @generated
	 */
	EList<State> getSubmachineState();

	/**
	 * Returns the value of the '<em><b>Current Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Vertex</em>' reference.
	 * @see #setCurrentVertex(Vertex)
	 * @see UML.UMLPackage#getStateMachine_CurrentVertex()
	 * @model annotation="aspect"
	 * @generated
	 */
	Vertex getCurrentVertex();

	/**
	 * Sets the value of the '{@link UML.StateMachine#getCurrentVertex <em>Current Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Vertex</em>' reference.
	 * @see #getCurrentVertex()
	 * @generated
	 */
	void setCurrentVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Event Pool</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Pool</em>' attribute list.
	 * @see UML.UMLPackage#getStateMachine_EventPool()
	 * @model annotation="aspect"
	 * @generated
	 */
	EList<String> getEventPool();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see UML.UMLPackage#getStateMachine_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute list.
	 * @see UML.UMLPackage#getStateMachine_Input()
	 * @model
	 * @generated
	 */
	EList<String> getInput();

} // StateMachine
