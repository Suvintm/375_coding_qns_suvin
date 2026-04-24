//17) Write a program to find the factorial of a number using iteration.

package p375_suvin;

public class p17_factorial_iteration {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}

//output
//Factorial of 5 is 120
