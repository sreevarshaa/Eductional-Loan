package com.demo.EducationalLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {

	@Id
	private int loanId;
	private String loantype;
	private String applicantName;
	private String applicantAddress;
	private String applicanyMobile;
	private String applicantEmail;
	private String applicantAadhaar;
	private String applicantPan;
	private String applicantSalary;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	
	LoanApplicationModel(){}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getApplicanyMobile() {
		return applicanyMobile;
	}

	public void setApplicanyMobile(String applicanyMobile) {
		this.applicanyMobile = applicanyMobile;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getApplicantAadhaar() {
		return applicantAadhaar;
	}

	public void setApplicantAadhaar(String applicantAadhaar) {
		this.applicantAadhaar = applicantAadhaar;
	}

	public String getApplicantPan() {
		return applicantPan;
	}

	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}

	public String getApplicantSalary() {
		return applicantSalary;
	}

	public void setApplicantSalary(String applicantSalary) {
		this.applicantSalary = applicantSalary;
	}

	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}

	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}

	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}

	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	
	
}
