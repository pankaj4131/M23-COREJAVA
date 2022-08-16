package com.cg.package4;

import com.cg.package3.HDFC;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC h=new HDFC();
		h.setAmount(5000);
	
		System.out.println("amount in acc is:"+h.getAmount());

	}

}
