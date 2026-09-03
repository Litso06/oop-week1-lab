package com.zut;

public class BankAcount {
    // Attributes - instance variables - data
    String accountHolder;
    double balance;

    // State or Behaviour
    void deposit(double amount){
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        if (amount > this.balance){
            System.out.println("INSUFFICIENT FUNDS!!...");
            return;
        }
        this.balance = this.balance - amount;
    }
}
