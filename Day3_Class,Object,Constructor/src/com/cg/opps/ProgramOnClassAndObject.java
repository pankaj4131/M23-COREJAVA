package com.cg.opps;

//demo on how to use the class and object
class car
{
	//variable
	int a;
	//user define method
	void display()
	{
		System.out.println("-----Welcome To M23 Batch-----");
	}
}

public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
				car obj=new car();
				//accessing the car class method
				obj.display();
				obj.a=55;
				//accessing the car class variable
				System.out.println(obj.a);

	}

}
