package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		
		 ClassPathXmlApplicationContext contex =
				 new ClassPathXmlApplicationContext("applicztionContext.xml");
		
		 //retrieve bean from spring container
		Coach theCoach= contex.getBean("myCoach",Coach.class);
		
		//call methods on the beans
		System.out.println(theCoach.getDailyWorkput());
		
		//close the context
		contex.close();

	}

}
