//224) Write an abstract class "Fruit" with abstract methods "taste". Implement it in subclasses "Apple" and "Mango".

package p375_suvin;

abstract class Fruit {
    abstract void taste();
}

class Apple extends Fruit {
    void taste() { System.out.println("Apple is sweet and crunchy"); }
}

public class p224_abs_fruit {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.taste();
    }
}

//output
//Apple is sweet and crunchy
