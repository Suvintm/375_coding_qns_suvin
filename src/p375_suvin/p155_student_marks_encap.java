//155) Create a class representing a student with private member variables (name, roll number, marks) and public methods (getters and setters).

package p375_suvin;

class StudentM {
    private String name;
    private int roll;
    private double marks;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setRoll(int r) { roll = r; }
    public int getRoll() { return roll; }
    public void setMarks(double m) { marks = m; }
    public double getMarks() { return marks; }
}

public class p155_student_marks_encap {
    public static void main(String[] args) {
        StudentM s = new StudentM();
        s.setName("John");
        s.setRoll(202);
        s.setMarks(95.5);
        System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll() + ", Marks: " + s.getMarks());
    }
}

//output
//Name: John, Roll: 202, Marks: 95.5
