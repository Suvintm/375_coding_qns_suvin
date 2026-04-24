//329) Write a program to demonstrate Properties by adding and retrieving key-value pairs.

package p375_suvin;
import java.util.*;

public class p329_coll_properties {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("user", "suvin");
        p.setProperty("pass", "1234");
        System.out.println("User: " + p.getProperty("user"));
    }
}

//output
//User: suvin
