package com.itbank.atm;

import com.itbank.atm.model.BankAccount;
import com.itbank.atm.service.BankService;
import com.itbank.atm.service.BankServiceImpl;

public class CityBankATM {
    public static void main(String[] args) {
        BankService service = new BankServiceImpl();
        BankAccount client1 = service.getClient("kz2441", "9999");
        //BankAccount client2 = service.getClient("kz1441", "4432");
        /*String accNumber = service.getAccountNumber(client1);
        String pinCode = service.getPinCode(client1);
        Integer balance = service.totalBalance(client1);
        System.out.printf("Account Number of this client : " + accNumber +
                System.getProperty("line.separator") +
                "PINCODE is : " + pinCode +
                System.getProperty("line.separator") +
                "Total Balance : " + balance +
                System.getProperty("line.separator"));
        service.setPinCode(client1, "1234");
        String pinCode2 = service.getPinCode(client1);
        System.out.println(pinCode2);
        service.withdrawal(client1, 3000);
        service.replenishment(client1, 10000);*/

        System.out.println(service.accountData(client1));

    }
}
