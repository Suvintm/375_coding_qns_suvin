//261) Implement a program to handle FileNotFoundException.

package p375_suvin;
import java.io.*;

public class p261_ex_file_not_found {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: File not found.");
        }
    }
}

//output
//Exception caught: File not found.
