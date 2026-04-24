//29) Write a program to swap two numbers using bitwise XOR operator.

package p375_suvin;

public class p29_swap_bitwise_xor {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

//output
//Before swap: a = 10, b = 20
//After swap: a = 20, b = 10
