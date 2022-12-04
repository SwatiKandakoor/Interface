package com.xworkz.thing.abstraction;

public class AccountHolder {

	private RBIBankRules rules;

	public AccountHolder(RBIBankRules rules) {
		this.rules = rules;
	}

	public void checkRules() {
		if (rules != null) {
			int minAmount = this.rules.minAmount();
			boolean aadarCardLink = this.rules.aadarCardLink();

			if (minAmount < 500 && aadarCardLink == true) {
				System.out.println("following rules");
			} else {
				System.out.println("not following rules");
			}
		}
	}

}
