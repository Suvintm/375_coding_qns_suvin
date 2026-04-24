//245) Write a program to demonstrate inheritance by creating objects of both classes and accessing properties. (Animal/Dog/Cat)

package p375_suvin;

public class p245_animal_inheritance_demo {
    public static void main(String[] args) {
        // Using local classes to keep it self-contained
        class Animal { String name = "Max"; }
        class Dog extends Animal { String breed = "Labrador"; }
        
        Dog d = new Dog();
        System.out.println("Name: " + d.name + ", Breed: " + d.breed);
    }
}

//output
//Name: Max, Breed: Labrador
