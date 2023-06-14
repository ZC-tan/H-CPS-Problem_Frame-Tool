/**
 */
package ching.ProblemFrame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraining Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.ConstrainingRequirementReference#getConstrains <em>Constrains</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getConstrainingRequirementReference()
 * @model
 * @generated
 */
public interface ConstrainingRequirementReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Constrains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrains</em>' reference.
	 * @see #setConstrains(Domain)
	 * @see ching.ProblemFrame.ProblemFramePackage#getConstrainingRequirementReference_Constrains()
	 * @model
	 * @generated
	 */
	Domain getConstrains();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.ConstrainingRequirementReference#getConstrains <em>Constrains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrains</em>' reference.
	 * @see #getConstrains()
	 * @generated
	 */
	void setConstrains(Domain value);

} // ConstrainingRequirementReference
