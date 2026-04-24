//42) Write a program to reverse a string using recursion.

package p375_suvin;

public class p42_reverse_string_recursion {
    public static void main(String[] args) {
        String str = "java";
        String rev = reverse(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

//output
//Original: java
//Reversed: avaj
