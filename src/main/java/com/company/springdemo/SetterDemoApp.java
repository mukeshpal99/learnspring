package com.company.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		//load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retirieve the bean from spring container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call the method on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
