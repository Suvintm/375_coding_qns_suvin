//70) Write a program to find the sum of elements in the lower triangle of a matrix.

package p375_suvin;

public class p70_lower_triangle_sum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of lower triangle: " + sum);
    }
}

//output
//Sum of lower triangle: 34
