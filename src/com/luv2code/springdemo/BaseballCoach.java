package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	//define a private field for dependency
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return this.fortuneService.getFortune();
	}
}
