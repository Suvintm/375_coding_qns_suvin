//101) Write a program to reverse a string.

package p375_suvin;

public class p101_reverse_string_v3 {
    public static void main(String[] args) {
        String s = "programming";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + rev);
    }
}

//output
//Original: programming
//Reversed: gnimmargorp
