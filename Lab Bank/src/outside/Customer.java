package outside;

import banking_system.ATM;
import banking_system.Bank;

public class Customer {
    Bank bank;
    ATM atm;
    int num;
    public Customer(Bank b, ATM a){
        this.bank = b;
        this.atm = a;
    }
    public void openAccount(){
        this.num = this.bank.createAccount();
    }
    public void depositMoney(int a)
    {
        this.atm.loginToAccount(num);
        this.atm.deposit(a);
        this.atm.logout();
    }
     public void withdrawMoney(int a)
    {
        this.atm.loginToAccount(num);
        this.atm.withdraw(a);
        this.atm.logout();
    }
    public int checkBalance(){
        this.atm.loginToAccount(num);
        int b = this.atm.getBalance();
        this.atm.logout();
        return b;
    }
}
