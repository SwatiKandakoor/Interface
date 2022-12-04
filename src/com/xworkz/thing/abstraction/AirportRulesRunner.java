
package com.xworkz.thing.abstraction;

public class AirportRulesRunner {
	public static void main(String[] args) {
		AirportRules rules=new AirportAuthority();
		Passenger pass=new Passenger(rules);
		pass.checkRules();
	
	}
	
}
