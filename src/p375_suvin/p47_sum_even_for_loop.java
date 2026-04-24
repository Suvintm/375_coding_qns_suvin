//47) Write a program to find the sum of all even numbers between 1 to 100 using for loop.

package p375_suvin;

public class p47_sum_even_for_loop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}

//output
//Sum of even numbers: 2550
