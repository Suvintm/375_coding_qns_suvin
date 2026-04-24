//38) Write a program to check whether a given number is prime or not using for loop.

package p375_suvin;

public class p38_prime_for_loop {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) System.out.println(num + " is a prime number");
        else System.out.println(num + " is not a prime number");
    }
}

//output
//11 is a prime number
