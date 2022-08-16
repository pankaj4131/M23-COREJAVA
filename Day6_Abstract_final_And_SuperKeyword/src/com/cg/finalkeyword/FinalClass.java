package com.cg.finalkeyword;
//if any class is declaired as final we cant inherit it
//final class fruit

class Fruit
{
//	we cant make any constructor as final
//	final fruit()
	Fruit(){
		System.out.println("Constructor");
	}
//	if you make any method asfinal you cant override it
//	final public void accept
	public void accept() {
		System.out.println("parent class...");
	}
}


class Apple extends Fruit
{
	public void accept() 
	{
		System.out.println("parent calss");
	}
	
}

public class FinalClass {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.accept();
	}

}
