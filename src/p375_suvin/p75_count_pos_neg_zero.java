//75) Write a program to count the number of negative, positive, and zero elements in an array.

package p375_suvin;

public class p75_count_pos_neg_zero {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, -3, 0, 5};
        int pos = 0, neg = 0, zero = 0;
        for (int x : arr) {
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }
        System.out.println("Positive: " + pos + ", Negative: " + neg + ", Zeros: " + zero);
    }
}

//output
//Positive: 2, Negative: 2, Zeros: 2
