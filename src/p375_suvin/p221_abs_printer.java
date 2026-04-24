//221) Write an abstract class "Printer" with abstract methods "print". Implement it in subclasses "LaserPrinter" and "InkjetPrinter".

package p375_suvin;

abstract class Printer {
    abstract void print();
}

class LaserPrinter extends Printer {
    void print() { System.out.println("Laser Printer printing high quality..."); }
}

public class p221_abs_printer {
    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print();
    }
}

//output
//Laser Printer printing high quality...
