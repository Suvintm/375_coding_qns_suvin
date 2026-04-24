//18) Write a program to print the Pascal's triangle.

package p375_suvin;

public class p18_pascals_triangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

//output
//1 
//1 1 
//1 2 1 
//1 3 3 1 
//1 4 6 4 1 
