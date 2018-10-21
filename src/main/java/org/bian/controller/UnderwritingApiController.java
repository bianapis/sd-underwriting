/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class UnderwritingApiController {

	@Autowired
	UnderwritingApiService service;
	
	@Assess.Evaluate
	public BianResponse<DecisionBaseWithIdAndEvaluationResult> evaluate(@RequestBody BianRequest<DecisionBase> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@Assess.RequestPost
	public BianResponse<GuidelineBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<GuidelineBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Assess.RequestPut
	public BianResponse<GuidelineBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<GuidelineBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.Retrieve
	public BianResponse<DecisionBaseWIthId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("guidelines")
	@Assess.Retrieve
	public BianResponse<GuidelineBaseWithIdAndRoot> retrieveGuidelines(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveGuidelines(crReferenceId, bqReferenceId));
	}
	
}
