package org.eclipse.gemoc.statemachine.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

//import org.eclipse.gemoc.statemachine.model.UML.*;
import UML.*;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

	public boolean isInitialState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.INITIAL);
	}

	public boolean isDeepHistoryState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.DEEP_HISTORY);
	}

	public boolean isShallowHistoryState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.SHALLOW_HISTORY);
	}

	public boolean isJoinState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.JOIN);
	}

	public boolean isForkState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.FORK);
	}

	public boolean isJuncitonState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.JUNCTION);
	}

	public boolean isChoiceState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.CHOICE);
	}

	public boolean isEntryPointState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.ENTRY_POINT);
	}

	public boolean isExitPointState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.EXIT_POINT);
	}

	public boolean isTerminateState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.TERMINATE);
	}

	public boolean isCompositeState(State state) {
		return state.isIsComposite();
	}

	public boolean isSimpleState(State state) {
		return state.isIsSimple();
	}

	public boolean isFinalState(State state) {
		return state instanceof FinalState;
	}

	public void createTransition(NamedElement self, NamedElement source_p, NamedElement target_p) {
		NamedElement source = source_p;
		NamedElement target = target_p;
		if (source instanceof Region) {
			source = ((Region) source).getState();
		}
		if (target instanceof Region) {
			target = ((Region) target).getState();
		}
		if (source instanceof Vertex && target instanceof Vertex) {
			final Transition transition = UMLFactory.eINSTANCE.createTransition();
			transition.setSource((Vertex) source);
			transition.setTarget((Vertex) target);
			((Region) source.eContainer()).getTransition().add(transition);
		}
	}

	public String computeRelationshipLabel(Transition transition) {
		return "从 " + transition.getSource().getName() + " 到 " + transition.getTarget().getName();
	}

	public String computeTransitionLable(Transition transition) {
		List<String> result = new ArrayList<>();
		for (Trigger i : transition.getTrigger()) {
			result.add(i.getName());
		}
		String tmp = String.join(",", result);
		result = new ArrayList<>();
		result.add(tmp);
		if (transition.getGuard() != null) {
			result.add("[" + transition.getGuard().getName() + "]");
		}
		if (transition.getEffect() != null) {
			result.add("/" + transition.getEffect().getName());
		}
		return String.join("", result);
	}

	public boolean BehaviorExist(State state) {
		return state.getEntry() != null || state.getDoActivity() != null || state.getExit() != null;
	}

	public String computeInput(StateMachine stateMachine) {
		return String.join("\n", stateMachine.getInput());
	}

	public void setInput(StateMachine self, String input) {
		self.getInput().clear();
		for (String i : input.split("\n")) {
			self.getInput().add(i);
		}
	}
	public String computeEventPool(StateMachine stateMachine) {
		return String.join("\n", stateMachine.getEventPool());
	}

	public void setEventPool(StateMachine self, String event) {
		self.getEventPool().clear();
		for (String i : event.split("\n")) {
			self.getEventPool().add(i);
		}
	}
}
