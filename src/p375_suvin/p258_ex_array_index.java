//258) Write a program to handle ArrayIndexOutOfBoundsException.

package p375_suvin;

public class p258_ex_array_index {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        }
    }
}

//output
//Exception caught: Array index is out of bounds.
