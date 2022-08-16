package com.cg.thiskeyword;

class A
{
	public int num;
	A()
	{
		System.out.println("-----Welcome To M23 Batch-----");
	}
	A(int num)
	{
		this.num=num;
	}
}

public class InstanceConstructor {

	public static void main(String[] args) {
		A a=new A();
		A b=new A(10);
		System.out.println(b.num);

	}

}
