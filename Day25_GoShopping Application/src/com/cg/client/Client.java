package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrime;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ShopFactory s = new GSShopFactory();
		PrimeAcc p = new GSPrime(0075, "Pankaj Manjare", 500, true);
		GSNormalAcc n = new GSNormalAcc(0075, "Rutuja Manjare", 500, 50);
		System.out.println("Prime Account: ");
		p.bookProduct(500);
		System.out.println("Normal Account: ");
		n.bookProduct(500);
		
		
		System.out.println(p);
		System.out.println(n);
	}

}