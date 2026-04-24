//64) Write a program to find the second largest and second smallest elements in an array.

package p375_suvin;
import java.util.Arrays;

public class p64_second_largest_smallest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Arrays.sort(arr);
        System.out.println("Second smallest: " + arr[1]);
        System.out.println("Second largest: " + arr[arr.length - 2]);
    }
}

//output
//Second smallest: 20
//Second largest: 40
