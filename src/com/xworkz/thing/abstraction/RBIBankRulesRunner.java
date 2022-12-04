package com.xworkz.thing.abstraction;

public class RBIBankRulesRunner {
	public static void main(String[] args) {
		RBIBankRules rules=new SBIBank();
		AccountHolder holder=new AccountHolder(rules);
		holder.checkRules();
	}
	
	

}
