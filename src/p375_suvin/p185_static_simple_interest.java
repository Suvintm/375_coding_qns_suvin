//185) Write a program to calculate the simple interest using a static method.

package p375_suvin;

public class p185_static_simple_interest {
    static double interest(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println("Interest (p=1000, r=5, t=1): " + interest(1000, 5, 1));
    }
}

//output
//Interest (p=1000, r=5, t=1): 50.0
