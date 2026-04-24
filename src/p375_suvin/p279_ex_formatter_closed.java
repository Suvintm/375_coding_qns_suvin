//279) Implement a program to handle FormatterClosedException.

package p375_suvin;
import java.util.*;

public class p279_ex_formatter_closed {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter();
            f.close();
            f.format("test");
        } catch (FormatterClosedException e) {
            System.out.println("Exception caught: Formatter is closed.");
        }
    }
}

//output
//Exception caught: Formatter is closed.
