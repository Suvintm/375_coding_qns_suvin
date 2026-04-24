//65) Write a program to find the index of a given element in an array.

package p375_suvin;

public class p65_find_element_index {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + target + " is: " + index);
    }
}

//output
//Index of 30 is: 2
