package com.mycompany.mavenproject27;

public class Mavenproject27 {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000, 5);
        CheckingAccount checking = new CheckingAccount("CA456", 500, 200);

        savings.deposit(500);
        savings.applyInterest();
        savings.displayAccountInfo();

        checking.withdraw(600);
        checking.withdraw(200);
        checking.displayAccountInfo();
    }
}
