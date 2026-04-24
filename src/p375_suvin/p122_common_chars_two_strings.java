//122) Write a program to find the common characters in two given strings.

package p375_suvin;

public class p122_common_chars_two_strings {
    public static void main(String[] args) {
        String s1 = "thin";
        String s2 = "thick";
        System.out.print("Common characters: ");
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) != -1) {
                System.out.print(c + " ");
                s2 = s2.replaceFirst(String.valueOf(c), "");
            }
        }
        System.out.println();
    }
}

//output
//Common characters: t h i 
