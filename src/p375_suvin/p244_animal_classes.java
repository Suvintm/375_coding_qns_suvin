//244) Create a base class "Animal" with properties (name, type) and subclasses "Dog" and "Cat" with additional properties (breed, color).

package p375_suvin;

class AnimalV19 {
    String name, type;
}

class DogV19 extends AnimalV19 {
    String breed;
}

class CatV19 extends AnimalV19 {
    String color;
}

public class p244_animal_classes {
    public static void main(String[] args) {
        System.out.println("Animal, Dog, and Cat classes created.");
    }
}

//output
//Animal, Dog, and Cat classes created.
