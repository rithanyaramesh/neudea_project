package org.example;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("121", "Bengaluru");

        Account checkingAccount = new CheckingAccount("CHK001", 2000.0);
        Account savingAccount = new SavingAccount("SAV001", 10000.0);

        bank.addAccount(checkingAccount);
        bank.addAccount(savingAccount);

        ATM atm = new ATM("Amruthalli", "Divya");

        atm.deposit(checkingAccount, 500);
        atm.withdraw(savingAccount, 200);

        System.out.println("Checking Account Balance: " + atm.checkBalance(checkingAccount));
        System.out.println("Saving Account Balance: " + atm.checkBalance(savingAccount));

        Account[] accounts = bank.getAccounts();
        System.out.println("Accounts in the bank:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.number + ", Balance: " + account.balance);
        }

        List<ATMTransaction> transactions = atm.getTransactions();
        System.out.println("List of ATM Transactions:");
        for (ATMTransaction transaction : transactions) {
            System.out.println("Transaction ID: " + transaction.getTransactionId() +
                    ", Date: " + transaction.getDate() +
                    ", Type: " + transaction.getType() +
                    ", Amount: " + transaction.getAmount() +
                    ", Post Balance: " + transaction.getPostBalance());
        }
    }
}
