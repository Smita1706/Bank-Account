package com.bridgelabz.bankAccount;

public class TestSavingsAccount {
	public static void main(String[] arg) {
		double interest;
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		System.out.println("Details of bank account with 4% interest ");
		saver1.setAnnualInterestRate(4.0);
		saver1.calculateMonthlyInterest();
		saver2.setAnnualInterestRate(4.0);
		saver2.calculateMonthlyInterest();
		System.out.println("\nDetails of bank account with 5% interest ");
		saver1.setAnnualInterestRate(5.0);
		saver1.calculateMonthlyInterest();
		saver2.setAnnualInterestRate(5.0);
		saver2.calculateMonthlyInterest();

	}
}
