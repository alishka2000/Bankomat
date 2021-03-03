package com.itbank.atm.dao;

import com.itbank.atm.model.BankAccount;
import com.itbank.atm.model.CityBankAccount;
import com.itbank.atm.model.NationalBankAccount;

import java.util.ArrayList;
import java.util.List;

public class Database {
    static List<BankAccount> bankAccountList = new ArrayList<>();

    public static List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    static {
        bankAccountList.add(new CityBankAccount(
                "Alex",
                "Robertson",
                20000,
                "kz2441",
                "9999"));
        bankAccountList.add(new CityBankAccount(
                "Mike",
                "Tacker",
                40000,
                "kz2241",
                "2431"));
        bankAccountList.add(new CityBankAccount(
                "Billy",
                "Elroy",
                80000,
                "kz1441",
                "4432"));
        bankAccountList.add(new NationalBankAccount(
                "Alihan Ibrashev",
                4000000,
                "kz4521",
                "7777"));
        bankAccountList.add(new CityBankAccount(
                "Zhambul",
                "Mukhammedali",
                1000000,
                "kz4141",
                "2000"));
        bankAccountList.add(new CityBankAccount(
                "Azamat",
                "Shaikov",
                500000,
                "kz1000",
                "4234"));
        bankAccountList.add(new NationalBankAccount(
                "Zhangir Izbaskanov",
                355640,
                "kz1234",
                "8888"));
        bankAccountList.add(new NationalBankAccount(
                "Ashat Kemelbekov",
                123456,
                "kz1431",
                "7984"));
        bankAccountList.add(new CityBankAccount(
                "Lyazzat",
                "Abdez",
                900000,
                "kz5986",
                "2002"));
        bankAccountList.add(new NationalBankAccount(
                "Dana Nakhipova",
                555555,
                "kz1419",
                "8976"));

    }
}
