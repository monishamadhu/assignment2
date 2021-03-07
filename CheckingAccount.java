package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount(double balance) {
		super(balance,CHECKING_INTERESTRATE);
		
		//interestRate=CHECKING_INTERESTRATE;
	}
	
	public static final double CHECKING_INTERESTRATE= 0.0001;
	
	//private double interestRate;

}



