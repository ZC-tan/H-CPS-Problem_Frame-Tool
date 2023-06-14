/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.Domain#getName <em>Name</em>}</li>
 *   <li>{@link ching.ProblemFrame.Domain#getPhenomena <em>Phenomena</em>}</li>
 *   <li>{@link ching.ProblemFrame.Domain#getType <em>Type</em>}</li>
 *   <li>{@link ching.ProblemFrame.Domain#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getDomain()
 * @model abstract="true"
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ching.ProblemFrame.ProblemFramePackage#getDomain_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Domain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phenomena</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.Phenomenon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phenomena</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getDomain_Phenomena()
	 * @model containment="true"
	 * @generated
	 */
	EList<Phenomenon> getPhenomena();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ching.ProblemFrame.DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ching.ProblemFrame.DType
	 * @see #setType(DType)
	 * @see ching.ProblemFrame.ProblemFramePackage#getDomain_Type()
	 * @model dataType="ching.ProblemFrame.DType"
	 * @generated
	 */
	DType getType();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Domain#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ching.ProblemFrame.DType
	 * @see #getType()
	 * @generated
	 */
	void setType(DType value);

	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.MyStateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getDomain_Statemachine()
	 * @model containment="true"
	 * @generated
	 */
	EList<MyStateMachine> getStatemachine();

} // Domain
