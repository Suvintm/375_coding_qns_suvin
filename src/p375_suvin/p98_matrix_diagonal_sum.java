//98) Write a program to find the sum of diagonal elements of a matrix.

package p375_suvin;

public class p98_matrix_diagonal_sum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; i++) sum += matrix[i][i];
        System.out.println("Sum of diagonal: " + sum);
    }
}

//output
//Sum of diagonal: 15
