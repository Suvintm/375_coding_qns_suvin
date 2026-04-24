//237) Write a program to demonstrate inheritance by creating objects of derived classes and accessing properties. (Animal continuation)

package p375_suvin;

class AnimalV2 {
    String name;
    void eat() { System.out.println(name + " is eating"); }
}

class DogV2 extends AnimalV2 {
    void bark() { System.out.println("Dog is barking"); }
}

class CatV2 extends AnimalV2 {
    void meow() { System.out.println("Cat is meowing"); }
}

public class p237_animal_demo_v2 {
    public static void main(String[] args) {
        DogV2 d = new DogV2();
        d.name = "Rocky";
        d.eat();
        d.bark();

        CatV2 c = new CatV2();
        c.name = "Lucy";
        c.eat();
        c.meow();
    }
}

//output
//Rocky is eating
//Dog is barking
//Lucy is eating
//Cat is meowing
