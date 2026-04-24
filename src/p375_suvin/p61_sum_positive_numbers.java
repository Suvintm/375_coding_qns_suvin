//61) Write a program to find the sum of all positive numbers in an array.

package p375_suvin;

public class p61_sum_positive_numbers {
    public static void main(String[] args) {
        int[] arr = {-10, 20, -30, 40, 50};
        int sum = 0;
        for (int x : arr) {
            if (x > 0) sum += x;
        }
        System.out.println("Sum of positive numbers: " + sum);
    }
}

//output
//Sum of positive numbers: 110
