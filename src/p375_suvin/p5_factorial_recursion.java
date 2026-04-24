//5) Write a program to calculate the factorial of a given number using recursion.

package p375_suvin;

public class p5_factorial_recursion {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

//output
//Factorial of 5 is 120
