//306) Write a program to demonstrate interface implementation by creating objects of the transmitter and receiver classes and invoking interface methods.

package p375_suvin;

public class p306_int_send_receive_demo {
    public static void main(String[] args) {
        interface Receivable { void receive(); }
        class RadioReceiver implements Receivable { public void receive() { System.out.println("Signal received."); } }
        
        RadioReceiver r = new RadioReceiver();
        r.receive();
    }
}

//output
//Signal received.
