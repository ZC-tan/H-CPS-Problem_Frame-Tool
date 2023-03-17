/**
 */
package ching.ProblemFrame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ching.ProblemFrame.Interface#getSharedPhenomena <em>Shared Phenomena</em>}</li>
 *   <li>{@link ching.ProblemFrame.Interface#getTargetDomain <em>Target Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.Interface#getSourceDomain <em>Source Domain</em>}</li>
 *   <li>{@link ching.ProblemFrame.Interface#getBeginControlSharedPhenomena <em>Begin Control Shared Phenomena</em>}</li>
 *   <li>{@link ching.ProblemFrame.Interface#getEndControlSharedPhenomena <em>End Control Shared Phenomena</em>}</li>
 * </ul>
 *
 * @see ching.ProblemFrame.ProblemFramePackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Shared Phenomena</b></em>' containment reference list.
	 * The list contents are of type {@link ching.ProblemFrame.Phenomenon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Phenomena</em>' containment reference list.
	 * @see ching.ProblemFrame.ProblemFramePackage#getInterface_SharedPhenomena()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Phenomenon> getSharedPhenomena();

	/**
	 * Returns the value of the '<em><b>Target Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Domain</em>' reference.
	 * @see #setTargetDomain(Domain)
	 * @see ching.ProblemFrame.ProblemFramePackage#getInterface_TargetDomain()
	 * @model
	 * @generated
	 */
	Domain getTargetDomain();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Interface#getTargetDomain <em>Target Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Domain</em>' reference.
	 * @see #getTargetDomain()
	 * @generated
	 */
	void setTargetDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Source Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Domain</em>' reference.
	 * @see #setSourceDomain(Domain)
	 * @see ching.ProblemFrame.ProblemFramePackage#getInterface_SourceDomain()
	 * @model
	 * @generated
	 */
	Domain getSourceDomain();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Interface#getSourceDomain <em>Source Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Domain</em>' reference.
	 * @see #getSourceDomain()
	 * @generated
	 */
	void setSourceDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Begin Control Shared Phenomena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Control Shared Phenomena</em>' attribute.
	 * @see #setBeginControlSharedPhenomena(String)
	 * @see ching.ProblemFrame.ProblemFramePackage#getInterface_BeginControlSharedPhenomena()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getBeginControlSharedPhenomena();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Interface#getBeginControlSharedPhenomena <em>Begin Control Shared Phenomena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Control Shared Phenomena</em>' attribute.
	 * @see #getBeginControlSharedPhenomena()
	 * @generated
	 */
	void setBeginControlSharedPhenomena(String value);

	/**
	 * Returns the value of the '<em><b>End Control Shared Phenomena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Control Shared Phenomena</em>' attribute.
	 * @see #setEndControlSharedPhenomena(String)
	 * @see ching.ProblemFrame.ProblemFramePackage#getInterface_EndControlSharedPhenomena()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEndControlSharedPhenomena();

	/**
	 * Sets the value of the '{@link ching.ProblemFrame.Interface#getEndControlSharedPhenomena <em>End Control Shared Phenomena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Control Shared Phenomena</em>' attribute.
	 * @see #getEndControlSharedPhenomena()
	 * @generated
	 */
	void setEndControlSharedPhenomena(String value);

} // Interface
