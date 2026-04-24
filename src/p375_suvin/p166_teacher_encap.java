//166) Create a class representing a teacher with private member variables (name, subject, experience) and public methods (getters and setters).

package p375_suvin;

class Teacher {
    private String name;
    private String subject;
    private int experience;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setSubject(String s) { subject = s; }
    public String getSubject() { return subject; }
    public void setExperience(int e) { experience = e; }
    public int getExperience() { return experience; }
}

public class p166_teacher_encap {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("Mr. Sharma");
        t.setSubject("Java");
        t.setExperience(10);
        System.out.println("Teacher: " + t.getName() + ", Subject: " + t.getSubject() + ", Exp: " + t.getExperience() + " years");
    }
}

//output
//Teacher: Mr. Sharma, Subject: Java, Exp: 10 years
