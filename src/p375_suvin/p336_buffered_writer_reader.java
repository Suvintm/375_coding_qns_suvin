//336) Implement a program to demonstrate BufferedReader and BufferedWriter for efficient file handling.

package p375_suvin;
import java.io.*;

public class p336_buffered_writer_reader {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("test_buf.txt"));
            bw.write("Buffered Content");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("test_buf.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//output
//Buffered Content
