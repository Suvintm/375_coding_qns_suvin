//37) Write a program to check whether a given number is palindrome or not using recursion.

package p375_suvin;

public class p37_palindrome_recursion {
    public static void main(String[] args) {
        int num = 121;
        int rev = reverse(num, 0);
        if (num == rev) System.out.println(num + " is a palindrome");
        else System.out.println(num + " is not a palindrome");
    }

    public static int reverse(int n, int rev) {
        if (n == 0) return rev;
        rev = rev * 10 + (n % 10);
        return reverse(n / 10, rev);
    }
}

//output
//121 is a palindrome
