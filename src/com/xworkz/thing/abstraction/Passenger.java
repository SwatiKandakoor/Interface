package com.xworkz.thing.abstraction;

public class Passenger {
	private AirportRules rule;

	public Passenger(AirportRules rule) {
		this.rule = rule;
	}

	public void checkRules() {
		if (rule != null) {
			int maxWeightOfLuggage = this.rule.maxWeightOfLuggage();
			boolean wearingMask = this.rule.wearingMask();
			if (maxWeightOfLuggage < 50 && wearingMask == false) {
				System.out.println("following rules");
			} else {
				System.out.println("not following rules");
			}
		}

	}
}
