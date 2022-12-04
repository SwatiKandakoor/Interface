package com.xworkz.thing.abstraction;

public class Passengers {

	private BMRCL metro;

	public Passengers(BMRCL metro) {
		super();
		this.metro = metro;

	}

	public void checkRules() {
		if (metro != null) {
			int noOfDriver = this.metro.noOfDriver();
			int noOfStaff = this.metro.noOfStaff();

			if (noOfDriver <= 5 && noOfStaff <= 6) {
				System.out.println("Drivers and Staffs following rules");
			} else {
				System.out.println("not following ");
			}

		}

	}

}
