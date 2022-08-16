package com.cg.abstractkeyword;

//abstract class
abstract class flower
{
//	abstract method
	abstract void print();
	void accept() {
		System.out.println("non abstract method");
	}
}
class lily extends flower
{
	void print() {
		System.out.println("child of class flower");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
//		we can't create object of abstract class
//		flower f=new flower();
		
		lily l=new lily();
		l.print();
		l.accept();
	}

}
