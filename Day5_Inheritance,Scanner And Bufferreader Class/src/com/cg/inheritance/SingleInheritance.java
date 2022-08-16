package com.cg.inheritance;

//Program on single inheritance

class Parent
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey Guys !,Whats going on...?");
	}
}
class Child extends Parent
{
	void accept()
	{
		System.out.println("Roll No is : "+rollno);
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c=new Child();
		c.rollno=121;
		c.accept();
		c.print();

	}

}
