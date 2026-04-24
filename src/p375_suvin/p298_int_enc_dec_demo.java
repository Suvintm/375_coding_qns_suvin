//298) Write a program to demonstrate interface implementation by creating objects of the encoder and decoder classes and invoking interface methods.

package p375_suvin;

public class p298_int_enc_dec_demo {
    public static void main(String[] args) {
        interface Decryptable { void decrypt(); }
        class Decoder implements Decryptable { public void decrypt() { System.out.println("Message decoded."); } }
        
        Decoder d = new Decoder();
        d.decrypt();
    }
}

//output
//Message decoded.
