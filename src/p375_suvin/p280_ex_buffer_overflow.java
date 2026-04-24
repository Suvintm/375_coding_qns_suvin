//280) Write a program to handle BufferOverflowException.

package p375_suvin;
import java.nio.*;

public class p280_ex_buffer_overflow {
    public static void main(String[] args) {
        try {
            ByteBuffer bb = ByteBuffer.allocate(2);
            bb.put((byte)1);
            bb.put((byte)2);
            bb.put((byte)3);
        } catch (BufferOverflowException e) {
            System.out.println("Exception caught: Buffer overflow.");
        }
    }
}

//output
//Exception caught: Buffer overflow.
