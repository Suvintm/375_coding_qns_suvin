//292) Write a program to demonstrate interface implementation by creating objects of the printer and scanner classes and invoking interface methods.

package p375_suvin;

public class p292_int_print_scan_demo {
    public static void main(String[] args) {
        interface Printable { void print(); }
        class Printer implements Printable { public void print() { System.out.println("Printing..."); } }
        
        Printer p = new Printer();
        p.print();
    }
}

//output
//Printing...
