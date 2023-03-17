/**
 */
package UML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Constraint#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see UML.UMLPackage#getConstraint_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link UML.Constraint#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

} // Constraint
