/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.Phenomenon#getName <em>Name</em>}</li>
 *   <li>{@link ching.ProblemFrame.Phenomenon#getType <em>Type</em>}</li>
 *   <li>{@link ching.ProblemFrame.Phenomenon#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getPhenomenon()
 * @model
 * @generated
 */
public interface Phenomenon extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ching.ProblemFrame.ProblemFramePackage#getPhenomenon_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Phenomenon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ching.ProblemFrame.PType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ching.ProblemFrame.PType
	 * @see #setType(PType)
	 * @see ching.ProblemFrame.ProblemFramePackage#getPhenomenon_Type()
	 * @model
	 * @generated
	 */
	PType getType();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Phenomenon#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ching.ProblemFrame.PType
	 * @see #getType()
	 * @generated
	 */
	void setType(PType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ching.ProblemFrame.ProblemFramePackage#getPhenomenon_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Phenomenon#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Phenomenon
