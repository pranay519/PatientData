package com.apecs.patientData.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class SubjectDetails {
	
	@Valid
	@NotNull
	private List<Subject> subjects;

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	
	
}
