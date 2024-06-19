package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


public class ATM {
    private String location;
    private String managedBy;
    private List<ATMTransaction> transactions;

    public ATM(String location, String managedBy) {
        this.location = location;
        this.managedBy = managedBy;
        this.transactions = new ArrayList<>();
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
        createTransaction("withdrawal", amount, account.balance);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
        createTransaction("deposit", amount, account.balance);
    }

    public void transfer(Account lending_account, Account borrowing_account, double amount){
        lending_account.withdraw(amount);
        borrowing_account.deposit(amount);
        createTransaction("transfer", amount, lending_account.balance);
    }

    public double checkBalance(Account account) {
        return account.balance;
    }

    private void createTransaction(String type, double amount, double postBalance) {
        String transactionId = UUID.randomUUID().toString();
        Date date = new Date();
        ATMTransaction transaction = new ATMTransaction(transactionId, date, type, amount, postBalance);
        transactions.add(transaction);
    }

    public List<ATMTransaction> getTransactions() {
        return transactions;
    }

    //Getters and Setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }
}
