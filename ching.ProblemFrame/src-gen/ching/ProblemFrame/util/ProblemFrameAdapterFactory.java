/**
 */
package ching.ProblemFrame.util;

import UML.Behavior;
import UML.NamedElement;
import UML.Namespace;
import UML.StateMachine;

import ching.ProblemFrame.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ching.ProblemFrame.ProblemFramePackage
 * @generated
 */
public class ProblemFrameAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProblemFramePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemFrameAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProblemFramePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemFrameSwitch<Adapter> modelSwitch = new ProblemFrameSwitch<Adapter>() {
		@Override
		public Adapter caseProblemDiagram(ProblemDiagram object) {
			return createProblemDiagramAdapter();
		}

		@Override
		public Adapter caseDomain(Domain object) {
			return createDomainAdapter();
		}

		@Override
		public Adapter caseMachine(Machine object) {
			return createMachineAdapter();
		}

		@Override
		public Adapter caseLexicalDomain(LexicalDomain object) {
			return createLexicalDomainAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter casePhenomenon(Phenomenon object) {
			return createPhenomenonAdapter();
		}

		@Override
		public Adapter caseRequirementReference(RequirementReference object) {
			return createRequirementReferenceAdapter();
		}

		@Override
		public Adapter caseConstrainingRequirementReference(ConstrainingRequirementReference object) {
			return createConstrainingRequirementReferenceAdapter();
		}

		@Override
		public Adapter caseRequirement(Requirement object) {
			return createRequirementAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseMyStateMachine(MyStateMachine object) {
			return createMyStateMachineAdapter();
		}

		@Override
		public Adapter caseHuman(Human object) {
			return createHumanAdapter();
		}

		@Override
		public Adapter caseExternalCausalDomain(ExternalCausalDomain object) {
			return createExternalCausalDomainAdapter();
		}

		@Override
		public Adapter caseExternalBiddableDomain(ExternalBiddableDomain object) {
			return createExternalBiddableDomainAdapter();
		}

		@Override
		public Adapter caseInternalCausalDomain(InternalCausalDomain object) {
			return createInternalCausalDomainAdapter();
		}

		@Override
		public Adapter caseSystemRegion(SystemRegion object) {
			return createSystemRegionAdapter();
		}

		@Override
		public Adapter caseSystemDomain(SystemDomain object) {
			return createSystemDomainAdapter();
		}

		@Override
		public Adapter caseExternalDomain(ExternalDomain object) {
			return createExternalDomainAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseNamespace(Namespace object) {
			return createNamespaceAdapter();
		}

		@Override
		public Adapter caseBehavior(Behavior object) {
			return createBehaviorAdapter();
		}

		@Override
		public Adapter caseStateMachine(StateMachine object) {
			return createStateMachineAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.ProblemDiagram <em>Problem Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.ProblemDiagram
	 * @generated
	 */
	public Adapter createProblemDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.LexicalDomain <em>Lexical Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.LexicalDomain
	 * @generated
	 */
	public Adapter createLexicalDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.Phenomenon <em>Phenomenon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.Phenomenon
	 * @generated
	 */
	public Adapter createPhenomenonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.RequirementReference <em>Requirement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.RequirementReference
	 * @generated
	 */
	public Adapter createRequirementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.ConstrainingRequirementReference <em>Constraining Requirement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.ConstrainingRequirementReference
	 * @generated
	 */
	public Adapter createConstrainingRequirementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.MyStateMachine <em>My State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.MyStateMachine
	 * @generated
	 */
	public Adapter createMyStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.Human
	 * @generated
	 */
	public Adapter createHumanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.ExternalCausalDomain <em>External Causal Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.ExternalCausalDomain
	 * @generated
	 */
	public Adapter createExternalCausalDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.ExternalBiddableDomain <em>External Biddable Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.ExternalBiddableDomain
	 * @generated
	 */
	public Adapter createExternalBiddableDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.InternalCausalDomain <em>Internal Causal Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.InternalCausalDomain
	 * @generated
	 */
	public Adapter createInternalCausalDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.SystemRegion <em>System Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.SystemRegion
	 * @generated
	 */
	public Adapter createSystemRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.SystemDomain <em>System Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.SystemDomain
	 * @generated
	 */
	public Adapter createSystemDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ching.ProblemFrame.ExternalDomain <em>External Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ching.ProblemFrame.ExternalDomain
	 * @generated
	 */
	public Adapter createExternalDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UML.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UML.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UML.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UML.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UML.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UML.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UML.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProblemFrameAdapterFactory
