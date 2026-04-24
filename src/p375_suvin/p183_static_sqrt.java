//183) Write a program to calculate the square root of a number using a static method.

package p375_suvin;

public class p183_static_sqrt {
    static double sqrt(double n) {
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        System.out.println("Square root of 64: " + sqrt(64));
    }
}

//output
//Square root of 64: 8.0
