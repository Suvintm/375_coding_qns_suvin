//134) Write a program to calculate the power of a number.

package p375_suvin;

public class p134_power_calculation {
    public static double power(double base, int exp) {
        return Math.pow(base, exp);
    }

    public static void main(String[] args) {
        System.out.println("2 to the power 3: " + power(2, 3));
    }
}

//output
//2 to the power 3: 8.0
