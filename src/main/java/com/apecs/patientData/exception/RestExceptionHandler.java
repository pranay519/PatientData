package com.apecs.patientData.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String error = "Malformed JSON request";
		return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String error = "Malformed JSON request";
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
		for(org.springframework.validation.FieldError fieldError: ex.getBindingResult().getFieldErrors()) {
			apiError.addFieldError(fieldError.getObjectName(), fieldError.getField(), fieldError.getDefaultMessage());
		}

		return buildResponseEntityWithFields(new ApiError(HttpStatus.BAD_REQUEST, error, apiError.getErrorFields(), ex));
	}

	private ResponseEntity<Object> buildResponseEntityWithFields(ApiError apiError) {
		return new ResponseEntity<>(apiError, apiError.getStatus());
	}

	private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
		return new ResponseEntity<>(apiError, apiError.getStatus());
	}

}
