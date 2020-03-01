package com.practice.msa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

	@GetMapping("/test")
	public String testPracticeController() {
		return "testPractice OK";
	}

}
