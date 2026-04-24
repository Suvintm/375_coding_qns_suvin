//13) Write a program to find the GCD (Greatest Common Divisor) of two numbers.

package p375_suvin;

public class p13_gcd_two_numbers {
    public static void main(String[] args) {
        int n1 = 12, n2 = 18;
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}

//output
//GCD of 12 and 18 is: 6
