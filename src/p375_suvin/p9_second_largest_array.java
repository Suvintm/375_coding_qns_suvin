//9) Write a program to find the second largest number in an array.

package p375_suvin;

public class p9_second_largest_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int first = -1, second = -1;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second largest number: " + second);
    }
}

//output
//Second largest number: 40
