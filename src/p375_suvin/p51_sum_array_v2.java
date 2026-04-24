//51) Write a program to find the sum of all elements in an array.

package p375_suvin;

public class p51_sum_array_v2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}

//output
//Sum of array elements: 150
