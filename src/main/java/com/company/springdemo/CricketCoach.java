package com.company.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// create a no arg constructor
	public CricketCoach() {
		System.out.println("cricket coach: inside no arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket coach: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "practice fast bowling for 30 mnts";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
