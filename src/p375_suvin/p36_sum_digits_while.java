//36) Write a program to find the sum of digits of a number using while loop.

package p375_suvin;

public class p36_sum_digits_while {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}

//output
//Sum of digits of 123 is: 6
