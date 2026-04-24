//63) Write a program to find the product of all elements in an array.

package p375_suvin;

public class p63_product_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        long prod = 1;
        for (int x : arr) prod *= x;
        System.out.println("Product of array elements: " + prod);
    }
}

//output
//Product of array elements: 120
