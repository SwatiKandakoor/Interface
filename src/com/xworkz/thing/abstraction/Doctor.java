package com.xworkz.thing.abstraction;

public class Doctor {
	
	private  Management management;
	
	
	public Doctor(Management management) {
		super();
		this.management=management;
		
	}
	
	public void checkRules(){
		if(management!=null) {
			boolean patience=this.management.patience();
			boolean nurse=this.management.nurse();
			if(patience==true && nurse==true) {
				System.out.println("patience and nurse following the rules");
			}
			else {
				System.out.println("not following the rules");
			}
		}
		
	}
		
	
}
