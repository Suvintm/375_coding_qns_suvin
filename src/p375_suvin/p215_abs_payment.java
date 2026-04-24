//215) Write an abstract class "Payment" with abstract methods "processPayment". Implement it in subclasses "CreditCard" and "PayPal".

package p375_suvin;

abstract class Payment {
    abstract void processPayment(double amt);
}

class CreditCard extends Payment {
    void processPayment(double amt) { System.out.println("Processing Credit Card payment of $" + amt); }
}

class PayPal extends Payment {
    void processPayment(double amt) { System.out.println("Processing PayPal payment of $" + amt); }
}

public class p215_abs_payment {
    public static void main(String[] args) {
        Payment p = new PayPal();
        p.processPayment(250.50);
    }
}

//output
//Processing PayPal payment of $250.5
