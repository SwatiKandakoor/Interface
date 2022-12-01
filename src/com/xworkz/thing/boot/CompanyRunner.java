package com.xworkz.thing.boot;

import com.xworkz.thing.rules.CompanyRule;
import com.xworkz.thing.type.Company;

public class CompanyRunner {
	public static void main(String[] args) {
		CompanyRule rule=new CompanyRule();
	rule.dressCode();
	rule.salary();
	rule.attendance();
	rule.giveLaptop();
	rule.equalOpportunity();

	Company company=new CompanyRule();
	company.dressCode();

	
	}

}
