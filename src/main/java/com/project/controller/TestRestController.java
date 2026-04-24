package com.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyRestProject")
public class TestRestController {
	
	@GetMapping("/getInvitation/{myJob}/{myCity}")
	public ResponseEntity<String> getInvitation(@RequestParam("myName") String name, @RequestParam("myId") int id, 
			@PathVariable String myJob, @PathVariable("myCity") String city) {
		
		//Request url for postman = http://localhost:8080/MyRestProject/getInvitation/Java Development with kafka/Bangalore?myName=Tejashwini Tiraki&myId=103
		
		
		
		String msg = "Hello!! your name is " + name 
				+ " and your ID is " + id 
				+ " you are invited to my first Rest app!! "
				+ " and your job here is  " + myJob
				+ " your base location is " + city;
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		
	}
	

}
