//82) Write a program to find the maximum and minimum values in an array of integers.

package p375_suvin;

public class p82_max_min_array {
    public static void main(String[] args) {
        int[] arr = {15, 3, 9, 21, 8};
        int max = arr[0];
        int min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

//output
//Maximum value: 21
//Minimum value: 3
