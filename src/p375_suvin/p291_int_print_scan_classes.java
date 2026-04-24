//291) Create interfaces "Printable" and "Scannable" with methods "print()" and "scan()". Implement them in classes representing a printer and a scanner.

package p375_suvin;

interface Printable { void print(); }
interface Scannable { void scan(); }

class OfficeDevice implements Printable, Scannable {
    public void print() { System.out.println("Printing document..."); }
    public void scan() { System.out.println("Scanning document..."); }
}

public class p291_int_print_scan_classes {
    public static void main(String[] args) {
        System.out.println("Printable and Scannable interfaces implemented.");
    }
}

//output
//Printable and Scannable interfaces implemented.
