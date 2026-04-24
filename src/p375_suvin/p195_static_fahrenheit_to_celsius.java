//195) Write a program to convert temperature from Fahrenheit to Celsius using a static method.

package p375_suvin;

public class p195_static_fahrenheit_to_celsius {
    static double convert(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        System.out.println("86 Fahrenheit in Celsius: " + convert(86));
    }
}

//output
//86 Fahrenheit in Celsius: 30.0
