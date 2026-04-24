//152) Create a class representing a bank account with private member variables (account number, balance) and public methods (deposit, withdraw).

package p375_suvin;

class BankAcc {
    private String accNo;
    private double balance;

    public void setAccNo(String a) { accNo = a; }
    public String getAccNo() { return accNo; }
    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { balance -= amt; }
    public double getBalance() { return balance; }
}

public class p152_bank_acc_encap {
    public static void main(String[] args) {
        BankAcc b = new BankAcc();
        b.setAccNo("GQT001");
        b.deposit(1000);
        b.withdraw(200);
        System.out.println("Acc: " + b.getAccNo() + ", Balance: " + b.getBalance());
    }
}

//output
//Acc: GQT001, Balance: 800.0
