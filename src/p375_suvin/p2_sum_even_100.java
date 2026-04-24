//2) Write a program to print the sum of all even numbers from 1 to 100.

package p375_suvin;

public class p2_sum_even_100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}

//output
//Sum of even numbers: 2550
