//123) Write a program to check whether a given string is a pangram or not.

package p375_suvin;

public class p123_pangram_check {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') index = s.charAt(i) - 'A';
            else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') index = s.charAt(i) - 'a';
            else continue;
            mark[index] = true;
        }
        boolean isPangram = true;
        for (boolean m : mark) if (!m) isPangram = false;
        
        if (isPangram) System.out.println("String is a pangram");
        else System.out.println("String is not a pangram");
    }
}

//output
//String is a pangram
