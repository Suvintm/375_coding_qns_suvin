//131) Write a program to find the average of three numbers.

package p375_suvin;

public class p131_average_three_numbers {
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("Average of 10, 20, 30: " + average(10, 20, 30));
    }
}

//output
//Average of 10, 20, 30: 20.0
