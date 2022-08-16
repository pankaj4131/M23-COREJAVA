package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//1)		relational operator    -->(>,<,>=,<=,!=,==)
//		boolean res=a>b;     
//		System.out.println(res);
		
//2)		assighnment operator  // -->(=,+=,-=,/=,%=)
		a*=b;                  
		System.out.println(a);

	}

}
