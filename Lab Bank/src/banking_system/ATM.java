package banking_system;

public class ATM {
    Bank bank;
    boolean logged = false;
    int current = - 1;
    public boolean loginToAccount(int accNum){
        if(this.bank.accounts.size() > accNum){
            this.current = accNum;
            this.logged = true;
        }
        return this.logged;
    }
    public boolean deposit(int amount){
        if(this.current != - 1){
            this.bank.accounts.get(current).accountBalance += amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(int amount){
        if(this.current != - 1 && this.bank.accounts.get(current).accountBalance >= amount){
            this.bank.accounts.get(current).accountBalance -= amount;
            return true;
        }
        return false;
    }
    public int getBalance(){
        if(this.current != -1){
            return this.bank.accounts.get(current).accountBalance;
        }
        return 0;
    }
    public void logout(){
        this.logged = false;
        this.current = -1;
    }
}
