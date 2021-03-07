package com.meritamerica.assignment2;

//import java.util.Arrays;
import java.util.*;
//import java.util.Random;

public class MeritBank {
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		accHolderList.add(accountHolder);
	}
	public static AccountHolder[] getAccountHolders() {
		AccountHolder[] accHolderArr = accHolderList.toArray(new AccountHolder[0]);
		return accHolderArr;
	}
	public static CDOffering[] getCDOfferings() {
		return offerings;
	}
	public static CDOffering getBestCDOffering(double depositAmount) {
		//CDOffering[] offering= getCDOfferings();
		CDOffering bestCDOffer = offerings[0];
		for(int i=1; i<offerings.length;i++) {
			double futureVal=futureValue(depositAmount,offerings[i].getInterestRate(),offerings[i].getTerm());
			double bestFutureVal = futureValue(depositAmount,bestCDOffer.getInterestRate(),bestCDOffer.getTerm());
			if(futureVal>bestFutureVal) {
				bestFutureVal=futureVal;
				bestCDOffer=offerings[i];
			}
		}
		return bestCDOffer;
	}
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		
		CDOffering secondBestOffer = null;
		for(int i=1;i<offerings.length;i++) {
			for(int j=i+1;j<offerings.length;j++) {
				double bestFutureVal=futureValue(depositAmount,offerings[i].getInterestRate(),offerings[i].getTerm());
				double futureVal = futureValue(depositAmount,offerings[j].getInterestRate(),offerings[j].getTerm());
			//double secondBestFutureVal = futureValue(depositAmount,secondBestOffer.getInterestRate(),secondBestOffer.getTerm());
				CDOffering[] temp=new CDOffering[1];
				if(futureVal>bestFutureVal) {
					temp[0] = offerings[i];
					offerings[i]=offerings[j];
					offerings[j]=temp[0];
				}	
			}
		}
		secondBestOffer=offerings[1];
		return secondBestOffer;
	}
	public static void clearCDOfferings() {
		offerings=null;	
	}
	public static void setCDOfferings(CDOffering[] offerings) {
		MeritBank.offerings=offerings;                          //cannot access static variable with this keyword
		
	}
	public static long getNextAccountNumber() {
		nextAccNumber++;
		return nextAccNumber;
	}
	public static double totalBalances() {
		AccountHolder[] accountHolderArr= getAccountHolders();
		double totalBalance=0;
		for(int i=0;i<accountHolderArr.length;i++) {
			totalBalance+=accountHolderArr[i].getSavingsBalance()+accountHolderArr[i].getCheckingBalance()+accountHolderArr[i].getCDBalance();
		}
		return totalBalance;
	}
		
	public static double futureValue(double presentValue, double interestRate, int term) {
		double futureVal = presentValue * Math.pow((1+interestRate),term);
		return futureVal;
	}
	
	private static ArrayList<AccountHolder> accHolderList = new ArrayList<AccountHolder>();
	private static long nextAccNumber=1;
	private static CDOffering[] offerings;
}
