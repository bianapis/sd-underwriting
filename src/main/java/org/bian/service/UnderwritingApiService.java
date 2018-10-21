/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface UnderwritingApiService {

	DecisionBaseWithIdAndEvaluationResult evaluate(DecisionBase request);
	
	GuidelineBaseWithIdAndRoot requestPost(GuidelineBase request);
	
	GuidelineBaseWithIdAndRoot requestPut(String crReferenceId, GuidelineBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	DecisionBaseWIthId retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
	GuidelineBaseWithIdAndRoot retrieveGuidelines(String crReferenceId, String bqReferenceId);
	
}
