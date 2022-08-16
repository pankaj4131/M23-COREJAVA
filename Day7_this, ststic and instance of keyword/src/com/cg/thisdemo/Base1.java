package com.cg.thisdemo;

public class Base1 {
	
	//default constructor 
			Base1()
			{
				this(60);
			}
			//para-constructor
			Base1(int i)
			{
				System.out.println("Parameterized constructor for Base1 : "+i);
			}

}
