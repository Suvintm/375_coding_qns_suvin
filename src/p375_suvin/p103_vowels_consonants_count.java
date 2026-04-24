//103) Write a program to count the number of vowels and consonants in a string.

package p375_suvin;

public class p103_vowels_consonants_count {
    public static void main(String[] args) {
        String s = "Hello World";
        int v = 0, c = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}

//output
//Vowels: 3
//Consonants: 7
