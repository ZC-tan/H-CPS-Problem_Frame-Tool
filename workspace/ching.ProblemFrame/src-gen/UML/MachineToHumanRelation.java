/**
 */
package UML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine To Human Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.MachineToHumanRelation#getMachineSource <em>Machine Source</em>}</li>
 *   <li>{@link UML.MachineToHumanRelation#getHumanTarget <em>Human Target</em>}</li>
 *   <li>{@link UML.MachineToHumanRelation#getRelationName <em>Relation Name</em>}</li>
 *   <li>{@link UML.MachineToHumanRelation#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getMachineToHumanRelation()
 * @model
 * @generated
 */
public interface MachineToHumanRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Machine Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Source</em>' reference.
	 * @see #setMachineSource(Machine)
	 * @see UML.UMLPackage#getMachineToHumanRelation_MachineSource()
	 * @model
	 * @generated
	 */
	Machine getMachineSource();

	/**
	 * Sets the value of the '{@link UML.MachineToHumanRelation#getMachineSource <em>Machine Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Source</em>' reference.
	 * @see #getMachineSource()
	 * @generated
	 */
	void setMachineSource(Machine value);

	/**
	 * Returns the value of the '<em><b>Human Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Target</em>' reference.
	 * @see #setHumanTarget(Human)
	 * @see UML.UMLPackage#getMachineToHumanRelation_HumanTarget()
	 * @model
	 * @generated
	 */
	Human getHumanTarget();

	/**
	 * Sets the value of the '{@link UML.MachineToHumanRelation#getHumanTarget <em>Human Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Target</em>' reference.
	 * @see #getHumanTarget()
	 * @generated
	 */
	void setHumanTarget(Human value);

	/**
	 * Returns the value of the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Name</em>' attribute.
	 * @see #setRelationName(String)
	 * @see UML.UMLPackage#getMachineToHumanRelation_RelationName()
	 * @model
	 * @generated
	 */
	String getRelationName();

	/**
	 * Sets the value of the '{@link UML.MachineToHumanRelation#getRelationName <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Name</em>' attribute.
	 * @see #getRelationName()
	 * @generated
	 */
	void setRelationName(String value);

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see UML.UMLPackage#getMachineToHumanRelation_InterfaceName()
	 * @model
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link UML.MachineToHumanRelation#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

} // MachineToHumanRelation
