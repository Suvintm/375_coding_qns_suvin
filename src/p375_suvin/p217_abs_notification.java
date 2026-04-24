//217) Write an abstract class "Notification" with abstract methods "send". Implement it in subclasses "Email" and "SMS".

package p375_suvin;

abstract class Notification {
    abstract void send(String msg);
}

class Email extends Notification {
    void send(String msg) { System.out.println("Sending Email: " + msg); }
}

class SMS extends Notification {
    void send(String msg) { System.out.println("Sending SMS: " + msg); }
}

public class p217_abs_notification {
    public static void main(String[] args) {
        Notification n = new Email();
        n.send("Hello World!");
    }
}

//output
//Sending Email: Hello World!
