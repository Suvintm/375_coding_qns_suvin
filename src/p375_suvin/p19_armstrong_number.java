//19) Write a program to check if a number is Armstrong or not.

package p375_suvin;

public class p19_armstrong_number {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) System.out.println(num + " is an Armstrong number");
        else System.out.println(num + " is not an Armstrong number");
    }
}

//output
//153 is an Armstrong number
