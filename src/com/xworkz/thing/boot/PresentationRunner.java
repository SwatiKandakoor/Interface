package com.xworkz.thing.boot;

import com.xworkz.thing.rules.PresentationRules;
import com.xworkz.thing.type.Presentation;

public class PresentationRunner {
	public static void main(String[] args) {
        Presentation present=new PresentationRules();
        present.Communication();
        present.introduction();
        present.inTime();
        present.noOfPoints();
        present.topics();
        
        
        PresentationRules rules=new PresentationRules();
        rules.Communication();
        rules.inTime();
        rules.introduction();
        rules.noOfPoints();
        rules.topics();
        
	}

}
