//71) Write a program to find the sum of elements in each row and column of a matrix.

package p375_suvin;

public class p71_row_column_sum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        for (int i = 0; i < 2; i++) {
            int rowSum = 0;
            for (int j = 0; j < 2; j++) rowSum += matrix[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
        for (int i = 0; i < 2; i++) {
            int colSum = 0;
            for (int j = 0; j < 2; j++) colSum += matrix[j][i];
            System.out.println("Sum of column " + (i + 1) + ": " + colSum);
        }
    }
}

//output
//Sum of row 1: 3
//Sum of row 2: 7
//Sum of column 1: 4
//Sum of column 2: 6
