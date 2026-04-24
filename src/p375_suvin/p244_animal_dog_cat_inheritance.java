//244) Create a base class "Animal" with properties (name, type) and subclasses "Dog" and "Cat" with additional properties (breed, color). Write a program to demonstrate inheritance.

package p375_suvin;

class AnimalV5 {
    String name, type;
    void showA() { System.out.println("Animal: " + name + " (" + type + ")"); }
}

class DogV5 extends AnimalV5 {
    String breed;
    void showD() { System.out.println("Breed: " + breed); }
}

class CatV5 extends AnimalV5 {
    String color;
    void showC() { System.out.println("Color: " + color); }
}

public class p244_animal_dog_cat_inheritance {
    public static void main(String[] args) {
        DogV5 d = new DogV5();
        d.name = "Max";
        d.type = "Mammal";
        d.breed = "German Shepherd";
        d.showA();
        d.showD();

        CatV5 c = new CatV5();
        c.name = "Luna";
        c.type = "Mammal";
        c.color = "White";
        c.showA();
        c.showC();
    }
}

//output
//Animal: Max (Mammal)
//Breed: German Shepherd
//Animal: Luna (Mammal)
//Color: White
