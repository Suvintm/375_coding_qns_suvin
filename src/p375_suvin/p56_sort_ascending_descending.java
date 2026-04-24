//56) Write a program to sort an array in ascending and descending order.

package p375_suvin;
import java.util.Arrays;

public class p56_sort_ascending_descending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        
        Arrays.sort(arr);
        System.out.print("Ascending order: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        
        System.out.print("Descending order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//output
//Ascending order: 1 2 5 7 8 
//Descending order: 8 7 5 2 1 
