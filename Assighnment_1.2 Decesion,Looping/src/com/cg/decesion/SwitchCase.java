package com.cg.decesion;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner (System.in);
		System.out.println("enter no ");
		int x=s.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("tom");
				break;
		case 2:
			System.out.println("doremon");
				break;
		case 3:
			System.out.println("jerry");
				break;		
		}

	}

}
