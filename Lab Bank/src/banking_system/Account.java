package banking_system;

public class Account extends Bank {
    int accountNumber;
    int accountBalance;
    Account(int num){
        this.accountBalance = 0;
        this.accountNumber = num;
    }
}
