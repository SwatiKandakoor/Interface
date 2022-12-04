package com.xworkz.thing.abstraction;

public class LibraryRules implements Librarian{
	@Override
	public boolean keepSilence() {
		return true;
	}
	@Override
	public boolean phoneSilentMood() {
		return true;
	}

}
