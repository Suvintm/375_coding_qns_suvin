//236) Create a base class "Animal" with properties (name, age) and subclasses "Dog" and "Cat" with additional properties (breed, color).

package p375_suvin;

class AnimalI {
    String name;
    int age;
    void showBase() { System.out.println("Name: " + name + ", Age: " + age); }
}

class DogI extends AnimalI {
    String breed;
    void showSub() { System.out.println("Breed: " + breed); }
}

public class p236_animal_inheritance {
    public static void main(String[] args) {
        DogI d = new DogI();
        d.name = "Buddy";
        d.age = 3;
        d.breed = "Golden Retriever";
        d.showBase();
        d.showSub();
    }
}

//output
//Name: Buddy, Age: 3
//Breed: Golden Retriever
