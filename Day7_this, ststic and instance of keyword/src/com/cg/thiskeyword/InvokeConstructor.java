package com.cg.thiskeyword;

//this() : to invoke current class constructor

class Z
{
	public int x;
	//default constructor
	Z()
	{
		this(25);//invoking the parameterized constructor
		System.out.println("Default Constructor");
	}
	//Parameterized Constructor
	Z(int x)
	{
		System.out.println("Value is : "+x);
	}
}

public class InvokeConstructor {

	public static void main(String[] args) {
//		@suppressWarnings("unused")
		Z obj=new Z();

	}

}
