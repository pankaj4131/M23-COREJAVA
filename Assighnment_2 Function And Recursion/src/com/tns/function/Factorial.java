package com.tns.function;

import java.util.Scanner;


//function defination
public class Factorial {
	
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*5;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));

	}

}
