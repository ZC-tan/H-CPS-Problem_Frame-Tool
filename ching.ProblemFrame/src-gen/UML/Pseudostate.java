/**
 */
package UML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Pseudostate#getKind <em>Kind</em>}</li>
 *   <li>{@link UML.Pseudostate#getState <em>State</em>}</li>
 *   <li>{@link UML.Pseudostate#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends Vertex {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"initial"</code>.
	 * The literals are from the enumeration {@link UML.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see UML.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see UML.UMLPackage#getPseudostate_Kind()
	 * @model default="initial"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link UML.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see UML.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UML.State#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see UML.UMLPackage#getPseudostate_State()
	 * @see UML.State#getConnectionPoint
	 * @model opposite="connectionPoint" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link UML.Pseudostate#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UML.StateMachine#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' container reference.
	 * @see #setStatemachine(StateMachine)
	 * @see UML.UMLPackage#getPseudostate_Statemachine()
	 * @see UML.StateMachine#getConnectionPoint
	 * @model opposite="connectionPoint" transient="false"
	 * @generated
	 */
	StateMachine getStatemachine();

	/**
	 * Sets the value of the '{@link UML.Pseudostate#getStatemachine <em>Statemachine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statemachine</em>' container reference.
	 * @see #getStatemachine()
	 * @generated
	 */
	void setStatemachine(StateMachine value);

} // Pseudostate
