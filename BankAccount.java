package com.meritamerica.assignment2;

public class BankAccount {
	public BankAccount(double balance, double interestRate) {
		this.balance=balance;
		this.interestRate = interestRate;
	}
	public BankAccount(long accountNumber, double balance, double interestRate) {
		this.accountNumber= accountNumber;
		this.balance=balance;
		this.interestRate = interestRate;
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public boolean withdraw(double amount) {
		return (balance-amount)>=0;
	}
	public boolean deposit (double amount) {
		return amount>0;
	}
	public double futureValue(int years) {
		double futureVal = balance * Math.pow((1+this.interestRate),years);
		return futureVal;
	}
	
	private double balance;
	private double interestRate;
	private long accountNumber;

}
