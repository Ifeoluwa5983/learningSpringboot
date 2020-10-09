package com.techielady.demo.demo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${team.name}")
	private String teamName;
	
	@Value("${coach.name}")
	private String coachName;
	
	
	@GetMapping("teampoint")
	public String team() {
		return "Coach Name: " + coachName + "  Team Name: " + teamName;
	}
	
	@GetMapping("/")
	public String datePrint() {
		return "Hello world, the date is " + LocalDateTime.now();
	}

	
	@GetMapping("start")
	public String startEndPoint() {
		return "This is the start of the endpoint";
	}
	
	@GetMapping("end")
	public String endEndPoint() {
		return "This is the end of the endpoint";
	}
}
