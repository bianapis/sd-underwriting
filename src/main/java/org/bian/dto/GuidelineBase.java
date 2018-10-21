package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * GuidelineBase
 */
public class GuidelineBase   {
  private String underwritingGuidelineRequestReference = null;

  private String productServiceType = null;

  private String customerType = null;

  private String proposedLoanAmount = null;

  private String proposedCollateralItemType = null;

  private String proposedCollateralItemValuation = null;

  private String requiredCustomerEmploymentHistoryDetails = null;

  private String requiredCustomerDebtAssetStatement = null;

  private String requiredCustomerCreditAssessment = null;

  private String requiredCollateralCoverage = null;

  private String requiredCustomerProductServicePaymentHistory = null;

  private String requiredCustomerDocuments = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return underwritingGuidelineRequestReference
  **/

  public String getUnderwritingGuidelineRequestReference() {
    return underwritingGuidelineRequestReference;
  }

  public void setUnderwritingGuidelineRequestReference(String underwritingGuidelineRequestReference) {
    this.underwritingGuidelineRequestReference = underwritingGuidelineRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerType
  **/

  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return proposedLoanAmount
  **/

  public String getProposedLoanAmount() {
    return proposedLoanAmount;
  }

  public void setProposedLoanAmount(String proposedLoanAmount) {
    this.proposedLoanAmount = proposedLoanAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return proposedCollateralItemType
  **/

  public String getProposedCollateralItemType() {
    return proposedCollateralItemType;
  }

  public void setProposedCollateralItemType(String proposedCollateralItemType) {
    this.proposedCollateralItemType = proposedCollateralItemType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return proposedCollateralItemValuation
  **/

  public String getProposedCollateralItemValuation() {
    return proposedCollateralItemValuation;
  }

  public void setProposedCollateralItemValuation(String proposedCollateralItemValuation) {
    this.proposedCollateralItemValuation = proposedCollateralItemValuation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return requiredCustomerEmploymentHistoryDetails
  **/

  public String getRequiredCustomerEmploymentHistoryDetails() {
    return requiredCustomerEmploymentHistoryDetails;
  }

  public void setRequiredCustomerEmploymentHistoryDetails(String requiredCustomerEmploymentHistoryDetails) {
    this.requiredCustomerEmploymentHistoryDetails = requiredCustomerEmploymentHistoryDetails;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return requiredCustomerDebtAssetStatement
  **/

  public String getRequiredCustomerDebtAssetStatement() {
    return requiredCustomerDebtAssetStatement;
  }

  public void setRequiredCustomerDebtAssetStatement(String requiredCustomerDebtAssetStatement) {
    this.requiredCustomerDebtAssetStatement = requiredCustomerDebtAssetStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return requiredCustomerCreditAssessment
  **/

  public String getRequiredCustomerCreditAssessment() {
    return requiredCustomerCreditAssessment;
  }

  public void setRequiredCustomerCreditAssessment(String requiredCustomerCreditAssessment) {
    this.requiredCustomerCreditAssessment = requiredCustomerCreditAssessment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return requiredCollateralCoverage
  **/

  public String getRequiredCollateralCoverage() {
    return requiredCollateralCoverage;
  }

  public void setRequiredCollateralCoverage(String requiredCollateralCoverage) {
    this.requiredCollateralCoverage = requiredCollateralCoverage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return requiredCustomerProductServicePaymentHistory
  **/

  public String getRequiredCustomerProductServicePaymentHistory() {
    return requiredCustomerProductServicePaymentHistory;
  }

  public void setRequiredCustomerProductServicePaymentHistory(String requiredCustomerProductServicePaymentHistory) {
    this.requiredCustomerProductServicePaymentHistory = requiredCustomerProductServicePaymentHistory;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return requiredCustomerDocuments
  **/

  public String getRequiredCustomerDocuments() {
    return requiredCustomerDocuments;
  }

  public void setRequiredCustomerDocuments(String requiredCustomerDocuments) {
    this.requiredCustomerDocuments = requiredCustomerDocuments;
  }


}

