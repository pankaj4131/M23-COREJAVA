package com.tns.operator;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		bitwise Operator   --> (&,|,^,>>,<<)
		
		int res=a&b;
		int res1=a|b;
		int res2=a^b;
		int res3=a<<b;   //formula : a<<b=a*2  
		int res4=a>>b;   //formula : a>>b=a/2(b)
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

	}

}
