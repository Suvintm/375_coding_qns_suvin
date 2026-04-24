//53) Write a program to copy elements from one array to another.

package p375_suvin;

public class p53_copy_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.print("Copied array: ");
        for (int x : arr2) System.out.print(x + " ");
        System.out.println();
    }
}

//output
//Copied array: 1 2 3 4 5 
