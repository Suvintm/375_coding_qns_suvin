//67) Write a program to print the elements of a 2D array in spiral order.

package p375_suvin;

public class p67_spiral_order_2d {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int top = 0, bottom = 3, left = 0, right = 3;
        System.out.print("Spiral order: ");
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
        System.out.println();
    }
}

//output
//Spiral order: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
