package com.bridgelabz.bankAccount;

public class SavingsAccount {
	private static double annualInterestRate ;
	private double savingsBalance;
	
	public SavingsAccount( double balance) {
		this.savingsBalance = balance;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance *(annualInterestRate/100) / 12;
		savingsBalance += monthlyInterest;
		display(monthlyInterest);
		return savingsBalance;
	}
	public void display(double interest) {
		System.out.println(" The monthly interest rate is : " + interest);
		System.out.println(" The new saving balance is : " + savingsBalance);
	}
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
}
