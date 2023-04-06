//package com.apecs.patientData.exception;
//
//import java.util.Date;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@ControllerAdvice
//public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
//	@Override
//    protected ResponseEntity<Object> handleHttpMessageNotReadable(
//    		HttpMessageNotReadableException ex,
//            HttpHeaders headers, HttpStatus status, WebRequest request) {
//             
//        Map<String, Object> responseBody = new LinkedHashMap<>();
//        responseBody.put("timestamp", new Date());
//        responseBody.put("status", status.value());
//         
//        String errors = ex.toString();
//         
//        responseBody.put("errors", errors);
//         System.out.println("IN HANDLER");
//        return new ResponseEntity<>(responseBody, headers, status);
//    }
//	
////	@ExceptionHandler(UnrecognizedPropertyException.class)
////	   protected ResponseEntity<Object> handleEntityNotFound(
////			   UnrecognizedPropertyException ex) {
////	       ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
////	       apiError.setMessage(ex.);
////	       return buildResponseEntity(apiError);
////	   }
//}
