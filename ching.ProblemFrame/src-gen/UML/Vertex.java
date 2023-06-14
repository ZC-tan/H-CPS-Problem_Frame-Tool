/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Vertex#getContainer <em>Container</em>}</li>
 *   <li>{@link UML.Vertex#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link UML.Vertex#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UML.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see UML.UMLPackage#getVertex_Container()
	 * @see UML.Region#getSubvertex
	 * @model opposite="subvertex" transient="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link UML.Vertex#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link UML.Transition}.
	 * It is bidirectional and its opposite is '{@link UML.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see UML.UMLPackage#getVertex_Incoming()
	 * @see UML.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link UML.Transition}.
	 * It is bidirectional and its opposite is '{@link UML.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see UML.UMLPackage#getVertex_Outgoing()
	 * @see UML.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // Vertex
