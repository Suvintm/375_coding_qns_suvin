//341) Write a program to demonstrate Stream API for filtering and sorting data.

package p375_suvin;
import java.util.*;
import java.util.stream.*;

public class p341_stream_api {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> result = list.stream()
            .filter(n -> n > 3)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Filtered and Sorted: " + result);
    }
}

//output
//Filtered and Sorted: [5, 8, 9]
