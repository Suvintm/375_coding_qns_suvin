//43) Write a program to calculate the sum of n natural numbers up to a given term.

package p375_suvin;

public class p43_sum_natural_numbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}

//output
//Sum of first 10 natural numbers: 55
