//229) Write an abstract class "Bank" with abstract methods "openAccount" and "closeAccount". Implement it in subclasses "SavingsBank" and "CurrentBank".

package p375_suvin;

abstract class BankV3 {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBankV3 extends BankV3 {
    void openAccount() { System.out.println("Savings Bank account opened"); }
    void closeAccount() { System.out.println("Savings Bank account closed"); }
}

public class p229_bank_abs {
    public static void main(String[] args) {
        BankV3 b = new SavingsBankV3();
        b.openAccount();
        b.closeAccount();
    }
}

//output
//Savings Bank account opened
//Savings Bank account closed
