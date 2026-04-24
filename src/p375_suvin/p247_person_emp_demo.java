//247) Write a program to demonstrate inheritance by creating objects of both classes and accessing properties. (Person/Employee)

package p375_suvin;

public class p247_person_emp_demo {
    public static void main(String[] args) {
        class Person { String name = "John"; int age = 30; }
        class Employee extends Person { int id = 101; }
        
        Employee e = new Employee();
        System.out.println("Name: " + e.name + ", ID: " + e.id);
    }
}

//output
//Name: John, ID: 101
