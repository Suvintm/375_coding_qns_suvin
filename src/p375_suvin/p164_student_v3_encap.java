//164) Create a class representing a student with private member variables (name, roll number, marks) and public methods (getters and setters).

package p375_suvin;

class StudentV3 {
    private String name;
    private int roll;
    private int marks;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setRoll(int r) { roll = r; }
    public int getRoll() { return roll; }
    public void setMarks(int m) { marks = m; }
    public int getMarks() { return marks; }
}

public class p164_student_v3_encap {
    public static void main(String[] args) {
        StudentV3 s = new StudentV3();
        s.setName("Alice");
        s.setRoll(303);
        s.setMarks(88);
        System.out.println("Student: " + s.getName() + " (Roll " + s.getRoll() + "), Marks: " + s.getMarks());
    }
}

//output
//Student: Alice (Roll 303), Marks: 88
