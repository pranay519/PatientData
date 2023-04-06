package com.apecs.patientData.controller;



import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apecs.patientData.dao.Response;
import com.apecs.patientData.dto.SubjectDetails;

@CrossOrigin(maxAge = 3600)
@RestController
public class Controller {
	
	@PostMapping("/patientData")
	public Response patientData(@Valid @RequestBody SubjectDetails subjectDetails) {
		return new Response("Success", "200");
	}
	
	@GetMapping("/test")
	public String testing() {
		return "Tested";
	}

}
