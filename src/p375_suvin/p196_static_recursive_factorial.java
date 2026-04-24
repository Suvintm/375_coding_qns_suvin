//196) Write a program to find the factorial of a number using recursion and a static method.

package p375_suvin;

public class p196_static_recursive_factorial {
    static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 6: " + factorial(6));
    }
}

//output
//Factorial of 6: 720
