//135) Write a program to check whether a number is prime or not.

package p375_suvin;

public class p135_prime_check_overload {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 17 prime? " + isPrime(17));
    }
}

//output
//Is 17 prime? true
