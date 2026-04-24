//256) Create a base class "Employee" with properties (name, id, salary) and a subclass "Manager" with additional properties (department, designation).

package p375_suvin;

class EmployeeV31 {
    String name;
    int id;
    double salary;
}

class ManagerV31 extends EmployeeV31 {
    String department, designation;
}

public class p256_employee_manager_classes {
    public static void main(String[] args) {
        System.out.println("Employee and Manager classes created.");
    }
}

//output
//Employee and Manager classes created.
