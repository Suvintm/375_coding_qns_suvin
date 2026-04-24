//41) Write a program to print the Fibonacci series using recursion.

package p375_suvin;

public class p41_fibonacci_recursion {
    public static void main(String[] args) {
        int terms = 10;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

//output
//Fibonacci series: 0 1 1 2 3 5 8 13 21 34 
