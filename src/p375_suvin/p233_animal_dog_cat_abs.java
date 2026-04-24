//233) Write an abstract class "Animal" with abstract methods "eat" and "sleep". Implement it in subclasses "Dog" and "Cat".

package p375_suvin;

abstract class AnimalV4 {
    abstract void eat();
    abstract void sleep();
}

class CatV4 extends AnimalV4 {
    void eat() { System.out.println("Cat is eating milk"); }
    void sleep() { System.out.println("Cat is sleeping on rug"); }
}

public class p233_animal_dog_cat_abs {
    public static void main(String[] args) {
        AnimalV4 a = new CatV4();
        a.eat();
        a.sleep();
    }
}

//output
//Cat is eating milk
//Cat is sleeping on rug
