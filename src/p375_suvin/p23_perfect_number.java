//23) Write a program to check if a given number is a perfect number.

package p375_suvin;

public class p23_perfect_number {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        if (sum == num) System.out.println(num + " is a perfect number");
        else System.out.println(num + " is not a perfect number");
    }
}

//output
//6 is a perfect number
