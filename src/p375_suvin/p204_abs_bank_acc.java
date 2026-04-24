//204) Write an abstract class "BankAccount" with abstract methods "deposit" and "withdraw". Implement it in subclasses "SavingsAccount" and "CurrentAccount".

package p375_suvin;

abstract class BankAccount {
    double balance;
    abstract void deposit(double amt);
    abstract void withdraw(double amt);
}

class SavingsAccount extends BankAccount {
    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { if (balance >= amt) balance -= amt; }
}

class CurrentAccount extends BankAccount {
    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { balance -= amt; } // Overdraft allowed
}

public class p204_abs_bank_acc {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount();
        s.deposit(1000);
        s.withdraw(200);
        System.out.println("Savings Balance: " + s.balance);
    }
}

//output
//Savings Balance: 800.0
