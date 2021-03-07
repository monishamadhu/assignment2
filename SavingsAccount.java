package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(double balance) {
		super(balance, SAVINGS_INTERESTRATE);
		//interestRate=SAVINGS_INTERESTRATE;
	}
	public static final double SAVINGS_INTERESTRATE = 0.01;
	//private double interestRate;


}