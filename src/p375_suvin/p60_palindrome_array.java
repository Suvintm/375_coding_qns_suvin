//60) Write a program to check whether an array is palindrome or not.

package p375_suvin;

public class p60_palindrome_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) System.out.println("Array is a palindrome");
        else System.out.println("Array is not a palindrome");
    }
}

//output
//Array is a palindrome
