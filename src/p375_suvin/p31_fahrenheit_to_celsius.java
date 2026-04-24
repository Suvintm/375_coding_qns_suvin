//31) Write a program to convert temperature from Fahrenheit to Celsius.

package p375_suvin;

public class p31_fahrenheit_to_celsius {
    public static void main(String[] args) {
        double f = 98.6;
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " Fahrenheit is " + c + " Celsius");
    }
}

//output
//98.6 Fahrenheit is 37.0 Celsius
