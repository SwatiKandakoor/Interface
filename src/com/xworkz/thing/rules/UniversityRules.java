package com.xworkz.thing.rules;

import com.xworkz.thing.type.College;

public class UniversityRules implements College {

	@Override
	public String students(String name, int usn) {
		
		return null;
	}

	@Override
	public boolean lecturers(String teching) {
		
		return false;
	}

	@Override
	public boolean dressCode() {
		
		return false;
	}

}
