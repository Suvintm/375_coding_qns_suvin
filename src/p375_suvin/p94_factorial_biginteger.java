//94) Write a program to find the factorial of a number using BigInteger class.

package p375_suvin;
import java.math.BigInteger;

public class p94_factorial_biginteger {
    public static void main(String[] args) {
        int n = 20;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + ": " + fact);
    }
}

//output
//Factorial of 20: 2432902008176640000
