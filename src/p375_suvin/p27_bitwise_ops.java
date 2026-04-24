//27) Write a program to perform bitwise AND, OR, and XOR operations on two integers.

package p375_suvin;

public class p27_bitwise_ops {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
    }
}

//output
//AND: 1
//OR: 7
//XOR: 6
