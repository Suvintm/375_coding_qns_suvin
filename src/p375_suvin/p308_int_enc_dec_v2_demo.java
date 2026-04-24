//308) Write a program to demonstrate interface implementation by creating objects of the encryption and decryption classes and invoking interface methods. (Repeat)

package p375_suvin;

public class p308_int_enc_dec_v2_demo {
    public static void main(String[] args) {
        interface Decryptable { void decrypt(); }
        class RSADecrypt implements Decryptable { public void decrypt() { System.out.println("RSA Decryption complete."); } }
        
        RSADecrypt r = new RSADecrypt();
        r.decrypt();
    }
}

//output
//RSA Decryption complete.
