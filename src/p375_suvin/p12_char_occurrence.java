//12) Write a program to count the occurrences of a character in a string.

package p375_suvin;

public class p12_char_occurrence {
    public static void main(String[] args) {
        String str = "hello";
        char ch = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + ch + "' in \"" + str + "\": " + count);
    }
}

//output
//Occurrences of 'l' in "hello": 2
