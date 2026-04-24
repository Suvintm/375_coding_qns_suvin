//55) Write a program to reverse an array.

package p375_suvin;

public class p55_reverse_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        
        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//output
//Original array: 1 2 3 4 5 
//Reversed array: 5 4 3 2 1 
