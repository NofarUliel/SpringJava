package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		
		 ClassPathXmlApplicationContext contex =
				 new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 //retrieve bean from spring container
		Coach theCoach= contex.getBean("myCoach",Coach.class);
		
		//call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	
		//close the context
		contex.close();

	}

}
