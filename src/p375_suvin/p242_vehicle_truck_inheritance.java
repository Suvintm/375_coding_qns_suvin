//242) Create a base class "Vehicle" with properties (make, model, year) and a subclass "Truck" with additional properties (capacity, mileage). Write a program to demonstrate inheritance.

package p375_suvin;

class VehicleV4 {
    String make, model;
    int year;
    void showV() { System.out.println(year + " " + make + " " + model); }
}

class Truck extends VehicleV4 {
    double capacity, mileage;
    void showT() { System.out.println("Capacity: " + capacity + " tons, Mileage: " + mileage); }
}

public class p242_vehicle_truck_inheritance {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.make = "Tata";
        t.model = "Prima";
        t.year = 2023;
        t.capacity = 25;
        t.mileage = 4.5;
        t.showV();
        t.showT();
    }
}

//output
//2023 Tata Prima
//Capacity: 25.0 tons, Mileage: 4.5
