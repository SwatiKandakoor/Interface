package com.xworkz.thing.abstraction;

public class Readers {
	
	private Librarian check;
	
	public Readers(Librarian check) {
		this.check=check;
	}
	
	public void checkRules() {
		if(check!=null) {
			boolean keepSilence =this.check.keepSilence();
			boolean phoneSilentMood =this.check.phoneSilentMood();
			if(keepSilence==true&& phoneSilentMood ==true ) {
				System.out.println("following rules");
			}
			else {
				System.out.println("not following rules");
			}
		}
	}

}
