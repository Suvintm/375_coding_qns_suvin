//247) Create a base class "Vehicle" with properties (make, model, year) and a subclass "Car" with additional properties (color, mileage). Write a program to demonstrate inheritance.

package p375_suvin;

class VehicleV5 {
    String make, model;
    int year;
    void showV() { System.out.println(year + " " + make + " " + model); }
}

class CarV5 extends VehicleV5 {
    String color;
    double mileage;
    void showC() { System.out.println("Color: " + color + ", Mileage: " + mileage); }
}

public class p247_vehicle_car_inheritance {
    public static void main(String[] args) {
        CarV5 c = new CarV5();
        c.make = "Honda";
        c.model = "Civic";
        c.year = 2021;
        c.color = "Black";
        c.mileage = 18.2;
        c.showV();
        c.showC();
    }
}

//output
//2021 Honda Civic
//Color: Black, Mileage: 18.2
