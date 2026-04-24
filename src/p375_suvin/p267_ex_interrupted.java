//267) Implement a program to handle InterruptedException.

package p375_suvin;

public class p267_ex_interrupted {
    public static void main(String[] args) {
        try {
            Thread.sleep(100);
            throw new InterruptedException("Thread interrupted");
        } catch (InterruptedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//output
//Exception caught: Thread interrupted
