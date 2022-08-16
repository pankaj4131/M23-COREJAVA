package com.tns.operator;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int x=a++;
		int y=++b;
		int z=a+x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
