//159) Create a class representing a bank account with private member variables (account number, balance) and public methods (deposit, withdraw).

package p375_suvin;

class BankAccV2 {
    private long accNo;
    private double balance;

    public void setAccNo(long a) { accNo = a; }
    public long getAccNo() { return accNo; }
    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) {
        if (balance >= amt) balance -= amt;
    }
    public double getBalance() { return balance; }
}

public class p159_bank_acc_v2_encap {
    public static void main(String[] args) {
        BankAccV2 b = new BankAccV2();
        b.setAccNo(123456789L);
        b.deposit(5000);
        b.withdraw(1500);
        System.out.println("Account: " + b.getAccNo() + ", Balance: " + b.getBalance());
    }
}

//output
//Account: 123456789, Balance: 3500.0
