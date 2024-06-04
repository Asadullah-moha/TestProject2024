package classes2;

public class BankAccountTest {

    public static void main(String[] args) {
      BankAccount bankAccount = new BankAccount(550);
//        bankAccount.setBalance(500);
//
//        System.out.println(bankAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(600);
        savingAccount.test();
        SavingAccount.witdraw(499);
        System.out.println(savingAccount.getBalance());

        BankAccount bankAccount1 = new SavingAccount(600);
//        SavingAccount savingAccount1 = new BankAccount(600); this can not be done, cant use child class to
//          create a parent class. only thorough the parent class to child class.
//        Encapsulation: access modifiers
//        polymorphism: creating an object using another reference.
//        inheritance:
//        encapsulation:
        bankAccount1.witdraw(550);
        System.out.println(bankAccount1.getBalance());
    }
}
