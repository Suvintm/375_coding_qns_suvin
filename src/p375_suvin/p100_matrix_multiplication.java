//100) Write a program to multiply two matrices.

package p375_suvin;

public class p100_matrix_multiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Product of matrices:");
        for (int[] row : c) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}

//output
//Product of matrices:
//19 22 
//43 50 
