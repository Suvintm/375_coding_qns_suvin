//214) Write an abstract class "Computer" with abstract methods "powerOn" and "powerOff". Implement it in subclasses "Desktop" and "Laptop".

package p375_suvin;

abstract class ComputerAbs {
    abstract void powerOn();
    abstract void powerOff();
}

class Laptop extends ComputerAbs {
    void powerOn() { System.out.println("Laptop booting up"); }
    void powerOff() { System.out.println("Laptop shutting down"); }
}

public class p214_abs_computer {
    public static void main(String[] args) {
        ComputerAbs l = new Laptop();
        l.powerOn();
        l.powerOff();
    }
}

//output
//Laptop booting up
//Laptop shutting down
