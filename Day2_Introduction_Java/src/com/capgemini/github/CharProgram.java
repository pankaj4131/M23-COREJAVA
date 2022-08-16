package com.capgemini.github;

import java.util.Scanner;

public class CharProgram {

	//program on character input
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		compile time input
//		char x='a'
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character values:");
		
//		char a=sc.next().charAt(1);
		
		char a=sc.next().charAt(2);  // i/p-->hey..How are you? --> it print (e) bcz of index 2
		System.out.println(a);
		sc.close();

	}

}
