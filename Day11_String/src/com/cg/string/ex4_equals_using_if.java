package com.cg.string;

import java.util.Scanner;

public class ex4_equals_using_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dhoni";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str1=sc.nextLine();
		if(str.equals(str1))
		{
			System.out.println("Matching");
		}
		else 
		{
			System.out.println("Not matching");
		}


	}

}
