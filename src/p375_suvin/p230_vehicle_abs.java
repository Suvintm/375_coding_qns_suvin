//230) Write an abstract class "Vehicle" with abstract methods "start" and "stop". Implement it in subclasses "Car" and "Motorcycle".

package p375_suvin;

abstract class VehicleV3 {
    abstract void start();
    abstract void stop();
}

class CarV3 extends VehicleV3 {
    void start() { System.out.println("Car started"); }
    void stop() { System.out.println("Car stopped"); }
}

public class p230_vehicle_abs {
    public static void main(String[] args) {
        VehicleV3 v = new CarV3();
        v.start();
        v.stop();
    }
}

//output
//Car started
//Car stopped
