//44) Write a program to check whether a given year is leap year or not using conditional operator.

package p375_suvin;

public class p44_leap_year_conditional {
    public static void main(String[] args) {
        int year = 2024;
        String result = (year % 4 == 0) ? 
                        ((year % 100 == 0) ? 
                        ((year % 400 == 0) ? "Leap Year" : "Not a Leap Year") : "Leap Year") : "Not a Leap Year";
        System.out.println(year + " is " + result);
    }
}

//output
//2024 is Leap Year
