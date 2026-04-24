//39) Write a program to find the factorial of a number using recursion.

package p375_suvin;

public class p39_factorial_recursion_v2 {
    public static void main(String[] args) {
        int n = 6;
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

//output
//Factorial of 6 is 720
