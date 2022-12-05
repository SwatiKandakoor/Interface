package com.xworkz.exception.events;

public abstract class Person extends Object{
	private String name;
	private String address;
	private String job;
	private int dateOfBirth;
	private String email;
	
	
	
	public Person(String name,String address,String job) {
		super();
		this.name=name;
		this.address=address;
		this.job=job;
	}
	
	public int getDateOfBirth() {
		return 0;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
		
	}
	
	public String getEmail() {
		return null;
	}
	
	public void setEmial(String email) {
		this.email=email;
	}
	
	
	public void eat() {
		System.out.println("person method");
		
	}
	public void sleep() {
		System.out.println("person sleep method");
		
	}
	public void events() {
		System.out.println("person name :"+name);
		System.out.println("person address :"+address);
		System.out.println("person date of birth :"+dateOfBirth);
		System.out.println("person job :" +job);
		System.out.println("person email :"+email);
	}

}
