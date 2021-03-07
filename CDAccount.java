package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	
	public CDAccount(CDOffering offering, double balance) {
		super(MeritBank.getNextAccountNumber(), balance, offering.getInterestRate());
		
		//this.balance=balance;
		this.offering=offering;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.offering.getInterestRate();
	}
	public int getTerm() {
		return this.offering.getTerm();
	}
	public java.util.Date getStartDate(){
		Date date=new Date();
		return date;
	}
	public long getAccountNumber() {
		return this.getAccountNumber();
	}
	public double futureValue() {
		return this.futureValue();
	}
	
	private double balance;
	private CDOffering offering;

}
