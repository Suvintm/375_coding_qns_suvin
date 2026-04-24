//81) Write a program to demonstrate the use of arrays in Java.

package p375_suvin;

public class p81_array_demo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}

//output
//Array elements:
//Element at index 0: 10
//Element at index 1: 20
//Element at index 2: 30
//Element at index 3: 40
//Element at index 4: 50
