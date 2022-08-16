package com.cg.opps;


import java.util.Scanner;

class vehicle
{
	//variable
	public int a;
//	public int a1;
	
	//user define method
	void display()
	{
		System.out.println("Welcome To M23 Batch");
	}
}

public class RuntimeClassAndProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		private Object obj1;
			
			vehicle obj=new vehicle();
			vehicle objl=new vehicle();
			
			@SuppressWarnings("resource")
			Scanner s1=new Scanner(System.in);
			
			System.out.println("Enter the value of a : ");
			
			//int a=s1.nextInt();
			 obj.a=s1.nextInt();
			 objl.a=s1.nextInt();
			
			//accessing the car class method
			obj.display();
			
			//accessing the car class variable
			System.out.println(obj.a);
			System.out.println(objl.a);
//			s1.close();

	}

}
