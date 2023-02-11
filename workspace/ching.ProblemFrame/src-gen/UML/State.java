/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.State#getRegion <em>Region</em>}</li>
 *   <li>{@link UML.State#getConnection <em>Connection</em>}</li>
 *   <li>{@link UML.State#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link UML.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link UML.State#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link UML.State#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link UML.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link UML.State#getExit <em>Exit</em>}</li>
 *   <li>{@link UML.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link UML.State#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link UML.State#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link UML.State#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link UML.State#isIsSubmachineState <em>Is Submachine State</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getState()
 * @model
 * @generated
 */
public interface State extends Namespace, Vertex {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Region}.
	 * It is bidirectional and its opposite is '{@link UML.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see UML.UMLPackage#getState_Region()
	 * @see UML.Region#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link UML.ConnectionPointReference}.
	 * It is bidirectional and its opposite is '{@link UML.ConnectionPointReference#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see UML.UMLPackage#getState_Connection()
	 * @see UML.ConnectionPointReference#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<ConnectionPointReference> getConnection();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link UML.Pseudostate#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see UML.UMLPackage#getState_ConnectionPoint()
	 * @see UML.Pseudostate#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UML.StateMachine#getSubmachineState <em>Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine</em>' reference.
	 * @see #setSubmachine(StateMachine)
	 * @see UML.UMLPackage#getState_Submachine()
	 * @see UML.StateMachine#getSubmachineState
	 * @model opposite="submachineState"
	 * @generated
	 */
	StateMachine getSubmachine();

	/**
	 * Sets the value of the '{@link UML.State#getSubmachine <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine</em>' reference.
	 * @see #getSubmachine()
	 * @generated
	 */
	void setSubmachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' containment reference list.
	 * @see UML.UMLPackage#getState_DeferrableTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getDeferrableTrigger();

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Invariant</em>' containment reference.
	 * @see #setStateInvariant(Constraint)
	 * @see UML.UMLPackage#getState_StateInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link UML.State#getStateInvariant <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' containment reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Behavior)
	 * @see UML.UMLPackage#getState_Entry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link UML.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Behavior)
	 * @see UML.UMLPackage#getState_Exit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link UML.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Behavior)
	 * @see UML.UMLPackage#getState_DoActivity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link UML.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see UML.UMLPackage#getState_IsComposite()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" derived="true"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link UML.State#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see #setIsOrthogonal(boolean)
	 * @see UML.UMLPackage#getState_IsOrthogonal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" derived="true"
	 * @generated
	 */
	boolean isIsOrthogonal();

	/**
	 * Sets the value of the '{@link UML.State#isIsOrthogonal <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Orthogonal</em>' attribute.
	 * @see #isIsOrthogonal()
	 * @generated
	 */
	void setIsOrthogonal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see #setIsSimple(boolean)
	 * @see UML.UMLPackage#getState_IsSimple()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" derived="true"
	 * @generated
	 */
	boolean isIsSimple();

	/**
	 * Sets the value of the '{@link UML.State#isIsSimple <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Simple</em>' attribute.
	 * @see #isIsSimple()
	 * @generated
	 */
	void setIsSimple(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see #setIsSubmachineState(boolean)
	 * @see UML.UMLPackage#getState_IsSubmachineState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" derived="true"
	 * @generated
	 */
	boolean isIsSubmachineState();

	/**
	 * Sets the value of the '{@link UML.State#isIsSubmachineState <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Submachine State</em>' attribute.
	 * @see #isIsSubmachineState()
	 * @generated
	 */
	void setIsSubmachineState(boolean value);

} // State
