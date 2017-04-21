package com.company.springdemo;

public class BaseBallCoach implements Coach{
	
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
				
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes of Batting practice";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();

	}
	

}
