package com.cg.superkeyword;

class Color
{
	protected String name="Orange";
}
class Blue extends Color
{
	public String name="Blue";
	public void display()
	{
		System.out.println(name);
		//super keyword is used to refer the parent class variable
		System.out.println(super.name);
	}
}


public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blue b=new Blue();
		b.display();


	}

}
