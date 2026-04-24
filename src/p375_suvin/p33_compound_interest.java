//33) Write a program to calculate the compound interest.

package p375_suvin;

public class p33_compound_interest {
    public static void main(String[] args) {
        double p = 1000, r = 5, t = 2;
        double ci = p * (Math.pow((1 + r / 100), t)) - p;
        System.out.println("Compound Interest: " + ci);
    }
}

//output
//Compound Interest: 102.5
