//266) Write a program to handle NegativeArraySizeException.

package p375_suvin;

public class p266_ex_negative_array {
    public static void main(String[] args) {
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception caught: Cannot create array with negative size.");
        }
    }
}

//output
//Exception caught: Cannot create array with negative size.
