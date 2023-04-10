package com.apecs.patientData.dto;

import javax.validation.constraints.NotNull;

public class Procedures {
	@NotNull
	private String sourceReference;
	@NotNull
	private String sourceTable;
	@NotNull
	private String sourceSystem;
	private String procedureDate;
	@NotNull
	private String visitNumber;
	@NotNull
	private String visitNumberRef;
	@NotNull
	private String patientProcedure;
	private boolean nonPayable;
	private String visitDate;
	private String monitoringDate;
	private String edcUpdatedDate;
	public Procedures(String sourceReference, String sourceTable, String sourceSystem, String procedureDate,
			String visitNumber, String visitNumberRef, String patientProcedure, boolean nonPayable, String visitDate,
			String monitoringDate, String edcUpdatedDate) {
		super();
		this.sourceReference = sourceReference;
		this.sourceTable = sourceTable;
		this.sourceSystem = sourceSystem;
		this.procedureDate = procedureDate;
		this.visitNumber = visitNumber;
		this.visitNumberRef = visitNumberRef;
		this.patientProcedure = patientProcedure;
		this.nonPayable = nonPayable;
		this.visitDate = visitDate;
		this.monitoringDate = monitoringDate;
		this.edcUpdatedDate = edcUpdatedDate;
	}
	public String getSourceReference() {
		return sourceReference;
	}
	public void setSourceReference(String sourceReference) {
		this.sourceReference = sourceReference;
	}
	public String getSourceTable() {
		return sourceTable;
	}
	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;
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
	public String getVisitNumber() {
		return visitNumber;
	}
	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}
	public String getVisitNumberRef() {
		return visitNumberRef;
	}
	public void setVisitNumberRef(String visitNumberRef) {
		this.visitNumberRef = visitNumberRef;
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
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
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
	
}
