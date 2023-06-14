/**
 */
package ching.ProblemFrame.util;

import UML.Behavior;
import UML.NamedElement;
import UML.Namespace;
import UML.StateMachine;

import ching.ProblemFrame.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ching.ProblemFrame.ProblemFramePackage
 * @generated
 */
public class ProblemFrameSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProblemFramePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemFrameSwitch() {
		if (modelPackage == null) {
			modelPackage = ProblemFramePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ProblemFramePackage.PROBLEM_DIAGRAM: {
			ProblemDiagram problemDiagram = (ProblemDiagram) theEObject;
			T result = caseProblemDiagram(problemDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.DOMAIN: {
			Domain domain = (Domain) theEObject;
			T result = caseDomain(domain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.MACHINE: {
			Machine machine = (Machine) theEObject;
			T result = caseMachine(machine);
			if (result == null)
				result = caseSystemDomain(machine);
			if (result == null)
				result = caseDomain(machine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.LEXICAL_DOMAIN: {
			LexicalDomain lexicalDomain = (LexicalDomain) theEObject;
			T result = caseLexicalDomain(lexicalDomain);
			if (result == null)
				result = caseInternalCausalDomain(lexicalDomain);
			if (result == null)
				result = caseSystemDomain(lexicalDomain);
			if (result == null)
				result = caseDomain(lexicalDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.PHENOMENON: {
			Phenomenon phenomenon = (Phenomenon) theEObject;
			T result = casePhenomenon(phenomenon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.REQUIREMENT_REFERENCE: {
			RequirementReference requirementReference = (RequirementReference) theEObject;
			T result = caseRequirementReference(requirementReference);
			if (result == null)
				result = caseReference(requirementReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.CONSTRAINING_REQUIREMENT_REFERENCE: {
			ConstrainingRequirementReference constrainingRequirementReference = (ConstrainingRequirementReference) theEObject;
			T result = caseConstrainingRequirementReference(constrainingRequirementReference);
			if (result == null)
				result = caseReference(constrainingRequirementReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.REQUIREMENT: {
			Requirement requirement = (Requirement) theEObject;
			T result = caseRequirement(requirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.REFERENCE: {
			Reference reference = (Reference) theEObject;
			T result = caseReference(reference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.MY_STATE_MACHINE: {
			MyStateMachine myStateMachine = (MyStateMachine) theEObject;
			T result = caseMyStateMachine(myStateMachine);
			if (result == null)
				result = caseStateMachine(myStateMachine);
			if (result == null)
				result = caseBehavior(myStateMachine);
			if (result == null)
				result = caseNamespace(myStateMachine);
			if (result == null)
				result = caseNamedElement(myStateMachine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.HUMAN: {
			Human human = (Human) theEObject;
			T result = caseHuman(human);
			if (result == null)
				result = caseSystemDomain(human);
			if (result == null)
				result = caseDomain(human);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.EXTERNAL_CAUSAL_DOMAIN: {
			ExternalCausalDomain externalCausalDomain = (ExternalCausalDomain) theEObject;
			T result = caseExternalCausalDomain(externalCausalDomain);
			if (result == null)
				result = caseExternalDomain(externalCausalDomain);
			if (result == null)
				result = caseDomain(externalCausalDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.EXTERNAL_BIDDABLE_DOMAIN: {
			ExternalBiddableDomain externalBiddableDomain = (ExternalBiddableDomain) theEObject;
			T result = caseExternalBiddableDomain(externalBiddableDomain);
			if (result == null)
				result = caseExternalDomain(externalBiddableDomain);
			if (result == null)
				result = caseDomain(externalBiddableDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.INTERNAL_CAUSAL_DOMAIN: {
			InternalCausalDomain internalCausalDomain = (InternalCausalDomain) theEObject;
			T result = caseInternalCausalDomain(internalCausalDomain);
			if (result == null)
				result = caseSystemDomain(internalCausalDomain);
			if (result == null)
				result = caseDomain(internalCausalDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.SYSTEM_REGION: {
			SystemRegion systemRegion = (SystemRegion) theEObject;
			T result = caseSystemRegion(systemRegion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.SYSTEM_DOMAIN: {
			SystemDomain systemDomain = (SystemDomain) theEObject;
			T result = caseSystemDomain(systemDomain);
			if (result == null)
				result = caseDomain(systemDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemFramePackage.EXTERNAL_DOMAIN: {
			ExternalDomain externalDomain = (ExternalDomain) theEObject;
			T result = caseExternalDomain(externalDomain);
			if (result == null)
				result = caseDomain(externalDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemDiagram(ProblemDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexical Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexical Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexicalDomain(LexicalDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phenomenon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phenomenon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhenomenon(Phenomenon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementReference(RequirementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraining Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraining Requirement Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainingRequirementReference(ConstrainingRequirementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyStateMachine(MyStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHuman(Human object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Causal Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Causal Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalCausalDomain(ExternalCausalDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Biddable Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Biddable Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalBiddableDomain(ExternalBiddableDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Causal Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Causal Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalCausalDomain(InternalCausalDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRegion(SystemRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDomain(SystemDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDomain(ExternalDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProblemFrameSwitch
