//232) Write an abstract class "BankAccount" with abstract methods "deposit" and "withdraw". Implement it in subclasses "SavingsAccount" and "CurrentAccount".

package p375_suvin;

abstract class BankAccountV3 {
    abstract void deposit(double a);
    abstract void withdraw(double a);
}

class CurrentAccountV3 extends BankAccountV3 {
    double b = 0;
    void deposit(double a) { b += a; System.out.println("Current Acc Deposit: " + a); }
    void withdraw(double a) { b -= a; System.out.println("Current Acc Withdraw: " + a); }
}

public class p232_bank_account_abs {
    public static void main(String[] args) {
        BankAccountV3 b = new CurrentAccountV3();
        b.deposit(1000);
        b.withdraw(500);
    }
}

//output
//Current Acc Deposit: 1000.0
//Current Acc Withdraw: 500.0
