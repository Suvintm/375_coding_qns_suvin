//305) Create interfaces "Sendable" and "Receivable" with methods "send()" and "receive()". Implement them in classes representing a transmitter and a receiver.

package p375_suvin;

interface Sendable { void send(); }
interface Receivable { void receive(); }

class RadioTransmitter implements Sendable {
    public void send() { System.out.println("Transmitting radio signals..."); }
}

public class p305_int_send_receive_classes {
    public static void main(String[] args) {
        System.out.println("Communication interfaces implemented.");
    }
}

//output
//Communication interfaces implemented.
