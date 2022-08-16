package com.tns.operator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		logical operator    -->(&&,||,!)
		boolean res =(a>b && b<a);  //&& --> logical And operator 
		System.out.println(res);
		
		boolean res1=(a<b || b>a);   // || --> logical or operator
		System.out.println(res1);

	}

}
