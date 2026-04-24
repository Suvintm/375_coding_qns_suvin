//35) Write a program to find the maximum of three numbers using conditional operator.

package p375_suvin;

public class p35_max_three_numbers {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Max of " + a + ", " + b + ", " + c + " is: " + max);
    }
}

//output
//Max of 10, 20, 15 is: 20
