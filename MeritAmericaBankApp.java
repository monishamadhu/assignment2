package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		
		CDOffering[] offerings = new CDOffering[5];
		/*
		 * Merit America Bank will offer various CDs:
			1 year term at 1.8%
			2 year term at 1.9%
			3 year term at 2.0%
			5 year term at 2.5%
			10 year term at 2.2%
		 */
		offerings[0] = new CDOffering(1, 0.018);
		offerings[1] = new CDOffering(2, 0.019);
		offerings[2] = new CDOffering(3, 0.02);
		offerings[3] = new CDOffering(5, 0.025);
		offerings[4] = new CDOffering(10, 0.022);
		
		MeritBank.setCDOfferings(offerings);
		
		AccountHolder ah1= new AccountHolder("John","Jaffer","Janardanan","683110451");
		
		/*
		 * 
			Merit America Bank will allow account holders to open new checking and 
			savings accounts as long as the combined balances are under $250,000

		 */
		
			ah1.addCheckingAccount(1000);
			ah1.addSavingsAccount(10000);
			ah1.addCheckingAccount(5000);
			ah1.addSavingsAccount(50000);
			ah1.addCheckingAccount(50000);
			ah1.addSavingsAccount(500000);
			if(ah1.addCheckingAccount(5000)==null) {
				System.out.println("Checking account not created");
			}
			if(ah1.addSavingsAccount(50000)==null) {
				System.out.println("Savings account not created");
			}
			ah1.addCDAccount(MeritBank.getBestCDOffering(0),0);
			MeritBank.addAccountHolder(ah1);
		
		AccountHolder ah2= new AccountHolder("Amar","Akbar","Antony","254876551");
		ah2.addCheckingAccount(1000);
		ah2.addSavingsAccount(10000);
		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(0),0);
		MeritBank.addAccountHolder(ah2);
		
		MeritBank.clearCDOfferings();
		
		AccountHolder ah3= new AccountHolder("Kottaaram","Veettile","Appoottan","734869527");
		ah3.addCDAccount(MeritBank.getSecondBestCDOffering(0),0);
		System.out.println(MeritBank.getCDOfferings());
		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);
		MeritBank.addAccountHolder(ah3);
		
		System.out.println("The total balance in Merit Bank is: "+MeritBank.totalBalances());
	}
	

}