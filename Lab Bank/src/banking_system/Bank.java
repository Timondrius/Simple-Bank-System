package banking_system;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts;
    ArrayList<ATM> atms;
    public Bank(){
        this.accounts = new ArrayList<>();
        this.atms = new ArrayList<>();
    }
    public int createAccount(){
        Account account = new Account(accounts.size());
        this.accounts.add(account);
        return accounts.size() - 1;
    }
    public void attachATM(ATM e){
        e.bank = this;
        this.atms.add(e);
    }
    int accessAcctInfo(int accNum){
        try{
            return this.accounts.get(accNum).accountBalance;
        } catch (Exception a){
            System.out.println("Account number doesn't exist");
        }
        return 0;
    }
    void updateAcctBal(int accNum, int diff){
        try{
            this.accounts.get(accNum).accountBalance += diff;{
                if(this.accounts.get(accNum).accountBalance < 0){
                    this.accounts.get(accNum).accountBalance -= diff;
                    throw new Exception("Not enough money on the account");
                }
            }
        } catch (Exception a){
            System.out.println("Account number doesn't exist");
        }
    }
}
