package com.cg.testing;

import org.junit.jupiter.api.Assumptions;

import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void division()
	{
		System.setProperty("Pankaj", "Akash");
		//if Assumption is true then printing statement will print otherwise not
		Assumptions.assumeTrue("Akash".equals(System.getProperty("Pankaj")));
		//if Assumption is false then only printing statement will print otherwise not
		//Assumptions.assumeFalse("Akash".equals(System.getProperty("Pankaj")));
		System.out.println("Assumption is false");
	}

}
