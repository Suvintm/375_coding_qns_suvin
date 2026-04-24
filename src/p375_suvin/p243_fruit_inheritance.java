//243) Create a base class "Fruit" with properties (name, color) and subclasses "Apple" and "Banana" with additional properties (taste, size). Write a program to demonstrate inheritance.

package p375_suvin;

class Fruit {
    String name, color;
    void showF() { System.out.println("Fruit: " + name + ", Color: " + color); }
}

class Apple extends Fruit {
    String taste;
    void showA() { System.out.println("Taste: " + taste); }
}

public class p243_fruit_inheritance {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.name = "Apple";
        a.color = "Red";
        a.taste = "Sweet";
        a.showF();
        a.showA();
    }
}

//output
//Fruit: Apple, Color: Red
//Taste: Sweet
