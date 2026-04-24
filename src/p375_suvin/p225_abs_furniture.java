//225) Write an abstract class "Furniture" with abstract methods "use". Implement it in subclasses "Chair" and "Table".

package p375_suvin;

abstract class Furniture {
    abstract void use();
}

class Chair extends Furniture {
    void use() { System.out.println("Sitting on the chair"); }
}

public class p225_abs_furniture {
    public static void main(String[] args) {
        Furniture c = new Chair();
        c.use();
    }
}

//output
//Sitting on the chair
