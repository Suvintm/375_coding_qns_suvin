//281) Implement a program to handle BufferUnderflowException.

package p375_suvin;
import java.nio.*;

public class p281_ex_buffer_underflow {
    public static void main(String[] args) {
        try {
            ByteBuffer bb = ByteBuffer.allocate(2);
            bb.get();
        } catch (BufferUnderflowException e) {
            System.out.println("Exception caught: Buffer underflow.");
        }
    }
}

//output
//Exception caught: Buffer underflow.
