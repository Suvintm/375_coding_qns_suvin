//309) Create interfaces "Writable" and "Readable" with methods "write()" and "read()". Implement them in classes representing a text file and a database table.

package p375_suvin;

interface Writable { void write(String data); }
interface Readable { String read(); }

class TextFileInt implements Writable, Readable {
    public void write(String data) { System.out.println("Writing to text file: " + data); }
    public String read() { return "Text file content"; }
}

public class p309_int_write_read_classes {
    public static void main(String[] args) {
        System.out.println("File I/O interfaces implemented.");
    }
}

//output
//File I/O interfaces implemented.
