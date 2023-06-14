/**
 */
package UML;

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
 *   <li>{@link UML.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link UML.Transition#getContainer <em>Container</em>}</li>
 *   <li>{@link UML.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link UML.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link UML.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link UML.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link UML.Transition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Namespace {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"external"</code>.
	 * The literals are from the enumeration {@link UML.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see UML.TransitionKind
	 * @see #setKind(TransitionKind)
	 * @see UML.UMLPackage#getTransition_Kind()
	 * @model default="external" required="true" ordered="false"
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link UML.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see UML.TransitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UML.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see UML.UMLPackage#getTransition_Container()
	 * @see UML.Region#getTransition
	 * @model opposite="transition" required="true" transient="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link UML.Transition#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see UML.UMLPackage#getTransition_Trigger()
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
	 * @see UML.UMLPackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link UML.Transition#getGuard <em>Guard</em>}' containment reference.
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
	 * @see UML.UMLPackage#getTransition_Effect()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getEffect();

	/**
	 * Sets the value of the '{@link UML.Transition#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Behavior value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UML.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see UML.UMLPackage#getTransition_Target()
	 * @see UML.Vertex#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link UML.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UML.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see UML.UMLPackage#getTransition_Source()
	 * @see UML.Vertex#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link UML.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

} // Transition
