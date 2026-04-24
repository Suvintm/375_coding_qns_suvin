//209) Write an abstract class "Vehicle" with abstract methods "drive" and "stop". Implement it in subclasses "Car" and "Truck".

package p375_suvin;

abstract class VehicleV2 {
    abstract void drive();
    abstract void stop();
}

class CarV2 extends VehicleV2 {
    void drive() { System.out.println("Car is driving on road"); }
    void stop() { System.out.println("Car stopped at signal"); }
}

class TruckV2 extends VehicleV2 {
    void drive() { System.out.println("Truck is carrying load"); }
    void stop() { System.out.println("Truck stopped at warehouse"); }
}

public class p209_abs_vehicle_v2 {
    public static void main(String[] args) {
        VehicleV2 t = new TruckV2();
        t.drive();
        t.stop();
    }
}

//output
//Truck is carrying load
//Truck stopped at warehouse
