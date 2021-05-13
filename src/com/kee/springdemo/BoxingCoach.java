package com.kee.springdemo;

public class BoxingCoach implements Coach {
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;

	private FortuneService fortuneService;
	
	// create a no argument constructor
	public BoxingCoach() {
		System.out.println("BoxingCoach: inside no-arg constructor");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("BoxingCoach: inside setter method- setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("BoxingCoach: inside setter method- setTeam");
		this.team = team;
	}


	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BoxingCoach: inside setter method- setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Jump rope for an hour every morning";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
