/**
 */
package ching.ProblemFrame.impl;

import UML.UMLPackage;

import UML.impl.UMLPackageImpl;
import ching.ProblemFrame.ConstrainingRequirementReference;
import ching.ProblemFrame.DType;
import ching.ProblemFrame.Domain;
import ching.ProblemFrame.ExternalBiddableDomain;
import ching.ProblemFrame.ExternalCausalDomain;
import ching.ProblemFrame.ExternalDomain;
import ching.ProblemFrame.Human;
import ching.ProblemFrame.Interface;
import ching.ProblemFrame.InternalCausalDomain;
import ching.ProblemFrame.LexicalDomain;
import ching.ProblemFrame.Machine;
import ching.ProblemFrame.MyStateMachine;
import ching.ProblemFrame.PType;
import ching.ProblemFrame.Phenomenon;
import ching.ProblemFrame.ProblemDiagram;
import ching.ProblemFrame.ProblemFrameFactory;
import ching.ProblemFrame.ProblemFramePackage;
import ching.ProblemFrame.Reference;
import ching.ProblemFrame.Requirement;
import ching.ProblemFrame.RequirementReference;

import ching.ProblemFrame.SystemDomain;
import ching.ProblemFrame.SystemRegion;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemFramePackageImpl extends EPackageImpl implements ProblemFramePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexicalDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phenomenonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainingRequirementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCausalDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalBiddableDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalCausalDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ching.ProblemFrame.ProblemFramePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProblemFramePackageImpl() {
		super(eNS_URI, ProblemFrameFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProblemFramePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProblemFramePackage init() {
		if (isInited)
			return (ProblemFramePackage) EPackage.Registry.INSTANCE.getEPackage(ProblemFramePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProblemFramePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProblemFramePackageImpl theProblemFramePackage = registeredProblemFramePackage instanceof ProblemFramePackageImpl
				? (ProblemFramePackageImpl) registeredProblemFramePackage
				: new ProblemFramePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		UMLPackageImpl theUMLPackage = (UMLPackageImpl) (registeredPackage instanceof UMLPackageImpl ? registeredPackage
				: UMLPackage.eINSTANCE);

		// Create package meta-data objects
		theProblemFramePackage.createPackageContents();
		theUMLPackage.createPackageContents();

		// Initialize created meta-data
		theProblemFramePackage.initializePackageContents();
		theUMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProblemFramePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProblemFramePackage.eNS_URI, theProblemFramePackage);
		return theProblemFramePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemDiagram() {
		return problemDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemDiagram_Domain() {
		return (EReference) problemDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemDiagram_Requirement() {
		return (EReference) problemDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemDiagram_ProblemName() {
		return (EAttribute) problemDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemDiagram_Interfaces() {
		return (EReference) problemDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemDiagram_Reference() {
		return (EReference) problemDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemDiagram_Systemregion() {
		return (EReference) problemDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute) domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Phenomena() {
		return (EReference) domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Type() {
		return (EAttribute) domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Statemachine() {
		return (EReference) domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexicalDomain() {
		return lexicalDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_SharedPhenomena() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_TargetDomain() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_SourceDomain() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_BeginControlSharedPhenomena() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_EndControlSharedPhenomena() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhenomenon() {
		return phenomenonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhenomenon_Name() {
		return (EAttribute) phenomenonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhenomenon_Type() {
		return (EAttribute) phenomenonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhenomenon_Description() {
		return (EAttribute) phenomenonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementReference() {
		return requirementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementReference_Phenomenon() {
		return (EReference) requirementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementReference_ReqReference() {
		return (EReference) requirementReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainingRequirementReference() {
		return constrainingRequirementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainingRequirementReference_Constrains() {
		return (EReference) constrainingRequirementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Statemachine() {
		return (EReference) requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Source() {
		return (EReference) referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyStateMachine() {
		return myStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHuman() {
		return humanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalCausalDomain() {
		return externalCausalDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalBiddableDomain() {
		return externalBiddableDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalCausalDomain() {
		return internalCausalDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRegion() {
		return systemRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRegion_SystemDomain() {
		return (EReference) systemRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRegion_Statemachine() {
		return (EReference) systemRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegion_Name() {
		return (EAttribute) systemRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDomain() {
		return systemDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDomain() {
		return externalDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDType() {
		return dTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPType() {
		return pTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemFrameFactory getProblemFrameFactory() {
		return (ProblemFrameFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		problemDiagramEClass = createEClass(PROBLEM_DIAGRAM);
		createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__DOMAIN);
		createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__REQUIREMENT);
		createEAttribute(problemDiagramEClass, PROBLEM_DIAGRAM__PROBLEM_NAME);
		createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__INTERFACES);
		createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__REFERENCE);
		createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__SYSTEMREGION);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEReference(domainEClass, DOMAIN__PHENOMENA);
		createEAttribute(domainEClass, DOMAIN__TYPE);
		createEReference(domainEClass, DOMAIN__STATEMACHINE);

		machineEClass = createEClass(MACHINE);

		lexicalDomainEClass = createEClass(LEXICAL_DOMAIN);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__SHARED_PHENOMENA);
		createEReference(interfaceEClass, INTERFACE__TARGET_DOMAIN);
		createEReference(interfaceEClass, INTERFACE__SOURCE_DOMAIN);
		createEAttribute(interfaceEClass, INTERFACE__BEGIN_CONTROL_SHARED_PHENOMENA);
		createEAttribute(interfaceEClass, INTERFACE__END_CONTROL_SHARED_PHENOMENA);

		phenomenonEClass = createEClass(PHENOMENON);
		createEAttribute(phenomenonEClass, PHENOMENON__NAME);
		createEAttribute(phenomenonEClass, PHENOMENON__TYPE);
		createEAttribute(phenomenonEClass, PHENOMENON__DESCRIPTION);

		requirementReferenceEClass = createEClass(REQUIREMENT_REFERENCE);
		createEReference(requirementReferenceEClass, REQUIREMENT_REFERENCE__PHENOMENON);
		createEReference(requirementReferenceEClass, REQUIREMENT_REFERENCE__REQ_REFERENCE);

		constrainingRequirementReferenceEClass = createEClass(CONSTRAINING_REQUIREMENT_REFERENCE);
		createEReference(constrainingRequirementReferenceEClass, CONSTRAINING_REQUIREMENT_REFERENCE__CONSTRAINS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEReference(requirementEClass, REQUIREMENT__STATEMACHINE);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__SOURCE);

		myStateMachineEClass = createEClass(MY_STATE_MACHINE);

		humanEClass = createEClass(HUMAN);

		externalCausalDomainEClass = createEClass(EXTERNAL_CAUSAL_DOMAIN);

		externalBiddableDomainEClass = createEClass(EXTERNAL_BIDDABLE_DOMAIN);

		internalCausalDomainEClass = createEClass(INTERNAL_CAUSAL_DOMAIN);

		systemRegionEClass = createEClass(SYSTEM_REGION);
		createEReference(systemRegionEClass, SYSTEM_REGION__SYSTEM_DOMAIN);
		createEReference(systemRegionEClass, SYSTEM_REGION__STATEMACHINE);
		createEAttribute(systemRegionEClass, SYSTEM_REGION__NAME);

		systemDomainEClass = createEClass(SYSTEM_DOMAIN);

		externalDomainEClass = createEClass(EXTERNAL_DOMAIN);

		// Create enums
		dTypeEEnum = createEEnum(DTYPE);
		pTypeEEnum = createEEnum(PTYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		machineEClass.getESuperTypes().add(this.getSystemDomain());
		lexicalDomainEClass.getESuperTypes().add(this.getInternalCausalDomain());
		requirementReferenceEClass.getESuperTypes().add(this.getReference());
		constrainingRequirementReferenceEClass.getESuperTypes().add(this.getReference());
		myStateMachineEClass.getESuperTypes().add(theUMLPackage.getStateMachine());
		humanEClass.getESuperTypes().add(this.getSystemDomain());
		externalCausalDomainEClass.getESuperTypes().add(this.getExternalDomain());
		externalBiddableDomainEClass.getESuperTypes().add(this.getExternalDomain());
		internalCausalDomainEClass.getESuperTypes().add(this.getSystemDomain());
		systemDomainEClass.getESuperTypes().add(this.getDomain());
		externalDomainEClass.getESuperTypes().add(this.getDomain());

		// Initialize classes, features, and operations; add parameters
		initEClass(problemDiagramEClass, ProblemDiagram.class, "ProblemDiagram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblemDiagram_Domain(), this.getDomain(), null, "domain", null, 0, -1, ProblemDiagram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemDiagram_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1,
				ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblemDiagram_ProblemName(), theXMLTypePackage.getString(), "problemName", null, 0, 1,
				ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProblemDiagram_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1,
				ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemDiagram_Reference(), this.getReference(), null, "reference", null, 0, -1,
				ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemDiagram_Systemregion(), this.getSystemRegion(), null, "systemregion", null, 0, -1,
				ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Domain.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Phenomena(), this.getPhenomenon(), null, "phenomena", null, 0, -1, Domain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Type(), this.getDType(), "type", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Statemachine(), this.getMyStateMachine(), null, "statemachine", null, 0, -1,
				Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lexicalDomainEClass, LexicalDomain.class, "LexicalDomain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_SharedPhenomena(), this.getPhenomenon(), null, "sharedPhenomena", null, 1, -1,
				Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_TargetDomain(), this.getDomain(), null, "targetDomain", null, 0, 1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_SourceDomain(), this.getDomain(), null, "sourceDomain", null, 0, 1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_BeginControlSharedPhenomena(), theXMLTypePackage.getString(),
				"beginControlSharedPhenomena", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_EndControlSharedPhenomena(), theXMLTypePackage.getString(),
				"endControlSharedPhenomena", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phenomenonEClass, Phenomenon.class, "Phenomenon", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhenomenon_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Phenomenon.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhenomenon_Type(), this.getPType(), "type", null, 0, 1, Phenomenon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhenomenon_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				Phenomenon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(requirementReferenceEClass, RequirementReference.class, "RequirementReference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementReference_Phenomenon(), this.getPhenomenon(), null, "phenomenon", null, 0, -1,
				RequirementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementReference_ReqReference(), this.getDomain(), null, "reqReference", null, 0, 1,
				RequirementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constrainingRequirementReferenceEClass, ConstrainingRequirementReference.class,
				"ConstrainingRequirementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainingRequirementReference_Constrains(), this.getDomain(), null, "constrains", null, 0,
				1, ConstrainingRequirementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Requirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Statemachine(), this.getMyStateMachine(), null, "statemachine", null, 0, -1,
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Source(), this.getRequirement(), null, "source", null, 0, 1, Reference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myStateMachineEClass, MyStateMachine.class, "MyStateMachine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(humanEClass, Human.class, "Human", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalCausalDomainEClass, ExternalCausalDomain.class, "ExternalCausalDomain", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalBiddableDomainEClass, ExternalBiddableDomain.class, "ExternalBiddableDomain", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalCausalDomainEClass, InternalCausalDomain.class, "InternalCausalDomain", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemRegionEClass, SystemRegion.class, "SystemRegion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRegion_SystemDomain(), this.getSystemDomain(), null, "systemDomain", null, 0, -1,
				SystemRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemRegion_Statemachine(), this.getMyStateMachine(), null, "statemachine", null, 0, -1,
				SystemRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemRegion_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SystemRegion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemDomainEClass, SystemDomain.class, "SystemDomain", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalDomainEClass, ExternalDomain.class, "ExternalDomain", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dTypeEEnum, DType.class, "DType");
		addEEnumLiteral(dTypeEEnum, DType.GIVEN);
		addEEnumLiteral(dTypeEEnum, DType.DESIGNED);

		initEEnum(pTypeEEnum, PType.class, "PType");
		addEEnumLiteral(pTypeEEnum, PType.STATE);
		addEEnumLiteral(pTypeEEnum, PType.EVENT);
		addEEnumLiteral(pTypeEEnum, PType.ENTITY);
		addEEnumLiteral(pTypeEEnum, PType.BEHAVIOR);

		// Create resource
		createResource(eNS_URI);
	}

} //ProblemFramePackageImpl
