//86) Write a program to demonstrate the use of wrapper classes in Java.

package p375_suvin;

public class p86_wrapper_classes_demo {
    public static void main(String[] args) {
        int i = 10;
        Integer iObj = Integer.valueOf(i); // Autoboxing
        int iBack = iObj.intValue(); // Unboxing
        
        System.out.println("Primitive int: " + i);
        System.out.println("Integer object: " + iObj);
        System.out.println("Value back: " + iBack);
    }
}

//output
//Primitive int: 10
//Integer object: 10
//Value back: 10
