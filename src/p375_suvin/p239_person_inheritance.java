//239) Create a base class "Person" with properties (name, age) and subclasses "Student" and "Teacher" with additional properties (roll number, subject). Write a program to demonstrate inheritance.

package p375_suvin;

class Person {
    String name;
    int age;
    void showP() { System.out.println("Name: " + name + ", Age: " + age); }
}

class Student extends Person {
    int rollNo;
    void showS() { System.out.println("Roll: " + rollNo); }
}

class Teacher extends Person {
    String subject;
    void showT() { System.out.println("Subject: " + subject); }
}

public class p239_person_inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amit";
        s.age = 20;
        s.rollNo = 50;
        s.showP();
        s.showS();

        Teacher t = new Teacher();
        t.name = "Prof. Rao";
        t.age = 45;
        t.subject = "Java";
        t.showP();
        t.showT();
    }
}

//output
//Name: Amit, Age: 20
//Roll: 50
//Name: Prof. Rao, Age: 45
//Subject: Java
