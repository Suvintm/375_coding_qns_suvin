//72) Write a program to check whether a given matrix is symmetric or not.

package p375_suvin;

public class p72_symmetric_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {2, 1}};
        boolean isSymmetric = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric) System.out.println("Matrix is symmetric");
        else System.out.println("Matrix is not symmetric");
    }
}

//output
//Matrix is symmetric
