/**
 */
package org.eclipse.gemoc.statemachine.model.UML;

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
 * @see org.eclipse.gemoc.statemachine.model.UML.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public interface StatemachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/StateMachineModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StateMachineModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachinePackage eINSTANCE = org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.NamedElementImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.NamespaceImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.BehaviorImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = NAMESPACE__NAME;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REGION = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CONNECTION_POINT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Submachine State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SUBMACHINE_STATE = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CURRENT_VERTEX = BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Pool</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__EVENT_POOL = BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PROPERTY = BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INPUT = BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSITION = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUBVERTEX = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATEMACHINE = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATE = NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CURRENT_VERTEX = NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Direct Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CURRENT_DIRECT_VERTEX = NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Teamdiagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TEAMDIAGRAM = NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.VertexImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__KIND = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONTAINER = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.ConnectionPointReferenceImpl <em>Connection Point Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.ConnectionPointReferenceImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getConnectionPointReference()
	 * @generated
	 */
	int CONNECTION_POINT_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__CONTAINER = VERTEX__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__INCOMING = VERTEX__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__EXIT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__ENTRY = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__STATE = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Point Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Point Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.PseudostateImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__CONTAINER = VERTEX__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INCOMING = VERTEX__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__KIND = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__STATE = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__STATEMACHINE = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONTAINER = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REGION = NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONNECTION = NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONNECTION_POINT = NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Submachine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUBMACHINE = NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DEFERRABLE_TRIGGER = NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_INVARIANT = NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_ACTIVITY = NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_COMPOSITE = NAMESPACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_ORTHOGONAL = NAMESPACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_SIMPLE = NAMESPACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_SUBMACHINE_STATE = NAMESPACE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.FinalStateImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__REGION = STATE__REGION;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CONNECTION = STATE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CONNECTION_POINT = STATE__CONNECTION_POINT;

	/**
	 * The feature id for the '<em><b>Submachine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__SUBMACHINE = STATE__SUBMACHINE;

	/**
	 * The feature id for the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DEFERRABLE_TRIGGER = STATE__DEFERRABLE_TRIGGER;

	/**
	 * The feature id for the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STATE_INVARIANT = STATE__STATE_INVARIANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DO_ACTIVITY = STATE__DO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_COMPOSITE = STATE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_ORTHOGONAL = STATE__IS_ORTHOGONAL;

	/**
	 * The feature id for the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_SIMPLE = STATE__IS_SIMPLE;

	/**
	 * The feature id for the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_SUBMACHINE_STATE = STATE__IS_SUBMACHINE_STATE;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.TriggerImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.ConstraintImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.ValueSpecificationImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 13;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__BODY = 0;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.SetValueImpl <em>Set Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.SetValueImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getSetValue()
	 * @generated
	 */
	int SET_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__BODY = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.PropertyImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.SendEventImpl <em>Send Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.SendEventImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getSendEvent()
	 * @generated
	 */
	int SEND_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT__EVENT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.TeamDiagramImpl <em>Team Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.TeamDiagramImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTeamDiagram()
	 * @generated
	 */
	int TEAM_DIAGRAM = 17;

	/**
	 * The feature id for the '<em><b>Human</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_DIAGRAM__HUMAN = 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_DIAGRAM__MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Humantomachinerelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_DIAGRAM__HUMANTOMACHINERELATION = 2;

	/**
	 * The feature id for the '<em><b>Machinetohumanrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_DIAGRAM__MACHINETOHUMANRELATION = 3;

	/**
	 * The number of structural features of the '<em>Team Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Team Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.HumanImpl <em>Human</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.HumanImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getHuman()
	 * @generated
	 */
	int HUMAN = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.MachineImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.HumanToMachineRelationImpl <em>Human To Machine Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.HumanToMachineRelationImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getHumanToMachineRelation()
	 * @generated
	 */
	int HUMAN_TO_MACHINE_RELATION = 20;

	/**
	 * The feature id for the '<em><b>Human Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Machine Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_TO_MACHINE_RELATION__RELATION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Human To Machine Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_TO_MACHINE_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Human To Machine Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_TO_MACHINE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.MachineToHumanRelationImpl <em>Machine To Human Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.MachineToHumanRelationImpl
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getMachineToHumanRelation()
	 * @generated
	 */
	int MACHINE_TO_HUMAN_RELATION = 21;

	/**
	 * The feature id for the '<em><b>Machine Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Human Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_TO_HUMAN_RELATION__RELATION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_TO_HUMAN_RELATION__INTERFACE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Machine To Human Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_TO_HUMAN_RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Machine To Human Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_TO_HUMAN_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.TransitionKind <em>Transition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.TransitionKind
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTransitionKind()
	 * @generated
	 */
	int TRANSITION_KIND = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.statemachine.model.UML.PseudostateKind <em>Pseudostate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.statemachine.model.UML.PseudostateKind
	 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getPseudostateKind()
	 * @generated
	 */
	int PSEUDOSTATE_KIND = 23;

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getRegion()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Region();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getConnectionPoint()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ConnectionPoint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getSubmachineState <em>Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Submachine State</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getSubmachineState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_SubmachineState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getCurrentVertex <em>Current Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Vertex</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getCurrentVertex()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_CurrentVertex();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getEventPool <em>Event Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Pool</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getEventPool()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_EventPool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getProperty()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Property();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gemoc.statemachine.model.UML.StateMachine#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.StateMachine#getInput()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_Input();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getTransition()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getSubvertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Subvertex();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statemachine</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getStatemachine()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Statemachine();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_State();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentVertex <em>Current Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Vertex</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentVertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_CurrentVertex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentDirectVertex <em>Current Direct Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Direct Vertex</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getCurrentDirectVertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_CurrentDirectVertex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.Region#getTeamdiagram <em>Teamdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teamdiagram</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Region#getTeamdiagram()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Teamdiagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.statemachine.model.UML.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Vertex#getContainer()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Container();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.statemachine.model.UML.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Vertex#getIncoming()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.statemachine.model.UML.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Vertex#getOutgoing()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getKind()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Kind();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getContainer()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference <em>Connection Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Reference</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference
	 * @generated
	 */
	EClass getConnectionPointReference();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exit</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getExit()
	 * @see #getConnectionPointReference()
	 * @generated
	 */
	EReference getConnectionPointReference_Exit();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getEntry()
	 * @see #getConnectionPointReference()
	 * @generated
	 */
	EReference getConnectionPointReference_Entry();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.ConnectionPointReference#getState()
	 * @see #getConnectionPointReference()
	 * @generated
	 */
	EReference getConnectionPointReference_State();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.Pseudostate#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Pseudostate#getKind()
	 * @see #getPseudostate()
	 * @generated
	 */
	EAttribute getPseudostate_Kind();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.statemachine.model.UML.Pseudostate#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Pseudostate#getState()
	 * @see #getPseudostate()
	 * @generated
	 */
	EReference getPseudostate_State();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.statemachine.model.UML.Pseudostate#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statemachine</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Pseudostate#getStatemachine()
	 * @see #getPseudostate()
	 * @generated
	 */
	EReference getPseudostate_Statemachine();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.State#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getRegion()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Region();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.State#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getConnection()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.State#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getConnectionPoint()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ConnectionPoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.State#getSubmachine <em>Submachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Submachine</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getSubmachine()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Submachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.State#getDeferrableTrigger <em>Deferrable Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deferrable Trigger</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getDeferrableTrigger()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DeferrableTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.statemachine.model.UML.State#getStateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Invariant</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getStateInvariant()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.statemachine.model.UML.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.statemachine.model.UML.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.statemachine.model.UML.State#getDoActivity <em>Do Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Activity</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#getDoActivity()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.State#isIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#isIsComposite()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.State#isIsOrthogonal <em>Is Orthogonal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Orthogonal</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#isIsOrthogonal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsOrthogonal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.State#isIsSimple <em>Is Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Simple</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#isIsSimple()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsSimple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.State#isIsSubmachineState <em>Is Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Submachine State</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.State#isIsSubmachineState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsSubmachineState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.statemachine.model.UML.Constraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Constraint#getSpecification()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Specification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.ValueSpecification#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.ValueSpecification#getBody()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Value</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.SetValue
	 * @generated
	 */
	EClass getSetValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.SetValue#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.SetValue#getBody()
	 * @see #getSetValue()
	 * @generated
	 */
	EAttribute getSetValue_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.SendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Event</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.SendEvent
	 * @generated
	 */
	EClass getSendEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.SendEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.SendEvent#getEvent()
	 * @see #getSendEvent()
	 * @generated
	 */
	EAttribute getSendEvent_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram <em>Team Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Diagram</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TeamDiagram
	 * @generated
	 */
	EClass getTeamDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getHuman <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Human</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getHuman()
	 * @see #getTeamDiagram()
	 * @generated
	 */
	EReference getTeamDiagram_Human();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getMachine()
	 * @see #getTeamDiagram()
	 * @generated
	 */
	EReference getTeamDiagram_Machine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getHumantomachinerelation <em>Humantomachinerelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Humantomachinerelation</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getHumantomachinerelation()
	 * @see #getTeamDiagram()
	 * @generated
	 */
	EReference getTeamDiagram_Humantomachinerelation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getMachinetohumanrelation <em>Machinetohumanrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machinetohumanrelation</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TeamDiagram#getMachinetohumanrelation()
	 * @see #getTeamDiagram()
	 * @generated
	 */
	EReference getTeamDiagram_Machinetohumanrelation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Human
	 * @generated
	 */
	EClass getHuman();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.Human#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Human#getName()
	 * @see #getHuman()
	 * @generated
	 */
	EAttribute getHuman_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation <em>Human To Machine Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human To Machine Relation</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation
	 * @generated
	 */
	EClass getHumanToMachineRelation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getHumanSource <em>Human Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Human Source</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getHumanSource()
	 * @see #getHumanToMachineRelation()
	 * @generated
	 */
	EReference getHumanToMachineRelation_HumanSource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getMachineTarget <em>Machine Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Target</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getMachineTarget()
	 * @see #getHumanToMachineRelation()
	 * @generated
	 */
	EReference getHumanToMachineRelation_MachineTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getRelationName <em>Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Name</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.HumanToMachineRelation#getRelationName()
	 * @see #getHumanToMachineRelation()
	 * @generated
	 */
	EAttribute getHumanToMachineRelation_RelationName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation <em>Machine To Human Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine To Human Relation</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation
	 * @generated
	 */
	EClass getMachineToHumanRelation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getMachineSource <em>Machine Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Source</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getMachineSource()
	 * @see #getMachineToHumanRelation()
	 * @generated
	 */
	EReference getMachineToHumanRelation_MachineSource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getHumanTarget <em>Human Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Human Target</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getHumanTarget()
	 * @see #getMachineToHumanRelation()
	 * @generated
	 */
	EReference getMachineToHumanRelation_HumanTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getRelationName <em>Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Name</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getRelationName()
	 * @see #getMachineToHumanRelation()
	 * @generated
	 */
	EAttribute getMachineToHumanRelation_RelationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.MachineToHumanRelation#getInterfaceName()
	 * @see #getMachineToHumanRelation()
	 * @generated
	 */
	EAttribute getMachineToHumanRelation_InterfaceName();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.statemachine.model.UML.TransitionKind <em>Transition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Kind</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.TransitionKind
	 * @generated
	 */
	EEnum getTransitionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.statemachine.model.UML.PseudostateKind <em>Pseudostate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pseudostate Kind</em>'.
	 * @see org.eclipse.gemoc.statemachine.model.UML.PseudostateKind
	 * @generated
	 */
	EEnum getPseudostateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatemachineFactory getStatemachineFactory();

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
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StateMachineImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REGION = eINSTANCE.getStateMachine_Region();

		/**
		 * The meta object literal for the '<em><b>Connection Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__CONNECTION_POINT = eINSTANCE.getStateMachine_ConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Submachine State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__SUBMACHINE_STATE = eINSTANCE.getStateMachine_SubmachineState();

		/**
		 * The meta object literal for the '<em><b>Current Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__CURRENT_VERTEX = eINSTANCE.getStateMachine_CurrentVertex();

		/**
		 * The meta object literal for the '<em><b>Event Pool</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__EVENT_POOL = eINSTANCE.getStateMachine_EventPool();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__PROPERTY = eINSTANCE.getStateMachine_Property();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__INPUT = eINSTANCE.getStateMachine_Input();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.RegionImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSITION = eINSTANCE.getRegion_Transition();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__SUBVERTEX = eINSTANCE.getRegion_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATEMACHINE = eINSTANCE.getRegion_Statemachine();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATE = eINSTANCE.getRegion_State();

		/**
		 * The meta object literal for the '<em><b>Current Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__CURRENT_VERTEX = eINSTANCE.getRegion_CurrentVertex();

		/**
		 * The meta object literal for the '<em><b>Current Direct Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__CURRENT_DIRECT_VERTEX = eINSTANCE.getRegion_CurrentDirectVertex();

		/**
		 * The meta object literal for the '<em><b>Teamdiagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TEAMDIAGRAM = eINSTANCE.getRegion_Teamdiagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.NamespaceImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.NamedElementImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.VertexImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__CONTAINER = eINSTANCE.getVertex_Container();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING = eINSTANCE.getVertex_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING = eINSTANCE.getVertex_Outgoing();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.TransitionImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__KIND = eINSTANCE.getTransition_Kind();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONTAINER = eINSTANCE.getTransition_Container();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.ConnectionPointReferenceImpl <em>Connection Point Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.ConnectionPointReferenceImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getConnectionPointReference()
		 * @generated
		 */
		EClass CONNECTION_POINT_REFERENCE = eINSTANCE.getConnectionPointReference();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_REFERENCE__EXIT = eINSTANCE.getConnectionPointReference_Exit();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_REFERENCE__ENTRY = eINSTANCE.getConnectionPointReference_Entry();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_REFERENCE__STATE = eINSTANCE.getConnectionPointReference_State();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.PseudostateImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDOSTATE__KIND = eINSTANCE.getPseudostate_Kind();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDOSTATE__STATE = eINSTANCE.getPseudostate_State();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDOSTATE__STATEMACHINE = eINSTANCE.getPseudostate_Statemachine();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StateImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REGION = eINSTANCE.getState_Region();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONNECTION = eINSTANCE.getState_Connection();

		/**
		 * The meta object literal for the '<em><b>Connection Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONNECTION_POINT = eINSTANCE.getState_ConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Submachine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUBMACHINE = eINSTANCE.getState_Submachine();

		/**
		 * The meta object literal for the '<em><b>Deferrable Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DEFERRABLE_TRIGGER = eINSTANCE.getState_DeferrableTrigger();

		/**
		 * The meta object literal for the '<em><b>State Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_INVARIANT = eINSTANCE.getState_StateInvariant();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '<em><b>Do Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_ACTIVITY = eINSTANCE.getState_DoActivity();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_COMPOSITE = eINSTANCE.getState_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Orthogonal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_ORTHOGONAL = eINSTANCE.getState_IsOrthogonal();

		/**
		 * The meta object literal for the '<em><b>Is Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_SIMPLE = eINSTANCE.getState_IsSimple();

		/**
		 * The meta object literal for the '<em><b>Is Submachine State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_SUBMACHINE_STATE = eINSTANCE.getState_IsSubmachineState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.FinalStateImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.TriggerImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.ConstraintImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SPECIFICATION = eINSTANCE.getConstraint_Specification();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.BehaviorImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.ValueSpecificationImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__BODY = eINSTANCE.getValueSpecification_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.SetValueImpl <em>Set Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.SetValueImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getSetValue()
		 * @generated
		 */
		EClass SET_VALUE = eINSTANCE.getSetValue();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VALUE__BODY = eINSTANCE.getSetValue_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.PropertyImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.SendEventImpl <em>Send Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.SendEventImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getSendEvent()
		 * @generated
		 */
		EClass SEND_EVENT = eINSTANCE.getSendEvent();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_EVENT__EVENT = eINSTANCE.getSendEvent_Event();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.TeamDiagramImpl <em>Team Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.TeamDiagramImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTeamDiagram()
		 * @generated
		 */
		EClass TEAM_DIAGRAM = eINSTANCE.getTeamDiagram();

		/**
		 * The meta object literal for the '<em><b>Human</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_DIAGRAM__HUMAN = eINSTANCE.getTeamDiagram_Human();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_DIAGRAM__MACHINE = eINSTANCE.getTeamDiagram_Machine();

		/**
		 * The meta object literal for the '<em><b>Humantomachinerelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_DIAGRAM__HUMANTOMACHINERELATION = eINSTANCE.getTeamDiagram_Humantomachinerelation();

		/**
		 * The meta object literal for the '<em><b>Machinetohumanrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_DIAGRAM__MACHINETOHUMANRELATION = eINSTANCE.getTeamDiagram_Machinetohumanrelation();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.HumanImpl <em>Human</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.HumanImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getHuman()
		 * @generated
		 */
		EClass HUMAN = eINSTANCE.getHuman();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN__NAME = eINSTANCE.getHuman_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.MachineImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.HumanToMachineRelationImpl <em>Human To Machine Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.HumanToMachineRelationImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getHumanToMachineRelation()
		 * @generated
		 */
		EClass HUMAN_TO_MACHINE_RELATION = eINSTANCE.getHumanToMachineRelation();

		/**
		 * The meta object literal for the '<em><b>Human Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_TO_MACHINE_RELATION__HUMAN_SOURCE = eINSTANCE.getHumanToMachineRelation_HumanSource();

		/**
		 * The meta object literal for the '<em><b>Machine Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_TO_MACHINE_RELATION__MACHINE_TARGET = eINSTANCE.getHumanToMachineRelation_MachineTarget();

		/**
		 * The meta object literal for the '<em><b>Relation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_TO_MACHINE_RELATION__RELATION_NAME = eINSTANCE.getHumanToMachineRelation_RelationName();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.impl.MachineToHumanRelationImpl <em>Machine To Human Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.MachineToHumanRelationImpl
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getMachineToHumanRelation()
		 * @generated
		 */
		EClass MACHINE_TO_HUMAN_RELATION = eINSTANCE.getMachineToHumanRelation();

		/**
		 * The meta object literal for the '<em><b>Machine Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_TO_HUMAN_RELATION__MACHINE_SOURCE = eINSTANCE.getMachineToHumanRelation_MachineSource();

		/**
		 * The meta object literal for the '<em><b>Human Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_TO_HUMAN_RELATION__HUMAN_TARGET = eINSTANCE.getMachineToHumanRelation_HumanTarget();

		/**
		 * The meta object literal for the '<em><b>Relation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_TO_HUMAN_RELATION__RELATION_NAME = eINSTANCE.getMachineToHumanRelation_RelationName();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_TO_HUMAN_RELATION__INTERFACE_NAME = eINSTANCE.getMachineToHumanRelation_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.TransitionKind <em>Transition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.TransitionKind
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getTransitionKind()
		 * @generated
		 */
		EEnum TRANSITION_KIND = eINSTANCE.getTransitionKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.statemachine.model.UML.PseudostateKind <em>Pseudostate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.statemachine.model.UML.PseudostateKind
		 * @see org.eclipse.gemoc.statemachine.model.UML.impl.StatemachinePackageImpl#getPseudostateKind()
		 * @generated
		 */
		EEnum PSEUDOSTATE_KIND = eINSTANCE.getPseudostateKind();

	}

} //StatemachinePackage
