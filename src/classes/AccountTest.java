package classes;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(224455, "Iftekhar");

        //account.setAccountNumber(224455);
        System.out.println(account.getAccountNumber());
        account.setBalance(50);
        account.withdrawMoney(500);
        System.out.println(account.getBalance());
        System.out.println(account.getName());

//        CheckingAccount cAccount= new CheckingAccount(334455, "Zeela");
//        cAccount.getName();

        SavingAccount savingAccount = new SavingAccount(665544, "Hannan");
        savingAccount.setBalance(500);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getName());
        savingAccount.addInterest(5);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdrawMoney(50);
        savingAccount.withdrawMoney(50);
        savingAccount.withdrawMoney(50);
        System.out.println(savingAccount.getBalance());
        System.out.println("*********");
        savingAccount.withdrawMoney(50);
        System.out.println(savingAccount.getBalance());

    }
}