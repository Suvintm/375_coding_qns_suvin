//66) Write a program to rotate an array to the left or right.

package p375_suvin;

public class p66_rotate_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 1; // rotate left by 1
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        
        System.out.print("Array after left rotation: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}

//output
//Array after left rotation: 2 3 4 5 1 
