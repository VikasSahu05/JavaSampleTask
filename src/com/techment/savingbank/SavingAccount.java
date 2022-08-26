package com.techment.savingbank;

public class SavingAccount {
	double balance=0;
	double interest=0;
	
	public SavingAccount(double balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	
	
	public void depositAmount(double amount) {
			balance+=amount;
	}	
	
	public void withdrawAmount(double amount) {
		balance-=amount;
	}
	
	public void interest() {
		balance=balance+balance*interest;
	}
	
	public void getBalance() {
		System.out.println("Total Balance  :"+balance);
	}
	
	
	
}
