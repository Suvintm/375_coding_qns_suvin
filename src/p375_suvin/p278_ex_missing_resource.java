//278) Write a program to handle MissingResourceException.

package p375_suvin;
import java.util.*;

public class p278_ex_missing_resource {
    public static void main(String[] args) {
        try {
            ResourceBundle.getBundle("MissingBundle");
        } catch (MissingResourceException e) {
            System.out.println("Exception caught: Resource bundle not found.");
        }
    }
}

//output
//Exception caught: Resource bundle not found.
