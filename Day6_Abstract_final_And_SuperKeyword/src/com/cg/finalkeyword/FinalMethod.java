package com.cg.finalkeyword;

class A
{
	public A() {
		System.out.println("Constructor");
	}
//	if make any method as final you cant overrideit
//	final public void accept()
    public void accept() {
    	System.out.println("parent class1");
    }
}

class B extends A
{
	public void accept() {
		System.out.println("parent class2");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
	B b= new B();
	b.accept();
	}

}
