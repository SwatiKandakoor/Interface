package com.xworkz.thing.abstraction;

public class BMRCLRunner {
	public static void main(String[] args) {
		BMRCL metro=new Metro();
		
		Passengers passenger=new Passengers(metro);
		passenger.checkRules();

	}
	
	
}
