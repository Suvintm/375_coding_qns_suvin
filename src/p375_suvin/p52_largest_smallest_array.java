//52) Write a program to find the largest and smallest elements in an array.

package p375_suvin;

public class p52_largest_smallest_array {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}

//output
//Largest element: 75
//Smallest element: 7
