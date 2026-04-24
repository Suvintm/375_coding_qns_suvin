//54) Write a program to count duplicates elements from an array.

package p375_suvin;

public class p54_count_duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate elements: " + count);
    }
}

//output
//Total number of duplicate elements: 3
