/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.statemachine.model.UML.SendEvent#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getSendEvent()
 * @model
 * @generated
 */
public interface SendEvent extends Behavior {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachinePackage#getSendEvent_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.statemachine.model.UML.SendEvent#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // SendEvent
