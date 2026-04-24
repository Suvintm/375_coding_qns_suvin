//369) Implement a program to demonstrate thread communication using CyclicBarrier.

package p375_suvin;
import java.util.concurrent.*;

public class p369_thread_cyclic_barrier {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2, () -> System.out.println("Barrier Reached"));
        new Thread(() -> { try { System.out.println("T1 at barrier"); cb.await(); } catch(Exception e){} }).start();
        new Thread(() -> { try { System.out.println("T2 at barrier"); cb.await(); } catch(Exception e){} }).start();
    }
}

//output
//T1 at barrier
//T2 at barrier
//Barrier Reached
