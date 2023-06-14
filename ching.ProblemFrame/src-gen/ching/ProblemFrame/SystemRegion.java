/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.SystemRegion#getSystemDomain <em>System Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.SystemRegion#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link ching.ProblemFrame.SystemRegion#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getSystemRegion()
 * @model
 * @generated
 */
public interface SystemRegion extends EObject {
	/**
	 * Returns the value of the '<em><b>System Domain</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.SystemDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Domain</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getSystemRegion_SystemDomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemDomain> getSystemDomain();

	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.MyStateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getSystemRegion_Statemachine()
	 * @model containment="true"
	 * @generated
	 */
	EList<MyStateMachine> getStatemachine();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ching.ProblemFrame.ProblemFramePackage#getSystemRegion_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.SystemRegion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SystemRegion
