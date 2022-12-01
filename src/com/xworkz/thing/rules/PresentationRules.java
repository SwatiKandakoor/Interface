package com.xworkz.thing.rules;

import com.xworkz.thing.type.Presentation;

public class PresentationRules implements Presentation {

	@Override
	public String introduction() {
		System.out.println("abstract method");
		return null;
	}

	@Override
	public boolean topics() {
		System.out.println("abstract method");
		return false;
	}

	@Override
	public int inTime() {
		System.out.println("abstract method");
		return 0;
	}

	@Override
	public String Communication() {
		System.out.println("abstract method");
		return null;
	}

	@Override
	public int noOfPoints() {
		System.out.println("abstract method");
		return 0;
	}

}
