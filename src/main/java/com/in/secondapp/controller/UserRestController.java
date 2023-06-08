package com.in.secondapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	
	@GetMapping("/bhanu")
	public ResponseEntity<String> bhanu(){
		return new ResponseEntity<>( "<h1>HI....Bhanu Advance Happy Birthday ~:) Your are the first billionaire in your family<h1>",HttpStatus.OK);
	}
	@GetMapping("/prudvi")
	public ResponseEntity<String> prudvi(){
		return new ResponseEntity<>( "<h1>HI....Prudvi ~:) Your are the first billionaire in your family<h1>",HttpStatus.OK);
	}
	@GetMapping("/reshi")
	public ResponseEntity<String> reshi(){
		return new ResponseEntity<>( "<h1>HI....Reshi ~:) Your are the second billionaire in our family<h1>",HttpStatus.OK);
	}
	@GetMapping("/naveen")
	public ResponseEntity<String> naveen(){
		return new ResponseEntity<>( "<h1>HI....Naveen ~:) Your are the first billionaire in your family<h1>",HttpStatus.OK);
	}
	
}
