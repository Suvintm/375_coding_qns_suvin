//334) Implement a program to demonstrate ArrayBlockingQueue by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.concurrent.*;

public class p334_coll_arrayblockingqueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(5);
        abq.add(100);
        abq.add(200);
        abq.remove(100);
        System.out.println("ABQ: " + abq);
    }
}

//output
//ABQ: [200]
