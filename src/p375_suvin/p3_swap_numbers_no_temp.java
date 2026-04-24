//3) Write a program to swap two numbers without using a temporary variable.

package p375_suvin;

public class p3_swap_numbers_no_temp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

//output
//Before swap: a = 10, b = 20
//After swap: a = 20, b = 10
