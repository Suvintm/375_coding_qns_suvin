//104) Write a program to count the occurrences of a character in a string.

package p375_suvin;

public class p104_char_occurrence_v3 {
    public static void main(String[] args) {
        String s = "banana";
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) count++;
        }
        System.out.println("Occurrences of '" + ch + "' in \"" + s + "\": " + count);
    }
}

//output
//Occurrences of 'a' in "banana": 3
