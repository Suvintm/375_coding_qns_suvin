//132) Write a program to find the maximum of two numbers.

package p375_suvin;

public class p132_max_two_numbers {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max of 15 and 25: " + max(15, 25));
    }
}

//output
//Max of 15 and 25: 25
