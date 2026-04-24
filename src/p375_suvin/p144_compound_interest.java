//144) Write a program to calculate the compound interest.

package p375_suvin;

public class p144_compound_interest {
    public static double calculate(double p, double r, double t) {
        return p * Math.pow(1 + r/100, t) - p;
    }

    public static void main(String[] args) {
        System.out.println("Compound Interest (p=1000, r=5, t=2): " + String.format("%.2f", calculate(1000, 5, 2)));
    }
}

//output
//Compound Interest (p=1000, r=5, t=2): 102.50
