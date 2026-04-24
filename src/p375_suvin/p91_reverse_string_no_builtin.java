//91) Write a program to reverse a string without using any built-in methods.

package p375_suvin;

public class p91_reverse_string_no_builtin {
    public static void main(String[] args) {
        String s = "suvin";
        char[] chars = s.toCharArray();
        System.out.print("Reversed string: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}

//output
//Reversed string: nivus
