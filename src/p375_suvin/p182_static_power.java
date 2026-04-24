//182) Write a program to find the power of a number using a static method.

package p375_suvin;

public class p182_static_power {
    static double power(double b, int e) {
        return Math.pow(b, e);
    }

    public static void main(String[] args) {
        System.out.println("3 to the power 4: " + power(3, 4));
    }
}

//output
//3 to the power 4: 81.0
