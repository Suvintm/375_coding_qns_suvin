//337) Write a program to serialize and deserialize an object in Java.

package p375_suvin;
import java.io.*;

class Student implements Serializable {
    String name;
    Student(String name) { this.name = name; }
}

public class p337_serialization_demo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Suvin");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("s.txt"));
            out.writeObject(s1);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("s.txt"));
            Student s2 = (Student) in.readObject();
            System.out.println("Deserialized Name: " + s2.name);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//output
//Deserialized Name: Suvin
