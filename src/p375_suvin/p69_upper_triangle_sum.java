//69) Write a program to find the sum of elements in the upper triangle of a matrix.

package p375_suvin;

public class p69_upper_triangle_sum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of upper triangle: " + sum);
    }
}

//output
//Sum of upper triangle: 26
