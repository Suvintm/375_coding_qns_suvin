//240) Create a base class "BankAccount" with properties (account number, balance) and subclasses "SavingsAccount" and "CurrentAccount". Write a program to demonstrate inheritance.

package p375_suvin;

class BankAccount {
    String accNo;
    double balance;
    void showAcc() { System.out.println("Acc: " + accNo + ", Bal: " + balance); }
}

class SavingsAccount extends BankAccount {
    double interestRate = 4.5;
    void showSav() { System.out.println("Interest Rate: " + interestRate); }
}

class CurrentAccount extends BankAccount {
    double overDraftLimit = 5000;
    void showCur() { System.out.println("Overdraft Limit: " + overDraftLimit); }
}

public class p240_bank_acc_inheritance {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accNo = "SAV123";
        s.balance = 2000;
        s.showAcc();
        s.showSav();
    }
}

//output
//Acc: SAV123, Bal: 2000.0
//Interest Rate: 4.5
