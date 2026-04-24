//8) Write a program to print the Fibonacci series up to a given number of terms.

package p375_suvin;

public class p8_fibonacci_series {
    public static void main(String[] args) {
        int terms = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

//output
//Fibonacci series: 0 1 1 2 3 5 8 13 21 34 
