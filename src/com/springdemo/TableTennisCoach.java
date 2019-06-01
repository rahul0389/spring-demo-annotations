package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
	
		return "Practice TT 2 hours daily";
	}

}
