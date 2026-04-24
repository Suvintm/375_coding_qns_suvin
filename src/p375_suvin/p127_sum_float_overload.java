//127) Write a program to find the sum of two floats.

package p375_suvin;

public class p127_sum_float_overload {
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 10.5 and 20.5: " + sum(10.5f, 20.5f));
    }
}

//output
//Sum of 10.5 and 20.5: 31.0
