package com.xworkz.thing.abstraction;


public class ManagementRunner {

	public static void main(String[] args) {
		Management ment=new Hospital();
		Doctor  management=new Doctor(ment);
		management.checkRules();
		
	}
}
