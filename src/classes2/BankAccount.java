package classes2;

public class BankAccount {

    private static double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public BankAccount() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        balance = balance + depositAmount;

    }

    public static void witdraw(double witdrawAmount){
        balance = balance - witdrawAmount;

    }
}
