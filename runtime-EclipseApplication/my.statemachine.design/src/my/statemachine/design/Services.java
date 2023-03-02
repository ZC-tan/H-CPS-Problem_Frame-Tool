package my.statemachine.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import UML.*;




/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String tryService(UML.Transition transition) {
    	return transition.eClass().toString()+"tryService";
    }
    
    public boolean isExitPointState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.EXIT_POINT);
	}
    
    public boolean isInitialState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.INITIAL);
	}
    
    public boolean isJoinState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.JOIN);
	}
    
    public boolean isForkState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.FORK);
	}
    
    public boolean isChoiceState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.CHOICE);
	}
    
    public boolean isDeepHistoryState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.DEEP_HISTORY);
	}

	public boolean isShallowHistoryState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.SHALLOW_HISTORY);
	}
	
	public boolean isJuncitonState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.JUNCTION);
	}
	
	public boolean isTerminateState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.TERMINATE);
	}
	
	public String computeTransitionLable(UML.Transition transition) {
		List<String> result = new ArrayList<>();
		for (UML.Trigger i : transition.getTrigger()) {
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
}
