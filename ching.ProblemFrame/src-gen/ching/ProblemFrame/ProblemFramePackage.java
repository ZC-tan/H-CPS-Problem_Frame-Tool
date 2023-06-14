/**
 */
package ching.ProblemFrame;

import UML.UMLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ching.ProblemFrame.ProblemFrameFactory
 * @model kind="package"
 * @generated
 */
public interface ProblemFramePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProblemFrame";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ProblemFrame";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProblemFrame";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProblemFramePackage eINSTANCE = ching.ProblemFrame.impl.ProblemFramePackageImpl.init();

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.ProblemDiagramImpl <em>Problem Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.ProblemDiagramImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getProblemDiagram()
	 * @generated
	 */
	int PROBLEM_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM__REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Problem Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM__PROBLEM_NAME = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM__INTERFACES = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM__REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Systemregion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM__SYSTEMREGION = 5;

	/**
	 * The number of structural features of the '<em>Problem Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Problem Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.DomainImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PHENOMENA = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__STATEMACHINE = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.SystemDomainImpl <em>System Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.SystemDomainImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getSystemDomain()
	 * @generated
	 */
	int SYSTEM_DOMAIN = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DOMAIN__NAME = DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DOMAIN__PHENOMENA = DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DOMAIN__TYPE = DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DOMAIN__STATEMACHINE = DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>System Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DOMAIN_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DOMAIN_OPERATION_COUNT = DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.MachineImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = SYSTEM_DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PHENOMENA = SYSTEM_DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TYPE = SYSTEM_DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__STATEMACHINE = SYSTEM_DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = SYSTEM_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = SYSTEM_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.InternalCausalDomainImpl <em>Internal Causal Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.InternalCausalDomainImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getInternalCausalDomain()
	 * @generated
	 */
	int INTERNAL_CAUSAL_DOMAIN = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CAUSAL_DOMAIN__NAME = SYSTEM_DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CAUSAL_DOMAIN__PHENOMENA = SYSTEM_DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CAUSAL_DOMAIN__TYPE = SYSTEM_DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CAUSAL_DOMAIN__STATEMACHINE = SYSTEM_DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>Internal Causal Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CAUSAL_DOMAIN_FEATURE_COUNT = SYSTEM_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Causal Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CAUSAL_DOMAIN_OPERATION_COUNT = SYSTEM_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.LexicalDomainImpl <em>Lexical Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.LexicalDomainImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getLexicalDomain()
	 * @generated
	 */
	int LEXICAL_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_DOMAIN__NAME = INTERNAL_CAUSAL_DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_DOMAIN__PHENOMENA = INTERNAL_CAUSAL_DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_DOMAIN__TYPE = INTERNAL_CAUSAL_DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_DOMAIN__STATEMACHINE = INTERNAL_CAUSAL_DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>Lexical Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_DOMAIN_FEATURE_COUNT = INTERNAL_CAUSAL_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lexical Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_DOMAIN_OPERATION_COUNT = INTERNAL_CAUSAL_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.InterfaceImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Shared Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SHARED_PHENOMENA = 0;

	/**
	 * The feature id for the '<em><b>Target Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TARGET_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Source Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SOURCE_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Begin Control Shared Phenomena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA = 3;

	/**
	 * The feature id for the '<em><b>End Control Shared Phenomena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__END_CONTROL_SHARED_PHENOMENA = 4;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.PhenomenonImpl <em>Phenomenon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.PhenomenonImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getPhenomenon()
	 * @generated
	 */
	int PHENOMENON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Phenomenon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Phenomenon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.ReferenceImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.RequirementReferenceImpl <em>Requirement Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.RequirementReferenceImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getRequirementReference()
	 * @generated
	 */
	int REQUIREMENT_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Phenomenon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__PHENOMENON = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Req Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__REQ_REFERENCE = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.ConstrainingRequirementReferenceImpl <em>Constraining Requirement Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.ConstrainingRequirementReferenceImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getConstrainingRequirementReference()
	 * @generated
	 */
	int CONSTRAINING_REQUIREMENT_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_REQUIREMENT_REFERENCE__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Constrains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraining Requirement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_REQUIREMENT_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraining Requirement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_REQUIREMENT_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.RequirementImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATEMACHINE = 1;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.MyStateMachineImpl <em>My State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.MyStateMachineImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getMyStateMachine()
	 * @generated
	 */
	int MY_STATE_MACHINE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__NAME = UMLPackage.STATE_MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__REGION = UMLPackage.STATE_MACHINE__REGION;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__CONNECTION_POINT = UMLPackage.STATE_MACHINE__CONNECTION_POINT;

	/**
	 * The feature id for the '<em><b>Submachine State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__SUBMACHINE_STATE = UMLPackage.STATE_MACHINE__SUBMACHINE_STATE;

	/**
	 * The feature id for the '<em><b>Current Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__CURRENT_VERTEX = UMLPackage.STATE_MACHINE__CURRENT_VERTEX;

	/**
	 * The feature id for the '<em><b>Event Pool</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__EVENT_POOL = UMLPackage.STATE_MACHINE__EVENT_POOL;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__PROPERTY = UMLPackage.STATE_MACHINE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE__INPUT = UMLPackage.STATE_MACHINE__INPUT;

	/**
	 * The number of structural features of the '<em>My State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE_FEATURE_COUNT = UMLPackage.STATE_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>My State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STATE_MACHINE_OPERATION_COUNT = UMLPackage.STATE_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.HumanImpl <em>Human</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.HumanImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getHuman()
	 * @generated
	 */
	int HUMAN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__NAME = SYSTEM_DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__PHENOMENA = SYSTEM_DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__TYPE = SYSTEM_DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__STATEMACHINE = SYSTEM_DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_FEATURE_COUNT = SYSTEM_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_OPERATION_COUNT = SYSTEM_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.ExternalDomainImpl <em>External Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.ExternalDomainImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getExternalDomain()
	 * @generated
	 */
	int EXTERNAL_DOMAIN = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN__NAME = DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN__PHENOMENA = DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN__TYPE = DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN__STATEMACHINE = DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>External Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN_OPERATION_COUNT = DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.ExternalCausalDomainImpl <em>External Causal Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.ExternalCausalDomainImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getExternalCausalDomain()
	 * @generated
	 */
	int EXTERNAL_CAUSAL_DOMAIN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CAUSAL_DOMAIN__NAME = EXTERNAL_DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CAUSAL_DOMAIN__PHENOMENA = EXTERNAL_DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CAUSAL_DOMAIN__TYPE = EXTERNAL_DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CAUSAL_DOMAIN__STATEMACHINE = EXTERNAL_DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>External Causal Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CAUSAL_DOMAIN_FEATURE_COUNT = EXTERNAL_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Causal Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CAUSAL_DOMAIN_OPERATION_COUNT = EXTERNAL_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.ExternalBiddableDomainImpl <em>External Biddable Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.ExternalBiddableDomainImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getExternalBiddableDomain()
	 * @generated
	 */
	int EXTERNAL_BIDDABLE_DOMAIN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_BIDDABLE_DOMAIN__NAME = EXTERNAL_DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_BIDDABLE_DOMAIN__PHENOMENA = EXTERNAL_DOMAIN__PHENOMENA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_BIDDABLE_DOMAIN__TYPE = EXTERNAL_DOMAIN__TYPE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_BIDDABLE_DOMAIN__STATEMACHINE = EXTERNAL_DOMAIN__STATEMACHINE;

	/**
	 * The number of structural features of the '<em>External Biddable Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_BIDDABLE_DOMAIN_FEATURE_COUNT = EXTERNAL_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Biddable Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_BIDDABLE_DOMAIN_OPERATION_COUNT = EXTERNAL_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.impl.SystemRegionImpl <em>System Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.impl.SystemRegionImpl
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getSystemRegion()
	 * @generated
	 */
	int SYSTEM_REGION = 15;

	/**
	 * The feature id for the '<em><b>System Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGION__SYSTEM_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGION__STATEMACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGION__NAME = 2;

	/**
	 * The number of structural features of the '<em>System Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.DType <em>DType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.DType
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getDType()
	 * @generated
	 */
	int DTYPE = 18;

	/**
	 * The meta object id for the '{@link ching.ProblemFrame.PType <em>PType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ching.ProblemFrame.PType
	 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getPType()
	 * @generated
	 */
	int PTYPE = 19;

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.ProblemDiagram <em>Problem Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Diagram</em>'.
	 * @see ching.ProblemFrame.ProblemDiagram
	 * @generated
	 */
	EClass getProblemDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.ProblemDiagram#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see ching.ProblemFrame.ProblemDiagram#getDomain()
	 * @see #getProblemDiagram()
	 * @generated
	 */
	EReference getProblemDiagram_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.ProblemDiagram#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see ching.ProblemFrame.ProblemDiagram#getRequirement()
	 * @see #getProblemDiagram()
	 * @generated
	 */
	EReference getProblemDiagram_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.ProblemDiagram#getProblemName <em>Problem Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Name</em>'.
	 * @see ching.ProblemFrame.ProblemDiagram#getProblemName()
	 * @see #getProblemDiagram()
	 * @generated
	 */
	EAttribute getProblemDiagram_ProblemName();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.ProblemDiagram#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see ching.ProblemFrame.ProblemDiagram#getInterfaces()
	 * @see #getProblemDiagram()
	 * @generated
	 */
	EReference getProblemDiagram_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.ProblemDiagram#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see ching.ProblemFrame.ProblemDiagram#getReference()
	 * @see #getProblemDiagram()
	 * @generated
	 */
	EReference getProblemDiagram_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.ProblemDiagram#getSystemregion <em>Systemregion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systemregion</em>'.
	 * @see ching.ProblemFrame.ProblemDiagram#getSystemregion()
	 * @see #getProblemDiagram()
	 * @generated
	 */
	EReference getProblemDiagram_Systemregion();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see ching.ProblemFrame.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ching.ProblemFrame.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.Domain#getPhenomena <em>Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phenomena</em>'.
	 * @see ching.ProblemFrame.Domain#getPhenomena()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Phenomena();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Domain#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ching.ProblemFrame.Domain#getType()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.Domain#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statemachine</em>'.
	 * @see ching.ProblemFrame.Domain#getStatemachine()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Statemachine();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see ching.ProblemFrame.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.LexicalDomain <em>Lexical Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexical Domain</em>'.
	 * @see ching.ProblemFrame.LexicalDomain
	 * @generated
	 */
	EClass getLexicalDomain();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see ching.ProblemFrame.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.Interface#getSharedPhenomena <em>Shared Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Phenomena</em>'.
	 * @see ching.ProblemFrame.Interface#getSharedPhenomena()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_SharedPhenomena();

	/**
	 * Returns the meta object for the reference '{@link ching.ProblemFrame.Interface#getTargetDomain <em>Target Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Domain</em>'.
	 * @see ching.ProblemFrame.Interface#getTargetDomain()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_TargetDomain();

	/**
	 * Returns the meta object for the reference '{@link ching.ProblemFrame.Interface#getSourceDomain <em>Source Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Domain</em>'.
	 * @see ching.ProblemFrame.Interface#getSourceDomain()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_SourceDomain();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Interface#getBeginControlSharedPhenomena <em>Begin Control Shared Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Control Shared Phenomena</em>'.
	 * @see ching.ProblemFrame.Interface#getBeginControlSharedPhenomena()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_BeginControlSharedPhenomena();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Interface#getEndControlSharedPhenomena <em>End Control Shared Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Control Shared Phenomena</em>'.
	 * @see ching.ProblemFrame.Interface#getEndControlSharedPhenomena()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_EndControlSharedPhenomena();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.Phenomenon <em>Phenomenon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phenomenon</em>'.
	 * @see ching.ProblemFrame.Phenomenon
	 * @generated
	 */
	EClass getPhenomenon();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Phenomenon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ching.ProblemFrame.Phenomenon#getName()
	 * @see #getPhenomenon()
	 * @generated
	 */
	EAttribute getPhenomenon_Name();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Phenomenon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ching.ProblemFrame.Phenomenon#getType()
	 * @see #getPhenomenon()
	 * @generated
	 */
	EAttribute getPhenomenon_Type();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Phenomenon#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ching.ProblemFrame.Phenomenon#getDescription()
	 * @see #getPhenomenon()
	 * @generated
	 */
	EAttribute getPhenomenon_Description();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.RequirementReference <em>Requirement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Reference</em>'.
	 * @see ching.ProblemFrame.RequirementReference
	 * @generated
	 */
	EClass getRequirementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.RequirementReference#getPhenomenon <em>Phenomenon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phenomenon</em>'.
	 * @see ching.ProblemFrame.RequirementReference#getPhenomenon()
	 * @see #getRequirementReference()
	 * @generated
	 */
	EReference getRequirementReference_Phenomenon();

	/**
	 * Returns the meta object for the reference '{@link ching.ProblemFrame.RequirementReference#getReqReference <em>Req Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Req Reference</em>'.
	 * @see ching.ProblemFrame.RequirementReference#getReqReference()
	 * @see #getRequirementReference()
	 * @generated
	 */
	EReference getRequirementReference_ReqReference();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.ConstrainingRequirementReference <em>Constraining Requirement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraining Requirement Reference</em>'.
	 * @see ching.ProblemFrame.ConstrainingRequirementReference
	 * @generated
	 */
	EClass getConstrainingRequirementReference();

	/**
	 * Returns the meta object for the reference '{@link ching.ProblemFrame.ConstrainingRequirementReference#getConstrains <em>Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrains</em>'.
	 * @see ching.ProblemFrame.ConstrainingRequirementReference#getConstrains()
	 * @see #getConstrainingRequirementReference()
	 * @generated
	 */
	EReference getConstrainingRequirementReference_Constrains();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see ching.ProblemFrame.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ching.ProblemFrame.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.Requirement#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statemachine</em>'.
	 * @see ching.ProblemFrame.Requirement#getStatemachine()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Statemachine();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ching.ProblemFrame.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link ching.ProblemFrame.Reference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ching.ProblemFrame.Reference#getSource()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Source();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.MyStateMachine <em>My State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My State Machine</em>'.
	 * @see ching.ProblemFrame.MyStateMachine
	 * @generated
	 */
	EClass getMyStateMachine();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human</em>'.
	 * @see ching.ProblemFrame.Human
	 * @generated
	 */
	EClass getHuman();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.ExternalCausalDomain <em>External Causal Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Causal Domain</em>'.
	 * @see ching.ProblemFrame.ExternalCausalDomain
	 * @generated
	 */
	EClass getExternalCausalDomain();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.ExternalBiddableDomain <em>External Biddable Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Biddable Domain</em>'.
	 * @see ching.ProblemFrame.ExternalBiddableDomain
	 * @generated
	 */
	EClass getExternalBiddableDomain();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.InternalCausalDomain <em>Internal Causal Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Causal Domain</em>'.
	 * @see ching.ProblemFrame.InternalCausalDomain
	 * @generated
	 */
	EClass getInternalCausalDomain();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.SystemRegion <em>System Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Region</em>'.
	 * @see ching.ProblemFrame.SystemRegion
	 * @generated
	 */
	EClass getSystemRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.SystemRegion#getSystemDomain <em>System Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Domain</em>'.
	 * @see ching.ProblemFrame.SystemRegion#getSystemDomain()
	 * @see #getSystemRegion()
	 * @generated
	 */
	EReference getSystemRegion_SystemDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link ching.ProblemFrame.SystemRegion#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statemachine</em>'.
	 * @see ching.ProblemFrame.SystemRegion#getStatemachine()
	 * @see #getSystemRegion()
	 * @generated
	 */
	EReference getSystemRegion_Statemachine();

	/**
	 * Returns the meta object for the attribute '{@link ching.ProblemFrame.SystemRegion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ching.ProblemFrame.SystemRegion#getName()
	 * @see #getSystemRegion()
	 * @generated
	 */
	EAttribute getSystemRegion_Name();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.SystemDomain <em>System Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Domain</em>'.
	 * @see ching.ProblemFrame.SystemDomain
	 * @generated
	 */
	EClass getSystemDomain();

	/**
	 * Returns the meta object for class '{@link ching.ProblemFrame.ExternalDomain <em>External Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Domain</em>'.
	 * @see ching.ProblemFrame.ExternalDomain
	 * @generated
	 */
	EClass getExternalDomain();

	/**
	 * Returns the meta object for enum '{@link ching.ProblemFrame.DType <em>DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DType</em>'.
	 * @see ching.ProblemFrame.DType
	 * @generated
	 */
	EEnum getDType();

	/**
	 * Returns the meta object for enum '{@link ching.ProblemFrame.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PType</em>'.
	 * @see ching.ProblemFrame.PType
	 * @generated
	 */
	EEnum getPType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProblemFrameFactory getProblemFrameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.ProblemDiagramImpl <em>Problem Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.ProblemDiagramImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getProblemDiagram()
		 * @generated
		 */
		EClass PROBLEM_DIAGRAM = eINSTANCE.getProblemDiagram();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_DIAGRAM__DOMAIN = eINSTANCE.getProblemDiagram_Domain();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_DIAGRAM__REQUIREMENT = eINSTANCE.getProblemDiagram_Requirement();

		/**
		 * The meta object literal for the '<em><b>Problem Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_DIAGRAM__PROBLEM_NAME = eINSTANCE.getProblemDiagram_ProblemName();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_DIAGRAM__INTERFACES = eINSTANCE.getProblemDiagram_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_DIAGRAM__REFERENCE = eINSTANCE.getProblemDiagram_Reference();

		/**
		 * The meta object literal for the '<em><b>Systemregion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_DIAGRAM__SYSTEMREGION = eINSTANCE.getProblemDiagram_Systemregion();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.DomainImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Phenomena</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PHENOMENA = eINSTANCE.getDomain_Phenomena();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__TYPE = eINSTANCE.getDomain_Type();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__STATEMACHINE = eINSTANCE.getDomain_Statemachine();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.MachineImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.LexicalDomainImpl <em>Lexical Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.LexicalDomainImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getLexicalDomain()
		 * @generated
		 */
		EClass LEXICAL_DOMAIN = eINSTANCE.getLexicalDomain();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.InterfaceImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Shared Phenomena</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SHARED_PHENOMENA = eINSTANCE.getInterface_SharedPhenomena();

		/**
		 * The meta object literal for the '<em><b>Target Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__TARGET_DOMAIN = eINSTANCE.getInterface_TargetDomain();

		/**
		 * The meta object literal for the '<em><b>Source Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SOURCE_DOMAIN = eINSTANCE.getInterface_SourceDomain();

		/**
		 * The meta object literal for the '<em><b>Begin Control Shared Phenomena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA = eINSTANCE.getInterface_BeginControlSharedPhenomena();

		/**
		 * The meta object literal for the '<em><b>End Control Shared Phenomena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__END_CONTROL_SHARED_PHENOMENA = eINSTANCE.getInterface_EndControlSharedPhenomena();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.PhenomenonImpl <em>Phenomenon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.PhenomenonImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getPhenomenon()
		 * @generated
		 */
		EClass PHENOMENON = eINSTANCE.getPhenomenon();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHENOMENON__NAME = eINSTANCE.getPhenomenon_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHENOMENON__TYPE = eINSTANCE.getPhenomenon_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHENOMENON__DESCRIPTION = eINSTANCE.getPhenomenon_Description();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.RequirementReferenceImpl <em>Requirement Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.RequirementReferenceImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getRequirementReference()
		 * @generated
		 */
		EClass REQUIREMENT_REFERENCE = eINSTANCE.getRequirementReference();

		/**
		 * The meta object literal for the '<em><b>Phenomenon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_REFERENCE__PHENOMENON = eINSTANCE.getRequirementReference_Phenomenon();

		/**
		 * The meta object literal for the '<em><b>Req Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_REFERENCE__REQ_REFERENCE = eINSTANCE.getRequirementReference_ReqReference();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.ConstrainingRequirementReferenceImpl <em>Constraining Requirement Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.ConstrainingRequirementReferenceImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getConstrainingRequirementReference()
		 * @generated
		 */
		EClass CONSTRAINING_REQUIREMENT_REFERENCE = eINSTANCE.getConstrainingRequirementReference();

		/**
		 * The meta object literal for the '<em><b>Constrains</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS = eINSTANCE
				.getConstrainingRequirementReference_Constrains();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.RequirementImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__STATEMACHINE = eINSTANCE.getRequirement_Statemachine();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.ReferenceImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SOURCE = eINSTANCE.getReference_Source();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.MyStateMachineImpl <em>My State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.MyStateMachineImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getMyStateMachine()
		 * @generated
		 */
		EClass MY_STATE_MACHINE = eINSTANCE.getMyStateMachine();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.HumanImpl <em>Human</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.HumanImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getHuman()
		 * @generated
		 */
		EClass HUMAN = eINSTANCE.getHuman();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.ExternalCausalDomainImpl <em>External Causal Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.ExternalCausalDomainImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getExternalCausalDomain()
		 * @generated
		 */
		EClass EXTERNAL_CAUSAL_DOMAIN = eINSTANCE.getExternalCausalDomain();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.ExternalBiddableDomainImpl <em>External Biddable Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.ExternalBiddableDomainImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getExternalBiddableDomain()
		 * @generated
		 */
		EClass EXTERNAL_BIDDABLE_DOMAIN = eINSTANCE.getExternalBiddableDomain();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.InternalCausalDomainImpl <em>Internal Causal Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.InternalCausalDomainImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getInternalCausalDomain()
		 * @generated
		 */
		EClass INTERNAL_CAUSAL_DOMAIN = eINSTANCE.getInternalCausalDomain();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.SystemRegionImpl <em>System Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.SystemRegionImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getSystemRegion()
		 * @generated
		 */
		EClass SYSTEM_REGION = eINSTANCE.getSystemRegion();

		/**
		 * The meta object literal for the '<em><b>System Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REGION__SYSTEM_DOMAIN = eINSTANCE.getSystemRegion_SystemDomain();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REGION__STATEMACHINE = eINSTANCE.getSystemRegion_Statemachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGION__NAME = eINSTANCE.getSystemRegion_Name();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.SystemDomainImpl <em>System Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.SystemDomainImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getSystemDomain()
		 * @generated
		 */
		EClass SYSTEM_DOMAIN = eINSTANCE.getSystemDomain();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.impl.ExternalDomainImpl <em>External Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.impl.ExternalDomainImpl
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getExternalDomain()
		 * @generated
		 */
		EClass EXTERNAL_DOMAIN = eINSTANCE.getExternalDomain();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.DType <em>DType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.DType
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getDType()
		 * @generated
		 */
		EEnum DTYPE = eINSTANCE.getDType();

		/**
		 * The meta object literal for the '{@link ching.ProblemFrame.PType <em>PType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ching.ProblemFrame.PType
		 * @see ching.ProblemFrame.impl.ProblemFramePackageImpl#getPType()
		 * @generated
		 */
		EEnum PTYPE = eINSTANCE.getPType();

	}

} //ProblemFramePackage
