//205) Write an abstract class "Vehicle" with abstract methods "start" and "stop". Implement it in subclasses "Car" and "Motorcycle".

package p375_suvin;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class CarV extends Vehicle {
    void start() { System.out.println("Car starts with key"); }
    void stop() { System.out.println("Car stops with brakes"); }
}

class MotorcycleV extends Vehicle {
    void start() { System.out.println("Motorcycle starts with kick"); }
    void stop() { System.out.println("Motorcycle stops with brakes"); }
}

public class p205_abs_vehicle {
    public static void main(String[] args) {
        Vehicle c = new CarV();
        Vehicle m = new MotorcycleV();
        c.start();
        m.start();
    }
}

//output
//Car starts with key
//Motorcycle starts with kick
