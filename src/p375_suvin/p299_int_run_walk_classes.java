//299) Create interfaces "Runnable" and "Walkable" with methods "run()" and "walk()". Implement them in classes representing a cheetah and a tortoise.

package p375_suvin;

interface RunnableInt { void runFast(); }
interface WalkableInt { void walkSlow(); }

class Cheetah implements RunnableInt {
    public void runFast() { System.out.println("Cheetah runs at 100km/h"); }
}

public class p299_int_run_walk_classes {
    public static void main(String[] args) {
        System.out.println("Movement interfaces implemented.");
    }
}

//output
//Movement interfaces implemented.
