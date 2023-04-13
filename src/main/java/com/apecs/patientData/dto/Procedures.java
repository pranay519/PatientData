package com.apecs.patientData.dto;

import javax.validation.constraints.NotNull;

public class Procedures {
	@NotNull
	private String sourceReference;
	@NotNull
	private String sourceSystem;
	private String procedureDate;
	@NotNull
	private String patientProcedure;
	private boolean nonPayable;
	private String monitoringDate;
	private String edcUpdatedDate;
	private RelatedVisit relatedVisit;

	public Procedures(@NotNull String sourceReference, @NotNull String sourceSystem, String procedureDate,
			@NotNull String patientProcedure, boolean nonPayable, String monitoringDate, String edcUpdatedDate,
			RelatedVisit relatedVisit) {
		super();
		this.sourceReference = sourceReference;
		this.sourceSystem = sourceSystem;
		this.procedureDate = procedureDate;
		this.patientProcedure = patientProcedure;
		this.nonPayable = nonPayable;
		this.monitoringDate = monitoringDate;
		this.edcUpdatedDate = edcUpdatedDate;
		this.relatedVisit = relatedVisit;
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

	public String getProcedureDate() {
		return procedureDate;
	}

	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}

	public String getPatientProcedure() {
		return patientProcedure;
	}

	public void setPatientProcedure(String patientProcedure) {
		this.patientProcedure = patientProcedure;
	}

	public boolean isNonPayable() {
		return nonPayable;
	}

	public void setNonPayable(boolean nonPayable) {
		this.nonPayable = nonPayable;
	}

	public String getMonitoringDate() {
		return monitoringDate;
	}

	public void setMonitoringDate(String monitoringDate) {
		this.monitoringDate = monitoringDate;
	}

	public String getEdcUpdatedDate() {
		return edcUpdatedDate;
	}

	public void setEdcUpdatedDate(String edcUpdatedDate) {
		this.edcUpdatedDate = edcUpdatedDate;
	}

	public RelatedVisit getRelatedVisit() {
		return relatedVisit;
	}

	public void setRelatedVisit(RelatedVisit relatedVisit) {
		this.relatedVisit = relatedVisit;
	}

}
