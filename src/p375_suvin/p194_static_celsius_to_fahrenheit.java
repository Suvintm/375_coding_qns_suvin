//194) Write a program to convert temperature from Celsius to Fahrenheit using a static method.

package p375_suvin;

public class p194_static_celsius_to_fahrenheit {
    static double convert(double c) {
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("30 Celsius in Fahrenheit: " + convert(30));
    }
}

//output
//30 Celsius in Fahrenheit: 86.0
