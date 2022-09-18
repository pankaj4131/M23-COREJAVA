package com.cg.framework;
public abstract class SavingAcc extends BankAcc
{

	private boolean isSalaried;
	@SuppressWarnings("unused")
	private static final float minBal = 1000;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
		
	}

	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	public void withdrawal(float withdrawal)
	{
	
		
		float accBal=this.getAccBal();
		
		if(accBal<minBal) 
		{
			System.out.println("your account balance minimum limit is "+minBal);
		}
		else {	
			float depBal=accBal-minBal;
			
			if (depBal >= withdrawal ) {
			System.out.println("Withdraw amonut is : "+withdrawal);
			}
			else
			{
				System.out.println("Withdraw amount exceeds");
			}
			System.out.println("Account no: "+this.getAccNo()+" "+"Account Name : "+this.getAccNm()+" "+"Account Bal: "+(this.getAccBal()-withdrawal));
		}

		
	}

	
}