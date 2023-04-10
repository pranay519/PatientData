package com.apecs.patientData.dto;

import javax.validation.constraints.NotNull;

public class SubjectVisits {
	
	@NotNull
	private String visitNumber;
	private String name;
	private String visitCompleted;
	@NotNull
	private String visitEvent;
	private String visitDate;
	private String visitScheduleStartDate;
	private String visitScheduleEndDate;
	@NotNull
	private String siteNumber;
	private String patientStatus;
	private String screenFailedReason;
	private String sourceReference;
	private String sourceSystem;
	private String monitoringDate;
	private boolean nonPayable;
	private String edcUpdatedDate;
	public SubjectVisits(@NotNull String visitNumber, String name, String visitCompleted, @NotNull String visitEvent,
			String visitDate, String visitScheduleStartDate, String visitScheduleEndDate, @NotNull String siteNumber,
			String patientStatus, String screenFailedReason, String sourceReference, String sourceSystem,
			String monitoringDate, boolean nonPayable, String edcUpdatedDate) {
		super();
		this.visitNumber = visitNumber;
		this.name = name;
		this.visitCompleted = visitCompleted;
		this.visitEvent = visitEvent;
		this.visitDate = visitDate;
		this.visitScheduleStartDate = visitScheduleStartDate;
		this.visitScheduleEndDate = visitScheduleEndDate;
		this.siteNumber = siteNumber;
		this.patientStatus = patientStatus;
		this.screenFailedReason = screenFailedReason;
		this.sourceReference = sourceReference;
		this.sourceSystem = sourceSystem;
		this.monitoringDate = monitoringDate;
		this.nonPayable = nonPayable;
		this.edcUpdatedDate = edcUpdatedDate;
	}
	public String getVisitNumber() {
		return visitNumber;
	}
	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVisitCompleted() {
		return visitCompleted;
	}
	public void setVisitCompleted(String visitCompleted) {
		this.visitCompleted = visitCompleted;
	}
	public String getVisitEvent() {
		return visitEvent;
	}
	public void setVisitEvent(String visitEvent) {
		this.visitEvent = visitEvent;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	public String getVisitScheduleStartDate() {
		return visitScheduleStartDate;
	}
	public void setVisitScheduleStartDate(String visitScheduleStartDate) {
		this.visitScheduleStartDate = visitScheduleStartDate;
	}
	public String getVisitScheduleEndDate() {
		return visitScheduleEndDate;
	}
	public void setVisitScheduleEndDate(String visitScheduleEndDate) {
		this.visitScheduleEndDate = visitScheduleEndDate;
	}
	public String getSiteNumber() {
		return siteNumber;
	}
	public void setSiteNumber(String siteNumber) {
		this.siteNumber = siteNumber;
	}
	public String getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}
	public String getScreenFailedReason() {
		return screenFailedReason;
	}
	public void setScreenFailedReason(String screenFailedReason) {
		this.screenFailedReason = screenFailedReason;
	}
	public String getSourceReference() {
		return sourceReference;
	}
	public void setSourceReference(String sourceReference) {
		this.sourceReference = sourceReference;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getMonitoringDate() {
		return monitoringDate;
	}
	public void setMonitoringDate(String monitoringDate) {
		this.monitoringDate = monitoringDate;
	}
	public boolean isNonPayable() {
		return nonPayable;
	}
	public void setNonPayable(boolean nonPayable) {
		this.nonPayable = nonPayable;
	}
	public String getEdcUpdatedDate() {
		return edcUpdatedDate;
	}
	public void setEdcUpdatedDate(String edcUpdatedDate) {
		this.edcUpdatedDate = edcUpdatedDate;
	}
	
}
