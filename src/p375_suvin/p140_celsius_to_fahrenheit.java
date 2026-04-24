//140) Write a program to convert temperature from Celsius to Fahrenheit.

package p375_suvin;

public class p140_celsius_to_fahrenheit {
    public static double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("37 Celsius in Fahrenheit: " + convert(37));
    }
}

//output
//37 Celsius in Fahrenheit: 98.6
