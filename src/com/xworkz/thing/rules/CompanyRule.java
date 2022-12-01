package com.xworkz.thing.rules;

import com.xworkz.thing.type.Company;

public class CompanyRule implements Company {

	@Override
	public boolean dressCode() {
           System.out.println("false");
		return false;
	}

	public static void salary() {
		System.out.println("static method");
	}

	public static void attendance() {
		System.out.println("static connot override");
	}

	public static void giveLaptop() {
		System.out.println("every IT company give a laptop");

	}

	public static void equalOpportunity() {
		System.out.println("static method");

	}

}
