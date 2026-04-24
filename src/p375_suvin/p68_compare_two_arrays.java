//68) Write a program to check whether two arrays are equal or not.

package p375_suvin;
import java.util.Arrays;

public class p68_compare_two_arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        if (Arrays.equals(a, b)) System.out.println("Arrays are equal");
        else System.out.println("Arrays are not equal");
    }
}

//output
//Arrays are equal
