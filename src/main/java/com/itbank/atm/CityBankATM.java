package com.itbank.atm;

import com.itbank.atm.model.BankAccount;
import com.itbank.atm.model.CityBankAccount;
import com.itbank.atm.service.BankService;
import com.itbank.atm.service.BankServiceImpl;

import java.util.Scanner;

public class CityBankATM {
    static int choose;
    static Scanner keyboard = new Scanner(System.in);
    private static BankService service = new BankServiceImpl();
    private static BankAccount client1 = service.getClient("kz1441", "4432");
    private static BankAccount client2 = service.getClient("kz4521", "7777");
    public static void main(String[] args) {
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
        CityBankMenu();



        //System.out.println(service.accountData(client1));

    }




    public static int CityBankMenu() {
        System.out.println("Choose one of the following: \n" +
                        "PRESS [1] TO CASH WITHDRAWAL\n" +
                        "PRESS [2] TO VIEW BALANCE\n" +
                        "PRESS [3] TO CHANGE PIN CODE\n" +
                        "PRESS [4] TO REFILL ACCOUNT\n" +
                        "PRESS [5] TO VIEW ACCOUNT DATA\n" +
                        "PRESS [6] TO EXIT");
        choose = keyboard.nextInt();

        if (choose == 1) {// 1. Withdraw
            service.withdrawal(client1,2000);
            CityBankMenu();
            return 1;
        }
        if (choose == 2) {// 2. Check Balance
            service.totalBalance(client1);
            CityBankMenu();
            return 2;
        }
        if (choose == 3) {// 3. Change PIN
            service.setPinCode(client1,"2123");
            CityBankMenu();
            return 3;

        }
        if (choose == 4) {// 4. replenishment
            service.replenishment(client1,5000);
            CityBankMenu();
            return 4;
        }
        if (choose <= 5) {// accountData
            service.accountData(client1);
            CityBankMenu();
            return 5;
        }
        if (choose >= 6) {
            if(choose == 6){
                System.out.println("You are logged out.");
                System.exit(0);
            }
            else {
                System.out.println("System ERROR. We  don't have this number operation");
            }
            CityBankMenu();
            return 6;
        }
        return choose;

    }

    public static int NationalBankMenu() {
        System.out.println("Choose one of the following: \n" +
                "PRESS [1] TO CASH WITHDRAWAL\n" +
                "PRESS [2] TO VIEW BALANCE\n" +
                "PRESS [3] TO EXIT");
        choose = keyboard.nextInt();

        if (choose == 1) {// 1. Withdraw
            service.withdrawal(client2, 2000);
            NationalBankMenu();
            return 1;
        }
        if (choose == 2) {// 2. Check Balance
            service.totalBalance(client2);
            NationalBankMenu();
            return 2;
        }
        if (choose >= 3) {
            if (choose == 3) {
                System.out.println("You are logged out.");
                System.exit(0);
            } else {
                System.out.println("System ERROR. We  don't have this number operation");
            }
            NationalBankMenu();
            return 3;
        }
        return choose;
    }
}
