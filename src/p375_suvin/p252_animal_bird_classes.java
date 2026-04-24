//252) Create a base class "Animal" with properties (name, type) and a subclass "Bird" with additional properties (color, wingspan).

package p375_suvin;

class AnimalV27 {
    String name, type;
}

class BirdV27 extends AnimalV27 {
    String color;
    double wingspan;
}

public class p252_animal_bird_classes {
    public static void main(String[] args) {
        System.out.println("Animal and Bird classes created.");
    }
}

//output
//Animal and Bird classes created.
