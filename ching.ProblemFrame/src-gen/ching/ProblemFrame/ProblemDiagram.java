/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.ProblemDiagram#getDomain <em>Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.ProblemDiagram#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link ching.ProblemFrame.ProblemDiagram#getProblemName <em>Problem Name</em>}</li>
 *   <li>{@link ching.ProblemFrame.ProblemDiagram#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link ching.ProblemFrame.ProblemDiagram#getReference <em>Reference</em>}</li>
 *   <li>{@link ching.ProblemFrame.ProblemDiagram#getSystemregion <em>Systemregion</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getProblemDiagram()
 * @model
 * @generated
 */
public interface ProblemDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getProblemDiagram_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getDomain();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getProblemDiagram_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();

	/**
	 * Returns the value of the '<em><b>Problem Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Name</em>' attribute.
	 * @see #setProblemName(String)
	 * @see ching.ProblemFrame.ProblemFramePackage#getProblemDiagram_ProblemName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getProblemName();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.ProblemDiagram#getProblemName <em>Problem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Name</em>' attribute.
	 * @see #getProblemName()
	 * @generated
	 */
	void setProblemName(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getProblemDiagram_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getProblemDiagram_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Systemregion</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.SystemRegion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemregion</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getProblemDiagram_Systemregion()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemRegion> getSystemregion();

} // ProblemDiagram
