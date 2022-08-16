package com.ch.scannbuff;

import java.util.Scanner;
//Example on scanner class


public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@suppressWarnings("resource")
				Scanner s=new Scanner(System.in);
				//String str=s.nextLine();
				int a=s.nextInt();
				System.out.println(a);
				s.close();

	}

}
