package com.xworkz.thing.abstraction;

public class LibrarianRunner {
	public static void main(String[] args) {
		Librarian rules=new LibraryRules();
		Readers readers=new Readers(rules);
		readers.checkRules();	
	}
	
}
