//16) Write a program to check whether a given year is a leap year or not.

package p375_suvin;

public class p16_leap_year {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) isLeap = true;
                else isLeap = false;
            } else isLeap = true;
        } else isLeap = false;

        if (isLeap) System.out.println(year + " is a leap year");
        else System.out.println(year + " is not a leap year");
    }
}

//output
//2024 is a leap year
