package com.zut;

public class Main {
    public static void main(String[] args) {
        BankAcount chilesAccount = new BankAcount();
        
        chilesAccount.accountHolder = "Chile";
        chilesAccount.balance = 100;

        System.out.println("Before Deposit: " + chilesAccount.balance);
        chilesAccount.deposit(100);
        System.out.println("After Deposit: " + chilesAccount.balance);
    }
}