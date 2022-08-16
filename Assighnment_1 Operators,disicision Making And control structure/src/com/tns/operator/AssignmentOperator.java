package com.tns.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//2)		assighnment operator  // -->(=,+=,-=,/=,%=)
		a*=b;                  
		System.out.println(a);

	}

}
