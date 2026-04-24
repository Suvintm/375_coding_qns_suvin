//97) Write a program to find the second largest and second smallest elements in an array.

package p375_suvin;
import java.util.Arrays;

public class p97_second_largest_smallest_v2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3};
        Arrays.sort(arr);
        System.out.println("Second smallest: " + arr[1]);
        System.out.println("Second largest: " + arr[arr.length - 2]);
    }
}

//output
//Second smallest: 2
//Second largest: 4
