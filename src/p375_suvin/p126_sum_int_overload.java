//126) Write a program to find the sum of two integers.

package p375_suvin;

public class p126_sum_int_overload {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 10 and 20: " + sum(10, 20));
    }
}

//output
//Sum of 10 and 20: 30
