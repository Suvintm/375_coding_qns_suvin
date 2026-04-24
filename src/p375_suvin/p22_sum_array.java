//22) Write a program to find the sum of all elements in an array.

package p375_suvin;

public class p22_sum_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}

//output
//Sum of array elements: 15
