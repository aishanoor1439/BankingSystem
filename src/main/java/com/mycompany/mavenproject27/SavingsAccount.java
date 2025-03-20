package com.mycompany.mavenproject27;

public class SavingsAccount extends BankAccount {

//    Attributes
    private double interestRate;

//    Methods
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }
}
