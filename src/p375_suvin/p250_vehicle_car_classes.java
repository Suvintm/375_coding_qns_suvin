//250) Create a base class "Vehicle" with properties (make, model, year) and a subclass "Car" with additional properties (color, mileage).

package p375_suvin;

class VehicleV25 {
    String make, model;
    int year;
}

class CarV25 extends VehicleV25 {
    String color;
    double mileage;
}

public class p250_vehicle_car_classes {
    public static void main(String[] args) {
        System.out.println("Vehicle and Car classes created.");
    }
}

//output
//Vehicle and Car classes created.
