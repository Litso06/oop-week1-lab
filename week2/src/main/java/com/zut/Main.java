package com.zut;

public class Main {
    public static void main(String[] args) {
        BankAcount chilesAcount = new BankAcount();
        BankAcount mikesAcount = new BankAcount();

        chilesAcount.accountHolder = "Chile";
        chilesAcount.balance = 100;

        System.out.println("Mike's Balance: " + mikesAcount.balance);
        System.out.println("Before Deposit: " + chilesAcount.balance);
        chilesAcount.deposit(100);
        System.out.println("After Deposit: " + chilesAcount.balance);
    }
}