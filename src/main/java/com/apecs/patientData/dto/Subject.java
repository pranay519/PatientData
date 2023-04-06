package com.apecs.patientData.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subject {
	@NotNull
	@NotEmpty(message = "StudyId is required.")
	private String studyId;
	@NotNull
	@NotEmpty(message = "SiteId is required.")
	private String siteId;
	@NotEmpty(message = "SiteNumber is required.")
	private String siteNumber;
	@NotNull
	@NotEmpty(message = "SubjectId is required.")
	private String subjectId;
	@NotEmpty(message = "screeningNumber is required.")
	private String screeningNumber;
	@NotEmpty(message = "randamizationNumber is required.")
	private String randamizationNumber;
	@NotEmpty(message = "SiteCountry is required.")
	@Size(min = 4, message = "The length of siteCountry must be greater than 4 characters.")
	private String siteCountry;
	@NotEmpty(message = "gender is required.")
	private String gender;
	@NotEmpty(message = "currentstatus is required.")
	private String currentStatus;
	@Valid
	@NotNull
	private KeyMilestones keyMilestones;
	@Valid
	@NotNull
	@JsonProperty("CustomFields")
	private List<SubjectCustomFields> CustomFields;
	@Valid
	@NotNull
	private List<SubjectVisits> subjectVisits;
	@Valid
	@NotNull
	private List<Procedures> subjectProcedures;

	public Subject(@NotNull @NotEmpty(message = "StudyId is required.") String studyId,
			@NotEmpty(message = "SiteId is required.") String siteId,
			@NotEmpty(message = "SiteNumber is required.") String siteNumber,
			@NotEmpty(message = "SubjectId is required.") String subjectId,
			@NotEmpty(message = "screeningNumber is required.") String screeningNumber,
			@NotEmpty(message = "randamizationNumber is required.") String randamizationNumber,
			@NotEmpty(message = "SiteCountry is required.") @Size(min = 4, message = "The length of siteCountry must be greater than 4 characters.") String siteCountry,
			@NotEmpty(message = "StudyId is required.") String gender,
			@NotEmpty(message = "StudyId is required.") String currentStatus,
			@Valid @NotNull KeyMilestones keyMilestones, @Valid @NotNull List<SubjectCustomFields> customFields,
			@Valid @NotNull List<SubjectVisits> subjectVisits, @Valid @NotNull List<Procedures> subjectProcedures) {
		super();
		this.studyId = studyId;
		this.siteId = siteId;
		this.siteNumber = siteNumber;
		this.subjectId = subjectId;
		this.screeningNumber = screeningNumber;
		this.randamizationNumber = randamizationNumber;
		this.siteCountry = siteCountry;
		this.gender = gender;
		this.currentStatus = currentStatus;
		this.keyMilestones = keyMilestones;
		CustomFields = customFields;
		this.subjectVisits = subjectVisits;
		this.subjectProcedures = subjectProcedures;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getSiteNumber() {
		return siteNumber;
	}

	public void setSiteNumber(String siteNumber) {
		this.siteNumber = siteNumber;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getScreeningNumber() {
		return screeningNumber;
	}

	public void setScreeningNumber(String screeningNumber) {
		this.screeningNumber = screeningNumber;
	}

	public String getRandamizationNumber() {
		return randamizationNumber;
	}

	public void setRandamizationNumber(String randamizationNumber) {
		this.randamizationNumber = randamizationNumber;
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

	public KeyMilestones getKeyMilestones() {
		return keyMilestones;
	}

	public void setKeyMilestones(KeyMilestones keyMilestones) {
		this.keyMilestones = keyMilestones;
	}

	public List<SubjectCustomFields> getCustomFields() {
		return CustomFields;
	}

	public void setCustomFields(List<SubjectCustomFields> customFields) {
		CustomFields = customFields;
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
