package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.CheckingAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        List <Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Maria", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Bob", 10000.550, 25000.00));
        list.add(new CheckingAccount(1003, "Alex", 1300.00));
        list.add(new SavingsAccount(1004, "Anna", 2350.00, 0.01));

        for (Account acc : list) {
            System.out.println(acc);
        }

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }      

        System.out.println("\nTotal Account = $ " + sum);
    }
}