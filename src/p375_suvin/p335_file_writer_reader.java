//335) Write a program to demonstrate FileWriter and FileReader by writing and reading data from a file.

package p375_suvin;
import java.io.*;

public class p335_file_writer_reader {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello File!");
            fw.close();

            FileReader fr = new FileReader("test.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//output
//Hello File!
