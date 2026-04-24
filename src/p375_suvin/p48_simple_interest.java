//48) Write a program to calculate the simple interest.

package p375_suvin;

public class p48_simple_interest {
    public static void main(String[] args) {
        double p = 1000, r = 5, t = 2;
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

//output
//Simple Interest: 100.0
