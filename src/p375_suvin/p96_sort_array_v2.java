//96) Write a program to sort an array of integers in ascending and descending order.

package p375_suvin;
import java.util.Arrays;

public class p96_sort_array_v2 {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 30};
        Arrays.sort(arr);
        System.out.print("Ascending: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        
        System.out.print("Descending: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }
}

//output
//Ascending: 10 20 30 40 50 
//Descending: 50 40 30 20 10 
