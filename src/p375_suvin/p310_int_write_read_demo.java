//310) Write a program to demonstrate interface implementation by creating objects of the text file and database table classes and invoking interface methods.

package p375_suvin;

public class p310_int_write_read_demo {
    public static void main(String[] args) {
        interface Readable { String read(); }
        class DatabaseTable implements Readable { public String read() { return "Database record"; } }
        
        DatabaseTable dt = new DatabaseTable();
        System.out.println("Data: " + dt.read());
    }
}

//output
//Data: Database record
