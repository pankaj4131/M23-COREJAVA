package com.cg.inheritance;

class AndroidVersion
{
	void display()
	{
		System.out.println("Android-Version");
	}
}
class kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println("Kitkat");
	}
}
class Pie extends AndroidVersion
{
	void print()
	{
		System.out.println("Pie");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kitkat k=new  kitkat();
		//@SuppressWarnings("unused")
		Pie p=new Pie();
		k.display();
		k.print();
		p.print();

	}

}
