//34) Write a program to check whether a given character is a vowel or consonant.

package p375_suvin;

public class p34_vowel_consonant {
    public static void main(String[] args) {
        char ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}

//output
//e is a vowel
