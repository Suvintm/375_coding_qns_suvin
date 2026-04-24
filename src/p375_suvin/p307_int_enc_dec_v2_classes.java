//307) Create interfaces "Encryptable" and "Decryptable" with methods "encrypt()" and "decrypt()". Implement them in classes representing an encryption algorithm and a decryption algorithm. (Repeat)

package p375_suvin;

interface EncryptableV2 { void encrypt(); }
interface DecryptableV2 { void decrypt(); }

class AESAlgorithm implements EncryptableV2 {
    public void encrypt() { System.out.println("Encrypting using AES..."); }
}

public class p307_int_enc_dec_v2_classes {
    public static void main(String[] args) {
        System.out.println("Algorithm interfaces implemented.");
    }
}

//output
//Algorithm interfaces implemented.
