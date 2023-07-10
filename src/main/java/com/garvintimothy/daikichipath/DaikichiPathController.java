package com.garvintimothy.daikichipath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/daikichi")
public class DaikichiPathController {
	@RequestMapping("/location/{locationName}")
	public String showTown(@PathVariable("locationName")String locationName) {
		return "Congrats! You're going to " + locationName + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String showLotto(@PathVariable("number")int number) {
		if(number % 2 == 0) {
			return "You will take a journey in the near future! Be weary of adversaries!";
		}
		else {
			return "Take a break! Relax with family and friends.";
		}
	}
}
