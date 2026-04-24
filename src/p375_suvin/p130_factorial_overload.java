//130) Write a program to calculate the factorial of a number.

package p375_suvin;

public class p130_factorial_overload {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}

//output
//Factorial of 5: 120
