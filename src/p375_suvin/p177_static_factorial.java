//177) Implement a static method to find the factorial of a number.

package p375_suvin;

public class p177_static_factorial {
    static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}

//output
//Factorial of 5: 120
