//312) Write a program to demonstrate interface implementation by creating objects of the canvas and printer classes and invoking interface methods.

package p375_suvin;

public class p312_int_draw_print_demo {
    public static void main(String[] args) {
        interface Printable { void print(); }
        class LaserPrinter implements Printable { public void print() { System.out.println("Laser printing..."); } }
        
        LaserPrinter lp = new LaserPrinter();
        lp.print();
    }
}

//output
//Laser printing...
