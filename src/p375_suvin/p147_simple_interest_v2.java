//147) Write a program to calculate the simple interest.

package p375_suvin;

public class p147_simple_interest_v2 {
    public static double interest(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println("Simple interest (p=1000, r=5, t=2): " + interest(1000, 5, 2));
    }
}

//output
//Simple interest (p=1000, r=5, t=2): 100.0
