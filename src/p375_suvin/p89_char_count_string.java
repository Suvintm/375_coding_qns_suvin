//89) Write a program to count the occurrences of a character in a string.

package p375_suvin;

public class p89_char_count_string {
    public static void main(String[] args) {
        String s = "apple";
        char ch = 'p';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) count++;
        }
        System.out.println("Occurrences of '" + ch + "' in \"" + s + "\": " + count);
    }
}

//output
//Occurrences of 'p' in "apple": 2
