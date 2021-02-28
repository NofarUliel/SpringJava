package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//define a private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:"+this.fortuneService.getFortune();
	}

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method  doMyCleanupStuff");
	}
}
