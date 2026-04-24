//74) Write a program to find the kth smallest and kth largest elements in an array.

package p375_suvin;
import java.util.Arrays;

public class p74_kth_largest_smallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 25};
        int k = 2;
        Arrays.sort(arr);
        System.out.println(k + "nd smallest: " + arr[k - 1]);
        System.out.println(k + "nd largest: " + arr[arr.length - k]);
    }
}

//output
//2nd smallest: 10
//2nd largest: 20
