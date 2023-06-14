/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Namespace {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"external"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gemoc.statemachine.model.UML.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TransitionKind
	 * @see #setKind(TransitionKind)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition_Kind()
	 * @model default="external" required="true" ordered="false"
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TransitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition_Container()
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getTransition
	 * @model opposite="transition" required="true" transient="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.statemachine.model.UML.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Constraint)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Constraint value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(Behavior)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition_Effect()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getEffect();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Behavior value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition_Target()
	 * @see org.eclipse.gemoc.statemachine.model.UML.Vertex#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.statemachine.model.UML.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getTransition_Source()
	 * @see org.eclipse.gemoc.statemachine.model.UML.Vertex#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

} // Transition
