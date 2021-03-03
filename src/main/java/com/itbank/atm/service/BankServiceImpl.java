package com.itbank.atm.service;

import com.itbank.atm.dao.Database;
import com.itbank.atm.model.BankAccount;

import java.util.List;

public class BankServiceImpl implements BankService {
    @Override
    public BankAccount getClient(String accountNumber, String pincode)
    {
        BankAccount client = null;
        for (BankAccount account: Database.getBankAccountList())
        {
            if (account.getAccountNumber().equals(accountNumber) && account.getPinCode().equals(pincode))
            {
                client = account;
                break;
            }
        }
        return client;
    }

    @Override
    public String getAccountNumber(BankAccount client)
    {
        return client.getAccountNumber();
    }

    @Override
    public String getPinCode(BankAccount client)
    {
        return client.getPinCode();
    }

    @Override
    public void setPinCode(BankAccount client, String pinCode)
    {

        if (client.getPinCode().equals(pinCode))
        {
            System.out.println("Ur new PINCODE same with ur old PINCODE");
        }
        else
        {
            client.setPinCode(pinCode);
        }
        System.out.println("Your old PIN is :" + client.getPinCode());
        System.out.println("Ur new PINCODE is : " + client.getPinCode());

    }

    @Override
    public Integer totalBalance(BankAccount client)
    {
        return client.getBalance();
    }

    @Override
    public void withdrawal(BankAccount client, Integer money)
    {
        Integer totalAmount = client.getBalance();
        Integer minusMoney = money;
        System.out.println("You withdraw " + money + " !");
        System.out.println("Now ur total balance is : " + (totalAmount - money));
    }

    @Override
    public void replenishment(BankAccount client, Integer money)
    {
        Integer totalAmount = client.getBalance();
        Integer plusMoney = money;
        System.out.println("You added " + money + " !");
        System.out.println("Now ur total balance is : " + (totalAmount + money));
    }

    @Override
    public String accountData(BankAccount client)
    {
        for (BankAccount account: Database.getBankAccountList())
        {
            account = client;
        }
        return client.toString();
    }
}
