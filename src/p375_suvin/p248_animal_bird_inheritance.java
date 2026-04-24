//248) Create a base class "Animal" with properties (name, type) and a subclass "Bird" with additional properties (color, wingspan). Write a program to demonstrate inheritance.

package p375_suvin;

class AnimalV6 {
    String name, type;
    void showA() { System.out.println("Animal: " + name + " (" + type + ")"); }
}

class BirdV6 extends AnimalV6 {
    String color;
    double wingspan;
    void showB() { System.out.println("Bird Color: " + color + ", Wingspan: " + wingspan + "cm"); }
}

public class p248_animal_bird_inheritance {
    public static void main(String[] args) {
        BirdV6 b = new BirdV6();
        b.name = "Eagle";
        b.type = "Aves";
        b.color = "Brown";
        b.wingspan = 200;
        b.showA();
        b.showB();
    }
}

//output
//Animal: Eagle (Aves)
//Bird Color: Brown, Wingspan: 200.0cm
