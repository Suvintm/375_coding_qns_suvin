//371) Implement a program to demonstrate thread communication using Exchanger.

package p375_suvin;
import java.util.concurrent.*;

public class p371_thread_exchanger {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new Thread(() -> {
            try { String resp = ex.exchange("T1 Message"); System.out.println("T1 Got: " + resp); } catch(Exception e){}
        }).start();
        new Thread(() -> {
            try { String resp = ex.exchange("T2 Message"); System.out.println("T2 Got: " + resp); } catch(Exception e){}
        }).start();
    }
}

//output
//T2 Got: T1 Message
//T1 Got: T2 Message
