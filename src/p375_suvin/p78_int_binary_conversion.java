//78) Write a program to convert an integer to binary and vice versa.

package p375_suvin;

public class p78_int_binary_conversion {
    public static void main(String[] args) {
        int n = 10;
        String binary = Integer.toBinaryString(n);
        System.out.println(n + " in binary: " + binary);
        
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary + " in decimal: " + decimal);
    }
}

//output
//10 in binary: 1010
//1010 in decimal: 10
