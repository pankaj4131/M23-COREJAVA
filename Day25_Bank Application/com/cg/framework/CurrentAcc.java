package com.cg.framework;
public abstract class CurrentAcc extends BankAcc
{
    private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;

	}

	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	public void withdrawal(float withdrawal) {
		if(withdrawal>=creditLimit) 
		{
			System.out.println("Your credit limit is :"+creditLimit);
		}
		else {
			System.out.println("Withdraw amonut is : "+withdrawal);
		System.out.println("Account no: "+this.getAccNo()+" "+"Account Name : "+this.getAccNm()+" "+"Account Bal: "+(this.getAccBal() - withdrawal));
		}
	}

		
	

	

}
