//59) Write a program to find the intersection of two arrays.

package p375_suvin;

public class p59_intersection_arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        System.out.print("Intersection: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}

//output
//Intersection: 3 4 5 
