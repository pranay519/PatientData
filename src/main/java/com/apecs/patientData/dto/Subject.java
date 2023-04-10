package com.apecs.patientData.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Subject {
	@NotEmpty
	@NotNull
	private String studyNumber;
	@NotNull
	private String siteNumber;
	@NotNull
	private String screeningNumber;
	private String randomizationNumber;
	@NotNull
	private String sourceSystemPatientID;
	@NotNull
	private String sourceSystem;
	private String siteCountry;
	private String gender;
	private String currentStatus;
	private String enrolledDate;
	private String patientInitials;
	private String patientBirth;
	private String subjectScreenFailedDate;
	private String informedConsentDate;
	private String screeningStartDate;
	private String screeningDate;
	private String screenFailedDate;
	private String screenFailedReason;
	private String randomisedDate;
	private String withdrawnDate;
	private String withdrawnReason;
	private String completedDate;
	@Valid
	private List<SubjectCustomFields> customFields;
	@Valid
	@NotNull
	private List<SubjectVisits> subjectVisits;
	@Valid
	@NotNull
	private List<Procedures> subjectProcedures;
	public Subject(@NotNull String studyNumber, @NotNull String siteNumber, @NotNull String screeningNumber,
			String randomizationNumber, @NotNull String sourceSystemPatientID, @NotNull String sourceSystem,
			String siteCountry, String gender, String currentStatus, String enrolledDate, String patientInitials,
			String patientBirth, String subjectScreenFailedDate, String informedConsentDate, String screeningStartDate,
			String screeningDate, String screenFailedDate, String screenFailedReason, String randomisedDate,
			String withdrawnDate, String withdrawnReason, String completedDate,
			@Valid List<SubjectCustomFields> customFields, @Valid @NotNull List<SubjectVisits> subjectVisits,
			@Valid @NotNull List<Procedures> subjectProcedures) {
		super();
		this.studyNumber = studyNumber;
		this.siteNumber = siteNumber;
		this.screeningNumber = screeningNumber;
		this.randomizationNumber = randomizationNumber;
		this.sourceSystemPatientID = sourceSystemPatientID;
		this.sourceSystem = sourceSystem;
		this.siteCountry = siteCountry;
		this.gender = gender;
		this.currentStatus = currentStatus;
		this.enrolledDate = enrolledDate;
		this.patientInitials = patientInitials;
		this.patientBirth = patientBirth;
		this.subjectScreenFailedDate = subjectScreenFailedDate;
		this.informedConsentDate = informedConsentDate;
		this.screeningStartDate = screeningStartDate;
		this.screeningDate = screeningDate;
		this.screenFailedDate = screenFailedDate;
		this.screenFailedReason = screenFailedReason;
		this.randomisedDate = randomisedDate;
		this.withdrawnDate = withdrawnDate;
		this.withdrawnReason = withdrawnReason;
		this.completedDate = completedDate;
		this.customFields = customFields;
		this.subjectVisits = subjectVisits;
		this.subjectProcedures = subjectProcedures;
	}
	public String getStudyNumber() {
		return studyNumber;
	}
	public void setStudyNumber(String studyNumber) {
		this.studyNumber = studyNumber;
	}
	public String getSiteNumber() {
		return siteNumber;
	}
	public void setSiteNumber(String siteNumber) {
		this.siteNumber = siteNumber;
	}
	public String getScreeningNumber() {
		return screeningNumber;
	}
	public void setScreeningNumber(String screeningNumber) {
		this.screeningNumber = screeningNumber;
	}
	public String getRandomizationNumber() {
		return randomizationNumber;
	}
	public void setRandomizationNumber(String randomizationNumber) {
		this.randomizationNumber = randomizationNumber;
	}
	public String getSourceSystemPatientID() {
		return sourceSystemPatientID;
	}
	public void setSourceSystemPatientID(String sourceSystemPatientID) {
		this.sourceSystemPatientID = sourceSystemPatientID;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getSiteCountry() {
		return siteCountry;
	}
	public void setSiteCountry(String siteCountry) {
		this.siteCountry = siteCountry;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public String getEnrolledDate() {
		return enrolledDate;
	}
	public void setEnrolledDate(String enrolledDate) {
		this.enrolledDate = enrolledDate;
	}
	public String getPatientInitials() {
		return patientInitials;
	}
	public void setPatientInitials(String patientInitials) {
		this.patientInitials = patientInitials;
	}
	public String getPatientBirth() {
		return patientBirth;
	}
	public void setPatientBirth(String patientBirth) {
		this.patientBirth = patientBirth;
	}
	public String getSubjectScreenFailedDate() {
		return subjectScreenFailedDate;
	}
	public void setSubjectScreenFailedDate(String subjectScreenFailedDate) {
		this.subjectScreenFailedDate = subjectScreenFailedDate;
	}
	public String getInformedConsentDate() {
		return informedConsentDate;
	}
	public void setInformedConsentDate(String informedConsentDate) {
		this.informedConsentDate = informedConsentDate;
	}
	public String getScreeningStartDate() {
		return screeningStartDate;
	}
	public void setScreeningStartDate(String screeningStartDate) {
		this.screeningStartDate = screeningStartDate;
	}
	public String getScreeningDate() {
		return screeningDate;
	}
	public void setScreeningDate(String screeningDate) {
		this.screeningDate = screeningDate;
	}
	public String getScreenFailedDate() {
		return screenFailedDate;
	}
	public void setScreenFailedDate(String screenFailedDate) {
		this.screenFailedDate = screenFailedDate;
	}
	public String getScreenFailedReason() {
		return screenFailedReason;
	}
	public void setScreenFailedReason(String screenFailedReason) {
		this.screenFailedReason = screenFailedReason;
	}
	public String getRandomisedDate() {
		return randomisedDate;
	}
	public void setRandomisedDate(String randomisedDate) {
		this.randomisedDate = randomisedDate;
	}
	public String getWithdrawnDate() {
		return withdrawnDate;
	}
	public void setWithdrawnDate(String withdrawnDate) {
		this.withdrawnDate = withdrawnDate;
	}
	public String getWithdrawnReason() {
		return withdrawnReason;
	}
	public void setWithdrawnReason(String withdrawnReason) {
		this.withdrawnReason = withdrawnReason;
	}
	public String getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}
	public List<SubjectCustomFields> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(List<SubjectCustomFields> customFields) {
		this.customFields = customFields;
	}
	public List<SubjectVisits> getSubjectVisits() {
		return subjectVisits;
	}
	public void setSubjectVisits(List<SubjectVisits> subjectVisits) {
		this.subjectVisits = subjectVisits;
	}
	public List<Procedures> getSubjectProcedures() {
		return subjectProcedures;
	}
	public void setSubjectProcedures(List<Procedures> subjectProcedures) {
		this.subjectProcedures = subjectProcedures;
	}
	

}
