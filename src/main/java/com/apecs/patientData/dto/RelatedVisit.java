package com.apecs.patientData.dto;

public class RelatedVisit {
	private String visitNumber;
	private String visitSourceReference;
	private String visitSourceSystem;
	private String visitDate;
	public RelatedVisit(String visitNumber, String visitSourceReference, String visitSourceSystem, String visitDate) {
		super();
		this.visitNumber = visitNumber;
		this.visitSourceReference = visitSourceReference;
		this.visitSourceSystem = visitSourceSystem;
		this.visitDate = visitDate;
	}
	public String getVisitNumber() {
		return visitNumber;
	}
	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}
	public String getVisitSourceReference() {
		return visitSourceReference;
	}
	public void setVisitSourceReference(String visitSourceReference) {
		this.visitSourceReference = visitSourceReference;
	}
	public String getVisitSourceSystem() {
		return visitSourceSystem;
	}
	public void setVisitSourceSystem(String visitSourceSystem) {
		this.visitSourceSystem = visitSourceSystem;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	

}
