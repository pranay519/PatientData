package com.apecs.patientData.dto;

import javax.validation.constraints.NotNull;

public class SubjectCustomFields {
	@NotNull
	private String name;
	private String value;
	
	public SubjectCustomFields(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
