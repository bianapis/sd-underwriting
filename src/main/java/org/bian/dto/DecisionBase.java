package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DecisionBase
 */
public class DecisionBase   {
  private String underwritingAssessment = null;

  private String productInstanceReference = null;

  private String proposedLoanTerms = null;

  private String proposedLoanAmount = null;

  private String loanPurpose = null;

  private String customerReference = null;

  private String customerReferenceDetails = null;

  private String customerProductEligibilityTerms = null;

  private String customerEmploymentHistory = null;

  private String customerIncomeStatement = null;

  private String customerDebtStatement = null;

  private String customerAssetStatement = null;

  private String customerCreditAssessment = null;

  private String customerProductServicePaymentHistory = null;

  private String collateralItemReference = null;

  private String collateralItemType = null;

  private String collateralItemValuation = null;

  private String documentReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return underwritingAssessment
  **/

  public String getUnderwritingAssessment() {
    return underwritingAssessment;
  }

  public void setUnderwritingAssessment(String underwritingAssessment) {
    this.underwritingAssessment = underwritingAssessment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return proposedLoanTerms
  **/

  public String getProposedLoanTerms() {
    return proposedLoanTerms;
  }

  public void setProposedLoanTerms(String proposedLoanTerms) {
    this.proposedLoanTerms = proposedLoanTerms;
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
   * @return loanPurpose
  **/

  public String getLoanPurpose() {
    return loanPurpose;
  }

  public void setLoanPurpose(String loanPurpose) {
    this.loanPurpose = loanPurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerReferenceDetails
  **/

  public String getCustomerReferenceDetails() {
    return customerReferenceDetails;
  }

  public void setCustomerReferenceDetails(String customerReferenceDetails) {
    this.customerReferenceDetails = customerReferenceDetails;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerProductEligibilityTerms
  **/

  public String getCustomerProductEligibilityTerms() {
    return customerProductEligibilityTerms;
  }

  public void setCustomerProductEligibilityTerms(String customerProductEligibilityTerms) {
    this.customerProductEligibilityTerms = customerProductEligibilityTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerEmploymentHistory
  **/

  public String getCustomerEmploymentHistory() {
    return customerEmploymentHistory;
  }

  public void setCustomerEmploymentHistory(String customerEmploymentHistory) {
    this.customerEmploymentHistory = customerEmploymentHistory;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerIncomeStatement
  **/

  public String getCustomerIncomeStatement() {
    return customerIncomeStatement;
  }

  public void setCustomerIncomeStatement(String customerIncomeStatement) {
    this.customerIncomeStatement = customerIncomeStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerDebtStatement
  **/

  public String getCustomerDebtStatement() {
    return customerDebtStatement;
  }

  public void setCustomerDebtStatement(String customerDebtStatement) {
    this.customerDebtStatement = customerDebtStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerAssetStatement
  **/

  public String getCustomerAssetStatement() {
    return customerAssetStatement;
  }

  public void setCustomerAssetStatement(String customerAssetStatement) {
    this.customerAssetStatement = customerAssetStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCreditAssessment
  **/

  public String getCustomerCreditAssessment() {
    return customerCreditAssessment;
  }

  public void setCustomerCreditAssessment(String customerCreditAssessment) {
    this.customerCreditAssessment = customerCreditAssessment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerProductServicePaymentHistory
  **/

  public String getCustomerProductServicePaymentHistory() {
    return customerProductServicePaymentHistory;
  }

  public void setCustomerProductServicePaymentHistory(String customerProductServicePaymentHistory) {
    this.customerProductServicePaymentHistory = customerProductServicePaymentHistory;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return collateralItemReference
  **/

  public String getCollateralItemReference() {
    return collateralItemReference;
  }

  public void setCollateralItemReference(String collateralItemReference) {
    this.collateralItemReference = collateralItemReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return collateralItemType
  **/

  public String getCollateralItemType() {
    return collateralItemType;
  }

  public void setCollateralItemType(String collateralItemType) {
    this.collateralItemType = collateralItemType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return collateralItemValuation
  **/

  public String getCollateralItemValuation() {
    return collateralItemValuation;
  }

  public void setCollateralItemValuation(String collateralItemValuation) {
    this.collateralItemValuation = collateralItemValuation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


}

