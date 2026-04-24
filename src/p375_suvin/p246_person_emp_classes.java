//246) Create a base class "Person" with properties (name, age) and a subclass "Employee" with additional properties (id, salary).

package p375_suvin;

class PersonV21 {
    String name;
    int age;
}

class EmployeeV21 extends PersonV21 {
    int id;
    double salary;
}

public class p246_person_emp_classes {
    public static void main(String[] args) {
        System.out.println("Person and Employee classes created.");
    }
}

//output
//Person and Employee classes created.
