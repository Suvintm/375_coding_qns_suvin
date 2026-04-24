//83) Write a program to calculate the average of elements in an array.

package p375_suvin;

public class p83_average_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        double sum = 0;
        for (int x : arr) sum += x;
        double avg = sum / arr.length;
        System.out.println("Average of elements: " + avg);
    }
}

//output
//Average of elements: 30.0
