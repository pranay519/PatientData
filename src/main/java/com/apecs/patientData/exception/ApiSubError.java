package com.apecs.patientData.exception;

abstract class ApiSubError {

}

class ApiValidationError extends ApiSubError {
	private String object;
	private String field;
	private String message;

	public ApiValidationError(String object, String field, String message) {
		super();
		this.object = object;
		this.field = field;
		this.message = message;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	ApiValidationError(String object, String message) {
		this.object = object;
		this.message = message;
	}
}
