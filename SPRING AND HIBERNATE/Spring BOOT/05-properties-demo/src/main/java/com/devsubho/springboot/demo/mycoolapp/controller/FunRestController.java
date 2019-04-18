package com.devsubho.springboot.demo.mycoolapp.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//Inject Properties:
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teaminfo")
	public String teamInfo() {
		return "Coach Name: "+coachName +" Team Name: "+teamName;
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello World! Time on the server is:"+ LocalDateTime.now();
	} 
	
	@GetMapping("/workout")
	public String workout() {
		return "Run a hard 5K";
	} 
}
