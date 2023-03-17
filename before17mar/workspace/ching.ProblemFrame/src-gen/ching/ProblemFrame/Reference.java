/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.Reference#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Requirement)
	 * @see ching.ProblemFrame.ProblemFramePackage#getReference_Source()
	 * @model
	 * @generated
	 */
	Requirement getSource();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Reference#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Requirement value);

} // Reference
