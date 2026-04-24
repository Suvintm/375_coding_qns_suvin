//282) Write a program to handle DateTimeException.

package p375_suvin;
import java.time.*;

public class p282_ex_datetime {
    public static void main(String[] args) {
        try {
            LocalDate.of(2023, 2, 30);
        } catch (DateTimeException e) {
            System.out.println("Exception caught: Invalid date.");
        }
    }
}

//output
//Exception caught: Invalid date.
