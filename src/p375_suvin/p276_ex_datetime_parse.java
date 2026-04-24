//276) Write a program to handle DateTimeParseException.

package p375_suvin;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class p276_ex_datetime_parse {
    public static void main(String[] args) {
        try {
            LocalDate.parse("invalid-date");
        } catch (DateTimeParseException e) {
            System.out.println("Exception caught: Date parsing failed.");
        }
    }
}

//output
//Exception caught: Date parsing failed.
