//143) Write a program to find the average of an array of integers.

package p375_suvin;

public class p143_average_array_overload {
    public static double average(int[] arr) {
        double sum = 0;
        for (int x : arr) sum += x;
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println("Average of array: " + average(data));
    }
}

//output
//Average of array: 3.0
