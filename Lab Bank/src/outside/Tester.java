package outside;

import banking_system.ATM;
import banking_system.Bank;

public class Tester {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM a1 = new ATM();
        ATM a2 = new ATM();
        bank.attachATM(a1);
        bank.attachATM(a2);
        Customer c1 = new Customer(bank, a1);
        Customer c2 = new Customer(bank, a1);
        Customer c3 = new Customer(bank, a2);
        c1.openAccount();
        c2.openAccount();
        System.out.println(c1.checkBalance());
        c1.depositMoney(100);
        System.out.println(c1.checkBalance());
        c1.withdrawMoney(120);
        System.out.println(c1.checkBalance());
        c1.withdrawMoney(70);
        System.out.println(c1.checkBalance());
    }
}