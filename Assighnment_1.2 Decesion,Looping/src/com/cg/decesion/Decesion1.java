package com.cg.decesion;

import java.util.Scanner;

public class Decesion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int time=sc.nextInt();
		if(time<15)
		{
			System.out.println("Goodmorning");
		}
		else
		{
			System.out.println("GoodNight");
		}

	}

}
