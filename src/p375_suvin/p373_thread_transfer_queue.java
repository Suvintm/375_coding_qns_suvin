//373) Implement a program to demonstrate thread communication using TransferQueue.

package p375_suvin;
import java.util.concurrent.*;

public class p373_thread_transfer_queue {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        new Thread(() -> { try { System.out.println("Transferred: " + tq.take()); } catch(Exception e){} }).start();
        tq.transfer("Urgent Data");
    }
}

//output
//Transferred: Urgent Data
