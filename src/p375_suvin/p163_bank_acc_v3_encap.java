//163) Create a class representing a bank account with private member variables (account number, balance) and public methods (deposit, withdraw).

package p375_suvin;

class BankAccV3 {
    private String id;
    private double balance;

    public void setId(String s) { id = s; }
    public String getId() { return id; }
    public void deposit(double a) { balance += a; }
    public void withdraw(double a) { balance -= a; }
    public double getBalance() { return balance; }
}

public class p163_bank_acc_v3_encap {
    public static void main(String[] args) {
        BankAccV3 b = new BankAccV3();
        b.setId("SAV-777");
        b.deposit(2000);
        b.withdraw(500);
        System.out.println("ID: " + b.getId() + ", Bal: " + b.getBalance());
    }
}

//output
//ID: SAV-777, Bal: 1500.0
