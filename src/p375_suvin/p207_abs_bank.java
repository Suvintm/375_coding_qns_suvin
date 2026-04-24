//207) Write an abstract class "Bank" with abstract methods "openAccount" and "closeAccount". Implement it in subclasses "SavingsBank" and "CurrentBank".

package p375_suvin;

abstract class Bank {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank extends Bank {
    void openAccount() { System.out.println("Savings account opened"); }
    void closeAccount() { System.out.println("Savings account closed"); }
}

class CurrentBank extends Bank {
    void openAccount() { System.out.println("Current account opened"); }
    void closeAccount() { System.out.println("Current account closed"); }
}

public class p207_abs_bank {
    public static void main(String[] args) {
        Bank b = new SavingsBank();
        b.openAccount();
        b.closeAccount();
    }
}

//output
//Savings account opened
//Savings account closed
