//251) Write a program to demonstrate inheritance by creating objects of both classes and accessing properties. (Vehicle/Car)

package p375_suvin;

public class p251_vehicle_car_demo {
    public static void main(String[] args) {
        class Vehicle { String model = "Civic"; }
        class Car extends Vehicle { String color = "Red"; }
        
        Car c = new Car();
        System.out.println("Model: " + c.model + ", Color: " + c.color);
    }
}

//output
//Model: Civic, Color: Red
