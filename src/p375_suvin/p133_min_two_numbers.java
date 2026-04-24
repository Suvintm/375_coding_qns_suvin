//133) Write a program to find the minimum of two numbers.

package p375_suvin;

public class p133_min_two_numbers {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Min of 15 and 25: " + min(15, 25));
    }
}

//output
//Min of 15 and 25: 15
