package my.problemframe.design;

import org.eclipse.emf.ecore.EObject;

//import ching.ProblemFrame.Domain;
import ching.ProblemFrame.*;

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
    
//    public Boolean isHuman(BiddableDomain bidabbleDomain) {
//    	return bidabbleDomain.
//    }
    
    public String addStateMachineLabel(Domain domain) {
    	return domain.getName()+"tryingservices";
    }
}
