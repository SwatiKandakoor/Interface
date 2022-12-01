package com.xworkz.thing.boot;

import com.xworkz.thing.rules.XworkzRajajinagar;
import com.xworkz.thing.type.DevelopmentInstitute;
import com.xworkz.thing.type.Institute;
import com.xworkz.thing.type.TestingInstitute;
import com.xworkz.thing.type.TrafficRules;
import com.xworkz.thing.type.Xworkz;

public class InstituteRunner {
	public static void main(String[] args) {
		Xworkz xworkz = new XworkzRajajinagar();
		xworkz.interview();

		Institute institute = new XworkzRajajinagar();
		institute.placement();
		institute.training();

		DevelopmentInstitute develop = new XworkzRajajinagar();
		develop.interview();

		TestingInstitute test = new XworkzRajajinagar();
		test.interview();

		TrafficRules traffic = new XworkzRajajinagar();
		traffic.interview();
		traffic.tripleRiding();
		traffic.wearHelmet();
//		
		XworkzRajajinagar ref = new XworkzRajajinagar();
		ref.interview();

	}

}
