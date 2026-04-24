//245) Create a base class "Person" with properties (name, age) and a subclass "Employee" with additional properties (id, salary). Write a program to demonstrate inheritance.

package p375_suvin;

class PersonV2 {
    String name;
    int age;
    void showP() { System.out.println("Person: " + name + ", Age: " + age); }
}

class EmployeeV2 extends PersonV2 {
    int id;
    double salary;
    void showE() { System.out.println("ID: " + id + ", Salary: " + salary); }
}

public class p245_person_emp_inheritance {
    public static void main(String[] args) {
        EmployeeV2 e = new EmployeeV2();
        e.name = "Suresh";
        e.age = 30;
        e.id = 1001;
        e.salary = 50000;
        e.showP();
        e.showE();
    }
}

//output
//Person: Suresh, Age: 30
//ID: 1001, Salary: 50000.0
