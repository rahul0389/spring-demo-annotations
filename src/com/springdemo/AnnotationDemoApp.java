package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Load context config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from the container
		
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
	    
		Coach ttCoach = context.getBean("tableTennisCoach",Coach.class);
		
		// Call methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(ttCoach.getDailyWorkout());
		
		// Close the context
		context.close();

	}

}
