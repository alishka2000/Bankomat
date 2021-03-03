package com.itbank.atm.model;

public class NationalBankAccount extends BankAccount {
    private String fullname;

    public NationalBankAccount(String fullname, Integer balance, String accountNumber, String PIN) {
        super(balance,accountNumber,PIN);
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
