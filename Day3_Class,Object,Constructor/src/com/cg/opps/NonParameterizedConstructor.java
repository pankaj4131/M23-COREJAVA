package com.cg.opps;

class Animal
{
	int x;
	//Non-Parameterized Constructor
	Animal()
	{
		x=15;
	}
	void display()
	{
		System.out.println("LION"+" \n"+x);
		System.out.println("Tiger");
	}
}

public class NonParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a=new Animal();
		a.display();

	}

}
