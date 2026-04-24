//25) Write a program to calculate the power of a number.

package p375_suvin;

public class p25_power_number {
    public static void main(String[] args) {
        int base = 2, exp = 3;
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        System.out.println(base + " raised to power " + exp + " is: " + result);
    }
}

//output
//2 raised to power 3 is: 8
