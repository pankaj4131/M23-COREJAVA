package com.cg.thiskeyword;

class B
{
	public void accept1(B b)
	{
		System.out.println("Accept1 Method");
	}
	public void accept2()
	{
		accept1(this);
	}
}

public class ArgumentForMethodCall {

	public static void main(String[] args) {
		B b=new B();
		b.accept1(b);

	}

}