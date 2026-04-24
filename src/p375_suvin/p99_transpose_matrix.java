//99) Write a program to transpose a matrix.

package p375_suvin;

public class p99_transpose_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] trans = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) trans[i][j] = matrix[j][i];
        }
        System.out.println("Transposed matrix:");
        for (int[] row : trans) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}

//output
//Transposed matrix:
//1 3 
//2 4 
