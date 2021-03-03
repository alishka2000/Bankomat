package com.itbank.atm.model;

public class CityBankAccount extends BankAccount{
    private String name;
    private String surmane;

    public CityBankAccount(String name, String surname, Integer balance, String accountNumber, String PIN) {
        super(balance,accountNumber,PIN);
        this.name = name;
        this.surmane = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    @Override
    public String toString() {
        return "CityBankAccount{" +
                "name='" + name + '\'' +
                ", surmane='" + surmane + '\'' +
                ", " + super.toString() +
                '}';
    }
}
