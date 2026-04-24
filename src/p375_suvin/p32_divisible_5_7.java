//32) Write a program to check if a given number is divisible by both 5 and 7.

package p375_suvin;

public class p32_divisible_5_7 {
    public static void main(String[] args) {
        int num = 35;
        if (num % 5 == 0 && num % 7 == 0) System.out.println(num + " is divisible by both 5 and 7");
        else System.out.println(num + " is not divisible by both 5 and 7");
    }
}

//output
//35 is divisible by both 5 and 7
