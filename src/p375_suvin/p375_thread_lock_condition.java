//375) Implement a program to demonstrate thread communication using Lock and Condition.

package p375_suvin;
import java.util.concurrent.locks.*;

public class p375_thread_lock_condition {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        
        new Thread(() -> {
            lock.lock();
            try { System.out.println("T1 Waiting..."); cond.await(); System.out.println("T1 Notified!"); } 
            catch(Exception e){} finally { lock.unlock(); }
        }).start();

        new Thread(() -> {
            try { Thread.sleep(100); } catch(Exception e){}
            lock.lock();
            try { System.out.println("T2 Signaling..."); cond.signal(); } 
            finally { lock.unlock(); }
        }).start();
    }
}

//output
//T1 Waiting...
//T2 Signaling...
//T1 Notified!
