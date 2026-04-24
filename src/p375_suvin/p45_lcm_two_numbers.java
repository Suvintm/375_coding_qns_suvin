//45) Write a program to find the LCM (Least Common Multiple) of two numbers.

package p375_suvin;

public class p45_lcm_two_numbers {
    public static void main(String[] args) {
        int n1 = 12, n2 = 18;
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (n1 * n2) / gcd;
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
    }
}

//output
//LCM of 12 and 18 is: 36
