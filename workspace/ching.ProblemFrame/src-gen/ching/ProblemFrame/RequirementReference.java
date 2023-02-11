/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.RequirementReference#getPhenomenon <em>Phenomenon</em>}</li>
 *   <li>{@link ching.ProblemFrame.RequirementReference#getReqReference <em>Req Reference</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getRequirementReference()
 * @model
 * @generated
 */
public interface RequirementReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Phenomenon</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.Phenomenon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phenomenon</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getRequirementReference_Phenomenon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Phenomenon> getPhenomenon();

	/**
	 * Returns the value of the '<em><b>Req Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Reference</em>' reference.
	 * @see #setReqReference(Domain)
	 * @see ching.ProblemFrame.ProblemFramePackage#getRequirementReference_ReqReference()
	 * @model
	 * @generated
	 */
	Domain getReqReference();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.RequirementReference#getReqReference <em>Req Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Reference</em>' reference.
	 * @see #getReqReference()
	 * @generated
	 */
	void setReqReference(Domain value);

} // RequirementReference
