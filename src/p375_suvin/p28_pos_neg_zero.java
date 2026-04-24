//28) Write a program to check whether a given number is positive, negative, or zero.

package p375_suvin;

public class p28_pos_neg_zero {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) System.out.println(num + " is positive");
        else if (num < 0) System.out.println(num + " is negative");
        else System.out.println("Number is zero");
    }
}

//output
//10 is positive
