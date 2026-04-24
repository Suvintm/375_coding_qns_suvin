//141) Write a program to convert temperature from Fahrenheit to Celsius.

package p375_suvin;

public class p141_fahrenheit_to_celsius {
    public static double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        System.out.println("98.6 Fahrenheit in Celsius: " + convert(98.6));
    }
}

//output
//98.6 Fahrenheit in Celsius: 37.0
