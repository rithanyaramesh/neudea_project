package org.example;

import java.util.Date;

public class ATMTransaction {
    private String transactionId;
    private Date date;
    private String type;
    private double amount;
    private double postBalance;

    public ATMTransaction(String transactionId, Date date, String type, double amount, double postBalance) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.postBalance = postBalance;
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPostBalance() {
        return postBalance;
    }

    public void setPostBalance(double postBalance) {
        this.postBalance = postBalance;
    }
}
