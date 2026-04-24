//234) Create a base class "Vehicle" with properties (make, model, year) and a subclass "Car" with additional properties (color, mileage). Write a program to demonstrate inheritance.

package p375_suvin;

class Vehicle {
    String make, model;
    int year;
    void displayBase() { System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year); }
}

class CarI extends Vehicle {
    String color;
    double mileage;
    void displaySub() { System.out.println("Color: " + color + ", Mileage: " + mileage); }
}

public class p234_vehicle_inheritance {
    public static void main(String[] args) {
        CarI c = new CarI();
        c.make = "Toyota";
        c.model = "Camry";
        c.year = 2022;
        c.color = "Silver";
        c.mileage = 15.5;
        c.displayBase();
        c.displaySub();
    }
}

//output
//Make: Toyota, Model: Camry, Year: 2022
//Color: Silver, Mileage: 15.5
