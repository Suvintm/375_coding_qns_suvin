//210) Write an abstract class "BankAccount" with abstract methods "deposit" and "withdraw". Implement it in subclasses "SavingsAccount" and "CurrentAccount".

package p375_suvin;

abstract class BankAccountV2 {
    abstract void deposit(double a);
    abstract void withdraw(double a);
}

class SavingsAccountV2 extends BankAccountV2 {
    double bal = 0;
    void deposit(double a) { bal += a; System.out.println("Deposited " + a); }
    void withdraw(double a) { bal -= a; System.out.println("Withdrawn " + a); }
}

public class p210_abs_bank_acc_v2 {
    public static void main(String[] args) {
        BankAccountV2 b = new SavingsAccountV2();
        b.deposit(500);
        b.withdraw(100);
    }
}

//output
//Deposited 500.0
//Withdrawn 100.0
