package com.kee.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		// retrieve the bean from the spring container
		BoxingCoach theCoach = context.getBean("myBoxingCoach", BoxingCoach.class);
		
		
		// call methods on the bean
		// let's come back to this later...
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// close the context 
		context.close();
	}

}
