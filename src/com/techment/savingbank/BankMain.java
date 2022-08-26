package com.techment.savingbank;

public class BankMain {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(1000,0.5);
		
		saving.depositAmount(200);
		saving.withdrawAmount(100);
		saving.interest();
		
		saving.getBalance();

	}

}
