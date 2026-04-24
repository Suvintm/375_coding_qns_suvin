//10) Write a program to reverse a string.

package p375_suvin;

public class p10_reverse_string {
    public static void main(String[] args) {
        String str = "suvin";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + rev);
    }
}

//output
//Original string: suvin
//Reversed string: nivus
