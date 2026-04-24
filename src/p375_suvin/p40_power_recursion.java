//40) Write a program to calculate the power of a number using recursion.

package p375_suvin;

public class p40_power_recursion {
    public static void main(String[] args) {
        int base = 2, exp = 3;
        long result = power(base, exp);
        System.out.println(base + "^" + exp + " = " + result);
    }

    public static long power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}

//output
//2^3 = 8
