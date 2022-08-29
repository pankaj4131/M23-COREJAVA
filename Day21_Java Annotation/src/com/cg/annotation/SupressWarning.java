package com.cg.annotation;
import java.util.Scanner;

class Animal
{
	
	Animal()
	{
		System.out.println("Cat");
	}
	
	void sound()
	{
		System.out.println("Meoww");
	}
}


public class SupressWarning {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal a=new Animal();
		

	}

}