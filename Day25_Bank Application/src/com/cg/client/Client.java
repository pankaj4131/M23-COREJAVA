package com.cg.client;


import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		BankFactory b = new MMBankFactory();
		CurrentAcc c = new MMCurrentAcc( 0075 ,"Pankaj Manjare ",5000,1000);
		SavingAcc s = new MMSavingAcc( 1245 ,"Rutuja Manjare ",5000,true);
		
		System.out.println("Current Account: ");
		c.withdraw(500);
		
		System.out.println("Saving Account: ");
		s.withdraw(500);
		
		System.out.println(c);
		System.out.println(s);
		
	}

}