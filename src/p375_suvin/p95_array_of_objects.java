//95) Write a program to demonstrate the use of arrays of objects.

package p375_suvin;

class Student {
    String name;
    Student(String n) { name = n; }
}

public class p95_array_of_objects {
    public static void main(String[] args) {
        Student[] students = { new Student("Suvin"), new Student("John") };
        for (Student s : students) {
            System.out.println("Student Name: " + s.name);
        }
    }
}

//output
//Student Name: Suvin
//Student Name: John
