package com.kee.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"The way out is the way in",
			"Hurt people hurt people, so remember compassion",
			"What's comin will come and we'll meet it when it does"
	};
	
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
