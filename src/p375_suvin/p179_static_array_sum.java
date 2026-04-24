//179) Write a program to find the sum of elements in an array using a static method.

package p375_suvin;

public class p179_static_array_sum {
    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + sum(data));
    }
}

//output
//Sum of array: 15
