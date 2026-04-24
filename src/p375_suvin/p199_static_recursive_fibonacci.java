//199) Write a program to find the Fibonacci series using recursion and a static method.

package p375_suvin;

public class p199_static_recursive_fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci series up to 10th term: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}

//output
//Fibonacci series up to 10th term: 0 1 1 2 3 5 8 13 21 34 
