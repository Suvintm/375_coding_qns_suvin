//326) Implement a program to demonstrate EnumSet by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

enum Days { MON, TUE, WED, THU, FRI }

public class p326_coll_enumset {
    public static void main(String[] args) {
        EnumSet<Days> set = EnumSet.of(Days.MON, Days.TUE);
        set.add(Days.WED);
        set.remove(Days.MON);
        System.out.println("EnumSet: " + set);
    }
}

//output
//EnumSet: [TUE, WED]
