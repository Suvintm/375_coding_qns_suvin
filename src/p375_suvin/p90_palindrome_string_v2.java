//90) Write a program to check whether a given string is palindrome or not.

package p375_suvin;

public class p90_palindrome_string_v2 {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        if (s.equalsIgnoreCase(rev)) System.out.println(s + " is a palindrome");
        else System.out.println(s + " is not a palindrome");
    }
}

//output
//madam is a palindrome
