//73) Write a program to find the trace of a matrix.

package p375_suvin;

public class p73_matrix_trace {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int trace = 0;
        for (int i = 0; i < 3; i++) trace += matrix[i][i];
        System.out.println("Trace of matrix: " + trace);
    }
}

//output
//Trace of matrix: 15
