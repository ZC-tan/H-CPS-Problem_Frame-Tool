/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getConnectionPointReference()
 * @model
 * @generated
 */
public interface ConnectionPointReference extends Vertex {
	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getConnectionPointReference_Exit()
	 * @model
	 * @generated
	 */
	EList<Pseudostate> getExit();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getConnectionPointReference_Entry()
	 * @model
	 * @generated
	 */
	EList<Pseudostate> getEntry();

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.State#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getConnectionPointReference_State()
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getConnection
	 * @model opposite="connection" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // ConnectionPointReference
