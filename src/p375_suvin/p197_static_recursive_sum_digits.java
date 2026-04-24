//197) Write a program to find the sum of digits of a number using recursion and a static method.

package p375_suvin;

public class p197_static_recursive_sum_digits {
    static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of 12345: " + sumDigits(12345));
    }
}

//output
//Sum of digits of 12345: 15
