//344) Implement a program to demonstrate Date and Time API (LocalDate, LocalTime, LocalDateTime).

package p375_suvin;
import java.time.*;

public class p344_date_time_api {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 10, 27);
        LocalTime time = LocalTime.of(10, 30);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}

//output
//Date: 2023-10-27
//Time: 10:30
