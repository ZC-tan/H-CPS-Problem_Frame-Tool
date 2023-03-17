/**
 */
package ching.ProblemFrame.impl;

import ching.ProblemFrame.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemFrameFactoryImpl extends EFactoryImpl implements ProblemFrameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemFrameFactory init() {
		try {
			ProblemFrameFactory theProblemFrameFactory = (ProblemFrameFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProblemFramePackage.eNS_URI);
			if (theProblemFrameFactory != null) {
				return theProblemFrameFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProblemFrameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemFrameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProblemFramePackage.PROBLEM_DIAGRAM:
			return createProblemDiagram();
		case ProblemFramePackage.MACHINE:
			return createMachine();
		case ProblemFramePackage.LEXICAL_DOMAIN:
			return createLexicalDomain();
		case ProblemFramePackage.BIDDABLE_DOMAIN:
			return createBiddableDomain();
		case ProblemFramePackage.CAUSAL_DOMAIN:
			return createCausalDomain();
		case ProblemFramePackage.INTERFACE:
			return createInterface();
		case ProblemFramePackage.PHENOMENON:
			return createPhenomenon();
		case ProblemFramePackage.REQUIREMENT_REFERENCE:
			return createRequirementReference();
		case ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE:
			return createConstrainingRequirementReference();
		case ProblemFramePackage.REQUIREMENT:
			return createRequirement();
		case ProblemFramePackage.MY_STATE_MACHINE:
			return createMyStateMachine();
		case ProblemFramePackage.HUMAN:
			return createHuman();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ProblemFramePackage.DTYPE:
			return createDTypeFromString(eDataType, initialValue);
		case ProblemFramePackage.PTYPE:
			return createPTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ProblemFramePackage.DTYPE:
			return convertDTypeToString(eDataType, instanceValue);
		case ProblemFramePackage.PTYPE:
			return convertPTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemDiagram createProblemDiagram() {
		ProblemDiagramImpl problemDiagram = new ProblemDiagramImpl();
		return problemDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexicalDomain createLexicalDomain() {
		LexicalDomainImpl lexicalDomain = new LexicalDomainImpl();
		return lexicalDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiddableDomain createBiddableDomain() {
		BiddableDomainImpl biddableDomain = new BiddableDomainImpl();
		return biddableDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalDomain createCausalDomain() {
		CausalDomainImpl causalDomain = new CausalDomainImpl();
		return causalDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phenomenon createPhenomenon() {
		PhenomenonImpl phenomenon = new PhenomenonImpl();
		return phenomenon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementReference createRequirementReference() {
		RequirementReferenceImpl requirementReference = new RequirementReferenceImpl();
		return requirementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainingRequirementReference createConstrainingRequirementReference() {
		ConstrainingRequirementReferenceImpl constrainingRequirementReference = new ConstrainingRequirementReferenceImpl();
		return constrainingRequirementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyStateMachine createMyStateMachine() {
		MyStateMachineImpl myStateMachine = new MyStateMachineImpl();
		return myStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Human createHuman() {
		HumanImpl human = new HumanImpl();
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType createDTypeFromString(EDataType eDataType, String initialValue) {
		DType result = DType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType createPTypeFromString(EDataType eDataType, String initialValue) {
		PType result = PType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemFramePackage getProblemFramePackage() {
		return (ProblemFramePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProblemFramePackage getPackage() {
		return ProblemFramePackage.eINSTANCE;
	}

} //ProblemFrameFactoryImpl
