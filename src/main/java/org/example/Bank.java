package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String code;
    private String address;
    private List<Account> accounts;

    public Bank(String code, String address) {
        this.code = code;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public Account[] getAccounts() {
        return accounts.toArray(new Account[0]);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
