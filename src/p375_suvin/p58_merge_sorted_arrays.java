//58) Write a program to merge two sorted arrays.

package p375_suvin;

public class p58_merge_sorted_arrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        
        System.out.print("Merged array: ");
        for (int x : c) System.out.print(x + " ");
        System.out.println();
    }
}

//output
//Merged array: 1 2 3 4 5 6 7 8 
