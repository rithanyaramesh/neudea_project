package org.example;

public abstract class Account {
    protected String number;
    protected double balance;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds to withdraw or transfer, Your balance is: " + this.getBalance());
        }
    }

    //Getters and Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
