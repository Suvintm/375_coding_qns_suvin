//263) Implement a program to handle IOException.

package p375_suvin;
import java.io.*;

public class p263_ex_io {
    public static void main(String[] args) {
        try {
            throw new IOException("IO error occurred");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//output
//Exception caught: IO error occurred
