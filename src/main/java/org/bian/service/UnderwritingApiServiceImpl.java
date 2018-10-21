/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class UnderwritingApiServiceImpl implements UnderwritingApiService {

	public DecisionBaseWithIdAndEvaluationResult evaluate(DecisionBase request){
		return JsonReader.read("evaluate-DecisionBaseWithIdAndEvaluationResult.json",new TypeReference<DecisionBaseWithIdAndEvaluationResult>(){});
	}
	
	public GuidelineBaseWithIdAndRoot requestPost(GuidelineBase request){
		return JsonReader.read("requestPost-GuidelineBaseWithIdAndRoot.json",new TypeReference<GuidelineBaseWithIdAndRoot>(){});
	}
	
	public GuidelineBaseWithIdAndRoot requestPut(String crReferenceId, GuidelineBase request){
		return JsonReader.read("requestPut-GuidelineBaseWithIdAndRoot.json",new TypeReference<GuidelineBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public DecisionBaseWIthId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-DecisionBaseWIthId.json",new TypeReference<DecisionBaseWIthId>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public GuidelineBaseWithIdAndRoot retrieveGuidelines(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-GuidelineBaseWithIdAndRoot.json",new TypeReference<GuidelineBaseWithIdAndRoot>(){});
	}
	
}
