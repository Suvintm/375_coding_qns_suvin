//297) Create interfaces "Encryptable" and "Decryptable" with methods "encrypt()" and "decrypt()". Implement them in classes representing an encoder and a decoder.

package p375_suvin;

interface Encryptable { void encrypt(); }
interface Decryptable { void decrypt(); }

class Encoder implements Encryptable {
    public void encrypt() { System.out.println("Encoding message..."); }
}

public class p297_int_enc_dec_classes {
    public static void main(String[] args) {
        System.out.println("Encryption interfaces implemented.");
    }
}

//output
//Encryption interfaces implemented.
