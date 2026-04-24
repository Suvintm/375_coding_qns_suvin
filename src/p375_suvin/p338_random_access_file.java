//338) Implement a program to demonstrate usage of RandomAccessFile.

package p375_suvin;
import java.io.*;

public class p338_random_access_file {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
            raf.writeUTF("Hello World");
            raf.seek(0);
            System.out.println(raf.readUTF());
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//output
//Hello World
