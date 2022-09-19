package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	@SuppressWarnings("unused")
	static final private float deliveryCharges = 0;
	
	//Constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}

	public void bookProduct(float charges)
	{
		System.out.println("Account No.:"+this.getAccNo()+ " "+"Account Name:"+this.getAccNm()+" "+"Charges is: "+this.getCharges());
	}

	protected abstract void bookProduct(int charges);
	

}