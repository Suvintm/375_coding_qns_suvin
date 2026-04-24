//15) Write a program to calculate the sum of digits of a given number.

package p375_suvin;

public class p15_sum_digits {
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
