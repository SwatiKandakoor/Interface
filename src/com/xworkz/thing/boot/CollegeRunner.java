package com.xworkz.thing.boot;

import com.xworkz.thing.rules.UniversityRules;
import com.xworkz.thing.type.College;

public class CollegeRunner {

	public static void main(String[] args) {
		UniversityRules rules = new UniversityRules();
		rules.dressCode();
		System.out.println(rules.lecturers("Good"));
		System.out.println(rules.students("sunitha", 42321));

		College college = new UniversityRules();
		college.dressCode();
		college.lecturers("Good");
		college.students("sunitha", 42321);

	}
}
