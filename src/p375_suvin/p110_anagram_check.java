//110) Write a program to check whether two strings are anagrams or not.

package p375_suvin;
import java.util.Arrays;

public class p110_anagram_check {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) System.out.println("Strings are anagrams");
        else System.out.println("Strings are not anagrams");
    }
}

//output
//Strings are anagrams
