//119) Write a program to check whether a string is a rotation of another string.

package p375_suvin;

public class p119_string_rotation_check {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
    }
}

//output
//CDAB is a rotation of ABCD
